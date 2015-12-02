// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.auth.login.c;
import com.facebook.auth.login.m;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.ab;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.text.CustomUrlLikeSpan;

// Referenced classes of package com.facebook.orca.login:
//            p, r, s, t, 
//            q, u

public class WildfireRegSmsCodeViewGroup extends m
    implements p
{

    public static final String LOGO1_RESOURCE = "orca:authparam:logo1";
    public static final String LOGO2_RESOURCE = "orca:authparam:logo2";
    private static final Class TAG = com/facebook/orca/login/WildfireRegSmsCodeViewGroup;
    private final InputMethodManager mInputMethodManager = (InputMethodManager)getInjector().a(android/view/inputmethod/InputMethodManager);
    private final Button mNextButton;
    private final ab mProgressIndicator;
    private final Drawable mSmsCodeErrorIcon;
    private final TextView mSmsCodePrompt;
    private final EditText mSmsCodeText;
    private final Button mTryAgainButton;

    public WildfireRegSmsCodeViewGroup(Context context, q q1)
    {
        super(context, q1);
        setContentView(k.orca_wildfire_reg_sms_code);
        mSmsCodePrompt = (TextView)getView(i.sms_code_prompt);
        mSmsCodeText = (EditText)getView(i.sms_code);
        mSmsCodeErrorIcon = getResources().getDrawable(h.orca_field_error_icon);
        mTryAgainButton = (Button)getView(i.try_again);
        mNextButton = (Button)getView(i.next);
        mProgressIndicator = new aa(getContext(), o.wildfire_reg_verification_progress);
        mTryAgainButton.setOnClickListener(new r(this));
        mNextButton.setOnClickListener(new s(this));
        mSmsCodeText.setOnEditorActionListener(new com.facebook.orca.login.t(this));
        context = (ImageView)getView(i.name_logo1);
        q1 = (ImageView)getView(i.name_logo2);
        int j = getResource("orca:authparam:logo1", 0);
        int l = getResource("orca:authparam:logo2", 0);
        if (j != 0)
        {
            context.setImageResource(j);
        }
        if (l != 0)
        {
            q1.setImageResource(l);
        }
    }

    public static Bundle createParameterBundle(int j, int l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("orca:authparam:logo1", j);
        bundle.putInt("orca:authparam:logo2", l);
        return bundle;
    }

    private Rect getDrawableBoundsForEditText(EditText edittext, Drawable drawable)
    {
        return new Rect(0, 0, edittext.getHeight() - edittext.getPaddingTop() - edittext.getPaddingBottom(), edittext.getHeight() - edittext.getPaddingTop() - edittext.getPaddingBottom());
    }

    private void onNextClick()
    {
        String s1 = mSmsCodeText.getText().toString();
        if (s1.length() <= 0)
        {
            return;
        } else
        {
            mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            ((q)control).a(s1);
            return;
        }
    }

    private void onTryAgainClick()
    {
        mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        ((q)control).a(new aa(getContext(), o.wildfire_reg_request_sms_progress));
    }

    public void beginShowingProgress()
    {
        mProgressIndicator.a();
    }

    public void hideSmsCodeError()
    {
        mSmsCodeText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    public void setSmsCode(String s1, boolean flag)
    {
        if (s1 != null && (flag || mSmsCodeText.getText().toString().length() == 0))
        {
            b.c(TAG, "Pre-filling confirmation code field and submitting it.");
            mSmsCodeText.setText(s1);
            onNextClick();
            return;
        } else
        {
            b.d(TAG, "Not pre-filling confirmation code field!");
            return;
        }
    }

    public void setSmsCodePrompt(String s1)
    {
        CustomUrlLikeSpan customurllikespan = new CustomUrlLikeSpan();
        customurllikespan.a(new u(this));
        Resources resources = getResources();
        com.facebook.common.w.o o1 = new com.facebook.common.w.o(resources);
        o1.a(s1);
        o1.a("[[edit_phone_link]]", resources.getString(o.wildfire_reg_edit_phone_number), customurllikespan, 33);
        mSmsCodePrompt.setText(o1.b());
        mSmsCodePrompt.setMovementMethod(LinkMovementMethod.getInstance());
        mSmsCodePrompt.setSaveEnabled(false);
    }

    public void setSmsCodePromptResource(int j)
    {
        setSmsCodePrompt(getResources().getString(j));
    }

    public void showSmsCodeError()
    {
        mSmsCodeErrorIcon.setBounds(getDrawableBoundsForEditText(mSmsCodeText, mSmsCodeErrorIcon));
        mSmsCodeText.setCompoundDrawables(null, null, mSmsCodeErrorIcon, null);
    }

    public void stopShowingProgress()
    {
        mProgressIndicator.b();
    }




}
