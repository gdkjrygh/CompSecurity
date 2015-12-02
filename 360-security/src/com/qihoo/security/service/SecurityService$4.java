// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.os.Handler;
import android.os.RemoteException;
import com.qihoo.security.notify.b;

// Referenced classes of package com.qihoo.security.service:
//            SecurityService

class a extends com.qihoo.security.locale.
{

    final SecurityService a;

    public void a()
        throws RemoteException
    {
        SecurityService.u(a).c();
        SecurityService.v(a).sendEmptyMessage(0);
    }

    public void a(String s)
        throws RemoteException
    {
    }

    public void a(boolean flag, boolean flag1, String s, String s1, String s2)
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

    (SecurityService securityservice)
    {
        a = securityservice;
        super();
    }
}
