// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageFull;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageFullView;

// Referenced classes of package com.appboy.ui.inappmessage:
//            IInAppMessageViewFactory, AppboyInAppMessageManager

class this._cls0
    implements IInAppMessageViewFactory
{

    final AppboyInAppMessageManager this$0;

    public View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
    {
        InAppMessageFull inappmessagefull = (InAppMessageFull)iinappmessage;
        activity = (AppboyInAppMessageFullView)activity.getLayoutInflater().inflate(com.appboy.ui.sage_full, null);
        activity.inflateStubViews();
        if (AppboyInAppMessageManager.access$100(AppboyInAppMessageManager.this))
        {
            activity.setMessageSimpleDrawee(iinappmessage.getImageUrl());
        } else
        {
            activity.setMessageImageView(iinappmessage.getBitmap());
        }
        activity.setMessageBackgroundColor(inappmessagefull.getBackgroundColor());
        activity.setMessage(inappmessagefull.getMessage());
        activity.setMessageTextColor(inappmessagefull.getMessageTextColor());
        activity.setMessageHeaderText(inappmessagefull.getHeader());
        activity.setMessageHeaderTextColor(inappmessagefull.getHeaderTextColor());
        activity.setMessageButtons(inappmessagefull.getMessageButtons());
        activity.setMessageCloseButtonColor(inappmessagefull.getCloseButtonColor());
        activity.resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
        return activity;
    }

    View()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
