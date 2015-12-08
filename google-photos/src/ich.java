// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ich extends Enum
{

    public static final ich a;
    public static final ich b;
    public static final ich c;
    private static final ich f[];
    public final boolean d;
    public final boolean e;

    private ich(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        d = flag;
        e = flag1;
    }

    public static ich valueOf(String s)
    {
        return (ich)Enum.valueOf(ich, s);
    }

    public static ich[] values()
    {
        return (ich[])f.clone();
    }

    static 
    {
        a = new ich("UNKNOWN", 0, false, true);
        b = new ich("ENABLED", 1, true, false);
        c = new ich("DISABLED", 2, false, false);
        f = (new ich[] {
            a, b, c
        });
    }
}
