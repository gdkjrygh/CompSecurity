// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nvx extends Enum
{

    public static final nvx a;
    public static final nvx b;
    private static final nvx c[];

    private nvx(String s, int i)
    {
        super(s, i);
    }

    public static nvx valueOf(String s)
    {
        return (nvx)Enum.valueOf(nvx, s);
    }

    public static nvx[] values()
    {
        return (nvx[])c.clone();
    }

    static 
    {
        a = new nvx("NORMAL", 0);
        b = new nvx("PANORAMA_360", 1);
        c = (new nvx[] {
            a, b
        });
    }
}
