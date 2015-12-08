// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class ng.String extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static ng.String valueOf(String s)
    {
        return ()Enum.valueOf(fi$a$a, s);
    }

    public static ng.String[] values()
    {
        return (ng[])e.clone();
    }

    static 
    {
        a = new <init>("FROM_NUMBER_WITH_PLUS_SIGN", 0);
        b = new <init>("FROM_NUMBER_WITH_IDD", 1);
        c = new <init>("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
        d = new <init>("FROM_DEFAULT_COUNTRY", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private ng.String(String s, int i)
    {
        super(s, i);
    }
}
