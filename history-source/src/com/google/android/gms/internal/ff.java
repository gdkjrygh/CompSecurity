// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            gf, fl, gr, ga, 
//            fj, fh, bm, co, 
//            fx, fq, fg, gs

public abstract class ff extends gf
{
    public static final class a extends ff
    {

        private final Context mContext;

        public void cJ()
        {
        }

        public fl cK()
        {
            Object obj = ga.bN();
            obj = new bm(((Bundle) (obj)).getString("gads:sdk_core_location"), ((Bundle) (obj)).getString("gads:sdk_core_experiment_id"), ((Bundle) (obj)).getString("gads:block_autoclicks_experiment_id"), ((Bundle) (obj)).getString("gads:spam_app_context:experiment_id"));
            return fq.a(mContext, ((bm) (obj)), new co(), new fx());
        }

        public a(Context context, fh fh, fe.a a1)
        {
            super(fh, a1);
            mContext = context;
        }
    }

    public static final class b extends ff
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final Object mH = new Object();
        private final fe.a tI;
        private final fg tJ;

        public void cJ()
        {
            synchronized (mH)
            {
                if (tJ.isConnected() || tJ.isConnecting())
                {
                    tJ.disconnect();
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public fl cK()
        {
            obj;
            JVM INSTR monitorenter ;
            fl fl1;
            synchronized (mH)
            {
                fl1 = tJ.cL();
            }
            return fl1;
_L2:
            obj;
            JVM INSTR monitorexit ;
            return null;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            Object obj1;
            obj1;
            continue; /* Loop/switch isn't completed */
            obj1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onConnected(Bundle bundle)
        {
            start();
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            tI.a(new fj(0));
        }

        public void onConnectionSuspended(int i)
        {
            gr.S("Disconnected from remote ad request service.");
        }

        public b(Context context, fh fh1, fe.a a1)
        {
            super(fh1, a1);
            tI = a1;
            tJ = new fg(context, this, this, fh1.lO.wU);
            tJ.connect();
        }
    }


    private final fh qh;
    private final fe.a tI;

    public ff(fh fh, fe.a a1)
    {
        qh = fh;
        tI = a1;
    }

    private static fj a(fl fl1, fh fh)
    {
        try
        {
            fl1 = fl1.b(fh);
        }
        // Misplaced declaration of an exception variable
        catch (fl fl1)
        {
            gr.d("Could not fetch ad response from ad request service.", fl1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (fl fl1)
        {
            gr.d("Could not fetch ad response from ad request service due to an Exception.", fl1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (fl fl1)
        {
            gr.d("Could not fetch ad response from ad request service due to an Exception.", fl1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (fl fl1)
        {
            ga.e(fl1);
            return null;
        }
        return fl1;
    }

    public abstract void cJ();

    public abstract fl cK();

    public final void cx()
    {
        Object obj = cK();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new fj(0);
_L4:
        cJ();
        tI.a(((fj) (obj)));
        return;
_L2:
        fj fj1 = a(((fl) (obj)), qh);
        obj = fj1;
        if (fj1 != null) goto _L4; else goto _L3
_L3:
        obj = new fj(0);
          goto _L4
        Exception exception;
        exception;
        cJ();
        throw exception;
    }

    public final void onStop()
    {
        cJ();
    }
}
