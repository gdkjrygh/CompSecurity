// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.web.view:
//            WebViewPinItBar

class this._cls0
    implements android.view.er
{

    final WebViewPinItBar this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.MODAL_PIN);
        view = new Intent(getContext(), com/pinterest/activity/create/PinItActivity);
        view.putExtra("android.intent.extra.TEXT", WebViewPinItBar.access$000(WebViewPinItBar.this));
        view.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070731));
        getContext().startActivity(view);
    }

    ()
    {
        this$0 = WebViewPinItBar.this;
        super();
    }
}
