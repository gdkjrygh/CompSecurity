// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.auth.login.m;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.ab;
import com.facebook.i;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.text.CustomUrlLikeSpan;

// Referenced classes of package com.facebook.orca.login:
//            w, y, z, aa, 
//            ab, ac, ad, x

public class WildfireRegStartViewGroup extends m
    implements w
{

    public static final String LOGO1_RESOURCE = "orca:authparam:logo1";
    public static final String LOGO2_RESOURCE = "orca:authparam:logo2";
    private final ab mProgressIndicator;

    public WildfireRegStartViewGroup(Context context, x x1)
    {
        super(context, x1);
        setContentView(k.orca_wildfire_reg_start);
        mProgressIndicator = new aa(getContext(), o.wildfire_reg_check);
        context = new y(this);
        x1 = (Button)getView(i.start);
        Button button = (Button)getView(i.create_messenger_account);
        x1.setOnClickListener(context);
        button.setOnClickListener(context);
        context = new z(this);
        x1 = (Button)getView(i.login);
        button = (Button)getView(i.login_with_account);
        x1.setOnClickListener(context);
        button.setOnClickListener(context);
        int j = getResource("orca:authparam:logo1", 0);
        int l = getResource("orca:authparam:logo2", 0);
        if (j != 0)
        {
            context = (ImageView)getView(i.reg_logo_primary_a);
            x1 = (ImageView)getView(i.reg_logo_primary_b);
            context.setImageResource(j);
            x1.setImageResource(j);
        }
        if (l != 0)
        {
            context = (ImageView)getView(i.reg_logo_secondary_a);
            x1 = (ImageView)getView(i.reg_logo_secondary_b);
            context.setImageResource(l);
            x1.setImageResource(l);
        }
        context = (TextView)getView(i.reg_tos_text_a);
        context.setText(createTermsOfService(o.wildfire_reg_start));
        context.setMovementMethod(LinkMovementMethod.getInstance());
        context.setSaveEnabled(false);
        context = (TextView)getView(i.reg_tos_text_b);
        context.setText(createTermsOfService(o.wildfire_reg_login_no_create));
        context.setMovementMethod(LinkMovementMethod.getInstance());
        context.setSaveEnabled(false);
    }

    public static Bundle createParameterBundle(int j, int l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("orca:authparam:logo1", j);
        bundle.putInt("orca:authparam:logo2", l);
        return bundle;
    }

    private SpannableString createTermsOfService(int j)
    {
        Resources resources = getResources();
        CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
        customurllikespan.a(new com.facebook.orca.login.aa(this));
        CustomUrlLikeSpan customurllikespan1 = new CustomUrlLikeSpan();
        customurllikespan1.a(new com.facebook.orca.login.ab(this));
        CustomUrlLikeSpan customurllikespan2 = new CustomUrlLikeSpan();
        customurllikespan2.a(new ac(this));
        CustomUrlLikeSpan customurllikespan3 = new CustomUrlLikeSpan();
        customurllikespan3.a(new ad(this));
        com.facebook.common.w.o o1 = new com.facebook.common.w.o(resources);
        o1.a(resources.getString(o.wildfire_reg_tos));
        o1.a("[[start]]", resources.getString(j), null, 33);
        o1.a("[[terms]]", resources.getString(o.wildfire_reg_tos_terms), customurllikespan, 33);
        o1.a("[[data_use_policy]]", resources.getString(o.wildfire_reg_tos_dup), customurllikespan1, 33);
        o1.a("[[about_cookie_use]]", resources.getString(o.wildfire_reg_tos_cookies), customurllikespan2, 33);
        o1.a("[[learn_more]]", resources.getString(o.wildfire_reg_tos_learn_more), customurllikespan3, 33);
        return o1.b();
    }

    private void onCookiesClicked()
    {
        ((x)control).V();
    }

    private void onDupClicked()
    {
        ((x)control).U();
    }

    private void onLearnMoreClicked()
    {
        ((x)control).W();
    }

    private void onLoginClicked()
    {
        ((x)control).a(true);
    }

    private void onSignupClicked()
    {
        ((x)control).Q();
    }

    private void onTermsClicked()
    {
        ((x)control).T();
    }

    public void beginShowingProgress()
    {
        setVisibility(4);
        mProgressIndicator.a();
    }

    public void showStartPage(boolean flag)
    {
        LinearLayout linearlayout = (LinearLayout)getView(i.get_started_layout);
        LinearLayout linearlayout1 = (LinearLayout)getView(i.have_account_layout);
        if (flag)
        {
            linearlayout.setVisibility(8);
            linearlayout1.setVisibility(0);
            return;
        } else
        {
            linearlayout.setVisibility(0);
            linearlayout1.setVisibility(8);
            return;
        }
    }

    public void stopShowingProgress()
    {
        setVisibility(0);
        mProgressIndicator.b();
    }






}
