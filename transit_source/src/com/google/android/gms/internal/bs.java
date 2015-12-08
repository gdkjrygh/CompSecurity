// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            cg, by, cn, bw, 
//            bu, am, bz, bt, 
//            co

public abstract class bs extends cg
{
    public static final class a extends bs
    {

        private final Context mContext;

        public void ae()
        {
        }

        public by af()
        {
            return bz.a(mContext, new am());
        }

        public a(Context context, bu bu, br.a a1)
        {
            super(bu, a1);
            mContext = context;
        }
    }

    public static final class b extends bs
        implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
    {

        private final Object eJ = new Object();
        private final br.a gx;
        private final bt gy;

        public void ae()
        {
            synchronized (eJ)
            {
                if (gy.isConnected() || gy.isConnecting())
                {
                    gy.disconnect();
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public by af()
        {
            obj;
            JVM INSTR monitorenter ;
            by by1;
            synchronized (eJ)
            {
                by1 = gy.ai();
            }
            return by1;
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
            gx.a(new bw(0));
        }

        public void onDisconnected()
        {
            cn.m("Disconnected from remote ad request service.");
        }

        public b(Context context, bu bu1, br.a a1)
        {
            super(bu1, a1);
            gx = a1;
            gy = new bt(context, this, this, bu1.eg.hR);
            gy.connect();
        }
    }


    private final bu eI;
    private final br.a gx;

    public bs(bu bu, br.a a1)
    {
        eI = bu;
        gx = a1;
    }

    private static bw a(by by1, bu bu)
    {
        try
        {
            by1 = by1.a(bu);
        }
        // Misplaced declaration of an exception variable
        catch (by by1)
        {
            cn.b("Could not fetch ad response from ad request service.", by1);
            return null;
        }
        return by1;
    }

    public final void ac()
    {
        Object obj = af();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new bw(0);
_L4:
        ae();
        gx.a(((bw) (obj)));
        return;
_L2:
        bw bw1 = a(((by) (obj)), eI);
        obj = bw1;
        if (bw1 != null) goto _L4; else goto _L3
_L3:
        obj = new bw(0);
          goto _L4
        Exception exception;
        exception;
        ae();
        throw exception;
    }

    public abstract void ae();

    public abstract by af();

    public final void onStop()
    {
        ae();
    }
}
