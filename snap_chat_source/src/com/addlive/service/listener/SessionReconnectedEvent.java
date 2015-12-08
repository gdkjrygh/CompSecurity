// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class SessionReconnectedEvent
{

    private String scopeId;

    public SessionReconnectedEvent(JSONObject jsonobject)
    {
        scopeId = jsonobject.getString("scopeId");
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public String toString()
    {
        return (new StringBuilder("ConnectionLostEvent{scopeId=")).append(scopeId).append("}").toString();
    }
}
