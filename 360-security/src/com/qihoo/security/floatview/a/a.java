// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.floatview.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import com.qihoo.security.floatview.ui.f;
import com.qihoo.security.lite.AppEnterActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.support.b;
import com.qihoo.utils.notice.c;
import com.qihoo360.common.utils.PermissionUtil;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.share.SharedPref;

public class a
    implements com.qihoo.security.floatview.ui.c.a, com.qihoo.security.floatview.ui.c.b
{

    private final com.qihoo.security.service.a a;
    private String b;
    private boolean c;
    private int d;
    private final com.qihoo.security.floatview.ui.a e;
    private final f f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private String k;
    private boolean l;
    private final Context m;
    private boolean n;
    private int o;
    private final b.a p = new b.a() {

        final a a;

        public void a(int i1)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("fvs");
            if (a.h(a) == i1)
            {
                return;
            } else
            {
                a.a(a, i1);
                SharedPref.a(a.a(a), "fv_mode", a.h(a));
                return;
            }
        }

        public void a(boolean flag2)
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("fvs");
            if (!com.qihoo.utils.notice.c.a(a.a(a))) goto _L2; else goto _L1
_L1:
            a.a(a, false);
_L10:
            if (!com.qihoo.security.floatview.a.a.b(a)) goto _L4; else goto _L3
_L3:
            com.qihoo.security.floatview.a.a.d(a).a(com.qihoo.security.floatview.a.a.c(a));
            com.qihoo.security.floatview.a.a.d(a).a(a.e(a));
_L8:
            if (!com.qihoo.security.floatview.a.a.f(a))
            {
                break; /* Loop/switch isn't completed */
            }
            a.g(a).f();
_L6:
            return;
_L2:
            if (com.qihoo.security.floatview.a.a.b(a) == flag2) goto _L6; else goto _L5
_L5:
            a.a(a, flag2);
            SharedPref.a(a.a(a), "fv_enabled", com.qihoo.security.floatview.a.a.b(a));
            continue; /* Loop/switch isn't completed */
_L4:
            try
            {
                com.qihoo.security.floatview.a.a.d(a).b(com.qihoo.security.floatview.a.a.c(a));
                com.qihoo.security.floatview.a.a.d(a).b(a.e(a));
            }
            catch (Exception exception) { }
            if (true) goto _L8; else goto _L7
_L7:
            a.g(a).g();
            return;
            if (true) goto _L10; else goto _L9
_L9:
        }

        public void a(boolean flag2, int i1)
            throws RemoteException
        {
        }

        public boolean a()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("fvs");
            return com.qihoo.security.floatview.a.a.b(a);
        }

        public int b()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("fvs");
            return a.h(a);
        }

        public void c()
            throws RemoteException
        {
        }

        public void d()
            throws RemoteException
        {
            PermissionUtil.ensureCallerPermissionByUid("fvs");
            a.d();
        }

            
            {
                a = a.this;
                super();
            }
    };
    private final com.qihoo.security.service.c.a q = new com.qihoo.security.service.c.a() {

        final a a;

        public void a(boolean flag2, boolean flag3, boolean flag4, String s)
            throws RemoteException
        {
            if (com.qihoo.utils.notice.c.a(a.a(a)))
            {
                if (a.g(a) != null && a.g(a).isShown())
                {
                    a.g(a).g();
                }
            } else
            {
                boolean flag5;
                if (com.qihoo.security.floatview.a.a.i(a) != flag2 || a.j(a) != flag3 || a.k(a) != flag4 || !s.equals(a.l(a)))
                {
                    boolean flag6 = false;
                    flag5 = flag6;
                    if (flag2)
                    {
                        flag5 = flag6;
                        if (a.k(a))
                        {
                            flag5 = true;
                        }
                    }
                    com.qihoo.security.floatview.a.a.b(a, flag2);
                    com.qihoo.security.floatview.a.a.c(a, flag3);
                    com.qihoo.security.floatview.a.a.d(a, flag4);
                    a.a(a, s);
                }
                while (false) 
                {
                    if (a.m(a) && !a.n(a) && !com.qihoo.security.floatview.a.a.i(a) && a.g(a).h())
                    {
                        a.g(a).l();
                    }
                    if (com.qihoo.security.floatview.a.a.f(a))
                    {
                        a.g(a).f();
                        if (flag5)
                        {
                            a.g(a).b();
                            a.g(a).a();
                            return;
                        }
                    } else
                    {
                        a.g(a).g();
                        return;
                    }
                }
            }
        }

            
            {
                a = a.this;
                super();
            }
    };
    private final com.qihoo.security.service.b.a r = new com.qihoo.security.service.b.a() {

        final a a;

        public void a(int i1)
            throws RemoteException
        {
            a.g(a).b(i1);
        }

            
            {
                a = a.this;
                super();
            }
    };

    public a(Context context, com.qihoo.security.service.a a1)
    {
        boolean flag1 = true;
        super();
        b = null;
        l = false;
        n = true;
        m = context;
        a = a1;
        g = true;
        h = false;
        boolean flag;
        if (((TelephonyManager)Utils.getSystemService(m, "phone")).getCallState() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (!SharedPref.a("fv_enabled"))
        {
            SharedPref.a(m, "fv_enabled", e());
        }
        c = SharedPref.b(m, "fv_enabled", e());
        if (c && com.qihoo360.mobilesafe.b.i.a())
        {
            c = false;
        }
        d = SharedPref.b(m, "fv_mode", 0);
        e = new com.qihoo.security.floatview.ui.a(m, "fv_port_x", "fv_port_Y", "fv_land_x", "fv_land_Y", true, this);
        f = new f(m, e);
        e.setOnPositionChangeListener(this);
        e.setActionListener(f);
        if (Utils.getMemoryTotal() >= 250)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        n = flag;
        if (!n);
        try
        {
            if (c)
            {
                a.a(q);
                a.a(r);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        b = com.qihoo.security.locale.d.a().f();
        o = m.getResources().getConfiguration().orientation;
    }

    static int a(a a1, int i1)
    {
        a1.d = i1;
        return i1;
    }

    static Context a(a a1)
    {
        return a1.m;
    }

    static String a(a a1, String s)
    {
        a1.k = s;
        return s;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.c = flag;
        return flag;
    }

    static boolean b(a a1)
    {
        return a1.c;
    }

    static boolean b(a a1, boolean flag)
    {
        a1.g = flag;
        return flag;
    }

    static com.qihoo.security.service.c.a c(a a1)
    {
        return a1.q;
    }

    static boolean c(a a1, boolean flag)
    {
        a1.h = flag;
        return flag;
    }

    static com.qihoo.security.service.a d(a a1)
    {
        return a1.a;
    }

    static boolean d(a a1, boolean flag)
    {
        a1.i = flag;
        return flag;
    }

    static com.qihoo.security.service.b.a e(a a1)
    {
        return a1.r;
    }

    public static boolean e()
    {
        return android.os.Build.VERSION.SDK_INT < 21;
    }

    private boolean f()
    {
        boolean flag1;
        for (flag1 = true; !g() || !c;)
        {
            return false;
        }

        if (i || !j || h) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (d == 1) goto _L4; else goto _L3
_L3:
        if (d != 0 || !g) goto _L2; else goto _L5
_L5:
        flag = flag1;
_L4:
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    static boolean f(a a1)
    {
        return a1.f();
    }

    static com.qihoo.security.floatview.ui.a g(a a1)
    {
        return a1.e;
    }

    private boolean g()
    {
        return true;
    }

    static int h(a a1)
    {
        return a1.d;
    }

    private void h()
    {
        String s = com.qihoo.security.locale.d.a().f();
        if (!b.equals(s))
        {
            b = s;
        }
    }

    static boolean i(a a1)
    {
        return a1.g;
    }

    static boolean j(a a1)
    {
        return a1.h;
    }

    static boolean k(a a1)
    {
        return a1.i;
    }

    static String l(a a1)
    {
        return a1.k;
    }

    static boolean m(a a1)
    {
        return a1.n;
    }

    static boolean n(a a1)
    {
        return a1.l;
    }

    public IBinder a()
    {
        return p;
    }

    public void a(int i1)
    {
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (!j && e.isShown())
        {
            e.l();
            e.g();
        }
    }

    public void a(int i1, int j1)
    {
    }

    public void a(Configuration configuration)
    {
        int i1 = m.getResources().getConfiguration().orientation;
        if (i1 != o)
        {
            o = i1;
        }
        e.a(configuration);
    }

    public boolean a(int i1, int j1, boolean flag)
    {
        e.a(false);
        return false;
    }

    public void b()
    {
        try
        {
            a.b(q);
        }
        catch (Exception exception2) { }
        try
        {
            a.b(r);
        }
        catch (Exception exception1) { }
        try
        {
            e.g();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void b(int i1, int j1)
    {
    }

    public void c()
    {
        com.qihoo.security.support.b.c(16001);
        com.qihoo.security.support.b.b(16002, e.getPercent());
        com.qihoo.security.support.b.a(16001);
        h();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setClass(m, com/qihoo/security/lite/AppEnterActivity);
        intent.addFlags(0x10000000);
        m.startActivity(intent);
    }

    public void c(int i1, int j1)
    {
    }

    public void d()
    {
        if (g())
        {
            l = true;
        }
    }
}
