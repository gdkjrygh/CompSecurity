// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.content.Context;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.videolib.gl.e;
import com.roidapp.videolib.gl.f;
import com.roidapp.videolib.gl.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.co.cyberagent.android.a.a.a;
import jp.co.cyberagent.android.a.ad;
import jp.co.cyberagent.android.a.an;
import jp.co.cyberagent.android.a.b;
import jp.co.cyberagent.android.a.c;
import jp.co.cyberagent.android.a.h;
import jp.co.cyberagent.android.a.k;
import jp.co.cyberagent.android.a.n;
import jp.co.cyberagent.android.a.r;

// Referenced classes of package com.roidapp.videolib.b:
//            u, o, y, h, 
//            c, b, n, g, 
//            f, p, q, r, 
//            s, t, l

public final class m
{

    private static ByteBuffer v[] = null;
    private int A;
    private int B;
    private com.roidapp.videolib.b.h C;
    private com.roidapp.videolib.b.h D;
    private int E[];
    private int F[];
    private int G[];
    private int H[];
    private float I[] = {
        0.0F, 0.0F, 0.0F, 0.0F
    };
    private float J[] = {
        1.0F, 1.0F
    };
    private float K[];
    private IFilterInfo L;
    private ArrayList M;
    private ArrayList N;
    private n O;
    private boolean P;
    private y Q;
    private int R;
    private boolean S;
    private int T;
    private u U[];
    private String V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    protected final FloatBuffer a;
    private int aa[];
    private int ab;
    private e ac;
    private e ad[];
    private int ae;
    private int af;
    private long ag;
    private int ah;
    protected final FloatBuffer b;
    protected final FloatBuffer c;
    protected final FloatBuffer d;
    public int e;
    long f;
    long g;
    long h;
    private Context i;
    private u j;
    private long k;
    private com.roidapp.videolib.b.c l;
    private h m;
    private h n;
    private h o;
    private h p;
    private h q;
    private h r;
    private f s;
    private int t;
    private long u;
    private int w;
    private int x;
    private int y;
    private int z;

