// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, c, pl, pg, 
//            pf, pq, pn

public static final class e extends ph
{

    private static volatile qz fp[];
    public int fq[];
    public int fr;
    public boolean fs;
    public boolean ft;
    public int name;

    public static e[] d()
    {
        if (fp == null)
        {
            synchronized (pl.awT)
            {
                if (fp == null)
                {
                    fp = new fp[0];
                }
            }
        }
        return fp;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(pg pg1)
        throws IOException
    {
        if (ft)
        {
            pg1.b(1, ft);
        }
        pg1.s(2, fr);
        if (fq != null && fq.length > 0)
        {
            for (int i = 0; i < fq.length; i++)
            {
                pg1.s(3, fq[i]);
            }

        }
        if (name != 0)
        {
            pg1.s(4, name);
        }
        if (fs)
        {
            pg1.b(6, fs);
        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return c(pf1);
    }

    protected int c()
    {
        int j = 0;
        int k = super.c();
        int i = k;
        if (ft)
        {
            i = k + pg.c(1, ft);
        }
        k = pg.u(2, fr) + i;
        if (fq != null && fq.length > 0)
        {
            for (i = 0; i < fq.length; i++)
            {
                j += pg.gw(fq[i]);
            }

            j = k + j + fq.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + pg.u(4, name);
        }
        j = i;
        if (fs)
        {
            j = i + pg.c(6, fs);
        }
        return j;
    }

    public fs c(pf pf1)
        throws IOException
    {
        do
        {
            int i = pf1.qi();
            switch (i)
            {
            default:
                if (a(pf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                ft = pf1.qm();
                break;

            case 16: // '\020'
                fr = pf1.ql();
                break;

            case 24: // '\030'
                int l = pq.b(pf1, 24);
                int ai[];
                int j;
                if (fq == null)
                {
                    j = 0;
                } else
                {
                    j = fq.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(fq, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = pf1.ql();
                    pf1.qi();
                }

                ai[l] = pf1.ql();
                fq = ai;
                break;

            case 26: // '\032'
                int j1 = pf1.gp(pf1.qp());
                int k = pf1.getPosition();
                int i1;
                for (i1 = 0; pf1.qu() > 0; i1++)
                {
                    pf1.ql();
                }

                pf1.gr(k);
                int ai1[];
                if (fq == null)
                {
                    k = 0;
                } else
                {
                    k = fq.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(fq, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = pf1.ql();
                }

                fq = ai1;
                pf1.gq(j1);
                break;

            case 32: // ' '
                name = pf1.ql();
                break;

            case 48: // '0'
                fs = pf1.qm();
                break;
            }
        } while (true);
    }

    public m e()
    {
        fq = pq.awW;
        fr = 0;
        name = 0;
        fs = false;
        ft = false;
        awJ = null;
        awU = -1;
        return this;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof awU)
            {
                obj = (awU)obj;
                flag = flag1;
                if (pl.equals(fq, ((fq) (obj)).fq))
                {
                    flag = flag1;
                    if (fr == ((fr) (obj)).fr)
                    {
                        flag = flag1;
                        if (name == ((name) (obj)).name)
                        {
                            flag = flag1;
                            if (fs == ((fs) (obj)).fs)
                            {
                                flag = flag1;
                                if (ft == ((ft) (obj)).ft)
                                {
                                    return a(((ph) (obj)));
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        char c2 = '\u04CF';
        int i = pl.hashCode(fq);
        int j = fr;
        int k = name;
        char c1;
        if (fs)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (!ft)
        {
            c2 = '\u04D5';
        }
        return ((c1 + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c2) * 31 + qz();
    }

    public ()
    {
        e();
    }
}
