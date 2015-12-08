// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package android.databinding:
//            ObservableList, ListChangeRegistry

public class ObservableArrayList extends ArrayList
    implements ObservableList
{

    private transient ListChangeRegistry mListeners;

    public ObservableArrayList()
    {
        mListeners = new ListChangeRegistry();
    }

    private void notifyAdd(int i, int j)
    {
        if (mListeners != null)
        {
            mListeners.notifyInserted(this, i, j);
        }
    }

    private void notifyRemove(int i, int j)
    {
        if (mListeners != null)
        {
            mListeners.notifyRemoved(this, i, j);
        }
    }

    public void add(int i, Object obj)
    {
        super.add(i, obj);
        notifyAdd(i, 1);
    }

    public boolean add(Object obj)
    {
        super.add(obj);
        notifyAdd(size() - 1, 1);
        return true;
    }

    public boolean addAll(int i, Collection collection)
    {
        boolean flag = super.addAll(i, collection);
        if (flag)
        {
            notifyAdd(i, collection.size());
        }
        return flag;
    }

    public boolean addAll(Collection collection)
    {
        int i = size();
        boolean flag = super.addAll(collection);
        if (flag)
        {
            notifyAdd(i, size() - i);
        }
        return flag;
    }

    public void addOnListChangedCallback(ObservableList.OnListChangedCallback onlistchangedcallback)
    {
        if (mListeners == null)
        {
            mListeners = new ListChangeRegistry();
        }
        mListeners.add(onlistchangedcallback);
    }

    public void clear()
    {
        int i = size();
        super.clear();
        if (i != 0)
        {
            notifyRemove(0, i);
        }
    }

    public Object remove(int i)
    {
        Object obj = super.remove(i);
        notifyRemove(i, 1);
        return obj;
    }

    public boolean remove(Object obj)
    {
        int i = indexOf(obj);
        if (i >= 0)
        {
            remove(i);
            return true;
        } else
        {
            return false;
        }
    }

    public void removeOnListChangedCallback(ObservableList.OnListChangedCallback onlistchangedcallback)
    {
        if (mListeners != null)
        {
            mListeners.remove(onlistchangedcallback);
        }
    }

    protected void removeRange(int i, int j)
    {
        super.removeRange(i, j);
        notifyRemove(i, j - i);
    }

    public Object set(int i, Object obj)
    {
        obj = super.set(i, obj);
        if (mListeners != null)
        {
            mListeners.notifyChanged(this, i, 1);
        }
        return obj;
    }
}
