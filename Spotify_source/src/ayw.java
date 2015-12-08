// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.ExoPlaybackException;
import java.util.ArrayList;
import java.util.List;

final class ayw
    implements android.os.Handler.Callback
{

    final Handler a;
    final HandlerThread b = new bed((new StringBuilder()).append(getClass().getSimpleName()).append(":Handler").toString());
    int c;
    volatile long d;
    volatile long e;
    private final Handler f;
    private final azn g = new azn();
    private final boolean h[];
    private final long i = 0xf4240L;
    private final long j = 0x4c4b40L;
    private final List k;
    private azq l[];
    private azq m;
    private ayy n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private long t;
    private volatile long u;

    public ayw(Handler handler, boolean flag, boolean aflag[])
    {
        int i1 = 0;
        super();
        c = 0;
        s = 0;
        f = handler;
        p = flag;
        h = new boolean[aflag.length];
        for (; i1 < aflag.length; i1++)
        {
            h[i1] = aflag[i1];
        }

        r = 1;
        d = -1L;
        u = -1L;
        k = new ArrayList(aflag.length);
        b.start();
        a = new Handler(b.getLooper(), this);
    }

    private void a(int i1)
    {
        if (r != i1)
        {
            r = i1;
            f.obtainMessage(2, i1, 0).sendToTarget();
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

    private boolean a(azq azq1)
    {
        if (!azq1.b())
        {
            if (!azq1.c())
            {
                return false;
            }
            if (r != 4)
            {
                long l2 = azq1.e();
                long l3 = azq1.f();
                long l1;
                if (q)
                {
                    l1 = 0x4c4b40L;
                } else
                {
                    l1 = 0xf4240L;
                }
                if (l1 > 0L && l3 != -1L && l3 != -3L && l3 < l1 + e && (l2 == -1L || l2 == -2L || l3 < l2))
                {
                    return false;
                }
            }
        }
        return true;
    }

    private void b()
    {
        long l1 = SystemClock.elapsedRealtime();
        boolean flag1 = true;
        int i1 = 0;
        while (i1 < l.length) 
        {
            azq azq1 = l[i1];
            boolean flag2 = flag1;
            if (azq1.g == 0)
            {
                long l3 = e;
                boolean flag5;
                if (azq1.g == 0)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                bds.b(flag5);
                azq1.g = azq1.a();
                if (azq1.g == 0 || azq1.g == 1 || azq1.g == -1)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                bds.b(flag5);
                flag2 = flag1;
                if (azq1.g == 0)
                {
                    azq1.d();
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
        long l4 = 0L;
        boolean flag3 = true;
        flag1 = true;
        boolean aflag[] = new boolean[l.length];
        int k1 = 0;
        do
        {
            if (k1 < l.length)
            {
                azq azq2 = l[k1];
                boolean flag;
                boolean flag4;
                long l5;
                boolean flag6;
                if (azq2.g == 1)
                {
                    flag6 = true;
                } else
                {
                    flag6 = false;
                }
                aflag[k1] = flag6;
                flag4 = flag3;
                l5 = l4;
                flag = flag1;
                if (aflag[k1])
                {
                    long l2 = l4;
                    if (l4 != -1L)
                    {
                        l5 = azq2.e();
                        if (l5 == -1L)
                        {
                            l2 = -1L;
                        } else
                        {
                            l2 = l4;
                            if (l5 != -2L)
                            {
                                l2 = Math.max(l4, l5);
                            }
                        }
                    }
                    flag4 = flag3;
                    l5 = l2;
                    flag = flag1;
                    if (h[k1])
                    {
                        azq2.b(e, false);
                        k.add(azq2);
                        if (flag3 && azq2.b())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag1 && a(azq2))
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        flag4 = flag;
                        flag = flag1;
                        l5 = l2;
                    }
                }
                k1++;
                flag3 = flag4;
                l4 = l5;
                flag1 = flag;
                continue;
            }
            d = l4;
            int j1;
            if (flag3 && (l4 == -1L || l4 <= e))
            {
                j1 = 5;
            } else
            if (flag1)
            {
                j1 = 4;
            } else
            {
                j1 = 3;
            }
            r = j1;
            f.obtainMessage(1, r, 0, aflag).sendToTarget();
            if (p && r == 4)
            {
                c();
            }
            a.sendEmptyMessage(7);
            return;
        } while (true);
    }

    private static void b(azq azq1)
    {
        if (azq1.g == 3)
        {
            azq1.p();
        }
    }

    private void c()
    {
        q = false;
        azn azn1 = g;
        if (!azn1.a)
        {
            azn1.a = true;
            azn1.c = azn.b(azn1.b);
        }
        for (int i1 = 0; i1 < k.size(); i1++)
        {
            ((azq)k.get(i1)).o();
        }

    }

    private void d()
    {
        g.b();
        for (int i1 = 0; i1 < k.size(); i1++)
        {
            b((azq)k.get(i1));
        }

    }

    private void e()
    {
        if (n != null && k.contains(m) && !m.b())
        {
            e = n.d_();
            g.a(e);
        } else
        {
            e = g.d_();
        }
        t = SystemClock.elapsedRealtime() * 1000L;
    }

    private void f()
    {
        g();
        a(1);
    }

    private void g()
    {
        int i1;
        a.removeMessages(7);
        a.removeMessages(2);
        q = false;
        g.b();
        if (l == null)
        {
            return;
        }
        i1 = 0;
_L3:
        if (i1 >= l.length) goto _L2; else goto _L1
_L1:
        boolean flag;
        azq azq1 = l[i1];
        try
        {
            b(azq1);
            if (azq1.g == 2)
            {
                azq1.q();
            }
        }
        catch (ExoPlaybackException exoplaybackexception1)
        {
            Log.e("ExoPlayerImplInternal", "Stop failed.", exoplaybackexception1);
        }
        catch (RuntimeException runtimeexception1)
        {
            Log.e("ExoPlayerImplInternal", "Stop failed.", runtimeexception1);
        }
        if (azq1.g != 2 && azq1.g != 3 && azq1.g != -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            bds.b(flag);
            azq1.g = -2;
            azq1.n();
        }
        catch (ExoPlaybackException exoplaybackexception)
        {
            Log.e("ExoPlayerImplInternal", "Release failed.", exoplaybackexception);
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("ExoPlayerImplInternal", "Release failed.", runtimeexception);
        }
        i1++;
          goto _L3
_L2:
        l = null;
        n = null;
        m = null;
        k.clear();
        return;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = o;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.sendEmptyMessage(5);
_L3:
        flag = o;
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

    public final void a(ays ays1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!o) goto _L2; else goto _L1
_L1:
        Log.w("ExoPlayerImplInternal", "Sent message(1) after release. Message ignored.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i1;
        i1 = c;
        c = i1 + 1;
        a.obtainMessage(9, 1, 0, Pair.create(ays1, null)).sendToTarget();
_L5:
        int j1 = s;
        if (j1 > i1) goto _L4; else goto _L3
_L3:
        wait();
          goto _L5
        ays1;
        Thread.currentThread().interrupt();
          goto _L5
        ays1;
        throw ays1;
    }

    public final boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 9: default 1133
    //                   1 56
    //                   2 133
    //                   3 139
    //                   4 794
    //                   5 800
    //                   6 666
    //                   7 284
    //                   8 938
    //                   9 829;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L2:
        message = (azq[])message.obj;
        g();
        l = message;
        int i1 = 0;
_L65:
        if (i1 >= message.length) goto _L12; else goto _L11
_L11:
        ayy ayy1 = message[i1].g();
        if (ayy1 == null) goto _L14; else goto _L13
_L13:
        boolean flag;
        int j1;
        long l1;
        long l2;
        long l3;
        long l4;
        boolean flag1;
        if (n == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bds.b(flag1);
        n = ayy1;
        m = message[i1];
          goto _L14
_L12:
        a(2);
        b();
        return true;
_L3:
        b();
        return true;
_L4:
        i1 = message.arg1;
        if (i1 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        q = false;
        p = flag1;
        if (flag1) goto _L16; else goto _L15
_L15:
        d();
        e();
_L19:
        f.obtainMessage(3).sendToTarget();
        return true;
_L16:
        if (r != 4) goto _L18; else goto _L17
_L17:
        c();
        a.sendEmptyMessage(7);
          goto _L19
        message;
          goto _L20
_L18:
        if (r != 3) goto _L19; else goto _L21
_L21:
        a.sendEmptyMessage(7);
          goto _L19
_L8:
        beh.a("doSomeWork");
        l2 = SystemClock.elapsedRealtime();
        if (d == -1L) goto _L23; else goto _L22
_L22:
        l1 = d;
_L61:
        i1 = 1;
        flag = true;
        e();
        j1 = 0;
_L60:
        if (j1 >= k.size()) goto _L25; else goto _L24
_L24:
        message = (azq)k.get(j1);
        message.a(e, t);
        if (i1 == 0) goto _L27; else goto _L26
_L26:
        if (!message.b()) goto _L27; else goto _L28
_L28:
        i1 = 1;
_L62:
        flag1 = a(message);
        if (flag1) goto _L30; else goto _L29
_L29:
        message.d();
          goto _L30
_L59:
        if (l1 == -1L) goto _L32; else goto _L31
_L31:
        l3 = message.e();
        l4 = message.f();
        if (l4 != -1L) goto _L34; else goto _L33
_L33:
        l1 = -1L;
          goto _L32
_L63:
        l1 = Math.min(l1, l4);
          goto _L32
_L25:
        u = l1;
        if (i1 == 0) goto _L36; else goto _L35
_L35:
        if (d != -1L && d > e) goto _L36; else goto _L37
_L37:
        a(5);
        d();
_L42:
        a.removeMessages(7);
        if ((!p || r != 4) && r != 3) goto _L39; else goto _L38
_L38:
        a(7, l2, 10L);
_L45:
        beh.a();
        return true;
_L36:
        if (r != 3 || !flag) goto _L41; else goto _L40
_L40:
        a(4);
        if (p)
        {
            c();
        }
          goto _L42
_L20:
        try
        {
            f.obtainMessage(3).sendToTarget();
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Log.e("ExoPlayerImplInternal", "Internal track renderer error.", message);
            f.obtainMessage(4, message).sendToTarget();
            f();
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", message);
        }
        f.obtainMessage(4, new ExoPlaybackException(message, (byte)0)).sendToTarget();
        f();
        return true;
_L41:
        if (r != 4 || flag) goto _L42; else goto _L43
_L43:
        q = p;
        a(3);
        d();
          goto _L42
_L39:
        if (k.isEmpty()) goto _L45; else goto _L44
_L44:
        a(7, l2, 1000L);
          goto _L45
_L7:
        l1 = ((Long)message.obj).longValue();
        q = false;
        e = l1 * 1000L;
        g.b();
        g.a(e);
        if (r != 1 && r != 2) goto _L47; else goto _L46
_L50:
        if (i1 >= k.size()) goto _L49; else goto _L48
_L48:
        message = (azq)k.get(i1);
        b(message);
        message.a(e);
        i1++;
          goto _L50
_L49:
        a(3);
        a.sendEmptyMessage(7);
          goto _L46
_L5:
        f();
        return true;
_L6:
        g();
        a(1);
        this;
        JVM INSTR monitorenter ;
        o = true;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return true;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
_L10:
        i1 = message.arg1;
        message = ((Message) (message.obj));
        message = (Pair)message;
        ((ays)((Pair) (message)).first).a(i1, ((Pair) (message)).second);
        this;
        JVM INSTR monitorenter ;
        s = s + 1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        if (r != 1 && r != 2)
        {
            a.sendEmptyMessage(7);
        }
        return true;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
        message;
        this;
        JVM INSTR monitorenter ;
        s = s + 1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        throw message;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
_L9:
        i1 = message.arg1;
        if (message.arg2 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (h[i1] == flag1) goto _L52; else goto _L51
_L51:
        h[i1] = flag1;
        if (r != 1 && r != 2) goto _L53; else goto _L52
_L53:
        message = l[i1];
        i1 = ((azq) (message)).g;
        if (i1 != 1 && i1 != 2 && i1 != 3) goto _L52; else goto _L54
_L54:
        if (!flag1) goto _L56; else goto _L55
_L55:
        if (p && r == 4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        message.b(e, flag1);
        k.add(message);
        if (!flag1) goto _L58; else goto _L57
_L57:
        message.o();
_L58:
        a.sendEmptyMessage(7);
          goto _L52
_L56:
        if (message == m)
        {
            g.a(n.d_());
        }
        b(message);
        k.remove(message);
        message.q();
          goto _L52
_L1:
        return false;
_L14:
        i1++;
        continue; /* Loop/switch isn't completed */
_L30:
        if (flag && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L59
_L32:
        j1++;
          goto _L60
_L23:
        l1 = 0x7fffffffffffffffL;
          goto _L61
_L27:
        i1 = 0;
          goto _L62
_L34:
        if (l4 == -3L || l3 != -1L && l3 != -2L && l4 >= l3) goto _L32; else goto _L63
_L46:
        return true;
_L47:
        i1 = 0;
          goto _L50
_L52:
        return true;
        if (true) goto _L65; else goto _L64
_L64:
    }
}
