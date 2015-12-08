// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.c.ad;
import com.jcp.c.l;
import com.jcp.e.ae;
import com.jcp.e.t;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.JCPCreateAccountFragment;
import com.jcp.fragments.s;
import com.jcp.http.b;
import com.jcp.util.af;
import com.jcp.util.au;
import com.jcp.views.TypefaceTextView;

public class RewardsConnectAccountsSignInToJCPFragment extends s
    implements ae
{

    private static final String a = com/jcp/fragments/rewards/RewardsConnectAccountsSignInToJCPFragment.getSimpleName();
    private boolean b;
    private t c;
    protected EditText etEmail;
    protected EditText etPassword;
    protected TypefaceTextView tvPrompt;

    public RewardsConnectAccountsSignInToJCPFragment()
    {
    }

    protected String T()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030079, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f070262), ((android.app.Activity) (i())));
        tvPrompt.setText(Html.fromHtml(j().getString(0x7f070366)));
        viewgroup = h();
        if (viewgroup != null)
        {
            b = viewgroup.getBoolean("intent_user_has_rewards_account", false);
        }
        return layoutinflater;
    }

    protected String a()
    {
        return "Rewards Connect Prompt";
    }

    public void a(int i, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (i() == null || !n())
        {
            return;
        }
        if (com.jcp.http.b.a(i))
        {
            JCP.s().a(true);
            Toast.makeText(i(), j().getString(0x7f07027d), 1).show();
            c.c(b, Q());
            return;
        } else
        {
            af.a(i(), errormessageentitycontainer);
            return;
        }
    }

    public void a(Context context)
    {
        super.a(context);
        try
        {
            c = (t)context;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(context.toString()).append(" must implement LoginListener").toString());
        }
    }

    public void b(int i, String s1)
    {
    }

    public void createAnAccountClicked()
    {
        JCPCreateAccountFragment jcpcreateaccountfragment = new JCPCreateAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("intent_from_rewards_landing_page", true);
        jcpcreateaccountfragment.g(bundle);
        a(i()).c(jcpcreateaccountfragment, "CreateAccountFragment");
    }

    public void f()
    {
        super.f();
        ButterKnife.reset(this);
    }

    public void forgotPassword()
    {
        au.b(i(), com.jcp.b.b.r());
    }

    public void signInClicked()
    {
        String s1 = etEmail.getText().toString();
        String s2 = etPassword.getText().toString();
        if (TextUtils.isEmpty(s1))
        {
            au.a(i(), a(0x7f0701aa));
            return;
        }
        if (TextUtils.isEmpty(s2))
        {
            au.a(i(), a(0x7f0701ad));
            return;
        } else
        {
            l l1 = new l(i());
            l1.a(this);
            l1.a(com.jcp.b.b.x(), ad.a(s1.trim(), s2.trim()), 1);
            return;
        }
    }

}
