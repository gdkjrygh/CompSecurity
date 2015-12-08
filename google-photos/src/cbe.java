// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public class cbe extends cbg
{

    private static final cho A;
    private static final cho B[][];
    private static final cho C;
    private static final cho D;
    private static final cho E;
    private static final cho F;
    private static final cho G;
    private static final cho H;
    private static final cho I;
    private static final cho J;
    private static final cho K;
    private static final cho L;
    private static final cho M[][][];
    private static final cho N = cho.a(0.75F, 1.0F, -0.25F, 0.0F);
    private static final String c = cbe.getSimpleName();
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final float h[] = {
        0.933F, 0.933F, 0.933F, 1.0F
    };
    private static final float i[] = {
        0.0F, 0.03F, 0.083F, 0.193F, 0.503F, 0.746F, 0.848F, 0.907F, 0.945F, 0.97F, 
        0.986F, 0.995F, 1.0F
    };
    private static final float j[] = {
        0.0F, 0.00232F, 0.01016F, 0.02535F, 0.05078F, 0.09124F, 0.155F, 0.25473F, 0.39316F, 0.53231F, 
        0.64067F, 0.721F, 0.78188F, 0.82926F, 0.86686F, 0.89709F, 0.92154F, 0.94135F, 0.95734F, 0.97011F, 
        0.98015F, 0.98781F, 0.99341F, 0.99718F, 0.99932F, 1.0F
    };
    private static final float k[] = {
        0.0F, 0.30343F, 0.53617F, 0.69031F, 0.78855F, 0.85257F, 0.89572F, 0.92566F, 0.9469F, 0.96218F, 
        0.97326F, 0.98133F, 0.9872F, 0.99143F, 0.99444F, 0.99654F, 0.99797F, 0.9989F, 0.99947F, 0.99979F, 
        0.99994F, 0.99999F, 1.0F
    };
    private static final float l[] = {
        0.0F, 0.00659F, 0.01663F, 0.02981F, 0.04584F, 0.06448F, 0.08549F, 0.10865F, 0.13375F, 0.16061F, 
        0.18904F, 0.21888F, 0.24996F, 0.28212F, 0.31521F, 0.34909F, 0.38362F, 0.41865F, 0.45405F, 0.48967F, 
        0.52539F, 0.56105F, 0.59653F, 0.63167F, 0.66633F, 0.70035F, 0.73359F, 0.76587F, 0.79702F, 0.82686F, 
        0.85518F, 0.88179F, 0.90644F, 0.9289F, 0.94889F, 0.96612F, 0.98024F, 0.99088F, 0.99763F, 1.0F
    };
    private static final cho m;
    private static final cho n;
    private static final cho o;
    private static final cho p;
    private static final cho q;
    private static final cho r;
    private static final cho s[][];
    private static final cho t;
    private static final cho u;
    private static final cho v;
    private static final cho w;
    private static final cho x;
    private static final cho y;
    private static final cho z;
    private Matrix O;
    private cho P;
    private Matrix Q;

    public cbe()
    {
        O = new Matrix();
        P = new cho();
        Q = new Matrix();
    }

    private static cho a(int i1, int j1)
    {
        cho cho1;
        try
        {
            cho1 = B[i1 - 1][j1 - 1];
            c.a(cho1, (new StringBuilder(50)).append("invalid transition from ").append(i1).append(" to ").append(j1).toString(), null);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            throw new IllegalStateException((new StringBuilder(50)).append("invalid transition from ").append(i1).append(" to ").append(j1).toString());
        }
        return cho1;
    }

    private static cho a(int i1, int j1, int k1)
    {
        cho cho1;
        try
        {
            cho1 = M[i1 - 1][j1][k1 - 1];
            c.a(cho1, (new StringBuilder(65)).append("invalid transition from ").append(j1).append(" in ").append(i1).append(" to ").append(k1).toString(), null);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            throw new IllegalStateException((new StringBuilder(65)).append("invalid transition from ").append(j1).append(" in ").append(i1).append(" to ").append(k1).toString());
        }
        return cho1;
    }

    private static cho a(cpz cpz1)
    {
        cho cho1;
        try
        {
            cho1 = s[cpz1.b - 1][cpz1.a];
            String s1 = String.valueOf(cpz1);
            c.a(cho1, (new StringBuilder(String.valueOf(s1).length() + 15)).append("invalid layout ").append(s1).toString(), null);
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            cpz1 = String.valueOf(cpz1);
            throw new IllegalStateException((new StringBuilder(String.valueOf(cpz1).length() + 15)).append("invalid layout ").append(cpz1).toString());
        }
        return cho1;
    }

    private void a(cpz cpz1, cpz cpz2, cba cba1, cho cho1)
    {
        if (!cpz2.a() && !cpz1.a())
        {
            throw new IllegalStateException();
        }
        if (cba1.f == 0 && cpz1.a())
        {
            long l1 = cba1.e / 2L;
            long l2 = l1 - (long)(d / 2);
            if (cba1.d < l2)
            {
                cho1.a(m);
                return;
            }
            long l3 = d / 2;
            if (cba1.d < l1 + l3)
            {
                cho1.a(m, N, b.a((float)(cba1.d - l2) / (float)d, i));
                return;
            }
            if (!cpz2.a() && cba1.m == 0.0F)
            {
                cho1.a(N);
                return;
            }
            if (cpz2.a())
            {
                cpz1 = a(cpz2);
            } else
            {
                cpz1 = a(1, 0, cpz2.b);
            }
            cho1.a(N, cpz1, b.a(cba1.m, i));
            return;
        }
        if (!cpz2.a() && cba1.m == 0.0F)
        {
            cho1.a(a(cpz1));
            return;
        }
        cho cho2;
        if (cpz1.a())
        {
            cho2 = a(cpz1);
        } else
        {
            cho2 = a(cpz1.b, cpz2.b);
        }
        if (cpz2.a())
        {
            cpz1 = a(cpz2);
        } else
        {
            cpz1 = a(cpz1.b, cpz1.a, cpz2.b);
        }
        cho1.a(cho2, cpz1, b.a(cba1.m, i));
    }

    public final long a(cnt cnt1, cnt cnt2)
    {
        return (long)d;
    }

    public final Matrix a(cba cba1, cpy cpy1)
    {
        Matrix matrix = super.a(cba1, cpy1);
        if (cpy1 == null)
        {
            cpy1 = matrix;
        } else
        {
            a(cpy1.c, cpy1.d, cba1, P);
            float f1 = P.a[0];
            float f3 = P.a[5];
            cpy1 = matrix;
            if (f1 != f3)
            {
                O.set(matrix);
                if (f1 > f3)
                {
                    O.postScale(1.0F, f3 / f1, 0.5F, 0.5F);
                } else
                {
                    O.postScale(f1 / f3, 1.0F, 0.5F, 0.5F);
                }
                cpy1 = O;
            }
        }
        if (cba1.a >= (long)f)
        {
            return cpy1;
        } else
        {
            float f2 = b.a((float)cba1.a / (float)f, k);
            Q.set(cpy1);
            f2 = (1.0F - f2) / 1.4F + f2;
            Q.postScale(f2, f2, 0.0F, 0.5F);
            return Q;
        }
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        return new cbf(this, resources.getColor(b.cF), d, f, g, i);
    }

    public final void a(cpy cpy1, cba cba1, cho cho1)
    {
        a(cpy1.c, cpy1.d, cba1, cho1);
    }

    public final int c()
    {
        return e;
    }

    public final boolean d()
    {
        return true;
    }

    public final float[] e()
    {
        return h;
    }

    public final long s(cba cba1)
    {
        if (cba1.e < (long)d)
        {
            Log.w(c, "clipLengthUs < ANIMATION_DURATION_US so the poster frame is after the clip.");
        }
        return cba1.e / 2L + (long)(d / 2);
    }

    public final float v(cba cba1)
    {
        float f1 = -1F;
        if (cba1.a < (long)f)
        {
            f1 = -1F + b.a((float)cba1.a / (float)f, j);
        } else
        if (cba1.i != cnt.d || b.e(cba1))
        {
            boolean flag;
            if (cba1.f == cba1.h - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && cba1.i != cnt.e || !flag && cba1.k == cnt.d)
            {
                long l1 = cba1.e - cba1.d;
                if (l1 > (long)g)
                {
                    return 0.0F;
                } else
                {
                    return -b.a((float)((long)g - l1) / (float)g, l);
                }
            } else
            {
                return 0.0F;
            }
        }
        return f1;
    }

    public final void z(cba cba1)
    {
        if (cba1.f == 0)
        {
            cba1.r = new cod(0L, cba1.e + cba1.o);
            return;
        } else
        {
            cba1.r = cod.a;
            return;
        }
    }

    static 
    {
        d = (int)TimeUnit.MILLISECONDS.toMicros(400L);
        e = (int)TimeUnit.MILLISECONDS.toMicros(270L);
        f = ((int)TimeUnit.SECONDS.toMicros(1L) * 25) / 30;
        g = (int)TimeUnit.MILLISECONDS.toMicros(1300L);
        m = cho.a(1.0F, 1.0F, 0.0F, 0.0F);
        n = cho.a(0.5F, 0.6666667F, -0.5F, 0.0F);
        o = cho.a(0.5F, 0.6666667F, 0.5F, 0.0F);
        p = cho.a(0.3333333F, 0.5F, -0.6666667F, 0.5F);
        q = cho.a(0.3333333F, 0.5F, -0.6666667F, -0.5F);
        r = cho.a(0.6666667F, 1.0F, 0.3333333F, 0.0F);
        cho cho1 = m;
        cho cho2 = n;
        cho cho3 = o;
        cho cho4 = p;
        cho cho5 = q;
        cho cho6 = r;
        s = (new cho[][] {
            new cho[] {
                cho1
            }, new cho[] {
                cho2, cho3
            }, new cho[] {
                cho4, cho5, cho6
            }
        });
        t = cho.a(1.0F, 1.0F, 2.0F, 0.0F);
        u = cho.a(0.5F, 0.6666667F, 1.5F, 0.0F);
        v = cho.a(1.0F, 1.0F, 2.0F, 0.0F);
        w = cho.a(1.0F, 1.0F, 2.0F, 0.0F);
        x = cho.a(0.5F, 0.6666667F, 1.5F, 0.0F);
        y = cho.a(1.0F, 1.0F, 2.0F, 0.0F);
        z = cho.a(0.5F, 0.6666667F, 1.5F, 0.0F);
        A = cho.a(1.0F, 1.0F, 2.0F, 0.0F);
        cho acho[] = {
            t, w
        };
        cho1 = u;
        cho2 = x;
        cho3 = z;
        cho4 = v;
        cho5 = y;
        cho6 = A;
        B = (new cho[][] {
            acho, new cho[] {
                cho1, cho2, cho3
            }, new cho[] {
                cho4, cho5, cho6
            }
        });
        C = cho.a(1.0F, 1.0F, -2F, 0.0F);
        D = cho.a(0.5F, 1.0F, -2.5F, 0.0F);
        E = cho.a(0.5F, 0.6666667F, -1.5F, 0.0F);
        F = cho.a(0.5F, 1.0F, -1.5F, 0.0F);
        G = cho.a(0.3333333F, 0.5F, -2.666667F, 0.5F);
        H = cho.a(0.3333333F, 0.3333333F, -1.333333F, 0.3333333F);
        I = cho.a(0.3333333F, 0.5F, -2.666667F, 0.5F);
        J = cho.a(0.3333333F, 0.5F, -2.666667F, -0.5F);
        K = cho.a(0.3333333F, 0.3333333F, -1.333333F, -0.3333333F);
        L = cho.a(0.6666667F, 1.0F, -1.666667F, 0.0F);
        M = (new cho[][][] {
            new cho[][] {
                new cho[] {
                    C
                }
            }, new cho[][] {
                new cho[] {
                    D, E
                }, new cho[] {
                    F
                }
            }, new cho[][] {
                new cho[] {
                    G, H, I
                }, new cho[] {
                    J, K
                }, new cho[] {
                    L
                }
            }
        });
    }
}
