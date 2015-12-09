// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;

public class MobileSecurityActivity extends Activity
{

    private AppHeader appheader;

    public MobileSecurityActivity()
    {
        appheader = null;
    }

    public void finish()
    {
        super.finish();
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
        setContentView(0x7f030018);
        appheader = (AppHeader)findViewById(0x7f080026);
        AppHelper.setCopyrightYear((TextView)findViewById(0x7f08004e));
        appheader.setNavOption(1);
        appheader.hideGlobalButton();
        appheader.setOnNavOptionClick(new android.view.View.OnClickListener() {

            final MobileSecurityActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = MobileSecurityActivity.this;
                super();
            }
        });
        ((WebView)findViewById(0x7f0800b3)).loadUrl("file:///android_asset/mobile_security.html");
    }

    public void onStart()
    {
        super.onStart();
    }
}
