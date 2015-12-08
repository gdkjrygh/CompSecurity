// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.kohls.mcommerce.opal.wallet.fragment.LinkActivity;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            LoyaltyEnrollmentActivity, CMSDataRetriver

class type extends ClickableSpan
{

    final LoyaltyEnrollmentActivity this$0;
    private int type;

    public void onClick(View view)
    {
        type;
        JVM INSTR tableswitch 3 3: default 24
    //                   3 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if ((view = LoyaltyEnrollmentActivity.access$2900(LoyaltyEnrollmentActivity.this).getPropertiesFromLoyaltyHelpVO()) != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("linkurl", view.itions());
            intent.putExtra("pagetitle", getResources().getString(0x7f08051a));
            intent.setClass(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/LinkActivity);
            startActivity(intent);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void updateDrawState(TextPaint textpaint)
    {
        textpaint.setColor(getActivity().getResources().getColor(0x7f0c0040));
        textpaint.setUnderlineText(true);
    }

    public (String s, int i)
    {
        this$0 = LoyaltyEnrollmentActivity.this;
        super();
        type = i;
    }
}
