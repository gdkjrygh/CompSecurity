// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.view;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.web.view:
//            WebViewOpeninAppBar

class this._cls0
    implements android.view.ViewOpeninAppBar._cls2
{

    final WebViewOpeninAppBar this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.CANCEL_BUTTON, ComponentType.NAVIGATION);
        WebViewOpeninAppBar.access$200(WebViewOpeninAppBar.this);
    }

    ()
    {
        this$0 = WebViewOpeninAppBar.this;
        super();
    }
}
