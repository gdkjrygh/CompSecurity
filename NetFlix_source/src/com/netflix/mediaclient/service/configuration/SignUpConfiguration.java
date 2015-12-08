// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.PreferenceUtils;

public final class SignUpConfiguration
{

    public static final Boolean DEFAULT_SIGNUP_ENABLED;
    public static final long SIGNUP_TIMEOUT_MS = 40000L;
    private static final String TAG = "nf_service_configuration_signuppref";
    private static final String mSignUpBootloader = SecurityRepository.getBootloaderUrl();
    private boolean mIsSignUpEnabled;
    private long mSignUpTimeout;

    public SignUpConfiguration(Context context)
    {
        mIsSignUpEnabled = PreferenceUtils.getBooleanPref(context, "signup_enabled", DEFAULT_SIGNUP_ENABLED.booleanValue());
        mSignUpTimeout = PreferenceUtils.getLongPref(context, "signup_timeout", 40000L);
        Log.d("nf_service_configuration_signuppref", (new StringBuilder()).append("SignUpConfiguration Enabled: ").append(mIsSignUpEnabled).append(" timeout: ").append(mSignUpTimeout).toString());
    }

    public static void clearRecords(Context context)
    {
        PreferenceUtils.removePref(context, "signup_enabled");
        PreferenceUtils.removePref(context, "signup_timeout");
    }

    public String getSignUpBootloader()
    {
        return mSignUpBootloader;
    }

    public long getSignUpTimeout()
    {
        return mSignUpTimeout;
    }

    public boolean isSignEnabled()
    {
        return mIsSignUpEnabled;
    }

    public void setIsSignEnabled(boolean flag)
    {
        mIsSignUpEnabled = flag;
    }

    public void setSignUpTimeout(long l)
    {
        mSignUpTimeout = l;
    }

    public void update(Context context, String s, String s1)
    {
        if (s != null)
        {
            mIsSignUpEnabled = Boolean.parseBoolean(s);
            PreferenceUtils.putBooleanPref(context, "signup_enabled", mIsSignUpEnabled);
        } else
        {
            mIsSignUpEnabled = DEFAULT_SIGNUP_ENABLED.booleanValue();
            PreferenceUtils.removePref(context, "signup_enabled");
        }
        if (s1 != null)
        {
            mSignUpTimeout = Long.parseLong(s1);
            PreferenceUtils.putLongPref(context, "signup_timeout", mSignUpTimeout);
        } else
        {
            mSignUpTimeout = 40000L;
            PreferenceUtils.removePref(context, "signup_timeout");
        }
        Log.d("nf_service_configuration_signuppref", (new StringBuilder()).append("SignUp parameters overriden SignUpEnabled: ").append(s).append(" timeout:").append(s1).toString());
    }

    static 
    {
        boolean flag;
        if (AndroidUtils.getAndroidVersion() > 8)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        DEFAULT_SIGNUP_ENABLED = Boolean.valueOf(flag);
    }
}
