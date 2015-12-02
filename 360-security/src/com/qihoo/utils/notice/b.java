// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.utils.notice;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.qihoo.security.base.BaseBroadcastReceiver;
import com.qihoo.security.base.a;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.utils.notice:
//            a, c

public class b extends com.qihoo.security.base.a
{
    private class a extends BaseBroadcastReceiver
    {

        final b b;

        public void a(Context context)
        {
            try
            {
                IntentFilter intentfilter = new IntentFilter();
                intentfilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentfilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentfilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                context.registerReceiver(this, intentfilter);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }

        protected void a(Context context, Intent intent)
        {
            boolean flag = true;
            if ("android.intent.action.BATTERY_CHANGED".equals(a))
            {
                int i1 = intent.getIntExtra("level", 0);
                int j1 = intent.getIntExtra("scale", 100);
                b.c(b, (i1 * 100) / j1);
                i1 = intent.getIntExtra("status", 1);
                context = b;
                if (2 != i1)
                {
                    flag = false;
                }
                com.qihoo.utils.notice.b.a(context, flag);
            } else
            {
                if ("android.intent.action.ACTION_POWER_CONNECTED".equals(a))
                {
                    com.qihoo.utils.notice.b.a(b, true);
                    return;
                }
                if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(a))
                {
                    com.qihoo.utils.notice.b.a(b, false);
                    return;
                }
            }
        }

        public void b(Context context)
        {
            try
            {
                context.unregisterReceiver(this);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }

        private a()
        {
            b = b.this;
            super();
        }

    }


