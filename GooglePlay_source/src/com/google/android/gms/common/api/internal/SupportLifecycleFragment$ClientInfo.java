// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            SupportLifecycleFragment

private final class ner
    implements com.google.android.gms.common.api.stener
{

    public final GoogleApiClient apiClient;
    public final int clientId;
    public final com.google.android.gms.common.api.stener connectionFailedWithoutFixListener = null;
    final SupportLifecycleFragment this$0;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        SupportLifecycleFragment.access$800(SupportLifecycleFragment.this).post(new ailedResolver(SupportLifecycleFragment.this, clientId, connectionresult));
    }

    public ailedResolver(int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.stener stener)
    {
        this$0 = SupportLifecycleFragment.this;
        super();
        clientId = i;
        apiClient = googleapiclient;
        googleapiclient.registerConnectionFailedListener(this);
    }
}
