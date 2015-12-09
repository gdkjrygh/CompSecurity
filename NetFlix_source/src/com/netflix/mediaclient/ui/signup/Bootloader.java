// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.signup;

import android.net.Uri;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.logging.client.model.SessionKey;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.NrdpComponent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class Bootloader
{

    private static final String ACTIVE_SESSIONS = "activeSessions";
    private static final String PARAMETER_DEVICE_CATEGORY = "device_cat";
    private static final String PARAMETER_DEVICE_LANGUAGE = "locale";
    private static final String PARAMETER_DEVICE_TYPE = "device_type";
    private static final String PARAMETER_FULL_ESN = "esn";
    private static final String PARAMETER_IS_PRELOADED = "isNetflixPreloaded";
    private static final String PARAMETER_LOG_DATA = "logData";
    private static final String PARAMETER_OS = "os";
    private static final String PARAMETER_SDK_VERSION = "sdk_version";
    private static final String PARAMETER_SOFTWARE_VERSION = "sw_version";
    private static final String SEQUENCE = "sequence";
    private static final String TAG = "SignupActivity";
    private String mUrl;

    Bootloader(ServiceManager servicemanager, String s, String s1, boolean flag)
    {
        if (servicemanager == null)
        {
            throw new IllegalArgumentException("Service Manager can not be null!");
        }
        StringBuilder stringbuilder = new StringBuilder();
        String s2 = Uri.parse(s).getQuery();
        Log.d("SignupActivity", (new StringBuilder()).append("URL queryParam: ").append(s2).toString());
        if (s2 != null)
        {
            stringbuilder.append(s).append('&');
        } else
        {
            stringbuilder.append(s).append("?");
        }
        stringbuilder.append("esn").append('=').append(urlEncode(servicemanager.getESNProvider().getEsn())).append('&');
        stringbuilder.append("device_type").append('=').append(urlEncode(servicemanager.getESNProvider().getESNPrefix())).append('&');
        stringbuilder.append("sdk_version").append('=').append(urlEncode(servicemanager.getNrdpComponentVersion(NrdpComponent.NrdLib))).append('&');
        stringbuilder.append("sw_version").append('=').append(urlEncode(servicemanager.getSoftwareVersion())).append('&');
        stringbuilder.append("os").append('=').append(String.valueOf(AndroidUtils.getAndroidVersion())).append('&');
        stringbuilder.append("device_cat").append('=').append(urlEncode(servicemanager.getDeviceCategory().getValue())).append('&');
        stringbuilder.append("locale").append('=').append(urlEncode(s1)).append('&');
        s1 = stringbuilder.append("isNetflixPreloaded").append('=');
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        s1.append(s).append('&');
        stringbuilder.append("logData").append('=').append(getLogData(servicemanager));
        mUrl = stringbuilder.toString();
    }

    private boolean addSession(SessionKey sessionkey)
    {
        while (sessionkey == null || !"appSession".equals(sessionkey.getName()) && !"userSession".equals(sessionkey.getName())) 
        {
            return false;
        }
        return true;
    }

    private String getLogData(ServiceManager servicemanager)
    {
        String s;
        List list;
        s = "";
        if (servicemanager == null || servicemanager.getClientLogging() == null)
        {
            return "";
        }
        list = servicemanager.getClientLogging().getActiveLoggingSessions();
        if (list == null || list.size() < 1)
        {
            return "";
        }
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonobject.put("activeSessions", jsonarray);
        jsonobject.put("sequence", String.valueOf(servicemanager.getClientLogging().getNextSequence()));
        servicemanager = list.iterator();
        do
        {
            if (!servicemanager.hasNext())
            {
                break;
            }
            SessionKey sessionkey = (SessionKey)servicemanager.next();
            if (addSession(sessionkey))
            {
                jsonarray.put(sessionkey.toJSONArray());
            }
        } while (true);
        try
        {
            servicemanager = jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (ServiceManager servicemanager)
        {
            Log.e("SignupActivity", "Failed to create JSON", servicemanager);
            servicemanager = s;
        }
        while (true) 
        {
            return urlEncode(servicemanager);
        }
    }

    public String getUrl()
    {
        Log.d("SignupActivity", (new StringBuilder()).append("URL : ").append(mUrl).toString());
        return mUrl;
    }

    public String urlEncode(String s)
    {
        if (s == null)
        {
            return "";
        }
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch (Exception exception)
        {
            return s;
        }
        return s1;
    }
}
