// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            na, my, pe, nj, 
//            nh, nf, ng, np, 
//            nq

final class mv
    implements na
{

    int a;

    public mv()
    {
        a = 0;
    }

    private void a(my my1)
    {
        nh nh1 = my1.d;
        if (nh1 != null)
        {
            a(nh1);
        }
        my1 = my1.e;
        int j = ((pe) (my1)).K.length;
        for (int i = 0; i < j; i++)
        {
            a(my1.b(i));
        }

    }

    private void a(nh nh1)
    {
        int i = nh1.h();
        if (i > a)
        {
            a = i;
        }
    }

    public final void a(nf nf)
    {
        a(((my) (nf)));
    }

    public final void a(ng ng)
    {
        a(((my) (ng)));
    }

    public final void a(np np)
    {
        a(((my) (np)));
    }

    public final void a(nq nq)
    {
        a(((my) (nq)));
    }
}
