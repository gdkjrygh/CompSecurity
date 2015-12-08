// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;

import android.content.Context;
import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.web.view:
//            WebViewOpeninAppBar

class this._cls0
    implements android.view.ViewOpeninAppBar._cls1
{

    final WebViewOpeninAppBar this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.LINK_OUT_BUTTON, ComponentType.NAVIGATION);
        WebViewOpeninAppBar.access$100(WebViewOpeninAppBar.this).startActivity(WebViewOpeninAppBar.access$000(WebViewOpeninAppBar.this));
    }

    ()
    {
        this$0 = WebViewOpeninAppBar.this;
        super();
    }
}
