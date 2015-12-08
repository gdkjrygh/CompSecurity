// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessageHtml;
import com.appboy.ui.support.WebContentUtils;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager

class val.inAppMessageHtml
    implements Runnable
{

    final AppboyInAppMessageManager this$0;
    final IInAppMessageHtml val$inAppMessageHtml;

    public void run()
    {
        if (val$inAppMessageHtml != null)
        {
            WebContentUtils.clearInAppMessageLocalAssets(val$inAppMessageHtml);
        }
    }

    ()
    {
        this$0 = final_appboyinappmessagemanager;
        val$inAppMessageHtml = IInAppMessageHtml.this;
        super();
    }
}