    private final com.qihoo.security.service.a c;
    private final a d = new a();
    private final com.qihoo.security.app.a e;
    private boolean f;
    private int g;
    private int h;
    private String i;
    private long j;
    private int k;
    private final AtomicBoolean l = new AtomicBoolean(false);
    private final com.qihoo.security.app.a.b m = new com.qihoo.security.app.a.b() {

        final b a;

        public void a(int i1, int j1)
        {
        }

        public void a(List list, Map map)
        {
label0:
            {
                com.qihoo.utils.notice.b.a(a).set(false);
                b.b(a);
                if (list != null && list.size() > 0)
                {
                    com.qihoo.utils.notice.b.a(a, 0L);
                    map = new ArrayList();
                    list = list.iterator();
                    do
                    {
                        if (!list.hasNext())
                        {
                            break;
                        }
                        ProcessInfo processinfo = (ProcessInfo)list.next();
                        if (processinfo.flag == 0)
                        {
                            map.add(processinfo);
                            b.b(a, processinfo.useMemory);
                        }
                    } while (true);
                    com.qihoo.utils.notice.b.a(a, map.size());
                    Collections.sort(map, b.c(a));
                    list = (ProcessInfo)map.get(0);
                    long l1 = ((ProcessInfo) (list)).useMemory;
                    if ("com.qihoo.security.lite".equals(((ProcessInfo) (list)).packageName) || l1 / 25L <= com.qihoo360.mobilesafe.b.s.c() / 100L)
                    {
                        break label0;
                    }
                    com.qihoo.utils.notice.b.a(a, ((ProcessInfo) (list)).packageName);
                }
                return;
            }
            com.qihoo.utils.notice.b.a(a, "");
        }

            
            {
                a = b.this;
                super();
            }
    };
    private final Comparator n = new Comparator() {

        final b a;

        public int a(ProcessInfo processinfo, ProcessInfo processinfo1)
        {
            if (processinfo.useMemory < processinfo1.useMemory)
            {
                return 1;
            }
            return processinfo.useMemory <= processinfo1.useMemory ? 0 : -1;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((ProcessInfo)obj, (ProcessInfo)obj1);
        }

            
            {
                a = b.this;
                super();
            }
    };
    private final com.qihoo.security.service.c.a o = new com.qihoo.security.service.c.a() {

        final b a;

        public void a(boolean flag, boolean flag1, boolean flag2, String s1)
            throws RemoteException
        {
            if (com.qihoo360.mobilesafe.b.s.a(8, 23))
            {
                if (!b.d(a) && com.qihoo.utils.notice.b.a(a).compareAndSet(false, true))
                {
                    b.e(a).a(false);
                }
                boolean flag3;
                if (!com.qihoo.utils.notice.c.a(b.f(a), 4115))
                {
                    long l1 = b.e(a).c();
                    long l2 = SharedPref.b(b.g(a), "sp_key_enter_result_time", 0L);
                    if (l1 > 0L && l2 > 0L)
                    {
                        if (System.currentTimeMillis() - l2 > 0xa4cb800L)
                        {
                            flag3 = true;
                        } else
                        {
                            flag3 = false;
                        }
                        if (b.h(a) > 70 && !DateUtils.isToday(l1) && flag3)
                        {
                            b.j(a).sendMessage(b.i(a).obtainMessage(400));
                        }
                    }
                }
                if (!com.qihoo.utils.notice.c.a(b.k(a), 4111) && b.l(a) < 10 && !b.m(a))
                {
                    l1 = com.qihoo360.mobilesafe.b.s.c();
                    l2 = com.qihoo360.mobilesafe.b.s.d();
                    if (com.qihoo360.mobilesafe.b.s.b(b.l(a), l1 - l2, b.n(a)) > 30)
                    {
                        b.p(a).sendMessage(b.o(a).obtainMessage(100));
                    }
                }
                if (!com.qihoo.utils.notice.c.a(b.q(a), 4112))
                {
                    if (flag || flag2)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    if (b.l(a) < 30 && b.h(a) > 75 && flag3)
                    {
                        if (!b.r(a).hasMessages(200))
                        {
                            b.t(a).sendMessageDelayed(com.qihoo.utils.notice.b.s(a).obtainMessage(200), 0x2bf20L);
                        }
                    } else
                    {
                        b.u(a).removeMessages(200);
                    }
                }
                if (!com.qihoo.utils.notice.c.a(b.v(a), 4113))
                {
                    if (!TextUtils.isEmpty(b.w(a)) && b.w(a) != s1)
                    {
                        if (!b.x(a).hasMessages(300))
                        {
                            b.z(a).sendMessageDelayed(b.y(a).obtainMessage(300), 60000L);
                            return;
                        }
                    } else
                    {
                        com.qihoo.utils.notice.b.a(a, "");
                        b.A(a).removeMessages(300);
                        return;
                    }
                }
            }
        }

            
            {
                a = b.this;
                super();
            }
    };
    private final com.qihoo.security.service.a p = new com.qihoo.security.service.a() {

        final b a;

        public void a(int i1)
            throws RemoteException
        {
            b.b(a, i1);
        }

            
            {
                a = b.this;
                super();
            }
    };
    private long q;

