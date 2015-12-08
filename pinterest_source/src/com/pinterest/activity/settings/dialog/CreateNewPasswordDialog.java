// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import java.io.Serializable;
import java.util.Map;

public class CreateNewPasswordDialog extends BaseDialog
{

    private static final String PARAM_MAP_KEY = "PARAM_MAP_KEY";
    Activity _activity;
    private ApiResponseHandler _changePwdHandler;
    private View _container;
    EditText _newEt;
    Map _pwdParams;
    CheckBox _showCb;

    public CreateNewPasswordDialog()
    {
        _changePwdHandler = new _cls4(true);
    }

    public CreateNewPasswordDialog(Map map)
    {
        _changePwdHandler = new _cls4(true);
        _pwdParams = map;
        Bundle bundle1 = getArguments();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
        }
        bundle.putSerializable("PARAM_MAP_KEY", (Serializable)map);
        setArguments(bundle);
    }

    private void onSavePwdClicked()
    {
        Pinalytics.a(ElementType.SAVE_USER_SETTINGS_BUTTON, ComponentType.MODAL_DIALOG);
        String s = _newEt.getText().toString();
        if (TextUtils.isEmpty(s))
        {
            Application.showToast(0x7f07045f);
            return;
        }
        if (!SignupFormUtils.isPasswordValid(s))
        {
            Application.showToast(0x7f070541);
            return;
        } else
        {
            _pwdParams.put("new", s);
            _pwdParams.put("new_confirm", s);
            AccountApi.a(_pwdParams, _changePwdHandler);
            Device.hideSoftKeyboard(_newEt);
            dismiss();
            return;
        }
    }

    public static void show(Map map)
    {
        Events.postSticky(new DialogEvent(new CreateNewPasswordDialog(map)));
    }

    private void tryLoginWithNewPwd()
    {
        if (_activity == null)
        {
            return;
        }
        if (_pwdParams != null)
        {
            ActivityHelper.goSplashLogin(_activity, (String)_pwdParams.get("username"), (String)_pwdParams.get("new"), "com.pinterest.EXTRA_APP_MODE");
        }
        _activity.finish();
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public void make(LayoutInflater layoutinflater)
    {
        _activity = getActivity();
        if (_activity == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(_activity).inflate(0x7f030079, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        setTitle(Resources.string(0x7f0703f1, new Object[] {
            (String)_pwdParams.get("username")
        }));
        if (_pwdParams.containsKey("new"))
        {
            ViewHelper.setTextAndCursor(_newEt, (String)_pwdParams.get("new"));
        }
        _showCb.setOnClickListener(new _cls1());
        _newEt.setOnEditorActionListener(new _cls2());
        setPositiveButton(0x7f0700d8, new _cls3());
        Device.showSoftKeyboard(_newEt);
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        if (_pwdParams == null && bundle != null)
        {
            _pwdParams = (Map)bundle.getSerializable("PARAM_MAP_KEY");
        }
        super.onCreate(bundle);
    }



    private class _cls4 extends ApiResponseHandler
    {

        final CreateNewPasswordDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.showToast(apiresponse.getMessageDetailIfExist());
            CreateNewPasswordDialog.show(_pwdParams);
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Application.showToast(0x7f0700da);
            tryLoginWithNewPwd();
            Events.post(new DialogEvent(null));
        }

        _cls4(boolean flag)
        {
            this$0 = CreateNewPasswordDialog.this;
            super(flag);
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CreateNewPasswordDialog this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.SHOW_PASSWORD_BUTTON, ComponentType.MODAL_DIALOG);
            view = (CheckBox)view;
            ViewHelper.showPassword(_newEt, view.isChecked());
        }

        _cls1()
        {
            this$0 = CreateNewPasswordDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.TextView.OnEditorActionListener
    {

        final CreateNewPasswordDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (ViewHelper.isKeyboardAction(2, i, keyevent))
            {
                onSavePwdClicked();
                return true;
            } else
            {
                return false;
            }
        }

        _cls2()
        {
            this$0 = CreateNewPasswordDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final CreateNewPasswordDialog this$0;

        public void onClick(View view)
        {
            onSavePwdClicked();
        }

        _cls3()
        {
            this$0 = CreateNewPasswordDialog.this;
            super();
        }
    }

}
