// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mqo extends Enum
{

    public static final mqo a;
    public static final mqo b;
    public static final mqo c;
    private static final mqo d[];

    private mqo(String s, int i)
    {
        super(s, i);
    }

    public static mqo valueOf(String s)
    {
        return (mqo)Enum.valueOf(mqo, s);
    }

    public static mqo[] values()
    {
        return (mqo[])d.clone();
    }

    static 
    {
        a = new mqo("ACCOUNT", 0);
        b = new mqo("ALBUM", 1);
        c = new mqo("BATCH", 2);
        d = (new mqo[] {
            a, b, c
        });
    }
}
