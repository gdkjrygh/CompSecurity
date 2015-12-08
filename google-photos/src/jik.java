// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class jik
    implements android.os.Handler.Callback
{

    final Handler a;
    final AtomicInteger b = new AtomicInteger();
    int c;
    long d;
    volatile long e;
    volatile long f;
    private final HandlerThread g = new jnn(String.valueOf(getClass().getSimpleName()).concat(":Handler"), -16);
    private final Handler h;
    private final jjo i = new jjo();
    private final List j;
    private final jjh k[][];
    private final int l[];
    private final long m;
    private final long n;
    private jig o[];
    private jig p;
    private jim q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private long w;
    private volatile long x;

    public jik(Handler handler, boolean flag, int ai[], int i1, int j1)
    {
        c = 0;
        v = 0;
        h = handler;
        s = flag;
        m = (long)i1 * 1000L;
        n = (long)j1 * 1000L;
        l = Arrays.copyOf(ai, ai.length);
        u = 1;
        e = -1L;
        x = -1L;
        j = new ArrayList(ai.length);
        k = new jjh[ai.length][];
        g.start();
        a = new Handler(g.getLooper(), this);
    }

    private void a(int i1)
    {
        if (u != i1)
        {
            u = i1;
            h.obtainMessage(2, i1, 0).sendToTarget();
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

    private boolean a(jig jig1)
    {
        if (!jig1.c())
        {
            if (!jig1.d())
            {
                return false;
            }
            if (u != 4)
            {
                long l2 = jig1.f();
                long l3 = jig1.g();
                long l1;
                if (t)
                {
                    l1 = n;
                } else
                {
                    l1 = m;
                }
                if (l1 > 0L && l3 != -1L && l3 != -3L && l3 < l1 + f && (l2 == -1L || l2 == -2L || l3 < l2))
                {
                    return false;
                }
            }
        }
        return true;
    }

    private void b()
    {
        long l2 = SystemClock.elapsedRealtime();
        boolean flag1 = true;
        for (int i1 = 0; i1 < o.length;)
        {
            jig jig1 = o[i1];
            boolean flag2 = flag1;
            if (jig1.i() == 0)
            {
                flag2 = flag1;
                if (jig1.c(f) == 0)
                {
                    jig1.e();
                    flag2 = false;
                }
            }
            i1++;
            flag1 = flag2;
        }

        if (!flag1)
        {
            a(2, l2, 10L);
            return;
        }
        long l4 = 0L;
        flag1 = true;
        boolean flag3 = true;
        int l1 = 0;
        do
        {
            if (l1 < o.length)
            {
                jig jig2 = o[l1];
                int i2 = jig2.aB_();
                jjh ajjh[] = new jjh[i2];
                for (int j1 = 0; j1 < i2; j1++)
                {
                    ajjh[j1] = jig2.a(j1);
                }

                k[l1] = ajjh;
                boolean flag = flag3;
                boolean flag4 = flag1;
                long l5 = l4;
                if (i2 > 0)
                {
                    long l3 = l4;
                    if (l4 != -1L)
                    {
                        l5 = jig2.f();
                        int j2;
                        if (l5 == -1L)
                        {
                            l3 = -1L;
                        } else
                        {
                            l3 = l4;
                            if (l5 != -2L)
                            {
                                l3 = Math.max(l4, l5);
                            }
                        }
                    }
                    j2 = l[l1];
                    flag = flag3;
                    flag4 = flag1;
                    l5 = l3;
                    if (j2 >= 0)
                    {
                        flag = flag3;
                        flag4 = flag1;
                        l5 = l3;
                        if (j2 < ajjh.length)
                        {
                            jig2.b(j2, f, false);
                            j.add(jig2);
                            if (flag1 && jig2.c())
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                            if (flag3 && a(jig2))
                            {
                                flag = true;
                                l5 = l3;
                                flag4 = flag1;
                            } else
                            {
                                flag = false;
                                flag4 = flag1;
                                l5 = l3;
                            }
                        }
                    }
                }
                l1++;
                flag3 = flag;
                flag1 = flag4;
                l4 = l5;
                continue;
            }
            e = l4;
            int k1;
            if (flag1 && (l4 == -1L || l4 <= f))
            {
                k1 = 5;
            } else
            if (flag3)
            {
                k1 = 4;
            } else
            {
                k1 = 3;
            }
            u = k1;
            h.obtainMessage(1, u, 0, k).sendToTarget();
            if (s && u == 4)
            {
                c();
            }
            a.sendEmptyMessage(7);
            return;
        } while (true);
    }

    private static void b(jig jig1)
    {
        if (jig1.i() == 3)
        {
            jig1.l();
        }
    }

    private void c()
    {
        t = false;
        jjo jjo1 = i;
        if (!jjo1.a)
        {
            jjo1.a = true;
            jjo1.c = jjo.b(jjo1.b);
        }
        for (int i1 = 0; i1 < j.size(); i1++)
        {
            ((jig)j.get(i1)).j();
        }

    }

    private void d()
    {
        i.a();
        for (int i1 = 0; i1 < j.size(); i1++)
        {
            b((jig)j.get(i1));
        }

    }

    private void e()
    {
        if (q != null && j.contains(p) && !p.c())
        {
            f = q.b();
            i.a(f);
        } else
        {
            f = i.b();
        }
        w = SystemClock.elapsedRealtime() * 1000L;
    }

    private void f()
    {
        g();
        a(1);
    }

    private void g()
    {
        int i1 = 0;
        a.removeMessages(7);
        a.removeMessages(2);
        t = false;
        i.a();
        if (o == null)
        {
            return;
        }
        while (i1 < o.length) 
        {
            jig jig1 = o[i1];
            try
            {
                b(jig1);
                if (jig1.i() == 2)
                {
                    jig1.n();
                }
            }
            catch (jie jie2)
            {
                Log.e("ExoPlayerImplInternal", "Stop failed.", jie2);
            }
            catch (RuntimeException runtimeexception1)
            {
                Log.e("ExoPlayerImplInternal", "Stop failed.", runtimeexception1);
            }
            try
            {
                jig1.o();
            }
            catch (jie jie1)
            {
                Log.e("ExoPlayerImplInternal", "Release failed.", jie1);
            }
            catch (RuntimeException runtimeexception)
            {
                Log.e("ExoPlayerImplInternal", "Release failed.", runtimeexception);
            }
            i1++;
        }
        o = null;
        q = null;
        p = null;
        j.clear();
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = r;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.sendEmptyMessage(5);
_L3:
        flag = r;
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
        g.quit();
          goto _L1
    }

    public final void a(jig jig1, int i1, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!r) goto _L2; else goto _L1
_L1:
        Log.w("ExoPlayerImplInternal", (new StringBuilder(57)).append("Sent message(").append(i1).append(") after release. Message ignored.").toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int j1;
        j1 = c;
        c = j1 + 1;
        a.obtainMessage(9, i1, 0, Pair.create(jig1, obj)).sendToTarget();
_L5:
        i1 = v;
        if (i1 > j1) goto _L4; else goto _L3
_L3:
        wait();
          goto _L5
        jig1;
        Thread.currentThread().interrupt();
          goto _L5
        jig1;
        throw jig1;
    }

    public final boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 9: default 1259
    //                   1 56
    //                   2 141
    //                   3 147
    //                   4 862
    //                   5 868
    //                   6 674
    //                   7 292
    //                   8 1004
    //                   9 897;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L2:
        message = (jig[])message.obj;
        g();
        o = message;
        Arrays.fill(k, null);
        int i1 = 0;
_L75:
        if (i1 >= message.length) goto _L12; else goto _L11
_L11:
        jim jim1 = message[i1].h();
        if (jim1 == null) goto _L14; else goto _L13
_L13:
        int j1;
        int k1;
        long l1;
        long l2;
        long l3;
        long l4;
        boolean flag;
        if (q == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        q = jim1;
        p = message[i1];
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
            flag = true;
        } else
        {
            flag = false;
        }
        t = false;
        s = flag;
        if (flag) goto _L16; else goto _L15
_L15:
        d();
        e();
_L19:
        h.obtainMessage(3).sendToTarget();
        return true;
_L16:
        if (u != 4) goto _L18; else goto _L17
_L17:
        c();
        a.sendEmptyMessage(7);
          goto _L19
        message;
          goto _L20
_L18:
        if (u != 3) goto _L19; else goto _L21
_L21:
        a.sendEmptyMessage(7);
          goto _L19
_L8:
        p.a("doSomeWork");
        l2 = SystemClock.elapsedRealtime();
        if (e == -1L) goto _L23; else goto _L22
_L22:
        l1 = e;
_L71:
        i1 = 1;
        j1 = 1;
        e();
        k1 = 0;
_L70:
        if (k1 >= j.size()) goto _L25; else goto _L24
_L24:
        message = (jig)j.get(k1);
        message.a(f, w);
        if (i1 == 0) goto _L27; else goto _L26
_L26:
        if (!message.c()) goto _L27; else goto _L28
_L28:
        i1 = 1;
_L72:
        flag = a(message);
        if (flag) goto _L30; else goto _L29
_L29:
        message.e();
          goto _L30
_L69:
        if (l1 == -1L) goto _L32; else goto _L31
_L31:
        l3 = message.f();
        l4 = message.g();
        if (l4 != -1L) goto _L34; else goto _L33
_L33:
        l1 = -1L;
          goto _L32
_L73:
        l1 = Math.min(l1, l4);
          goto _L32
_L25:
        x = l1;
        if (i1 == 0) goto _L36; else goto _L35
_L35:
        if (e != -1L && e > f) goto _L36; else goto _L37
_L37:
        a(5);
        d();
_L42:
        a.removeMessages(7);
        if ((!s || u != 4) && u != 3) goto _L39; else goto _L38
_L38:
        a(7, l2, 10L);
_L45:
        p.b();
        return true;
_L36:
        if (u != 3 || j1 == 0) goto _L41; else goto _L40
_L40:
        a(4);
        if (s)
        {
            c();
        }
          goto _L42
_L20:
        try
        {
            h.obtainMessage(3).sendToTarget();
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Log.e("ExoPlayerImplInternal", "Internal track renderer error.", message);
            h.obtainMessage(4, message).sendToTarget();
            f();
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", message);
        }
        h.obtainMessage(4, new jie(message, true)).sendToTarget();
        f();
        return true;
_L41:
        if (u != 4 || j1 != 0) goto _L42; else goto _L43
_L43:
        t = s;
        a(3);
        d();
          goto _L42
_L39:
        if (j.isEmpty()) goto _L45; else goto _L44
_L44:
        a(7, l2, 1000L);
          goto _L45
_L7:
        l1 = jno.b(message.arg1, message.arg2);
        l2 = f / 1000L;
        if (l1 != l2) goto _L47; else goto _L46
_L46:
        b.decrementAndGet();
_L51:
        return true;
_L47:
        t = false;
        f = l1 * 1000L;
        i.a();
        i.a(f);
        if (u == 1) goto _L49; else goto _L48
_L48:
        i1 = u;
        if (i1 != 2) goto _L50; else goto _L49
_L49:
        b.decrementAndGet();
          goto _L51
_L50:
        i1 = 0;
_L53:
        if (i1 >= j.size())
        {
            break; /* Loop/switch isn't completed */
        }
        message = (jig)j.get(i1);
        b(message);
        message.b(f);
        i1++;
        if (true) goto _L53; else goto _L52
_L52:
        a(3);
        a.sendEmptyMessage(7);
        b.decrementAndGet();
          goto _L51
        message;
        b.decrementAndGet();
        throw message;
_L5:
        f();
        return true;
_L6:
        g();
        a(1);
        this;
        JVM INSTR monitorenter ;
        r = true;
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
        ((jig)((Pair) (message)).first).a(i1, ((Pair) (message)).second);
        if (u != 1 && u != 2)
        {
            a.sendEmptyMessage(7);
        }
        this;
        JVM INSTR monitorenter ;
        v = v + 1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return true;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
        message;
        this;
        JVM INSTR monitorenter ;
        v = v + 1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        throw message;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
_L9:
        j1 = message.arg1;
        k1 = message.arg2;
        if (l[j1] == k1) goto _L55; else goto _L54
_L54:
        l[j1] = k1;
        if (u != 1 && u != 2) goto _L56; else goto _L55
_L56:
        message = o[j1];
        i1 = message.i();
        if (i1 == 0 || i1 == -1) goto _L55; else goto _L57
_L57:
        if (message.aB_() == 0) goto _L55; else goto _L58
_L58:
        if (i1 != 2 && i1 != 3)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (k1 < 0) goto _L60; else goto _L59
_L59:
        if (k1 >= k[j1].length) goto _L60; else goto _L61
_L61:
        j1 = 1;
_L68:
        if (i1 == 0) goto _L63; else goto _L62
_L62:
        if (j1 != 0) goto _L65; else goto _L64
_L64:
        if (message == p)
        {
            i.a(q.b());
        }
_L65:
        b(message);
        j.remove(message);
        message.n();
_L63:
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s && u == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        message.b(k1, f, flag);
        j.add(message);
        if (!flag) goto _L67; else goto _L66
_L66:
        message.j();
_L67:
        a.sendEmptyMessage(7);
        break; /* Loop/switch isn't completed */
_L60:
        j1 = 0;
        if (true) goto _L68; else goto _L55
_L1:
        return false;
_L14:
        i1++;
        continue; /* Loop/switch isn't completed */
_L30:
        if (j1 != 0 && flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
          goto _L69
_L32:
        k1++;
          goto _L70
_L23:
        l1 = 0x7fffffffffffffffL;
          goto _L71
_L27:
        i1 = 0;
          goto _L72
_L34:
        if (l4 == -3L || l3 != -1L && l3 != -2L && l4 >= l3) goto _L32; else goto _L73
_L55:
        return true;
        if (true) goto _L75; else goto _L74
_L74:
    }
}
