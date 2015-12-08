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
import com.jcp.fragments.as;
import com.jcp.fragments.t;

// Referenced classes of package com.jcp.fragments.rewards:
//            d

public class RewardsEnrollStaticPageFragment extends d
{

    public RewardsEnrollStaticPageFragment()
    {
    }

    protected String T()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030067, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f070262), ((android.app.Activity) (i())));
        return layoutinflater;
    }

    protected String a()
    {
        return "Rewards Landing Enroll Form";
    }

    public void continueButton()
    {
        h.b(false, true);
    }

    public void noThanksButton()
    {
        a(i()).c(new as(), "HomeFragment");
    }
}
