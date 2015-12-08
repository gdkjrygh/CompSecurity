// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.appboy.Appboy;
import com.appboy.Constants;
import com.appboy.support.ValidationUtils;
import com.appboy.ui.support.StringUtils;

public class AppboyFeedbackFragment extends Fragment
{

    private static final String TAG;
    private Button mCancelButton;
    private android.view.View.OnClickListener mCancelListener;
    private EditText mEmailEditText;
    private boolean mErrorMessageShown;
    private FeedbackFinishedListener mFeedbackFinishedListener;
    private CheckBox mIsBugCheckBox;
    private EditText mMessageEditText;
    private int mOriginalSoftInputMode;
    private Button mSendButton;
    private TextWatcher mSendButtonWatcher;
    private android.view.View.OnClickListener mSendListener;

    public AppboyFeedbackFragment()
    {
    }

    private void clearData()
    {
        mEmailEditText.setText("");
        mMessageEditText.setText("");
        mIsBugCheckBox.setChecked(false);
        mErrorMessageShown = false;
        mEmailEditText.setError(null);
        mMessageEditText.setError(null);
    }

    private boolean ensureSendButton()
    {
        return validatedMessage() & validatedEmail();
    }

    private void hideSoftKeyboard()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        fragmentactivity.getWindow().setSoftInputMode(mOriginalSoftInputMode);
        if (fragmentactivity.getCurrentFocus() != null)
        {
            ((InputMethodManager)fragmentactivity.getSystemService("input_method")).hideSoftInputFromWindow(fragmentactivity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    private boolean validatedEmail()
    {
        boolean flag = true;
        boolean flag1;
        if (mEmailEditText.getText() != null && !StringUtils.isNullOrBlank(mEmailEditText.getText().toString()) && ValidationUtils.isValidEmailAddress(mEmailEditText.getText().toString()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (mEmailEditText.getText() == null || !StringUtils.isNullOrBlank(mEmailEditText.getText().toString()))
        {
            flag = false;
        }
        if (flag1)
        {
            mEmailEditText.setError(null);
            return flag1;
        }
        if (flag)
        {
            mEmailEditText.setError(getResources().getString(R.string.com_appboy_feedback_form_empty_email));
            return flag1;
        } else
        {
            mEmailEditText.setError(getResources().getString(R.string.com_appboy_feedback_form_invalid_email));
            return flag1;
        }
    }

    private boolean validatedMessage()
    {
        boolean flag;
        if (mMessageEditText.getText() != null && !StringUtils.isNullOrBlank(mMessageEditText.getText().toString()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            mMessageEditText.setError(null);
            return flag;
        } else
        {
            mMessageEditText.setError(getResources().getString(R.string.com_appboy_feedback_form_invalid_message));
            return flag;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mSendButtonWatcher = new TextWatcher() {

            final AppboyFeedbackFragment this$0;

            public void afterTextChanged(Editable editable)
            {
                if (mErrorMessageShown)
                {
                    ensureSendButton();
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            
            {
                this$0 = AppboyFeedbackFragment.this;
                super();
            }
        };
        mCancelListener = new android.view.View.OnClickListener() {

            final AppboyFeedbackFragment this$0;

            public void onClick(View view)
            {
                hideSoftKeyboard();
                if (mFeedbackFinishedListener != null)
                {
                    mFeedbackFinishedListener.onFeedbackFinished(FeedbackResult.CANCELLED);
                }
                clearData();
            }

            
            {
                this$0 = AppboyFeedbackFragment.this;
                super();
            }

            private class FeedbackResult extends Enum
            {

                private static final FeedbackResult $VALUES[];
                public static final FeedbackResult CANCELLED;
                public static final FeedbackResult ERROR;
                public static final FeedbackResult SENT;

                public static FeedbackResult valueOf(String s)
                {
                    return (FeedbackResult)Enum.valueOf(com/appboy/ui/AppboyFeedbackFragment$FeedbackResult, s);
                }

                public static FeedbackResult[] values()
                {
                    return (FeedbackResult[])$VALUES.clone();
                }

                static 
                {
                    SENT = new FeedbackResult("SENT", 0);
                    CANCELLED = new FeedbackResult("CANCELLED", 1);
                    ERROR = new FeedbackResult("ERROR", 2);
                    $VALUES = (new FeedbackResult[] {
                        SENT, CANCELLED, ERROR
                    });
                }

                private FeedbackResult(String s, int i)
                {
                    super(s, i);
                }
            }


            private class FeedbackFinishedListener
            {

                public abstract String beforeFeedbackSubmitted(String s);

                public abstract void onFeedbackFinished(FeedbackResult feedbackresult);
            }

        };
        mSendListener = new android.view.View.OnClickListener() {

            final AppboyFeedbackFragment this$0;

            public void onClick(View view)
            {
                if (ensureSendButton())
                {
                    hideSoftKeyboard();
                    boolean flag = mIsBugCheckBox.isChecked();
                    String s = mMessageEditText.getText().toString();
                    String s1 = mEmailEditText.getText().toString();
                    view = s;
                    if (mFeedbackFinishedListener != null)
                    {
                        view = mFeedbackFinishedListener.beforeFeedbackSubmitted(s);
                    }
                    flag = Appboy.getInstance(getActivity()).submitFeedback(s1, view, flag);
                    if (mFeedbackFinishedListener != null)
                    {
                        FeedbackFinishedListener feedbackfinishedlistener = mFeedbackFinishedListener;
                        if (flag)
                        {
                            view = FeedbackResult.SENT;
                        } else
                        {
                            view = FeedbackResult.ERROR;
                        }
                        feedbackfinishedlistener.onFeedbackFinished(view);
                    }
                    clearData();
                    return;
                } else
                {
                    mErrorMessageShown = true;
                    return;
                }
            }

            
            {
                this$0 = AppboyFeedbackFragment.this;
                super();
            }
        };
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(R.layout.com_appboy_feedback, viewgroup, false);
        mCancelButton = (Button)layoutinflater.findViewById(R.id.com_appboy_feedback_cancel);
        mSendButton = (Button)layoutinflater.findViewById(R.id.com_appboy_feedback_send);
        mIsBugCheckBox = (CheckBox)layoutinflater.findViewById(R.id.com_appboy_feedback_is_bug);
        mMessageEditText = (EditText)layoutinflater.findViewById(R.id.com_appboy_feedback_message);
        mEmailEditText = (EditText)layoutinflater.findViewById(R.id.com_appboy_feedback_email);
        mMessageEditText.addTextChangedListener(mSendButtonWatcher);
        mEmailEditText.addTextChangedListener(mSendButtonWatcher);
        mCancelButton.setOnClickListener(mCancelListener);
        mSendButton.setOnClickListener(mSendListener);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        mMessageEditText.removeTextChangedListener(mSendButtonWatcher);
        mEmailEditText.removeTextChangedListener(mSendButtonWatcher);
    }

    public void onResume()
    {
        super.onResume();
        Appboy.getInstance(getActivity()).logFeedbackDisplayed();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        Window window = fragmentactivity.getWindow();
        mOriginalSoftInputMode = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
        Appboy.getInstance(fragmentactivity).logFeedbackDisplayed();
    }

    public void setFeedbackFinishedListener(FeedbackFinishedListener feedbackfinishedlistener)
    {
        mFeedbackFinishedListener = feedbackfinishedlistener;
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/AppboyFeedbackFragment.getName()
        });
    }



/*
    static boolean access$002(AppboyFeedbackFragment appboyfeedbackfragment, boolean flag)
    {
        appboyfeedbackfragment.mErrorMessageShown = flag;
        return flag;
    }

*/







}
