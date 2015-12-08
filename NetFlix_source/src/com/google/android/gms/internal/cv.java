// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            do, db, dw, cz, 
//            cx, ax, bg, dc, 
//            cw, dx

public abstract class cv extends do
{
    public static final class a extends cv
    {

        private final Context mContext;

        public void be()
        {
        }

        public db bf()
        {
            ax ax1 = new ax();
            return dc.a(mContext, ax1, new bg());
        }

        public a(Context context, cx cx, cu.a a1)
        {
            super(cx, a1);
            mContext = context;
        }
    }

    public static final class b extends cv
        implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
    {

        private final Object li = new Object();
        private final cu.a pc;
        private final cw pd;

        public void be()
        {
            synchronized (li)
            {
                if (pd.isConnected() || pd.isConnecting())
                {
                    pd.disconnect();
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public db bf()
        {
            obj;
            JVM INSTR monitorenter ;
            db db1;
            synchronized (li)
            {
                db1 = pd.bi();
            }
            return db1;
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
            pc.a(new cz(0));
        }

        public void onDisconnected()
        {
            dw.v("Disconnected from remote ad request service.");
        }

        public b(Context context, cx cx1, cu.a a1)
        {
            super(cx1, a1);
            pc = a1;
            pd = new cw(context, this, this, cx1.kK.rs);
            pd.connect();
        }
    }


    private final cx mQ;
    private final cu.a pc;

    public cv(cx cx, cu.a a1)
    {
        mQ = cx;
        pc = a1;
    }

    private static cz a(db db1, cx cx)
    {
        try
        {
            db1 = db1.b(cx);
        }
        // Misplaced declaration of an exception variable
        catch (db db1)
        {
            dw.c("Could not fetch ad response from ad request service.", db1);
            return null;
        }
        return db1;
    }

    public final void aY()
    {
        Object obj = bf();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new cz(0);
_L4:
        be();
        pc.a(((cz) (obj)));
        return;
_L2:
        cz cz1 = a(((db) (obj)), mQ);
        obj = cz1;
        if (cz1 != null) goto _L4; else goto _L3
_L3:
        obj = new cz(0);
          goto _L4
        Exception exception;
        exception;
        be();
        throw exception;
    }

    public abstract void be();

    public abstract db bf();

    public final void onStop()
    {
        be();
    }
}
