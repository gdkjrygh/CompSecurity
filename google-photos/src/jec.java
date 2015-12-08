// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jec extends Enum
{

    public static final jec a;
    public static final jec b;
    public static final jec c;
    private static final jec d[];

    private jec(String s, int i)
    {
        super(s, i);
    }

    public static jec valueOf(String s)
    {
        return (jec)Enum.valueOf(jec, s);
    }

    public static jec[] values()
    {
        return (jec[])d.clone();
    }

    static 
    {
        a = new jec("REMOTE_HD", 0);
        b = new jec("REMOTE_SD", 1);
        c = new jec("LOCAL", 2);
        d = (new jec[] {
            a, b, c
        });
    }
}
