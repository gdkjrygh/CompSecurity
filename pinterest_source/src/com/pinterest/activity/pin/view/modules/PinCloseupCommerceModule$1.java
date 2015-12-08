// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import com.pinterest.activity.commerce.view.CloseupStatementCreditHero;
import com.pinterest.experience.ExperienceValue;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupCommerceModule

class val.promotionView
    implements com.pinterest.activity.commerce.view.UserActionListener
{

    final PinCloseupCommerceModule this$0;
    final ExperienceValue val$expValue;
    final CloseupStatementCreditHero val$promotionView;

    public void onCompleteAndDismiss()
    {
        val$expValue.b();
        removeView(val$promotionView);
    }

    rActionListener()
    {
        this$0 = final_pincloseupcommercemodule;
        val$expValue = experiencevalue;
        val$promotionView = CloseupStatementCreditHero.this;
        super();
    }
}
