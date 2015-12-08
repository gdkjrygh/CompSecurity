// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker;

import java.util.Date;

// Referenced classes of package com.fsr.tracker:
//            PersistedState, TrackerViewPresenter, NotificationService, TrackerEventListener

public interface ITracker
{

    public abstract void abortSurvey();

    public abstract void acceptInvitation();

    public abstract void applicationExited();

    public abstract void applicationLaunched();

    public abstract void checkState();

    public abstract void completeSurvey();

    public abstract void declineInvitation();

    public abstract String getRespondentId();

    public abstract PersistedState getState();

    public abstract TrackerViewPresenter getViewPresenter();

    public abstract void incrementSignificantEventsCountWithKey(String s);

    public abstract void initialize();

    public abstract void initializeWithState(PersistedState persistedstate);

    public abstract void onNetworkDisconnected();

    public abstract void reset();

    public abstract void resetCounters();

    public abstract void setDeclineDate(Date date);

    public abstract void setLaunchDate(Date date);

    public abstract void setNotificationService(NotificationService notificationservice);

    public abstract void setRespondentId(String s);

    public abstract void setTrackerEventListener(TrackerEventListener trackereventlistener);

    public abstract void setViewPresenter(TrackerViewPresenter trackerviewpresenter);

    public abstract void triggerInvitation(String s);

    public abstract void triggerSurvey(String s);
}