    public m(Context context)
    {
        j = com.roidapp.videolib.b.u.a;
        k = 1000L;
        t = 0;
        u = 0L;
        w = -1;
        x = -1;
        y = -1;
        z = -1;
        A = -1;
        B = -1;
        C = null;
        D = null;
        E = null;
        F = null;
        G = null;
        H = null;
        K = null;
        L = null;
        M = new ArrayList();
        N = new ArrayList();
        P = false;
        Q = null;
        R = 100;
        S = false;
        T = 10;
        U = null;
        V = getClass().getSimpleName();
        W = false;
        X = false;
        Y = true;
        Z = false;
        aa = null;
        ab = -1;
        ac = new o(this);
        e = -1;
        ad = null;
        ae = 0;
        af = 0;
        ag = 0L;
        f = 0L;
        g = 0L;
        h = 0L;
        ah = 0;
        i = context;
        Q = new y(context);
        a = ByteBuffer.allocateDirect(g.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        a.put(g.a).position(0);
        b = ByteBuffer.allocateDirect(a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        b.put(a.a).position(0);
        context = jp.co.cyberagent.android.a.a.a.a(an.a, false, true);
        c = ByteBuffer.allocateDirect(context.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        c.put(context).position(0);
        d = ByteBuffer.allocateDirect(a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        d.put(a.a).position(0);
    }

    static int a(m m1, int i1)
    {
        m1.z = i1;
        return i1;
    }

    static f a(m m1)
    {
        return m1.s;
    }

    static float[] a(m m1, float af1[])
    {
        m1.K = af1;
        return af1;
    }

    static ByteBuffer[] a(ByteBuffer abytebuffer[])
    {
        v = abytebuffer;
        return abytebuffer;
    }

    static int b(m m1, int i1)
    {
        m1.A = i1;
        return i1;
    }

    static long b(m m1)
    {
        return m1.ag;
    }

    static int c(m m1, int i1)
    {
        m1.B = i1;
        return i1;
    }

    static String c(m m1)
    {
        return m1.V;
    }

    static int d(m m1)
    {
        return m1.ab;
    }

    static int d(m m1, int i1)
    {
        m1.w = i1;
        return i1;
    }

    static int e(m m1)
    {
        return m1.t;
    }

    static int e(m m1, int i1)
    {
        m1.y = i1;
        return i1;
    }

    static boolean f(m m1)
    {
        return m1.S;
    }

    static boolean g(m m1)
    {
        m1.P = true;
        return true;
    }

    static int h(m m1)
    {
        return m1.z;
    }

    static ByteBuffer[] h()
    {
        return v;
    }

    private void i()
    {
        if (e != t && S || P)
        {
            if (D == null)
            {
                k();
                D = new com.roidapp.videolib.b.h();
                D.a(N);
                D.r_();
                D.h();
                D.a(ae, af);
            } else
            {
                D.a(N);
                D.a(ae, af);
            }
            if (D != null && G != null)
            {
                D.a(G[0]);
                Log.e(V, "updateImageTextures role onDraw ");
                d.clear();
                if (K != null)
                {
                    d.put(K).position(0);
                }
                D.a(aa[0], a, d, null);
                x = H[0];
            }
            e = t;
            P = false;
        }
    }

    static int[] i(m m1)
    {
        return m1.aa;
    }

    static int j(m m1)
    {
        return m1.A;
    }

    private void j()
    {
        if (E == null && af != 0 && ae != 0)
        {
            Log.e(V, "initImageProcess");
            E = new int[3];
            F = new int[3];
            int i1 = 0;
            while (i1 < E.length) 
            {
                GLES20.glGenFramebuffers(1, E, i1);
                GLES20.glGenTextures(1, F, i1);
                Log.e(V, (new StringBuilder("initImageProcess mProcessTargetFrameBuffers ")).append(i1).append(":").append(E[i1]).append(", texture:").append(F[i1]).append("mViewWidth:").append(ae).append(",mViewHeight:").append(af).toString());
                if (F[i1] == -1)
                {
                    GLES20.glGenTextures(1, F, i1);
                }
                Log.e(V, (new StringBuilder("initImageProcess mProcessTargetFrameBuffers ")).append(i1).append(":").append(E[i1]).append(", texture:").append(F[i1]).toString());
                if (F[i1] == -1)
                {
                    Log.e("OpenglError", "G:opengl can't allocate texture.....");
                }
                GLES20.glBindTexture(3553, F[i1]);
                GLES20.glTexImage2D(3553, 0, 6408, ae, af, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, 10240, 9729F);
                GLES20.glTexParameterf(3553, 10241, 9729F);
                GLES20.glTexParameterf(3553, 10242, 33071F);
                GLES20.glTexParameterf(3553, 10243, 33071F);
                GLES20.glBindFramebuffer(36160, E[i1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, F[i1], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                i1++;
            }
        }
    }

    static int k(m m1)
    {
        return m1.B;
    }

    private void k()
    {
        if (G == null && af != 0 && ae != 0)
        {
            G = new int[1];
            H = new int[1];
            int i1 = 0;
            while (i1 < G.length) 
            {
                GLES20.glGenFramebuffers(1, G, i1);
                GLES20.glGenTextures(1, H, i1);
                Log.e(V, (new StringBuilder("initImageProcess mProcessBlurTargetFrameBuffers ")).append(i1).append(":").append(G[i1]).append(", texture:").append(H[i1]).append("mViewWidth:").append(ae).append(",mViewHeight:").append(af).toString());
                if (H[i1] == -1)
                {
                    GLES20.glGenTextures(1, H, i1);
                }
                Log.e(V, (new StringBuilder("initImageProcess mProcessTargetFrameBuffers ")).append(i1).append(":").append(G[i1]).append(", texture:").append(H[i1]).toString());
                if (F[i1] == -1)
                {
                    Log.e("OpenglError", "G:opengl can't allocate texture.....");
                }
                GLES20.glBindTexture(3553, H[i1]);
                GLES20.glTexImage2D(3553, 0, 6408, ae, af, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, 10240, 9729F);
                GLES20.glTexParameterf(3553, 10241, 9729F);
                GLES20.glTexParameterf(3553, 10242, 33071F);
                GLES20.glTexParameterf(3553, 10243, 33071F);
                GLES20.glBindFramebuffer(36160, G[i1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, H[i1], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                i1++;
            }
        }
    }

    static int l(m m1)
    {
        return m1.x;
    }

    static int m(m m1)
    {
        return m1.w;
    }

    static int n(m m1)
    {
        return m1.y;
    }

    public final int a(long l1)
    {
        if (l != null)
        {
            return l.a(l1, true);
        } else
        {
            return 0;
        }
    }

    public final long a(int i1)
    {
        if (l != null)
        {
            return l.a(i1);
        } else
        {
            return 0L;
        }
    }

    public final long a(int i1, FloatBuffer floatbuffer, FloatBuffer floatbuffer1, long l1)
    {
        int j1;
        SystemClock.uptimeMillis();
        long l2 = l1;
        if (ah != 1)
        {
            l2 = l1;
            if (l.g() > 0)
            {
                if (s.i())
                {
                    l2 = s.c();
                } else
                {
                    l2 = s.a();
                }
                l1 = Math.min(l1, l2);
                l2 = l1;
                if (l1 == ag)
                {
                    l2 = Math.min(ag + 12L, 66L + l1);
                }
            }
        }
        ag = l2;
        Log.e(V, "onDraw updateMVFilter");
        a();
        Log.e(V, "onDraw updateCurrentDataProviderIdx");
        l1 = ag;
        j1 = l.a(l1, false);
        if (j1 < s.d() && j1 >= 0)
        {
            t = j1;
        }
        Log.e(V, "onDraw updateImageTextures");
        j1 = 0;
_L9:
        if (j1 >= ad.length) goto _L2; else goto _L1
_L1:
        if (!ad[j1].d() && !X) goto _L4; else goto _L3
_L3:
        if (j1 != 0) goto _L6; else goto _L5
_L5:
        aa[0] = z;
_L7:
        Log.e(V, (new StringBuilder("updateImageTextures ")).append(j1).append(":").append(aa[j1]).toString());
        if (L != null && L.a() != 0 && C != null && aa[j1] != -1 && E != null)
        {
            ab = aa[j1];
            Log.e(V, (new StringBuilder("updateImageTextures role Target ")).append(j1).append(":").append(E[j1]).toString());
            C.a(E[j1]);
            Log.e(V, "updateImageTextures role onDraw ");
            C.a(aa[j1], a, c, null);
            Log.e(V, (new StringBuilder("updateImageTextures role onDraw end:target texture: ")).append(F[j1]).toString());
            aa[j1] = F[j1];
        }
_L4:
        j1++;
        continue; /* Loop/switch isn't completed */
_L6:
        if (j1 == 1)
        {
            aa[1] = A;
        } else
        if (j1 == 2)
        {
            aa[2] = B;
        }
        if (true) goto _L7; else goto _L2
_L2:
        X = false;
        i();
        SystemClock.uptimeMillis();
        if (l != null)
        {
            m = l.a(ag);
        }
        f = SystemClock.uptimeMillis();
        Log.e(V, "onDraw onDraw");
        m.a(i1, floatbuffer, floatbuffer1, I);
        f = SystemClock.uptimeMillis() - f;
        g = g + f;
        h = h + 1L;
        com.roidapp.videolib.gl.g.a("onDraw");
        return ag;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a()
    {
        boolean flag = false;
        if (s.g() == j && u == (long)s.c()) goto _L2; else goto _L1
_L1:
        int i1 = 1;
_L10:
        if (i1 != 0)
        {
            if (l != null)
            {
                l.h();
            }
            l = null;
            j = s.g();
            u = s.c();
            t = 0;
        }
        if (l != null) goto _L4; else goto _L3
_L3:
        Object obj;
        Context context;
        obj = j;
        context = i;
        com.roidapp.videolib.b.b.a[((u) (obj)).ordinal()];
        JVM INSTR tableswitch 1 2: default 140
    //                   1 888
    //                   2 900;
           goto _L5 _L6 _L7
_L5:
        obj = new com.roidapp.videolib.b.c(context);
_L8:
        l = ((com.roidapp.videolib.b.c) (obj));
        l.a(new com.roidapp.videolib.b.n(this));
        if (j == com.roidapp.videolib.b.u.c)
        {
            I[0] = 1.0F;
            I[1] = 1.0F;
            I[2] = 1.0F;
            I[3] = 0.0F;
        } else
        {
            I[0] = 0.0F;
            I[1] = 0.0F;
            I[2] = 0.0F;
            I[3] = 0.0F;
        }
        l.b(q);
        l.a(new h[] {
            o, p
        });
        l.a(n);
        if (s.e() != null)
        {
            W = true;
            l.c(r);
        } else
        {
            W = false;
        }
        l.a(j);
        l.b(s.d());
        l.b(s.c());
        U = s.h();
        l.a(U);
        l.e();
        a(ae, af);
          goto _L4
_L2:
        if (W && s.e() == null)
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (!W && s.e() != null)
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        obj = s.h();
        if (obj == null && U != null || obj != null && U == null)
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (U != null && obj != null)
        {
            if (U.length != obj.length)
            {
                i1 = 1;
                continue; /* Loop/switch isn't completed */
            }
            i1 = 0;
            do
            {
                if (i1 >= U.length)
                {
                    break;
                }
                if (U[i1] != obj[i1])
                {
                    i1 = 1;
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            } while (true);
        }
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new com.roidapp.videolib.b.g(context);
          goto _L8
_L7:
        obj = new com.roidapp.videolib.b.f(context);
          goto _L8
_L4:
        j();
        if (L == null && s.j() != null)
        {
            i1 = 1;
        } else
        if (L != null && s.j() == null)
        {
            i1 = 1;
        } else
        if ((L != null || s.j() != null) && (L.a() != s.j().a() || (s.j() instanceof CloudFilterInfo) && L != s.j()))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            Log.e(V, "update MV filter, needUpdateEffectFilters");
            X = true;
            if (S)
            {
                P = true;
            }
            if (C != null)
            {
                C.i();
            }
            com.roidapp.videolib.gl.g.a("destroy mImageTextureProcessRoler");
            C = null;
            L = s.j();
            M.clear();
            if (C != null)
            {
                C.i();
            }
            C = null;
            if (L != null && L.a() != 0)
            {
                if (L instanceof CloudFilterInfo)
                {
                    M.addAll(Q.a((CloudFilterInfo)L, ae, af));
                } else
                {
                    M.addAll(Q.a(L.a(), ae, af));
                }
                com.roidapp.videolib.gl.g.a("addAll mImageTextureProcessRoler");
                Log.e(V, (new StringBuilder("update MV filter, GPUImageProcessRoler init:")).append(ae).append(",").append(af).toString());
                j();
                com.roidapp.videolib.gl.g.a("initImageProcess");
                C = new com.roidapp.videolib.b.h();
                com.roidapp.videolib.gl.g.a("GPUImageProcessRoler");
                C.a(M);
                com.roidapp.videolib.gl.g.a("GPUImageProcessRoler setFilters");
                C.h();
                com.roidapp.videolib.gl.g.a("GPUImageProcessRoler init");
                GLES20.glUseProgram(C.p());
                com.roidapp.videolib.gl.g.a("GPUImageProcessRoler glUseProgram");
                C.a(ae, af);
                com.roidapp.videolib.gl.g.a("GPUImageProcessRoler onOutputSizeChanged");
                i1 = 0;
                while (i1 < M.size()) 
                {
                    obj = (h)M.get(i1);
                    if (obj instanceof jp.co.cyberagent.android.a.f)
                    {
                        ((h) (obj)).a(ac);
                    } else
                    if (obj instanceof ad)
                    {
                        obj = (k)obj;
                        if (((k) (obj)).q() != null && ((k) (obj)).q().size() > 0)
                        {
                            obj = ((k) (obj)).q().iterator();
                            while (((Iterator) (obj)).hasNext()) 
                            {
                                h h1 = (h)((Iterator) (obj)).next();
                                if (h1 instanceof jp.co.cyberagent.android.a.f)
                                {
                                    h1.a(ac);
                                }
                            }
                        }
                    } else
                    if (obj instanceof b)
                    {
                        ((h) (obj)).a(ac);
                    }
                    i1++;
                }
            }
        }
        if (R != s.k() || X)
        {
            Log.e(V, (new StringBuilder("update MV filter, mAlphaProgress:")).append(R).toString());
            R = s.k();
            if (M != null && M.size() > 0)
            {
                for (int j1 = ((flag) ? 1 : 0); j1 < M.size(); j1++)
                {
                    if (M.get(j1) instanceof b)
                    {
                        b b1 = (b)M.get(j1);
                        Log.e(V, (new StringBuilder("update MV filter i")).append(j1).append(", mAlphaProgress:").append(R).toString());
                        b1.a(com.roidapp.videolib.b.y.a(R));
                    }
                }

            }
            X = true;
        }
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void a(float f1)
    {
        if (n != null)
        {
            n.f(f1);
        }
        if (o != null)
        {
            o.f(f1);
        }
        if (p != null)
        {
            p.f(f1);
        }
    }

    public final void a(int i1, int j1)
    {
        Log.e(V, (new StringBuilder("onViewSizeChanged:")).append(i1).append(",").append(j1).toString());
        ae = i1;
        af = j1;
        if (l != null && ae != 0 && af != 0)
        {
            l.a(ae, af);
        }
        if (C != null && j1 != 0 && i1 != 0)
        {
            C.a(ae, af);
        }
        if (D != null && j1 != 0 && i1 != 0)
        {
            D.a(ae, af);
        }
        X = true;
    }

    public final void a(int i1, boolean flag)
    {
        S = flag;
        if (i1 != -1)
        {
            T = i1;
        }
        if (S)
        {
            if (N != null && N.size() > 0)
            {
                n n1 = (n)N.get(0);
                n1.a(T);
                N.set(0, n1);
            }
            P = true;
            return;
        } else
        {
            P = false;
            return;
        }
    }

    public final void a(f f1)
    {
        s = f1;
    }

    public final void b()
    {
        if (Z)
        {
            return;
        } else
        {
            Log.e(V, "init");
            j();
            k();
            aa = new int[3];
            ad = new e[aa.length];
            n = new r();
            ad[0] = new p(this);
            n.a(ad[0]);
            o = new r();
            ad[1] = new q(this);
            o.a(ad[1]);
            p = new r();
            ad[2] = new com.roidapp.videolib.b.r(this);
            p.a(ad[2]);
            q = new c();
            q.a(new s(this));
            r = new r();
            r.a(new t(this));
            q.h();
            n.h();
            o.h();
            p.h();
            r.h();
            a();
            O = new n(T);
            N.clear();
            N.add(O);
            Z = true;
            return;
        }
    }

    public final void b(int i1)
    {
        ah = i1;
    }

    public final void c()
    {
        f();
        s = null;
    }

    public final boolean d()
    {
        return (t >= s.d() - 1 || l.q != null) && ag >= (long)s.c() && (s.i() || l.g() == 0);
    }

    public final long e()
    {
        if (s == null || s.d() == 0)
        {
            return 15000L;
        }
        if (s.c() > 3000)
        {
            return (long)((s.c() - 1000) / s.d());
        } else
        {
            return (long)(s.c() / s.d());
        }
    }

    public final void f()
    {
        Log.e(V, "photoMV reset");
        if (l != null)
        {
            l.h();
            l = null;
        }
        if (r != null)
        {
            r.i();
            r = null;
        }
        if (n != null)
        {
            n.i();
            n = null;
        }
        if (q != null)
        {
            q.i();
            q = null;
        }
        if (o != null)
        {
            o.i();
            o = null;
        }
        if (p != null)
        {
            p.i();
            p = null;
        }
        if (z != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                z
            }, 0);
            z = -1;
        }
        if (y != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                y
            }, 0);
            y = -1;
        }
        if (A != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                A
            }, 0);
            A = -1;
        }
        if (B != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                B
            }, 0);
            B = -1;
        }
        if (w != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                w
            }, 0);
            w = -1;
        }
        if (x != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                x
            }, 0);
            x = -1;
        }
        if (C != null)
        {
            C.i();
            C = null;
        }
        if (D != null)
        {
            D.i();
            D = null;
        }
        if (O != null)
        {
            O.i();
            O = null;
        }
        L = null;
        M.clear();
        Log.e(V, "deInitImageProcess");
        if (F != null)
        {
            GLES20.glDeleteTextures(F.length, F, 0);
            F = null;
        }
        if (E != null)
        {
            GLES20.glDeleteFramebuffers(E.length, E, 0);
            E = null;
        }
        if (H != null)
        {
            GLES20.glDeleteTextures(H.length, H, 0);
            H = null;
        }
        if (G != null)
        {
            GLES20.glDeleteFramebuffers(G.length, G, 0);
            G = null;
        }
        aa = null;
        ad = null;
        j = com.roidapp.videolib.b.u.a;
        ag = 0L;
        t = 0;
        Z = false;
        Log.e(V, "photoMV reset out");
    }

    protected final void finalize()
    {
        c();
        super.finalize();
    }

    public final int g()
    {
        int j1;
        boolean flag;
        flag = false;
        j1 = 0;
        if (l != null) goto _L2; else goto _L1
_L1:
        j1 = -1;
_L4:
        return j1;
_L2:
        l al[];
        int i1;
        i1 = l.a(ag, true);
        if (-1 != i1)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        al = l.q;
        if (al == null) goto _L4; else goto _L3
_L3:
        j1 = 0;
_L9:
        if (j1 >= al.length) goto _L6; else goto _L5
_L5:
        if (ag >= al[j1].b) goto _L8; else goto _L7
_L7:
        if (j1 == 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = j1 - 1;
        }
_L6:
        j1 = i1;
        if (i1 == -1)
        {
            j1 = al.length - 1;
        }
_L10:
        return j1;
_L8:
        j1++;
          goto _L9
        j1 = i1;
          goto _L10
    }

}
