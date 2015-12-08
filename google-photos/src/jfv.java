// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jfv extends Enum
{

    public static final jfv a;
    public static final jfv b;
    public static final jfv c;
    public static final jfv d;
    public static final jfv e;
    public static final jfv f;
    public static final jfv g;
    public static final jfv h;
    private static final jfv i[];

    private jfv(String s, int j)
    {
        super(s, j);
    }

    public static jfv valueOf(String s)
    {
        return (jfv)Enum.valueOf(jfv, s);
    }

    public static jfv[] values()
    {
        return (jfv[])i.clone();
    }

    static 
    {
        a = new jfv("ERROR", 0);
        b = new jfv("IDLE", 1);
        c = new jfv("PREPARING", 2);
        d = new jfv("PREPARED", 3);
        e = new jfv("STARTED", 4);
        f = new jfv("PAUSED", 5);
        g = new jfv("PLAYBACK_COMPLETED", 6);
        h = new jfv("END", 7);
        i = (new jfv[] {
            a, b, c, d, e, f, g, h
        });
    }
}
