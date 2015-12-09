// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            my, nj, nl, na, 
//            os, no, nh, ov

public final class ng extends my
{

    public ng(nl nl1, no no, nh nh, nh nh1)
    {
        this(nl1, no, nh, nj.a(nh1));
    }

    public ng(nl nl1, no no, nh nh, nj nj1)
    {
        super(nl1, no, nh, nj1);
        switch (nl1.c)
        {
        default:
            if (nh != null && nl1.c != 1)
            {
                throw new IllegalArgumentException("can't mix branchingness with result");
            } else
            {
                return;
            }

        case 5: // '\005'
        case 6: // '\006'
            throw new IllegalArgumentException("bogus branchingness");
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
