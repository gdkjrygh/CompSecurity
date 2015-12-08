// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            of, ot, pf

public final class nx extends of
{

    public static final nx a = a((byte)0);

    private nx(byte byte0)
    {
        super(byte0);
    }

    public static nx a(byte byte0)
    {
        return new nx(byte0);
    }

    public final ot b()
    {
        return ot.b;
    }

    public final String e()
    {
        return "byte";
    }

    public final String h_()
    {
        return Integer.toString(super.h);
    }

    public final String toString()
    {
        int i = super.h;
        return (new StringBuilder("byte{0x")).append(pf.d(i)).append(" / ").append(i).append('}').toString();
    }

}
