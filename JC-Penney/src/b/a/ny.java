// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            of, ot, pf

public final class ny extends of
{

    public static final ny a = a('\0');

    private ny(char c)
    {
        super(c);
    }

    public static ny a(char c)
    {
        return new ny(c);
    }

    public final ot b()
    {
        return ot.c;
    }

    public final String e()
    {
        return "char";
    }

    public final String h_()
    {
        return Integer.toString(super.h);
    }

    public final String toString()
    {
        int i = super.h;
        return (new StringBuilder("char{0x")).append(pf.b(i)).append(" / ").append(i).append('}').toString();
    }

}
