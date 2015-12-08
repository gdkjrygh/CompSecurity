// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.appboy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.models.MessageButton;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.managers.DeepLinkManager;

// Referenced classes of package me.lyft.android.infrastructure.appboy:
//            CustomAppboyInAppDialog

class val.messageButton
    implements android.view.ustomAppboyInAppDialog._cls2
{

    final CustomAppboyInAppDialog this$0;
    final boolean val$isPrimary;
    final MessageButton val$messageButton;

    public void onClick(View view)
    {
label0:
        {
            if (val$isPrimary)
            {
                view = UiElement.APPBOY_INAPP_PRIMARY;
            } else
            {
                view = UiElement.APPBOY_INAPP_SECONDARY;
            }
            UiAnalytics.trackTap(view, Category.APPBOY, CustomAppboyInAppDialog.access$000(CustomAppboyInAppDialog.this));
            dialogFlow.dismiss();
            if (val$messageButton.getClickAction().equals(ClickAction.URI))
            {
                view = val$messageButton.getUri();
                if (!view.getScheme().equals("lyft"))
                {
                    break label0;
                }
                deepLinkManager.route(view);
            }
            return;
        }
        getContext().startActivity(new Intent("android.intent.action.VIEW", view));
    }

    ()
    {
        this$0 = final_customappboyinappdialog;
        val$isPrimary = flag;
        val$messageButton = MessageButton.this;
        super();
    }
}
