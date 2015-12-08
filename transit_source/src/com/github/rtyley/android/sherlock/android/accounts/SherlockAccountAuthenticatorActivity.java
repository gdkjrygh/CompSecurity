// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.rtyley.android.sherlock.android.accounts;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.os.Bundle;
import com.actionbarsherlock.app.SherlockActivity;

public class SherlockAccountAuthenticatorActivity extends SherlockActivity
{

    private AccountAuthenticatorResponse mAccountAuthenticatorResponse;
    private Bundle mResultBundle;

    public SherlockAccountAuthenticatorActivity()
    {
        mAccountAuthenticatorResponse = null;
        mResultBundle = null;
    }

    public void finish()
    {
        if (mAccountAuthenticatorResponse != null)
        {
            if (mResultBundle != null)
            {
                mAccountAuthenticatorResponse.onResult(mResultBundle);
            } else
            {
                mAccountAuthenticatorResponse.onError(4, "canceled");
            }
            mAccountAuthenticatorResponse = null;
        }
        super.finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mAccountAuthenticatorResponse = (AccountAuthenticatorResponse)getIntent().getParcelableExtra("accountAuthenticatorResponse");
        if (mAccountAuthenticatorResponse != null)
        {
            mAccountAuthenticatorResponse.onRequestContinued();
        }
    }

    public final void setAccountAuthenticatorResult(Bundle bundle)
    {
        mResultBundle = bundle;
    }
}
