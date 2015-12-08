// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public static final class c
{

    private SparseArray a;
    private SparseIntArray b;
    private int c;

    public final c a(int i)
    {
        ArrayList arraylist = (ArrayList)a.get(i);
        if (arraylist != null && !arraylist.isEmpty())
        {
            i = arraylist.size() - 1;
            c c1 = (a)arraylist.get(i);
            arraylist.remove(i);
            return c1;
        } else
        {
            return null;
        }
    }

    final void a(a a1, a a2)
    {
        if (a1 != null)
        {
            c = c - 1;
        }
        if (c == 0)
        {
            a.clear();
        }
        if (a2 != null)
        {
            c = c + 1;
        }
    }

    public final void a(c c1)
    {
        int i = c1.e;
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
            c1.o();
            arraylist.add(c1);
            return;
        }
    }

    public ()
    {
        a = new SparseArray();
        b = new SparseIntArray();
        c = 0;
    }
}
