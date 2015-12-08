// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.ui.text.PEditText;

public class DeactivateSettingReasonDialog extends BaseDialog
{

    private static final String DIALOG_MESSAGE = "dialogMessage";
    private static final String DIALOG_POSITIVE_BUTTON = "dialogPositiveButton";
    private static final String DIALOG_TITLE = "dialogTitle";
    private View _container;
    PEditText _deactivationReasonEt;
    TextView _deactivationReasonTv;
    private String _dialogMessage;
    private String _dialogTitle;
    private String _positiveButtonString;
    private String _preFilledTitle;
    private DeactivationExplanationListener listener;

    public DeactivateSettingReasonDialog()
    {
    }

    public DeactivateSettingReasonDialog(String s, String s1, String s2)
    {
        Bundle bundle1 = getArguments();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
        }
        bundle.putString("dialogTitle", s);
        bundle.putString("dialogMessage", s1);
        bundle.putString("dialogPositiveButton", s2);
        setArguments(bundle);
    }

    private void initSimplifiedForm()
    {
        ButterKnife.a(this, _container);
        _preFilledTitle = Resources.string(0x7f0701cc);
        if (_dialogTitle != null)
        {
            setTitle(_dialogTitle);
        }
        if (_preFilledTitle != null)
        {
            _deactivationReasonEt.setHint(_preFilledTitle);
        }
        if (_dialogMessage != null)
        {
            _deactivationReasonTv.setText(Html.fromHtml(_dialogMessage), android.widget.TextView.BufferType.SPANNABLE);
            _deactivationReasonTv.setMovementMethod(LinkMovementMethod.getInstance());
        } else
        {
            _deactivationReasonTv.setVisibility(8);
        }
        _deactivationReasonEt.setTypeface(FontUtils.getTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT));
        _deactivationReasonEt.requestFocus();
        _deactivationReasonEt.setOnEditorActionListener(new _cls1());
        setNegativeButton(getString(0x7f0700af), null);
        setPositiveButton(_positiveButtonString, new _cls2());
        Device.showSoftKeyboard(getDialog());
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030089, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            initSimplifiedForm();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            _dialogTitle = bundle.getString("dialogTitle");
            _dialogMessage = bundle.getString("dialogMessage");
            _positiveButtonString = bundle.getString("dialogPositiveButton");
        }
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        super.onDestroyView();
    }

    public void setListener(DeactivationExplanationListener deactivationexplanationlistener)
    {
        listener = deactivationexplanationlistener;
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final DeactivateSettingReasonDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6)
            {
                listener.startDeactivateAccountProcess(_deactivationReasonEt.getText().toString());
            } else
            if (i == 5)
            {
                if (_deactivationReasonEt != null)
                {
                    _deactivationReasonEt.requestFocus();
                    return true;
                }
            } else
            {
                return false;
            }
            return true;
        }

        _cls1()
        {
            this$0 = DeactivateSettingReasonDialog.this;
            super();
        }

        private class DeactivationExplanationListener
        {

            public abstract void startDeactivateAccountProcess(String s);
        }

    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final DeactivateSettingReasonDialog this$0;

        public void onClick(View view)
        {
            listener.startDeactivateAccountProcess(_deactivationReasonEt.getText().toString());
        }

        _cls2()
        {
            this$0 = DeactivateSettingReasonDialog.this;
            super();
        }
    }

}
