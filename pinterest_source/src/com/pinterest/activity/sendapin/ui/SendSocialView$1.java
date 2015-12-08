// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            SendSocialView

class val.app
    implements android.view.ner
{

    final SendSocialView this$0;
    final com.pinterest.adapter.er.IconText val$app;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.SEND_SOCIAL_BUTTON, null, val$app.meta);
        Events.post(new ndSocialEvent(SendSocialView.this, val$app.text, val$app.meta));
    }

    ndSocialEvent()
    {
        this$0 = final_sendsocialview;
        val$app = com.pinterest.adapter.er.IconText.this;
        super();
    }
}
