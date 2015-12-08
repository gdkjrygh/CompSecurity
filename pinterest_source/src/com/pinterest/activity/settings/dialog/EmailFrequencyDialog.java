// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.model.MyUser;

public class EmailFrequencyDialog extends BaseDialog
{

    private View _container;
    RadioButton _dailyBt;
    RadioGroup _frequencyRadioGroup;
    RadioButton _immediateBt;
    private String _initialSetting;
    private android.view.View.OnClickListener onSaveClick;

    public EmailFrequencyDialog(String s)
    {
        onSaveClick = new _cls1();
        _initialSetting = s;
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030074, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (MyUser.get() == null)
        {
            return;
        }
        _frequencyRadioGroup.clearCheck();
        if (_initialSetting.equals("daily"))
        {
            _dailyBt.setChecked(true);
        } else
        {
            _immediateBt.setChecked(true);
        }
        setTitle(0x7f070510);
        setNegativeButton(getString(0x7f0700af), null);
        setPositiveButton(getString(0x7f0704be), onSaveClick);
        super.onActivityCreated(bundle);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final EmailFrequencyDialog this$0;

        public void onClick(final View choiceString)
        {
            RequestParams requestparams;
            int i;
            requestparams = new RequestParams();
            i = _frequencyRadioGroup.getCheckedRadioButtonId();
            class _cls1 extends com.pinterest.api.remote.MyUserApi.SettingsApiResponse
            {

                final _cls1 this$1;
                final String val$choiceString;

                public void onFailure(Throwable throwable, ApiResponse apiresponse)
                {
                    super.onFailure(throwable, apiresponse);
                    class _cls1 extends BaseToast
                    {

                        final _cls1 this$2;

                        public void setMessage(String s)
                        {
                            super.setMessage(0x7f070239);
                        }

                            _cls1()
                            {
                                this$2 = _cls1.this;
                                super();
                            }
                    }

                    Events.post(new _cls1());
                }

                public void onSuccess(ApiResponse apiresponse)
                {
                    super.onSuccess(apiresponse);
                    try
                    {
                        apiresponse = MyUser.getJsonUserSettings();
                        apiresponse.b("email_interval", choiceString);
                        MyUser.saveUserSettingsMe(apiresponse);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (ApiResponse apiresponse)
                    {
                        PLog.error(apiresponse, "exception occurred", new Object[0]);
                    }
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    choiceString = s;
                    super();
                }
            }

            if (i == 0x7f0f016d)
            {
                choiceString = "immediate";
            } else
            {
                choiceString = "daily";
            }
            if (i != 0x7f0f016d || !_initialSetting.equals("daily")) goto _L2; else goto _L1
_L1:
            requestparams.a("email_interval", "immediate");
_L4:
            MyUserApi.a(requestparams, new _cls1(), null);
            _frequencyRadioGroup = null;
            dismiss();
            return;
_L2:
            if (i == 0x7f0f016e && _initialSetting.equals("immediate"))
            {
                requestparams.a("email_interval", "daily");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls1()
        {
            this$0 = EmailFrequencyDialog.this;
            super();
        }
    }

}
