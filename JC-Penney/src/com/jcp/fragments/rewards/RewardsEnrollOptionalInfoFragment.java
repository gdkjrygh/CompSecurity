// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import butterknife.ButterKnife;
import com.jcp.b.b;
import com.jcp.c.l;
import com.jcp.e.ag;
import com.jcp.helper.ad;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.searchentity.SearchCityAndStateContainer;
import com.jcp.views.TypefaceEditText;

// Referenced classes of package com.jcp.fragments.rewards:
//            BaseRewardsEnrollFragment

public class RewardsEnrollOptionalInfoFragment extends BaseRewardsEnrollFragment
{

    private RewardsAccount i;

    public RewardsEnrollOptionalInfoFragment()
    {
    }

    private void c(Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("intent_rewards_account_object"))
        {
            i = (RewardsAccount)bundle.getSerializable("intent_rewards_account_object");
            bundle = new l(i());
            bundle.a(this);
            bundle.a(b.x(i.getZip()), 0);
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03007b, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f07019b), ((android.app.Activity) (i())));
        U();
        c(h());
        return layoutinflater;
    }

    protected String a()
    {
        return "REWARDSOPTIONALINFOENROLL";
    }

    public void a(SearchCityAndStateContainer searchcityandstatecontainer)
    {
        super.a(searchcityandstatecontainer);
        V();
    }

    public void onCreateRewardsAccountClick()
    {
        if (i != null)
        {
            i.setAddressLineOne(etAddressLineOne.getText().toString());
            i.setAddressLineTwo(etAddressLineTwo.getText().toString());
            i.setCity(etCity.getText().toString());
            i.setState(ad.b(spState.getSelectedItem().toString(), i()));
            RewardsAccount rewardsaccount = i;
            String s;
            if (f != null)
            {
                s = String.valueOf(f);
            } else
            {
                s = "";
            }
            rewardsaccount.setBirthMonth(s);
            rewardsaccount = i;
            if (g != null)
            {
                s = String.valueOf(g);
            } else
            {
                s = "";
            }
            rewardsaccount.setBirthDate(s);
        }
        h.b(i);
    }

    public void onSkipClick()
    {
        h.b(i);
    }
}
