// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class MessageEvent
{

    private byte data[];
    private String scopeId;
    private long srcUserId;

    public MessageEvent(JSONObject jsonobject)
    {
        data = jsonobject.getString("data").getBytes();
        srcUserId = jsonobject.getLong("srcUserId");
        scopeId = jsonobject.getString("scopeId");
    }

    public byte[] getData()
    {
        return data;
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public long getSrcUserId()
    {
        return srcUserId;
    }

    public String toString()
    {
        return (new StringBuilder("MessageEvent{data.length=")).append(data.length).append(", srcUserId=").append(srcUserId).append(", scopeId=").append(scopeId).append("}").toString();
    }
}
