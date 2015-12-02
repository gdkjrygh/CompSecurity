// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk;

import android.os.RemoteException;
import com.qihoo360.mobilesafe.opti.i.plugins.ApkInfo;

// Referenced classes of package com.qihoo.security.clearengine.sdk:
//            ApkScanService

class c extends com.qihoo360.mobilesafe.opti.i.plugins.tub
{

    final ApkScanService a;
    private final Object b = new Object();
    private int c;

    public int create()
    {
        synchronized (b)
        {
            c = c + 1;
        }
        return 0;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int destroy()
    {
        synchronized (b)
        {
            c = c - 1;
            if (c == 0)
            {
                ApkScanService.b(a);
            }
        }
        return 0;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ApkInfo scanApk(String s)
        throws RemoteException
    {
        return ApkScanService.a(ApkScanService.a(a), s);
    }

    ce.Stub(ApkScanService apkscanservice)
    {
        a = apkscanservice;
        super();
        c = 0;
    }
}
