// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aem extends aep
{

    public static final aem a = a(Float.floatToIntBits(0.0F));

    private aem(int i)
    {
        super(i);
    }

    public static aem a(int i)
    {
        return new aem(i);
    }

    public final String ag_()
    {
        return Float.toString(Float.intBitsToFloat(super.b));
    }

    public final aeD b()
    {
        return aeD.e;
    }

    public final String e()
    {
        return "float";
    }

    public final String toString()
    {
        int i = super.b;
        return (new StringBuilder("float{0x")).append(aeO.a(i)).append(" / ").append(Float.intBitsToFloat(i)).append('}').toString();
    }

    static 
    {
        a(Float.floatToIntBits(1.0F));
        a(Float.floatToIntBits(2.0F));
    }
}
