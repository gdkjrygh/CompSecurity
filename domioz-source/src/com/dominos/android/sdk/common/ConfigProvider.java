// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import com.dominos.android.sdk.app.ApplicationService;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.data.sharedpref.ApplicationConfigurationPreferences_;
import org.androidannotations.api.c.p;

// Referenced classes of package com.dominos.android.sdk.common:
//            StringHelper

public class ConfigProvider
{

    public static final String DEFAULT_CONFIGURATION_ROOT_URL = "http://cache.dominos.com/";
    public static final String DEFAULT_CREDIT_CARD_EXPIRED = "none";
    public static final String DEFAULT_CREDIT_CARD_NOT_ACCEPTED = "none";
    public static final String DEFAULT_DOMINOS_SERVER = "https://order.dominos.com/";
    public static final String NUANCE_PROD_SERVER = "nina2-dominos.nod-glb.nuance.com";
    public static final String PRODUCTION = "PRODUCTION";
    public static final String SANDBOX = "SANDBOX";
    public static final String STRICT_SANDBOX = "STRICT_SANDBOX";
    ApplicationService mApplicationService;
    ApplicationConfigurationPreferences_ mConfigPrefs;
    ConfigurationManager mConfigurationManager;

    public ConfigProvider()
    {
    }

    public String getConfigRootUrl()
    {
        String s = "http://cache.dominos.com/";
        if (mApplicationService.isDebugMode())
        {
            String s1 = mConfigPrefs.configURL().a("http://cache.dominos.com/");
            s = s1;
            if (!mConfigPrefs.configURL().a())
            {
                mConfigPrefs.configURL().b("http://cache.dominos.com/");
                s = s1;
            }
        }
        return s;
    }

    public String getCreditCardsExpired()
    {
        String s = "none";
        if (mApplicationService.isDebugMode())
        {
            String s1 = mConfigPrefs.creditCardsExpired().a("none");
            s = s1;
            if (!mConfigPrefs.creditCardsExpired().a())
            {
                mConfigPrefs.creditCardsExpired().b("none");
                s = s1;
            }
        }
        return s;
    }

    public String getCreditCardsNotTakenByStores()
    {
        String s = "none";
        if (mApplicationService.isDebugMode())
        {
            String s1 = mConfigPrefs.creditCardsNotTakenByStores().a("none");
            s = s1;
            if (!mConfigPrefs.creditCardsNotTakenByStores().a())
            {
                mConfigPrefs.creditCardsNotTakenByStores().b("none");
                s = s1;
            }
        }
        return s;
    }

    public int getGoogleWalletEnvironment()
    {
        int i = 0;
        if (!mApplicationService.isDebugMode()) goto _L2; else goto _L1
_L1:
        String s;
        byte byte0;
        s = mConfigPrefs.googleWalletEnvironment().a("SANDBOX");
        if (!mConfigPrefs.googleWalletEnvironment().a())
        {
            mConfigPrefs.googleWalletEnvironment().b("SANDBOX");
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 92
    //                   -2056856391: 138
    //                   -1711584601: 124
    //                   641493809: 152;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0;
        JVM INSTR tableswitch 0 2: default 120
    //                   0 122
    //                   1 166
    //                   2 168;
           goto _L2 _L7 _L8 _L9
_L2:
        i = 1;
_L7:
        return i;
_L5:
        if (s.equals("SANDBOX"))
        {
            byte0 = 0;
        }
          goto _L3
_L4:
        if (s.equals("PRODUCTION"))
        {
            byte0 = 1;
        }
          goto _L3
_L6:
        if (s.equals("STRICT_SANDBOX"))
        {
            byte0 = 2;
        }
          goto _L3
_L8:
        return 1;
_L9:
        return 2;
    }

    public String getPowerURL()
    {
        String s = "https://order.dominos.com/";
        if (mApplicationService.isDebugMode())
        {
            String s1 = mConfigPrefs.powerURL().a("https://order.dominos.com/");
            s = s1;
            if (!mConfigPrefs.powerURL().a())
            {
                mConfigPrefs.powerURL().b("https://order.dominos.com/");
                s = s1;
            }
        }
        return s;
    }

    public boolean isNuanceProductionServer()
    {
        if (mApplicationService.isDebugMode() && mConfigPrefs.nuanceGateway().a())
        {
            return StringHelper.equals("nina2-dominos.nod-glb.nuance.com", (String)mConfigPrefs.nuanceGateway().c());
        } else
        {
            return true;
        }
    }
}
