// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.jcp.fragments.ah;
import com.jcp.fragments.et;
import com.jcp.fragments.s;
import com.jcp.fragments.t;
import com.jcp.views.TypefaceTextView;

public class RewardsConfirmationFragment extends s
{

    protected ImageView linkImage;
    protected TypefaceTextView tvConfirmation;

    public RewardsConfirmationFragment()
    {
    }

    protected String T()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030077, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f070262), ((android.app.Activity) (i())));
        c(h());
        return layoutinflater;
    }

    protected String a()
    {
        return "Rewards Connect Prompt Success";
    }

    public void c(Bundle bundle)
    {
        if (bundle != null)
        {
            boolean flag = bundle.getBoolean("jcp_account_created", false);
            boolean flag1 = bundle.getBoolean("rewards_account_created", false);
            int i;
            if (flag)
            {
                bundle = tvConfirmation;
                if (flag1)
                {
                    i = 0x7f07037f;
                } else
                {
                    i = 0x7f070381;
                }
                bundle.setText(i);
            } else
            {
                bundle = tvConfirmation;
                if (flag1)
                {
                    i = 0x7f070382;
                } else
                {
                    i = 0x7f070377;
                }
                bundle.setText(i);
            }
            bundle = linkImage;
            if (flag && flag1)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            bundle.setVisibility(i);
        }
    }

    public void f()
    {
        super.f();
        ButterKnife.reset(this);
    }

    public void myProfile()
    {
        a(i()).b(new et(), "RewardsConfirmationFragment");
    }

    public void startShopping()
    {
        a(i()).b(new ah(), "RewardsConfirmationFragment");
    }
}
