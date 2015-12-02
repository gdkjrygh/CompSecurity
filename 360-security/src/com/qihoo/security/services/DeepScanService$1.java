// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.engine.b.c;
import com.qihoo.security.env.QVSEnv;
import java.util.List;

// Referenced classes of package com.qihoo.security.services:
//            DeepScanService, c

class  extends 
{

    final DeepScanService a;

    public int a()
        throws RemoteException
    {
        return 0x13351f2;
    }

    public int a(String s, boolean flag)
        throws RemoteException
    {
        QVSEnv.bEvalMode = flag;
        a.d.a(QVSEnv.bEvalMode);
        return a.d.c(s);
    }

    public int a(List list)
        throws RemoteException
    {
        return 0x80004001;
    }

    public int a(List list, boolean flag)
        throws RemoteException
    {
        QVSEnv.bEvalMode = flag;
        a.d.a(QVSEnv.bEvalMode);
        return a.d.a(list);
    }

    public String a(String s)
        throws RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return a.d.a(s);
        }
    }

    public String a(String s, String s1)
        throws RemoteException
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return a.d.a(s, s1);
        }
    }

    public boolean a(com.qihoo.security.services.c c1)
        throws RemoteException
    {
        return a.d.a(c1);
    }

    public int b()
    {
        return a.d.a();
    }

    public int b(String s, String s1)
        throws RemoteException
    {
        a.d.b(s, s1);
        return 0;
    }

    public int b(String s, boolean flag)
        throws RemoteException
    {
        QVSEnv.bEvalMode = flag;
        a.d.a(QVSEnv.bEvalMode);
        return a.d.d(s);
    }

    public void b(com.qihoo.security.services.c c1)
        throws RemoteException
    {
        a.d.b(c1);
    }

    public int c()
    {
        if (a.c.hasMessages(3))
        {
            a.c.removeMessages(3);
        }
        return a.d.b();
    }

    public int d()
    {
        return a.d.d();
    }

    public int e()
    {
        return a.d.e();
    }

    public int f()
    {
        return a.d.f();
    }

    public int g()
        throws RemoteException
    {
        a.d.g();
        return 0;
    }

    (DeepScanService deepscanservice)
    {
        a = deepscanservice;
        super();
    }
}
