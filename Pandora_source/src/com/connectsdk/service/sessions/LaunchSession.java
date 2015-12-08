// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service.sessions;

import com.connectsdk.core.JSONDeserializable;
import com.connectsdk.core.JSONSerializable;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.capability.listeners.ResponseListener;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LaunchSession
    implements JSONDeserializable, JSONSerializable
{
    public static final class LaunchSessionType extends Enum
    {

        private static final LaunchSessionType $VALUES[];
        public static final LaunchSessionType App;
        public static final LaunchSessionType ExternalInputPicker;
        public static final LaunchSessionType Media;
        public static final LaunchSessionType Unknown;
        public static final LaunchSessionType WebApp;

        public static LaunchSessionType valueOf(String s)
        {
            return (LaunchSessionType)Enum.valueOf(com/connectsdk/service/sessions/LaunchSession$LaunchSessionType, s);
        }

        public static LaunchSessionType[] values()
        {
            return (LaunchSessionType[])$VALUES.clone();
        }

        static 
        {
            Unknown = new LaunchSessionType("Unknown", 0);
            App = new LaunchSessionType("App", 1);
            ExternalInputPicker = new LaunchSessionType("ExternalInputPicker", 2);
            Media = new LaunchSessionType("Media", 3);
            WebApp = new LaunchSessionType("WebApp", 4);
            $VALUES = (new LaunchSessionType[] {
                Unknown, App, ExternalInputPicker, Media, WebApp
            });
        }

        private LaunchSessionType(String s, int i)
        {
            super(s, i);
        }
    }


    protected String appId;
    protected String appName;
    protected Object rawData;
    protected DeviceService service;
    protected String sessionId;
    protected LaunchSessionType sessionType;

    public LaunchSession()
    {
    }

    public static LaunchSession launchSessionForAppId(String s)
    {
        LaunchSession launchsession = new LaunchSession();
        launchsession.appId = s;
        return launchsession;
    }

    public static LaunchSession launchSessionFromJSONObject(JSONObject jsonobject)
    {
        LaunchSession launchsession = new LaunchSession();
        try
        {
            launchsession.fromJSONObject(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return launchsession;
        }
        return launchsession;
    }

    public void close(ResponseListener responselistener)
    {
        service.closeLaunchSession(this, responselistener);
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public void fromJSONObject(JSONObject jsonobject)
        throws JSONException
    {
        appId = jsonobject.optString("appId");
        sessionId = jsonobject.optString("sessionId");
        appName = jsonobject.optString("name");
        sessionType = LaunchSessionType.valueOf(jsonobject.optString("sessionType"));
        rawData = jsonobject.opt("rawData");
    }

    public String getAppId()
    {
        return appId;
    }

    public String getAppName()
    {
        return appName;
    }

    public Object getRawData()
    {
        return rawData;
    }

    public DeviceService getService()
    {
        return service;
    }

    public String getSessionId()
    {
        return sessionId;
    }

    public LaunchSessionType getSessionType()
    {
        return sessionType;
    }

    public void setAppId(String s)
    {
        appId = s;
    }

    public void setAppName(String s)
    {
        appName = s;
    }

    public void setRawData(Object obj)
    {
        rawData = obj;
    }

    public void setService(DeviceService deviceservice)
    {
        service = deviceservice;
    }

    public void setSessionId(String s)
    {
        sessionId = s;
    }

    public void setSessionType(LaunchSessionType launchsessiontype)
    {
        sessionType = launchsessiontype;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.putOpt("appId", appId);
        jsonobject.putOpt("sessionId", sessionId);
        jsonobject.putOpt("name", appName);
        jsonobject.putOpt("sessionType", sessionType.name());
        if (service != null)
        {
            jsonobject.putOpt("serviceName", service.getServiceName());
        }
        if (rawData != null)
        {
            if (rawData instanceof JSONObject)
            {
                jsonobject.putOpt("rawData", rawData);
            }
            if (rawData instanceof List)
            {
                JSONArray jsonarray = new JSONArray();
                for (Iterator iterator = ((List)rawData).iterator(); iterator.hasNext(); jsonarray.put(iterator.next())) { }
                jsonobject.putOpt("rawData", jsonarray);
            }
            if (rawData instanceof Object[])
            {
                JSONArray jsonarray1 = new JSONArray();
                Object aobj[] = (Object[])(Object[])rawData;
                int j = aobj.length;
                for (int i = 0; i < j; i++)
                {
                    jsonarray1.put(aobj[i]);
                }

                jsonobject.putOpt("rawData", jsonarray1);
            }
            if (rawData instanceof String)
            {
                jsonobject.putOpt("rawData", rawData);
            }
        }
        return jsonobject;
    }
}
