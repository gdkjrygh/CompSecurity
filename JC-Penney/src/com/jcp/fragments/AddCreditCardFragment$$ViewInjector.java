// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

// Referenced classes of package com.jcp.fragments:
//            AddCreditCardFragment, a, f, g, 
//            h, i, j, k, 
//            l, m, b, c, 
//            d, e

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, AddCreditCardFragment addcreditcardfragment, Object obj)
    {
        View view = (View)ector.ector(obj, 0x7f0e0082, "field 'noButtonJcp' and method 'noClicked'");
        addcreditcardfragment.noButtonJcp = (TextView)ector.Jcp(view, 0x7f0e0082, "field 'noButtonJcp'");
        view.setOnClickListener(new a(this, addcreditcardfragment));
        view = (View)ector.ector(obj, 0x7f0e0093, "field 'addProfileAddress' and method 'addProfileAddress'");
        addcreditcardfragment.addProfileAddress = (TextView)ector.leAddress(view, 0x7f0e0093, "field 'addProfileAddress'");
        view.setOnClickListener(new f(this, addcreditcardfragment));
        addcreditcardfragment.fillJcpCardLayout = (LinearLayout)ector.ardLayout((View)ector.ardLayout(obj, 0x7f0e0083, "field 'fillJcpCardLayout'"), 0x7f0e0083, "field 'fillJcpCardLayout'");
        addcreditcardfragment.otherCardLayout = (LinearLayout)ector.dLayout((View)ector.dLayout(obj, 0x7f0e0087, "field 'otherCardLayout'"), 0x7f0e0087, "field 'otherCardLayout'");
        addcreditcardfragment.addCardLayout = (RelativeLayout)ector.ayout((View)ector.ayout(obj, 0x7f0e007f, "field 'addCardLayout'"), 0x7f0e007f, "field 'addCardLayout'");
        addcreditcardfragment.signInToggleBtn = (ToggleButton)ector.ggleBtn((View)ector.ggleBtn(obj, 0x7f0e0092, "field 'signInToggleBtn'"), 0x7f0e0092, "field 'signInToggleBtn'");
        view = (View)ector.ggleBtn(obj, 0x7f0e0085, "field 'mJcpCardEdit', method 'onJcpCardFocusChange', and method 'afterJcpCardTextChanged'");
        addcreditcardfragment.mJcpCardEdit = (EditText)ector.Edit(view, 0x7f0e0085, "field 'mJcpCardEdit'");
        view.setOnFocusChangeListener(new g(this, addcreditcardfragment));
        ((TextView)view).addTextChangedListener(new h(this, addcreditcardfragment));
        addcreditcardfragment.mJcpCardZipEdit = (EditText)ector.ZipEdit((View)ector.ZipEdit(obj, 0x7f0e0086, "field 'mJcpCardZipEdit'"), 0x7f0e0086, "field 'mJcpCardZipEdit'");
        view = (View)ector.ZipEdit(obj, 0x7f0e0089, "field 'otherCardEdit', method 'otherCardFocusChanged', method 'onOtherCardTextChanged', and method 'afterOtherCardTextChanged'");
        addcreditcardfragment.otherCardEdit = (EditText)ector.dEdit(view, 0x7f0e0089, "field 'otherCardEdit'");
        view.setOnFocusChangeListener(new i(this, addcreditcardfragment));
        ((TextView)view).addTextChangedListener(new j(this, addcreditcardfragment));
        view = (View)ector.ector(obj, 0x7f0e008a, "field 'otherCardMonthYearEdit', method 'otherCardMontyYearFocusChanged', method 'otherCardMonthYearTextChanged', method 'beforeOtherCardMonthYearTextChanged', and method 'afterOtherCardMonthYearTextChanged'");
        addcreditcardfragment.otherCardMonthYearEdit = (EditText)ector.dMonthYearEdit(view, 0x7f0e008a, "field 'otherCardMonthYearEdit'");
        view.setOnFocusChangeListener(new k(this, addcreditcardfragment));
        ((TextView)view).addTextChangedListener(new l(this, addcreditcardfragment));
        view = (View)ector.ector(obj, 0x7f0e008b, "field 'otherCardCvvEdit', method 'otherCardCVVFocusChanged', method 'otherCardCVVChanged', and method 'afterOtherCardCVVChanged'");
        addcreditcardfragment.otherCardCvvEdit = (EditText)ector.dCvvEdit(view, 0x7f0e008b, "field 'otherCardCvvEdit'");
        view.setOnFocusChangeListener(new m(this, addcreditcardfragment));
        ((TextView)view).addTextChangedListener(new b(this, addcreditcardfragment));
        view = (View)ector.ector(obj, 0x7f0e008c, "field 'otherCardZipEdit' and method 'afterOtherCardZipChanged'");
        addcreditcardfragment.otherCardZipEdit = (EditText)ector.dZipEdit(view, 0x7f0e008c, "field 'otherCardZipEdit'");
        ((TextView)view).addTextChangedListener(new c(this, addcreditcardfragment));
        addcreditcardfragment.cardImage = (ImageView)ector.e((View)ector.e(obj, 0x7f0e0088, "field 'cardImage'"), 0x7f0e0088, "field 'cardImage'");
        ((View)ector.e(obj, 0x7f0e008e, "method 'addProfileAddress'")).setOnClickListener(new d(this, addcreditcardfragment));
        ((View)ector.ector(obj, 0x7f0e0080, "method 'yesClicked'")).setOnClickListener(new e(this, addcreditcardfragment));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (AddCreditCardFragment)obj, obj1);
    }

    public void reset(AddCreditCardFragment addcreditcardfragment)
    {
        addcreditcardfragment.noButtonJcp = null;
        addcreditcardfragment.addProfileAddress = null;
        addcreditcardfragment.fillJcpCardLayout = null;
        addcreditcardfragment.otherCardLayout = null;
        addcreditcardfragment.addCardLayout = null;
        addcreditcardfragment.signInToggleBtn = null;
        addcreditcardfragment.mJcpCardEdit = null;
        addcreditcardfragment.mJcpCardZipEdit = null;
        addcreditcardfragment.otherCardEdit = null;
        addcreditcardfragment.otherCardMonthYearEdit = null;
        addcreditcardfragment.otherCardCvvEdit = null;
        addcreditcardfragment.otherCardZipEdit = null;
        addcreditcardfragment.cardImage = null;
    }

    public volatile void reset(Object obj)
    {
        reset((AddCreditCardFragment)obj);
    }

    public ()
    {
    }
}
