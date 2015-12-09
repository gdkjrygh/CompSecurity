// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.b.a;
import com.nuance.dragon.toolkit.audio.f;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.k;
import com.nuance.dragon.toolkit.d.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.nuance.b.b:
//            er, eq, ep

class eo extends a
{

    static final boolean c;
    private int A;
    private HandlerThread B;
    private Handler C;
    private boolean D;
    final Runnable b = new er(this);
    private AudioTrack d;
    private final int e;
    private int f;
    private int g;
    private boolean h;
    private final LinkedList i = new LinkedList();
    private int j;
    private boolean k;
    private boolean l;
    private Handler m;
    private int n;
    private long o;
    private final int p = 400;
    private int q;
    private boolean r;
    private final ArrayList s = new ArrayList();
    private final k t;
    private final LinkedList u = new LinkedList();
    private final int v = 50;
    private int w;
    private int x;
    private long y;
    private int z;

    eo(int i1, com.nuance.dragon.toolkit.audio.e e1, k k1)
    {
        boolean flag = false;
        super(e1);
        h = false;
        A = 0;
        D = false;
        if (k1 != null)
        {
            flag = true;
        }
        a("audioEnergyListener", "not null", flag);
        e = i1;
        t = k1;
    }

    private static float a(long l1)
    {
        double d1;
        double d2;
        d1 = 0.0D;
        d2 = (double)l1 / 1073741824D;
        if (d2 >= 1.0000000000000001E-09D) goto _L2; else goto _L1
_L1:
        d1 = -90D;
_L4:
        return (float)d1 + 90F;
_L2:
        d2 = Math.log10(d2) * 10D;
        if (d2 <= 0.0D)
        {
            d1 = d2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static int a(int i1, int j1)
    {
        return (i1 * 2 * j1) / 1000;
    }

    private static long a(long l1, short aword0[], int i1, int j1)
    {
        for (int k1 = i1; k1 < i1 + j1; k1++)
        {
            long l2 = aword0[k1];
            l1 += l2 * l2 >> 9;
        }

        return l1;
    }

    private static void a(String s1, String s2, boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s1).append(" must be ").append(s2).toString());
        } else
        {
            return;
        }
    }

    static boolean a(eo eo1)
    {
        return eo1.h;
    }

    static boolean a(eo eo1, boolean flag)
    {
        eo1.D = flag;
        return flag;
    }

    private static short[] a(short aword0[], int i1, int j1)
    {
        int k1 = j1;
        if (i1 + j1 > aword0.length)
        {
            k1 = aword0.length - i1;
        }
        short aword1[] = new short[k1];
        System.arraycopy(aword0, i1, aword1, 0, k1);
        return aword1;
    }

    static boolean b(eo eo1)
    {
        eo1.k = true;
        return true;
    }

    static int c(eo eo1)
    {
        Object obj;
        int j1;
        if (!eo1.k)
        {
            return 0;
        }
        int i1;
        if (eo1.r)
        {
            if (eo1.d.getPlaybackHeadPosition() >= eo1.n)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                eo1.r = false;
                com.nuance.dragon.toolkit.d.e.c(eo1, "Player stalled");
            }
        }
        i1 = eo1.g;
        j1 = 0;
        obj = new ArrayList();
        while (i1 > 0 && !eo1.i.isEmpty()) 
        {
            g g1 = (g)eo1.i.getFirst();
            int k1 = g1.c.length - eo1.j;
            if (k1 > i1)
            {
                k1 = i1;
            }
            int i2 = eo1.d.write(g1.c, eo1.j, k1);
            if (i2 < 0)
            {
                eo1.j = 0;
                eo1.i.removeFirst();
                i1 = 0;
            } else
            {
                int l1 = j1;
                if (i2 > 0)
                {
                    if (!eo1.r && eo1.q != eo1.d.getPlaybackHeadPosition())
                    {
                        l1 = eo1.q;
                        eo1.r = true;
                        eo1.o = SystemClock.uptimeMillis() - (long)eo1.e().a(eo1.d.getPlaybackHeadPosition() - eo1.q);
                        for (Iterator iterator = eo1.s.iterator(); iterator.hasNext();)
                        {
                            g g3 = (g)iterator.next();
                            long l2 = eo1.o;
                            long l4 = eo1.e().a(l1);
                            ((ArrayList) (obj)).add(new g(eo1.e(), g3.c, l4 + l2, g3.h));
                            l1 = g3.c.length + l1;
                        }

                        eo1.s.clear();
                        if (!c && l1 != eo1.n)
                        {
                            throw new AssertionError();
                        }
                        com.nuance.dragon.toolkit.d.e.c(eo1, "Player unstalled");
                    }
                    if (eo1.r)
                    {
                        long l3 = eo1.o;
                        long l5 = eo1.e().a(eo1.n);
                        ((ArrayList) (obj)).add(new g(eo1.e(), a(g1.c, eo1.j, i2), l5 + l3, g1.h));
                    } else
                    {
                        g g2 = new g(eo1.e(), a(g1.c, eo1.j, i2), g1.h);
                        eo1.s.add(g2);
                    }
                    l1 = j1 + i2;
                    eo1.n = eo1.n + i2;
                }
                if (i2 < k1)
                {
                    i1 = 0;
                } else
                {
                    i1 -= i2;
                }
                if (eo1.j + i2 < g1.c.length)
                {
                    eo1.j = eo1.j + i2;
                    j1 = l1;
                } else
                {
                    eo1.i.removeFirst();
                    eo1.j = 0;
                    j1 = l1;
                }
            }
        }
        if (!((ArrayList) (obj)).isEmpty())
        {
            eo1.b(((List) (obj)));
        }
        if (i1 == 0)
        {
            eo1.k = false;
        }
        obj = eo1.i();
        if (!eo1.l || !eo1.i.isEmpty() || obj != null && ((b) (obj)).a(eo1) != 0) goto _L2; else goto _L1
