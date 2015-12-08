// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class lang.String extends Enum
{

    public static final b a;
    public static final b b;
    private static b c;
    private static final b d[];

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(cn$j, s);
    }

    public static lang.String[] values()
    {
        return (s[])d.clone();
    }

    static 
    {
        c = new <init>("pad", 0);
        a = new <init>("reflect", 1);
        b = new <init>("repeat", 2);
        d = (new d[] {
            c, a, b
        });
    }

    private >(String s, int i)
    {
        super(s, i);
    }
}
