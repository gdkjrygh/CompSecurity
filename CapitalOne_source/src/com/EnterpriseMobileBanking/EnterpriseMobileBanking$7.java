// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking, AppHelper

class this._cls0
    implements android.view.obileBanking._cls7
{

    final EnterpriseMobileBanking this$0;

    public void onClick(View view)
    {
        if (AppHelper.isCanadianApp())
        {
            if (AppHelper.isAuthenticated())
            {
                sendJavascript("window.location.hash='www/cards/accounts';");
                return;
            } else
            {
                sendJavascript("window.location.hash='www/cards/login';");
                return;
            }
        } else
        {
            returnToHome(view);
            return;
        }
    }

    ()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
