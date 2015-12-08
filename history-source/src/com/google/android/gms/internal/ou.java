// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            ox

public class ou
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
{

    private ox amU;
    private final op.a ane;
    private boolean anf;

    public ou(op.a a1)
    {
        ane = a1;
        amU = null;
        anf = true;
    }

    public void T(boolean flag)
    {
        anf = flag;
    }

    public void a(ox ox1)
    {
        amU = ox1;
    }

    public void onConnected(Bundle bundle)
    {
        amU.U(false);
        if (anf && ane != null)
        {
            ane.on();
        }
        anf = false;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        amU.U(true);
        if (anf && ane != null)
        {
            if (connectionresult.hasResolution())
            {
                ane.d(connectionresult.getResolution());
            } else
            {
                ane.oo();
            }
        }
        anf = false;
    }

    public void onDisconnected()
    {
        amU.U(true);
    }
}
