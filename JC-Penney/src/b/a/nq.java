// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            my, nl, ov, ot, 
//            na, no, nj

public final class nq extends my
{

    private final ov a;

    public nq(nl nl1, no no, nj nj, ov ov1)
    {
        super(nl1, no, null, nj);
        if (nl1.c != 6)
        {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (ov1 == null)
        {
            throw new NullPointerException("catches == null");
        } else
        {
            a = ov1;
            return;
        }
    }

    public static String a(ov ov1)
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append("catch");
        int j = ov1.a();
        for (int i = 0; i < j; i++)
        {
            stringbuffer.append(" ");
            stringbuffer.append(ov1.a(i).h_());
        }

        return stringbuffer.toString();
    }

    public final void a(na na1)
    {
        na1.a(this);
    }

    public final String b()
    {
        return a(a);
    }

    public final ov c()
    {
        return a;
    }
}
