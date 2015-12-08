// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            i

public abstract class a
    implements Callable
{

    private i a;

    public abstract Object a(IInterface iinterface);

    public Object call()
    {
        IInterface iinterface;
        synchronized (i.a(a))
        {
            iinterface = i.b(a);
        }
        if (iinterface != null)
        {
            return a(iinterface);
        } else
        {
            throw new RemoteException("Service was closed in the middle of the execution.");
        }
        exception;
        serviceconnection;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (i j)
    {
        a = j;
        super();
    }
}
