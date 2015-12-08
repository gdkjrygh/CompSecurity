// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            mz, my, nl, mw, 
//            od, nh, nf

final class hh extends mz
{

    final boolean a[];
    final int b;
    final int c;

    hh(boolean aflag[], int i, int j)
    {
        a = aflag;
        b = i;
        c = j;
        super();
    }

    public final void a(nf nf)
    {
        if (((my) (nf)).b.a == 3)
        {
            int i = ((od)((mw) (nf)).a).f();
            boolean aflag[] = a;
            boolean flag;
            if (a[0] && i + (b - c) == ((my) (nf)).d.e())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aflag[0] = flag;
        }
    }
}
