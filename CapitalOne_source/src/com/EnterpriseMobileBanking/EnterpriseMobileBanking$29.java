// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.EnterpriseMobileBanking.Plugins.Components.AppWebView;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking, AppHelper

class this._cls0
    implements Runnable
{

    final EnterpriseMobileBanking this$0;

    public void run()
    {
        ((AppWebView)AppHelper.getAppView()).setmAppWebViewDisplayBlocked(false);
        if (EnterpriseMobileBanking.access$300(EnterpriseMobileBanking.this).isAppHeaderDisabled())
        {
            EnterpriseMobileBanking.access$300(EnterpriseMobileBanking.this).setAppHeaderDisabled(false);
        }
    }

    r()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
