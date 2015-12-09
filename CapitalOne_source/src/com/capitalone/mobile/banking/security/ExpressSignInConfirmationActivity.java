// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.EnterpriseMobileBanking.Plugins.Components.CapitalOneTextView;
import com.capitalone.mobile.banking.session.TimeoutBroadcastReceiver;

public class ExpressSignInConfirmationActivity extends Activity
{

    private AppHeader appHeader;

    public ExpressSignInConfirmationActivity()
    {
        appHeader = null;
    }

    public void expressSignInConfirmationContinue(View view)
    {
        setResult(-1);
        finish();
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0x7f040004);
        AppHelper.getApplicationLink().setSplashSuppress(true);
    }

    public void onBackPressed()
    {
        setResult(0, new Intent());
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03000d);
        appHeader = (AppHeader)findViewById(0x7f080026);
        appHeader.setNavOption(2);
        appHeader.hideGlobalButton();
        appHeader.setOnNavOptionClick(new android.view.View.OnClickListener() {

            final ExpressSignInConfirmationActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = ExpressSignInConfirmationActivity.this;
                super();
            }
        });
        bundle = (CapitalOneTextView)findViewById(0x7f080071);
        Object obj = bundle.getText().toString();
        int i = ((String) (obj)).indexOf("SM");
        if (i >= 0)
        {
            obj = new SpannableStringBuilder(((CharSequence) (obj)));
            ((SpannableStringBuilder) (obj)).setSpan(new RelativeSizeSpan(0.6F), i, i + 2, 33);
            ((SpannableStringBuilder) (obj)).setSpan(new SuperscriptSpan(), i, i + 2, 33);
            bundle.setText(((CharSequence) (obj)));
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (!AppHelper.isAuthenticated())
        {
            sendBroadcast(new Intent(this, com/capitalone/mobile/banking/session/TimeoutBroadcastReceiver));
        }
    }
}
