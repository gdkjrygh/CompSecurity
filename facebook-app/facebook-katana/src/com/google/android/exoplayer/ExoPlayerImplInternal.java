// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.PriorityHandlerThread;
import com.google.android.exoplayer.util.TraceUtil;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer:
//            StandaloneMediaClock, TrackRenderer, MediaClock, ExoPlaybackException

final class ExoPlayerImplInternal
    implements android.os.Handler.Callback
{

    private final Handler a;
    private final HandlerThread b = new PriorityHandlerThread((new StringBuilder()).append(getClass().getSimpleName()).append(":Handler").toString(), -16);
    private final Handler c;
    private final StandaloneMediaClock d = new StandaloneMediaClock();
    private final boolean e[];
    private final long f;
    private final long g;
    private final List h;
    private TrackRenderer i[];
    private TrackRenderer j;
    private MediaClock k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private long r;
    private volatile long s;
    private volatile long t;
    private volatile long u;

    public ExoPlayerImplInternal(Handler handler, boolean flag, boolean aflag[], int i1, int j1)
    {
        boolean flag1 = false;
        super();
        p = 0;
        q = 0;
        c = handler;
        m = flag;
        e = new boolean[aflag.length];
        f = (long)i1 * 1000L;
        g = (long)j1 * 1000L;
        for (i1 = ((flag1) ? 1 : 0); i1 < aflag.length; i1++)
        {
            e[i1] = aflag[i1];
        }

        o = 1;
        s = -1L;
        u = -1L;
        h = new ArrayList(aflag.length);
        b.start();
        a = new Handler(b.getLooper(), this);
    }

    private void a(int i1)
    {
        if (o != i1)
        {
            o = i1;
            c.obtainMessage(2, i1, 0).sendToTarget();
        }
    }

    private void a(int i1, long l1, long l2)
    {
        l1 = (l1 + l2) - SystemClock.elapsedRealtime();
        if (l1 <= 0L)
        {
            a.sendEmptyMessage(i1);
            return;
        } else
        {
            a.sendEmptyMessageDelayed(i1, l1);
            return;
        }
    }

    private void a(int i1, Object obj)
    {
        obj = (Pair)obj;
        ((ExoPlayer.ExoPlayerComponent)((Pair) (obj)).first).a(i1, ((Pair) (obj)).second);
        this;
        JVM INSTR monitorenter ;
        q = q + 1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (o != 1 && o != 2)
        {
            a.sendEmptyMessage(7);
        }
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorenter ;
        q = q + 1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private boolean a(TrackRenderer trackrenderer)
    {
        if (!trackrenderer.a())
        {
            if (!trackrenderer.b())
            {
                return false;
            }
            if (o != 4)
            {
                long l2 = trackrenderer.d();
                long l3 = trackrenderer.e();
                long l1;
                if (n)
                {
                    l1 = g;
                } else
                {
                    l1 = f;
                }
                if (l1 > 0L && l3 != -1L && l3 != -3L && l3 < l1 + t && (l2 == -1L || l2 == -2L || l3 < l2))
                {
                    return false;
                }
            }
        }
        return true;
    }

    private void b(int i1, boolean flag)
    {
        boolean flag1 = true;
        if (e[i1] != flag)
        {
            e[i1] = flag;
            if (o != 1 && o != 2)
            {
                TrackRenderer trackrenderer = i[i1];
                i1 = trackrenderer.p();
                if (i1 == 1 || i1 == 2 || i1 == 3)
                {
                    if (flag)
                    {
                        if (m && o == 4)
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                        trackrenderer.b(t, flag);
                        h.add(trackrenderer);
                        if (flag)
                        {
                            trackrenderer.q();
                        }
                        a.sendEmptyMessage(7);
                        return;
                    }
                    if (trackrenderer == j)
                    {
                        d.a(k.c());
                    }
                    d(trackrenderer);
                    h.remove(trackrenderer);
                    trackrenderer.s();
                    return;
                }
            }
        }
    }

    private void b(long l1)
    {
        n = false;
        t = 1000L * l1;
        d.b();
        d.a(t);
        if (o == 1 || o == 2)
        {
            return;
        }
        for (int i1 = 0; i1 < h.size(); i1++)
        {
            TrackRenderer trackrenderer = (TrackRenderer)h.get(i1);
            d(trackrenderer);
            trackrenderer.b(t);
        }

        a(3);
        a.sendEmptyMessage(7);
    }

    private void b(TrackRenderer trackrenderer)
    {
        try
        {
            d(trackrenderer);
            if (trackrenderer.p() == 2)
            {
                trackrenderer.s();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TrackRenderer trackrenderer)
        {
            Log.e("ExoPlayerImplInternal", "Stop failed.", trackrenderer);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TrackRenderer trackrenderer)
        {
            Log.e("ExoPlayerImplInternal", "Stop failed.", trackrenderer);
        }
    }

    private void b(boolean flag)
    {
        n = false;
        m = flag;
        if (flag) goto _L2; else goto _L1
_L1:
        h();
        i();
_L5:
        c.obtainMessage(3).sendToTarget();
        return;
_L2:
        if (o != 4) goto _L4; else goto _L3
_L3:
        g();
        a.sendEmptyMessage(7);
          goto _L5
        Exception exception;
        exception;
        c.obtainMessage(3).sendToTarget();
        throw exception;
_L4:
        if (o != 3) goto _L5; else goto _L6
_L6:
        a.sendEmptyMessage(7);
          goto _L5
    }

    private void b(TrackRenderer atrackrenderer[])
    {
        m();
        i = atrackrenderer;
        int i1 = 0;
        while (i1 < atrackrenderer.length) 
        {
            MediaClock mediaclock = atrackrenderer[i1].f();
            if (mediaclock != null)
            {
                boolean flag;
                if (k == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Assertions.b(flag);
                k = mediaclock;
                j = atrackrenderer[i1];
            }
            i1++;
        }
        a(2);
        f();
    }

    private static void c(TrackRenderer trackrenderer)
    {
        try
        {
            trackrenderer.t();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TrackRenderer trackrenderer)
        {
            Log.e("ExoPlayerImplInternal", "Release failed.", trackrenderer);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TrackRenderer trackrenderer)
        {
            Log.e("ExoPlayerImplInternal", "Release failed.", trackrenderer);
        }
    }

    private static void d(TrackRenderer trackrenderer)
    {
        if (trackrenderer.p() == 3)
        {
            trackrenderer.r();
        }
    }

    private void f()
    {
        long l1 = SystemClock.elapsedRealtime();
        boolean flag1 = true;
        for (int i1 = 0; i1 < i.length;)
        {
            TrackRenderer trackrenderer = i[i1];
            boolean flag2 = flag1;
            if (trackrenderer.p() == 0)
            {
                flag2 = flag1;
                if (trackrenderer.c(t) == 0)
                {
                    trackrenderer.d_();
                    flag2 = false;
                }
            }
            i1++;
            flag1 = flag2;
        }

        if (!flag1)
        {
            a(2, l1, 10L);
            return;
        }
        long l3 = 0L;
        flag1 = true;
        boolean flag3 = true;
        boolean aflag[] = new boolean[i.length];
        int k1 = 0;
        do
        {
            if (k1 < i.length)
            {
                TrackRenderer trackrenderer1 = i[k1];
                boolean flag;
                boolean flag4;
                long l4;
                boolean flag5;
                if (trackrenderer1.p() == 1)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                aflag[k1] = flag5;
                flag = flag3;
                l4 = l3;
                flag4 = flag1;
                if (aflag[k1])
                {
                    long l2 = l3;
                    if (l3 != -1L)
                    {
                        l4 = trackrenderer1.d();
                        if (l4 == -1L)
                        {
                            l2 = -1L;
                        } else
                        {
                            l2 = l3;
                            if (l4 != -2L)
                            {
                                l2 = Math.max(l3, l4);
                            }
                        }
                    }
                    flag = flag3;
                    l4 = l2;
                    flag4 = flag1;
                    if (e[k1])
                    {
                        trackrenderer1.b(t, false);
                        h.add(trackrenderer1);
                        if (flag1 && trackrenderer1.a())
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag3 && a(trackrenderer1))
                        {
                            flag = true;
                            flag4 = flag1;
                            l4 = l2;
                        } else
                        {
                            flag = false;
                            l4 = l2;
                            flag4 = flag1;
                        }
                    }
                }
                k1++;
                flag3 = flag;
                l3 = l4;
                flag1 = flag4;
                continue;
            }
            s = l3;
            int j1;
            if (flag1 && (l3 == -1L || l3 <= t))
            {
                j1 = 5;
            } else
            if (flag3)
            {
                j1 = 4;
            } else
            {
                j1 = 3;
            }
            o = j1;
            c.obtainMessage(1, o, 0, aflag).sendToTarget();
            if (m && o == 4)
            {
                g();
            }
            a.sendEmptyMessage(7);
            return;
        } while (true);
    }

    private void g()
    {
        n = false;
        d.a();
        for (int i1 = 0; i1 < h.size(); i1++)
        {
            ((TrackRenderer)h.get(i1)).q();
        }

    }

    private void h()
    {
        d.b();
        for (int i1 = 0; i1 < h.size(); i1++)
        {
            d((TrackRenderer)h.get(i1));
        }

    }

    private void i()
    {
        if (k != null && h.contains(j) && !j.a())
        {
            t = k.c();
            d.a(t);
        } else
        {
            t = d.c();
        }
        r = SystemClock.elapsedRealtime() * 1000L;
    }

    private void j()
    {
        boolean flag;
        boolean flag1;
        long l1;
        long l2;
        long l3;
        long l4;
        long l5;
        TraceUtil.a("doSomeWork");
        l3 = SystemClock.elapsedRealtime();
        TrackRenderer trackrenderer;
        int i1;
        boolean flag2;
        if (s != -1L)
        {
            l1 = s;
        } else
        {
            l1 = 0x7fffffffffffffffL;
        }
        i();
        flag1 = true;
        flag = true;
        i1 = 0;
        l2 = l1;
        if (i1 >= h.size())
        {
            break MISSING_BLOCK_LABEL_249;
        }
        trackrenderer = (TrackRenderer)h.get(i1);
        trackrenderer.a(t, r);
        if (flag && trackrenderer.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag2 = a(trackrenderer);
        if (!flag2)
        {
            trackrenderer.d_();
        }
        if (flag1 && flag2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l1 = l2;
        if (l2 == -1L) goto _L2; else goto _L1
_L1:
        l4 = trackrenderer.d();
        l5 = trackrenderer.e();
        if (l5 != -1L) goto _L4; else goto _L3
_L3:
        l1 = -1L;
_L2:
        i1++;
        l2 = l1;
        break MISSING_BLOCK_LABEL_43;
_L4:
        l1 = l2;
        if (l5 == -3L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l4 != -1L && l4 != -2L)
        {
            l1 = l2;
            if (l5 >= l4)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        l1 = Math.min(l2, l5);
        if (true) goto _L2; else goto _L5
_L5:
        u = l2;
        if (flag && (s == -1L || s <= t))
        {
            a(5);
            h();
        } else
        if (o == 3 && flag1)
        {
            a(4);
            if (m)
            {
                g();
            }
        } else
        if (o == 4 && !flag1)
        {
            n = m;
            a(3);
            h();
        }
        a.removeMessages(7);
        if (m && o == 4 || o == 3)
        {
            a(7, l3, 10L);
        } else
        if (!h.isEmpty())
        {
            a(7, l3, 1000L);
        }
        TraceUtil.a();
        return;
    }

    private void k()
    {
        m();
        a(1);
    }

    private void l()
    {
        m();
        a(1);
        this;
        JVM INSTR monitorenter ;
        l = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void m()
    {
        int i1 = 0;
        a.removeMessages(7);
        a.removeMessages(2);
        n = false;
        d.b();
        if (i == null)
        {
            return;
        }
        for (; i1 < i.length; i1++)
        {
            TrackRenderer trackrenderer = i[i1];
            b(trackrenderer);
            c(trackrenderer);
        }

        i = null;
        k = null;
        j = null;
        h.clear();
    }

    public final long a()
    {
        return t / 1000L;
    }

    public final void a(int i1, boolean flag)
    {
        Handler handler = a;
        int j1;
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        handler.obtainMessage(8, i1, j1).sendToTarget();
    }

    public final void a(long l1)
    {
        a.obtainMessage(6, Long.valueOf(l1)).sendToTarget();
    }

    public final void a(ExoPlayer.ExoPlayerComponent exoplayercomponent, int i1, Object obj)
    {
        p = p + 1;
        a.obtainMessage(9, i1, 0, Pair.create(exoplayercomponent, obj)).sendToTarget();
    }

    public final void a(boolean flag)
    {
        Handler handler = a;
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        handler.obtainMessage(3, i1, 0).sendToTarget();
    }

    public final transient void a(TrackRenderer atrackrenderer[])
    {
        a.obtainMessage(1, atrackrenderer).sendToTarget();
    }

    public final long b()
    {
        if (u == -1L)
        {
            return -1L;
        } else
        {
            return u / 1000L;
        }
    }

    public final void b(ExoPlayer.ExoPlayerComponent exoplayercomponent, int i1, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!l) goto _L2; else goto _L1
_L1:
        Log.w("ExoPlayerImplInternal", (new StringBuilder("Sent message(")).append(i1).append(") after release. Message ignored.").toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j1;
        j1 = p;
        p = j1 + 1;
        a.obtainMessage(9, i1, 0, Pair.create(exoplayercomponent, obj)).sendToTarget();
_L5:
        i1 = q;
        if (i1 > j1) goto _L4; else goto _L3
_L3:
        wait();
          goto _L5
        exoplayercomponent;
        Thread.currentThread().interrupt();
          goto _L5
        exoplayercomponent;
        throw exoplayercomponent;
    }

    public final long c()
    {
        if (s == -1L)
        {
            return -1L;
        } else
        {
            return s / 1000L;
        }
    }

    public final void d()
    {
        a.sendEmptyMessage(4);
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.sendEmptyMessage(5);
_L3:
        flag = l;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        wait();
          goto _L3
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L3
        obj;
        throw obj;
        b.quit();
          goto _L1
    }

    public final boolean handleMessage(Message message)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        message.what;
        JVM INSTR tableswitch 1 9: default 237
    //                   1 60
    //                   2 76
    //                   3 82
    //                   4 120
    //                   5 126
    //                   6 104
    //                   7 98
    //                   8 146
    //                   9 132;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L2:
        b((TrackRenderer[])(TrackRenderer[])message.obj);
        return true;
_L3:
        int i1;
        try
        {
            f();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Log.e("ExoPlayerImplInternal", "Internal track renderer error.", message);
            c.obtainMessage(4, message).sendToTarget();
            k();
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", message);
            c.obtainMessage(4, new ExoPlaybackException(message, true)).sendToTarget();
            k();
            return true;
        }
        return true;
_L4:
        if (message.arg1 != 0)
        {
            flag = true;
        }
        b(flag);
        return true;
_L8:
        j();
        return true;
_L7:
        b(((Long)message.obj).longValue());
        return true;
_L5:
        k();
        return true;
_L6:
        l();
        return true;
_L10:
        a(message.arg1, message.obj);
        return true;
_L9:
        i1 = message.arg1;
        flag = flag1;
        if (message.arg2 != 0)
        {
            flag = true;
        }
        b(i1, flag);
        return true;
_L1:
        return false;
    }
}
