// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            en, dx, ev, dv, 
//            dt, az, bk, ef, 
//            dy, ds, ew

public abstract class dr extends en
{
    public static final class a extends dr
    {

        private final Context mContext;

        public void bn()
        {
        }

        public dx bo()
        {
            az az1 = new az();
            return dy.a(mContext, az1, new bk(), new ef());
        }

        public a(Context context, dt dt, dq.a a1)
        {
            super(dt, a1);
            mContext = context;
        }
    }

    public static final class b extends dr
        implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
    {

        private final Object lq = new Object();
        private final dq.a pR;
        private final ds pS;

        public void bn()
        {
            synchronized (lq)
            {
                if (pS.isConnected() || pS.isConnecting())
                {
                    pS.disconnect();
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public dx bo()
        {
            obj;
            JVM INSTR monitorenter ;
            dx dx1;
            synchronized (lq)
            {
                dx1 = pS.br();
            }
            return dx1;
            IllegalStateException illegalstateexception;
            illegalstateexception;
            obj;
            JVM INSTR monitorexit ;
            return null;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void onConnected(Bundle bundle)
        {
            start();
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            pR.a(new dv(0));
        }

        public void onDisconnected()
        {
            ev.z("Disconnected from remote ad request service.");
        }

        public b(Context context, dt dt1, dq.a a1)
        {
            super(dt1, a1);
            pR = a1;
            pS = new ds(context, this, this, dt1.kO.sv);
            pS.connect();
        }
    }


    private final dt nc;
    private final dq.a pR;

    public dr(dt dt, dq.a a1)
    {
        nc = dt;
        pR = a1;
    }

    private static dv a(dx dx1, dt dt)
    {
        try
        {
            dx1 = dx1.b(dt);
        }
        // Misplaced declaration of an exception variable
        catch (dx dx1)
        {
            ev.c("Could not fetch ad response from ad request service.", dx1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (dx dx1)
        {
            ev.c("Could not fetch ad response from ad request service due to an Exception.", dx1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (dx dx1)
        {
            ev.c("Could not fetch ad response from ad request service due to an Exception.", dx1);
            return null;
        }
        return dx1;
    }

    public final void bc()
    {
        Object obj = bo();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new dv(0);
_L4:
        bn();
        pR.a(((dv) (obj)));
        return;
_L2:
        dv dv1 = a(((dx) (obj)), nc);
        obj = dv1;
        if (dv1 != null) goto _L4; else goto _L3
_L3:
        obj = new dv(0);
          goto _L4
        Exception exception;
        exception;
        bn();
        throw exception;
    }

    public abstract void bn();

    public abstract dx bo();

    public final void onStop()
    {
        bn();
    }
}
