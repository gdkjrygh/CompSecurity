// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aei extends aep
{

    public static final aei a = a('\0');

    private aei(char c)
    {
        super(c);
    }

    public static aei a(char c)
    {
        return new aei(c);
    }

    public final String ag_()
    {
        return Integer.toString(super.b);
    }

    public final aeD b()
    {
        return aeD.c;
    }

    public final String e()
    {
        return "char";
    }

    public final String toString()
    {
        int i = super.b;
        return (new StringBuilder("char{0x")).append(aeO.b(i)).append(" / ").append(i).append('}').toString();
    }

}
