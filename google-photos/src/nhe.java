// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nhe extends Enum
    implements qwc
{

    private static nhe a;
    private static final nhe b[];

    private nhe(String s, int i)
    {
        super(s, 0);
    }

    public static qwc b()
    {
        return a;
    }

    public static nhe valueOf(String s)
    {
        return (nhe)Enum.valueOf(nhe, s);
    }

    public static nhe[] values()
    {
        return (nhe[])b.clone();
    }

    public final Object a()
    {
        return new ngx();
    }

    static 
    {
        a = new nhe("INSTANCE", 0);
        b = (new nhe[] {
            a
        });
    }
}
