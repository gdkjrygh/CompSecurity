// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageModal;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageModalView;

// Referenced classes of package com.appboy.ui.inappmessage:
//            IInAppMessageViewFactory, AppboyInAppMessageManager

class this._cls0
    implements IInAppMessageViewFactory
{

    final AppboyInAppMessageManager this$0;

    public View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
    {
        InAppMessageModal inappmessagemodal = (InAppMessageModal)iinappmessage;
        activity = (AppboyInAppMessageModalView)activity.getLayoutInflater().inflate(com.appboy.ui.sage_modal, null);
        activity.inflateStubViews();
        if (AppboyInAppMessageManager.access$100(AppboyInAppMessageManager.this))
        {
            activity.setMessageSimpleDrawee(iinappmessage.getImageUrl());
        } else
        {
            activity.setMessageImageView(inappmessagemodal.getBitmap());
        }
        activity.setMessageBackgroundColor(iinappmessage.getBackgroundColor());
        activity.setMessage(iinappmessage.getMessage());
        activity.setMessageTextColor(iinappmessage.getMessageTextColor());
        activity.setMessageHeaderText(inappmessagemodal.getHeader());
        activity.setMessageHeaderTextColor(inappmessagemodal.getHeaderTextColor());
        activity.setMessageIcon(iinappmessage.getIcon(), iinappmessage.getIconColor(), iinappmessage.getIconBackgroundColor());
        activity.setMessageButtons(inappmessagemodal.getMessageButtons());
        activity.setMessageCloseButtonColor(inappmessagemodal.getCloseButtonColor());
        activity.resetMessageMargins(iinappmessage.getImageDownloadSuccessful());
        return activity;
    }

    lView()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
