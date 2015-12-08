// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;

public final class crk
{

    public final LongSparseArray a;
    public Iterable b;

    public crk(LongSparseArray longsparsearray)
    {
        b = null;
        a = longsparsearray;
    }

    public void a(long l, long l1)
    {
        int j;
        for (j = b.c(a, l); j == -1 || a.keyAt(j) >= l1;)
        {
            return;
        }

        int i = b.b(a, l1);
        c.b(i, "indexBelowUB", -1, null);
        for (; i >= j; i--)
        {
            a.removeAt(i);
        }

        a.size();
    }

    public void a(cod cod1)
    {
        a.put(cod1.b, cod1);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        int j = a.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(((cod)a.valueAt(i)).toString());
            if (i != j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
