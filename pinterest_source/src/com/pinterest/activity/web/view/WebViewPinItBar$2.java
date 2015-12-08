// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;

import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.web.view:
//            WebViewPinItBar

class this._cls0
    implements android.view.er
{

    final WebViewPinItBar this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.LINK_OUT_BUTTON, ComponentType.NAVIGATION);
        if (StringUtils.isNotEmpty(WebViewPinItBar.access$000(WebViewPinItBar.this)))
        {
            ActivityHelper.goIntentView(getContext(), WebViewPinItBar.access$000(WebViewPinItBar.this));
        }
    }

    ()
    {
        this$0 = WebViewPinItBar.this;
        super();
    }
}
