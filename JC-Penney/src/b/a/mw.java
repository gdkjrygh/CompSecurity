// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            my, nr, nl, no, 
//            nh, nj

public abstract class mw extends my
{

    public final nr a;

    public mw(nl nl, no no, nh nh, nj nj, nr nr1)
    {
        super(nl, no, nh, nj);
        if (nr1 == null)
        {
            throw new NullPointerException("cst == null");
        } else
        {
            a = nr1;
            return;
        }
    }

    public String b()
    {
        return a.h_();
    }
}
