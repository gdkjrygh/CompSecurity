// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, c, pi, pg, 
//            pl, pf, pq, pn

public static final class n extends ph
{

    public static final pi gf = pi.a(11, com/google/android/gms/internal/c$h, 810);
    private static final  gg[] = new [0];
    public int gh[];
    public int gi[];
    public int gj[];
    public int gk;
    public int gl[];
    public int gm;
    public int gn;

    public void a(pg pg1)
        throws IOException
    {
        boolean flag = false;
        if (gh != null && gh.length > 0)
        {
            for (int j = 0; j < gh.length; j++)
            {
                pg1.s(1, gh[j]);
            }

        }
        if (gi != null && gi.length > 0)
        {
            for (int k = 0; k < gi.length; k++)
            {
                pg1.s(2, gi[k]);
            }

        }
        if (gj != null && gj.length > 0)
        {
            for (int l = 0; l < gj.length; l++)
            {
                pg1.s(3, gj[l]);
            }

        }
        if (gk != 0)
        {
            pg1.s(4, gk);
        }
        if (gl != null && gl.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < gl.length; i1++)
            {
                pg1.s(5, gl[i1]);
            }

        }
        if (gm != 0)
        {
            pg1.s(6, gm);
        }
        if (gn != 0)
        {
            pg1.s(7, gn);
        }
        super.a(pg1);
    }

    public pn b(pf pf1)
        throws IOException
    {
        return i(pf1);
    }

    protected int c()
    {
        boolean flag = false;
        int i1 = super.c();
        int k;
        int l;
        if (gh != null && gh.length > 0)
        {
            int j = 0;
            l = 0;
            for (; j < gh.length; j++)
            {
                l += pg.gw(gh[j]);
            }

            l = i1 + l + gh.length * 1;
        } else
        {
            l = i1;
        }
        k = l;
        if (gi != null)
        {
            k = l;
            if (gi.length > 0)
            {
                k = 0;
                i1 = 0;
                for (; k < gi.length; k++)
                {
                    i1 += pg.gw(gi[k]);
                }

                k = l + i1 + gi.length * 1;
            }
        }
        l = k;
        if (gj != null)
        {
            l = k;
            if (gj.length > 0)
            {
                l = 0;
                i1 = 0;
                for (; l < gj.length; l++)
                {
                    i1 += pg.gw(gj[l]);
                }

                l = k + i1 + gj.length * 1;
            }
        }
        k = l;
        if (gk != 0)
        {
            k = l + pg.u(4, gk);
        }
        l = k;
        if (gl != null)
        {
            l = k;
            if (gl.length > 0)
            {
                i1 = 0;
                for (l = ((flag) ? 1 : 0); l < gl.length; l++)
                {
                    i1 += pg.gw(gl[l]);
                }

                l = k + i1 + gl.length * 1;
            }
        }
        k = l;
        if (gm != 0)
        {
            k = l + pg.u(6, gm);
        }
        l = k;
        if (gn != 0)
        {
            l = k + pg.u(7, gn);
        }
        return l;
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
            if (obj instanceof gn)
            {
                obj = (gn)obj;
                flag = flag1;
                if (pl.equals(gh, ((gh) (obj)).gh))
                {
                    flag = flag1;
                    if (pl.equals(gi, ((gi) (obj)).gi))
                    {
                        flag = flag1;
                        if (pl.equals(gj, ((gj) (obj)).gj))
                        {
                            flag = flag1;
                            if (gk == ((gk) (obj)).gk)
                            {
                                flag = flag1;
                                if (pl.equals(gl, ((gl) (obj)).gl))
                                {
                                    flag = flag1;
                                    if (gm == ((gm) (obj)).gm)
                                    {
                                        flag = flag1;
                                        if (gn == ((gn) (obj)).gn)
                                        {
                                            return a(((ph) (obj)));
                                        }
                                    }
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
        return (((((((pl.hashCode(gh) + 527) * 31 + pl.hashCode(gi)) * 31 + pl.hashCode(gj)) * 31 + gk) * 31 + pl.hashCode(gl)) * 31 + gm) * 31 + gn) * 31 + qz();
    }

    public qz i(pf pf1)
        throws IOException
    {
        do
        {
            int j = pf1.qi();
            switch (j)
            {
            default:
                if (a(pf1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                int k2 = pq.b(pf1, 8);
                int ai[];
                int k;
                if (gh == null)
                {
                    k = 0;
                } else
                {
                    k = gh.length;
                }
                ai = new int[k2 + k];
                k2 = k;
                if (k != 0)
                {
                    System.arraycopy(gh, 0, ai, 0, k);
                    k2 = k;
                }
                for (; k2 < ai.length - 1; k2++)
                {
                    ai[k2] = pf1.ql();
                    pf1.qi();
                }

                ai[k2] = pf1.ql();
                gh = ai;
                break;

            case 10: // '\n'
                int k4 = pf1.gp(pf1.qp());
                int l = pf1.getPosition();
                int l2;
                for (l2 = 0; pf1.qu() > 0; l2++)
                {
                    pf1.ql();
                }

                pf1.gr(l);
                int ai1[];
                if (gh == null)
                {
                    l = 0;
                } else
                {
                    l = gh.length;
                }
                ai1 = new int[l2 + l];
                l2 = l;
                if (l != 0)
                {
                    System.arraycopy(gh, 0, ai1, 0, l);
                    l2 = l;
                }
                for (; l2 < ai1.length; l2++)
                {
                    ai1[l2] = pf1.ql();
                }

                gh = ai1;
                pf1.gq(k4);
                break;

            case 16: // '\020'
                int i3 = pq.b(pf1, 16);
                int ai2[];
                int i1;
                if (gi == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = gi.length;
                }
                ai2 = new int[i3 + i1];
                i3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(gi, 0, ai2, 0, i1);
                    i3 = i1;
                }
                for (; i3 < ai2.length - 1; i3++)
                {
                    ai2[i3] = pf1.ql();
                    pf1.qi();
                }

                ai2[i3] = pf1.ql();
                gi = ai2;
                break;

            case 18: // '\022'
                int l4 = pf1.gp(pf1.qp());
                int j1 = pf1.getPosition();
                int j3;
                for (j3 = 0; pf1.qu() > 0; j3++)
                {
                    pf1.ql();
                }

                pf1.gr(j1);
                int ai3[];
                if (gi == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = gi.length;
                }
                ai3 = new int[j3 + j1];
                j3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(gi, 0, ai3, 0, j1);
                    j3 = j1;
                }
                for (; j3 < ai3.length; j3++)
                {
                    ai3[j3] = pf1.ql();
                }

                gi = ai3;
                pf1.gq(l4);
                break;

            case 24: // '\030'
                int k3 = pq.b(pf1, 24);
                int ai4[];
                int k1;
                if (gj == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = gj.length;
                }
                ai4 = new int[k3 + k1];
                k3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(gj, 0, ai4, 0, k1);
                    k3 = k1;
                }
                for (; k3 < ai4.length - 1; k3++)
                {
                    ai4[k3] = pf1.ql();
                    pf1.qi();
                }

                ai4[k3] = pf1.ql();
                gj = ai4;
                break;

            case 26: // '\032'
                int i5 = pf1.gp(pf1.qp());
                int l1 = pf1.getPosition();
                int l3;
                for (l3 = 0; pf1.qu() > 0; l3++)
                {
                    pf1.ql();
                }

                pf1.gr(l1);
                int ai5[];
                if (gj == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = gj.length;
                }
                ai5 = new int[l3 + l1];
                l3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(gj, 0, ai5, 0, l1);
                    l3 = l1;
                }
                for (; l3 < ai5.length; l3++)
                {
                    ai5[l3] = pf1.ql();
                }

                gj = ai5;
                pf1.gq(i5);
                break;

            case 32: // ' '
                gk = pf1.ql();
                break;

            case 40: // '('
                int i4 = pq.b(pf1, 40);
                int ai6[];
                int i2;
                if (gl == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = gl.length;
                }
                ai6 = new int[i4 + i2];
                i4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(gl, 0, ai6, 0, i2);
                    i4 = i2;
                }
                for (; i4 < ai6.length - 1; i4++)
                {
                    ai6[i4] = pf1.ql();
                    pf1.qi();
                }

                ai6[i4] = pf1.ql();
                gl = ai6;
                break;

            case 42: // '*'
                int j5 = pf1.gp(pf1.qp());
                int j2 = pf1.getPosition();
                int j4;
                for (j4 = 0; pf1.qu() > 0; j4++)
                {
                    pf1.ql();
                }

                pf1.gr(j2);
                int ai7[];
                if (gl == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = gl.length;
                }
                ai7 = new int[j4 + j2];
                j4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(gl, 0, ai7, 0, j2);
                    j4 = j2;
                }
                for (; j4 < ai7.length; j4++)
                {
                    ai7[j4] = pf1.ql();
                }

                gl = ai7;
                pf1.gq(j5);
                break;

            case 48: // '0'
                gm = pf1.ql();
                break;

            case 56: // '8'
                gn = pf1.ql();
                break;
            }
        } while (true);
    }

    public l n()
    {
        gh = pq.awW;
        gi = pq.awW;
        gj = pq.awW;
        gk = 0;
        gl = pq.awW;
        gm = 0;
        gn = 0;
        awJ = null;
        awU = -1;
        return this;
    }


    public ()
    {
        n();
    }
}
