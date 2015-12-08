// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nrg extends Enum
{

    public static final nrg a;
    public static final nrg b;
    private static final nrg c[];

    private nrg(String s, int i, int j)
    {
        super(s, i);
    }

    public static nrg valueOf(String s)
    {
        return (nrg)Enum.valueOf(nrg, s);
    }

    public static nrg[] values()
    {
        return (nrg[])c.clone();
    }

    static 
    {
        a = new nrg("SYSTEM_TRAY", 0, 0);
        b = new nrg("IN_APP_TRAY", 1, 1);
        c = (new nrg[] {
            a, b
        });
    }
}
