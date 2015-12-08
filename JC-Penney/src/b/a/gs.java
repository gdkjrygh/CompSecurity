// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            hn, gl, nh, ha, 
//            no, nj

public final class gs extends hn
{

    final nh a;

    private gs(no no, nh nh1)
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

    public final gl a(nj nj)
    {
        return new gs(super.e, a);
    }

    protected final String a()
    {
        return a.toString();
    }

    protected final String a(boolean flag)
    {
        return (new StringBuilder("local-end ")).append(ha.a(a)).toString();
    }

    public final gl c(int i)
    {
        return new gs(super.e, a.b(i));
    }
}
