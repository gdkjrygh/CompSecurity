// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bqo extends Enum
{

    public static final bqo a;
    public static final bqo b;
    private static bqo c;
    private static final bqo d[];

    private bqo(String s, int i)
    {
        super(s, i);
    }

    public static bqo valueOf(String s)
    {
        return (bqo)Enum.valueOf(bqo, s);
    }

    public static bqo[] values()
    {
        return (bqo[])d.clone();
    }

    static 
    {
        a = new bqo("USER_REQUIRED", 0);
        c = new bqo("USER_OPTIONAL", 1);
        b = new bqo("PROMPT_LOGIN", 2);
        d = (new bqo[] {
            a, c, b
        });
    }
}