_L1:
        if (j1 <= 0 || j1 >= eo1.g) goto _L4; else goto _L3
_L3:
        short aword0[] = new short[eo1.g - j1];
        eo1.d.write(aword0, 0, aword0.length);
_L6:
        return j1;
_L4:
        if (eo1.n < eo1.g || eo1.d.getPlaybackHeadPosition() - eo1.n >= 0)
        {
            com.nuance.dragon.toolkit.d.e.a(eo1, "writeBuffer() No more chunks. Cleanup player.");
            eo1.c();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (eo1.i.isEmpty())
        {
            eo1.a(400);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void d(eo eo1)
    {
        eo1.f();
    }

    static Handler e(eo eo1)
    {
        return eo1.m;
    }

    static AudioTrack f(eo eo1)
    {
        return eo1.d;
    }

    static LinkedList g(eo eo1)
    {
        return eo1.u;
    }

    static k h(eo eo1)
    {
        return eo1.t;
    }

    static Handler i(eo eo1)
    {
        return eo1.C;
    }

    static int j(eo eo1)
    {
        return eo1.v;
    }

    protected final void a(List list)
    {
        if (list != null)
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                g g1 = (g)iterator.next();
                int l1 = (z + g1.c.length) / w;
                int j1 = g1.c.length;
                int k1 = 0;
                for (int i1 = 0; i1 < l1; i1++)
                {
                    int i2 = w - z;
                    z = 0;
                    float f1 = a(a(y, g1.c, k1, i2));
                    y = 0L;
                    k1 += i2;
                    j1 -= i2;
                    u.add(new eq(f1, A));
                    A = A + x;
                }

                z = z + j1;
                if (z > 0)
                {
                    y = a(y, g1.c, k1, j1);
                }
            } while (true);
            if (!D)
            {
                D = C.post(b);
            }
            i.addAll(list);
        }
    }

    protected final boolean b(com.nuance.dragon.toolkit.audio.e e1)
    {
        return e1.m == f.a;
    }

    protected final void c()
    {
        if (h)
        {
            return;
        }
        h = true;
        if (m != null)
        {
            m.removeCallbacksAndMessages(null);
            m = null;
        }
        if (C != null)
        {
            C.removeCallbacksAndMessages(null);
            C = null;
            B.quit();
        }
        if (d != null)
        {
            if (d.getState() != 0)
            {
                com.nuance.dragon.toolkit.d.e.a(this, "stop _player.");
                d.stop();
            }
            com.nuance.dragon.toolkit.d.e.a(this, "release _player.");
            d.release();
            d = null;
        }
        g();
    }

    protected final boolean c(com.nuance.dragon.toolkit.audio.e e1)
    {
        int i1 = 8000;
        int j1;
        int k1;
        boolean flag;
        if (e1.m == f.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a("audioType.encoding", "PCM_16", flag);
        h = false;
        l = false;
        n = 0;
        if (e1.l != 8000)
        {
            if (e1.l == 11025)
            {
                i1 = 11025;
            } else
            if (e1.l == 22050)
            {
                i1 = 22050;
            } else
            if (e1.l == 44100)
            {
                i1 = 44100;
            } else
            {
                i1 = 16000;
            }
        }
        B = new HandlerThread("");
        B.start();
        C = new Handler(B.getLooper());
        w = a(i1, v) / 2;
        x = (v * i1) / 1000;
        y = 0L;
        j1 = a(i1, 400);
        k1 = AudioTrack.getMinBufferSize(i1, 2, 2);
        if (k1 != -2 && k1 != -1 && k1 > j1)
        {
            j1 = k1;
        }
        f = j1;
        g = f / 2;
        d = new AudioTrack(e, i1, 2, 2, f, 1);
        if (d.getState() != 1)
        {
            com.nuance.dragon.toolkit.d.e.d(this, "startPlayingInternal() instantiate AudioTrack failed!!!");
            c();
            return false;
        } else
        {
            q = 0;
            r = false;
            m = new Handler();
            e1 = new ep(this);
            m.post(e1);
            d.play();
            k = true;
            return true;
        }
    }

    protected final void d()
    {
        if (!l)
        {
            l = true;
            if (z > 0)
            {
                z = 0;
                float f1 = a(y);
                y = 0L;
                u.add(new eq(f1, A));
            }
        }
    }

    static 
    {
        boolean flag;
        if (!com/nuance/b/b/eo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }
}
