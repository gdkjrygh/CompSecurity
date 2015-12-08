// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.os.Bundle;
import com.appboy.IAppboyNavigator;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.support.AppboyLogger;
import com.appboy.support.BundleUtils;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager

class this._cls0
    implements IInAppMessageWebViewClientListener
{

    final AppboyInAppMessageManager this$0;

    private void logHtmlInAppMessageClick(IInAppMessage iinappmessage, Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("abButtonId"))
        {
            ((InAppMessageHtmlFull)iinappmessage).logButtonClick(bundle.getString("abButtonId"));
            return;
        } else
        {
            iinappmessage.logClick();
            return;
        }
    }

    public void onCloseAction(IInAppMessage iinappmessage, String s, Bundle bundle)
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "IInAppMessageWebViewClientListener.onCloseAction called.");
        hideCurrentInAppMessage(true, true);
        AppboyInAppMessageManager.access$1000(AppboyInAppMessageManager.this).onCloseClicked(iinappmessage, s, bundle);
    }

    public void onNewsfeedAction(IInAppMessage iinappmessage, String s, Bundle bundle)
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "IInAppMessageWebViewClientListener.onNewsfeedAction called.");
        logHtmlInAppMessageClick(iinappmessage, bundle);
        if (!AppboyInAppMessageManager.access$1000(AppboyInAppMessageManager.this).onNewsfeedClicked(iinappmessage, s, bundle))
        {
            hideCurrentInAppMessage(false);
            iinappmessage = BundleUtils.mapToBundle(iinappmessage.getExtras());
            iinappmessage.putAll(bundle);
            AppboyInAppMessageManager.access$900(AppboyInAppMessageManager.this).gotoNewsFeed(AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this), iinappmessage);
        }
    }

    public void onOtherUrlAction(IInAppMessage iinappmessage, String s, Bundle bundle)
    {
        boolean flag = false;
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "IInAppMessageWebViewClientListener.onOtherUrlAction called.");
        logHtmlInAppMessageClick(iinappmessage, bundle);
        if (!AppboyInAppMessageManager.access$1000(AppboyInAppMessageManager.this).onOtherUrlAction(iinappmessage, s, bundle))
        {
            hideCurrentInAppMessage(false);
            if (bundle.containsKey("abExternalOpen"))
            {
                flag = Boolean.parseBoolean(bundle.getString("abExternalOpen"));
            }
            if (flag)
            {
                iinappmessage = BundleUtils.mapToBundle(iinappmessage.getExtras());
                iinappmessage.putAll(bundle);
                iinappmessage = ActionFactory.createViewUriAction(s, iinappmessage);
            } else
            {
                iinappmessage = ActionFactory.createUriAction(AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this), s);
            }
            if (iinappmessage != null)
            {
                iinappmessage.execute(AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this));
            }
        }
    }

    tionListener()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
