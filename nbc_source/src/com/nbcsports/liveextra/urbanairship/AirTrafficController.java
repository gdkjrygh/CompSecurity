// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.urbanairship;

import android.app.Application;
import android.content.SharedPreferences;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushPreferences;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.urbanairship:
//            IntentReceiver, Constants, AirshipConfig

public class AirTrafficController
{

    private final Application application;
    private final SharedPreferences preferences;

    public AirTrafficController(Application application1, SharedPreferences sharedpreferences)
    {
        application = application1;
        preferences = sharedpreferences;
    }

    private void init(AirshipConfigOptions airshipconfigoptions)
    {
        UAirship.takeOff(application, airshipconfigoptions);
        PushManager.shared().setIntentReceiver(com/nbcsports/liveextra/urbanairship/IntentReceiver);
        airshipconfigoptions = (new PushPreferences()).getDeviceId();
        Timber.d((new StringBuilder()).append("Device Id ").append(airshipconfigoptions).toString(), new Object[0]);
    }

    private void optIn()
    {
        if (!preferences.getString("PREFS_ALERTS_DEFAULT_OPT_IN", "false").equals("true"))
        {
            preferences.edit().putString("PREFS_ALERTS_DEFAULT_OPT_IN", "true").commit();
            PushManager.enablePush();
            PushManager.shared().setTags(Constants.TAGS);
            PushManager.shared().updateApidIfNecessary();
        }
    }

    public void takeOff()
    {
        AirshipConfigOptions airshipconfigoptions = AirshipConfig.load(application);
        if (airshipconfigoptions == null)
        {
            return;
        } else
        {
            init(airshipconfigoptions);
            optIn();
            return;
        }
    }
}
