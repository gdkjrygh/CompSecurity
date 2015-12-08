// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.jcp.e.ag;
import com.jcp.fragments.JCPCreateAccountFragment;
import com.jcp.fragments.t;

// Referenced classes of package com.jcp.fragments.rewards:
//            d

public class RewardsSignInStaticPageFragment extends d
{

    public RewardsSignInStaticPageFragment()
    {
    }

    protected String T()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030080, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f070262), ((android.app.Activity) (i())));
        return layoutinflater;
    }

    protected String a()
    {
        return "Rewards Connect Prompt";
    }

    public void connectExistingAccounts()
    {
        h.b(true, true);
    }

    public void createNewJCPProfile()
    {
        a(i()).c(new JCPCreateAccountFragment(), "CreateAccountFragment");
    }
}
