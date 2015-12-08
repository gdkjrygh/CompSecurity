// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            f

public final class d
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{

    f a;
    public boolean b;
    private final com.google.android.gms.b.ax.a c;

    public d(com.google.android.gms.b.ax.a a1)
    {
        c = a1;
        a = null;
        b = true;
    }

    public final void onConnected(Bundle bundle)
    {
        a.a(false);
        if (b && c != null)
        {
            c.b();
        }
        b = false;
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        a.a(true);
        if (b && c != null && connectionresult.hasResolution())
        {
            c.a(connectionresult.getResolution());
        }
        b = false;
    }

    public final void onConnectionSuspended(int i)
    {
        a.a(true);
    }
}
