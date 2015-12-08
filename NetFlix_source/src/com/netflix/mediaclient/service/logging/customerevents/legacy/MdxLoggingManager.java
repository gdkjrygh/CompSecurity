// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.logging.LoggingAgent;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import java.io.IOException;
import org.apache.http.HttpException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.customerevents.legacy:
//            MdxCustomerEvent

public class MdxLoggingManager
{

    private static final String EVENT485_NAME = "MDX Controller Start Playback";
    private static final String EVENT526_NAME = "MDX Target";
    private static final String EVENT537_NAME = "MDX Target Manager Action";
    private static final String EVENT_DATAFIELD_APPCONTEXT = "appContext";
    private static final String EVENT_DATAFIELD_APP_VERSION = "app_version";
    private static final String EVENT_DATAFIELD_CATALOGID = "catalogId";
    private static final String EVENT_DATAFIELD_COUNTRY = "country";
    private static final String EVENT_DATAFIELD_DEVICENAME = "deviceName";
    private static final String EVENT_DATAFIELD_DEVICE_CAT = "device_cat";
    private static final String EVENT_DATAFIELD_DEVICE_TYPE = "device_type";
    private static final String EVENT_DATAFIELD_DIALUUID = "dialUuid";
    private static final String EVENT_DATAFIELD_EPISODEID = "episodeId";
    private static final String EVENT_DATAFIELD_ESN = "esn";
    private static final String EVENT_DATAFIELD_EVENTTYPE = "eventType";
    private static final String EVENT_DATAFIELD_GEOLOCATION_COUNTRY = "geolocation_country";
    private static final String EVENT_DATAFIELD_LANGUAGES = "languages";
    private static final String EVENT_DATAFIELD_OS_VERSION = "os_version";
    private static final String EVENT_DATAFIELD_PLAYBACKFROM = "location";
    private static final String EVENT_DATAFIELD_SERVICETYPE = "serviceType";
    private static final String EVENT_DATAFIELD_TARGETUUID = "targetUuid";
    private static final String EVENT_DATAFIELD_TIMESTAMP = "timestamp";
    private static final String EVENT_DATAFIELD_UI_VERSION = "ui_version";
    private static final String EVENT_DATA_APPCONTEXT = "home";
    private static final String EVENT_DATA_DEVICENAME = "Android";
    private static final String EVENT_FIELD_DATA = "data";
    private static final String EVENT_FIELD_ESN = "Esn";
    private static final String EVENT_FIELD_EVENTNAME = "EventName";
    private static final String EVENT_FIELD_EVENTTIME = "EventTime";
    private static final String EVENT_FIELD_TRACKID = "TrackId";
    private static final String TAG = "nf_mdxMdxLoggingManager";
    private Handler mHandler;
    private LoggingAgent mOwner;

    public MdxLoggingManager(Handler handler, LoggingAgent loggingagent)
    {
        mHandler = handler;
        mOwner = loggingagent;
    }

