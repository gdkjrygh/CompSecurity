// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.internal.sso.a;
import com.microsoft.onlineid.internal.sso.client.b;
import com.microsoft.onlineid.internal.sso.f;
import com.microsoft.onlineid.internal.sso.service.operation.c;
import com.microsoft.onlineid.internal.sso.service.operation.e;
import com.microsoft.onlineid.internal.sso.service.operation.g;
import com.microsoft.onlineid.internal.sso.service.operation.h;
import com.microsoft.onlineid.internal.sso.service.operation.i;
import com.microsoft.onlineid.internal.sso.service.operation.j;
import com.microsoft.onlineid.internal.sso.service.operation.k;
import com.microsoft.onlineid.sts.d;

public class MsaSsoService extends Service
{

    private com.microsoft.onlineid.internal.sso.d a;
    private com.microsoft.onlineid.sts.a b;
    private com.microsoft.onlineid.internal.f.a c;
    private com.microsoft.onlineid.internal.e.f d;
    private d e;
    private b f;
    private final a.a g = new a.a() {

        final MsaSsoService a;

        public final Bundle a(Bundle bundle)
            throws RemoteException
        {
            return a.a(new com.microsoft.onlineid.internal.sso.service.operation.b(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
        }

        public final Bundle b(Bundle bundle)
            throws RemoteException
        {
            return a.a(new com.microsoft.onlineid.internal.sso.service.operation.a(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
        }

        public final Bundle c(Bundle bundle)
            throws RemoteException
        {
            return a.a(new com.microsoft.onlineid.internal.sso.service.operation.d(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
        }

        public final Bundle d(Bundle bundle)
            throws RemoteException
        {
            return a.a(new c(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
        }

        public final Bundle e(Bundle bundle)
            throws RemoteException
        {
            return a.a(new e(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
        }

        public final Bundle f(Bundle bundle)
            throws RemoteException
        {
            return a.a(new g(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
        }

        public final Bundle g(Bundle bundle)
            throws RemoteException
        {
            return a.a(new com.microsoft.onlineid.internal.sso.service.operation.f(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
        }

        public final Bundle h(Bundle bundle)
            throws RemoteException
        {
            return a.a(new h(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
        }

        public final Bundle i(Bundle bundle)
            throws RemoteException
        {
            return a.a(new k(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.c(a)));
        }

        public final Bundle j(Bundle bundle)
            throws RemoteException
        {
            return a.a(new i(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.c(a)));
        }

            
            {
                a = MsaSsoService.this;
                super();
            }
    };

    public MsaSsoService()
    {
    }

    static com.microsoft.onlineid.sts.a a(MsaSsoService msassoservice)
    {
        return msassoservice.b;
    }

    static com.microsoft.onlineid.internal.f.a b(MsaSsoService msassoservice)
    {
        return msassoservice.c;
    }

    static com.microsoft.onlineid.internal.e.f c(MsaSsoService msassoservice)
    {
        return msassoservice.d;
    }

    protected final Bundle a(j j1)
    {
        try
        {
            e.c();
            f.a();
            o.a(j1.c(), "Package name");
            o.a(j1.d(), "SDK version");
            o.a(j1.g(), "Config version");
            if (j1.e() == 0)
            {
                throw new IllegalArgumentException("SSO version must not be empty.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            com.microsoft.onlineid.internal.c.d.b("SSO Service caught exception", j1);
            return com.microsoft.onlineid.internal.sso.a.a(j1);
        }
        if (j1.e() <= 1)
        {
            return com.microsoft.onlineid.internal.sso.a.a(f.c, "Invalid SSO version.");
        }
        String s = j1.c();
        if (!a.a(Binder.getCallingUid(), s))
        {
            return com.microsoft.onlineid.internal.sso.a.a(f.b, "Invalid caller package name.");
        }
        String s1 = j1.g();
        if (!e.a(j1.h()) && e.a(s1))
        {
            return com.microsoft.onlineid.internal.sso.a.a(f.k, (new StringBuilder("The caller must update config to version: ")).append(e.a()).toString());
        }
        e.b(s1);
        if (!a.a(s))
        {
            return com.microsoft.onlineid.internal.sso.a.a(f.b, "The caller is not authorized to invoke this service.");
        }
        j1 = j1.a();
        return j1;
    }

    public IBinder onBind(Intent intent)
    {
        return g;
    }

    public void onCreate()
    {
        a = new com.microsoft.onlineid.internal.sso.d(getApplicationContext());
        b = new com.microsoft.onlineid.sts.a(getApplicationContext());
        c = new com.microsoft.onlineid.internal.f.a(getApplicationContext());
        d = new com.microsoft.onlineid.internal.e.f(getApplicationContext());
        e = new d(getApplicationContext());
        f = new b(getApplicationContext());
    }
}
