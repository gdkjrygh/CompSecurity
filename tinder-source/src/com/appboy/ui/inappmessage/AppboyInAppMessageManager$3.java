// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import com.appboy.events.IEventSubscriber;
import com.appboy.events.InAppMessageEvent;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager

class this._cls0
    implements IEventSubscriber
{

    final AppboyInAppMessageManager this$0;

    public void trigger(InAppMessageEvent inappmessageevent)
    {
        if (AppboyInAppMessageManager.access$500(AppboyInAppMessageManager.this).onInAppMessageReceived(inappmessageevent.getInAppMessage()))
        {
            return;
        } else
        {
            addInAppMessage(inappmessageevent.getInAppMessage());
            return;
        }
    }

    public volatile void trigger(Object obj)
    {
        trigger((InAppMessageEvent)obj);
    }

    erListener()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
