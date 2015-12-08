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
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;

public class NameSettingDialog extends BaseDialog
{

    private View _container;
    EditText _firstNameEt;
    private EditText _lastEt;
    EditText _lastNameEt;

    public NameSettingDialog()
    {
    }

    private void onSaveNameClicked()
    {
        Pinalytics.a(ElementType.SAVE_USER_SETTINGS_BUTTON, ComponentType.MODAL_DIALOG);
        String s = _firstNameEt.getText().toString().trim();
        String s1 = _lastNameEt.getText().toString().trim();
        if (!SignupFormUtils.isFirstNameValid(s))
        {
            Application.showToastShort(0x7f0702a9);
            return;
        }
        final String full = (new StringBuilder()).append(s).append(" ").append(s1).toString().trim();
        final User me = MyUser.get();
        final String oldFirst = me.getFirstName();
        final String oldLast = me.getLastName();
        final String oldFull = me.getFullName();
        if (me != null)
        {
            me.setFirstName(s);
            me.setLastName(s1);
            me.setFullName(full);
        }
        RequestParams requestparams = new RequestParams();
        requestparams.a("first_name", s);
        requestparams.a("last_name", s1);
        MyUserApi.a(requestparams, new _cls3(), null);
        Device.hideSoftKeyboard(_lastEt);
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
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030072, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        User user;
        user = MyUser.get();
        setTitle(0x7f070225);
        if (!LocaleUtils.isLanguageJa()) goto _L2; else goto _L1
_L1:
        _lastEt = _firstNameEt;
        if (user != null)
        {
            ViewHelper.setTextAndCursor(_firstNameEt, user.getFirstName());
            ViewHelper.setVisibility(_lastNameEt, false);
        }
_L4:
        _lastEt.setOnEditorActionListener(new _cls1());
        setPositiveButton(getString(0x7f0704be), new _cls2());
        setNegativeButton(getString(0x7f0700af), null);
        super.onActivityCreated(bundle);
        return;
_L2:
        _lastEt = _lastNameEt;
        if (user != null)
        {
            ViewHelper.setTextAndCursor(_firstNameEt, user.getFirstName());
            ViewHelper.setTextAndCursor(_lastNameEt, user.getLastName());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }


    private class _cls3 extends com.pinterest.api.remote.MyUserApi.SettingsApiResponse
    {

        final NameSettingDialog this$0;
        final String val$full;
        final User val$me;
        final String val$oldFirst;
        final String val$oldFull;
        final String val$oldLast;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Events.post(new DialogEvent(null));
            me.setFirstName(oldFirst);
            me.setLastName(oldLast);
            me.setFullName(oldFull);
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Application.showToastShort(String.format(Resources.string(0x7f070226), new Object[] {
                full
            }));
            Events.post(new DialogEvent(null));
        }

        _cls3()
        {
            this$0 = NameSettingDialog.this;
            full = s;
            me = user;
            oldFirst = s1;
            oldLast = s2;
            oldFull = s3;
            super();
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final NameSettingDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(2, i, keyevent))
            {
                onSaveNameClicked();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = NameSettingDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final NameSettingDialog this$0;

        public void onClick(View view)
        {
            onSaveNameClicked();
        }

        _cls2()
        {
            this$0 = NameSettingDialog.this;
            super();
        }
    }

}
