// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.jcp.views.PhoneTypefaceEditText;

// Referenced classes of package com.jcp.fragments:
//            LPOAddressFragment, bm, bn, bo, 
//            bp, bq, br, bs

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, LPOAddressFragment lpoaddressfragment, Object obj)
    {
        View view = (View)ector.ew(obj, 0x7f0e0159, "field 'changeLpoFirstName' and method 'afterChangeLpoFirstNameTextChanged'");
        lpoaddressfragment.changeLpoFirstName = (EditText)ector.oFirstName(view, 0x7f0e0159, "field 'changeLpoFirstName'");
        ((TextView)view).addTextChangedListener(new bm(this, lpoaddressfragment));
        view = (View)ector.ew(obj, 0x7f0e015a, "field 'changeLpoLastName' and method 'afterChangeLpoLastNameTextChanged'");
        lpoaddressfragment.changeLpoLastName = (EditText)ector.oLastName(view, 0x7f0e015a, "field 'changeLpoLastName'");
        ((TextView)view).addTextChangedListener(new bn(this, lpoaddressfragment));
        lpoaddressfragment.companyLpoEditText = (EditText)ector.poEditText((View)ector.ew(obj, 0x7f0e015b, "field 'companyLpoEditText'"), 0x7f0e015b, "field 'companyLpoEditText'");
        view = (View)ector.ew(obj, 0x7f0e015c, "field 'lineOneLpoEditText', method 'onLineOneLpoTextChanged', and method 'afterLineOneLpoTextChanged'");
        lpoaddressfragment.lineOneLpoEditText = (EditText)ector.poEditText(view, 0x7f0e015c, "field 'lineOneLpoEditText'");
        ((TextView)view).addTextChangedListener(new bo(this, lpoaddressfragment));
        lpoaddressfragment.lineTwoLpoEditText = (EditText)ector.poEditText((View)ector.ew(obj, 0x7f0e015d, "field 'lineTwoLpoEditText'"), 0x7f0e015d, "field 'lineTwoLpoEditText'");
        view = (View)ector.ew(obj, 0x7f0e015f, "field 'zipCodeLpoEditText', method 'onZipCodeLpoTextChanged', and method 'afterZipCodeLpoTextChanged'");
        lpoaddressfragment.zipCodeLpoEditText = (EditText)ector.poEditText(view, 0x7f0e015f, "field 'zipCodeLpoEditText'");
        ((TextView)view).addTextChangedListener(new bp(this, lpoaddressfragment));
        view = (View)ector.ew(obj, 0x7f0e015e, "field 'questionMarkHint' and method 'lineOneHintClick'");
        lpoaddressfragment.questionMarkHint = (ImageView)ector.MarkHint(view, 0x7f0e015e, "field 'questionMarkHint'");
        view.setOnClickListener(new bq(this, lpoaddressfragment));
        lpoaddressfragment.alertMessage = (TextView)ector.sage((View)ector.ew(obj, 0x7f0e00b1, "field 'alertMessage'"), 0x7f0e00b1, "field 'alertMessage'");
        lpoaddressfragment.apoFpoDpoSpinner = (Spinner)ector.oSpinner((View)ector.ew(obj, 0x7f0e0161, "field 'apoFpoDpoSpinner'"), 0x7f0e0161, "field 'apoFpoDpoSpinner'");
        view = (View)ector.ew(obj, 0x7f0e0162, "field 'aaAeSpinner' and method 'onAaAeSpinnerItemSelected'");
        lpoaddressfragment.aaAeSpinner = (Spinner)ector.ner(view, 0x7f0e0162, "field 'aaAeSpinner'");
        ((AdapterView)view).setOnItemSelectedListener(new br(this, lpoaddressfragment));
        obj = (View)ector.ew(obj, 0x7f0e0160, "field 'phoneLpoEditText' and method 'afterPhoneLpoTextChanged'");
        lpoaddressfragment.phoneLpoEditText = (PhoneTypefaceEditText)ector.EditText(((View) (obj)), 0x7f0e0160, "field 'phoneLpoEditText'");
        ((TextView)obj).addTextChangedListener(new bs(this, lpoaddressfragment));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (LPOAddressFragment)obj, obj1);
    }

    public void reset(LPOAddressFragment lpoaddressfragment)
    {
        lpoaddressfragment.changeLpoFirstName = null;
        lpoaddressfragment.changeLpoLastName = null;
        lpoaddressfragment.companyLpoEditText = null;
        lpoaddressfragment.lineOneLpoEditText = null;
        lpoaddressfragment.lineTwoLpoEditText = null;
        lpoaddressfragment.zipCodeLpoEditText = null;
        lpoaddressfragment.questionMarkHint = null;
        lpoaddressfragment.alertMessage = null;
        lpoaddressfragment.apoFpoDpoSpinner = null;
        lpoaddressfragment.aaAeSpinner = null;
        lpoaddressfragment.phoneLpoEditText = null;
    }

    public volatile void reset(Object obj)
    {
        reset((LPOAddressFragment)obj);
    }

    public ()
    {
    }
}
