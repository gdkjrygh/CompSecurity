// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;

public class ExpressSignInHelpActivity extends Activity
{

    public static final int BACK_PRESSED_RESULT_CODE = 0xdeadbeef;
    private AppHeader appHeader;

    public ExpressSignInHelpActivity()
    {
        appHeader = null;
    }

    private void doBackAction()
    {
        setResult(0xdeadbeef);
        finish();
    }

    public void onBackPressed()
    {
        doBackAction();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new ColorDrawable(0);
        Window window = getWindow();
        if (window != null)
        {
            window.setBackgroundDrawable(bundle);
        }
        setContentView(0x7f03000a);
        appHeader = (AppHeader)findViewById(0x7f080026);
        AppHelper.setCopyrightYear((TextView)findViewById(0x7f08004e));
        ((TextView)findViewById(0x7f08001f)).setText(getResources().getString(0x7f0900a3));
        appHeader.setNavOption(1);
        appHeader.setOnGlobalButtonClick(new android.view.View.OnClickListener() {

            final ExpressSignInHelpActivity this$0;

            public void onClick(View view)
            {
                view = new Intent();
                view.putExtra("LockPatternAction", "ReturnToHome");
                setResult(2000, view);
                finish();
            }

            
            {
                this$0 = ExpressSignInHelpActivity.this;
                super();
            }
        });
        appHeader.setOnNavOptionClick(new android.view.View.OnClickListener() {

            final ExpressSignInHelpActivity this$0;

            public void onClick(View view)
            {
                doBackAction();
            }

            
            {
                this$0 = ExpressSignInHelpActivity.this;
                super();
            }
        });
        ((WebView)findViewById(0x7f080062)).loadUrl("file:///android_asset/pattern_help.html");
    }

    public void returnToLogin(View view)
    {
        startActivity(new Intent(this, com/EnterpriseMobileBanking/EnterpriseMobileBanking));
    }

}
