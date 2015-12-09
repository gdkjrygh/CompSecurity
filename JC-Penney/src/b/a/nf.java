// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            mw, nl, na, os, 
//            no, nh, nj, nr, 
//            ov

public final class nf extends mw
{

    public nf(nl nl1, no no, nh nh, nj nj, nr nr)
    {
        super(nl1, no, nh, nj, nr);
        if (nl1.c != 1)
        {
            throw new IllegalArgumentException("bogus branchingness");
        } else
        {
            return;
        }
    }

    public final void a(na na1)
    {
        na1.a(this);
    }

    public final ov c()
    {
        return os.a;
    }
}
