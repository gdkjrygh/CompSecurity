// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ToggleButton;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.c.af;
import com.jcp.c.l;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.e.ae;
import com.jcp.e.al;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.g.a;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.model.Session;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.Profile;
import com.jcp.pojo.ProfilePojo;
import com.jcp.util.au;
import com.jcp.util.bk;
import com.jcp.util.bq;
import com.jcp.views.TypefaceEditTextWithClear;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s, JCPCreateAccountFragment, t, as, 
//            TrackOrderTabFragment

public class SignInFragment extends s
    implements aa, ae, al
{

    private static final String a = com/jcp/fragments/SignInFragment.getSimpleName();
    protected TypefaceEditTextWithClear etEmailAddress;
    protected TypefaceEditTextWithClear etPassword;
    protected ToggleButton tbKeepMeSignedIn;

    public SignInFragment()
    {
    }

    private void U()
    {
        JCP.e().a(null);
    }

    private SharedPreferences V()
    {
        return i().getSharedPreferences("com.jcp.activities", 0);
    }

    private boolean W()
    {
        return V().getBoolean("keep_me_signin", false);
    }

    private void X()
    {
        V().edit().putBoolean("keep_me_signin", tbKeepMeSignedIn.isChecked()).apply();
    }

    private void Z()
    {
        bk.a(new Profile(af(), ag()), i());
    }

    private void aa()
    {
        ab();
        ac();
    }

    private void ab()
    {
        q q1 = new q(i());
        q1.a(this);
        q1.a();
    }

    private void ac()
    {
        af af1 = com.jcp.c.af.b(i());
        if (af1.a())
        {
            af1.f();
        }
    }

    private void ad()
    {
        l l1 = new l(i());
        l1.a(this);
        l1.d();
    }

    private void ae()
    {
        l l1 = new l(i());
        l1.a(this);
        l1.a(com.jcp.b.b.x(), com.jcp.c.ad.a(af(), ag()), 1);
    }

    private String af()
    {
        return etEmailAddress.getEditableText().toString().trim();
    }

    private String ag()
    {
        return etPassword.getEditableText().toString().trim();
    }

    private void ah()
    {
        t t1 = a(i());
        if (t1 != null)
        {
            t1.c(new JCPCreateAccountFragment(), "CreateAccountFragment");
        }
    }

    private void ai()
    {
        t t1 = a(i());
        if (t1 != null)
        {
            t1.b(new as(), "HomeFragment");
        }
    }

    private void aj()
    {
        t t1 = a(i());
        if (t1 != null)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("TAB_STATE", 1);
            TrackOrderTabFragment trackordertabfragment = new TrackOrderTabFragment();
            trackordertabfragment.g(bundle);
            t1.b(trackordertabfragment, "TrackOrderFragment");
        }
    }

    private boolean ak()
    {
        boolean flag1 = false;
        Object obj = h();
        boolean flag = flag1;
        if (obj != null)
        {
            obj = ((Bundle) (obj)).getString("from", "");
            flag = flag1;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                flag = flag1;
                if (((String) (obj)).equalsIgnoreCase("TrackOrderFragment"))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03007f, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        i().getWindow().setSoftInputMode(32);
        return layoutinflater;
    }

    protected String a()
    {
        return "SIGNIN";
    }

    public void a(int i, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (i() == null || !n())
        {
            return;
        }
        if (com.jcp.http.b.a(i))
        {
            com.jcp.b.a.c(i(), a(0x7f07027d));
            com.jcp.g.a.e(false);
            JCP.s().a(true);
            ad();
            return;
        } else
        {
            com.jcp.util.af.a(i(), errormessageentitycontainer);
            return;
        }
    }

    public void a(int i, String s1)
    {
        com.jcp.util.ae.a(a, (new StringBuilder()).append("Could not get session: status [").append(i).append("] message [").append(s1).append("]").toString());
        aa();
    }

    public void a(Session session)
    {
        if (session != null)
        {
            com.jcp.c.af.b(i()).a(session.isRewardsEligible());
        }
        aa();
    }

    public void a(GetAccountResponse getaccountresponse, int i)
    {
        if (i() == null || !n())
        {
            return;
        }
        JCP.s().a(getaccountresponse);
        if (ak())
        {
            aj();
            return;
        } else
        {
            ai();
            return;
        }
    }

    public void a(String s1, String s2, int i)
    {
    }

    public void a(List list, int i)
    {
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int i)
    {
    }

    public void a_(String s1, int i)
    {
    }

    public void a_(ProfilePojo aprofilepojo[], int i)
    {
    }

    public void b(int i, String s1)
    {
    }

    public void f()
    {
        super.f();
        ButterKnife.reset(this);
    }

    public void f_()
    {
        super.f_();
        a(a(0x7f07042a), i());
        boolean flag = W();
        if (flag)
        {
            Profile profile = bk.a(i());
            if (profile != null)
            {
                etEmailAddress.setText(profile.getUsername());
            }
        }
        tbKeepMeSignedIn.setChecked(flag);
    }

    protected void onCreateAccountButtonClicked()
    {
        U();
        ah();
    }

    protected void onForgotPasswordClicked()
    {
        au.b(i(), com.jcp.b.b.r());
    }

    protected void onSignInButtonClicked()
    {
        U();
        boolean flag1 = bq.b(af());
        boolean flag;
        if (!TextUtils.isEmpty(ag()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 && flag)
        {
            O();
            Z();
            X();
            ae();
            return;
        } else
        {
            au.a(i(), a(0x7f07045c));
            return;
        }
    }

}
