// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.content.g;
import android.text.TextUtils;
import com.qihoo.security.clearengine.b.a;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.trashclear.service.e;
import com.qihoo.security.profile.k;
import com.qihoo.security.receiver.CommonReceiver;
import com.qihoo.security.receiver.PackageMonitor;
import com.qihoo.security.ui.b.f;
import com.qihoo.utils.notice.b;
import com.qihoo360.common.utils.PermissionUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.core.c;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.service:
//            b, c

public class SecurityService extends Service
    implements com.qihoo.security.clearengine.b.a.a, com.qihoo.security.notify.c.a, com.qihoo.security.receiver.CommonReceiver.a, com.qihoo.security.receiver.PackageMonitor.a
{
    private final class a extends Handler
    {

        final SecurityService a;

        public void a(int i1, Object obj)
        {
            sendMessage(obtainMessage(i1, obj));
        }

        public void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 0 5: default 44
        //                       0 50
        //                       1 90
        //                       2 119
        //                       3 159
        //                       4 188
        //                       5 284;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            super.handleMessage(message);
_L9:
            return;
_L2:
            if (!com.qihoo.security.service.SecurityService.a(a).register((com.qihoo.security.service.b)message.obj)) goto _L9; else goto _L8
_L8:
            com.qihoo.security.service.SecurityService.b(a);
            com.qihoo.security.service.b.a(com.qihoo.security.service.SecurityService.c(a), true);
            return;
_L3:
            if (!com.qihoo.security.service.SecurityService.a(a).unregister((com.qihoo.security.service.b)message.obj)) goto _L9; else goto _L10
_L10:
            com.qihoo.security.service.SecurityService.d(a);
            return;
_L4:
            if (!com.qihoo.security.service.SecurityService.e(a).register((com.qihoo.security.service.c)message.obj)) goto _L9; else goto _L11
_L11:
            com.qihoo.security.service.SecurityService.f(a);
            com.qihoo.security.service.b.b(com.qihoo.security.service.SecurityService.c(a), true);
            return;
_L5:
            if (!com.qihoo.security.service.SecurityService.e(a).unregister((com.qihoo.security.service.c)message.obj)) goto _L9; else goto _L12
_L12:
            com.qihoo.security.service.SecurityService.g(a);
            return;
_L6:
            int i1 = com.qihoo.security.service.SecurityService.e(a).beginBroadcast();
            com.qihoo.security.service.SecurityService.a(a, i1);
            while (i1 > 0) 
            {
                i1--;
                try
                {
                    ((com.qihoo.security.service.c)com.qihoo.security.service.SecurityService.e(a).getBroadcastItem(i1)).a(SecurityService.h(a), SecurityService.i(a), SecurityService.j(a), com.qihoo.security.service.b.b(com.qihoo.security.service.SecurityService.c(a)));
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
            }
            com.qihoo.security.service.SecurityService.e(a).finishBroadcast();
            return;
_L7:
            int j1 = com.qihoo.security.service.SecurityService.a(a).beginBroadcast();
            com.qihoo.security.service.SecurityService.b(a, j1);
            while (j1 > 0) 
            {
                j1--;
                try
                {
                    ((com.qihoo.security.service.b)com.qihoo.security.service.SecurityService.a(a).getBroadcastItem(j1)).a(com.qihoo.security.service.SecurityService.k(a));
                }
                // Misplaced declaration of an exception variable
                catch (Message message) { }
            }
            com.qihoo.security.service.SecurityService.a(a).finishBroadcast();
            return;
        }

        public a(Looper looper)
        {
            a = SecurityService.this;
            super(looper);
        }
    }

    private final class b extends Handler
    {

        final SecurityService a;
        private ArrayList b;
        private String c;

        static void a(b b1)
        {
            b1.d();
        }

        static void a(b b1, boolean flag)
        {
            b1.a(flag);
        }

        private void a(boolean flag)
        {
            if (!SecurityService.r(a) || SecurityService.s(a) <= 0)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            if (!flag) goto _L2; else goto _L1
_L1:
            Message message = new Message();
            message.what = 2;
            message.arg1 = 100;
            com.qihoo.security.service.SecurityService.c(a).sendMessage(message);
_L4:
            return;
_L2:
            if (hasMessages(2)) goto _L4; else goto _L3
_L3:
            Message message1 = new Message();
            message1.what = 2;
            message1.arg1 = 100;
            com.qihoo.security.service.SecurityService.c(a).sendMessageDelayed(message1, 30000L);
            return;
            com.qihoo.security.service.SecurityService.c(a).removeMessages(2);
            com.qihoo.security.service.SecurityService.d(a, 0);
            return;
        }

        static String b(b b1)
        {
            return b1.c;
        }

        private void b()
        {
            if (SecurityService.q(a) == null)
            {
                com.qihoo.security.service.SecurityService.a(a, new com.qihoo360.mobilesafe.core.d.b(SecurityService.p(a)));
            }
            String s1 = SecurityService.q(a).a();
            Object obj = s1;
            if (TextUtils.isEmpty(s1))
            {
                obj = c;
            }
            com.qihoo.security.service.SecurityService.a(a, false);
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && !((String) (obj)).equals(c))
            {
                com.qihoo.security.ui.result.a.a().a(((String) (obj)), true);
                c = ((String) (obj));
                com.qihoo.security.service.SecurityService.b(a, b.contains(c));
                obj = a;
                boolean flag;
                if (SecurityService.h(a))
                {
                    flag = false;
                } else
                {
                    flag = c.equals("com.qihoo.security.lite");
                }
                com.qihoo.security.service.SecurityService.c(((SecurityService) (obj)), flag);
            }
            if (SecurityService.h(a) && !SharedPref.b(SecurityService.p(a), "clear_default_pre_is_need_run", true))
            {
                SharedPref.a(SecurityService.p(a), "clear_default_pre_is_need_run", true);
            }
            SecurityService.o(a).sendEmptyMessage(4);
            b(false);
        }

        static void b(b b1, boolean flag)
        {
            b1.b(flag);
        }

        private void b(boolean flag)
        {
            if (SecurityService.r(a) && SecurityService.t(a) > 0)
            {
                if (flag)
                {
                    com.qihoo.security.service.SecurityService.c(a).removeMessages(1);
                    com.qihoo.security.service.SecurityService.c(a).sendEmptyMessage(1);
                } else
                if (!hasMessages(1))
                {
                    com.qihoo.security.service.SecurityService.c(a).sendEmptyMessageDelayed(1, 2000L);
                    return;
                }
            }
        }

        private void c()
        {
            sendEmptyMessage(3);
        }

        private void d()
        {
            sendEmptyMessage(4);
        }

        public void a()
        {
            if (SecurityService.r(a) && SecurityService.s(a) > 0)
            {
                Message message = new Message();
                message.what = 2;
                message.arg1 = 200;
                com.qihoo.security.service.SecurityService.c(a).removeMessages(2);
                com.qihoo.security.service.SecurityService.c(a).sendMessage(message);
            }
        }

        public void handleMessage(Message message)
        {
            boolean flag1 = true;
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                c();
                d();
                return;

            case 1: // '\001'
                b();
                return;

            case 2: // '\002'
                if (SecurityService.l(a) == 0L)
                {
                    com.qihoo.security.service.SecurityService.a(a, Utils.getMemoryTotalKb());
                }
                boolean flag = flag1;
                if (message.arg1 == 100)
                {
                    if (SecurityService.m(a) != null && !SecurityService.m(a).b())
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                if (flag)
                {
                    if (SecurityService.n(a) > 0)
                    {
                        com.qihoo.security.service.SecurityService.c(a, SecurityService.n(a));
                        com.qihoo.security.service.SecurityService.d(a, 0);
                    } else
                    {
                        com.qihoo.security.service.SecurityService.c(a, (int)(((SecurityService.l(a) - Utils.getMemoryFreeKb()) * 100L) / SecurityService.l(a)));
                    }
                    SecurityService.o(a).sendEmptyMessage(5);
                }
                a(false);
                return;

            case 3: // '\003'
                b = Utils.getHomeLauncherPackages(SecurityService.p(a));
                return;

            case 4: // '\004'
                com.qihoo.security.service.SecurityService.a(a, Utils.openConfigFileDescrypt(SecurityService.p(a), "lock_screen.dat", "com.qihoo.security.lite"));
                return;
            }
        }

        public b(Looper looper)
        {
            a = SecurityService.this;
            super(looper);
            sendEmptyMessage(0);
        }
    }


    public static boolean a = false;
    private List A;
    private e B;
    private com.qihoo.utils.notice.b C;
    private com.qihoo.security.app.c D;
    private com.qihoo360.mobilesafe.core.d.b E;
    private final BroadcastReceiver F = new BroadcastReceiver() {

        final SecurityService a;

        public void onReceive(Context context, Intent intent)
        {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()))
            {
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
                {
                    com.qihoo.security.opti.b.a.b(true);
                    com.qihoo.security.opti.b.a.a();
                    return;
                }
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
                {
                    com.qihoo.security.opti.b.a.b(false);
                    com.qihoo.security.opti.b.a.a();
                    com.qihoo.security.opti.b.a.b();
                    return;
                }
            }
        }

            
            {
                a = SecurityService.this;
                super();
            }
    };
    private final a.a G = new a.a() {

        final SecurityService a;

        public void a()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            SecurityService.u(a).c();
        }

        public void a(int i1)
            throws RemoteException
        {
            com.qihoo.security.service.SecurityService.d(a, i1);
            f();
        }

        public void a(int i1, int j1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            com.qihoo.utils.notice.c.d();
        }

        public void a(com.qihoo.security.service.b b1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            SecurityService.o(a).a(0, b1);
        }

        public void a(com.qihoo.security.service.c c1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            SecurityService.o(a).a(2, c1);
        }

        public void a(boolean flag)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            SecurityService.u(a).a(flag);
        }

        public void b()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            SecurityService.u(a).c();
        }

        public void b(int i1, int j1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
        }

        public void b(com.qihoo.security.service.b b1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            SecurityService.o(a).a(1, b1);
        }

        public void b(com.qihoo.security.service.c c1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            SecurityService.o(a).a(3, c1);
        }

        public int c()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            if (SecurityService.s(a) > 0 && com.qihoo.security.service.SecurityService.k(a) > 0)
            {
                return com.qihoo.security.service.SecurityService.k(a);
            } else
            {
                return Utils.getMemoryUsedPercent();
            }
        }

        public long d()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("ss");
            if (SecurityService.l(a) > 0L && com.qihoo.security.service.SecurityService.k(a) > 0)
            {
                return (SecurityService.l(a) * (long)(100 - com.qihoo.security.service.SecurityService.k(a))) / 100L;
            } else
            {
                return Utils.getMemoryFreeKb();
            }
        }

        public void e()
            throws RemoteException
        {
            com.qihoo.security.service.SecurityService.d(a, 0);
            f();
        }

        public void f()
            throws RemoteException
        {
            com.qihoo.security.service.SecurityService.c(a).a();
        }

            
            {
                a = SecurityService.this;
                super();
            }
    };
    private Handler H;
    private String I;
    private final com.qihoo.security.locale.b.a J = new com.qihoo.security.locale.b.a() {

        final SecurityService a;

        public void a()
            throws RemoteException
        {
            SecurityService.u(a).c();
            SecurityService.v(a).sendEmptyMessage(0);
        }

        public void a(String s1)
            throws RemoteException
        {
        }

        public void a(boolean flag, boolean flag1, String s1, String s2, String s3)
            throws RemoteException
        {
        }

        public void b()
            throws RemoteException
        {
        }

        public void c()
            throws RemoteException
        {
        }

        public void d()
            throws RemoteException
        {
        }

            
            {
                a = SecurityService.this;
                super();
            }
    };
    private com.qihoo360.mobilesafe.support.a.b.a b;
    private com.qihoo.security.floatview.a.a c;
    private Context d;
    private com.qihoo.security.notify.b e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private b k;
    private a l;
    private ActivityManager m;
    private KeyguardManager n;
    private int o;
    private int p;
    private long q;
    private RemoteCallbackList r;
    private int s;
    private RemoteCallbackList t;
    private int u;
    private PackageMonitor v;
    private CommonReceiver w;
    private c x;
    private com.qihoo.security.notify.a y;
    private final d z = com.qihoo.security.locale.d.a();

    public SecurityService()
    {
        b = null;
        f = false;
        I = null;
    }

    static int a(SecurityService securityservice, int i1)
    {
        securityservice.u = i1;
        return i1;
    }

    static long a(SecurityService securityservice, long l1)
    {
        securityservice.q = l1;
        return l1;
    }

    static RemoteCallbackList a(SecurityService securityservice)
    {
        return securityservice.r;
    }

    static com.qihoo360.mobilesafe.core.d.b a(SecurityService securityservice, com.qihoo360.mobilesafe.core.d.b b1)
    {
        securityservice.E = b1;
        return b1;
    }

    static List a(SecurityService securityservice, List list)
    {
        securityservice.A = list;
        return list;
    }

    private final void a(Message message)
    {
label0:
        {
            obj = com.qihoo.security.locale.d.b(d);
            synchronized (H)
            {
                if (I == null)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                if (!I.equals(obj))
                {
                    break label0;
                }
            }
            return;
        }
        try
        {
            H.wait(15000L);
        }
        catch (Exception exception) { }
        d(((String) (obj)));
        message;
        JVM INSTR monitorexit ;
        return;
        obj;
        message;
        JVM INSTR monitorexit ;
        throw obj;
        if (!SharedPref.b(this, "sp_key_last_cq_locale", "").equals(obj))
        {
            d(((String) (obj)));
        }
        message;
        JVM INSTR monitorexit ;
    }

    static void a(SecurityService securityservice, Message message)
    {
        securityservice.a(message);
    }

    static boolean a(SecurityService securityservice, boolean flag)
    {
        securityservice.h = flag;
        return flag;
    }

    static int b(SecurityService securityservice)
    {
        int i1 = securityservice.s;
        securityservice.s = i1 + 1;
        return i1;
    }

    static int b(SecurityService securityservice, int i1)
    {
        securityservice.s = i1;
        return i1;
    }

    static boolean b(SecurityService securityservice, boolean flag)
    {
        securityservice.i = flag;
        return flag;
    }

    static int c(SecurityService securityservice, int i1)
    {
        securityservice.o = i1;
        return i1;
    }

    static b c(SecurityService securityservice)
    {
        return securityservice.k;
    }

    static boolean c(SecurityService securityservice, boolean flag)
    {
        securityservice.j = flag;
        return flag;
    }

    static int d(SecurityService securityservice)
    {
        int i1 = securityservice.s;
        securityservice.s = i1 - 1;
        return i1;
    }

    static int d(SecurityService securityservice, int i1)
    {
        securityservice.p = i1;
        return i1;
    }

    private void d()
    {
    }

    private final void d(String s1)
    {
        I = s1;
        com.qihoo.security.clearengine.b.a.a(d, null, 8, s1, this);
    }

    static RemoteCallbackList e(SecurityService securityservice)
    {
        return securityservice.t;
    }

    private void e()
    {
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            Notification notification = new Notification();
            notification.setLatestEventInfo(this, null, null, PendingIntent.getActivity(this, 0, new Intent(), 0));
            startForeground(256, notification);
            return;
        } else
        {
            Notification notification1 = new Notification();
            notification1.setLatestEventInfo(this, null, null, PendingIntent.getActivity(this, 0, new Intent(), 0));
            startForeground(0, notification1);
            return;
        }
    }

    static int f(SecurityService securityservice)
    {
        int i1 = securityservice.u;
        securityservice.u = i1 + 1;
        return i1;
    }

    private final void f()
    {
        HandlerThread handlerthread = new HandlerThread("CQThread");
        handlerthread.start();
        H = new Handler(handlerthread.getLooper()) {

            final SecurityService a;

            public void handleMessage(Message message)
            {
                com.qihoo.security.service.SecurityService.a(a, message);
            }

            
            {
                a = SecurityService.this;
                super(looper);
            }
        };
    }

    static int g(SecurityService securityservice)
    {
        int i1 = securityservice.u;
        securityservice.u = i1 - 1;
        return i1;
    }

    static boolean h(SecurityService securityservice)
    {
        return securityservice.i;
    }

    static boolean i(SecurityService securityservice)
    {
        return securityservice.j;
    }

    static boolean j(SecurityService securityservice)
    {
        return securityservice.h;
    }

    static int k(SecurityService securityservice)
    {
        return securityservice.o;
    }

    static long l(SecurityService securityservice)
    {
        return securityservice.q;
    }

    static c m(SecurityService securityservice)
    {
        return securityservice.x;
    }

    static int n(SecurityService securityservice)
    {
        return securityservice.p;
    }

    static a o(SecurityService securityservice)
    {
        return securityservice.l;
    }

    static Context p(SecurityService securityservice)
    {
        return securityservice.d;
    }

    static com.qihoo360.mobilesafe.core.d.b q(SecurityService securityservice)
    {
        return securityservice.E;
    }

    static boolean r(SecurityService securityservice)
    {
        return securityservice.g;
    }

    static int s(SecurityService securityservice)
    {
        return securityservice.s;
    }

    static int t(SecurityService securityservice)
    {
        return securityservice.u;
    }

    static com.qihoo.security.notify.b u(SecurityService securityservice)
    {
        return securityservice.e;
    }

    static Handler v(SecurityService securityservice)
    {
        return securityservice.H;
    }

    public void a()
    {
        g = true;
        h = true;
        com.qihoo.security.service.b.a(k, true);
        com.qihoo.security.service.b.b(k, true);
        if (y != null)
        {
            y.a();
        }
        if (C != null)
        {
            C.b();
        }
    }

    public void a(int i1)
    {
        c.a(i1);
    }

    public void a(int i1, int j1)
    {
        Handler handler = H;
        handler;
        JVM INSTR monitorenter ;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        com.qihoo.security.support.b.b(18015, i1, j1);
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        String s2 = com.qihoo.security.locale.d.b(d);
        String s1;
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        SharedPref.a(this, "sp_key_last_cq_locale", s1);
        I = null;
        H.notifyAll();
        handler;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        handler;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(String s1)
    {
        k.sendEmptyMessage(3);
        ArrayList arraylist = new ArrayList();
        arraylist.add(s1);
        com.qihoo.security.clearengine.b.a.a(d, arraylist, 4, com.qihoo.security.locale.d.b(d), this);
        com.qihoo.security.gamebooster.b.a().b(s1);
        com.qihoo.security.installreport.a.b(s1);
    }

    public void b()
    {
    }

    public void b(String s1)
    {
        if (B != null && SharedPref.b(d, "remind_uninstallReminder_swtich", true))
        {
            B.b(s1);
        }
        com.qihoo.security.gamebooster.b.a().a(s1);
    }

    public void c()
    {
        g = false;
        h = true;
        if (C != null)
        {
            C.c();
        }
    }

    public void c(String s1)
    {
        if (s1.equals("o_c_spb.dat"))
        {
            if (x != null)
            {
                x.a();
            }
        } else
        {
            if (s1.equals("lock_screen.dat"))
            {
                com.qihoo.security.service.b.a(k);
                return;
            }
            if (s1.equals("locale.dat"))
            {
                com.qihoo.security.locale.d.a().c();
                return;
            }
        }
    }

    public IBinder onBind(Intent intent)
    {
        com.qihoo360.mobilesafe.support.a.b.a a1;
        Object obj;
        obj = null;
        a1 = obj;
        if (intent == null) goto _L2; else goto _L1
_L1:
        intent = intent.getAction();
        a1 = obj;
        if (TextUtils.isEmpty(intent)) goto _L2; else goto _L3
_L3:
        if (!"com.qihoo.security.service.ROOTSERVICE".equals(intent) && !"com.qihoo.msafe.service.ROOTSERVICE".equals(intent)) goto _L5; else goto _L4
_L4:
        a1 = b;
_L2:
        return a1;
_L5:
        if ("com.qihoo.security.service.INTERNAL_CONTROL".equals(intent))
        {
            return G;
        }
        if ("com.qihoo.security.floatview.SERVICER".equals(intent))
        {
            return c.a();
        }
        if (com.qihoo.security.env.a.f.equals(intent))
        {
            return x.c();
        }
        if (!"com.qihoo.security.ACTION_SERVICE_RESIDUAL_FILE".equals(intent))
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = obj;
        if (B != null)
        {
            return B.a();
        }
        if (true) goto _L2; else goto _L6
_L6:
        if ("com.qihoo.security.service.UIBARRIER".equals(intent))
        {
            return com.qihoo.security.ui.b.f.a(d);
        }
        a1 = obj;
        if ("com.qihoo.security.service.PROFILE".equals(intent))
        {
            return com.qihoo.security.profile.k.a(d);
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        c.a(configuration);
    }

    public void onCreate()
    {
        super.onCreate();
        d = getApplicationContext();
        a = true;
        com.qihoo.security.support.b.a(d);
        d();
        if (b == null)
        {
            b = new com.qihoo360.mobilesafe.support.a.e(this);
        }
        g = ((PowerManager)d.getSystemService("power")).isScreenOn();
        m = (ActivityManager)d.getSystemService("activity");
        n = (KeyguardManager)d.getSystemService("keyguard");
        o = 0;
        p = 0;
        q = 0L;
        r = new RemoteCallbackList();
        s = 0;
        t = new RemoteCallbackList();
        u = 0;
        v = new PackageMonitor(this);
        v.a(d);
        Object obj = new HandlerThread("ss");
        ((HandlerThread) (obj)).start();
        k = new b(((HandlerThread) (obj)).getLooper());
        l = new a(Looper.getMainLooper());
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            e = new com.qihoo.security.notify.c(d, G, this);
        } else
        {
            e = new com.qihoo.security.notify.d(d);
        }
        y = new com.qihoo.security.notify.a(d, G);
        w = new CommonReceiver(e, this);
        w.a(d);
        c = new com.qihoo.security.floatview.a.a(d, G);
        f();
        z.a(J);
        x = com.qihoo360.mobilesafe.core.c.a(d, G);
        B = new e(d);
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("android.intent.action.SCREEN_OFF");
        ((IntentFilter) (obj)).addAction("android.intent.action.SCREEN_ON");
        ((IntentFilter) (obj)).addAction("android.intent.action.USER_PRESENT");
        registerReceiver(F, ((IntentFilter) (obj)));
        C = new com.qihoo.utils.notice.b(d, G);
        D = com.qihoo.security.app.c.a();
    }

    public void onDestroy()
    {
        super.onDestroy();
        a = false;
        c.b();
        e.b();
        if (v != null)
        {
            v.b(d);
        }
        if (w != null)
        {
            w.b(d);
        }
        unregisterReceiver(F);
        if (x != null)
        {
            x.d();
        }
        z.b(J);
        r.kill();
        t.kill();
        k.getLooper().quit();
        if (y != null)
        {
            y.b();
        }
        if (B != null)
        {
            B.b();
        }
        if (C != null)
        {
            C.a();
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        j1 = 0;
        i1 = j1;
        if (intent == null) goto _L2; else goto _L1
_L1:
        String s1 = intent.getAction();
        if (!"com.qihoo.security.ACTION_FINISH".equals(s1)) goto _L4; else goto _L3
_L3:
        android.support.v4.content.g.a(d).a(new Intent("com.qihoo.security.ACTION_FINISH"));
        stopSelf();
        i1 = 1;
_L2:
        if (!f && i1 == 0)
        {
            e.c();
            f = true;
        }
        e();
        return 2;
_L4:
        if ("com.qihoo.security.action.function.notification".equals(s1))
        {
            e.a(intent.getIntExtra("com.qihoo.security.index.function.notification", -1));
            i1 = j1;
        } else
        {
            i1 = j1;
            if (!"com.qihoo360.action.START_RETRIEVE_CONF".equals(s1))
            {
                if ("com.qihoo.security.clean.scan.status".equals(s1))
                {
                    i1 = j1;
                    if (intent.getBooleanExtra("hasScan", false))
                    {
                        com.qihoo.security.opti.b.a.a(true);
                        i1 = j1;
                    }
                } else
                {
                    i1 = j1;
                    if ("com.qihoo.security.action.DAEMON".equals(s1))
                    {
                        e.c();
                        f = true;
                        com.qihoo.utils.notice.c.a(d, false);
                        i1 = j1;
                    }
                }
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onTaskRemoved(Intent intent)
    {
        super.onTaskRemoved(intent);
    }

    public boolean onUnbind(Intent intent)
    {
        return super.onUnbind(intent);
    }

}
