// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.EditText;
import com.jcp.views.TypefaceTextView;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsConnectAccountsSignInToJCPFragment, p, q, r

public class 
    implements butterknife..ViewInjector
{

    public void inject(butterknife..ViewInjector viewinjector, RewardsConnectAccountsSignInToJCPFragment rewardsconnectaccountssignintojcpfragment, Object obj)
    {
        rewardsconnectaccountssignintojcpfragment.tvPrompt = (TypefaceTextView)viewinjector.tvPrompt((View)viewinjector.tvPrompt(obj, 0x7f0e02d4, "field 'tvPrompt'"), 0x7f0e02d4, "field 'tvPrompt'");
        rewardsconnectaccountssignintojcpfragment.etEmail = (EditText)viewinjector.etEmail((View)viewinjector.etEmail(obj, 0x7f0e02d5, "field 'etEmail'"), 0x7f0e02d5, "field 'etEmail'");
        rewardsconnectaccountssignintojcpfragment.etPassword = (EditText)viewinjector.etPassword((View)viewinjector.etPassword(obj, 0x7f0e02d6, "field 'etPassword'"), 0x7f0e02d6, "field 'etPassword'");
        ((View)viewinjector.etPassword(obj, 0x7f0e02d7, "method 'signInClicked'")).setOnClickListener(new p(this, rewardsconnectaccountssignintojcpfragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02d8, "method 'createAnAccountClicked'")).setOnClickListener(new q(this, rewardsconnectaccountssignintojcpfragment));
        ((View)viewinjector.ViewInjector(obj, 0x7f0e02d0, "method 'forgotPassword'")).setOnClickListener(new r(this, rewardsconnectaccountssignintojcpfragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsConnectAccountsSignInToJCPFragment)obj, obj1);
    }

    public void reset(RewardsConnectAccountsSignInToJCPFragment rewardsconnectaccountssignintojcpfragment)
    {
        rewardsconnectaccountssignintojcpfragment.tvPrompt = null;
        rewardsconnectaccountssignintojcpfragment.etEmail = null;
        rewardsconnectaccountssignintojcpfragment.etPassword = null;
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsConnectAccountsSignInToJCPFragment)obj);
    }

    public ()
    {
    }
}
