// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;


// Referenced classes of package p.dg:
//            m

static final class h extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g i[];
    private final int h;

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/dg/m$a, s);
    }

    public static .String[] values()
    {
        return (.String[])i.clone();
    }

    public int a()
    {
        return h;
    }

    static 
    {
        a = new <init>("SKIPPED", 0, 1);
        b = new <init>("STATION_CHANGE", 1, 2);
        c = new <init>("THUMBED_DOWN", 2, 3);
        d = new <init>("ERROR", 3, 4);
        e = new <init>("DISCARDED", 4, 5);
        f = new <init>("EXPIRED", 5, 6);
        g = new <init>("UNKNOWN", 6, 7);
        i = (new i[] {
            a, b, c, d, e, f, g
        });
    }

    private .String(String s, int j, int k)
    {
        super(s, j);
        h = k;
    }
}
