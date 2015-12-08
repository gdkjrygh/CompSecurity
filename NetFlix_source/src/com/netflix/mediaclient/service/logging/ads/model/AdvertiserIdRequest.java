// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads.model;

import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AdvertiserIdRequest
{

    protected static final String DATA = "data";
    protected static final String DATA_APP_NAME = "appName";
    protected static final String DATA_DEVICE = "device";
    protected static final String DATA_DEVICE_HEADER = "deviceModelHeader";
    protected static final String DATA_EVENTS = "events";
    protected static final String DATA_EVENT_TYPE = "event_type";
    protected static final String DATA_ID = "advdevtag_id";
    protected static final String DATA_NAME = "name";
    protected static final String DATA_OPTED_FOR_ADS = "ad_tracking_preference";
    protected static final String DATA_OS_VERSION = "os_version";
    protected static final String DATA_TIME = "time";
    protected static final String DATA_TYPE = "advdevtag_type";
    protected static final String DATA_USER_AGENT = "user_agent";
    protected static final String EVENT_NAME = "advdevtag";
    protected static final String VALUE_APP_NAME = "android";
    protected static final String VALUE_OPT_IN = "opt-in";
    protected static final String VALUE_OPT_OUT = "opt-out";
    private String mAdvertiserId;
    private String mDeviceModel;
    private com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType mEventType;
    private boolean mOptedIn;

    public AdvertiserIdRequest(String s, boolean flag, com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType eventtype, String s1)
    {
        mAdvertiserId = s;
        mOptedIn = flag;
        mEventType = eventtype;
        mDeviceModel = s1;
        if (eventtype == null)
        {
            throw new IllegalArgumentException("Event type can not be null!");
        } else
        {
            return;
        }
    }

    private JSONObject getEvent()
        throws JSONException
    {
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("appName", "android");
        jsonobject1.put("time", (new StringBuilder()).append("").append(System.currentTimeMillis()).toString());
        if (mDeviceModel != null)
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject1.put("device", jsonobject);
            jsonobject.put("deviceModelHeader", mDeviceModel);
        }
        Object obj1 = new JSONArray();
        jsonobject1.put("events", obj1);
        Object obj = new JSONObject();
        ((JSONArray) (obj1)).put(obj);
        ((JSONObject) (obj)).put("name", "advdevtag");
        obj1 = new JSONObject();
        ((JSONObject) (obj)).put("data", obj1);
        ((JSONObject) (obj1)).put("advdevtag_type", "android");
        if (mAdvertiserId != null)
        {
            ((JSONObject) (obj1)).put("advdevtag_id", mAdvertiserId);
        }
        if (mOptedIn)
        {
            obj = "opt-in";
        } else
        {
            obj = "opt-out";
        }
        ((JSONObject) (obj1)).put("ad_tracking_preference", obj);
        ((JSONObject) (obj1)).put("event_type", mEventType.name());
        ((JSONObject) (obj1)).put("os_version", android.os.Build.VERSION.RELEASE);
        obj = System.getProperty("http.agent");
        if (StringUtils.isNotEmpty(((String) (obj))))
        {
            ((JSONObject) (obj1)).put("user_agent", obj);
        }
        return jsonobject1;
    }

    public String toJson()
    {
        String s;
        try
        {
            s = getEvent().toString();
        }
        catch (JSONException jsonexception)
        {
            return "{}";
        }
        return s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("AdvertiserIdRequest [mAdvertiserId=").append(mAdvertiserId).append(", mOptedIn=").append(mOptedIn).append("]").toString();
    }
}
