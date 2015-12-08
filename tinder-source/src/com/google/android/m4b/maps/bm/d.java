// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import android.content.res.Resources;
import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bn.f;
import com.google.android.m4b.maps.bn.j;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.af;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;

// Referenced classes of package com.google.android.m4b.maps.bm:
//            a, k, m, g

public final class d
{

    private static final AtomicLong J = new AtomicLong(0L);
    private static final Map L = ax.b();
    public final a A;
    public final j B;
    public com.google.android.m4b.maps.bm.k C;
    private final int D[];
    private int E;
    private int F[];
    private int G;
    private final com.google.android.m4b.maps.cf.g H;
    private final m I;
    private final long K;
    public final GL10 a;
    public af b;
    public final com.google.android.m4b.maps.bm.g c;
    public int d;
    Integer e;
    public Integer f;
    public final boolean g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public final int m;
    public boolean n;
    public final int o;
    public final com.google.android.m4b.maps.bn.g p;
    public final f q;
    public final k r;
    public final k s;
    public final k t;
    public final k u;
    public final k v;
    public final float w[];
    public final float x[];
    public final g y;
    public final g z;

    public d(GL10 gl10, com.google.android.m4b.maps.bm.g g1, af af1, com.google.android.m4b.maps.cf.g g2, Resources resources)
    {
        k = true;
        l = true;
        n = false;
        p = new com.google.android.m4b.maps.bn.i.a(new int[] {
            0, 0, 0, 0x10000, 0x10000, 0, 0x10000, 0x10000
        });
        q = new com.google.android.m4b.maps.bn.f.a(new float[] {
            -1F, 1.0F, 0.0F, 0.0F, 0.0F, -1F, -1F, 0.0F, 0.0F, 1.0F, 
            1.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, -1F, 0.0F, 1.0F, 1.0F
        });
        r = new com.google.android.m4b.maps.bn.m.a(new int[] {
            0, 0x10000, 0, 0, 0, 0, 0x10000, 0x10000, 0, 0x10000, 
            0, 0
        });
        s = new com.google.android.m4b.maps.bn.m.a(new int[] {
            0, 0, 0x10000, 0, 0, 0, 0x10000, 0, 0x10000, 0x10000, 
            0, 0
        });
        t = new com.google.android.m4b.maps.bn.m.a(new int[] {
            0xffff0000, 0x10000, 0, 0xffff0000, 0xffff0000, 0, 0x10000, 0x10000, 0, 0x10000, 
            0xffff0000, 0
        });
        u = new com.google.android.m4b.maps.bn.m.a(new int[] {
            0xffff0000, 0, 0x10000, 0xffff0000, 0, 0xffff0000, 0x10000, 0, 0x10000, 0x10000, 
            0, 0xffff0000
        });
        v = new com.google.android.m4b.maps.bn.m.a(new int[] {
            0, 0x10000, 0, 0, 0, 0, 0x10000, 0, 0, 0x10000, 
            0x10000, 0
        });
        w = new float[8];
        x = new float[4];
        y = new g();
        z = new g();
        A = new a();
        B = new j();
        K = J.getAndIncrement();
        a = gl10;
        b = af1;
        c = g1;
        H = g2;
        I = null;
        a.glDisable(3024);
        a.glEnable(2884);
        a.glDisable(2929);
        a.glDisable(2960);
        a.glCullFace(1029);
        a.glFrontFace(2305);
        a.glShadeModel(7425);
        a.glHint(3152, 4354);
        d = 0;
        D = new int[256];
        E = 0;
        F = new int[32];
        G = 0;
        boolean flag;
        if ((gl10 instanceof GL11) && gl10.glGetString(7938).contains("1.1"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        g1 = new int[1];
        gl10.glGetIntegerv(3415, g1, 0);
        m = g1[0];
        gl10.glGetIntegerv(3410, g1, 0);
        gl10.glGetIntegerv(3411, g1, 0);
        gl10.glGetIntegerv(3412, g1, 0);
        gl10.glGetIntegerv(3413, g1, 0);
        gl10.glGetIntegerv(3414, g1, 0);
        gl10.glGetIntegerv(3379, g1, 0);
        o = g1[0];
        synchronized (L)
        {
            L.put(Long.valueOf(K), new WeakReference(this));
        }
        if (resources != null)
        {
            C = new com.google.android.m4b.maps.bm.k(resources, this);
        }
        return;
        g1;
        gl10;
        JVM INSTR monitorexit ;
        throw g1;
    }

    public static long a(d d1)
    {
        if (d1 == null)
        {
            return -1L;
        } else
        {
            return d1.K;
        }
    }

    public static d a(long l1)
    {
        Map map = L;
        map;
        JVM INSTR monitorenter ;
        Object obj = (WeakReference)L.get(Long.valueOf(l1));
        if (obj == null) goto _L2; else goto _L1
_L1:
        d d1 = (d)((WeakReference) (obj)).get();
        obj = d1;
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        L.remove(Long.valueOf(l1));
        obj = d1;
_L4:
        map;
        JVM INSTR monitorexit ;
        return ((d) (obj));
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        if ((d & 8) == 0)
        {
            a.glEnableClientState(32886);
            a(8, true);
        }
    }

    public final void a(int i1, boolean flag)
    {
        if (flag)
        {
            d = d | i1;
            int ai[] = D;
            int j1 = E;
            E = j1 + 1;
            ai[j1] = i1;
            return;
        } else
        {
            d = d & ~i1;
            int ai1[] = D;
            int k1 = E;
            E = k1 + 1;
            ai1[k1] = 0x40000000 | i1;
            return;
        }
    }

    public final boolean a(int i1)
    {
        af af1 = b;
        i1 = af1.b + i1;
        if (af1.b == 0 || i1 <= 35000)
        {
            af1.b = i1;
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            h = true;
            return false;
        } else
        {
            return true;
        }
    }

    public final void b()
    {
        if ((d & 8) != 0)
        {
            a.glDisableClientState(32886);
            a(8, false);
        }
    }

    public final void b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        int ai1[];
        int j1;
        if (G == F.length)
        {
            int ai[] = new int[F.length * 2];
            System.arraycopy(F, 0, ai, 0, F.length);
            F = ai;
        }
        ai1 = F;
        j1 = G;
        G = j1 + 1;
        ai1[j1] = i1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        if ((d & 2) == 0)
        {
            a.glEnable(3553);
            a.glEnableClientState(32888);
            a(2, true);
        }
    }

    public final void d()
    {
        if ((d & 0x80) == 0)
        {
            l = true;
            a.glEnable(2960);
            a(128, true);
        }
    }

    public final void e()
    {
        if ((d & 0x80) != 0)
        {
            a.glDisable(2960);
            a(128, false);
        }
    }

    public final void f()
    {
        int ai[] = D;
        int i1 = E;
        E = i1 + 1;
        ai[i1] = 0x7fffffff;
    }

    public final void g()
    {
_L10:
        boolean flag;
        int j1;
        int i1 = E - 1;
        E = i1;
        if (i1 < 0 || D[E] == 0x7fffffff)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        if ((D[E] & 0x40000000) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = D[E] & 0x3fffffff;
        j1;
        JVM INSTR lookupswitch 8: default 140
    //                   1: 202
    //                   2: 236
    //                   4: 294
    //                   8: 328
    //                   16: 360
    //                   32: 394
    //                   64: 428
    //                   128: 462;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (ab.a("GLState", 6))
        {
            Log.e("GLState", (new StringBuilder(38)).append("Unknown graphics state op: ").append(j1).toString());
        }
_L11:
        if (flag)
        {
            d = d | j1;
        } else
        {
            d = d & ~j1;
        }
        if (true) goto _L10; else goto _L2
_L2:
        if (flag)
        {
            a.glEnableClientState(32884);
        } else
        {
            a.glDisableClientState(32884);
        }
          goto _L11
_L3:
        if (flag)
        {
            a.glEnable(3553);
            a.glEnableClientState(32888);
        } else
        {
            a.glDisable(3553);
            a.glDisableClientState(32888);
        }
          goto _L11
_L4:
        if (flag)
        {
            a.glEnable(3042);
        } else
        {
            a.glDisable(3042);
        }
          goto _L11
_L5:
        if (flag)
        {
            a.glEnableClientState(32886);
        } else
        {
            a.glDisableClientState(32886);
        }
          goto _L11
_L6:
        if (flag)
        {
            a.glEnable(3024);
        } else
        {
            a.glDisable(3024);
        }
          goto _L11
_L7:
        if (flag)
        {
            a.glEnable(2929);
        } else
        {
            a.glDisable(2929);
        }
          goto _L11
_L8:
        if (flag)
        {
            a.glEnable(32823);
        } else
        {
            a.glDisable(32823);
        }
          goto _L11
_L9:
        if (flag)
        {
            a.glEnable(2960);
        } else
        {
            a.glDisable(2960);
        }
          goto _L11
    }

    public final void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (G > 0)
        {
            a.glDeleteTextures(G, F, 0);
            G = 0;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
