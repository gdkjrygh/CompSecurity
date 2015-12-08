// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jff extends Enum
{

    public static final jff a;
    public static final jff b;
    public static final jff c;
    private static final jff d[];

    private jff(String s, int i)
    {
        super(s, i);
    }

    public static jff valueOf(String s)
    {
        return (jff)Enum.valueOf(jff, s);
    }

    public static jff[] values()
    {
        return (jff[])d.clone();
    }

    static 
    {
        a = new jff("IMMEDIATE", 0);
        b = new jff("DELAYED", 1);
        c = new jff("NONE", 2);
        d = (new jff[] {
            a, b, c
        });
    }
}
