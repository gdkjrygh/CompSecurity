// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.urbanairship.analytics:
//            Environment, Analytics

public class DefaultEnvironment extends Environment
{

    String conversionSendId;
    String lastSendId;
    String sessionId;

    public DefaultEnvironment()
    {
        conversionSendId = UAirship.shared().getAnalytics().getConversionSendId();
        sessionId = UAirship.shared().getAnalytics().getSessionId();
        lastSendId = UAirship.shared().getPushManager().getLastReceivedSendId();
    }

    public String getCarrier()
    {
        return ((TelephonyManager)UAirship.getApplicationContext().getSystemService("phone")).getNetworkOperatorName();
    }

    public String getChannelId()
    {
        return UAirship.shared().getPushManager().getChannelId();
    }

    public String getConnectionSubType()
    {
        Object obj = (ConnectivityManager)UAirship.getApplicationContext().getSystemService("connectivity");
        if (obj != null)
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
            if (obj != null)
            {
                return ((NetworkInfo) (obj)).getSubtypeName();
            }
        }
        return "";
    }

    public String getConnectionType()
    {
        byte byte0 = -1;
        Object obj = (ConnectivityManager)UAirship.getApplicationContext().getSystemService("connectivity");
        int i = byte0;
        if (obj != null)
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
            i = byte0;
            if (obj != null)
            {
                i = ((NetworkInfo) (obj)).getType();
            }
        }
        switch (i)
        {
        default:
            return "none";

        case 0: // '\0'
            return "cell";

        case 1: // '\001'
            return "wifi";

        case 6: // '\006'
            return "wimax";
        }
    }

    public String getConversionSendId()
    {
        return conversionSendId;
    }

    public String getLastSendId()
    {
        return lastSendId;
    }

    public String getLibVersion()
    {
        return UAirship.getVersion();
    }

    public ArrayList getNotificationTypes()
    {
        ArrayList arraylist = new ArrayList();
        PushManager pushmanager = UAirship.shared().getPushManager();
        if (pushmanager.isPushEnabled())
        {
            if (pushmanager.isSoundEnabled())
            {
                arraylist.add("sound");
            }
            if (pushmanager.isVibrateEnabled())
            {
                arraylist.add("vibrate");
            }
        }
        return arraylist;
    }

    public String getOsVersion()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public String getPackageVersion()
    {
        return UAirship.getPackageInfo().versionName;
    }

    public Date[] getQuietTimeInterval()
    {
        return UAirship.shared().getPushManager().getQuietTimeInterval();
    }

    public String getSessionId()
    {
        return sessionId;
    }

    public long getTimezone()
    {
        return (long)(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000);
    }

    public boolean isAppInForeground()
    {
        return UAirship.shared().getAnalytics().isAppInForeground();
    }

    public boolean isDaylightSavingsTime()
    {
        return Calendar.getInstance().getTimeZone().inDaylightTime(new Date());
    }

    public boolean isPushEnabled()
    {
        return UAirship.shared().getPushManager().isPushEnabled();
    }

    public boolean isQuietTimeEnabled()
    {
        return UAirship.shared().getPushManager().isQuietTimeEnabled();
    }
}
