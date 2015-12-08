// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import butterknife.ButterKnife;
import com.facebook.b.al;
import com.jcp.adapters.cv;
import com.jcp.b.a;
import com.jcp.c.af;
import com.jcp.c.c;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.e.ae;
import com.jcp.e.ag;
import com.jcp.e.h;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.t;
import com.jcp.helper.ad;
import com.jcp.http.b;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.model.rewards.RewardsAccount;
import com.jcp.model.rewards.RewardsProfile;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.ProfilePojo;
import com.jcp.util.au;
import com.jcp.util.bq;
import com.jcp.views.PhoneTypefaceEditText;
import com.jcp.views.TypefaceEditText;
import com.jcp.widget.rewards.AgreeToTermsAndConditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.fragments.rewards:
//            BaseRewardsEnrollFragment, al, RewardsConnectAccountsSignInToRewardsFragment, ak

public class RewardsEnrollFragment extends BaseRewardsEnrollFragment
    implements aa, ae, ag, h
{

    private static final String i = com/jcp/fragments/rewards/RewardsEnrollFragment.getSimpleName();
    protected AgreeToTermsAndConditions agreeToTerms;
    private String aj;
    private String ak;
    private String al;
    private String am;
    private String an;
    private String ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    protected CheckBox cbUpdateAddress;
    protected EditText etEmail;
    protected EditText etFirstName;
    protected EditText etLastName;
    protected PhoneTypefaceEditText etPhone;
    protected EditText etZipCode;
    protected Spinner spPhoneTypeSpinner;
    protected LinearLayout updateAddressContainer;

    public RewardsEnrollFragment()
    {
    }

    private void W()
    {
        q q1 = new q(i());
        q1.a(this);
        q1.a();
    }

    private void X()
    {
        q q1 = new q(i());
        q1.a(this);
        q1.a(6);
    }

    private boolean Z()
    {
        String s = etAddressLineOne.getText().toString();
        String s1 = etCity.getText().toString();
        String s2 = spState.getSelectedItem().toString();
        return (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s1) || !TextUtils.isEmpty(s2)) && (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2));
    }

    private String a(EditText edittext)
    {
        if (edittext != null)
        {
            return edittext.getText().toString();
        } else
        {
            return "";
        }
    }

    private boolean aa()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (cbUpdateAddress != null)
        {
            flag = flag1;
            if (cbUpdateAddress.isChecked())
            {
                flag = flag1;
                if (!com.facebook.b.al.a(aj))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private Map ab()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("firstName", etFirstName.getText().toString());
        hashmap.put("lastName", etLastName.getText().toString());
        hashmap.put("addressLineOne", etAddressLineOne.getText().toString());
        hashmap.put("addressLineTwo", etAddressLineTwo.getText().toString());
        hashmap.put("zip", etZipCode.getText().toString());
        hashmap.put("city", etCity.getText().toString());
        hashmap.put("state", com.jcp.helper.ad.b(spState.getSelectedItem().toString(), i()));
        hashmap.put("phone", etPhone.getPhoneNumber());
        hashmap.put("country", "US");
        return hashmap;
    }

    private void ac()
    {
        if (updateAddressContainer != null)
        {
            LinearLayout linearlayout = updateAddressContainer;
            int j;
            if (ad() && !ae())
            {
                j = 0;
            } else
            {
                j = 8;
            }
            linearlayout.setVisibility(j);
        }
    }

    private boolean ad()
    {
        boolean flag4 = false;
        String s1 = a(etAddressLineOne);
        String s2 = a(etAddressLineTwo);
        String s3 = a(etCity);
        String s;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (spState != null)
        {
            s = spState.getSelectedItem().toString();
        } else
        {
            s = "";
        }
        if (!com.facebook.b.al.a(al) && !s1.equalsIgnoreCase(al))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!com.facebook.b.al.a(am) && !s2.equalsIgnoreCase(am))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!com.facebook.b.al.a(an) && !s3.equalsIgnoreCase(an))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!com.facebook.b.al.a(ao) && !s.equalsIgnoreCase(ao))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag || flag1 || flag2 || flag3)
        {
            flag4 = true;
        }
        return flag4;
    }

    private boolean ae()
    {
        boolean flag4 = false;
        String s1 = a(etAddressLineOne);
        String s2 = a(etAddressLineTwo);
        String s3 = a(etCity);
        String s;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (spState != null)
        {
            s = spState.getSelectedItem().toString();
        } else
        {
            s = "";
        }
        if (s1.isEmpty() && !com.facebook.b.al.a(al))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s2.isEmpty() && !com.facebook.b.al.a(am))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (s3.isEmpty() && !com.facebook.b.al.a(an))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (s.isEmpty() && !com.facebook.b.al.a(ao))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag || flag1 || flag2 || flag3)
        {
            flag4 = true;
        }
        return flag4;
    }

    private void af()
    {
        if (!ap) goto _L2; else goto _L1
_L1:
        if (aa()) goto _L4; else goto _L3
_L3:
        if (!aq) goto _L6; else goto _L5
_L5:
        h.a(false, true);
_L2:
        return;
_L6:
        au.a(i(), a(0x7f070372));
        return;
_L4:
        if (ar)
        {
            if (!aq)
            {
                au.a(i(), a(0x7f070372));
                return;
            }
            if (as)
            {
                h.a(false, true);
                return;
            } else
            {
                au.a(i(), a(0x7f070373), a(0x7f070049), null, new com.jcp.fragments.rewards.al(this), null);
                return;
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected String T()
    {
        return "JCP REWARDS (CAT1002850058)";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03007a, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        a(a(0x7f07019b), ((android.app.Activity) (i())));
        U();
        W();
        X();
        a(spPhoneTypeSpinner);
        return layoutinflater;
    }

    protected String a()
    {
        return "Rewards Connect Prompt";
    }

    public void a(int j, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (com.jcp.http.b.b(j) && errormessageentitycontainer != null)
        {
            au.a(i(), j().getString(0x7f0701bb), errormessageentitycontainer);
            if (com.jcp.c.af.b(i()).a(errormessageentitycontainer.getErrorCode()))
            {
                a(i()).c(new RewardsConnectAccountsSignInToRewardsFragment(), "RewardsConnectAccountsSignInToRewards");
            }
        }
    }

    public void a(RewardsAccount rewardsaccount)
    {
    }

    public void a(RewardsProfile rewardsprofile)
    {
    }

    public void a(GetAccountResponse getaccountresponse, int j)
    {
        if (getaccountresponse != null)
        {
            (new q(i())).a(i(), getaccountresponse);
            getaccountresponse = i().getSharedPreferences("MyPrefs", 0);
            etFirstName.setText(getaccountresponse.getString("firstName", ""));
            etLastName.setText(getaccountresponse.getString("lastName", ""));
            Object obj = getaccountresponse.getString("email", "");
            if (obj != null && !((String) (obj)).isEmpty())
            {
                etEmail.setText(((CharSequence) (obj)));
                etEmail.setEnabled(false);
                etEmail.setInputType(0);
            }
            ak = getaccountresponse.getString("zip", null);
            etPhone.setText(getaccountresponse.getString("phone", ""));
            obj = etZipCode;
            if (ak == null)
            {
                getaccountresponse = "";
            } else
            {
                getaccountresponse = ak;
            }
            ((EditText) (obj)).setText(getaccountresponse);
        }
    }

    public void a(String s, String s1, int j)
    {
        com.jcp.b.a.i();
        com.jcp.util.ae.a(i, (new StringBuilder()).append("Failure: [").append(s).append("], message [").append(s1).append("]").toString());
        if (j != 66) goto _L2; else goto _L1
_L1:
        ap = true;
        aq = false;
_L4:
        af();
        return;
_L2:
        if (j == 27)
        {
            ar = true;
            as = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(List list, int j)
    {
    }

    public void a(boolean flag, boolean flag1)
    {
    }

    public void a(boolean flag, boolean flag1, String s)
    {
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int j)
    {
        j = 0;
        if (agetaddressresponsemodel != null && agetaddressresponsemodel.length > 0)
        {
            agetaddressresponsemodel = agetaddressresponsemodel[0];
            aj = agetaddressresponsemodel.getId();
            ak = agetaddressresponsemodel.getZip();
            al = agetaddressresponsemodel.getAddressLineOne();
            am = agetaddressresponsemodel.getAddressLineTwo();
            an = agetaddressresponsemodel.getCity();
            ao = agetaddressresponsemodel.getState();
            etAddressLineOne.setText(al);
            etAddressLineTwo.setText(am);
            EditText edittext = etAddressLineTwo;
            if (am == null || am.isEmpty())
            {
                j = 8;
            }
            edittext.setVisibility(j);
            etCity.setText(an);
            etPhone.setText(agetaddressresponsemodel.getPhone());
            etZipCode.setText(ak);
            agetaddressresponsemodel = com.jcp.helper.ad.a(ao, i());
            if (!TextUtils.isEmpty(agetaddressresponsemodel))
            {
                ao = agetaddressresponsemodel;
                spState.setSelection(d.getPosition(agetaddressresponsemodel));
            }
        }
    }

    public void a_(String s, int j)
    {
        com.jcp.b.a.i();
        if (j != 66) goto _L2; else goto _L1
_L1:
        ap = true;
        aq = true;
_L4:
        af();
        return;
_L2:
        if (j == 27)
        {
            ar = true;
            as = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a_(ProfilePojo aprofilepojo[], int j)
    {
    }

    public void b(int j, String s)
    {
    }

    public void b(RewardsAccount rewardsaccount)
    {
    }

    public void b(boolean flag, boolean flag1)
    {
    }

    public void createRewardsAccount()
    {
        Object obj = etFirstName.getText().toString();
        String s = etLastName.getText().toString();
        String s1 = etEmail.getText().toString();
        String s2 = etPhone.getPhoneNumber();
        String s3 = spPhoneTypeSpinner.getSelectedItem().toString().toLowerCase();
        String s4 = etZipCode.getText().toString();
        if (((String) (obj)).isEmpty())
        {
            au.a(i(), a(0x7f0701ab));
        } else
        {
            if (s.isEmpty())
            {
                au.a(i(), a(0x7f0701ac));
                return;
            }
            if (s1.isEmpty() || !bq.b(s1))
            {
                au.a(i(), a(0x7f0701aa));
                return;
            }
            if (!etPhone.a())
            {
                au.a(i(), a(0x7f0701ae));
                return;
            }
            if (s4.isEmpty() || !bq.d(etZipCode.getText().toString()))
            {
                au.a(i(), a(0x7f0701b1));
                return;
            }
            if (Z())
            {
                au.a(i(), a(0x7f07019d));
                return;
            }
            if (!agreeToTerms.a())
            {
                au.a(i(), a(0x7f070315));
                return;
            }
            com.jcp.b.a.b(i(), a(0x7f070376));
            RewardsAccount rewardsaccount = new RewardsAccount();
            rewardsaccount.setEmail(s1);
            rewardsaccount.setFirstName(((String) (obj)));
            rewardsaccount.setLastName(s);
            rewardsaccount.setPhone(s2);
            rewardsaccount.setType(s3);
            rewardsaccount.setZip(s4);
            rewardsaccount.setAddressLineOne(etAddressLineOne.getText().toString());
            rewardsaccount.setAddressLineTwo(etAddressLineTwo.getText().toString());
            rewardsaccount.setCity(etCity.getText().toString());
            rewardsaccount.setState(com.jcp.helper.ad.b(spState.getSelectedItem().toString(), i()));
            if (f != null)
            {
                obj = String.valueOf(f);
            } else
            {
                obj = "";
            }
            rewardsaccount.setBirthMonth(((String) (obj)));
            if (g != null)
            {
                obj = String.valueOf(g);
            } else
            {
                obj = "";
            }
            rewardsaccount.setBirthDate(((String) (obj)));
            com.jcp.h.a.i();
            obj = com.jcp.c.af.b(i());
            ((af) (obj)).a(this);
            ((af) (obj)).a(this);
            ((af) (obj)).a(rewardsaccount);
            if (aa())
            {
                obj = c.a(i());
                ((c) (obj)).a(this);
                ((c) (obj)).a(ab(), aj, 27);
                return;
            }
        }
    }

    public void onAddressChanged()
    {
        ac();
    }

    public void onAddressFieldFocusChange(View view, boolean flag)
    {
        if (view != null)
        {
            if (flag)
            {
                V();
            }
            if (updateAddressContainer != null)
            {
                view = updateAddressContainer;
                int j;
                if ((flag || ad()) && !ae())
                {
                    j = 0;
                } else
                {
                    j = 8;
                }
                view.setVisibility(j);
                return;
            }
        }
    }

    public void onStateChanged()
    {
        ac();
    }

    public void onZipCodeChanged()
    {
        if (etZipCode != null)
        {
            String s = etZipCode.getEditableText().toString().trim();
            if (!TextUtils.isEmpty(s) && s.length() == 5 && (TextUtils.isEmpty(ak) || !ak.equalsIgnoreCase(s)))
            {
                (new Thread(new ak(this, s))).start();
            }
        }
    }

}
