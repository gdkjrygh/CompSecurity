// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.support.multidex.a;
import android.widget.Toast;
import com.dominos.analytics.TealiumHelper_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.app.DominosApplication;
import com.dominos.android.sdk.common.DeviceCapabilities;
import com.dominos.android.sdk.common.DeviceCapabilities_;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.user.UserService;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.news.analytics.PushAnalyticsProcessor_;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.nina.speech.SpeechManager_;
import java.util.Locale;

// Referenced classes of package com.dominos:
//            MobileSession_

public class App extends DominosApplication
{

    public static final String CARRYOUT_ADDRESS = "carryoutAddress";
    public static final String DELIVERY_ADDRESS = "deliveryAddress";
    public static final String DELIVERY_ADDRESS_TYPE = "deliveryAddressType";
    public static final String DELIVERY_APT_NUM = "deliveryAptNum";
    public static final String DELIVERY_CITY = "deliveryCity";
    public static final String DELIVERY_CITYREGION = "deliveryCityRegion";
    public static final String DELIVERY_INSTRUCTIONS = "deliveryInstructions";
    public static final String DELIVERY_MODE = "deliveryMode";
    public static final String DELIVERY_ORGANIZATION_NAME = "deliveryOrganizationName";
    public static final String DELIVERY_STATE = "deliveryState";
    public static final String DELIVERY_STREET = "deliveryStreet";
    public static final String DELIVERY_ZIP = "deliveryZip";
    public static final String FIRST_TIME_USER = "firstTimeUser";
    public static final String FIRST_TIME_VOICE_INTRO = "firstTimeVoiceIntro";
    public static final String LOG_TAG = "Dominos";
    private static final String NONE = "none";
    public static final String OAUTH_JWT = "ANDROID_OAUTH_JWT";
    public static final String ORDER_MODE = "orderMode";
    public static final String REMEMBER_ME_KEY = "remember-me";
    public static final Locale US_LOCALE = new Locale("en", "US");
    public static boolean easterEggs = false;
    private static android.content.SharedPreferences.Editor editor;
    private static App instance;
    private static SharedPreferences settings;
    public ApplicationEventBus bus;
    DominosPrefs_ prefs;
    UserService user;

    public App()
    {
    }

    public static void displayErrorToast(String s, Context context)
    {
        s = Toast.makeText(context, s, 1);
        s.setGravity(17, 0, 0);
        s.show();
    }

    public static void displayWarningToast(String s, Context context)
    {
        s = Toast.makeText(context, s, 0);
        s.setGravity(17, 0, 0);
        s.show();
    }

    public static android.content.SharedPreferences.Editor editor()
    {
        if (editor != null)
        {
            return editor;
        }
        if (settings != null)
        {
            editor = settings.edit();
        } else
        {
            settings();
            editor = settings.edit();
        }
        return editor;
    }

    public static App getInstance()
    {
        if (instance == null)
        {
            throw new RuntimeException("Application instance is null");
        } else
        {
            return instance;
        }
    }

    public static boolean isDebugMode()
    {
        return isDebuggable();
    }

    public static boolean isRemembered()
    {
        String s = getInstance().getRememberMeCookie();
        return !settings().getString("currentCustomerId", "none").equals("none") && s != null;
    }

    public static SharedPreferences settings()
    {
        if (settings == null)
        {
            settings = getInstance().prefs.getSharedPreferences();
        }
        return settings;
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        a.a(this);
    }

    public String getLangSetting()
    {
        return Locale.getDefault().getLanguage();
    }

    public String getRememberMeCookie()
    {
        return obtainPersistentCookie("rememberMeCookieValue");
    }

    public boolean isFirstTime()
    {
        String s = settings().getString("carryoutAddress", "none");
        String s1 = settings().getString("deliveryAddress", "none");
        return s.equals("none") && s1.equals("none") && !settings().contains("remember-me");
    }

    public boolean isSpeechEnabled()
    {
        Context context = getBaseContext();
        DeviceCapabilities_ devicecapabilities_ = DeviceCapabilities_.getInstance_(context);
        return ((ConfigurationManager)MobileSession_.getInstance_(context).getManager("configuration_manager")).getApplicationConfiguration().isSpeechEnabled() && devicecapabilities_.hasSpeechCapabilities();
    }

    public String obtainPersistentCookie(String s)
    {
        s = settings().getString(s, null);
        if (StringHelper.isNotEmpty(s))
        {
            return s;
        } else
        {
            return null;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (!"en".equals(configuration.locale.getLanguage()))
        {
            SpeechManager_.getInstance_(getBaseContext()).removeSpeechManager();
        }
    }

    public void onCreate()
    {
        super.onCreate();
        instance = this;
        bus.register(this);
        TealiumHelper_.getInstance_(this);
        PushAnalyticsProcessor_.getInstance_(this);
        user.isFirstTime = isFirstTime();
    }

    public void onTerminate()
    {
        super.onTerminate();
    }

}
