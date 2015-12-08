// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dft extends Enum
{

    public static final dft a;
    public static final dft b;
    private static final dft c[];

    private dft(String s, int i)
    {
        super(s, i);
    }

    public static dft valueOf(String s)
    {
        return (dft)Enum.valueOf(dft, s);
    }

    public static dft[] values()
    {
        return (dft[])c.clone();
    }

    static 
    {
        a = new dft("DESTINATIONS", 0);
        b = new dft("ACCOUNTS", 1);
        c = (new dft[] {
            a, b
        });
    }
}
