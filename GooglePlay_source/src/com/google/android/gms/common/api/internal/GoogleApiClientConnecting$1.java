// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.GoogleApiAvailability;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting

final class this._cls0
    implements Runnable
{

    final GoogleApiClientConnecting this$0;

    public final void run()
    {
        GoogleApiAvailability.cancelAvailabilityErrorNotifications(mContext);
    }

    ()
    {
        this$0 = GoogleApiClientConnecting.this;
        super();
    }
}
