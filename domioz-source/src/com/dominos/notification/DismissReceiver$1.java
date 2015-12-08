// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import com.dominos.wear.client.WearMessageClient;

// Referenced classes of package com.dominos.notification:
//            DismissReceiver

class this._cls0
    implements com.dominos.wear.client.WearConnectionCallback
{

    final DismissReceiver this$0;

    public void onConnectionFailed()
    {
    }

    public void onConnectionSuccess()
    {
        mWearMessageClient.sendToWear("/dominos-notification-dismissed", null);
    }

    earConnectionCallback()
    {
        this$0 = DismissReceiver.this;
        super();
    }
}
