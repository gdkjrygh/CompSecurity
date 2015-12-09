// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            og, ot, pf

public final class oj extends og
{

    public static final oj a = a(0L);
    public static final oj b = a(1L);

    private oj(long l)
    {
        super(l);
    }

    public static oj a(long l)
    {
        return new oj(l);
    }

    public final ot b()
    {
        return ot.g;
    }

    public final String e()
    {
        return "long";
    }

    public final String h_()
    {
        return Long.toString(super.c);
    }

    public final String toString()
    {
        long l = super.c;
        return (new StringBuilder("long{0x")).append(pf.a(l)).append(" / ").append(l).append('}').toString();
    }

}
