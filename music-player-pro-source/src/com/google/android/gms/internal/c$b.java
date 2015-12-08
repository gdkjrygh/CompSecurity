// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, c, qu, qp, 
//            qo, qz, qw

public static final class e extends qq
{

    private static volatile rQ fp[];
    public int fq[];
    public int fr;
    public boolean fs;
    public boolean ft;
    public int name;

    public static e[] d()
    {
        if (fp == null)
        {
            synchronized (qu.azg)
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

    public void a(qp qp1)
        throws IOException
    {
        if (ft)
        {
            qp1.b(1, ft);
        }
        qp1.t(2, fr);
        if (fq != null && fq.length > 0)
        {
            for (int i = 0; i < fq.length; i++)
            {
                qp1.t(3, fq[i]);
            }

        }
        if (name != 0)
        {
            qp1.t(4, name);
        }
        if (fs)
        {
            qp1.b(6, fs);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return c(qo1);
    }

    protected int c()
    {
        int j = 0;
        int k = super.c();
        int i = k;
        if (ft)
        {
            i = k + qp.c(1, ft);
        }
        k = qp.v(2, fr) + i;
        if (fq != null && fq.length > 0)
        {
            for (i = 0; i < fq.length; i++)
            {
                j += qp.gZ(fq[i]);
            }

            j = k + j + fq.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + qp.v(4, name);
        }
        j = i;
        if (fs)
        {
            j = i + qp.c(6, fs);
        }
        return j;
    }

    public fs c(qo qo1)
        throws IOException
    {
        do
        {
            int i = qo1.rz();
            switch (i)
            {
            default:
                if (a(qo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                ft = qo1.rD();
                break;

            case 16: // '\020'
                fr = qo1.rC();
                break;

            case 24: // '\030'
                int l = qz.b(qo1, 24);
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
                    ai[l] = qo1.rC();
                    qo1.rz();
                }

                ai[l] = qo1.rC();
                fq = ai;
                break;

            case 26: // '\032'
                int j1 = qo1.gS(qo1.rG());
                int k = qo1.getPosition();
                int i1;
                for (i1 = 0; qo1.rL() > 0; i1++)
                {
                    qo1.rC();
                }

                qo1.gU(k);
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
                    ai1[i1] = qo1.rC();
                }

                fq = ai1;
                qo1.gT(j1);
                break;

            case 32: // ' '
                name = qo1.rC();
                break;

            case 48: // '0'
                fs = qo1.rD();
                break;
            }
        } while (true);
    }

    public D e()
    {
        fq = qz.azj;
        fr = 0;
        name = 0;
        fs = false;
        ft = false;
        ayW = null;
        azh = -1;
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
            if (obj instanceof azh)
            {
                obj = (azh)obj;
                flag = flag1;
                if (qu.equals(fq, ((fq) (obj)).fq))
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
                                    return a(((qq) (obj)));
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
        int i = qu.hashCode(fq);
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
        return ((c1 + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c2) * 31 + rQ();
    }

    public ()
    {
        e();
    }
}
