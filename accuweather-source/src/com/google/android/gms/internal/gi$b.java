// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            gi

private class <init>
    implements com.google.android.gms.common.api.eApiClient.OnConnectionFailedListener
{

    final gi BZ;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        gi.j(BZ);
    }

    private ionResult(gi gi1)
    {
        BZ = gi1;
        super();
    }

    BZ(gi gi1, BZ bz)
    {
        this(gi1);
    }
}
