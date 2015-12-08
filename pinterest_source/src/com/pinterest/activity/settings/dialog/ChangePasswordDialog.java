// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class ChangePasswordDialog extends BaseDialog
{

    private ApiResponseHandler _changePwdHandler;
    private View _container;
    EditText _newEt;
    private String _newPwd;
    EditText _oldEt;
    CheckBox _showCb;

    public ChangePasswordDialog()
    {
        _changePwdHandler = new _cls4(true);
    }

    private void onSavePwdClicked()
    {
        Pinalytics.a(ElementType.SAVE_USER_SETTINGS_BUTTON, ComponentType.MODAL_DIALOG);
        String s = _oldEt.getText().toString();
        String s1 = _newEt.getText().toString();
        if (TextUtils.isEmpty(s))
        {
            Application.showToast(0x7f070460);
            return;
        }
        if (TextUtils.isEmpty(s1))
        {
            Application.showToast(0x7f07045f);
            return;
        }
        if (!SignupFormUtils.isPasswordValid(s1))
        {
            Application.showToast(0x7f070541);
            return;
        } else
        {
            _newPwd = s1;
            AccountApi.a(s, s1, _changePwdHandler);
            Device.hideSoftKeyboard(_newEt);
            dismiss();
            return;
        }
    }

    private void showChangePwdFailedDialog(ApiResponse apiresponse)
    {
        final BaseDialog dialog = new BaseDialog();
        dialog.setTitle(0x7f070600);
        dialog.setMessage(apiresponse.getMessageDetailIfExist());
        dialog.setPositiveButton(0x7f0705a1, new _cls5());
        dialog.setNegativeButton(0x7f0702f1, new _cls6());
        Events.postSticky(new DialogEvent(dialog));
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
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030060, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        setTitle(Resources.string(0x7f0700db));
        _showCb.setOnClickListener(new _cls1());
        _newPwd = null;
        _newEt.setOnEditorActionListener(new _cls2());
        setPositiveButton(0x7f0700d8, new _cls3());
        setNegativeButton(0x7f0700af, null);
        Device.showSoftKeyboard(_oldEt);
        super.onActivityCreated(bundle);
    }




    private class _cls4 extends ApiResponseHandler
    {

        final ChangePasswordDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.error(throwable, "ApiResponseHandler response: %s", new Object[] {
                apiresponse
            });
            showChangePwdFailedDialog(apiresponse);
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Pinalytics.a(EventType.USER_PASSWORD_RESET_COMPLETED, null);
            Application.showToast(0x7f0700da);
            apiresponse = new com.pinterest.api.remote.AccountApi.LoginParams();
            apiresponse.b = MyUser.get().getUsername();
            apiresponse.e = _newPwd;
            ApiResponseHandler.setForceUnauthedLogout(false);
            class _cls1 extends com.pinterest.api.remote.AccountApi.LoginApiResponse
            {

                final _cls4 this$1;

                public void onFinish()
                {
                    super.onFinish();
                    ApiResponseHandler.setForceUnauthedLogout(true);
                }

                _cls1(boolean flag)
                {
                    this$1 = _cls4.this;
                    super(flag);
                }
            }

            try
            {
                AccountApi.a(apiresponse, new _cls1(true));
            }
            // Misplaced declaration of an exception variable
            catch (ApiResponse apiresponse)
            {
                PLog.error(apiresponse, "exception occurred", new Object[0]);
            }
            Events.post(new DialogEvent(null));
        }

        _cls4(boolean flag)
        {
            this$0 = ChangePasswordDialog.this;
            super(flag);
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final ChangePasswordDialog this$0;
        final BaseDialog val$dialog;

        public void onClick(View view)
        {
            dialog.dismiss();
            Events.postSticky(new DialogEvent(new ChangePasswordDialog()));
        }

        _cls5()
        {
            this$0 = ChangePasswordDialog.this;
            dialog = basedialog;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final ChangePasswordDialog this$0;
        final BaseDialog val$dialog;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.RESET_BUTTON);
            dialog.dismiss();
            if (MyUser.get() != null)
            {
                view = MyUser.get().getUsername();
                if (view != null)
                {
                    AccountApi.c(view, new com.pinterest.api.remote.AccountApi.ResetPasswordApiResponse());
                }
            }
        }

        _cls6()
        {
            this$0 = ChangePasswordDialog.this;
            dialog = basedialog;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ChangePasswordDialog this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.SHOW_PASSWORD_BUTTON, ComponentType.MODAL_DIALOG);
            view = (CheckBox)view;
            ViewHelper.showPassword(_newEt, view.isChecked());
        }

        _cls1()
        {
            this$0 = ChangePasswordDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.TextView.OnEditorActionListener
    {

        final ChangePasswordDialog this$0;

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
            this$0 = ChangePasswordDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final ChangePasswordDialog this$0;

        public void onClick(View view)
        {
            onSavePwdClicked();
        }

        _cls3()
        {
            this$0 = ChangePasswordDialog.this;
            super();
        }
    }

}
