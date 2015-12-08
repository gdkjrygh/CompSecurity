// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            hn, nh, nc, ou, 
//            gl, no, nj

public final class ha extends hn
{

    final nh a;

    private ha(no no, nh nh1)
    {
        super(no);
        if (nh1 == null)
        {
            throw new NullPointerException("local == null");
        } else
        {
            a = nh1;
            return;
        }
    }

    public static String a(nh nh1)
    {
        return (new StringBuilder()).append(nh1.k()).append(' ').append(nh1.g().toString()).append(": ").append(nh1.f().h_()).toString();
    }

    public final gl a(nj nj)
    {
        return new ha(super.e, a);
    }

    protected final String a()
    {
        return a.toString();
    }

    protected final String a(boolean flag)
    {
        return (new StringBuilder("local-start ")).append(a(a)).toString();
    }

    public final gl c(int i)
    {
        return new ha(super.e, a.b(i));
    }
}
