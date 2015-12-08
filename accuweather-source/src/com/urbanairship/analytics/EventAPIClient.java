// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.http.Request;
import com.urbanairship.http.RequestFactory;
import com.urbanairship.push.PushManager;
import com.urbanairship.util.Device;
import com.urbanairship.util.Network;
import com.urbanairship.util.UAStringUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.analytics:
//            EventResponse

class EventAPIClient
{

    private RequestFactory requestFactory;

    EventAPIClient()
    {
        this(new RequestFactory());
    }

    EventAPIClient(RequestFactory requestfactory)
    {
        requestFactory = requestfactory;
    }

    public EventResponse sendEvents(Collection collection)
    {
        Object obj;
        String s1;
        if (collection == null || collection.size() == 0)
        {
            Logger.info("Send failed. No events.");
            return null;
        }
        if (!Network.isConnected())
        {
            Logger.info("No network connectivity available. Postponing analytics event updates.");
            return null;
        }
        obj = new JSONArray();
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            try
            {
                ((JSONArray) (obj)).put(new JSONObject(s));
            }
            catch (JSONException jsonexception)
            {
                Logger.error((new StringBuilder()).append("Invalid eventPayload: ").append(jsonexception).toString());
            }
        }

        s1 = ((JSONArray) (obj)).toString();
        obj = null;
        URL url = new URL((new StringBuilder()).append(UAirship.shared().getAirshipConfigOptions().analyticsServer).append("warp9/").toString());
        obj = url;
_L1:
        double d;
        Object obj1;
        AirshipConfigOptions airshipconfigoptions;
        boolean flag;
        if (UAirship.shared().getPlatformType() == 1)
        {
            obj1 = "amazon";
        } else
        {
            obj1 = "android";
        }
        d = (double)System.currentTimeMillis() / 1000D;
        airshipconfigoptions = UAirship.shared().getAirshipConfigOptions();
        obj = requestFactory.createRequest("POST", ((URL) (obj))).setRequestBody(s1, "application/json").setCompressRequestBody(true).setHeader("X-UA-Device-Family", ((String) (obj1))).setHeader("X-UA-Sent-At", String.format(Locale.US, "%.3f", new Object[] {
            Double.valueOf(d)
        })).setHeader("X-UA-Package-Name", UAirship.getPackageName()).setHeader("X-UA-Package-Version", UAirship.getPackageInfo().versionName).setHeader("X-UA-Device-ID", Device.getHashedDeviceId()).setHeader("X-UA-App-Key", airshipconfigoptions.getAppKey()).setHeader("X-UA-In-Production", Boolean.toString(airshipconfigoptions.inProduction)).setHeader("X-UA-Device-Model", Build.MODEL).setHeader("X-UA-OS-Version", android.os.Build.VERSION.RELEASE).setHeader("X-UA-Lib-Version", UAirship.getVersion()).setHeader("X-UA-Timezone", TimeZone.getDefault().getID()).setHeader("X-UA-Channel-Opted-In", Boolean.toString(UAirship.shared().getPushManager().isOptIn()));
        if (UAirship.shared().getPushManager().isPushEnabled() && UAirship.shared().getPushManager().isPushAvailable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((Request) (obj)).setHeader("X-UA-Channel-Background-Enabled", Boolean.toString(flag));
        obj1 = Locale.getDefault();
        if (!UAStringUtil.isEmpty(((Locale) (obj1)).getLanguage()))
        {
            ((Request) (obj)).setHeader("X-UA-Locale-Language", ((Locale) (obj1)).getLanguage());
            if (!UAStringUtil.isEmpty(((Locale) (obj1)).getCountry()))
            {
                ((Request) (obj)).setHeader("X-UA-Locale-Country", ((Locale) (obj1)).getCountry());
            }
            if (!UAStringUtil.isEmpty(((Locale) (obj1)).getVariant()))
            {
                ((Request) (obj)).setHeader("X-UA-Locale-Variant", ((Locale) (obj1)).getVariant());
            }
        }
        obj1 = UAirship.shared().getPushManager().getChannelId();
        if (!UAStringUtil.isEmpty(((String) (obj1))))
        {
            ((Request) (obj)).setHeader("X-UA-Channel-ID", ((String) (obj1)));
            ((Request) (obj)).setHeader("X-UA-Push-Address", ((String) (obj1)));
        }
        Logger.debug((new StringBuilder()).append("Sending analytic events. Request:  ").append(obj.toString()).append(" Events: ").append(collection).toString());
        collection = ((Request) (obj)).execute();
        if (collection == null)
        {
            return null;
        } else
        {
            return new EventResponse(collection);
        }
        obj1;
        Logger.error((new StringBuilder()).append("Invalid analyticsServer: ").append(obj1).toString());
          goto _L1
    }
}
