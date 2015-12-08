// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aes extends aeq
{

    public static final aes a = a(0L);

    private aes(long l)
    {
        super(l);
    }

    public static aes a(long l)
    {
        return new aes(l);
    }

    public final String ag_()
    {
        return Long.toString(super.b);
    }

    public final aeD b()
    {
        return aeD.g;
    }

    public final String e()
    {
        return "long";
    }

    public final String toString()
    {
        long l = super.b;
        return (new StringBuilder("long{0x")).append(aeO.a(l)).append(" / ").append(l).append('}').toString();
    }

    static 
    {
        a(1L);
    }
}
