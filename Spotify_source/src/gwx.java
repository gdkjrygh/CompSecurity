// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Comparator;

public final class gwx
{

    private static final Comparator a = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (gxi)obj;
            obj1 = (gxi)obj1;
            return ((gxi) (obj)).a() - ((gxi) (obj1)).a();
        }

    };
    private final Class b;
    private final int c[];
    private final gxi d[];
    private final boolean e;

    gwx(Class class1)
    {
        b = class1;
        d = (gxi[])class1.getEnumConstants();
        Arrays.sort(d, a);
        int j = d.length;
        if (d[0].a() == 1 && d[j - 1].a() == j)
        {
            e = true;
            c = null;
        } else
        {
            e = false;
            c = new int[j];
            int i = 0;
            while (i < j) 
            {
                c[i] = d[i].a();
                i++;
            }
        }
    }

    public static int a(gxi gxi1)
    {
        return gxi1.a();
    }

    public final gxi a(int i)
    {
        gxi gxi1;
        int j;
        if (e)
        {
            j = i - 1;
        } else
        {
            j = Arrays.binarySearch(c, i);
        }
        try
        {
            gxi1 = d[j];
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown enum tag ")).append(i).append(" for ").append(b.getCanonicalName()).toString());
        }
        return gxi1;
    }

}
