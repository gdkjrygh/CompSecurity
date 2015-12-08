// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.PEditText;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            LoginFailureDialog, ResetPasswordDialog, LoginForgotPasswordDialog

public class LoginDialogView extends RelativeLayout
    implements android.view.View.OnClickListener
{

    public static String lastEmailInput = "";
    public static String lastPasswordInput = "";
    private BaseDialog _dialog;
    private PEditText _emailEt;
    private View _facebookBt;
    private View _forgotPassword;
    private Button _gplusBt;
    private View _loginBt;
    private View _messageContainer;
    private PEditText _passwordEt;
    private View _rakutenBt;
    private View _twitterBt;
    private android.view.View.OnKeyListener onKeyListener;
    private com.pinterest.api.remote.MyUserApi.MyUserApiResponse onLoadMe;
    private com.pinterest.api.remote.AccountApi.LoginApiResponse onLogin;

    public LoginDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onKeyListener = new _cls1();
        onLogin = new _cls2();
        onLoadMe = new _cls7();
        init();
    }

    public LoginDialogView(Context context, BaseDialog basedialog)
    {
        super(context);
        onKeyListener = new _cls1();
        onLogin = new _cls2();
        onLoadMe = new _cls7();
        _dialog = basedialog;
        init();
    }

    private void doLogin(String s, String s1)
    {
        lastEmailInput = s;
        lastPasswordInput = s1;
        com.pinterest.api.remote.AccountApi.LoginParams loginparams = new com.pinterest.api.remote.AccountApi.LoginParams();
        loginparams.b = s;
        loginparams.e = s1;
        StopWatch.get().start("login_email");
        try
        {
            AccountApi.a(loginparams, onLogin);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StopWatch.get().invalidate("login_email");
        }
        PLog.error(s, "cannot login", new Object[0]);
    }

    private void init()
    {
        EditTextListener edittextlistener;
        if (StringUtils.isEmpty(lastEmailInput))
        {
            try
            {
                String s = Device.getDefaultEmailAddress();
                if (StringUtils.isNotEmpty(s))
                {
                    lastEmailInput = s;
                }
            }
            catch (Exception exception) { }
        }
        LayoutInflater.from(getContext()).inflate(0x7f030076, this, true);
        _messageContainer = findViewById(0x7f0f0172);
        _emailEt = (PEditText)findViewById(0x7f0f0174);
        edittextlistener = new EditTextListener(_emailEt, null);
        _emailEt.setOnFocusChangeListener(edittextlistener);
        _emailEt.setText(lastEmailInput);
        _emailEt.setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR);
        _emailEt.setClearEnabled(true);
        _passwordEt = (PEditText)findViewById(0x7f0f0175);
        edittextlistener = new EditTextListener(_passwordEt, null);
        _passwordEt.setOnFocusChangeListener(edittextlistener);
        _passwordEt.setText(lastPasswordInput);
        _passwordEt.setOnKeyListener(onKeyListener);
        _passwordEt.setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.REGULAR);
        _loginBt = findViewById(0x7f0f0177);
        _loginBt.setOnClickListener(this);
        _facebookBt = findViewById(0x7f0f007b);
        if (_facebookBt != null)
        {
            _facebookBt.setOnClickListener(this);
        }
        _gplusBt = (Button)findViewById(0x7f0f011d);
        if (_gplusBt != null)
        {
            if (!GooglePlayServices.isAvailable())
            {
                _gplusBt.setVisibility(8);
            } else
            {
                _gplusBt.setOnClickListener(this);
            }
        }
        _twitterBt = findViewById(0x7f0f007c);
        _twitterBt.setOnClickListener(this);
        _rakutenBt = findViewById(0x7f0f0178);
        if (_rakutenBt != null)
        {
            _rakutenBt.setOnClickListener(this);
        }
        _forgotPassword = findViewById(0x7f0f0176);
        _forgotPassword.setOnClickListener(this);
        updateFocus();
    }

    private void onLoginFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (ApiResponse.ACCOUNT_FAILURE.contains(Integer.valueOf(apiresponse.getCode())) && SignupFormUtils.isEmailValid(lastEmailInput))
        {
            try
            {
                EmailCheckResponseHandler emailcheckresponsehandler = new EmailCheckResponseHandler(apiresponse);
                AccountApi.b(lastEmailInput, emailcheckresponsehandler);
                return;
            }
            catch (Exception exception)
            {
                CrashReporting.a(exception);
            }
        }
        lastPasswordInput = "";
        Events.post(new DialogEvent(new LoginFailureDialog(throwable, apiresponse)));
    }

    private void onLoginSuccess()
    {
        MyUserApi.a(onLoadMe, null);
        lastPasswordInput = "";
    }

    private void showEmailSuggestionDialog(final String suggestedEmail)
    {
        BaseDialog basedialog = new BaseDialog();
        basedialog.setTitle(0x7f07004d);
        basedialog.setMessage(Resources.string(0x7f07034f, new Object[] {
            suggestedEmail
        }));
        basedialog.setPositiveButton(0x7f070590, new _cls3());
        basedialog.setNegativeButton(0x7f0705a1, new _cls4());
        Events.post(new DialogEvent(basedialog));
    }

    private void showLoginRetryDialog(String s)
    {
        BaseDialog basedialog = new BaseDialog();
        basedialog.setTitle(0x7f07004d);
        basedialog.setMessage(s);
        basedialog.setPositiveButton(0x7f0705a1, new _cls5());
        basedialog.setNegativeButton(0x7f0702f1, new _cls6());
        Events.post(new DialogEvent(basedialog));
    }

    private void tryLogin()
    {
        if (_emailEt == null || _passwordEt == null)
        {
            return;
        }
        String s = _emailEt.getText().toString();
        String s1 = _passwordEt.getText().toString();
        if (StringUtils.isEmpty(s))
        {
            _emailEt.setBackgroundResource(0x7f020219);
            _emailEt.requestFocus();
            _emailEt.setSelection(s.length());
            Application.showToast(0x7f07034e);
            return;
        }
        if (StringUtils.isEmpty(s1))
        {
            _passwordEt.setBackgroundResource(0x7f020219);
            _passwordEt.requestFocus();
            _passwordEt.setSelection(s1.length());
            Application.showToast(0x7f070352);
            return;
        } else
        {
            Device.hideSoftKeyboard(_emailEt);
            Device.hideSoftKeyboard(_passwordEt);
            doLogin(s, s1);
            return;
        }
    }

    private void updateFocus()
    {
        Object obj = null;
        if (_emailEt == null || !StringUtils.isEmpty(lastEmailInput)) goto _L2; else goto _L1
_L1:
        PEditText pedittext;
        _emailEt.requestFocus();
        pedittext = _emailEt;
_L4:
        if (pedittext != null)
        {
            Device.showSoftKeyboard(pedittext);
        }
        return;
_L2:
        pedittext = obj;
        if (_passwordEt != null)
        {
            pedittext = obj;
            if (StringUtils.isEmpty(lastPasswordInput))
            {
                _passwordEt.requestFocus();
                pedittext = _passwordEt;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void doLoginFromMultiStep(String s, String s1)
    {
        doLogin(s, s1);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131689595: 
            Pinalytics.a(ElementType.FACEBOOK_CONNECT);
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
            return;

        case 2131689757: 
            Pinalytics.a(ElementType.GPLUS_CONNECT);
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.GPLUS));
            return;

        case 2131689596: 
            Pinalytics.a(ElementType.TWITTER_CONNECT);
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.TWITTER));
            return;

        case 2131689848: 
            Pinalytics.a(ElementType.RAKUTEN_CONNECT);
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.RAKUTEN));
            return;

        case 2131689847: 
            Pinalytics.a(ElementType.LOGIN_BUTTON);
            tryLogin();
            return;

        case 2131689846: 
            Pinalytics.a(ElementType.RESET_BUTTON);
            view = _emailEt.getText().toString();
            break;
        }
        if (SignupFormUtils.isEmailValid(view))
        {
            Events.post(new DialogEvent(new ResetPasswordDialog(view)));
            return;
        }
        if (Experiments.F())
        {
            ActivityHelper.goWebView(getContext(), Uri.parse(Resources.string(0x7f070748)), Resources.string(0x7f0704b9), true);
            return;
        } else
        {
            Events.post(new DialogEvent(new LoginForgotPasswordDialog()));
            return;
        }
    }

    public void tryAutoLogin()
    {
        Bundle bundle;
        if (_dialog != null)
        {
            if ((bundle = _dialog.getBundle()) != null)
            {
                doLogin(bundle.getString("com.pinterest.EXTRA_USER_NAME"), bundle.getString("com.pinterest.EXTRA_PASSWORD"));
                return;
            }
        }
    }









    private class _cls1
        implements android.view.View.OnKeyListener
    {

        final LoginDialogView this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (keyevent.getAction() == 0 && i == 66)
            {
                _loginBt.performClick();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = LoginDialogView.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.AccountApi.LoginApiResponse
    {

        final LoginDialogView this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            StopWatch.get().invalidate("login_email");
            Events.post(new DialogEvent(null));
            onLoginFailure(throwable, apiresponse);
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onTokenSaved()
        {
            onLoginSuccess();
        }

        _cls2()
        {
            this$0 = LoginDialogView.this;
            super();
        }
    }


    private class _cls7 extends com.pinterest.api.remote.MyUserApi.MyUserApiResponse
    {

        final LoginDialogView this$0;

        public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
        {
            StopWatch.get().invalidate("login_email");
            Events.post(new DialogEvent(new LoginDialog()));
            if (throwable instanceof IOException)
            {
                Application.showNoInternetToast();
                return;
            }
            if (pinterestjsonobject != null)
            {
                Application.showToast(pinterestjsonobject.a("error", Resources.string(0x7f070350)), 0x7f020173);
                return;
            } else
            {
                Application.showToast(0x7f070350, 0x7f020173);
                return;
            }
        }

        public void onSuccess(User user)
        {
            super.onSuccess(user);
            GlobalDataUpdateReceiver.c();
            PWidgetHelper.notifyWidgetStateChange(Application.context());
            if (_messageContainer.getVisibility() == 0)
            {
                Preferences.user().set("PREF_CONNETING_GPLUS", true);
            }
            Events.post(new DialogEvent(null));
            if (getContext() instanceof Activity)
            {
                user = (Activity)getContext();
                ActivityHelper.goRoot(user);
                user.finish();
            }
        }

        _cls7()
        {
            this$0 = LoginDialogView.this;
            super();
        }
    }


    private class EditTextListener
        implements android.view.View.OnFocusChangeListener
    {

        private EditText _et;
        final LoginDialogView this$0;

        public void onFocusChange(View view, boolean flag)
        {
            boolean flag1 = false;
            if (!flag)
            {
                flag1 = _et.getText().toString().isEmpty();
            }
            view = _et;
            int i;
            if (flag1)
            {
                i = 0x7f020219;
            } else
            {
                i = 0x7f020136;
            }
            view.setBackgroundResource(i);
        }

        private EditTextListener(EditText edittext)
        {
            this$0 = LoginDialogView.this;
            super();
            _et = edittext;
        }

        EditTextListener(EditText edittext, _cls1 _pcls1)
        {
            this(edittext);
        }
    }


    private class EmailCheckResponseHandler extends BaseApiResponseHandler
    {

        private ApiResponse _loginApiResponse;
        final LoginDialogView this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
label0:
            {
                if (apiresponse.getData() instanceof PinterestJsonArray)
                {
                    apiresponse = (PinterestJsonArray)apiresponse.getData();
                    if (apiresponse.a() != 0)
                    {
                        break label0;
                    }
                    showLoginRetryDialog(_loginApiResponse.getMessageDisplay());
                }
                return;
            }
            apiresponse = apiresponse.a(0);
            showEmailSuggestionDialog(apiresponse);
        }

        public EmailCheckResponseHandler(ApiResponse apiresponse)
        {
            this$0 = LoginDialogView.this;
            super();
            _loginApiResponse = apiresponse;
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LoginDialogView this$0;
        final String val$suggestedEmail;

        public void onClick(View view)
        {
            view = new com.pinterest.api.remote.AccountApi.LoginParams();
            view.b = suggestedEmail;
            view.e = LoginDialogView.lastPasswordInput;
            LoginDialogView.lastEmailInput = suggestedEmail;
            try
            {
                AccountApi.a(view, onLogin);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                CrashReporting.a(view);
            }
        }

        _cls3()
        {
            this$0 = LoginDialogView.this;
            suggestedEmail = s;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final LoginDialogView this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(new LoginDialog()));
        }

        _cls4()
        {
            this$0 = LoginDialogView.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final LoginDialogView this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(new LoginDialog()));
        }

        _cls5()
        {
            this$0 = LoginDialogView.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final LoginDialogView this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(new ResetPasswordDialog(LoginDialogView.lastEmailInput)));
        }

        _cls6()
        {
            this$0 = LoginDialogView.this;
            super();
        }
    }

}