    private void buildEventAndSend(JSONObject jsonobject, JSONObject jsonobject1, String s, String s1)
    {
        try
        {
            jsonobject.putOpt("Esn", mOwner.getConfigurationAgent().getEsnProvider().getEsn()).putOpt("EventTime", Long.valueOf(System.currentTimeMillis())).putOpt("data", jsonobject1);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("buildEventAndSend fail ").append(jsonobject).toString());
            return;
        }
        jsonobject1 = new JSONArray();
        jsonobject1.put(jsonobject);
        jsonobject = jsonobject1.toString();
        Log.d("nf_mdxMdxLoggingManager", (new StringBuilder()).append("buildEventAndSend plaintext data: ").append(jsonobject).toString());
        jsonobject1 = new AuthorizationCredentials(s, s1);
        sendEvent(new MdxCustomerEvent(mOwner.getConfigurationAgent().getEsnProvider().getEsn(), jsonobject1, jsonobject));
    }

    private JSONObject getCommonEventData(com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface)
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        if (useragentinterface == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        jsonobject.putOpt("languages", useragentinterface.getLanguagesInCsv()).putOpt("geolocation_country", useragentinterface.getGeoCountry()).putOpt("country", useragentinterface.getReqCountry());
        jsonobject.putOpt("timestamp", Long.valueOf(System.currentTimeMillis())).putOpt("ui_version", mOwner.getConfigurationAgent().getSoftwareVersion()).putOpt("app_version", mOwner.getConfigurationAgent().getSoftwareVersion()).putOpt("device_cat", mOwner.getConfigurationAgent().getDeviceCategory().name()).putOpt("os_version", (new StringBuilder()).append("Android ").append(android.os.Build.VERSION.RELEASE).toString()).putOpt("device_type", mOwner.getConfigurationAgent().getEsnProvider().getESNPrefix());
        return jsonobject;
        useragentinterface;
        Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("getCommonEventData failed ").append(useragentinterface).toString());
        return jsonobject;
    }

    private void sendEvent(final MdxCustomerEvent cevent)
    {
        mHandler.post(new Runnable() {

            final MdxLoggingManager this$0;
            final MdxCustomerEvent val$cevent;

            public void run()
            {
                try
                {
                    cevent.execute();
                    return;
                }
                catch (IOException ioexception)
                {
                    Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("sendEvent IOException ").append(ioexception).toString());
                    return;
                }
                catch (JSONException jsonexception)
                {
                    Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("sendEvent JSONException ").append(jsonexception).toString());
                    return;
                }
                catch (HttpException httpexception)
                {
                    Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("sendEvent HttpException ").append(httpexception).toString());
                }
            }

            
            {
                this$0 = MdxLoggingManager.this;
                cevent = mdxcustomerevent;
                super();
            }
        });
    }

    public void logPlaybackStart(String s, String s1, String s2, int i, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface)
    {
        if (useragentinterface == null)
        {
            Log.e("nf_mdxMdxLoggingManager", "userAgent is null");
            return;
        }
        JSONObject jsonobject = getCommonEventData(useragentinterface);
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject.putOpt("deviceName", "Android").putOpt("catalogId", s).putOpt("appContext", "home").putOpt("esn", mOwner.getConfigurationAgent().getEsnProvider().getEsn()).putOpt("episodeId", s1).putOpt("location", s2);
            jsonobject1.putOpt("EventName", "MDX Controller Start Playback").putOpt("TrackId", Integer.valueOf(i));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("logPlaybackStart fail ").append(s).toString());
            return;
        }
        buildEventAndSend(jsonobject1, jsonobject, useragentinterface.getUserCredentialRegistry().getNetflixID(), useragentinterface.getUserCredentialRegistry().getSecureNetflixID());
    }

    public void logTarget(String s, String s1, String s2, String s3, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface)
    {
        if (useragentinterface == null)
        {
            Log.e("nf_mdxMdxLoggingManager", "userAgent is null");
            return;
        }
        JSONObject jsonobject = getCommonEventData(useragentinterface);
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject.putOpt("deviceName", "Android").putOpt("targetUuid", s1).putOpt("serviceType", s3).putOpt("eventType", s).putOpt("dialUuid", s2);
            jsonobject1.putOpt("EventName", "MDX Target");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("logTarget fail ").append(s).toString());
            return;
        }
        buildEventAndSend(jsonobject1, jsonobject, useragentinterface.getUserCredentialRegistry().getNetflixID(), useragentinterface.getUserCredentialRegistry().getSecureNetflixID());
    }

    public void logTargetSelection(String s, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface)
    {
        if (useragentinterface == null)
        {
            Log.e("nf_mdxMdxLoggingManager", "userAgent is null");
            return;
        }
        JSONObject jsonobject = getCommonEventData(useragentinterface);
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject.putOpt("eventType", s);
            jsonobject1.putOpt("EventName", "MDX Target Manager Action");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_mdxMdxLoggingManager", (new StringBuilder()).append("logTargetSelection fail ").append(s).toString());
            return;
        }
        buildEventAndSend(jsonobject1, jsonobject, useragentinterface.getUserCredentialRegistry().getNetflixID(), useragentinterface.getUserCredentialRegistry().getSecureNetflixID());
    }

    void setContext()
    {
    }
}
