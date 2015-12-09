// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClient

protected final class this._cls0
    implements com.google.android.gms.common.api.rtCallbacks
{

    final GmsClient this$0;

    public final void onReportAccountValidation(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }

    public final void onReportServiceBinding(ConnectionResult connectionresult)
    {
        if (connectionresult.isSuccess())
        {
            getRemoteService(null, GmsClient.access$600(GmsClient.this));
        } else
        if (GmsClient.access$700(GmsClient.this) != null)
        {
            GmsClient.access$700(GmsClient.this).onConnectionFailed(connectionresult);
            return;
        }
    }

    public lbacks()
    {
        this$0 = GmsClient.this;
        super();
    }
}
