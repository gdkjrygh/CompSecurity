// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import android.os.SystemClock;
import com.kik.g.f;
import com.kik.g.o;
import com.kik.g.p;
import java.util.Random;
import kik.a.e.i;
import kik.a.e.k;
import kik.android.chat.a;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.net.communicator:
//            c, d, e, h, 
//            f, g

public class CommunicatorService extends Service
{

    private static final b g = org.c.c.a("CommunicatorService");
    protected kik.a.e.f a;
    protected i b;
    protected k c;
    private volatile long d;
    private boolean e;
    private volatile long f;
    private boolean h;
    private volatile long i;
    private final Random j = new Random();
    private final p k = new p();
    private volatile long l;
    private volatile boolean m;
    private volatile long n;
    private long o;
    private long p;
    private int q;
    private final f r = new f();
    private ConnectivityManager s;
    private AlarmManager t;
    private final com.kik.g.i u = new kik.android.net.communicator.c(this);
    private final com.kik.g.i v = new d(this);
    private final com.kik.g.i w = new e(this);
    private BroadcastReceiver x;

    public CommunicatorService()
    {
        d = 0L;
        e = true;
        f = 0x186a0L;
        h = false;
        i = 0L;
        l = SystemClock.elapsedRealtime();
        m = false;
        n = 1000L;
        o = 0L;
        p = 0L;
        q = 0;
        x = new h(this);
    }

    private static long a(long l1)
    {
        long l2 = l1;
        if (l1 == 0L)
        {
            l2 = 1L;
        }
        return l2;
    }

    static long a(CommunicatorService communicatorservice)
    {
        return communicatorservice.f;
    }

    static long a(CommunicatorService communicatorservice, long l1)
    {
        communicatorservice.f = l1;
        return l1;
    }

    private void a(long l1, long l2)
    {
        l2 = a(l2);
        (new StringBuilder("Blocking retries for another ")).append((l1 - System.currentTimeMillis()) / 1000L).append(" seconds");
        Object obj = new Intent();
        ((Intent) (obj)).setClass(this, kik/android/net/communicator/CommunicatorService);
        ((Intent) (obj)).putExtra("EXTRA_RESCHEDULE_NUMBER", l2);
        obj = PendingIntent.getService(this, 0, ((Intent) (obj)), 0x8000000);
        o = l1;
        t.set(0, Math.max(System.currentTimeMillis() + 1000L, l1), ((PendingIntent) (obj)));
    }

