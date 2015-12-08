// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.text.PTextView;

public class CommerceConsentDialog extends BaseDialog
{

    private static final String EXTRA_AMOUNT = "extra_amount";
    private static final String EXTRA_CARD = "extra_card";
    private View _container;
    PTextView consentText;

    public CommerceConsentDialog()
    {
        _layoutResId = 0x7f030061;
    }

    private void init()
    {
        ButterKnife.a(this, _container);
        setPositiveButton(0x7f070158, new _cls1());
        setNegativeButton(0x7f070157, new _cls2());
    }

    public static CommerceConsentDialog newInstance(String s, String s1)
    {
        CommerceConsentDialog commerceconsentdialog = new CommerceConsentDialog();
        Bundle bundle = new Bundle();
        bundle.putString("extra_amount", s);
        bundle.putString("extra_card", s1);
        commerceconsentdialog.setArguments(bundle);
        return commerceconsentdialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(fragmentactivity).inflate(0x7f030062, null);
            setContent(_container, 0);
            ButterKnife.a(_container, container);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Object obj = getArguments();
        String s = ((Bundle) (obj)).getString("extra_amount");
        bundle = Resources.string(0x7f070159, new Object[] {
            s
        });
        obj = Resources.string(0x7f070156, new Object[] {
            ((Bundle) (obj)).getString("extra_card"), s
        });
        setTitle(bundle);
        consentText.setText(((CharSequence) (obj)));
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CommerceConsentDialog this$0;

        public void onClick(View view)
        {
            Events.post(new CheckoutClickEvent(com.pinterest.activity.commerce.event.CheckoutClickEvent.Click.EnrollInIncentive));
            dismiss();
        }

        _cls1()
        {
            this$0 = CommerceConsentDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CommerceConsentDialog this$0;

        public void onClick(View view)
        {
            dismiss();
        }

        _cls2()
        {
            this$0 = CommerceConsentDialog.this;
            super();
        }
    }

}
