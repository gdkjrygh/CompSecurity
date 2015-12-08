// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessage;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager

class val.inAppMessage
    implements Runnable
{

    final AppboyInAppMessageManager this$0;
    final IInAppMessage val$inAppMessage;

    public void run()
    {
        (new yncInAppMessageDisplayer(AppboyInAppMessageManager.this)).execute(new IInAppMessage[] {
            val$inAppMessage
        });
    }

    yncInAppMessageDisplayer()
    {
        this$0 = final_appboyinappmessagemanager;
        val$inAppMessage = IInAppMessage.this;
        super();
    }
}
