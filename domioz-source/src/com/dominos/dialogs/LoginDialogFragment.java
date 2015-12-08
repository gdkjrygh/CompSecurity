// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.m;
import android.support.v4.app.u;
import android.text.Html;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment_

public class LoginDialogFragment extends m
{

    private static final String LOGIN_DIALOG_TAG = "login_dialog_tag";
    AnalyticsUtil mAnalyticsUtil;
    TextView mCancelText;
    Button mCloseButton;
    TextView mContinueAsGuestText;
    String mFirstName;
    private ProgressDialog mLoadingDialog;
    Button mLoginButton;
    String mMessage;
    TextView mMessageText;
    MobileSession mMobileSession;
    private OnActionListener mOnActionListener;
    private OrderManager mOrderManager;
    EditText mPasswordEntry;
    TextView mPasswordHint;
    private UserProfileManager mProfileManager;
    TextView mResetPasswordText;
    boolean mShowCancel;
    boolean mShowGuest;
    TextView mSignoutText;

    public LoginDialogFragment()
    {
    }

    private void closeSoftKeyboard()
    {
        ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(mPasswordEntry.getWindowToken(), 0);
    }

    private void hideLoading()
    {
        if (mLoadingDialog != null)
        {
            mLoadingDialog.dismiss();
        }
    }

    private void initViews()
    {
        if (StringHelper.isNotEmpty(mFirstName))
        {
            showSignOutView(mFirstName);
        }
        if (StringHelper.isNotEmpty(mMessage))
        {
            mMessageText.setText(mMessage);
        }
        if (mShowGuest)
        {
            showContinueAsGuestView();
        }
        mPasswordEntry.setOnEditorActionListener(new _cls3());
        mResetPasswordText.setOnClickListener(new _cls4());
        mLoginButton.setOnClickListener(new _cls5());
        mPasswordHint.setOnClickListener(new _cls6());
        mCloseButton.setOnClickListener(new _cls7());
        if (mShowCancel)
        {
            mCancelText.setVisibility(0);
            mCancelText.setText(Html.fromHtml(getActivity().getString(0x7f08007b)));
            mCancelText.setOnClickListener(new _cls8());
        }
        if (mShowGuest)
        {
            mContinueAsGuestText.setVisibility(0);
            mContinueAsGuestText.setText(Html.fromHtml(getActivity().getString(0x7f0800c5)));
            mContinueAsGuestText.setOnClickListener(new _cls9());
        }
        populateEmailEntry();
    }

    public static LoginDialogFragment newInstance(String s, String s1, boolean flag, boolean flag1, OnActionListener onactionlistener)
    {
        s = LoginDialogFragment_.builder().mFirstName(s).mMessage(s1).mShowCancel(flag).mShowGuest(flag1).build();
        s.setOnActionListener(onactionlistener);
        return s;
    }

    private void populateEmailEntry()
    {
        String s = mOrderManager.getOrder().getEmail();
        mPasswordEntry.setOnFocusChangeListener(new _cls10());
        if (StringHelper.isNotEmpty(s))
        {
            mPasswordEntry.setFocusable(true);
            mPasswordEntry.requestFocus();
        }
    }

    private void setUserAuthorization()
    {
        if (mProfileManager.getCurrentUser() != null && mPasswordEntry != null && mPasswordEntry.getText() != null)
        {
            UserAuthorization_.getInstance_(getActivity()).setAuthorizationCode(mProfileManager.getCurrentUser().getEmail(), mPasswordEntry.getText().toString());
        }
    }

    private void showSignOutView(String s)
    {
        mSignoutText.setVisibility(0);
        mSignoutText.setText(Html.fromHtml(String.format(getActivity().getString(0x7f0802ad), new Object[] {
            s
        })));
        mSignoutText.setOnClickListener(new _cls2());
    }

    protected void executeLogin(String s)
    {
        if (mProfileManager.getCurrentUser() == null)
        {
            showLoginError();
            dismiss();
            hideLoading();
            return;
        } else
        {
            String s1 = mProfileManager.getCurrentUser().getEmail();
            boolean flag = App.settings().getBoolean("remember-me", false);
            mProfileManager.login(s1, s, flag, new _cls11());
            return;
        }
    }

    protected void handleLoginSuccess()
    {
        hideLoading();
        closeSoftKeyboard();
        setUserAuthorization();
        dismiss();
    }

