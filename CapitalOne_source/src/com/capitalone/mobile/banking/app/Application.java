// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.EnterpriseMobileBanking.AppHelper;
import com.capitalone.mobile.banking.session.SessionManager;
import java.util.Locale;

public class Application extends android.app.Application
{

    private static Context mContext = null;
    private Locale mLocale;
    private SessionManager sessionManager;

    public Application()
    {
        sessionManager = null;
        mLocale = null;
    }

    private Locale getAppLocale()
    {
        if (AppHelper.isCanadianApp())
        {
            if (Locale.getDefault().getLanguage().toLowerCase().equals("fr"))
            {
                return Locale.CANADA_FRENCH;
            } else
            {
                return Locale.CANADA;
            }
        } else
        {
            return Locale.US;
        }
    }

    public static Context getCurrentContext()
    {
        return mContext;
    }

    public SessionManager getSessionManager()
    {
        return sessionManager;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mLocale != null)
        {
            configuration.locale = mLocale;
            Locale.setDefault(configuration.locale);
            getBaseContext().getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        }
    }

    public void onCreate()
    {
        super.onCreate();
        sessionManager = new SessionManager(this);
        mContext = this;
        Configuration configuration = getBaseContext().getResources().getConfiguration();
        Locale locale = getAppLocale();
        if (!configuration.locale.equals(locale))
        {
            mLocale = new Locale(locale.getLanguage(), locale.getCountry());
            Locale.setDefault(mLocale);
            configuration.locale = mLocale;
            getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
        }
    }

}
