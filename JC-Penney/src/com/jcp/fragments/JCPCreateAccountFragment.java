// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.activities.CaPrivacyPolicyActivity;
import com.jcp.activities.PrivacyPolicyActivity;
import com.jcp.b.a;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.c.af;
import com.jcp.c.l;
import com.jcp.e.ae;
import com.jcp.e.ag;
import com.jcp.e.al;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.rewards.d;
import com.jcp.model.Session;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.pojo.Profile;
import com.jcp.util.au;
import com.jcp.util.bk;
import com.jcp.util.bq;
import com.jcp.util.z;
import com.jcp.views.PhoneTypefaceEditText;
import com.jcp.views.TypefaceEditText;
import com.jcp.widget.rewards.AgreeToTermsAndConditions;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            et, t, be, bf, 
//            bg, bd

public class JCPCreateAccountFragment extends d
    implements ae, ag, al
{

    private static final String a = com/jcp/fragments/JCPCreateAccountFragment.getSimpleName();
    protected CheckBox cbEmailOptIn;
    protected LinearLayout emailOptInSection;
    protected LinearLayout enrollInRewardsContainer;
    protected EditText etEmail;
    protected EditText etFirstName;
    protected EditText etLastName;
    protected TypefaceEditText etPassword;
    protected EditText etPasswordConfirm;
    protected ToggleButton keepMeSignedIn;
    protected TextView msgMissingFields;
    protected RadioButton radioEnrollInRewards;
    protected RadioButton radioLinkToRewards;
    protected RadioButton radioNotInterestedInRewards;
    protected PhoneTypefaceEditText rewardsEnrollPhone;
    protected EditText rewardsEnrollZip;
    protected LinearLayout rewardsInlineEnroll;
    protected Spinner spPhoneTypeSpinner;
    protected AgreeToTermsAndConditions termsAndConditions;

    public JCPCreateAccountFragment()
    {
    }

    private SharedPreferences U()
    {
        return i().getSharedPreferences("com.jcp.activities", 0);
    }

    private void V()
    {
        SharedPreferences sharedpreferences = U();
        if (sharedpreferences.contains("PERSISTENT_COOKIE"))
        {
            sharedpreferences.edit().remove("PERSISTENT_COOKIE").apply();
        }
    }

    private void W()
    {
        if (af.b(i()).a())
        {
            enrollInRewardsContainer.setVisibility(0);
            a(spPhoneTypeSpinner);
            return;
        } else
        {
            enrollInRewardsContainer.setVisibility(8);
            return;
        }
    }

    private boolean X()
    {
        boolean flag = a(etFirstName);
        boolean flag1 = a(etLastName);
        boolean flag2 = a(etEmail);
        boolean flag3 = a(etPassword);
        boolean flag4 = a(etPasswordConfirm);
        return flag || flag1 || flag2 || flag3 || flag4;
    }

    private Map Z()
    {
        boolean flag = true;
        if (radioNotInterestedInRewards.isChecked())
        {
            flag = cbEmailOptIn.isChecked();
        }
        return (new ad()).b(etEmail.getText().toString()).c(etPassword.getText().toString()).d(etFirstName.getText().toString()).e(etLastName.getText().toString()).a(flag).a();
    }

    static void a(JCPCreateAccountFragment jcpcreateaccountfragment)
    {
        jcpcreateaccountfragment.ab();
    }

    private boolean a(EditText edittext)
    {
        boolean flag = true;
        int i;
        if (edittext instanceof PhoneTypefaceEditText)
        {
            if (!((PhoneTypefaceEditText)edittext).a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (edittext.length() != 0)
        {
            flag = false;
        }
        if (flag)
        {
            i = 0x7f0201b7;
        } else
        {
            i = 0x7f020124;
        }
        edittext.setBackgroundResource(i);
        if (flag)
        {
            i = j().getColor(0x7f0d006c);
        } else
        {
            i = j().getColor(0x7f0d005d);
        }
        edittext.setHintTextColor(i);
        return flag;
    }

    private boolean aa()
    {
        boolean flag;
        boolean flag2;
        boolean flag3 = true;
        boolean flag4 = a(rewardsEnrollPhone);
        boolean flag1;
        if (a(rewardsEnrollZip) || !bq.d(rewardsEnrollZip.getText().toString()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!termsAndConditions.a())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!radioEnrollInRewards.isChecked())
        {
            break MISSING_BLOCK_LABEL_127;
        }
        flag2 = flag3;
        if (!flag4)
        {
            flag2 = flag3;
            if (!flag)
            {
                if (!flag1)
                {
                    break MISSING_BLOCK_LABEL_127;
                }
                flag2 = flag3;
            }
        }
_L1:
        if (flag2)
        {
            String s;
            if (flag4)
            {
                s = a(0x7f0701ae);
            } else
            if (flag)
            {
                s = a(0x7f0701b1);
            } else
            {
                s = a(0x7f070315);
            }
            au.a(i(), s);
        }
        return flag2;
        flag2 = false;
          goto _L1
    }

    private void ab()
    {
        a(i()).b(new et(), "ProfileFragment");
    }

    private boolean b(String s)
    {
        String s1;
        String s2;
        String s3;
        boolean flag;
        boolean flag1;
        flag1 = false;
        s1 = etFirstName.getText().toString();
        s2 = etLastName.getText().toString();
        s3 = etEmail.getText().toString();
        flag = flag1;
        if (s.length() < 6) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (s.length() > 16) goto _L2; else goto _L3
_L3:
        flag = flag1;
        if (s.toLowerCase().contains(s1.toLowerCase())) goto _L2; else goto _L4
_L4:
        flag = flag1;
        if (s.toLowerCase().contains(s2.toLowerCase())) goto _L2; else goto _L5
_L5:
        flag = flag1;
        if (s.toLowerCase().contains(s3.toLowerCase())) goto _L2; else goto _L6
_L6:
        flag = flag1;
        if (s.equals("jcpenney")) goto _L2; else goto _L7
_L7:
        int i = 0;
_L13:
        flag = flag1;
        if (i >= s.length()) goto _L2; else goto _L8
_L8:
        char c1 = s.charAt(i);
        if (i >= s.length() || i + 1 >= s.length() || i + 2 >= s.length()) goto _L10; else goto _L9
_L9:
        char c2;
        char c3;
        c2 = s.charAt(i + 1);
        c3 = s.charAt(i + 2);
        if (c1 != c2 || c2 != c3) goto _L10; else goto _L11
_L11:
        flag = true;
_L2:
        return flag;
_L10:
        i++;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private void c(Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("intent_rewards_account_object"))
        {
            bundle = (RewardsAccount)bundle.getSerializable("intent_rewards_account_object");
            if (bundle != null)
            {
                com.jcp.b.a.b(i(), a(0x7f070317));
                af af1 = af.b(i());
                af1.a(this);
                af1.a(this);
                af1.a(bundle);
            }
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030020, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f07013a), ((android.app.Activity) (i())));
        viewgroup = z.a(i(), 5);
        radioEnrollInRewards.setTypeface(viewgroup);
        radioLinkToRewards.setTypeface(viewgroup);
        radioNotInterestedInRewards.setTypeface(viewgroup);
        W();
        c(h());
        return layoutinflater;
    }

    protected String a()
    {
        return "SIGNUP";
    }

    public void a(int i, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (i() == null || !n())
        {
            return;
        }
        if (i == 201)
        {
            JCP.s().a(true);
            errormessageentitycontainer = new l(i());
            errormessageentitycontainer.a(this);
            errormessageentitycontainer.d();
            return;
        }
        if (errormessageentitycontainer != null && af.b(i()).a(errormessageentitycontainer.getErrorCode()))
        {
            au.a(i(), j().getString(0x7f0701bb), j().getString(0x7f07013d), new be(this));
            return;
        } else
        {
            au.a(i(), j().getString(0x7f0701bb), errormessageentitycontainer);
            return;
        }
    }

    public void a(int i, String s)
    {
        com.jcp.util.ae.a(a, (new StringBuilder()).append("Failure: [").append(i).append("], message [").append(s).append("]").toString());
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (Q())
        {
            com.jcp.h.a.m();
            return;
        } else
        {
            com.jcp.h.a.a();
            com.jcp.h.a.c();
            return;
        }
    }

    public void a(Session session)
    {
        af af1 = af.b(i());
        af1.a(this);
        af1.a(this);
        if (session != null)
        {
            af1.a(session.isRewardsEligible());
        }
        if (radioNotInterestedInRewards.isChecked())
        {
            au.a(i(), a(0x7f070416), a(0x7f07013b), new bf(this, af1));
        } else
        if (af1.a())
        {
            if (radioEnrollInRewards.isChecked())
            {
                session = new RewardsAccount();
                session.setEmail(etEmail.getText().toString());
                session.setFirstName(etFirstName.getText().toString());
                session.setLastName(etLastName.getText().toString());
                session.setPhone(rewardsEnrollPhone.getPhoneNumber());
                session.setType(spPhoneTypeSpinner.getSelectedItem().toString().toLowerCase());
                session.setZip(rewardsEnrollZip.getText().toString());
                h.a(session);
                return;
            }
            if (radioLinkToRewards.isChecked())
            {
                com.jcp.h.a.f();
                h.a(true, true, etEmail.getText().toString());
                return;
            }
        } else
        {
            au.a(i(), a(0x7f070416), a(0x7f07013c), new bg(this));
            return;
        }
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
        switch (i)
        {
        default:
            return;

        case 66: // 'B'
            if (Q())
            {
                com.jcp.h.a.n();
            } else
            {
                com.jcp.h.a.d();
            }
            h.a(true, true);
            return;

        case 68: // 'D'
            h.a(true, false);
            return;

        case 67: // 'C'
            com.jcp.h.a.e();
            ab();
            return;
        }
    }

    public void b()
    {
        a(a(0x7f07013a));
        super.b();
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

    protected void onCAPolicyClick()
    {
        a(new Intent(i(), com/jcp/activities/CaPrivacyPolicyActivity));
    }

    protected void onCreateAccountClick()
    {
        if (X())
        {
            msgMissingFields.setVisibility(0);
            return;
        }
        msgMissingFields.setVisibility(8);
        String s = etEmail.getText().toString();
        Object obj = s;
        if (!TextUtils.isEmpty(s))
        {
            obj = s.trim();
        }
        O();
        if (!bq.b(((String) (obj))))
        {
            au.a(i(), a(0x7f07045b));
            return;
        }
        if (!b(etPassword.getText().toString()))
        {
            if (etPassword.length() < 6 || etPassword.length() > 16)
            {
                au.a(i(), a(0x7f07045d));
                return;
            }
            if (!etPassword.getText().toString().equals(etPasswordConfirm.getText().toString()))
            {
                au.a(i(), a(0x7f0702e1));
                return;
            }
            if (!af.b(i()).a() || !aa())
            {
                V();
                bk.a(new Profile(((String) (obj)), etPassword.getText().toString()), i());
                com.jcp.h.a.b();
                obj = new l(i());
                ((l) (obj)).a(this);
                ((l) (obj)).c(com.jcp.b.b.q(), Z(), 1);
                return;
            } else
            {
                msgMissingFields.setVisibility(0);
                return;
            }
        } else
        {
            au.a(i(), a(0x7f0702e2));
            return;
        }
    }

    public boolean onPasswordEditTextTouch(View view, MotionEvent motionevent)
    {
        boolean flag = false;
        if (etPassword.a(etPassword, motionevent))
        {
            view = new Dialog(i());
            view.getWindow().requestFeature(1);
            view.setContentView(0x7f0300b4);
            view.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            ((ImageView)view.findViewById(0x7f0e038d)).setOnClickListener(new bd(this, view));
            view.show();
            flag = true;
        }
        return flag;
    }

    public void onPasswordTextChanged()
    {
        TypefaceEditText typefaceedittext = etPassword;
        int i;
        if (etPassword.getText().toString().isEmpty())
        {
            i = 0x7f02018a;
        } else
        {
            i = 0;
        }
        typefaceedittext.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    protected void onPrivatePolicyClick()
    {
        a(new Intent(i(), com/jcp/activities/PrivacyPolicyActivity));
    }

    public void onRadioEnrolInRewardsClick()
    {
        rewardsInlineEnroll.setVisibility(0);
        radioLinkToRewards.setChecked(false);
        radioNotInterestedInRewards.setChecked(false);
        emailOptInSection.setVisibility(8);
        com.jcp.h.a.c();
    }

    public void onRadioLinkToRewardsClick()
    {
        rewardsInlineEnroll.setVisibility(8);
        radioEnrollInRewards.setChecked(false);
        radioNotInterestedInRewards.setChecked(false);
        emailOptInSection.setVisibility(8);
    }

    public void onRadioNotInterestedInRewardsClick()
    {
        rewardsInlineEnroll.setVisibility(8);
        radioEnrollInRewards.setChecked(false);
        radioLinkToRewards.setChecked(false);
        emailOptInSection.setVisibility(0);
        cbEmailOptIn.setChecked(true);
    }

    protected void onSignedInSwitchClick()
    {
        U().edit().putBoolean("keep_me_signin", keepMeSignedIn.isChecked()).apply();
    }

}
