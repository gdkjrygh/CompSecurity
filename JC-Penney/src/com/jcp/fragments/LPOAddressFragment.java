// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.adapters.ct;
import com.jcp.adapters.cu;
import com.jcp.b.b;
import com.jcp.c.c;
import com.jcp.e.am;
import com.jcp.model.CityStateZipResponseModel;
import com.jcp.util.au;
import com.jcp.util.bt;
import com.jcp.util.k;
import com.jcp.views.PhoneTypefaceEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            cg

public class LPOAddressFragment extends cg
    implements am
{

    private CityStateZipResponseModel a;
    protected Spinner aaAeSpinner;
    protected TextView alertMessage;
    protected Spinner apoFpoDpoSpinner;
    private cu b;
    private ct c;
    protected EditText changeLpoFirstName;
    protected EditText changeLpoLastName;
    protected EditText companyLpoEditText;
    private c d;
    private View e;
    private Bundle f;
    private boolean g;
    private String h;
    private boolean i;
    protected EditText lineOneLpoEditText;
    protected EditText lineTwoLpoEditText;
    protected PhoneTypefaceEditText phoneLpoEditText;
    protected ImageView questionMarkHint;
    protected EditText zipCodeLpoEditText;

    public LPOAddressFragment()
    {
    }

    private void O()
    {
        changeLpoFirstName.setText(f.getString("FirstName"));
        changeLpoLastName.setText(f.getString("LastName"));
        lineOneLpoEditText.setText(f.getString("AddressLineOne"));
        lineTwoLpoEditText.setText(f.getString("AddressLineTwo"));
        companyLpoEditText.setText(f.getString("Company"));
        zipCodeLpoEditText.setText(f.getString("ZipCode"));
        phoneLpoEditText.setText(f.getString("Phone"));
        a("editAddAddress");
    }

    private void P()
    {
        ButterKnife.inject(this, e);
        List list = b(0x7f0c0002);
        b = new cu(i(), 0x1090008, list);
        apoFpoDpoSpinner.setAdapter(b);
        list = b(0x7f0c0000);
        c = new ct(i(), 0x1090008, list);
        aaAeSpinner.setAdapter(c);
        if (changeLpoFirstName.length() > 0)
        {
            changeLpoFirstName.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (changeLpoLastName.length() > 0)
        {
            changeLpoLastName.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (lineOneLpoEditText.length() > 0)
        {
            lineOneLpoEditText.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (zipCodeLpoEditText.length() > 0)
        {
            zipCodeLpoEditText.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (phoneLpoEditText.length() > 0)
        {
            phoneLpoEditText.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
    }

    private boolean Q()
    {
        if (changeLpoFirstName.length() == 0 || changeLpoLastName.length() == 0 || lineOneLpoEditText.length() == 0 || zipCodeLpoEditText.length() == 0)
        {
            alertMessage.setVisibility(0);
            alertMessage.setText(j().getString(0x7f07034d));
            return false;
        } else
        {
            alertMessage.setVisibility(4);
            return true;
        }
    }

    private Map R()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("firstName", (new StringBuilder()).append("").append(changeLpoFirstName.getText()).toString());
        hashmap.put("lastName", (new StringBuilder()).append("").append(changeLpoLastName.getText()).toString());
        hashmap.put("company", (new StringBuilder()).append("").append(companyLpoEditText.getText()).toString());
        hashmap.put("addressLineOne", (new StringBuilder()).append("").append(lineOneLpoEditText.getText()).toString());
        hashmap.put("addressLineTwo", (new StringBuilder()).append("").append(lineTwoLpoEditText.getText()).toString());
        hashmap.put("zip", (new StringBuilder()).append("").append(zipCodeLpoEditText.getText()).toString());
        hashmap.put("militaryAddressType", (new StringBuilder()).append("").append(apoFpoDpoSpinner.getSelectedItem()).toString());
        hashmap.put("state", (new StringBuilder()).append("").append(aaAeSpinner.getSelectedItem()).toString());
        hashmap.put("phone", (new StringBuilder()).append("").append(phoneLpoEditText.getPhoneNumber()).toString());
        hashmap.put("country", "APO/FPO/DPO");
        String s;
        if (f.getBoolean("IsDefault"))
        {
            s = "true";
        } else
        {
            s = "false";
        }
        hashmap.put("isDefault", s);
        return hashmap;
    }

    private void a(String s)
    {
        String s1;
        String s2;
        s1 = "";
        s2 = "";
        s.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   -1957447235: 137
    //                   760542227: 121;
           goto _L1 _L2 _L3
_L1:
        byte byte0 = -1;
_L8:
        byte0;
        JVM INSTR tableswitch 0 1: default 64
    //                   0 152
    //                   1 175;
           goto _L4 _L5 _L6
_L4:
        s = s2;
_L10:
        if (b.getPosition(s) != -1)
        {
            apoFpoDpoSpinner.setSelection(b.getPosition(s));
        } else
        {
            b.add(s);
            apoFpoDpoSpinner.setAdapter(b);
            apoFpoDpoSpinner.setSelection(b.getPosition(s));
        }
        if (c.getPosition(s1) != -1)
        {
            aaAeSpinner.setSelection(c.getPosition(s1));
            return;
        } else
        {
            c.add(s1);
            aaAeSpinner.setAdapter(c);
            aaAeSpinner.setSelection(c.getPosition(s1));
            return;
        }
_L3:
        if (!s.equals("addAddress")) goto _L1; else goto _L7
_L7:
        byte0 = 0;
          goto _L8
_L2:
        if (!s.equals("editAddAddress")) goto _L1; else goto _L9
_L9:
        byte0 = 1;
          goto _L8
_L5:
        s = a.getCity();
        s1 = a.getState();
        com.jcp.b.b.c(false);
          goto _L10
_L6:
        if (b.o)
        {
            s = a.getCity();
            s1 = a.getState();
        } else
        {
            s = f.getString("militaryAddressType");
            s1 = f.getString("State");
        }
        com.jcp.b.b.c(false);
          goto _L10
    }

    private List b(int j)
    {
        ArrayList arraylist = new ArrayList();
        String as[] = j().getStringArray(j);
        int l = as.length;
        for (j = 0; j < l; j++)
        {
            arraylist.add(as[j]);
        }

        return arraylist;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        f = h();
        e = layoutinflater.inflate(0x7f030028, viewgroup, false);
        d = com.jcp.c.c.a(i());
        P();
        h = f.getString("Title");
        if ("editAddAddress".equals(h) && "apoLpoAddressLayout".equals(f.getString("apoLpoOrUnitedAddressLayout")))
        {
            g = true;
            O();
        }
        return e;
    }

    protected String a()
    {
        return "LPOADDRESS";
    }

    public void a(CityStateZipResponseModel citystatezipresponsemodel, int j)
    {
        a = citystatezipresponsemodel;
        if (a != null)
        {
            com.jcp.b.b.c(true);
            if (a.getState() != null && a.getCity() != null && a.getZipCode() != null)
            {
                if (com.jcp.b.b.aa().equals("addAddress"))
                {
                    a("addAddress");
                    return;
                } else
                {
                    a("editAddAddress");
                    return;
                }
            } else
            {
                com.jcp.b.b.c(false);
                au.a(i(), a(0x7f0701bb), a(0x7f0701b9));
                return;
            }
        } else
        {
            com.jcp.b.b.c(false);
            au.a(i(), a(0x7f0701bb), a(0x7f0701b9));
            return;
        }
    }

    public void a(String s, int j)
    {
        au.a(i(), a(0x7f0701bb), s);
    }

    protected void afterChangeLpoFirstNameTextChanged()
    {
        bt.a(i(), changeLpoFirstName, alertMessage);
    }

    protected void afterChangeLpoLastNameTextChanged()
    {
        bt.a(i(), changeLpoLastName, alertMessage);
    }

    protected void afterLineOneLpoTextChanged()
    {
        bt.a(i(), lineOneLpoEditText, alertMessage);
    }

    protected void afterPhoneLpoTextChanged()
    {
        android.support.v4.app.ac ac = i();
        PhoneTypefaceEditText phonetypefaceedittext = phoneLpoEditText;
        TextView textview = alertMessage;
        boolean flag;
        if (!phoneLpoEditText.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bt.a(ac, phonetypefaceedittext, textview, flag);
    }

    protected void afterZipCodeLpoTextChanged()
    {
        bt.a(i(), zipCodeLpoEditText, alertMessage);
    }

    public Map b()
    {
        if (Q())
        {
            return R();
        }
        if (TextUtils.isEmpty(changeLpoFirstName.getText().toString().trim()))
        {
            changeLpoFirstName.setBackgroundResource(0x7f0201b7);
            changeLpoFirstName.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (TextUtils.isEmpty(changeLpoLastName.getText().toString().trim()))
        {
            changeLpoLastName.setBackgroundResource(0x7f0201b7);
            changeLpoLastName.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (TextUtils.isEmpty(lineOneLpoEditText.getText().toString().trim()))
        {
            lineOneLpoEditText.setBackgroundResource(0x7f0201b7);
            lineOneLpoEditText.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (TextUtils.isEmpty(zipCodeLpoEditText.getText().toString().trim()))
        {
            zipCodeLpoEditText.setBackgroundResource(0x7f0201b7);
            zipCodeLpoEditText.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (!phoneLpoEditText.a())
        {
            phoneLpoEditText.setBackgroundResource(0x7f0201b7);
            phoneLpoEditText.setHintTextColor(j().getColor(0x7f0d006c));
        }
        return null;
    }

    protected void lineOneHintClick()
    {
        k.c(i());
    }

    protected void onAaAeSpinnerItemSelected(int j)
    {
        aaAeSpinner.setSelection(j);
        if (i)
        {
            phoneLpoEditText.requestFocus();
            return;
        } else
        {
            i = true;
            return;
        }
    }

    protected void onLineOneLpoTextChanged(CharSequence charsequence)
    {
        if (charsequence.length() > 0)
        {
            questionMarkHint.setVisibility(4);
            return;
        } else
        {
            questionMarkHint.setVisibility(0);
            return;
        }
    }

    protected void onZipCodeLpoTextChanged()
    {
label0:
        {
            if (zipCodeLpoEditText.getEditableText().toString().trim().length() == 5)
            {
                if (g)
                {
                    break label0;
                }
                com.jcp.b.b.z(h);
                com.jcp.b.b.c(true);
                d.a(this);
                d.a(zipCodeLpoEditText.getText().toString(), 46);
            }
            return;
        }
        g = false;
    }
}
