// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;


public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    public static final i j;
    public static final i k;
    private static final i m[];
    private final int l;

    private i(String s, int i1, int j1)
    {
        super(s, i1);
        l = j1;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(a/a/a/i, s);
    }

    public static i[] values()
    {
        return (i[])m.clone();
    }

    public final int a()
    {
        return l;
    }

    static 
    {
        a = new i("NotSet", 0, 0);
        b = new i("Event", 1, 1);
        c = new i("PerformanceCounter", 2, 2);
        d = new i("Anomaly", 3, 3);
        e = new i("Prediction", 4, 4);
        f = new i("TraceLog", 5, 5);
        g = new i("EventSourceLog", 6, 6);
        h = new i("HttpLog", 7, 7);
        i = new i("PerformanceCounterAzure", 8, 8);
        j = new i("PerformanceCounterGfs", 9, 9);
        k = new i("__INVALID_ENUM_VALUE", 10, 10);
        m = (new i[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
