// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.apm;

import com.netflix.mediaclient.service.logging.apm.model.Display;
import com.netflix.mediaclient.service.logging.apm.model.UIStartupSessionEndedEvent;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.logging.apm:
//            BaseApmSession

public final class UIStartupSession extends BaseApmSession
{

    public static final String NAME = "uiStartup";
    private Map mActiveABTests;
    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView mDestination;
    private Display mDisplay;
    private String mSearchTerm;
    private int mTrackId;
    private com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger mTrigger;

    public UIStartupSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger uistartuptrigger, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, int i, String s, Map map, Display display)
    {
        mTrigger = uistartuptrigger;
        mDestination = modalview;
        mTrackId = i;
        mSearchTerm = s;
        mActiveABTests = map;
        mDisplay = display;
    }

    public UIStartupSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger uistartuptrigger, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview, Display display)
    {
        mTrigger = uistartuptrigger;
        mDestination = modalview;
        mDisplay = display;
    }

    public UIStartupSessionEndedEvent createEndedEvent(boolean flag, UIError uierror)
    {
        UIStartupSessionEndedEvent uistartupsessionendedevent = new UIStartupSessionEndedEvent(System.currentTimeMillis() - mStarted, mTrigger, mDestination, flag);
        uistartupsessionendedevent.setCategory(getCategory());
        uistartupsessionendedevent.setTrackId((new StringBuilder()).append("").append(mTrackId).toString());
        uistartupsessionendedevent.setActiveABTests(mActiveABTests);
        uistartupsessionendedevent.setSearchTerm(mSearchTerm);
        uistartupsessionendedevent.setError(uierror);
        uistartupsessionendedevent.setDisplay(mDisplay);
        return uistartupsessionendedevent;
    }

    public Map getActiveABTests()
    {
        return mActiveABTests;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getDestination()
    {
        return mDestination;
    }

    public String getName()
    {
        return "uiStartup";
    }

    public String getSearchTerm()
    {
        return mSearchTerm;
    }

    public int getTrackId()
    {
        return mTrackId;
    }

    public com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger getTrigger()
    {
        return mTrigger;
    }

    public void setActiveABTests(Map map)
    {
        mActiveABTests = map;
    }

    public void setDestination(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        mDestination = modalview;
    }

    public void setSearchTerm(String s)
    {
        mSearchTerm = s;
    }

    public void setTrackId(int i)
    {
        mTrackId = i;
    }

    public void setTrigger(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger uistartuptrigger)
    {
        mTrigger = uistartuptrigger;
    }
}
