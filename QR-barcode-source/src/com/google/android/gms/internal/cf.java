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
//            bn, cg, ch, gs

public final class cf
{
    public static final class a
        implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
    {

        private final Object mw;
        private final b pN;
        private final cg pO;

        public void onConnected(Bundle bundle)
        {
            bundle = bn.bs();
            Object obj1 = mw;
            obj1;
            JVM INSTR monitorenter ;
            Object obj = pO.bC();
            if (obj == null) goto _L2; else goto _L1
_L1:
            obj = ((ch) (obj)).bD();
_L6:
            if (pO.isConnected())
            {
                break MISSING_BLOCK_LABEL_52;
            }
            bundle = ((Bundle) (obj));
            if (!pO.isConnecting())
            {
                break MISSING_BLOCK_LABEL_61;
            }
            pO.disconnect();
            bundle = ((Bundle) (obj));
_L4:
            obj1;
            JVM INSTR monitorexit ;
            pN.a(bundle);
            return;
            obj;
            gs.d("Error when get Gservice values", ((Throwable) (obj)));
            if (pO.isConnected() || pO.isConnecting())
            {
                pO.disconnect();
            }
            continue; /* Loop/switch isn't completed */
            obj;
            gs.d("Error when get Gservice values", ((Throwable) (obj)));
            if (pO.isConnected() || pO.isConnecting())
            {
                pO.disconnect();
            }
            if (true) goto _L4; else goto _L3
_L3:
            bundle;
            if (pO.isConnected() || pO.isConnecting())
            {
                pO.disconnect();
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
            pN.a(bn.bs());
        }

        public void onDisconnected()
        {
            gs.S("Disconnected from remote ad request service.");
        }

        public a(Context context, b b1)
        {
            this(context, b1, false);
        }

        a(Context context, b b1, boolean flag)
        {
            mw = new Object();
            pN = b1;
            pO = new cg(context, this, this, 0x5e2978);
            if (!flag)
            {
                pO.connect();
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
            b1.a(bn.bs());
            return;
        } else
        {
            new a(context, b1);
            return;
        }
    }
}
