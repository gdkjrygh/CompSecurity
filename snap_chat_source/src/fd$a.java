// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class lang.String extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(fd$a, s);
    }

    public static lang.String[] values()
    {
        return (s[])f.clone();
    }

    static 
    {
        a = new <init>("INVALID_COUNTRY_CODE", 0);
        b = new <init>("NOT_A_NUMBER", 1);
        c = new <init>("TOO_SHORT_AFTER_IDD", 2);
        d = new <init>("TOO_SHORT_NSN", 3);
        e = new <init>("TOO_LONG", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private >(String s, int i)
    {
        super(s, i);
    }
}
