// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfs extends Enum
{

    public static final lfs a;
    public static final lfs b;
    public static final lfs c;
    private static final lfs d[];

    private lfs(String s, int i)
    {
        super(s, i);
    }

    public static lfs valueOf(String s)
    {
        return (lfs)Enum.valueOf(lfs, s);
    }

    public static lfs[] values()
    {
        return (lfs[])d.clone();
    }

    static 
    {
        a = new lfs("NETWORK", 0);
        b = new lfs("DISK", 1);
        c = new lfs("DEFAULT", 2);
        d = (new lfs[] {
            a, b, c
        });
    }
}
