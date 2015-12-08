// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.Context;
import android.os.Vibrator;
import com.skype.android.config.FileUtil;
import com.skype.android.util.Charsets;
import com.skype.android.util.DeviceFeatures;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Properties;

// Referenced classes of package com.skype.android.app.settings:
//            UserPreferences

public class PropertyConverter
{

    private static final String DEFAULT_MODE_ZERO = "0";
    private static final String F = "false";
    private static final String T = "true";
    private static final String _acceptedEmergencyCallTerms = "acceptedEmergencyCallTerms";
    private static final String _addressBookSearch = "addressBookSearch";
    private static final String _addressBookShowedContactSync = "addressBookShowedContactSync";
    private static final String _addressBookSyncMode = "addressBookSyncMode";
    private static final String _callForwarding = "callForwarding";
    private static final String _firstLoginTimestamp = "firstLoginTimestamp";
    private static final String _firstTime = "firstTime";
    private static final String _interceptCalls = "interceptCalls";
    private static final String _lastContactFilter = "lastContactFilter";
    private static final String _lastEventFilter = "lastEventFilter";
    private static final String _newMessageNotification = "newMessageNotification";
    private static final String _notificationLight = "notificationLight";
    private static final String _notificationSound = "notificationSound";
    private static final String _notificationVibrate = "notificationVibrate";
    private static final String _notificationsEnabled = "notificationsEnabled";
    private static final String _ringtoneMode = "ringtoneMode";
    private static final String _showAreYouSureOnExternalCalls = "showAreYouSureOnExternalCalls";
    private static final String _showTechnicalInfoMenu = "showTechnicalInfoMenu";
    private static final String _showed3GCostDialog = "showed3GCostDialog";
    private static final String _systemNotificationEnabled = "systemNotificationEnabled";
    private static final String _userWantsAutoAnswer = "userWantsAutoAnswer";
    private static final String _viewedFeatureTour = "viewedFeatureTour";

    public PropertyConverter()
    {
    }

    public static void userPropertiesToPreferences(UserPreferences userpreferences, String s, Context context)
    {
        boolean flag1 = false;
        s = (new StringBuilder()).append(s).append(".prop").toString();
        Properties properties = new Properties();
        boolean flag;
        try
        {
            properties.load(new ByteArrayInputStream(FileUtil.load(context, s).getBytes(Charsets.a)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            userpreferences.putBoolean(0x7f080546, true);
            return;
        }
        userpreferences.putBoolean(0x7f080527, Boolean.parseBoolean(properties.getProperty("addressBookSearch")));
        userpreferences.putBoolean(0x7f080554, Boolean.parseBoolean(properties.getProperty("showed3GCostDialog", "true")));
        if (((Vibrator)context.getSystemService("vibrator")).hasVibrator() && Boolean.parseBoolean(properties.getProperty("notificationVibrate", "true")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        userpreferences.putBoolean(0x7f08053d, flag);
        flag = flag1;
        if (DeviceFeatures.a())
        {
            flag = flag1;
            if (Boolean.parseBoolean(properties.getProperty("notificationLight", "true")))
            {
                flag = true;
            }
        }
        userpreferences.putBoolean(0x7f080539, flag);
        userpreferences.putBoolean(0x7f08053c, Boolean.parseBoolean(properties.getProperty("notificationSound", "true")));
        userpreferences.putBoolean(0x7f080516, Boolean.parseBoolean(properties.getProperty("acceptedEmergencyCallTerms", "false")));
        userpreferences.putBoolean(0x7f080556, Boolean.parseBoolean(properties.getProperty("systemNotificationEnabled", "true")));
        userpreferences.putBoolean(0x7f080538, Boolean.parseBoolean(properties.getProperty("newMessageNotification", "true")));
        userpreferences.putBoolean(0x7f080528, Boolean.parseBoolean(properties.getProperty("addressBookShowedContactSync", "false")));
        userpreferences.putInt(0x7f080535, Integer.parseInt(properties.getProperty("lastContactFilter", "0")));
        userpreferences.putBoolean(0x7f080533, Boolean.parseBoolean(properties.getProperty("interceptCalls", "true")));
        userpreferences.putInt(0x7f080549, Integer.parseInt(properties.getProperty("ringtoneMode", "0")));
        userpreferences.putBoolean(0x7f08053e, Boolean.parseBoolean(properties.getProperty("notificationsEnabled", "true")));
        userpreferences.putBoolean(0x7f08055a, Boolean.parseBoolean(properties.getProperty("userWantsAutoAnswer", "false")));
        userpreferences.putBoolean(0x7f08055c, Boolean.parseBoolean(properties.getProperty("viewedFeatureTour", "false")));
        userpreferences.putBoolean(0x7f08051d, Boolean.parseBoolean(properties.getProperty("callForwarding", "false")));
        userpreferences.putInt(0x7f080536, Integer.parseInt(properties.getProperty("lastEventFilter", "0")));
        userpreferences.putBoolean(0x7f080553, Boolean.parseBoolean(properties.getProperty("showTechnicalInfoMenu", "false")));
        userpreferences.putBoolean(0x7f080530, Boolean.parseBoolean(properties.getProperty("firstTime", "true")));
        userpreferences.putBoolean(0x7f080552, Boolean.parseBoolean(properties.getProperty("showAreYouSureOnExternalCalls", "true")));
        userpreferences.putLong(0x7f08052f, Long.parseLong(properties.getProperty("firstLoginTimestamp", String.valueOf(System.currentTimeMillis()))));
        if (Integer.parseInt(properties.getProperty("addressBookSyncMode", "0")) == 2)
        {
            userpreferences.putString(0x7f080529, "0");
        } else
        {
            userpreferences.putString(0x7f080529, "1");
        }
        userpreferences.putBoolean(0x7f080546, true);
    }
}
