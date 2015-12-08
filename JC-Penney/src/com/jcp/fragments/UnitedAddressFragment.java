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
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.adapters.cs;
import com.jcp.b.b;
import com.jcp.c.c;
import com.jcp.e.an;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.helper.ad;
import com.jcp.model.CityStateZipResponseModel;
import com.jcp.model.State;
import com.jcp.util.aa;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.jcp.util.bt;
import com.jcp.views.PhoneTypefaceEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.fragments:
//            cg

public class UnitedAddressFragment extends cg
    implements an
{

    private static final String a = com/jcp/fragments/UnitedAddressFragment.getSimpleName();
    private boolean aj;
    protected TextView alertMessage;
    private View b;
    private String c;
    protected EditText changeUnitedFirstname;
    protected EditText changeUnitedLastname;
    protected EditText cityUnitedEdittext;
    protected EditText companyUnitedEdittext;
    private c d;
    private Bundle e;
    private boolean f;
    private List g;
    private CityStateZipResponseModel h;
    private cs i;
    protected PhoneTypefaceEditText phoneUnitedEdittext;
    protected Spinner stateUnitedSpinner;
    protected EditText streetUnitedEdittext;
    protected EditText streetUnitedEdittextTwo;
    protected EditText zipcodeUnitedEdittext;

    public UnitedAddressFragment()
    {
    }

    private void P()
    {
        changeUnitedFirstname.setText(e.getString("FirstName"));
        changeUnitedLastname.setText(e.getString("LastName"));
        streetUnitedEdittext.setText(e.getString("AddressLineOne"));
        streetUnitedEdittextTwo.setText(e.getString("AddressLineTwo"));
        zipcodeUnitedEdittext.setText(e.getString("ZipCode"));
        companyUnitedEdittext.setText(e.getString("Company"));
        phoneUnitedEdittext.setText(e.getString("Phone"));
        a("editAddAddress", "unitedAddressLayout");
    }

    private void Q()
    {
        ButterKnife.inject(this, b);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        if (g != null && g.size() > 0)
        {
            int j = 0;
            while (j < g.size()) 
            {
                if (!((State)g.get(j)).getAbbreviation().isEmpty())
                {
                    arraylist.add(((State)g.get(j)).getName());
                    arraylist1.add(((State)g.get(j)).getAbbreviation());
                } else
                {
                    arraylist1.add("State");
                }
                j++;
            }
        } else
        {
            arraylist1.add("State");
        }
        i = new cs(i(), 0x1090008, arraylist1);
        stateUnitedSpinner.setAdapter(i);
        if (changeUnitedFirstname.length() > 0)
        {
            changeUnitedFirstname.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (changeUnitedLastname.length() > 0)
        {
            changeUnitedLastname.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (streetUnitedEdittext.length() > 0)
        {
            streetUnitedEdittext.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (zipcodeUnitedEdittext.length() > 0)
        {
            zipcodeUnitedEdittext.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (cityUnitedEdittext.length() > 0)
        {
            cityUnitedEdittext.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
        if (phoneUnitedEdittext.length() > 0)
        {
            phoneUnitedEdittext.setBackgroundResource(0x7f020124);
            alertMessage.setVisibility(8);
        }
    }

    private boolean R()
    {
        if (changeUnitedFirstname.length() == 0 || changeUnitedLastname.length() == 0 || streetUnitedEdittext.length() == 0 || zipcodeUnitedEdittext.length() == 0 || cityUnitedEdittext.length() == 0)
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

    public Map O()
    {
        if (R())
        {
            return b();
        }
        if (TextUtils.isEmpty(changeUnitedFirstname.getText().toString().trim()))
        {
            changeUnitedFirstname.setBackgroundResource(0x7f0201b7);
            changeUnitedFirstname.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (TextUtils.isEmpty(changeUnitedLastname.getText().toString().trim()))
        {
            changeUnitedLastname.setBackgroundResource(0x7f0201b7);
            changeUnitedLastname.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (TextUtils.isEmpty(streetUnitedEdittext.getText().toString().trim()))
        {
            streetUnitedEdittext.setBackgroundResource(0x7f0201b7);
            streetUnitedEdittext.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (TextUtils.isEmpty(zipcodeUnitedEdittext.getText().toString().trim()))
        {
            zipcodeUnitedEdittext.setBackgroundResource(0x7f0201b7);
            zipcodeUnitedEdittext.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (TextUtils.isEmpty(cityUnitedEdittext.getText().toString().trim()))
        {
            cityUnitedEdittext.setBackgroundResource(0x7f0201b7);
            cityUnitedEdittext.setHintTextColor(j().getColor(0x7f0d006c));
        }
        if (!phoneUnitedEdittext.a())
        {
            phoneUnitedEdittext.setBackgroundResource(0x7f0201b7);
            phoneUnitedEdittext.setHintTextColor(j().getColor(0x7f0d006c));
        }
        return null;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        e = h();
        b = layoutinflater.inflate(0x7f03001c, viewgroup, false);
        g = ad.a(i());
        d = com.jcp.c.c.a(i());
        Q();
        c = e.getString("Title");
        if (c.equals("editAddAddress") && e.getString("apoLpoOrUnitedAddressLayout").equals("unitedAddressLayout"))
        {
            f = true;
            P();
        }
        return b;
    }

    protected String a()
    {
        return "UNITEDADDRESS";
    }

    public void a(CityStateZipResponseModel citystatezipresponsemodel, int j)
    {
        h = citystatezipresponsemodel;
        if (h != null)
        {
            com.jcp.b.b.c(true);
            if (h.getState() != null && h.getCity() != null && h.getZipCode() != null)
            {
                if (com.jcp.b.b.aa().equals("addAddress"))
                {
                    a("addAddress", "unitedAddressLayout");
                    return;
                } else
                {
                    a("editAddAddress", "unitedAddressLayout");
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
        ErrorMessageEntityContainer errormessageentitycontainer = (ErrorMessageEntityContainer)aa.a(s, com/jcp/errorstatus/ErrorMessageEntityContainer);
        if (errormessageentitycontainer != null)
        {
            s = errormessageentitycontainer.getErrorMessage();
        }
        au.a(i(), a(0x7f0701bb), s);
    }

    public void a(String s, String s1)
    {
        Object obj;
        s1 = null;
        obj = null;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   -1957447235: 132
    //                   760542227: 116;
           goto _L1 _L2 _L3
_L1:
        int j = -1;
_L12:
        j;
        JVM INSTR tableswitch 0 1: default 64
    //                   0 147
    //                   1 177;
           goto _L4 _L5 _L6
_L4:
        s1 = null;
        s = obj;
_L15:
        if (!TextUtils.isEmpty(s))
        {
            cityUnitedEdittext.setText(s);
        }
        if (TextUtils.isEmpty(s1)) goto _L8; else goto _L7
_L7:
        j = i.getPosition(s1);
        if (j == -1) goto _L10; else goto _L9
_L9:
        stateUnitedSpinner.setSelection(j);
_L8:
        return;
_L3:
        if (!s.equals("addAddress")) goto _L1; else goto _L11
_L11:
        j = 0;
          goto _L12
_L2:
        if (!s.equals("editAddAddress")) goto _L1; else goto _L13
_L13:
        j = 1;
          goto _L12
_L5:
        if (h == null) goto _L4; else goto _L14
_L14:
        s = h.getCity();
        s1 = h.getState();
        com.jcp.b.b.c(false);
          goto _L15
_L6:
        if (b.o)
        {
            if (h != null)
            {
                s = h.getCity();
                s1 = h.getState();
            } else
            {
                Object obj1 = null;
                s = s1;
                s1 = obj1;
            }
        } else
        {
            s = e.getString("City");
            s1 = e.getString("State");
        }
        com.jcp.b.b.c(false);
          goto _L15
_L10:
        i.add(s1);
        stateUnitedSpinner.setAdapter(i);
        ae.d(a, (new StringBuilder()).append("getZipCodeResponse : ").append(i.getPosition(s1)).toString());
        stateUnitedSpinner.setSelection(i.getPosition(s1));
        return;
          goto _L12
    }

    protected void afterChangeUnitedFirstNameTextChanged()
    {
        bt.a(i(), changeUnitedFirstname, alertMessage);
    }

    protected void afterChangeUnitedLastNameTextChanged()
    {
        bt.a(i(), changeUnitedLastname, alertMessage);
    }

    protected void afterUnitedCityTextChanged()
    {
        bt.a(i(), cityUnitedEdittext, alertMessage);
    }

    protected void afterUnitedPhoneTextChanged()
    {
        android.support.v4.app.ac ac = i();
        PhoneTypefaceEditText phonetypefaceedittext = phoneUnitedEdittext;
        TextView textview = alertMessage;
        boolean flag;
        if (!phoneUnitedEdittext.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bt.a(ac, phonetypefaceedittext, textview, flag);
    }

    protected void afterUnitedStreetTextChanged()
    {
        bt.a(i(), streetUnitedEdittext, alertMessage);
    }

    protected void afterUnitedZipTextChanged()
    {
        bt.a(i(), zipcodeUnitedEdittext, alertMessage);
    }

    public Map b()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("firstName", (new StringBuilder()).append("").append(changeUnitedFirstname.getText()).toString());
        hashmap.put("lastName", (new StringBuilder()).append("").append(changeUnitedLastname.getText()).toString());
        hashmap.put("company", (new StringBuilder()).append("").append(companyUnitedEdittext.getText()).toString());
        hashmap.put("addressLineOne", (new StringBuilder()).append("").append(streetUnitedEdittext.getText()).toString());
        hashmap.put("addressLineTwo", (new StringBuilder()).append("").append(streetUnitedEdittextTwo.getText()).toString());
        hashmap.put("zip", (new StringBuilder()).append("").append(zipcodeUnitedEdittext.getText()).toString());
        hashmap.put("city", (new StringBuilder()).append("").append(cityUnitedEdittext.getText()).toString());
        hashmap.put("state", (new StringBuilder()).append("").append(stateUnitedSpinner.getSelectedItem()).toString());
        hashmap.put("phone", (new StringBuilder()).append("").append(phoneUnitedEdittext.getPhoneNumber()).toString());
        String s;
        if (e.getBoolean("isDefault"))
        {
            s = "true";
        } else
        {
            s = "false";
        }
        hashmap.put("isDefault", s);
        hashmap.put("country", "US");
        return hashmap;
    }

    protected void onStateSpinnerItemSelected(int j)
    {
        stateUnitedSpinner.setSelection(j);
        if (aj)
        {
            phoneUnitedEdittext.requestFocus();
            return;
        } else
        {
            aj = true;
            return;
        }
    }

    protected void onZipCodeTextChanged()
    {
label0:
        {
            if (zipcodeUnitedEdittext.getEditableText().toString().trim().length() >= 5)
            {
                if (f)
                {
                    break label0;
                }
                com.jcp.b.b.z(c);
                com.jcp.b.b.c(true);
                d.a(this);
                d.a(zipcodeUnitedEdittext.getText().toString(), 45);
            }
            return;
        }
        f = false;
    }

}
