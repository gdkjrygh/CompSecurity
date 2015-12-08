// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.analytics.utils.enums.ScreenNames;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.loyalty.CMSDataRetriver;
import com.kohls.mcommerce.opal.wallet.fragment.LinkActivity;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            Yes2YouInviteFriendActivity

private class <init> extends ClickableSpan
{

    final Yes2YouInviteFriendActivity this$0;

    public void onClick(View view)
    {
        findViewById(0x7f0d012e).setClickable(false);
        view = Yes2YouInviteFriendActivity.access$900(Yes2YouInviteFriendActivity.this).getPropertiesFromLoyaltyHelpVO();
        if (view != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("linkurl", view.());
            intent.putExtra("pagetitle", getResources().getString(0x7f08051a));
            intent.setClass(getApplicationContext(), com/kohls/mcommerce/opal/wallet/fragment/LinkActivity);
            startActivity(intent);
            AnalyticsHelper.sendAnalyticsForRewards(ScreenNames.REWARDS_TERMS_CONDITIONS);
        }
        findViewById(0x7f0d012e).setClickable(true);
    }

    public void updateDrawState(TextPaint textpaint)
    {
        textpaint.setColor(0xff000000);
        textpaint.setFlags(textpaint.getFlags() | 8);
    }

    private ()
    {
        this$0 = Yes2YouInviteFriendActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
