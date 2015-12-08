// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.jcp.views.PhoneTypefaceEditText;
import com.jcp.views.TypefaceEditText;
import com.jcp.widget.rewards.AgreeToTermsAndConditions;

// Referenced classes of package com.jcp.fragments:
//            JCPCreateAccountFragment, au, av, aw, 
//            ax, ay, az, ba, 
//            bb, bc

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, JCPCreateAccountFragment jcpcreateaccountfragment, Object obj)
    {
        jcpcreateaccountfragment.etFirstName = (EditText)ector.ame((View)ector.ame(obj, 0x7f0e0262, "field 'etFirstName'"), 0x7f0e0262, "field 'etFirstName'");
        jcpcreateaccountfragment.etLastName = (EditText)ector.me((View)ector.me(obj, 0x7f0e0263, "field 'etLastName'"), 0x7f0e0263, "field 'etLastName'");
        jcpcreateaccountfragment.etEmail = (EditText)ector.me((View)ector.me(obj, 0x7f0e0121, "field 'etEmail'"), 0x7f0e0121, "field 'etEmail'");
        View view = (View)ector.me(obj, 0x7f0e0122, "field 'etPassword', method 'onPasswordTextChanged', and method 'onPasswordEditTextTouch'");
        jcpcreateaccountfragment.etPassword = (TypefaceEditText)ector.rd(view, 0x7f0e0122, "field 'etPassword'");
        ((TextView)view).addTextChangedListener(new au(this, jcpcreateaccountfragment));
        view.setOnTouchListener(new av(this, jcpcreateaccountfragment));
        jcpcreateaccountfragment.etPasswordConfirm = (EditText)ector.rdConfirm((View)ector.rdConfirm(obj, 0x7f0e0123, "field 'etPasswordConfirm'"), 0x7f0e0123, "field 'etPasswordConfirm'");
        jcpcreateaccountfragment.msgMissingFields = (TextView)ector.ngFields((View)ector.ngFields(obj, 0x7f0e012c, "field 'msgMissingFields'"), 0x7f0e012c, "field 'msgMissingFields'");
        view = (View)ector.ngFields(obj, 0x7f0e0124, "field 'keepMeSignedIn' and method 'onSignedInSwitchClick'");
        jcpcreateaccountfragment.keepMeSignedIn = (ToggleButton)ector.gnedIn(view, 0x7f0e0124, "field 'keepMeSignedIn'");
        view.setOnClickListener(new aw(this, jcpcreateaccountfragment));
        jcpcreateaccountfragment.enrollInRewardsContainer = (LinearLayout)ector.RewardsContainer((View)ector.RewardsContainer(obj, 0x7f0e0125, "field 'enrollInRewardsContainer'"), 0x7f0e0125, "field 'enrollInRewardsContainer'");
        jcpcreateaccountfragment.rewardsInlineEnroll = (LinearLayout)ector.nlineEnroll((View)ector.nlineEnroll(obj, 0x7f0e0127, "field 'rewardsInlineEnroll'"), 0x7f0e0127, "field 'rewardsInlineEnroll'");
        view = (View)ector.nlineEnroll(obj, 0x7f0e0126, "field 'radioEnrollInRewards' and method 'onRadioEnrolInRewardsClick'");
        jcpcreateaccountfragment.radioEnrollInRewards = (RadioButton)ector.ollInRewards(view, 0x7f0e0126, "field 'radioEnrollInRewards'");
        view.setOnClickListener(new ax(this, jcpcreateaccountfragment));
        view = (View)ector.ector(obj, 0x7f0e0128, "field 'radioLinkToRewards' and method 'onRadioLinkToRewardsClick'");
        jcpcreateaccountfragment.radioLinkToRewards = (RadioButton)ector.kToRewards(view, 0x7f0e0128, "field 'radioLinkToRewards'");
        view.setOnClickListener(new ay(this, jcpcreateaccountfragment));
        view = (View)ector.ector(obj, 0x7f0e0129, "field 'radioNotInterestedInRewards' and method 'onRadioNotInterestedInRewardsClick'");
        jcpcreateaccountfragment.radioNotInterestedInRewards = (RadioButton)ector.InterestedInRewards(view, 0x7f0e0129, "field 'radioNotInterestedInRewards'");
        view.setOnClickListener(new az(this, jcpcreateaccountfragment));
        jcpcreateaccountfragment.rewardsEnrollPhone = (PhoneTypefaceEditText)ector.nrollPhone((View)ector.nrollPhone(obj, 0x7f0e02db, "field 'rewardsEnrollPhone'"), 0x7f0e02db, "field 'rewardsEnrollPhone'");
        jcpcreateaccountfragment.spPhoneTypeSpinner = (Spinner)ector.ypeSpinner((View)ector.ypeSpinner(obj, 0x7f0e02dc, "field 'spPhoneTypeSpinner'"), 0x7f0e02dc, "field 'spPhoneTypeSpinner'");
        jcpcreateaccountfragment.rewardsEnrollZip = (EditText)ector.nrollZip((View)ector.nrollZip(obj, 0x7f0e02dd, "field 'rewardsEnrollZip'"), 0x7f0e02dd, "field 'rewardsEnrollZip'");
        jcpcreateaccountfragment.termsAndConditions = (AgreeToTermsAndConditions)ector.Conditions((View)ector.Conditions(obj, 0x7f0e02e0, "field 'termsAndConditions'"), 0x7f0e02e0, "field 'termsAndConditions'");
        jcpcreateaccountfragment.emailOptInSection = (LinearLayout)ector.InSection((View)ector.InSection(obj, 0x7f0e012a, "field 'emailOptInSection'"), 0x7f0e012a, "field 'emailOptInSection'");
        jcpcreateaccountfragment.cbEmailOptIn = (CheckBox)ector.ptIn((View)ector.ptIn(obj, 0x7f0e012b, "field 'cbEmailOptIn'"), 0x7f0e012b, "field 'cbEmailOptIn'");
        ((View)ector.ptIn(obj, 0x7f0e012f, "method 'onCreateAccountClick'")).setOnClickListener(new ba(this, jcpcreateaccountfragment));
        ((View)ector.ector(obj, 0x7f0e012d, "method 'onPrivatePolicyClick'")).setOnClickListener(new bb(this, jcpcreateaccountfragment));
        ((View)ector.ector(obj, 0x7f0e012e, "method 'onCAPolicyClick'")).setOnClickListener(new bc(this, jcpcreateaccountfragment));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (JCPCreateAccountFragment)obj, obj1);
    }

    public void reset(JCPCreateAccountFragment jcpcreateaccountfragment)
    {
        jcpcreateaccountfragment.etFirstName = null;
        jcpcreateaccountfragment.etLastName = null;
        jcpcreateaccountfragment.etEmail = null;
        jcpcreateaccountfragment.etPassword = null;
        jcpcreateaccountfragment.etPasswordConfirm = null;
        jcpcreateaccountfragment.msgMissingFields = null;
        jcpcreateaccountfragment.keepMeSignedIn = null;
        jcpcreateaccountfragment.enrollInRewardsContainer = null;
        jcpcreateaccountfragment.rewardsInlineEnroll = null;
        jcpcreateaccountfragment.radioEnrollInRewards = null;
        jcpcreateaccountfragment.radioLinkToRewards = null;
        jcpcreateaccountfragment.radioNotInterestedInRewards = null;
        jcpcreateaccountfragment.rewardsEnrollPhone = null;
        jcpcreateaccountfragment.spPhoneTypeSpinner = null;
        jcpcreateaccountfragment.rewardsEnrollZip = null;
        jcpcreateaccountfragment.termsAndConditions = null;
        jcpcreateaccountfragment.emailOptInSection = null;
        jcpcreateaccountfragment.cbEmailOptIn = null;
    }

    public volatile void reset(Object obj)
    {
        reset((JCPCreateAccountFragment)obj);
    }

    public ()
    {
    }
}
