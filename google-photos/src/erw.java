// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class erw extends Enum
{

    public static final erw a;
    public static final erw b;
    private static erw e;
    private static erw f;
    private static erw g;
    private static erw h;
    private static erw i;
    private static final SparseArray j;
    private static final erw k[];
    public final boolean c;
    public final int d;

    private erw(String s, int l, int i1, boolean flag)
    {
        super(s, l);
        d = i1;
        c = flag;
    }

    public static erw a(int l)
    {
        return (erw)j.get(l);
    }

    public static erw valueOf(String s)
    {
        return (erw)Enum.valueOf(erw, s);
    }

    public static erw[] values()
    {
        return (erw[])k.clone();
    }

    static 
    {
        int l = 0;
        e = new erw("UNKNOWN", 0, 0, false);
        a = new erw("OWNER_ONLY", 1, 1, false);
        f = new erw("LIMITED", 2, 2, true);
        g = new erw("ALL_PERSONAL_CIRCLES", 3, 6, true);
        h = new erw("EXTENDED_CIRCLES", 4, 3, true);
        i = new erw("DOMAIN_PUBLIC", 5, 4, true);
        b = new erw("PUBLIC", 6, 5, true);
        k = (new erw[] {
            e, a, f, g, h, i, b
        });
        j = new SparseArray();
        erw aerw[] = values();
        for (int i1 = aerw.length; l < i1; l++)
        {
            erw erw1 = aerw[l];
            j.put(erw1.d, erw1);
        }

    }
}
