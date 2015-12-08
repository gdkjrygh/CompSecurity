// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.view.View;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.wl.HybridScreen;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            WebViewActivity

class this._cls0
    implements android.view.er
{

    final WebViewActivity this$0;

    public void onClick(View view)
    {
        UtilityMethods.openHybridScreen(WebViewActivity.this, HybridScreen.SHOPPINGBAG);
    }

    ()
    {
        this$0 = WebViewActivity.this;
        super();
    }
}
