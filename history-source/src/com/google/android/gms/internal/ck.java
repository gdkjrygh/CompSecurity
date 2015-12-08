// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.google.android.gms.internal:
//            bn, cl, cm, gr

public final class ck
{
    public static final class a
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        private final Object mH;
        private final b qe;
        private final cl qf;

        public void onConnected(Bundle bundle)
        {
            bundle = bn.by();
            Object obj1 = mH;
            obj1;
            JVM INSTR monitorenter ;
            Object obj = qf.bM();
            if (obj == null) goto _L2; else goto _L1
_L1:
            obj = ((cm) (obj)).bN();
_L6:
            if (qf.isConnected())
            {
                break MISSING_BLOCK_LABEL_52;
            }
            bundle = ((Bundle) (obj));
            if (!qf.isConnecting())
            {
                break MISSING_BLOCK_LABEL_61;
            }
            qf.disconnect();
            bundle = ((Bundle) (obj));
_L4:
            obj1;
            JVM INSTR monitorexit ;
            qe.a(bundle);
            return;
            obj;
            gr.d("Error when get Gservice values", ((Throwable) (obj)));
            if (qf.isConnected() || qf.isConnecting())
            {
                qf.disconnect();
            }
            continue; /* Loop/switch isn't completed */
            obj;
            gr.d("Error when get Gservice values", ((Throwable) (obj)));
            if (qf.isConnected() || qf.isConnecting())
            {
                qf.disconnect();
            }
            if (true) goto _L4; else goto _L3
_L3:
            bundle;
            if (qf.isConnected() || qf.isConnecting())
            {
                qf.disconnect();
            }
            throw bundle;
            bundle;
            obj1;
            JVM INSTR monitorexit ;
            throw bundle;
_L2:
            obj = bundle;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
            qe.a(bn.by());
        }

        public void onConnectionSuspended(int i)
        {
            gr.S("Disconnected from remote ad request service.");
        }

        public a(Context context, b b1)
        {
            this(context, b1, false);
        }

        a(Context context, b b1, boolean flag)
        {
            mH = new Object();
            qe = b1;
            qf = new cl(context, this, this, 0x648278);
            if (!flag)
            {
                qf.connect();
            }
        }
    }

    public static interface b
    {

        public abstract void a(Bundle bundle);
    }


    public static void a(Context context, b b1)
    {
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) != 0)
        {
            b1.a(bn.by());
            return;
        } else
        {
            new a(context, b1);
            return;
        }
    }
}
