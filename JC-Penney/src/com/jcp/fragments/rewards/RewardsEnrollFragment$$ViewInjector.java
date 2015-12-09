// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.jcp.views.PhoneTypefaceEditText;
import com.jcp.widget.rewards.AgreeToTermsAndConditions;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsEnrollFragment, ab, ac, ad, 
//            ae, af, ag, ah, 
//            ai, aj, BaseRewardsEnrollFragment

public class tor extends tor
{

    public volatile void inject(butterknife..ViewInjector viewinjector, BaseRewardsEnrollFragment baserewardsenrollfragment, Object obj)
    {
        inject(viewinjector, (RewardsEnrollFragment)baserewardsenrollfragment, obj);
    }

    public void inject(butterknife..ViewInjector viewinjector, RewardsEnrollFragment rewardsenrollfragment, Object obj)
    {
        super.inject(viewinjector, rewardsenrollfragment, obj);
        rewardsenrollfragment.etFirstName = (EditText)viewinjector.etFirstName((View)viewinjector.etFirstName(obj, 0x7f0e0262, "field 'etFirstName'"), 0x7f0e0262, "field 'etFirstName'");
        rewardsenrollfragment.etLastName = (EditText)viewinjector.etLastName((View)viewinjector.etLastName(obj, 0x7f0e0263, "field 'etLastName'"), 0x7f0e0263, "field 'etLastName'");
        rewardsenrollfragment.etEmail = (EditText)viewinjector.etEmail((View)viewinjector.etEmail(obj, 0x7f0e02da, "field 'etEmail'"), 0x7f0e02da, "field 'etEmail'");
        rewardsenrollfragment.etPhone = (PhoneTypefaceEditText)viewinjector.etPhone((View)viewinjector.etPhone(obj, 0x7f0e02db, "field 'etPhone'"), 0x7f0e02db, "field 'etPhone'");
        View view = (View)viewinjector.etPhone(obj, 0x7f0e02dd, "field 'etZipCode' and method 'onZipCodeChanged'");
        rewardsenrollfragment.etZipCode = (EditText)viewinjector.etZipCode(view, 0x7f0e02dd, "field 'etZipCode'");
        ((TextView)view).addTextChangedListener(new ab(this, rewardsenrollfragment));
        rewardsenrollfragment.updateAddressContainer = (LinearLayout)viewinjector.updateAddressContainer((View)viewinjector.updateAddressContainer(obj, 0x7f0e02de, "field 'updateAddressContainer'"), 0x7f0e02de, "field 'updateAddressContainer'");
        rewardsenrollfragment.cbUpdateAddress = (CheckBox)viewinjector.cbUpdateAddress((View)viewinjector.cbUpdateAddress(obj, 0x7f0e02df, "field 'cbUpdateAddress'"), 0x7f0e02df, "field 'cbUpdateAddress'");
        rewardsenrollfragment.agreeToTerms = (AgreeToTermsAndConditions)viewinjector.((View)viewinjector.(obj, 0x7f0e02e0, "field 'agreeToTerms'"), 0x7f0e02e0, "field 'agreeToTerms'");
        rewardsenrollfragment.spPhoneTypeSpinner = (Spinner)viewinjector.spPhoneTypeSpinner((View)viewinjector.spPhoneTypeSpinner(obj, 0x7f0e02dc, "field 'spPhoneTypeSpinner'"), 0x7f0e02dc, "field 'spPhoneTypeSpinner'");
        ((View)viewinjector.spPhoneTypeSpinner(obj, 0x7f0e02e1, "method 'createRewardsAccount'")).setOnClickListener(new ac(this, rewardsenrollfragment));
        view = (View)viewinjector.ViewInjector(obj, 0x7f0e044c, "method 'onAddressFieldFocusChange' and method 'onAddressChanged'");
        view.setOnFocusChangeListener(new ad(this, rewardsenrollfragment));
        ((TextView)view).addTextChangedListener(new ae(this, rewardsenrollfragment));
        view = (View)viewinjector.ViewInjector(obj, 0x7f0e044d, "method 'onAddressFieldFocusChange' and method 'onAddressChanged'");
        view.setOnFocusChangeListener(new af(this, rewardsenrollfragment));
        ((TextView)view).addTextChangedListener(new ag(this, rewardsenrollfragment));
        view = (View)viewinjector.ViewInjector(obj, 0x7f0e044e, "method 'onAddressFieldFocusChange' and method 'onAddressChanged'");
        view.setOnFocusChangeListener(new ah(this, rewardsenrollfragment));
        ((TextView)view).addTextChangedListener(new ai(this, rewardsenrollfragment));
        ((AdapterView)(View)viewinjector.ViewInjector(obj, 0x7f0e044f, "method 'onStateChanged'")).setOnItemSelectedListener(new aj(this, rewardsenrollfragment));
    }

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (RewardsEnrollFragment)obj, obj1);
    }

    public volatile void reset(BaseRewardsEnrollFragment baserewardsenrollfragment)
    {
        reset((RewardsEnrollFragment)baserewardsenrollfragment);
    }

    public void reset(RewardsEnrollFragment rewardsenrollfragment)
    {
        super.reset(rewardsenrollfragment);
        rewardsenrollfragment.etFirstName = null;
        rewardsenrollfragment.etLastName = null;
        rewardsenrollfragment.etEmail = null;
        rewardsenrollfragment.etPhone = null;
        rewardsenrollfragment.etZipCode = null;
        rewardsenrollfragment.updateAddressContainer = null;
        rewardsenrollfragment.cbUpdateAddress = null;
        rewardsenrollfragment.agreeToTerms = null;
        rewardsenrollfragment.spPhoneTypeSpinner = null;
    }

    public volatile void reset(Object obj)
    {
        reset((RewardsEnrollFragment)obj);
    }

    public tor()
    {
    }
}
