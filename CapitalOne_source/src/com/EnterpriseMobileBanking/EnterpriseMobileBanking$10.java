// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import android.view.ViewManager;
import com.EnterpriseMobileBanking.Plugins.NativeCache;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking, AppHelper

class this._cls0
    implements android.view.bileBanking._cls10
{

    final EnterpriseMobileBanking this$0;

    public void onClick(View view)
    {
        NativeCache.staticWrite("SP_EULA_IS_ACCEPTED_VERSION", AppHelper.appVersion());
        view = findViewById(0x7f0800a3);
        view.setVisibility(8);
        ((ViewManager)view.getParent()).removeView(view);
    }

    ()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
