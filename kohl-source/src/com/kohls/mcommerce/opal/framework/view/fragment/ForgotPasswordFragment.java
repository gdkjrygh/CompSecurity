// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.impl.ForgotPasswordControllerImpl;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.fragment:
//            BaseFragment

public class ForgotPasswordFragment extends BaseFragment
{
    public static interface PasswordChangedListener
    {

        public abstract void onPasswordChanged();
    }


    private final android.widget.TextView.OnEditorActionListener mEditActionListener = new _cls1();
    private EditText mEmailEditText;
    private TextView mEmailEditTextError;
    private TextView mErrorTextView;
    private ForgotPasswordControllerImpl mRecoverPasswordController;
    private Button mSendButton;
    private PasswordChangedListener passwordChangedListener;

    public ForgotPasswordFragment()
    {
    }

    public void done(View view)
    {
    }

    protected void initializeAttributes()
    {
    }

    protected void initializeController()
    {
        mRecoverPasswordController = new ForgotPasswordControllerImpl(new WeakReference(this));
    }

    protected void initializeViews(Bundle bundle)
    {
        mErrorTextView = (TextView)getActivity().findViewById(0x7f0d0265);
        mEmailEditText = (EditText)getActivity().findViewById(0x7f0d0266);
        mEmailEditTextError = (TextView)getActivity().findViewById(0x7f0d0267);
        mSendButton = (Button)getActivity().findViewById(0x7f0d0268);
        mRecoverPasswordController = new ForgotPasswordControllerImpl(new WeakReference(this));
    /* block-local class not found */
    class EditTextWatcher {}

        bundle = new EditTextWatcher(null);
        mEmailEditText.addTextChangedListener(bundle);
        mEmailEditText.setOnEditorActionListener(mEditActionListener);
        mSendButton.setEnabled(false);
        mSendButton.setOnClickListener(this);
    }

    protected int intializaLayoutId()
    {
        return 0x7f03006c;
    }

    protected void loadContent()
    {
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131559016: 
            recoverPassword();
            break;
        }
    }

    public void recoverPassword()
    {
        mErrorTextView.setVisibility(8);
        setErrorTextViewVisibility(8);
        String s = mEmailEditText.getText().toString();
        if (mRecoverPasswordController.isInputFieldsValidated(s))
        {
            Bundle bundle = new Bundle();
            bundle.putString("key_email", s);
            mRecoverPasswordController.submitRecoverPassword(bundle);
            UtilityMethods.hideKeyboard(getActivity(), mSendButton);
        }
    }

    public void setErrorTextViewVisibility(int i)
    {
        mEmailEditTextError.setVisibility(i);
    }

    public void setOnPasswordChangedListener(PasswordChangedListener passwordchangedlistener)
    {
        passwordChangedListener = passwordchangedlistener;
    }

    public void showError(String s)
    {
        ToastUtility.showCustomToast(getActivity().getActionBar().getHeight(), s);
    }

    public void showErrorMessageLine(String s)
    {
        mEmailEditTextError.setText(s);
    }

    public void showSuccessLayout(String s)
    {
        TextView textview = (TextView)getActivity().findViewById(0x7f0d026a);
        Object obj = getActivity().getResources();
        SpannableString spannablestring = new SpannableString(((Resources) (obj)).getString(0x7f08055f).trim());
        spannablestring.setSpan(new ForegroundColorSpan(((Resources) (obj)).getColor(0x7f0c0000)), 0, spannablestring.length(), 33);
        textview.append(spannablestring);
        s = new SpannableString((new StringBuilder()).append(" [").append(s).append("]. ").toString());
        s.setSpan(new ForegroundColorSpan(((Resources) (obj)).getColor(0x7f0c0000)), 0, s.length(), 33);
        s.setSpan(new StyleSpan(1), 0, s.length(), 33);
        textview.append(s);
        s = new SpannableString(((Resources) (obj)).getString(0x7f08057a));
        s.setSpan(new ForegroundColorSpan(((Resources) (obj)).getColor(0x7f0c0000)), 0, s.length(), 33);
        textview.append(s);
        s = (TextView)getActivity().findViewById(0x7f0d026b);
        obj = UtilityMethods.getColorSpanable("(855)564-5705", ((Resources) (obj)).getColor(0x7f0c0040));
    /* block-local class not found */
    class MyClickableSpan {}

        ((Spannable) (obj)).setSpan(new MyClickableSpan("(855)564-5705"), 0, "(855)564-5705".length(), 33);
        s.append(((CharSequence) (obj)));
        s.setMovementMethod(LinkMovementMethod.getInstance());
        s.append(".");
        getActivity().findViewById(0x7f0d0264).setVisibility(8);
        getActivity().findViewById(0x7f0d0269).setVisibility(0);
        if (passwordChangedListener != null)
        {
            passwordChangedListener.onPasswordChanged();
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }



    /* member class not found */
    class _cls1 {}

}
