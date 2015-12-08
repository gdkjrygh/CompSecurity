// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jee extends Enum
{

    public static final jee a;
    public static final jee b;
    public static final jee c;
    private static final jee d[];

    private jee(String s, int i)
    {
        super(s, i);
    }

    public static jee valueOf(String s)
    {
        return (jee)Enum.valueOf(jee, s);
    }

    public static jee[] values()
    {
        return (jee[])d.clone();
    }

    static 
    {
        a = new jee("READY", 0);
        b = new jee("PROCESSING", 1);
        c = new jee("UNAVAILABLE", 2);
        d = (new jee[] {
            a, b, c
        });
    }
}
