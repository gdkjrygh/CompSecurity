// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.e.ae;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.ez;
import com.jcp.fragments.t;
import com.jcp.util.au;
import com.jcp.util.bn;
import com.jcp.util.bq;
import com.jcp.views.PhoneTypefaceEditText;

// Referenced classes of package com.jcp.fragments.rewards:
//            k, m, j

public class RewardsBonusPointsPromoFragment extends ez
    implements ae
{

    private static final String a = com/jcp/fragments/rewards/RewardsBonusPointsPromoFragment.getName();
    private boolean b;
    private boolean c;
    private String d;
    protected TextView getBonusPointsDetails;
    protected RelativeLayout greyOutScreen;
    protected LinearLayout offerLayout;
    protected EditText rewardsEmail;
    protected PhoneTypefaceEditText rewardsPhoneNumber;
    protected LinearLayout successLayout;

    public RewardsBonusPointsPromoFragment()
    {
    }

    private void V()
    {
        android.content.SharedPreferences.Editor editor = JCP.d().getSharedPreferences("rewardsBonusPoints", 0).edit();
        editor.putBoolean("promoOffered", true);
        editor.commit();
    }

    static void a(RewardsBonusPointsPromoFragment rewardsbonuspointspromofragment)
    {
        rewardsbonuspointspromofragment.V();
    }

    private void a(CharSequence charsequence, EditText edittext)
    {
        if (charsequence.length() > 0 && edittext.length() > 0)
        {
            edittext.setText("");
        }
    }

    public boolean U()
    {
        boolean flag1 = false;
        JCP jcp = JCP.d();
        boolean flag = flag1;
        if (jcp.t())
        {
            flag = flag1;
            if (!jcp.getSharedPreferences("rewardsBonusPoints", 0).getBoolean("promoOffered", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300d2, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        viewgroup = j().getString(0x7f0701f9);
        bundle = new SpannableStringBuilder(viewgroup);
        String s = j().getString(0x7f0701fa);
        int i = viewgroup.indexOf(s);
        if (i >= 0)
        {
            bundle.setSpan(new k(this), i, s.length() + i, 0);
        }
        getBonusPointsDetails.setMovementMethod(LinkMovementMethod.getInstance());
        getBonusPointsDetails.setText(bundle, android.widget.TextView.BufferType.SPANNABLE);
        return layoutinflater;
    }

    protected String a()
    {
        return "REWARDSBONUSPOINTSPROMO";
    }

    public void a(int i, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        switch (i)
        {
        default:
            au.a(i(), a(0x7f0702b7));
            return;

        case 201: 
            offerLayout.setVisibility(8);
            successLayout.setVisibility(0);
            return;

        case 401: 
            break;
        }
        if (c)
        {
            errormessageentitycontainer = a(0x7f07035f);
        } else
        {
            errormessageentitycontainer = a(0x7f070360);
        }
        au.a(i(), errormessageentitycontainer, new m(this));
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        b = false;
        c = false;
    }

    public void b()
    {
        a(a(0x7f070361));
        super.b();
    }

    public void b(int i, String s)
    {
    }

    public void d()
    {
        super.d();
        (new Thread(new j(this))).start();
    }

    public void emailTextChanged(CharSequence charsequence)
    {
        com.jcp.util.ae.d(a, (new StringBuilder()).append("emailTextChangedWatcher, chars = ").append(charsequence.toString()).toString());
        a(charsequence, rewardsPhoneNumber);
    }

    public void enrollNow()
    {
        bn.a(a(i()), i(), true);
    }

    public void getBonusPoints()
    {
        if (rewardsPhoneNumber.a())
        {
            d = rewardsPhoneNumber.getPhoneNumber();
            b = true;
            c = false;
        } else
        {
            String s = rewardsEmail.getText().toString();
            if (!s.isEmpty() && bq.b(s))
            {
                d = s;
                b = true;
                c = true;
            }
        }
        if (!b)
        {
            au.a(i(), a(0x7f0701af));
            return;
        } else
        {
            com.jcp.c.ae ae1 = new com.jcp.c.ae(i());
            ae1.a(this);
            ae1.a(d, c);
            return;
        }
    }

    public void phoneNumberTextChanged(CharSequence charsequence)
    {
        com.jcp.util.ae.d(a, (new StringBuilder()).append("phoneNumberTextChangedWatcher, chars = ").append(charsequence.toString()).toString());
        a(charsequence, rewardsEmail);
    }

    public void startShopping()
    {
        a(i()).o();
    }

}
