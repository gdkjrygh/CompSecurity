// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.content.BroadcastReceiver;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            MessagingSmsManager, Messaging

private abstract class mMessaging extends BroadcastReceiver
{

    protected Messaging mMessaging;
    final MessagingSmsManager this$0;

    public (Messaging messaging)
    {
        this$0 = MessagingSmsManager.this;
        super();
        mMessaging = messaging;
    }
}
