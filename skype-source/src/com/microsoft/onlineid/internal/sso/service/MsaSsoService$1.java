// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service;

import android.os.Bundle;
import android.os.RemoteException;
import com.microsoft.onlineid.internal.sso.service.operation.a;
import com.microsoft.onlineid.internal.sso.service.operation.b;
import com.microsoft.onlineid.internal.sso.service.operation.c;
import com.microsoft.onlineid.internal.sso.service.operation.d;
import com.microsoft.onlineid.internal.sso.service.operation.e;
import com.microsoft.onlineid.internal.sso.service.operation.f;
import com.microsoft.onlineid.internal.sso.service.operation.g;
import com.microsoft.onlineid.internal.sso.service.operation.h;
import com.microsoft.onlineid.internal.sso.service.operation.i;
import com.microsoft.onlineid.internal.sso.service.operation.k;

// Referenced classes of package com.microsoft.onlineid.internal.sso.service:
//            MsaSsoService

final class a extends a
{

    final MsaSsoService a;

    public final Bundle a(Bundle bundle)
        throws RemoteException
    {
        return a.a(new b(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
    }

    public final Bundle b(Bundle bundle)
        throws RemoteException
    {
        return a.a(new a(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
    }

    public final Bundle c(Bundle bundle)
        throws RemoteException
    {
        return a.a(new d(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
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
        return a.a(new f(a.getApplicationContext(), bundle, com.microsoft.onlineid.internal.sso.service.MsaSsoService.a(a), com.microsoft.onlineid.internal.sso.service.MsaSsoService.b(a)));
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

    A(MsaSsoService msassoservice)
    {
        a = msassoservice;
        super();
    }
}
