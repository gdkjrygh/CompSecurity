// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            of, ot, pf

public final class on extends of
{

    public static final on a = a((short)0);

    private on(short word0)
    {
        super(word0);
    }

    public static on a(short word0)
    {
        return new on(word0);
    }

    public final ot b()
    {
        return ot.h;
    }

    public final String e()
    {
        return "short";
    }

    public final String h_()
    {
        return Integer.toString(super.h);
    }

    public final String toString()
    {
        int i = super.h;
        return (new StringBuilder("short{0x")).append(pf.b(i)).append(" / ").append(i).append('}').toString();
    }

}
