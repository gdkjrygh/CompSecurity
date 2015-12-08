// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.platform.ADL;
import com.addlive.service.AddLiveService;
import com.addlive.service.MediaConnection;
import com.addlive.service.MediaType;
import com.addlive.service.Responder;
import com.addlive.service.User;
import java.util.HashMap;
import java.util.List;

class ADLMediaConnectionImpl
    implements MediaConnection
{

    private boolean isLocalUserPublishingAudio;
    private String scopeId;
    private HashMap usersInSession;

    public ADLMediaConnectionImpl(String s)
    {
        usersInSession = new HashMap();
        scopeId = s;
    }

    public void addUser(User user)
    {
        usersInSession.put(user.getUserId(), user);
    }

    public void disconnect(Responder responder)
    {
        ADL.getService().disconnect(responder, scopeId, 0);
    }

    public User getUser(Long long1)
    {
        return (User)usersInSession.get(long1);
    }

    public HashMap getUsersInSession()
    {
        return usersInSession;
    }

    public boolean isLocalUserPublishingAudio()
    {
        return isLocalUserPublishingAudio;
    }

    public void publish(Responder responder, MediaType mediatype)
    {
        ADL.getService().publish(responder, scopeId, mediatype);
    }

    public void removeUser(Long long1)
    {
        usersInSession.remove(long1);
    }

    public void sendMessage(Responder responder, byte abyte0[])
    {
        ADL.getService().sendMessage(responder, scopeId, abyte0);
    }

    public void sendMessage(Responder responder, byte abyte0[], Long long1)
    {
        ADL.getService().sendMessage(responder, scopeId, abyte0, long1);
    }

    public void setAllowedSenders(Responder responder, MediaType mediatype, List list)
    {
        ADL.getService().setAllowedSenders(responder, scopeId, mediatype, list);
    }

    public void setLocalUserIsPublishingAudio(boolean flag)
    {
        isLocalUserPublishingAudio = flag;
    }

    public void startMeasuringStats(Responder responder, int i)
    {
        ADL.getService().startMeasuringStats(responder, scopeId, i);
    }

    public void stopMeasuringStats(Responder responder)
    {
        ADL.getService().stopMeasuringStats(responder, scopeId);
    }

    public void unpublish(Responder responder, MediaType mediatype)
    {
        ADL.getService().unpublish(responder, scopeId, mediatype);
    }
}
