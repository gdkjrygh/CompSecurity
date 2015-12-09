// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.jcp.views.PhoneTypefaceEditText;

// Referenced classes of package com.jcp.fragments:
//            UnitedAddressFragment, hh, hi, hj, 
//            hk, hl, hm, hn

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, UnitedAddressFragment unitedaddressfragment, Object obj)
    {
        View view = (View)ector.ector(obj, 0x7f0e00a0, "field 'changeUnitedFirstname' and method 'afterChangeUnitedFirstNameTextChanged'");
        unitedaddressfragment.changeUnitedFirstname = (EditText)ector.itedFirstname(view, 0x7f0e00a0, "field 'changeUnitedFirstname'");
        ((TextView)view).addTextChangedListener(new hh(this, unitedaddressfragment));
        view = (View)ector.ector(obj, 0x7f0e00a1, "field 'changeUnitedLastname' and method 'afterChangeUnitedLastNameTextChanged'");
        unitedaddressfragment.changeUnitedLastname = (EditText)ector.itedLastname(view, 0x7f0e00a1, "field 'changeUnitedLastname'");
        ((TextView)view).addTextChangedListener(new hi(this, unitedaddressfragment));
        unitedaddressfragment.companyUnitedEdittext = (EditText)ector.nitedEdittext((View)ector.nitedEdittext(obj, 0x7f0e00a2, "field 'companyUnitedEdittext'"), 0x7f0e00a2, "field 'companyUnitedEdittext'");
        view = (View)ector.nitedEdittext(obj, 0x7f0e00a4, "field 'streetUnitedEdittext' and method 'afterUnitedStreetTextChanged'");
        unitedaddressfragment.streetUnitedEdittext = (EditText)ector.itedEdittext(view, 0x7f0e00a4, "field 'streetUnitedEdittext'");
        ((TextView)view).addTextChangedListener(new hj(this, unitedaddressfragment));
        unitedaddressfragment.streetUnitedEdittextTwo = (EditText)ector.itedEdittextTwo((View)ector.itedEdittextTwo(obj, 0x7f0e00a6, "field 'streetUnitedEdittextTwo'"), 0x7f0e00a6, "field 'streetUnitedEdittextTwo'");
        view = (View)ector.itedEdittextTwo(obj, 0x7f0e00a8, "field 'zipcodeUnitedEdittext', method 'onZipCodeTextChanged', and method 'afterUnitedZipTextChanged'");
        unitedaddressfragment.zipcodeUnitedEdittext = (EditText)ector.nitedEdittext(view, 0x7f0e00a8, "field 'zipcodeUnitedEdittext'");
        ((TextView)view).addTextChangedListener(new hk(this, unitedaddressfragment));
        view = (View)ector.ector(obj, 0x7f0e00aa, "field 'cityUnitedEdittext' and method 'afterUnitedCityTextChanged'");
        unitedaddressfragment.cityUnitedEdittext = (EditText)ector.edEdittext(view, 0x7f0e00aa, "field 'cityUnitedEdittext'");
        ((TextView)view).addTextChangedListener(new hl(this, unitedaddressfragment));
        view = (View)ector.ector(obj, 0x7f0e00ad, "field 'stateUnitedSpinner' and method 'onStateSpinnerItemSelected'");
        unitedaddressfragment.stateUnitedSpinner = (Spinner)ector.tedSpinner(view, 0x7f0e00ad, "field 'stateUnitedSpinner'");
        ((AdapterView)view).setOnItemSelectedListener(new hm(this, unitedaddressfragment));
        view = (View)ector.ector(obj, 0x7f0e00af, "field 'phoneUnitedEdittext' and method 'afterUnitedPhoneTextChanged'");
        unitedaddressfragment.phoneUnitedEdittext = (PhoneTypefaceEditText)ector.tedEdittext(view, 0x7f0e00af, "field 'phoneUnitedEdittext'");
        ((TextView)view).addTextChangedListener(new hn(this, unitedaddressfragment));
        unitedaddressfragment.alertMessage = (TextView)ector.sage((View)ector.sage(obj, 0x7f0e00b1, "field 'alertMessage'"), 0x7f0e00b1, "field 'alertMessage'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (UnitedAddressFragment)obj, obj1);
    }

    public void reset(UnitedAddressFragment unitedaddressfragment)
    {
        unitedaddressfragment.changeUnitedFirstname = null;
        unitedaddressfragment.changeUnitedLastname = null;
        unitedaddressfragment.companyUnitedEdittext = null;
        unitedaddressfragment.streetUnitedEdittext = null;
        unitedaddressfragment.streetUnitedEdittextTwo = null;
        unitedaddressfragment.zipcodeUnitedEdittext = null;
        unitedaddressfragment.cityUnitedEdittext = null;
        unitedaddressfragment.stateUnitedSpinner = null;
        unitedaddressfragment.phoneUnitedEdittext = null;
        unitedaddressfragment.alertMessage = null;
    }

    public volatile void reset(Object obj)
    {
        reset((UnitedAddressFragment)obj);
    }

    public ()
    {
    }
}