    protected void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
        setCancelable(true);
    }

    protected void onAfterViews()
    {
        getDialog().setCanceledOnTouchOutside(false);
        initViews();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (mOnActionListener != null)
        {
            mOnActionListener.onCanceled();
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.requestWindowFeature(1);
        bundle.getWindow().setSoftInputMode(16);
        bundle.getWindow().setBackgroundDrawableResource(0x7f0e009e);
        return bundle;
    }

    public void onStart()
    {
        super.onStart();
        mAnalyticsUtil.postLoginDialogLoaded();
    }

    public void setOnActionListener(OnActionListener onactionlistener)
    {
        mOnActionListener = onactionlistener;
    }

    public void show(u u)
    {
        show(u, "login_dialog_tag");
    }

    public void showContinueAsGuestView()
    {
        mContinueAsGuestText.setVisibility(0);
        mContinueAsGuestText.setText(Html.fromHtml(getActivity().getString(0x7f0800c5)));
        mContinueAsGuestText.setOnClickListener(new _cls1());
    }

    protected void showLoading()
    {
        mLoadingDialog = new ProgressDialog(getActivity());
        mLoadingDialog.setMessage(getActivity().getString(0x7f080195));
        mLoadingDialog.show();
    }

    protected void showLoginError()
    {
        Toast.makeText(getActivity(), 0x7f080060, 0).show();
    }

    protected void showLoginFailedAlert()
    {
        hideLoading();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle(getActivity().getString(0x7f08019a)).setMessage(getActivity().getString(0x7f08019b)).setIcon(0x7f020144).setPositiveButton(getActivity().getString(0x7f0801f2), null).create();
        builder.show();
    }





    private class _cls3
        implements android.widget.TextView.OnEditorActionListener
    {

        final LoginDialogFragment this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6)
            {
                showLoading();
                executeLogin(mPasswordEntry.getText().toString());
                return true;
            } else
            {
                return false;
            }
        }

        _cls3()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final LoginDialogFragment this$0;

        public void onClick(View view)
        {
            dismiss();
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
            view = UserChangePassword_.intent(getActivity());
            view.get().putExtra("resetPassword", true);
            view.start();
        }

        _cls4()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final LoginDialogFragment this$0;

        public void onClick(View view)
        {
            showLoading();
            executeLogin(mPasswordEntry.getText().toString());
        }

        _cls5()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final LoginDialogFragment this$0;

        public void onClick(View view)
        {
            mPasswordEntry.requestFocus();
            ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(mPasswordEntry, 1);
        }

        _cls6()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final LoginDialogFragment this$0;

        public void onClick(View view)
        {
            closeSoftKeyboard();
            dismissAllowingStateLoss();
            if (mOnActionListener != null)
            {
                mOnActionListener.onCanceled();
            }
        }

        _cls7()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls8
        implements android.view.View.OnClickListener
    {

        final LoginDialogFragment this$0;

        public void onClick(View view)
        {
            if (mOnActionListener != null)
            {
                mOnActionListener.onCanceled();
            }
        }

        _cls8()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls9
        implements android.view.View.OnClickListener
    {

        final LoginDialogFragment this$0;

        public void onClick(View view)
        {
            mProfileManager.clearCurrentUser();
            if (mOrderManager.getOrder() != null)
            {
                mOrderManager.getOrder().clearPayments();
            }
            if (mOnActionListener != null)
            {
                mOnActionListener.onContinueAsGuest();
            }
            closeSoftKeyboard();
            dismiss();
        }

        _cls9()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls10
        implements android.view.View.OnFocusChangeListener
    {

        final LoginDialogFragment this$0;

        public void onFocusChange(View view, boolean flag)
        {
            if (flag)
            {
                ((InputMethodManager)getActivity().getSystemService("input_method")).toggleSoftInput(2, 1);
            }
        }

        _cls10()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LoginDialogFragment this$0;

        public void onClick(View view)
        {
            mProfileManager.clearCurrentUser();
            if (mOnActionListener != null)
            {
                mOnActionListener.onSignOut();
            }
            closeSoftKeyboard();
            dismiss();
        }

        _cls2()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class _cls11 extends com.dominos.android.sdk.core.user.UserProfileManager.LoginCallback
    {

        final LoginDialogFragment this$0;

        public void onBegin()
        {
            super.onBegin();
            if (getActivity() instanceof BaseActivity)
            {
                ((BaseActivity)getActivity()).blockOrientation();
            }
        }

        public void onFinish()
        {
            super.onFinish();
            if (getActivity() instanceof BaseActivity)
            {
                ((BaseActivity)getActivity()).unblockOrientation();
            }
        }

        public void onLoginError()
        {
            showLoginError();
        }

        public void onLoginFailed()
        {
            showLoginFailedAlert();
        }

        public void onLoginSuccessful()
        {
            handleLoginSuccess();
            mAnalyticsUtil.postLogin(mProfileManager.getCurrentUser().getCustomerId());
            if (mOnActionListener != null)
            {
                mOnActionListener.onLoginSuccess();
            }
        }

        _cls11()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }


    private class OnActionListener
    {

        public abstract void onCanceled();

        public abstract void onContinueAsGuest();

        public abstract void onLoginSuccess();

        public abstract void onSignOut();
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoginDialogFragment this$0;

        public void onClick(View view)
        {
            mProfileManager.clearCurrentUser();
            if (mOrderManager.getOrder() != null)
            {
                mOrderManager.getOrder().clearPayments();
            }
            if (mOnActionListener != null)
            {
                mOnActionListener.onContinueAsGuest();
            }
            closeSoftKeyboard();
            dismiss();
        }

        _cls1()
        {
            this$0 = LoginDialogFragment.this;
            super();
        }
    }

}
