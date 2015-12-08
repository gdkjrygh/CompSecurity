// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class arz extends Enum
{

    public static final arz a;
    private static arz b;
    private static arz c;
    private static final arz d[];

    private arz(String s, int i)
    {
        super(s, i);
    }

    arz(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public static arz valueOf(String s)
    {
        return (arz)Enum.valueOf(arz, s);
    }

    public static arz[] values()
    {
        return (arz[])d.clone();
    }

    protected void a(Throwable throwable)
    {
    }

    static 
    {
        b = new arz("IGNORE", 0);
        a = new asa("LOG", 1);
        c = new asb("THROW", 2);
        d = (new arz[] {
            b, a, c
        });
    }
}
