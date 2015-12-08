// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class ConnectionLostEvent
{

    private int errCode;
    private String errMessage;
    private String scopeId;
    private boolean willReconnect;

    public ConnectionLostEvent(JSONObject jsonobject)
    {
        scopeId = jsonobject.getString("scopeId");
        errCode = jsonobject.getInt("errCode");
        errMessage = jsonobject.getString("errMessage");
        willReconnect = jsonobject.getBoolean("willReconnect");
    }

    public int getErrCode()
    {
        return errCode;
    }

    public String getErrMessage()
    {
        return errMessage;
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public boolean isWillReconnect()
    {
        return willReconnect;
    }

    public String toString()
    {
        return (new StringBuilder("ConnectionLostEvent{scopeId=")).append(scopeId).append(", errCode=").append(errCode).append(", errMessage=").append(errMessage).append("}").toString();
    }
}
