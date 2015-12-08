// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm.model;

import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.SessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.util.JsonUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm.model:
//            Display

public final class UIStartupSessionEndedEvent extends SessionEndedEvent
{

    public static final String ACTIVE_AB_TESTS = "activeABTests";
    public static final String DESTIONATION_VIEW = "destinationView";
    public static final String DISPLAY = "display";
    public static final String ERROR = "error";
    public static final String SEARCH_TERM = "searchTerm";
    public static final String SUCCESS = "success";
    public static final String TRACK_ID = "trackId";
    public static final String TRIGGER = "trigger";
    private static final String UI_STARTUP_SESSION_NAME = "uiStartup";
    public static final String VOICE_ENABLED = "voiceEnabled";
    private Map activeABTests;
    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView destinationView;
    private Display display;
    private UIError error;
    private String searchTerm;
    private boolean success;
    private String trackId;
    private com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger trigger;
    private boolean voiceEnabled;

    public UIStartupSessionEndedEvent(long l, com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger uistartuptrigger, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, boolean flag)
    {
        super("uiStartup", new DeviceUniqueId(), l);
        success = true;
        if (uistartuptrigger == null)
        {
            throw new IllegalArgumentException("Trigger is null!");
        }
        trigger = uistartuptrigger;
        if (modalview == null)
        {
            throw new IllegalArgumentException("Destination is null!");
        } else
        {
            destinationView = modalview;
            success = flag;
            return;
        }
    }

    public UIStartupSessionEndedEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        success = true;
        jsonobject = JsonUtils.getJSONObject(jsonobject, "data", null);
        if (jsonobject != null)
        {
            String s = JsonUtils.getString(jsonobject, "trigger", null);
            if (s != null)
            {
                trigger = com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger.valueOf(s);
            }
            s = JsonUtils.getString(jsonobject, "destinationView", null);
            if (s != null)
            {
                destinationView = com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(s);
            }
            display = Display.createInstance(jsonobject.getJSONObject("display"));
            success = JsonUtils.getBoolean(jsonobject, "success", true);
            voiceEnabled = JsonUtils.getBoolean(jsonobject, "voiceEnabled", false);
            error = UIError.createInstance(JsonUtils.getJSONObject(jsonobject, "error", null));
            trackId = JsonUtils.getString(jsonobject, "trackId", null);
            searchTerm = JsonUtils.getString(jsonobject, "searchTerm", null);
            jsonobject = JsonUtils.getJSONObject(jsonobject, "activeABTests", null);
            if (jsonobject != null)
            {
                activeABTests = new HashMap();
                String s1;
                for (jsonobject = jsonobject.keys(); jsonobject.hasNext(); activeABTests.put(s1, activeABTests.get(s1)))
                {
                    s1 = (String)jsonobject.next();
                }

            }
        }
    }

    public Map getActiveABTests()
    {
        return activeABTests;
    }

    protected JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject1 = super.getData();
        JSONObject jsonobject = jsonobject1;
        if (jsonobject1 == null)
        {
            jsonobject = new JSONObject();
        }
        jsonobject.put("trigger", trigger.name());
        jsonobject.put("destinationView", destinationView.name());
        jsonobject.put("success", success);
        jsonobject.put("voiceEnabled", voiceEnabled);
        if (display != null)
        {
            jsonobject.put("display", display.toJSONObject());
        }
        if (error != null)
        {
            jsonobject.put("error", error.toJSONObject());
        }
        if (trackId != null)
        {
            jsonobject.put("trackId", trackId);
        }
        if (searchTerm != null)
        {
            jsonobject.put("searchTerm", searchTerm);
        }
        if (activeABTests != null)
        {
            JSONObject jsonobject2 = new JSONObject();
            jsonobject.put("activeABTests", jsonobject2);
            String s;
            for (Iterator iterator = activeABTests.keySet().iterator(); iterator.hasNext(); jsonobject2.put(s, (Integer)activeABTests.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        return jsonobject;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getDestinationView()
    {
        return destinationView;
    }

    public Display getDisplay()
    {
        return display;
    }

    public UIError getError()
    {
        return error;
    }

    public String getSearchTerm()
    {
        return searchTerm;
    }

    public String getTrackId()
    {
        return trackId;
    }

    public com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger getTrigger()
    {
        return trigger;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public boolean isVoiceEnabled()
    {
        return voiceEnabled;
    }

    public void setActiveABTests(Map map)
    {
        activeABTests = map;
    }

    public void setDestinationView(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        destinationView = modalview;
    }

    public void setDisplay(Display display1)
    {
        display = display1;
    }

    public void setError(UIError uierror)
    {
        error = uierror;
    }

    public void setSearchTerm(String s)
    {
        searchTerm = s;
    }

    public void setSuccess(boolean flag)
    {
        success = flag;
    }

    public void setTrackId(String s)
    {
        trackId = s;
    }

    public void setTrigger(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger uistartuptrigger)
    {
        trigger = uistartuptrigger;
    }

    public void setVoiceEnabled(boolean flag)
    {
        voiceEnabled = flag;
    }
}
