// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.util.SparseArray;

public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    private static SparseArray e;
    private static final b g[];
    private int f;

    private b(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static b a(int i)
    {
        b b2 = (b)e.get(i);
        b b1 = b2;
        if (b2 == null)
        {
            b1 = c;
        }
        return b1;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(crittercism/android/b, s);
    }

    public static b[] values()
    {
        return (b[])g.clone();
    }

    public final int a()
    {
        return f;
    }

    static 
    {
        a = new b("MOBILE", 0, 0);
        b = new b("WIFI", 1, 1);
        c = new b("UNKNOWN", 2, 2);
        d = new b("NOT_CONNECTED", 3, 3);
        g = (new b[] {
            a, b, c, d
        });
        SparseArray sparsearray = new SparseArray();
        e = sparsearray;
        sparsearray.put(0, a);
        e.put(1, b);
    }
}
