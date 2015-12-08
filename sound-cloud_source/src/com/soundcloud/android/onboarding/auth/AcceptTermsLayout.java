// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.soundcloud.android.utils.ScTextUtils;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            SignupVia

public class AcceptTermsLayout extends RelativeLayout
{
    public static interface AcceptTermsHandler
    {

        public abstract void onAcceptTerms(SignupVia signupvia, Bundle bundle);

        public abstract void onRejectTerms();

        public abstract void onShowPrivacyPolicy();

        public abstract void onShowTermsOfUse();
    }


    private static final String BUNDLE_SIGNUP_PARAMS = "BUNDLE_TERMS_SIGNUP_PARAMS";
    private static final String BUNDLE_SIGNUP_VIA = "BUNDLE_TERMS_SIGNUP_VIA";
    private AcceptTermsHandler acceptTermsHandler;
    private Bundle signupParams;
    private SignupVia signupVia;

    public AcceptTermsLayout(Context context)
    {
        super(context);
    }

    public AcceptTermsLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AcceptTermsLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public AcceptTermsHandler getAcceptTermsHandler()
    {
        return acceptTermsHandler;
    }

    public Bundle getStateBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putBundle("BUNDLE_TERMS_SIGNUP_PARAMS", signupParams);
        bundle.putCharSequence("BUNDLE_TERMS_SIGNUP_VIA", signupVia.name);
        return bundle;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        findViewById(0x7f0f0096).setOnClickListener(new _cls1());
        findViewById(0x7f0f0097).setOnClickListener(new _cls2());
        ScTextUtils.clickify((TextView)findViewById(0x102000b), getResources().getString(0x7f0701ff), new _cls3(), false, false);
        ScTextUtils.clickify((TextView)findViewById(0x102000b), getResources().getString(0x7f0701a9), new _cls4(), false, false);
    }

    public void setAcceptTermsHandler(AcceptTermsHandler accepttermshandler)
    {
        acceptTermsHandler = accepttermshandler;
    }

    public void setSignupParams(SignupVia signupvia, Bundle bundle)
    {
        signupVia = signupvia;
        signupParams = bundle;
    }

    public void setState(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            signupVia = SignupVia.fromString(bundle.getString("BUNDLE_TERMS_SIGNUP_VIA"));
            signupParams = bundle.getBundle("BUNDLE_TERMS_SIGNUP_PARAMS");
            return;
        }
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final AcceptTermsLayout this$0;

        public void onClick(View view)
        {
            getAcceptTermsHandler().onRejectTerms();
        }

        _cls1()
        {
            this$0 = AcceptTermsLayout.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final AcceptTermsLayout this$0;

        public void onClick(View view)
        {
            getAcceptTermsHandler().onAcceptTerms(signupVia, signupParams);
        }

        _cls2()
        {
            this$0 = AcceptTermsLayout.this;
            super();
        }
    }


    private class _cls3
        implements com.soundcloud.android.utils.ScTextUtils.ClickSpan.OnClickListener
    {

        final AcceptTermsLayout this$0;

        public void onClick()
        {
            getAcceptTermsHandler().onShowTermsOfUse();
        }

        _cls3()
        {
            this$0 = AcceptTermsLayout.this;
            super();
        }
    }


    private class _cls4
        implements com.soundcloud.android.utils.ScTextUtils.ClickSpan.OnClickListener
    {

        final AcceptTermsLayout this$0;

        public void onClick()
        {
            getAcceptTermsHandler().onShowPrivacyPolicy();
        }

        _cls4()
        {
            this$0 = AcceptTermsLayout.this;
            super();
        }
    }

}
