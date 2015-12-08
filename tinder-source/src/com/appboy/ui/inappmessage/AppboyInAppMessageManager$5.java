// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.os.Bundle;
import com.appboy.models.IInAppMessage;
import com.appboy.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager

class this._cls0
    implements IHtmlInAppMessageActionListener
{

    final AppboyInAppMessageManager this$0;

    public void onCloseClicked(IInAppMessage iinappmessage, String s, Bundle bundle)
    {
    }

    public boolean onNewsfeedClicked(IInAppMessage iinappmessage, String s, Bundle bundle)
    {
        return false;
    }

    public boolean onOtherUrlAction(IInAppMessage iinappmessage, String s, Bundle bundle)
    {
        return false;
    }

    ctionListener()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
