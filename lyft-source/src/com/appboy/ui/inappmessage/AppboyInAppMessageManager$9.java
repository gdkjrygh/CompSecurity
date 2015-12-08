// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlFullView;

// Referenced classes of package com.appboy.ui.inappmessage:
//            IInAppMessageViewFactory, AppboyInAppMessageManager, InAppMessageWebViewClient

class this._cls0
    implements IInAppMessageViewFactory
{

    final AppboyInAppMessageManager this$0;

    public View createInAppMessageView(Activity activity, IInAppMessage iinappmessage)
    {
        InAppMessageHtmlFull inappmessagehtmlfull = (InAppMessageHtmlFull)iinappmessage;
        activity = (AppboyInAppMessageHtmlFullView)activity.getLayoutInflater().inflate(com.appboy.ui.sage_html_full, null);
        activity.setWebViewContent(iinappmessage.getMessage(), inappmessagehtmlfull.getLocalAssetsDirectoryUrl());
        activity.setInAppMessageWebViewClient(new InAppMessageWebViewClient(iinappmessage, AppboyInAppMessageManager.access$600(AppboyInAppMessageManager.this)));
        return activity;
    }

    FullView()
    {
        this$0 = AppboyInAppMessageManager.this;
        super();
    }
}
