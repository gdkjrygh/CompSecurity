// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            bi, al

public final class ay
{

    private SparseArray a;
    private SparseIntArray b;
    private int c;

    public ay()
    {
        a = new SparseArray();
        b = new SparseIntArray();
        c = 0;
    }

    public final bi a(int i)
    {
        ArrayList arraylist = (ArrayList)a.get(i);
        if (arraylist != null && !arraylist.isEmpty())
        {
            i = arraylist.size() - 1;
            bi bi1 = (bi)arraylist.get(i);
            arraylist.remove(i);
            return bi1;
        } else
        {
            return null;
        }
    }

    final void a(al al, al al1)
    {
        if (al != null)
        {
            c = c - 1;
        }
        if (c == 0)
        {
            a.clear();
        }
        if (al1 != null)
        {
            c = c + 1;
        }
    }

    public final void a(bi bi1)
    {
        int i = bi1.e;
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
            bi1.q();
            arraylist.add(bi1);
            return;
        }
    }
}
