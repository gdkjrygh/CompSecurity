// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, c, qr, qp, 
//            qu, qo, qz, qw

public static final class n extends qq
{

    public static final qr gf = qr.a(11, com/google/android/gms/internal/c$h, 810);
    private static final  gg[] = new [0];
    public int gh[];
    public int gi[];
    public int gj[];
    public int gk;
    public int gl[];
    public int gm;
    public int gn;

    public void a(qp qp1)
        throws IOException
    {
        boolean flag = false;
        if (gh != null && gh.length > 0)
        {
            for (int j = 0; j < gh.length; j++)
            {
                qp1.t(1, gh[j]);
            }

        }
        if (gi != null && gi.length > 0)
        {
            for (int k = 0; k < gi.length; k++)
            {
                qp1.t(2, gi[k]);
            }

        }
        if (gj != null && gj.length > 0)
        {
            for (int l = 0; l < gj.length; l++)
            {
                qp1.t(3, gj[l]);
            }

        }
        if (gk != 0)
        {
            qp1.t(4, gk);
        }
        if (gl != null && gl.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < gl.length; i1++)
            {
                qp1.t(5, gl[i1]);
            }

        }
        if (gm != 0)
        {
            qp1.t(6, gm);
        }
        if (gn != 0)
        {
            qp1.t(7, gn);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return i(qo1);
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
                l += qp.gZ(gh[j]);
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
                    i1 += qp.gZ(gi[k]);
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
                    i1 += qp.gZ(gj[l]);
                }

                l = k + i1 + gj.length * 1;
            }
        }
        k = l;
        if (gk != 0)
        {
            k = l + qp.v(4, gk);
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
                    i1 += qp.gZ(gl[l]);
                }

                l = k + i1 + gl.length * 1;
            }
        }
        k = l;
        if (gm != 0)
        {
            k = l + qp.v(6, gm);
        }
        l = k;
        if (gn != 0)
        {
            l = k + qp.v(7, gn);
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
                if (qu.equals(gh, ((gh) (obj)).gh))
                {
                    flag = flag1;
                    if (qu.equals(gi, ((gi) (obj)).gi))
                    {
                        flag = flag1;
                        if (qu.equals(gj, ((gj) (obj)).gj))
                        {
                            flag = flag1;
                            if (gk == ((gk) (obj)).gk)
                            {
                                flag = flag1;
                                if (qu.equals(gl, ((gl) (obj)).gl))
                                {
                                    flag = flag1;
                                    if (gm == ((gm) (obj)).gm)
                                    {
                                        flag = flag1;
                                        if (gn == ((gn) (obj)).gn)
                                        {
                                            return a(((qq) (obj)));
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
        return (((((((qu.hashCode(gh) + 527) * 31 + qu.hashCode(gi)) * 31 + qu.hashCode(gj)) * 31 + gk) * 31 + qu.hashCode(gl)) * 31 + gm) * 31 + gn) * 31 + rQ();
    }

    public rQ i(qo qo1)
        throws IOException
    {
        do
        {
            int j = qo1.rz();
            switch (j)
            {
            default:
                if (a(qo1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                int k2 = qz.b(qo1, 8);
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
                    ai[k2] = qo1.rC();
                    qo1.rz();
                }

                ai[k2] = qo1.rC();
                gh = ai;
                break;

            case 10: // '\n'
                int k4 = qo1.gS(qo1.rG());
                int l = qo1.getPosition();
                int l2;
                for (l2 = 0; qo1.rL() > 0; l2++)
                {
                    qo1.rC();
                }

                qo1.gU(l);
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
                    ai1[l2] = qo1.rC();
                }

                gh = ai1;
                qo1.gT(k4);
                break;

            case 16: // '\020'
                int i3 = qz.b(qo1, 16);
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
                    ai2[i3] = qo1.rC();
                    qo1.rz();
                }

                ai2[i3] = qo1.rC();
                gi = ai2;
                break;

            case 18: // '\022'
                int l4 = qo1.gS(qo1.rG());
                int j1 = qo1.getPosition();
                int j3;
                for (j3 = 0; qo1.rL() > 0; j3++)
                {
                    qo1.rC();
                }

                qo1.gU(j1);
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
                    ai3[j3] = qo1.rC();
                }

                gi = ai3;
                qo1.gT(l4);
                break;

            case 24: // '\030'
                int k3 = qz.b(qo1, 24);
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
                    ai4[k3] = qo1.rC();
                    qo1.rz();
                }

                ai4[k3] = qo1.rC();
                gj = ai4;
                break;

            case 26: // '\032'
                int i5 = qo1.gS(qo1.rG());
                int l1 = qo1.getPosition();
                int l3;
                for (l3 = 0; qo1.rL() > 0; l3++)
                {
                    qo1.rC();
                }

                qo1.gU(l1);
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
                    ai5[l3] = qo1.rC();
                }

                gj = ai5;
                qo1.gT(i5);
                break;

            case 32: // ' '
                gk = qo1.rC();
                break;

            case 40: // '('
                int i4 = qz.b(qo1, 40);
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
                    ai6[i4] = qo1.rC();
                    qo1.rz();
                }

                ai6[i4] = qo1.rC();
                gl = ai6;
                break;

            case 42: // '*'
                int j5 = qo1.gS(qo1.rG());
                int j2 = qo1.getPosition();
                int j4;
                for (j4 = 0; qo1.rL() > 0; j4++)
                {
                    qo1.rC();
                }

                qo1.gU(j2);
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
                    ai7[j4] = qo1.rC();
                }

                gl = ai7;
                qo1.gT(j5);
                break;

            case 48: // '0'
                gm = qo1.rC();
                break;

            case 56: // '8'
                gn = qo1.rC();
                break;
            }
        } while (true);
    }

    public C n()
    {
        gh = qz.azj;
        gi = qz.azj;
        gj = qz.azj;
        gk = 0;
        gl = qz.azj;
        gm = 0;
        gn = 0;
        ayW = null;
        azh = -1;
        return this;
    }


    public ()
    {
        n();
    }
}
