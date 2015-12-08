// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.b.a;
import com.jcp.e.ae;
import com.jcp.e.ag;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.t;
import com.jcp.http.b;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.util.af;
import com.jcp.util.au;

// Referenced classes of package com.jcp.fragments.rewards:
//            d, RewardsEnrollFragment

public class RewardsConnectAccountsSignInToRewardsFragment extends d
    implements ae, ag
{

    private static final String a = com/jcp/fragments/rewards/RewardsConnectAccountsSignInToRewardsFragment.getSimpleName();
    private boolean b;
    protected EditText etEmail;
    protected EditText etPassword;
    protected LinearLayout greenBox;
    protected View rewardsEnrollContainer;

    public RewardsConnectAccountsSignInToRewardsFragment()
    {
    }

    private void c(Bundle bundle)
    {
        boolean flag = false;
        int i;
        if (bundle != null)
        {
            b = bundle.getBoolean("jcp_account_created", false);
            String s = bundle.getString("intent_email", "");
            boolean flag1 = bundle.getBoolean("intent_user_has_rewards_account", false);
            if (!s.isEmpty())
            {
                etEmail.setText(s);
                etPassword.requestFocus();
            }
            bundle = rewardsEnrollContainer;
            if (flag1)
            {
                i = 8;
            } else
            {
                i = 0;
            }
            bundle.setVisibility(i);
        }
        bundle = greenBox;
        if (b)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        bundle.setVisibility(i);
    }

    protected String T()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030078, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f070262), ((android.app.Activity) (i())));
        c(h());
        return layoutinflater;
    }

    protected String a()
    {
        return "Rewards Connect Prompt";
    }

    public void a(int i, ErrorMessageEntityContainer errormessageentitycontainer)
    {
label0:
        {
            com.jcp.b.a.i();
            if (i() != null && com.jcp.http.b.b(i))
            {
                if (b)
                {
                    break label0;
                }
                au.a(i(), errormessageentitycontainer);
            }
            return;
        }
        au.a(i(), j().getString(0x7f0701bb), errormessageentitycontainer);
    }

    public void a(RewardsAccount rewardsaccount)
    {
    }

    public void a(RewardsProfile rewardsprofile)
    {
    }

    public void a(String s, String s1, int i)
    {
        com.jcp.b.a.i();
        com.jcp.util.ae.a(a, (new StringBuilder()).append("Failure: [").append(s).append("], message [").append(s1).append("]").toString());
    }

    public void a(boolean flag, boolean flag1)
    {
    }

    public void a(boolean flag, boolean flag1, String s)
    {
    }

    public void a_(String s, int i)
    {
        com.jcp.b.a.i();
        if (i != 68) goto _L2; else goto _L1
_L1:
        if (!b) goto _L4; else goto _L3
_L3:
        com.jcp.h.a.g();
_L6:
        h.a(b, false);
_L2:
        return;
_L4:
        if (!R())
        {
            if (Q())
            {
                com.jcp.h.a.p();
            } else
            {
                com.jcp.h.a.k();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void b(int i, String s)
    {
    }

    public void b(RewardsAccount rewardsaccount)
    {
    }

    public void b(boolean flag, boolean flag1)
    {
    }

    public void connectAccountsClicked()
    {
        String s2 = etEmail.getText().toString();
        String s3 = etPassword.getText().toString();
        if (TextUtils.isEmpty(s2))
        {
            au.a(i(), a(0x7f0701aa));
            return;
        }
        if (TextUtils.isEmpty(s3))
        {
            au.a(i(), a(0x7f0701ad));
            return;
        }
        com.jcp.c.af af1;
        if (R())
        {
            String s1 = "";
            String s = s1;
            if (JCP.s().c())
            {
                GetAccountResponse getaccountresponse = JCP.j();
                s = s1;
                if (getaccountresponse != null)
                {
                    s = getaccountresponse.getId();
                }
            }
            com.jcp.h.a.a(s);
        } else
        if (Q())
        {
            com.jcp.h.a.o();
        } else
        {
            com.jcp.h.a.j();
        }
        O();
        com.jcp.b.a.b(i(), a(0x7f070317));
        af1 = com.jcp.c.af.b(i());
        af1.a(this);
        af1.a(this);
        af1.a(s2.trim(), s3.trim());
    }

    public void enrollInRewards()
    {
        com.jcp.h.a.h();
        a(i()).c(new RewardsEnrollFragment(), "RewardsEnrollFragment");
    }

    public void forgotPassword()
    {
        au.b(i(), com.jcp.b.b.v());
    }

    public void resendWelcomeEmail()
    {
        com.jcp.h.a.l();
        au.b(i(), com.jcp.b.b.u());
    }

}
