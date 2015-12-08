// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;

import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.addlive.service:
//            User, Responder, MediaType

public interface MediaConnection
{

    public abstract void addUser(User user);

    public abstract void disconnect(Responder responder);

    public abstract User getUser(Long long1);

    public abstract HashMap getUsersInSession();

    public abstract boolean isLocalUserPublishingAudio();

    public abstract void publish(Responder responder, MediaType mediatype);

    public abstract void removeUser(Long long1);

    public abstract void sendMessage(Responder responder, byte abyte0[]);

    public abstract void sendMessage(Responder responder, byte abyte0[], Long long1);

    public abstract void setAllowedSenders(Responder responder, MediaType mediatype, List list);

    public abstract void setLocalUserIsPublishingAudio(boolean flag);

    public abstract void startMeasuringStats(Responder responder, int i);

    public abstract void stopMeasuringStats(Responder responder);

    public abstract void unpublish(Responder responder, MediaType mediatype);
}
