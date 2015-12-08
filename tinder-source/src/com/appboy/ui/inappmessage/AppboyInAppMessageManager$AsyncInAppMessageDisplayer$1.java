// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager

class val.inAppMessage
    implements Runnable
{

    final val.inAppMessage this$1;
    final IInAppMessage val$inAppMessage;

    public void run()
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "Displaying in-app message.");
        AppboyInAppMessageManager.access$300(_fld0, val$inAppMessage);
    }

    ()
    {
        this$1 = final_;
        val$inAppMessage = IInAppMessage.this;
        super();
    }
}
