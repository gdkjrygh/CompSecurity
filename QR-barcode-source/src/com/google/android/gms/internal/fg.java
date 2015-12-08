// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            gg, fm, gs, gb, 
//            fk, fi, bm, cj, 
//            fy, fr, fh, gt

public abstract class fg extends gg
{
    public static final class a extends fg
    {

        private final Context mContext;

        public void cC()
        {
        }

        public fm cD()
        {
            Object obj = gb.bD();
            obj = new bm(((Bundle) (obj)).getString("gads:sdk_core_location"), ((Bundle) (obj)).getString("gads:sdk_core_experiment_id"), ((Bundle) (obj)).getString("gads:block_autoclicks_experiment_id"));
            return fr.a(mContext, ((bm) (obj)), new cj(), new fy());
        }

        public a(Context context, fi fi, ff.a a1)
        {
            super(fi, a1);
            mContext = context;
        }
    }

    public static final class b extends fg
        implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
    {

        private final Object mw = new Object();
        private final ff.a tu;
        private final fh tv;

        public void cC()
        {
            synchronized (mw)
            {
                if (tv.isConnected() || tv.isConnecting())
                {
                    tv.disconnect();
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public fm cD()
        {
            obj;
            JVM INSTR monitorenter ;
            fm fm1;
            synchronized (mw)
            {
                fm1 = tv.cE();
            }
            return fm1;
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
            tu.a(new fk(0));
        }

        public void onDisconnected()
        {
            gs.S("Disconnected from remote ad request service.");
        }

        public b(Context context, fi fi1, ff.a a1)
        {
            super(fi1, a1);
            tu = a1;
            tv = new fh(context, this, this, fi1.lD.wF);
            tv.connect();
        }
    }


    private final fi pQ;
    private final ff.a tu;

    public fg(fi fi, ff.a a1)
    {
        pQ = fi;
        tu = a1;
    }

    private static fk a(fm fm1, fi fi)
    {
        try
        {
            fm1 = fm1.b(fi);
        }
        // Misplaced declaration of an exception variable
        catch (fm fm1)
        {
            gs.d("Could not fetch ad response from ad request service.", fm1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (fm fm1)
        {
            gs.d("Could not fetch ad response from ad request service due to an Exception.", fm1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (fm fm1)
        {
            gs.d("Could not fetch ad response from ad request service due to an Exception.", fm1);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (fm fm1)
        {
            gb.e(fm1);
            return null;
        }
        return fm1;
    }

    public abstract void cC();

    public abstract fm cD();

    public final void co()
    {
        Object obj = cD();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new fk(0);
_L4:
        cC();
        tu.a(((fk) (obj)));
        return;
_L2:
        fk fk1 = a(((fm) (obj)), pQ);
        obj = fk1;
        if (fk1 != null) goto _L4; else goto _L3
_L3:
        obj = new fk(0);
          goto _L4
        Exception exception;
        exception;
        cC();
        throw exception;
    }

    public final void onStop()
    {
        cC();
    }
}
