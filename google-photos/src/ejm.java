// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ejm extends Enum
{

    public static final ejm a;
    public static final ejm b;
    public static final ejm c;
    public static final ejm d;
    private static final ejm e[];

    private ejm(String s, int i)
    {
        super(s, i);
    }

    public static ejm valueOf(String s)
    {
        return (ejm)Enum.valueOf(ejm, s);
    }

    public static ejm[] values()
    {
        return (ejm[])e.clone();
    }

    static 
    {
        a = new ejm("SMALL", 0);
        b = new ejm("LARGE", 1);
        c = new ejm("ACTUAL", 2);
        d = new ejm("ANIMATION_AS_MP4", 3);
        e = (new ejm[] {
            a, b, c, d
        });
    }
}
