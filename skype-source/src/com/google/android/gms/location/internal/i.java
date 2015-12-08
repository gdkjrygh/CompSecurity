// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import com.google.android.gms.location.copresence.internal.b;
import com.google.android.gms.location.f;

// Referenced classes of package com.google.android.gms.location.internal:
//            a, h, f

public final class i extends com.google.android.gms.location.internal.a
{
    private static final class a extends g.a
    {

        private com.google.android.gms.common.api.k.b a;

        public final void a(LocationSettingsResult locationsettingsresult)
            throws RemoteException
        {
            a.a(locationsettingsresult);
            a = null;
        }

        public a(com.google.android.gms.common.api.k.b b1)
        {
            boolean flag;
            if (b1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            y.b(flag, "listener can't be null.");
            a = b1;
        }
    }


    private final h e;
    private final b f;

    public i(Context context, Looper looper, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c, String s, com.google.android.gms.common.internal.i j)
    {
        this(context, looper, b1, c, s, j, CopresenceApiOptions.a);
    }

    private i(Context context, Looper looper, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c, String s, com.google.android.gms.common.internal.i j, CopresenceApiOptions copresenceapioptions)
    {
        super(context, looper, b1, c, s, j);
        e = new h(context, a);
        f = b.a(context, j.a(), j.g(), a, copresenceapioptions);
    }

    public final void a(LocationRequest locationrequest, f f1)
        throws RemoteException
    {
        synchronized (e)
        {
            e.a(locationrequest, f1);
        }
        return;
        locationrequest;
        h1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public final void a(LocationSettingsRequest locationsettingsrequest, com.google.android.gms.common.api.k.b b1, String s)
        throws RemoteException
    {
        boolean flag1 = true;
        m();
        boolean flag;
        if (locationsettingsrequest != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.b(flag, "locationSettingsRequest can't be null nor empty.");
        if (b1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        y.b(flag, "listener can't be null.");
        b1 = new a(b1);
        ((com.google.android.gms.location.internal.f)n()).a(locationsettingsrequest, b1, s);
    }

    public final void a(f f1)
        throws RemoteException
    {
        e.a(f1);
    }

    public final void d()
    {
        h h1 = e;
        h1;
        JVM INSTR monitorenter ;
        boolean flag = e();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        e.a();
        e.b();
_L1:
        super.d();
        h1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        h1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final boolean o()
    {
        return true;
    }
}
