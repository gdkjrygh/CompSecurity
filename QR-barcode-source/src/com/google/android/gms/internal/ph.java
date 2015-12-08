// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            pn, pi, pq, pj, 
//            pk, pf, pp, pg

public abstract class ph extends pn
{

    protected pj awJ;

    public ph()
    {
    }

    public final Object a(pi pi1)
    {
        pk pk1;
        if (awJ != null)
        {
            if ((pk1 = awJ.gE(pq.gI(pi1.tag))) != null)
            {
                return pk1.b(pi1);
            }
        }
        return null;
    }

    public void a(pg pg)
        throws IOException
    {
        if (awJ != null)
        {
            int i = 0;
            while (i < awJ.size()) 
            {
                awJ.gF(i).a(pg);
                i++;
            }
        }
    }

    protected final boolean a(pf pf1, int i)
        throws IOException
    {
        int j = pf1.getPosition();
        if (!pf1.gn(i))
        {
            return false;
        }
        int k = pq.gI(i);
        pp pp1 = new pp(i, pf1.r(j, pf1.getPosition() - j));
        pf1 = null;
        Object obj;
        if (awJ == null)
        {
            awJ = new pj();
        } else
        {
            pf1 = awJ.gE(k);
        }
        obj = pf1;
        if (pf1 == null)
        {
            obj = new pk();
            awJ.a(k, ((pk) (obj)));
        }
        ((pk) (obj)).a(pp1);
        return true;
    }

    protected final boolean a(ph ph1)
    {
        if (awJ == null || awJ.isEmpty())
        {
            return ph1.awJ == null || ph1.awJ.isEmpty();
        } else
        {
            return awJ.equals(ph1.awJ);
        }
    }

    protected int c()
    {
        int j = 0;
        int k;
        if (awJ != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= awJ.size())
                {
                    break;
                }
                i += awJ.gF(j).c();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    protected final int qz()
    {
        if (awJ == null || awJ.isEmpty())
        {
            return 0;
        } else
        {
            return awJ.hashCode();
        }
    }
}
