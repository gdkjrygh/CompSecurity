// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;


// Referenced classes of package com.addlive.service.listener:
//            ConnectionLostEvent, DeviceListChangedEvent, MediaConnTypeChangedEvent, MediaIssueEvent, 
//            MediaStatsEvent, UserStateChangedEvent, MessageEvent, MicActivityEvent, 
//            MicGainEvent, SessionReconnectedEvent, SpeechActivityEvent, SubscribersCountChangedEvent, 
//            VideoFrameSizeChangedEvent

public interface AddLiveServiceListener
{

    public abstract void onConnectionLost(ConnectionLostEvent connectionlostevent);

    public abstract void onDeviceListChanged(DeviceListChangedEvent devicelistchangedevent);

    public abstract void onMediaConnTypeChanged(MediaConnTypeChangedEvent mediaconntypechangedevent);

    public abstract void onMediaIssue(MediaIssueEvent mediaissueevent);

    public abstract void onMediaStats(MediaStatsEvent mediastatsevent);

    public abstract void onMediaStreamEvent(UserStateChangedEvent userstatechangedevent);

    public abstract void onMessage(MessageEvent messageevent);

    public abstract void onMicActivity(MicActivityEvent micactivityevent);

    public abstract void onMicGain(MicGainEvent micgainevent);

    public abstract void onSessionReconnected(SessionReconnectedEvent sessionreconnectedevent);

    public abstract void onSpeechActivity(SpeechActivityEvent speechactivityevent);

    public abstract void onSubscribersCountChanged(SubscribersCountChangedEvent subscriberscountchangedevent);

    public abstract void onUserEvent(UserStateChangedEvent userstatechangedevent);

    public abstract void onVideoFrameSizeChanged(VideoFrameSizeChangedEvent videoframesizechangedevent);
}
