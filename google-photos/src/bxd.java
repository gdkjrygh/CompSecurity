// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bxd extends Enum
{

    public static final bxd a;
    public static final bxd b;
    public static final bxd c;
    private static final bxd d[];

    private bxd(String s, int i)
    {
        super(s, i);
    }

    public static bxd valueOf(String s)
    {
        return (bxd)Enum.valueOf(bxd, s);
    }

    public static bxd[] values()
    {
        return (bxd[])d.clone();
    }

    static 
    {
        a = new bxd("UNKNOWN", 0);
        b = new bxd("CLOUD", 1);
        c = new bxd("PREVIEW", 2);
        d = (new bxd[] {
            a, b, c
        });
    }
}
