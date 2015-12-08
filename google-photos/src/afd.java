// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;

public final class afd
{

    public SparseArray a;
    public int b;
    private SparseIntArray c;

    public afd()
    {
        a = new SparseArray();
        c = new SparseIntArray();
        b = 0;
    }

    public final void a(int i, int j)
    {
        c.put(i, j);
        ArrayList arraylist = (ArrayList)a.get(i);
        if (arraylist != null)
        {
            for (; arraylist.size() > j; arraylist.remove(arraylist.size() - 1)) { }
        }
    }

    public final void a(afn afn1)
    {
        int i = afn1.e;
        ArrayList arraylist1 = (ArrayList)a.get(i);
        ArrayList arraylist = arraylist1;
        if (arraylist1 == null)
        {
            ArrayList arraylist2 = new ArrayList();
            a.put(i, arraylist2);
            arraylist = arraylist2;
            if (c.indexOfKey(i) < 0)
            {
                c.put(i, 5);
                arraylist = arraylist2;
            }
        }
        if (c.get(i) <= arraylist.size())
        {
            return;
        } else
        {
            afn1.r();
            arraylist.add(afn1);
            return;
        }
    }
}
