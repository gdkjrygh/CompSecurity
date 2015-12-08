// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class lang.String extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(WA$b, s);
    }

    public static lang.String[] values()
    {
        return (s[])c.clone();
    }

    static 
    {
        a = new <init>("ORIGINAL", 0);
        b = new <init>("DISABLED", 1);
        c = (new c[] {
            a, b
        });
    }

    private >(String s, int i)
    {
        super(s, i);
    }
}