    private void a(long l1, long l2, String s1, long l3)
    {
        s1 = (new StringBuilder("Scheduling retry. num=")).append(l1).append(" reason: ").append(s1).append(" reset=");
        boolean flag1;
        if (l2 == -2L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1.append(flag1);
        if (l1 == 0L)
        {
            return;
        }
        PendingIntent pendingintent;
        boolean flag;
        if (l2 == -1L && 2D * (double)n >= 420000D)
        {
            flag = true;
            l1 = 0L;
        } else
        {
            flag = false;
            l1 = 1L + l1;
        }
        s1 = new Intent();
        s1.setClass(this, kik/android/net/communicator/CommunicatorService);
        s1.putExtra("EXTRA_RESCHEDULE_NUMBER", l1);
        pendingintent = PendingIntent.getService(this, 0, s1, 0x8000000);
        if (flag)
        {
            l1 = d(0x668a0L);
            t.setRepeating(0, System.currentTimeMillis() + l1, l1, pendingintent);
            return;
        }
        if (l2 == -1L)
        {
            s1 = Long.valueOf(n);
            n = Math.max(n, l3);
            n = (long)((double)n * 2D);
        } else
        if (l2 == -2L)
        {
            s1 = Long.valueOf(1000L);
            n = 1000L;
        } else
        {
            s1 = Long.valueOf(l2);
        }
        l1 = d(Long.valueOf(Math.max(s1.longValue(), l3)).longValue());
        t.set(0, System.currentTimeMillis() + Long.valueOf(l1).longValue(), pendingintent);
    }

    private void a(long l1, String s1)
    {
        a(l1, 3000L, s1, 0L);
    }

    private void a(long l1, boolean flag, String s1)
    {
        a(l1, flag, s1, 0L);
    }

    private void a(long l1, boolean flag, String s1, long l2)
    {
        long l3;
        if (flag)
        {
            l3 = -2L;
        } else
        {
            l3 = -1L;
        }
        a(l1, l3, s1, l2);
    }

    static void a(CommunicatorService communicatorservice, long l1, long l2)
    {
        communicatorservice.a(l1, l2);
    }

    static void a(CommunicatorService communicatorservice, long l1, String s1, long l2)
    {
        communicatorservice.a(l1, false, s1, l2);
    }

    static void a(CommunicatorService communicatorservice, long l1, boolean flag, String s1)
    {
        communicatorservice.a(l1, flag, s1);
    }

    static boolean a(CommunicatorService communicatorservice, boolean flag)
    {
        communicatorservice.m = flag;
        return flag;
    }

    static long b(CommunicatorService communicatorservice)
    {
        return communicatorservice.i;
    }

    static long b(CommunicatorService communicatorservice, long l1)
    {
        communicatorservice.l = l1;
        return l1;
    }

    private void b(long l1)
    {
        Object obj;
        long l2;
        if (!h)
        {
            h = true;
            ((a)getApplication()).a().a(this);
            r.a(a.c(), u);
            r.a(b.e(), v, new o());
            r.a(b.o(), v, new o());
            r.a(c.a(), v, new o());
            r.a(a.a(), w);
            s = (ConnectivityManager)getSystemService("connectivity");
            t = (AlarmManager)getSystemService("alarm");
            registerReceiver(x, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            getSystemService("power");
        }
        l2 = a(l1);
        obj = a;
        ((kik.a.e.f) (obj)).l();
        JVM INSTR tableswitch 1 4: default 633
    //                   1 270
    //                   2 260
    //                   3 260
    //                   4 287;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        a(l2, "not in stable state");
        return;
_L2:
        try
        {
            c(l1);
            return;
        }
        catch (kik.a.e.f.a a1)
        {
            a(l2, "bad state");
        }
        return;
_L3:
        l1 = System.currentTimeMillis();
        if (l1 < o)
        {
            a(o, l2);
            return;
        }
        kik.a.e.f f1;
        o = 0L;
        f1 = a;
        if (s != null) goto _L5; else goto _L4
_L4:
        int i1 = 1;
_L20:
        if (i1 != 0) goto _L7; else goto _L6
_L6:
        a(l2, false, "no network available");
        return;
_L5:
        a1 = s.getActiveNetworkInfo();
        if (a1 == null) goto _L9; else goto _L8
_L8:
        if (a1.isConnected())
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
          goto _L9
_L7:
        if (l1 > p)
        {
            p = System.currentTimeMillis() + 0x2bf20L;
            q = 0;
        }
        i1 = q;
        q = i1 + 1;
        if (i1 <= 10) goto _L11; else goto _L10
_L10:
        (new StringBuilder("Connection limiter in effect. Retry number ")).append(q).append(" exceeds 10 max. Allowing connection attempt resume in:").append((p - System.currentTimeMillis()) / 1000L).append(" seconds");
        a(p + 1000L, l2);
        return;
_L11:
        if (!f1.m() && !m) goto _L13; else goto _L12
_L12:
        if (s == null) goto _L15; else goto _L14
_L14:
        Object obj1 = s.getActiveNetworkInfo();
        if (obj1 != null) goto _L17; else goto _L16
_L16:
        a1 = "none";
_L18:
        obj1 = new kik.android.net.communicator.f(this, l2);
        boolean flag;
        if (SystemClock.elapsedRealtime() - l > 0xa4cb800L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f1.a(a1, ((kik.a.e.f.b) (obj1)), flag);
        return;
_L17:
        a1 = ((NetworkInfo) (obj1)).getTypeName();
        obj1 = ((NetworkInfo) (obj1)).getSubtypeName();
        if (!kik.a.h.i.a(a1))
        {
            if (!kik.a.h.i.a(((CharSequence) (obj1))))
            {
                a1 = (new StringBuilder()).append(a1).append("-").append(((String) (obj1))).toString();
            }
            continue; /* Loop/switch isn't completed */
        }
_L15:
        a1 = "unknown";
        if (true) goto _L18; else goto _L13
_L13:
        return;
_L9:
        i1 = 0;
        if (true) goto _L20; else goto _L19
_L19:
    }

    static boolean b(CommunicatorService communicatorservice, boolean flag)
    {
        communicatorservice.e = flag;
        return flag;
    }

    static long c(CommunicatorService communicatorservice, long l1)
    {
        communicatorservice.d = l1;
        return l1;
    }

    private void c(long l1)
    {
        long l2 = a(l1);
        a.a(new g(this, l1, l2));
    }

    static boolean c(CommunicatorService communicatorservice)
    {
        return communicatorservice.e;
    }

    private long d(long l1)
    {
        long l2 = (long)((1.0D + 0.25D * j.nextDouble()) * (double)l1);
        (new StringBuilder("Jittered from ")).append(l1).append(" to ").append(l2);
        return l2;
    }

    static long d(CommunicatorService communicatorservice)
    {
        return communicatorservice.d;
    }

    static long d(CommunicatorService communicatorservice, long l1)
    {
        communicatorservice.i = l1;
        return l1;
    }

    static void e(CommunicatorService communicatorservice)
    {
        communicatorservice.c(1L);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        super.onDestroy();
        r.a();
    }

    public void onStart(Intent intent, int i1)
    {
        long l1 = 1L;
        if (intent != null)
        {
            l1 = intent.getLongExtra("EXTRA_RESCHEDULE_NUMBER", 1L);
        }
        b(l1);
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        long l1 = 1L;
        if (intent != null)
        {
            l1 = intent.getLongExtra("EXTRA_RESCHEDULE_NUMBER", 1L);
        }
        b(l1);
        return 1;
    }

}
