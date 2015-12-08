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

public class UsernameSettingDialog extends BaseDialog
{

    private View _container;
    EditText _username;

    public UsernameSettingDialog()
    {
    }

    private void onSaveUserNameClicked(final String oldValue)
    {
        Pinalytics.a(ElementType.SAVE_USER_SETTINGS_BUTTON, ComponentType.MODAL_DIALOG);
        final User me = MyUser.get();
        if (me == null)
        {
            return;
        }
        final String newnameF = _username.getText().toString();
        int i = SignupFormUtils.isUsernameValid(newnameF);
        if (i != 0)
        {
            Application.showToastShort(i);
            return;
        }
        me.setUsername(newnameF);
        if (!oldValue.equals(newnameF))
        {
            RequestParams requestparams = new RequestParams();
            requestparams.a("username", newnameF);
            MyUserApi.a(requestparams, new _cls4(), null);
        }
        Device.hideSoftKeyboard(_username);
        dismiss();
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
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030096, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        setTitle(0x7f07021d);
        final String name;
        if (_username != null)
        {
            if ((name = MyUser.get()) != null)
            {
                name = name.getUsername();
                ViewHelper.setTextAndCursor(_username, name);
                _username.setImeActionLabel(Resources.string(0x7f0704be), 2);
                _username.setOnEditorActionListener(new _cls1());
                setPositiveButton(getString(0x7f0704be), new _cls2());
                setNegativeButton(getString(0x7f0700af), new _cls3());
                Device.showSoftKeyboard(_username);
                super.onActivityCreated(bundle);
                return;
            }
        }
    }


    private class _cls4 extends com.pinterest.api.remote.MyUserApi.SettingsApiResponse
    {

        final UsernameSettingDialog this$0;
        final User val$me;
        final String val$newnameF;
        final String val$oldValue;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Events.post(new DialogEvent(null));
            me.setUsername(oldValue);
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            if (_username != null)
            {
                _username.setText(newnameF);
            }
            Application.showToastShort(String.format(Resources.string(0x7f070393), new Object[] {
                newnameF
            }));
            Events.post(new DialogEvent(null));
        }

        _cls4()
        {
            this$0 = UsernameSettingDialog.this;
            newnameF = s;
            me = user;
            oldValue = s1;
            super();
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final UsernameSettingDialog this$0;
        final String val$name;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(2, i, keyevent))
            {
                onSaveUserNameClicked(name);
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = UsernameSettingDialog.this;
            name = s;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final UsernameSettingDialog this$0;
        final String val$name;

        public void onClick(View view)
        {
            onSaveUserNameClicked(name);
        }

        _cls2()
        {
            this$0 = UsernameSettingDialog.this;
            name = s;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final UsernameSettingDialog this$0;

        public void onClick(View view)
        {
            Device.hideSoftKeyboard(_username);
            dismiss();
        }

        _cls3()
        {
            this$0 = UsernameSettingDialog.this;
            super();
        }
    }

}
