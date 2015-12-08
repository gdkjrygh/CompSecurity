// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            og, ot, pf

public final class nz extends og
{

    public static final nz a = new nz(Double.doubleToLongBits(0.0D));
    public static final nz b = new nz(Double.doubleToLongBits(1.0D));

    private nz(long l)
    {
        super(l);
    }

    public static nz a(long l)
    {
        return new nz(l);
    }

    public final ot b()
    {
        return ot.d;
    }

    public final String e()
    {
        return "double";
    }

    public final String h_()
    {
        return Double.toString(Double.longBitsToDouble(super.c));
    }

    public final String toString()
    {
        long l = super.c;
        return (new StringBuilder("double{0x")).append(pf.a(l)).append(" / ").append(Double.longBitsToDouble(l)).append('}').toString();
    }

}
