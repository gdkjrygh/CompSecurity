// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.models.IInAppMessage;
import com.appboy.models.MessageButton;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager, InAppMessageOperation, InAppMessageCloser

class this._cls0
    implements IInAppMessageManagerListener
{

    final AppboyInAppMessageManager this$0;

    public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iinappmessage)
    {
        return InAppMessageOperation.DISPLAY_NOW;
    }

    public boolean onInAppMessageButtonClicked(MessageButton messagebutton, InAppMessageCloser inappmessagecloser)
    {
        return false;
    }

    public boolean onInAppMessageClicked(IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
    {
        return false;
    }

    public void onInAppMessageDismissed(IInAppMessage iinappmessage)
    {
    }

    public boolean onInAppMessageReceived(IInAppMessage iinappmessage)
    {
        return false;
    }

    erListener()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
