// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            bv, bc

public final class bl
{

    private SparseArray a;
    private SparseIntArray b;
    private int c;

    public bl()
    {
        a = new SparseArray();
        b = new SparseIntArray();
        c = 0;
    }

    public final bv a(int i)
    {
        ArrayList arraylist = (ArrayList)a.get(i);
        if (arraylist != null && !arraylist.isEmpty())
        {
            i = arraylist.size() - 1;
            bv bv1 = (bv)arraylist.get(i);
            arraylist.remove(i);
            return bv1;
        } else
        {
            return null;
        }
    }

    final void a(bc bc, bc bc1)
    {
        if (bc != null)
        {
            c = c - 1;
        }
        if (c == 0)
        {
            a.clear();
        }
        if (bc1 != null)
        {
            c = c + 1;
        }
    }

    public final void a(bv bv1)
    {
        int i = bv1.getItemViewType();
        ArrayList arraylist1 = (ArrayList)a.get(i);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            ArrayList arraylist2 = new ArrayList();
            a.put(i, arraylist2);
            arraylist = arraylist2;
            if (b.indexOfKey(i) < 0)
            {
                b.put(i, 5);
                arraylist = arraylist2;
            }
        }
        if (b.get(i) <= arraylist.size())
        {
            return;
        } else
        {
            bv1.resetInternal();
            arraylist.add(bv1);
            return;
        }
    }
}
