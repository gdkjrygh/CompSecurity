// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.net.Uri;
import android.view.View;
import com.appboy.IAppboyNavigator;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageHtml;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.models.MessageButton;
import com.appboy.support.AppboyLogger;
import com.appboy.support.BundleUtils;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.appboy.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.appboy.ui.inappmessage:
//            AppboyInAppMessageManager, InAppMessageCloser

class this._cls0
    implements IInAppMessageViewLifecycleListener
{

    final AppboyInAppMessageManager this$0;

    private void performClickAction(ClickAction clickaction, IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser, Uri uri)
    {
        if (AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this) == null)
        {
            AppboyLogger.e(AppboyInAppMessageManager.access$000(), "No activity is currently registered to receive in-app messages. Doing nothing.");
            return;
        }
        switch (.SwitchMap.com.appboy.enums.inappmessage.ClickAction[clickaction.ordinal()])
        {
        default:
            inappmessagecloser.close(false);
            return;

        case 1: // '\001'
            iinappmessage.setAnimateOut(false);
            inappmessagecloser.close(false);
            AppboyInAppMessageManager.access$900(AppboyInAppMessageManager.this).gotoNewsFeed(AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this), BundleUtils.mapToBundle(iinappmessage.getExtras()));
            return;

        case 2: // '\002'
            iinappmessage.setAnimateOut(false);
            inappmessagecloser.close(false);
            ActionFactory.createUriAction(AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this), uri.toString()).execute(AppboyInAppMessageManager.access$200(AppboyInAppMessageManager.this));
            return;

        case 3: // '\003'
            inappmessagecloser.close(true);
            break;
        }
    }

    private void performInAppMessageButtonClicked(MessageButton messagebutton, IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
    {
        performClickAction(messagebutton.getClickAction(), iinappmessage, inappmessagecloser, messagebutton.getUri());
    }

    private void performInAppMessageClicked(IInAppMessage iinappmessage, InAppMessageCloser inappmessagecloser)
    {
        performClickAction(iinappmessage.getClickAction(), iinappmessage, inappmessagecloser, iinappmessage.getUri());
    }

    public void afterClosed(IInAppMessage iinappmessage)
    {
        AppboyInAppMessageManager.access$702(AppboyInAppMessageManager.this, null);
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterClosed called.");
        AppboyInAppMessageManager.access$400(AppboyInAppMessageManager.this).set(false);
        if (iinappmessage instanceof IInAppMessageHtml)
        {
            AppboyInAppMessageManager.access$800(AppboyInAppMessageManager.this, (IInAppMessageHtml)iinappmessage);
        }
    }

    public void afterOpened(View view, IInAppMessage iinappmessage)
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.afterOpened called.");
    }

    public void beforeClosed(View view, IInAppMessage iinappmessage)
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeClosed called.");
    }

    public void beforeOpened(View view, IInAppMessage iinappmessage)
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.beforeOpened called.");
        iinappmessage.logImpression();
    }

    public void onButtonClicked(InAppMessageCloser inappmessagecloser, MessageButton messagebutton, IInAppMessageImmersive iinappmessageimmersive)
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onButtonClicked called.");
        if (messagebutton.getClickAction() != ClickAction.NONE)
        {
            iinappmessageimmersive.logButtonClick(messagebutton);
        }
        if (!AppboyInAppMessageManager.access$500(AppboyInAppMessageManager.this).onInAppMessageButtonClicked(messagebutton, inappmessagecloser))
        {
            performInAppMessageButtonClicked(messagebutton, iinappmessageimmersive, inappmessagecloser);
        }
    }

    public void onClicked(InAppMessageCloser inappmessagecloser, View view, IInAppMessage iinappmessage)
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onClicked called.");
        if (iinappmessage.getClickAction() != ClickAction.NONE)
        {
            iinappmessage.logClick();
        }
        if (!AppboyInAppMessageManager.access$500(AppboyInAppMessageManager.this).onInAppMessageClicked(iinappmessage, inappmessagecloser))
        {
            performInAppMessageClicked(iinappmessage, inappmessagecloser);
        }
    }

    public void onDismissed(View view, IInAppMessage iinappmessage)
    {
        AppboyLogger.d(AppboyInAppMessageManager.access$000(), "InAppMessageViewWrapper.IInAppMessageViewLifecycleListener.onDismissed called.");
        AppboyInAppMessageManager.access$500(AppboyInAppMessageManager.this).onInAppMessageDismissed(iinappmessage);
    }

    rListener()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
