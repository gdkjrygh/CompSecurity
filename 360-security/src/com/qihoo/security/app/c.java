// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.floatview.a.a;
import com.qihoo.security.floatview.a.b;
import com.qihoo.security.service.SecurityService;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.share.SharedPref;

public class c
{

    static c a;
    private Context b;
    private b c;
    private com.qihoo.security.service.a d;
    private final ServiceConnection e = new ServiceConnection() {

        final c a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.app.c.a(a, com.qihoo.security.service.a.a.a(ibinder));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.app.c.a(a, null);
        }

            
            {
                a = c.this;
                super();
            }
    };
    private final ServiceConnection f = new ServiceConnection() {

        final c a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.app.c.a(a, com.qihoo.security.floatview.a.b.a.a(ibinder));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.app.c.a(a, null);
        }

            
            {
                a = c.this;
                super();
            }
    };

    private c()
    {
        d = null;
        b = SecurityApplication.a();
        Utils.bindService(b, com/qihoo/security/service/SecurityService, "com.qihoo.security.service.INTERNAL_CONTROL", e, 1);
        Utils.bindService(b, com/qihoo/security/service/SecurityService, "com.qihoo.security.floatview.SERVICER", f, 1);
    }

    public static c a()
    {
        com/qihoo/security/app/c;
        JVM INSTR monitorenter ;
        c c1;
        if (a == null)
        {
            a = new c();
        }
        c1 = a;
        com/qihoo/security/app/c;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    static b a(c c1, b b1)
    {
        c1.c = b1;
        return b1;
    }

    static com.qihoo.security.service.a a(c c1, com.qihoo.security.service.a a1)
    {
        c1.d = a1;
        return a1;
    }

    public void b()
    {
        boolean flag;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        flag = SharedPref.b(b, "fv_enabled", com.qihoo.security.floatview.a.a.e());
        c.a(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }

    public void c()
    {
        boolean flag;
        flag = SharedPref.b(b, "notification", true);
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        d.a(flag);
        return;
        RemoteException remoteexception;
        remoteexception;
    }
}
