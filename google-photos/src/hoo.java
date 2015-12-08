// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class hoo extends Enum
{

    public static final hoo a;
    public static final hoo b;
    public static final hoo c;
    public static final hoo d;
    private static final SparseArray f;
    private static final hoo g[];
    final int e;

    private hoo(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static hoo valueOf(String s)
    {
        return (hoo)Enum.valueOf(hoo, s);
    }

    public static hoo[] values()
    {
        return (hoo[])g.clone();
    }

    static 
    {
        int i = 0;
        a = new hoo("SPAM", 0, 1);
        b = new hoo("PORN", 1, 2);
        c = new hoo("HATE", 2, 3);
        d = new hoo("HARASSMENT", 3, 4);
        g = (new hoo[] {
            a, b, c, d
        });
        f = new SparseArray();
        hoo ahoo[] = values();
        for (int j = ahoo.length; i < j; i++)
        {
            hoo hoo1 = ahoo[i];
            f.put(hoo1.e, hoo1);
        }

    }
}
