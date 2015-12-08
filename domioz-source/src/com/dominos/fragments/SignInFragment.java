// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.widget.Button;
import android.widget.TextView;
import com.dominos.android.sdk.common.StringHelper;

// Referenced classes of package com.dominos.fragments:
//            BaseFragment

public class SignInFragment extends BaseFragment
{

    public static final String TAG = com/dominos/fragments/SignInFragment.getSimpleName();
    String mMessage;
    Button mSignInButton;
    private SignInClickListener mSignInClickListener;
    TextView mTextInfo;

    public SignInFragment()
    {
    }

    protected void onAfterViews()
    {
        if (StringHelper.isNotEmpty(mMessage))
        {
            mTextInfo.setText(mMessage);
        }
    }

    protected void onSignInButtonClicked()
    {
        if (mSignInClickListener != null)
        {
            mSignInClickListener.onSignInClicked();
        }
    }

    public void setSignInClickListener(SignInClickListener signinclicklistener)
    {
        mSignInClickListener = signinclicklistener;
    }


    private class SignInClickListener
    {

        public abstract void onSignInClicked();
    }

}
