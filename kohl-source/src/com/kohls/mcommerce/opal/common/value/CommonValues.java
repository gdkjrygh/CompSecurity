// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.common.value;

import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.ConfigurationUtils;
import com.kohls.mcommerce.opal.common.util.Logger;

public class CommonValues
{

    private static CommonValues instance;
    private int mAccessTokenExpiryTimeout;
    private boolean mEnableAnalytics;
    private boolean mEnableBugSense;
    private boolean mEnableDigby;
    private boolean mEnableForseeFeedback;
    private int mIdleTimeout;
    private String mKohlsPasscode;
    private boolean mMFPNotificationEnabled;
    private int mSigninTimeout;

    private CommonValues()
    {
        try
        {
            mAccessTokenExpiryTimeout = 1800;
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            Logger.debug(numberformatexception.getMessage(), numberformatexception.getMessage());
        }
    }

    public static CommonValues getInstance()
    {
        if (instance == null)
        {
            instance = new CommonValues();
        }
        return instance;
    }

    public int getAccesstokenExpiry()
    {
        return mAccessTokenExpiryTimeout;
    }

    public int getIdleTimeOut()
    {
        return mIdleTimeout;
    }

    public String getKohlsPasscode()
    {
        return mKohlsPasscode;
    }

    public int getSignInTimeOut()
    {
        return mSigninTimeout;
    }

    public boolean isEnableAnalytics()
    {
        return mEnableAnalytics;
    }

    public boolean isEnableBugSense()
    {
        if (Boolean.valueOf(KohlsPhoneApplication.getInstance().getConfigurationUtils().getConfig().getIsBugsense()).booleanValue())
        {
            return true;
        } else
        {
            return mEnableBugSense;
        }
    }

    public boolean isEnableDigby()
    {
        return mEnableDigby;
    }

    public boolean isEnableForseeFeedback()
    {
        return mEnableForseeFeedback;
    }

    public boolean isMFPNotificationEnabled()
    {
        return mMFPNotificationEnabled;
    }

    public void setAccesstokenExpiry(int i)
    {
        mAccessTokenExpiryTimeout = i;
    }

    public void setEnableAnalytics(boolean flag)
    {
        mEnableAnalytics = flag;
    }

    public void setEnableBugSense(boolean flag)
    {
        mEnableBugSense = flag;
    }

    public void setEnableDigby(boolean flag)
    {
        mEnableDigby = flag;
    }

    public void setEnableForseeFeedback(boolean flag)
    {
        mEnableForseeFeedback = flag;
    }

    public void setIdleTimeOut(int i)
    {
        mIdleTimeout = i;
    }

    public void setKohlsPasscode(String s)
    {
        mKohlsPasscode = s;
    }

    public void setMFPNotificationEnabled(boolean flag)
    {
        mMFPNotificationEnabled = flag;
    }

    public void setSignInTimeOut(int i)
    {
        mSigninTimeout = i;
    }
}
