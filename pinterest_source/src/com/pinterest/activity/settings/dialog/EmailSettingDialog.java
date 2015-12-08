// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;

public class EmailSettingDialog extends BaseDialog
{

    private View _container;
    private String _email;
    EditText _emailEt;

    public EmailSettingDialog(String s)
    {
        _email = s;
    }

    private void onSaveEmailClicked(final String oldValue)
    {
        final String newemailF;
        Pinalytics.a(ElementType.SAVE_USER_SETTINGS_BUTTON, ComponentType.MODAL_DIALOG);
        newemailF = _emailEt.getText().toString();
        if (SignupFormUtils.isEmailValid(newemailF)) goto _L2; else goto _L1
_L1:
        Application.showToastShort(0x7f070531);
_L4:
        return;
_L2:
        if (oldValue.equals(newemailF))
        {
            break; /* Loop/switch isn't completed */
        }
        RequestParams requestparams = new RequestParams();
        requestparams.a("email", newemailF);
        final User me = MyUser.get();
        if (me == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        me.setEmail(newemailF);
        MyUserApi.a(requestparams, new _cls3(), null);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        Device.hideSoftKeyboard(_emailEt);
        dismiss();
        return;
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
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030073, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        setTitle(0x7f070211);
        if (_email == null)
        {
            return;
        } else
        {
            ViewHelper.setTextAndCursor(_emailEt, _email);
            _emailEt.setImeActionLabel(Resources.string(0x7f0704be), 2);
            _emailEt.setOnEditorActionListener(new _cls1());
            setPositiveButton(getString(0x7f0704be), new _cls2());
            Device.showSoftKeyboard(_emailEt);
            super.onActivityCreated(bundle);
            return;
        }
    }



    private class _cls3 extends com.pinterest.api.remote.MyUserApi.SettingsApiResponse
    {

        final EmailSettingDialog this$0;
        final User val$me;
        final String val$newemailF;
        final String val$oldValue;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Events.post(new DialogEvent(null));
            me.setEmail(oldValue);
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Application.showToastShort(String.format(Resources.string(0x7f07038d), new Object[] {
                newemailF
            }));
            Events.post(new com.pinterest.activity.settings.UpdatedAccountSettingsFragment.AccountSettingsEvent());
            Events.post(new DialogEvent(null));
        }

        _cls3()
        {
            this$0 = EmailSettingDialog.this;
            newemailF = s;
            me = user;
            oldValue = s1;
            super();
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final EmailSettingDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(2, i, keyevent))
            {
                onSaveEmailClicked(_email);
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = EmailSettingDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final EmailSettingDialog this$0;

        public void onClick(View view)
        {
            Device.hideSoftKeyboard(_emailEt);
            onSaveEmailClicked(_email);
        }

        _cls2()
        {
            this$0 = EmailSettingDialog.this;
            super();
        }
    }

}
