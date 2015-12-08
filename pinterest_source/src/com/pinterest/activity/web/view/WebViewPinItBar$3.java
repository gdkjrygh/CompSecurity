// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;

import android.view.View;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.web.fragment.FeedbackDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.web.view:
//            WebViewPinItBar

class this._cls0
    implements android.view.er
{

    final WebViewPinItBar this$0;

    public void onClick(View view)
    {
        view = new FeedbackDialog(WebViewPinItBar.access$000(WebViewPinItBar.this), WebViewPinItBar.access$100(WebViewPinItBar.this));
        HashMap hashmap = new HashMap();
        hashmap.put("domain_url", WebViewPinItBar.access$000(WebViewPinItBar.this));
        Pinalytics.a(ElementType.BAD_LINK_BUTTON, ComponentType.BROWSER, WebViewPinItBar.access$100(WebViewPinItBar.this), hashmap);
        Events.post(new DialogEvent(view));
    }

    ()
    {
        this$0 = WebViewPinItBar.this;
        super();
    }
}
