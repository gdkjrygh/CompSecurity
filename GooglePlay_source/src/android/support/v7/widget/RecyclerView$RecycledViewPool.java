// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static final class mAttachCount
{

    int mAttachCount;
    public SparseIntArray mMaxScrap;
    public SparseArray mScrap;

    public final mAttachCount getRecycledView(int i)
    {
        ArrayList arraylist = (ArrayList)mScrap.get(i);
        if (arraylist != null && !arraylist.isEmpty())
        {
            i = arraylist.size() - 1;
            mAttachCount mattachcount = (mScrap)arraylist.get(i);
            arraylist.remove(i);
            return mattachcount;
        } else
        {
            return null;
        }
    }

    public final void putRecycledView(mScrap mscrap)
    {
        int i = mscrap.iewType;
        ArrayList arraylist = (ArrayList)mScrap.get(i);
        if (arraylist == null)
        {
            ArrayList arraylist1 = new ArrayList();
            mScrap.put(i, arraylist1);
            arraylist = arraylist1;
            if (mMaxScrap.indexOfKey(i) < 0)
            {
                mMaxScrap.put(i, 5);
                arraylist = arraylist1;
            }
        }
        if (mMaxScrap.get(i) <= arraylist.size())
        {
            return;
        } else
        {
            mscrap.nternal();
            arraylist.add(mscrap);
            return;
        }
    }

    public ()
    {
        mScrap = new SparseArray();
        mMaxScrap = new SparseIntArray();
        mAttachCount = 0;
    }
}
