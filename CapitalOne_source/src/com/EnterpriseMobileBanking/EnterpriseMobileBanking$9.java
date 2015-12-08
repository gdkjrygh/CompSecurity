// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.view.View;
import com.EnterpriseMobileBanking.Plugins.AndroidLocaleJSI;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking, AppHelper

class this._cls0
    implements Runnable
{

    final EnterpriseMobileBanking this$0;

    public void run()
    {
        if (AndroidLocaleJSI.getCountryCode().equalsIgnoreCase("CA"))
        {
            ((AppHeader)findViewById(0x7f080026)).buryNavButton();
            findViewById(0x7f0800ae).setVisibility(8);
        }
        EnterpriseMobileBanking.access$500(EnterpriseMobileBanking.this).run();
        AppHelper.setupKeyboardListener();
    }

    er()
    {
        this$0 = EnterpriseMobileBanking.this;
        super();
    }
}
