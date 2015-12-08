// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mms extends Enum
{

    public static final mms a;
    public static final mms b;
    public static final mms c;
    private static final mms d[];

    private mms(String s, int i)
    {
        super(s, i);
    }

    public static mms valueOf(String s)
    {
        return (mms)Enum.valueOf(mms, s);
    }

    public static mms[] values()
    {
        return (mms[])d.clone();
    }

    static 
    {
        a = new mms("UNKNOWN", 0);
        b = new mms("INVALID", 1);
        c = new mms("VALID", 2);
        d = (new mms[] {
            a, b, c
        });
    }
}
