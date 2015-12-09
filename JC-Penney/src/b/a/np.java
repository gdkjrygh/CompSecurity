// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            mw, nl, na, nr, 
//            oo, nq, ov, no, 
//            nj

public final class np extends mw
{

    private final ov f;

    public np(nl nl1, no no, nj nj, ov ov, nr nr1)
    {
        super(nl1, no, null, nj, nr1);
        if (nl1.c != 6)
        {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (ov == null)
        {
            throw new NullPointerException("catches == null");
        } else
        {
            f = ov;
            return;
        }
    }

    public final void a(na na1)
    {
        na1.a(this);
    }

    public final String b()
    {
        nr nr1 = super.a;
        String s = nr1.h_();
        if (nr1 instanceof oo)
        {
            s = ((oo)nr1).f();
        }
        return (new StringBuilder()).append(s).append(" ").append(nq.a(f)).toString();
    }

    public final ov c()
    {
        return f;
    }
}
