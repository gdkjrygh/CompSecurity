// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            ij

private class <init>
    implements com.google.android.gms.common.api.eApiClient.OnConnectionFailedListener
{

    final ij GQ;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        ij.b(GQ);
    }

    private ionResult(ij ij1)
    {
        GQ = ij1;
        super();
    }

    GQ(ij ij1, GQ gq)
    {
        this(ij1);
    }
}
