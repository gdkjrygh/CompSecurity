// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.TextView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.capitalone.mobile.banking.session.TimeoutBroadcastReceiver;

public class ExpressSignInNeedHelpActivity extends Activity
{

    private AppHeader appHeader;

    public ExpressSignInNeedHelpActivity()
    {
        appHeader = null;
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0x7f040004);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03000e);
        appHeader = (AppHeader)findViewById(0x7f080026);
        ((TextView)findViewById(0x7f08001f)).setText(getResources().getString(0x7f0900a3));
        appHeader.setNavOption(2);
        appHeader.hideGlobalButton();
        appHeader.setAppHeaderDisabled(true);
        appHeader.setOnNavOptionClick(new android.view.View.OnClickListener() {

            final ExpressSignInNeedHelpActivity this$0;

            public void onClick(View view)
            {
                view = new Intent(ExpressSignInNeedHelpActivity.this, com/EnterpriseMobileBanking/EnterpriseMobileBanking);
                view.putExtra("SuppressSplash", true);
                startActivity(view);
                overridePendingTransition(0, 0x7f040004);
            }

            
            {
                this$0 = ExpressSignInNeedHelpActivity.this;
                super();
            }
        });
        bundle = (TextView)findViewById(0x7f080077);
        Object obj = new SpannableStringBuilder(bundle.getText().toString());
        for (int i = TextUtils.indexOf(((CharSequence) (obj)), "SM"); i >= 0; i = TextUtils.indexOf(((CharSequence) (obj)), "SM", "SM".length() + i))
        {
            ((SpannableStringBuilder) (obj)).setSpan(new RelativeSizeSpan(0.6F), i, i + 2, 33);
            ((SpannableStringBuilder) (obj)).setSpan(new SuperscriptSpan(), i, i + 2, 33);
        }

        bundle.setText(((CharSequence) (obj)));
        bundle = (TextView)findViewById(0x7f080079);
        obj = bundle.getText().toString();
        int j = ((String) (obj)).indexOf("SM");
        if (j >= 0)
        {
            obj = new SpannableStringBuilder(((CharSequence) (obj)));
            ((SpannableStringBuilder) (obj)).setSpan(new RelativeSizeSpan(0.6F), j, j + 2, 33);
            ((SpannableStringBuilder) (obj)).setSpan(new SuperscriptSpan(), j, j + 2, 33);
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

    public void onStart()
    {
        super.onStart();
        appHeader.postDelayed(new Runnable() {

            final ExpressSignInNeedHelpActivity this$0;

            public void run()
            {
                appHeader.setAppHeaderDisabled(false);
            }

            
            {
                this$0 = ExpressSignInNeedHelpActivity.this;
                super();
            }
        }, getResources().getInteger(0x7f0b0003));
    }

    public void sureSwipeSettings(View view)
    {
        view = new Intent();
        view.putExtra("SuppressSplash", true);
        view.putExtra("sureSwipeSettings", "sureSwipeSettingsPage");
        setResult(2000, view);
        finish();
    }

}
