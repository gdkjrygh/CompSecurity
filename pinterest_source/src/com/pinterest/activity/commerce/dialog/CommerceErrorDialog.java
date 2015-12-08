// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.ui.text.PTextView;

public class CommerceErrorDialog extends BaseDialog
{

    private static final String EXTRA_MESSAGE = "extra_message";
    private static final String EXTRA_TITLE = "extra_title";
    private View _container;
    PTextView errorBody;

    public CommerceErrorDialog()
    {
        _layoutResId = 0x7f030063;
    }

    private void init()
    {
        ButterKnife.a(this, _container);
        setPositiveButton(0x7f0703d3, new _cls1());
    }

    public static CommerceErrorDialog newInstance(String s, String s1)
    {
        CommerceErrorDialog commerceerrordialog = new CommerceErrorDialog();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", s);
        bundle.putString("extra_message", s1);
        commerceerrordialog.setArguments(bundle);
        return commerceerrordialog;
    }

    public void make(LayoutInflater layoutinflater)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(fragmentactivity).inflate(0x7f030064, null);
            setContent(_container);
            ButterKnife.a(_container, container);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = getArguments();
        setTitle(bundle.getString("extra_title"));
        errorBody.setText(bundle.getString("extra_message"));
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CommerceErrorDialog this$0;

        public void onClick(View view)
        {
            dismiss();
        }

        _cls1()
        {
            this$0 = CommerceErrorDialog.this;
            super();
        }
    }

}
