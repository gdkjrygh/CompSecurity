// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.e;

// Referenced classes of package com.google.android.gms.common.internal:
//            l, k, t

public final class q extends l
{

    public final IBinder e;
    final k f;

    public q(k k1, int i, IBinder ibinder, Bundle bundle)
    {
        f = k1;
        super(k1, i, bundle);
        e = ibinder;
    }

    protected final boolean a()
    {
        Object obj;
        try
        {
            obj = e.getInterfaceDescriptor();
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        if (f.f().equals(obj))
        {
            if ((remoteexception = f.a(e)) != null && k.a(f, 2, 3, remoteexception))
            {
                k.a(f).a();
                com.google.android.gms.common.e.c(com.google.android.gms.common.internal.k.e(f));
                return true;
            }
        }
        return false;
    }
}
