// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aex extends aep
{

    public static final aex a = a((short)0);

    private aex(short word0)
    {
        super(word0);
    }

    public static aex a(short word0)
    {
        return new aex(word0);
    }

    public final String ag_()
    {
        return Integer.toString(super.b);
    }

    public final aeD b()
    {
        return aeD.h;
    }

    public final String e()
    {
        return "short";
    }

    public final String toString()
    {
        int i = super.b;
        return (new StringBuilder("short{0x")).append(aeO.b(i)).append(" / ").append(i).append('}').toString();
    }

}
