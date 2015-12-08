// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.Components.AppHeader;
import com.EnterpriseMobileBanking.Plugins.Components.CapitalOneTextView;
import com.capitalone.mobile.banking.session.TimeoutBroadcastReceiver;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            LockPatternActivity

public class ExpressSignInIntroActivity extends Activity
{

    private AppHeader appHeader;
    private String expressSignInPreference;

    public ExpressSignInIntroActivity()
    {
        appHeader = null;
    }

    public void declineSureSwipeAction(View view)
    {
        view = new Intent();
        view.putExtra("LockPatternAction", "DECLINE");
        if (TextUtils.equals(expressSignInPreference, "ASK_LATER"))
        {
            view.putExtra("DeclineSureSwipe", "NEVER");
        } else
        {
            view.putExtra("DeclineSureSwipe", "ASK_LATER");
        }
        setResult(-1, view);
        finish();
    }

    public void expressSignInCreatePattern(View view)
    {
        view = new Intent(this, com/capitalone/mobile/banking/security/LockPatternActivity);
        view.putExtra("lockpattern_mode", group.pals.android.lib.ui.lockpattern.BaseLockPatternActivity.LPMode.CreatePattern.toString());
        view.putExtra("AppHeaderNavOption", "CLOSE");
        view.putExtra("isSlideUpOffer", "true");
        startActivityForResult(view, 2112);
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0x7f040004);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        setResult(j, intent);
        finish();
    }

    public void onCreate(final Bundle introHeaderTextView)
    {
        super.onCreate(introHeaderTextView);
        introHeaderTextView = new ColorDrawable(0);
        Object obj = getWindow();
        if (obj != null)
        {
            ((Window) (obj)).setBackgroundDrawable(introHeaderTextView);
        }
        setContentView(0x7f03000b);
        appHeader = (AppHeader)findViewById(0x7f080026);
        appHeader.setNavOption(2);
        appHeader.hideGlobalButton();
        appHeader.setAppHeaderDisabled(true);
        appHeader.setOnNavOptionClick(new android.view.View.OnClickListener() {

            final ExpressSignInIntroActivity this$0;

            public void onClick(View view)
            {
                view = new Intent(ExpressSignInIntroActivity.this, com/EnterpriseMobileBanking/EnterpriseMobileBanking);
                view.putExtra("SuppressSplash", true);
                startActivity(view);
                overridePendingTransition(0, 0x7f040004);
            }

            
            {
                this$0 = ExpressSignInIntroActivity.this;
                super();
            }
        });
        expressSignInPreference = getIntent().getStringExtra("expressSignInPreference");
        if (TextUtils.equals(expressSignInPreference, "ASK_LATER"))
        {
            ((Button)findViewById(0x7f08006c)).setText(0x7f0900c8);
        }
        introHeaderTextView = (CapitalOneTextView)findViewById(0x7f080067);
        obj = introHeaderTextView.getText().toString();
        int i = ((String) (obj)).indexOf("SM");
        if (i >= 0)
        {
            obj = new SpannableStringBuilder(((CharSequence) (obj)));
            ((SpannableStringBuilder) (obj)).setSpan(new RelativeSizeSpan(0.6F), i, i + 2, 33);
            ((SpannableStringBuilder) (obj)).setSpan(new SuperscriptSpan(), i, i + 2, 33);
            introHeaderTextView.setText(((CharSequence) (obj)));
        }
        introHeaderTextView = (TextView)findViewById(0x7f08006a);
        obj = introHeaderTextView.getText().toString();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(getString(0x7f0900cb));
        spannablestringbuilder.setSpan(new ClickableSpan() {

            final ExpressSignInIntroActivity this$0;
            final TextView val$introHeaderTextView;

            public void onClick(View view)
            {
                view = getString(0x7f0900cc);
                introHeaderTextView.setText(introHeaderTextView.getText().subSequence(0, introHeaderTextView.getText().length() - 7));
                introHeaderTextView.append(view);
            }

            
            {
                this$0 = ExpressSignInIntroActivity.this;
                introHeaderTextView = textview;
                super();
            }
        }, 0, spannablestringbuilder.length(), 33);
        introHeaderTextView.setText(((CharSequence) (obj)));
        introHeaderTextView.append(spannablestringbuilder);
        introHeaderTextView.setMovementMethod(LinkMovementMethod.getInstance());
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

            final ExpressSignInIntroActivity this$0;

            public void run()
            {
                appHeader.setAppHeaderDisabled(false);
            }

            
            {
                this$0 = ExpressSignInIntroActivity.this;
                super();
            }
        }, getResources().getInteger(0x7f0b0003));
    }

}
