// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            no

public class nl
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
{

    private no akF;
    private final ng.a akP;
    private boolean akQ;

    public nl(ng.a a1)
    {
        akP = a1;
        akF = null;
        akQ = true;
    }

    public void R(boolean flag)
    {
        akQ = flag;
    }

    public void a(no no1)
    {
        akF = no1;
    }

    public void onConnected(Bundle bundle)
    {
        akF.S(false);
        if (akQ && akP != null)
        {
            akP.mU();
        }
        akQ = false;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        akF.S(true);
        if (akQ && akP != null)
        {
            if (connectionresult.hasResolution())
            {
                akP.b(connectionresult.getResolution());
            } else
            {
                akP.mV();
            }
        }
        akQ = false;
    }

    public void onDisconnected()
    {
        akF.S(true);
    }
}
