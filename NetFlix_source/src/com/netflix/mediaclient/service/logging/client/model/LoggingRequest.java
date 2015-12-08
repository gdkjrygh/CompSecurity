// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.util.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            Version, Device, Event

public class LoggingRequest
{

    public static final String APP_NAME = "appName";
    public static final String DEVICE = "device";
    public static final String EVENTS = "events";
    public static final String LOCALE = "locale";
    public static final String NETFLIX_ID = "netflixId";
    public static final String TIME = "time";
    public static final String VERSION = "version";
    private String appName;
    private Device device;
    private List events;
    private String locale;
    private String netflixId;
    private long time;
    private Version version;

    public LoggingRequest()
    {
        appName = "android";
        time = System.currentTimeMillis();
        events = new ArrayList();
    }

    public LoggingRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface, String s)
    {
        appName = "android";
        time = System.currentTimeMillis();
        events = new ArrayList();
        version = new Version(context);
        device = new Device(configurationagentinterface);
        netflixId = useragentinterface.getUserCredentialRegistry().getNetflixID();
        locale = s;
    }

    public static LoggingRequest createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        jsonobject = null;
_L4:
        return jsonobject;
_L2:
        LoggingRequest loggingrequest = new LoggingRequest();
        loggingrequest.time = JsonUtils.getLong(jsonobject, "time", 0L);
        loggingrequest.netflixId = JsonUtils.getString(jsonobject, "netflixId", null);
        loggingrequest.locale = JsonUtils.getString(jsonobject, "locale", null);
        loggingrequest.version = Version.createInstance(JsonUtils.getJSONObject(jsonobject, "version", null));
        loggingrequest.device = Device.createInstance(JsonUtils.getJSONObject(jsonobject, "device", null));
        JSONArray jsonarray = JsonUtils.getJSONArray(jsonobject, "events");
        jsonobject = loggingrequest;
        if (jsonarray == null)
        {
            continue;
        }
        int i = 0;
        do
        {
            jsonobject = loggingrequest;
            if (i >= jsonarray.length())
            {
                continue;
            }
            jsonobject = Event.createEvent(jsonarray.getJSONObject(i));
            if (jsonobject != null)
            {
                loggingrequest.events.add(jsonobject);
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void addAllEvent(List list)
    {
        events.addAll(list);
    }

    public void addEvent(Event event)
    {
        events.add(event);
    }

    public String getAppName()
    {
        return appName;
    }

    public Device getDevice()
    {
        return device;
    }

    public String getLocale()
    {
        return locale;
    }

    public String getNetflixId()
    {
        return netflixId;
    }

    public long getTime()
    {
        return time;
    }

    public Version getVersion()
    {
        return version;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("appName", appName);
        if (version != null)
        {
            jsonobject.put("version", version.toJSONObject());
        }
        if (device != null)
        {
            jsonobject.put("device", device.toJSONObject());
        }
        jsonobject.put("time", time);
        if (netflixId != null)
        {
            jsonobject.put("netflixId", netflixId);
        }
        if (locale != null)
        {
            jsonobject.put("locale", locale);
        }
        if (events != null)
        {
            JSONArray jsonarray = new JSONArray();
            jsonobject.put("events", jsonarray);
            for (Iterator iterator = events.iterator(); iterator.hasNext(); jsonarray.put(((Event)iterator.next()).toJSONObject())) { }
        }
        return jsonobject;
    }
}
