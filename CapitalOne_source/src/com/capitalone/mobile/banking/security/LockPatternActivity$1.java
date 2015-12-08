// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.view.View;
import android.view.ViewTreeObserver;
import com.EnterpriseMobileBanking.AppHeaderTouchHandler;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            LockPatternActivity

class this._cls0
    implements android.view.balLayoutListener
{

    final LockPatternActivity this$0;

    public void onGlobalLayout()
    {
        relContainer.setOnTouchListener(new AppHeaderTouchHandler(MenuContainer.getWidth(), LockPatternActivity.access$000(LockPatternActivity.this).getNavButton()));
        MenuContainer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    ()
    {
        this$0 = LockPatternActivity.this;
        super();
    }
}
