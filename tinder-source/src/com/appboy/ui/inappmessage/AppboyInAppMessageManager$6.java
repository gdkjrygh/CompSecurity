// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView;

// Referenced classes of package com.appboy.ui.inappmessage:
//            IInAppMessageViewFactory, AppboyInAppMessageManager

class this._cls0
    implements IInAppMessageViewFactory
{

    final AppboyInAppMessageManager this$0;

    public View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
    {
        InAppMessageSlideup inappmessageslideup = (InAppMessageSlideup)iinappmessage;
        activity = (AppboyInAppMessageSlideupView)activity.getLayoutInflater().inflate(com.appboy.ui.sage_slideup, null);
        activity.inflateStubViews();
        if (AppboyInAppMessageManager.access$100(AppboyInAppMessageManager.this))
        {
            activity.setMessageSimpleDrawee(iinappmessage.getImageUrl());
        } else
        {
            activity.setMessageImageView(inappmessageslideup.getBitmap());
        }
        activity.setMessageBackgroundColor(inappmessageslideup.getBackgroundColor());
        activity.setMessage(inappmessageslideup.getMessage());
        activity.setMessageTextColor(inappmessageslideup.getMessageTextColor());
        activity.setMessageIcon(inappmessageslideup.getIcon(), inappmessageslideup.getIconColor(), inappmessageslideup.getIconBackgroundColor());
        activity.setMessageChevron(inappmessageslideup.getChevronColor(), inappmessageslideup.getClickAction());
        activity.resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
        return activity;
    }

    eupView()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