    public b(Context context, com.qihoo.security.service.a a1)
    {
        super(context);
        q = System.currentTimeMillis();
        c = a1;
        try
        {
            c.a(o);
            c.a(p);
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        d.a(a);
        e = com.qihoo.security.app.a.a(a);
        e.a(m);
        l.set(true);
        e.a(false);
    }

    static com.qihoo.security.base.a.a A(b b1)
    {
        return b1.b;
    }

    static int a(b b1, int i1)
    {
        b1.k = i1;
        return i1;
    }

    static long a(b b1, long l1)
    {
        b1.j = l1;
        return l1;
    }

    static String a(b b1, String s1)
    {
        b1.i = s1;
        return s1;
    }

    static AtomicBoolean a(b b1)
    {
        return b1.l;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.f = flag;
        return flag;
    }

    static int b(b b1, int i1)
    {
        b1.h = i1;
        return i1;
    }

    static long b(b b1, long l1)
    {
        l1 = b1.j + l1;
        b1.j = l1;
        return l1;
    }

    static void b(b b1)
    {
        b1.f();
    }

    static int c(b b1, int i1)
    {
        b1.g = i1;
        return i1;
    }

    static Comparator c(b b1)
    {
        return b1.n;
    }

    private com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus d()
    {
        return com.qihoo.security.booster.a.a(com.qihoo360.mobilesafe.b.s.a(com.qihoo360.mobilesafe.b.s.c(), com.qihoo360.mobilesafe.b.s.d()));
    }

    static boolean d(b b1)
    {
        return b1.e();
    }

    static com.qihoo.security.app.a e(b b1)
    {
        return b1.e;
    }

    private boolean e()
    {
        return Math.abs(System.currentTimeMillis() - q) < 60000L;
    }

    static Context f(b b1)
    {
        return b1.a;
    }

    private void f()
    {
        q = System.currentTimeMillis();
    }

    static Context g(b b1)
    {
        return b1.a;
    }

    static int h(b b1)
    {
        return b1.h;
    }

    static com.qihoo.security.base.a.a i(b b1)
    {
        return b1.b;
    }

    static com.qihoo.security.base.a.a j(b b1)
    {
        return b1.b;
    }

    static Context k(b b1)
    {
        return b1.a;
    }

    static int l(b b1)
    {
        return b1.g;
    }

    static boolean m(b b1)
    {
        return b1.f;
    }

    static long n(b b1)
    {
        return b1.j;
    }

    static com.qihoo.security.base.a.a o(b b1)
    {
        return b1.b;
    }

    static com.qihoo.security.base.a.a p(b b1)
    {
        return b1.b;
    }

    static Context q(b b1)
    {
        return b1.a;
    }

    static com.qihoo.security.base.a.a r(b b1)
    {
        return b1.b;
    }

    static com.qihoo.security.base.a.a s(b b1)
    {
        return b1.b;
    }

    static com.qihoo.security.base.a.a t(b b1)
    {
        return b1.b;
    }

    static com.qihoo.security.base.a.a u(b b1)
    {
        return b1.b;
    }

    static Context v(b b1)
    {
        return b1.a;
    }

    static String w(b b1)
    {
        return b1.i;
    }

    static com.qihoo.security.base.a.a x(b b1)
    {
        return b1.b;
    }

    static com.qihoo.security.base.a.a y(b b1)
    {
        return b1.b;
    }

    static com.qihoo.security.base.a.a z(b b1)
    {
        return b1.b;
    }

    public void a()
    {
        try
        {
            c.b(o);
        }
        catch (Exception exception1) { }
        try
        {
            c.b(p);
        }
        catch (Exception exception) { }
        if (d != null)
        {
            d.b(a);
        }
        if (m != null)
        {
            e.b(m);
        }
        super.a();
    }

    protected void a(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 5: default 56
    //                   100: 57
    //                   200: 114
    //                   300: 172
    //                   400: 187
    //                   500: 209;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        long l1 = com.qihoo360.mobilesafe.b.s.c();
        long l3 = com.qihoo360.mobilesafe.b.s.d();
        message = com.qihoo360.mobilesafe.b.s.a(g, l1 - l3, j);
        com.qihoo.utils.notice.a.a().b(com.qihoo.security.ui.exam.ExamMainAnim.ExamStatus.IN_DANGER, (new StringBuilder()).append(message[0]).append(message[1]).toString());
        return;
_L3:
        long l2 = com.qihoo360.mobilesafe.b.s.c();
        long l4 = com.qihoo360.mobilesafe.b.s.d();
        message = com.qihoo360.mobilesafe.b.s.a(g, l2 - l4, j);
        com.qihoo.utils.notice.a.a().c(d(), (new StringBuilder()).append(message[0]).append(message[1]).toString());
        return;
_L4:
        com.qihoo.utils.notice.a.a().d(d(), i);
        return;
_L5:
        if (k > 0)
        {
            com.qihoo.utils.notice.a.a().a(d(), k);
            return;
        }
          goto _L1
_L6:
        com.qihoo.utils.notice.a.a().a(d());
        return;
    }

    public void b()
    {
        if (com.qihoo360.mobilesafe.b.s.a(8, 23)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1 = 0;
        int j1 = c.c();
        i1 = j1;
_L4:
        if (!com.qihoo.utils.notice.c.a(a, 4104) && i1 > 85)
        {
            if (!b.hasMessages(500))
            {
                b.sendMessageDelayed(b.obtainMessage(500), 10000L);
                return;
            } else
            {
                b.removeMessages(500);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        RemoteException remoteexception;
        remoteexception;
          goto _L4
    }

    public void c()
    {
    }
}
