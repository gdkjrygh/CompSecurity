// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wearable;

import com.google.android.gms.common.ConnectionResult;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.wearable:
//            WearReplyReceiver

final class this._cls0
    implements com.google.android.gms.common.api.s._cls0
{

    final WearReplyReceiver this$0;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        WearReplyReceiver.access$000().info("Failed to connect to Google Play Services.");
    }

    ()
    {
        this$0 = WearReplyReceiver.this;
        super();
    }
}
