// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.qihoo.security.env.a;
import com.qihoo.security.service.ProcessClearService;
import com.qihoo.security.service.SecurityService;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.core.c.c;

public class b
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i, int j);
    }


    private static final String a = com/qihoo/security/opti/a/b.getSimpleName();
    private Context b;
    private c c;
    private a d;
    private ServiceConnection e;
    private com.qihoo360.mobilesafe.core.c.b f;

    public b(Context context)
    {
        b = null;
        c = null;
        d = null;
        e = new ServiceConnection() {

            final b a;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                com.qihoo.security.opti.a.b.a(a, com.qihoo360.mobilesafe.core.c.c.a.a(ibinder));
                if (com.qihoo.security.opti.a.b.a(a) != null)
                {
                    try
                    {
                        com.qihoo.security.opti.a.b.a(a).a(b.b(a));
                    }
                    // Misplaced declaration of an exception variable
                    catch (ComponentName componentname) { }
                    com.qihoo.security.opti.a.b.c(a);
                }
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                if (com.qihoo.security.opti.a.b.a(a) != null)
                {
                    try
                    {
                        com.qihoo.security.opti.a.b.a(a).b(b.b(a));
                    }
                    // Misplaced declaration of an exception variable
                    catch (ComponentName componentname) { }
                }
                com.qihoo.security.opti.a.b.a(a, null);
            }

            
            {
                a = b.this;
                super();
            }
        };
        f = new com.qihoo360.mobilesafe.core.c.b() {

            final b a;

            public void b(int i, int j)
                throws RemoteException
            {
                super.b(i, j);
                if (b.d(a) != null)
                {
                    b.d(a).a(i, j);
                }
                a.a();
            }

            
            {
                a = b.this;
                super();
            }
        };
        b = context;
    }

    static c a(b b1)
    {
        return b1.c;
    }

    static c a(b b1, c c1)
    {
        b1.c = c1;
        return c1;
    }

    static com.qihoo360.mobilesafe.core.c.b b(b b1)
    {
        return b1.f;
    }

    private void c()
    {
        Utils.bindService(b, com/qihoo/security/service/SecurityService, com.qihoo.security.env.a.f, e, 1);
    }

    static void c(b b1)
    {
        b1.e();
    }

    static a d(b b1)
    {
        return b1.d;
    }

    private void d()
    {
        if (c != null)
        {
            try
            {
                c.b(f);
            }
            catch (Exception exception) { }
        }
        Utils.unbindService(a, b, e);
        c = null;
    }

    private void e()
    {
        boolean flag;
        try
        {
            flag = c.f();
        }
        catch (Exception exception)
        {
            return;
        }
        if (!flag)
        {
            try
            {
                c.e();
                ProcessClearService.a(null);
                return;
            }
            catch (Exception exception1)
            {
                return;
            }
        }
        if (d != null)
        {
            d.a();
        }
        a();
        return;
    }

    public void a()
    {
        d();
    }

    public void a(a a1)
    {
        d = a1;
    }

    public void b()
    {
        c();
    }

}
