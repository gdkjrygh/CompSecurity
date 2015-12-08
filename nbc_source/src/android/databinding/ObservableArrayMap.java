// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.support.v4.util.ArrayMap;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package android.databinding:
//            ObservableMap, MapChangeRegistry

public class ObservableArrayMap extends ArrayMap
    implements ObservableMap
{

    private transient MapChangeRegistry mListeners;

    public ObservableArrayMap()
    {
    }

    private void notifyChange(Object obj)
    {
        if (mListeners != null)
        {
            mListeners.notifyCallbacks(this, 0, obj);
        }
    }

    public void addOnMapChangedCallback(ObservableMap.OnMapChangedCallback onmapchangedcallback)
    {
        if (mListeners == null)
        {
            mListeners = new MapChangeRegistry();
        }
        mListeners.add(onmapchangedcallback);
    }

    public void clear()
    {
        if (!isEmpty())
        {
            super.clear();
            notifyChange(null);
        }
    }

    public Object put(Object obj, Object obj1)
    {
        super.put(obj, obj1);
        notifyChange(obj);
        return obj1;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag = false;
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            int i = indexOfKey(collection.next());
            if (i >= 0)
            {
                flag = true;
                removeAt(i);
            }
        } while (true);
        return flag;
    }

    public Object removeAt(int i)
    {
        Object obj = keyAt(i);
        Object obj1 = super.removeAt(i);
        if (obj1 != null)
        {
            notifyChange(obj);
        }
        return obj1;
    }

    public void removeOnMapChangedCallback(ObservableMap.OnMapChangedCallback onmapchangedcallback)
    {
        if (mListeners != null)
        {
            mListeners.remove(onmapchangedcallback);
        }
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag = false;
        for (int i = size() - 1; i >= 0; i--)
        {
            if (!collection.contains(keyAt(i)))
            {
                removeAt(i);
                flag = true;
            }
        }

        return flag;
    }

    public Object setValueAt(int i, Object obj)
    {
        Object obj1 = keyAt(i);
        obj = super.setValueAt(i, obj);
        notifyChange(obj1);
        return obj;
    }
}
