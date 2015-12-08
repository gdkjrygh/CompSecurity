// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            of, ot, pf

public final class oc extends of
{

    public static final oc a = a(Float.floatToIntBits(0.0F));
    public static final oc b = a(Float.floatToIntBits(1.0F));
    public static final oc c = a(Float.floatToIntBits(2.0F));

    private oc(int i)
    {
        super(i);
    }

    public static oc a(int i)
    {
        return new oc(i);
    }

    public final ot b()
    {
        return ot.e;
    }

    public final String e()
    {
        return "float";
    }

    public final String h_()
    {
        return Float.toString(Float.intBitsToFloat(super.h));
    }

    public final String toString()
    {
        int i = super.h;
        return (new StringBuilder("float{0x")).append(pf.a(i)).append(" / ").append(Float.intBitsToFloat(i)).append('}').toString();
    }

}
