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

    final void a()
    {
        c = c + 1;
    }

    public final void a(int i, int j)
    {
        b.put(i, j);
        ArrayList arraylist = (ArrayList)a.get(i);
        if (arraylist != null)
        {
            for (; arraylist.size() > j; arraylist.remove(arraylist.size() - 1)) { }
        }
    }

    final void a(a a1, a a2, boolean flag)
    {
        if (a1 != null)
        {
            b();
        }
        if (!flag && c == 0)
        {
            a.clear();
        }
        if (a2 != null)
        {
            a();
        }
    }

    public final void a(a a1)
    {
        int i = a1.getItemViewType();
        ArrayList arraylist = (ArrayList)a.get(i);
        if (arraylist == null)
        {
            ArrayList arraylist1 = new ArrayList();
            a.put(i, arraylist1);
            arraylist = arraylist1;
            if (b.indexOfKey(i) < 0)
            {
                b.put(i, 5);
                arraylist = arraylist1;
            }
        }
        if (b.get(i) <= arraylist.size())
        {
            return;
        } else
        {
            a1.resetInternal();
            arraylist.add(a1);
            return;
        }
    }

    final void b()
    {
        c = c - 1;
    }

    public ()
    {
        a = new SparseArray();
        b = new SparseIntArray();
        c = 0;
    }
}
