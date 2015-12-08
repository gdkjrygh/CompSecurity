// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import com.ibm.eo.EOCore;
import com.ibm.eo.util.LogInternal;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.model:
//            EOMessage, JSONMessage, ClientEnvironment

public class Session extends EOMessage
    implements Serializable
{

    private static final long serialVersionUID = 0xb4350175b5cc6130L;
    private ClientEnvironment clientEnvironment;
    private int count;
    private Boolean hasUICData;
    private Integer messageVersion;
    private List messages;
    private String sessionID;
    private long sessionStartTime;

    public Session()
    {
        setMessages(new CopyOnWriteArrayList());
        setHasUICData(Boolean.valueOf(false));
        setCount(1);
        messageVersion = Integer.valueOf(1);
    }

    public final ClientEnvironment getClientEnvironment()
    {
        return clientEnvironment;
    }

    public final int getCount()
    {
        return count;
    }

    public final Boolean getHasUICData()
    {
        return hasUICData;
    }

    public final JSONObject getJSON()
    {
        JSONObject jsonobject = new JSONObject();
        Object obj;
        jsonobject.put("EOCoreSessionID", EOCore.getCurrentSessionId());
        jsonobject.put("id", getSessionID());
        jsonobject.put("startTime", getSessionStartTime());
        obj = new JSONArray();
        for (Iterator iterator = getMessages().iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(new JSONObject(((JSONMessage)iterator.next()).getJsonData()))) { }
          goto _L1
        obj;
        LogInternal.logException(((Throwable) (obj)));
_L3:
        return jsonobject;
_L1:
        jsonobject.put("messages", obj);
        if (getClientEnvironment() == null) goto _L3; else goto _L2
_L2:
        jsonobject.put("clientEnvironment", getClientEnvironment().getJSON());
        return jsonobject;
    }

    public final Integer getMessageVersion()
    {
        return messageVersion;
    }

    public final List getMessages()
    {
        if (messages == null)
        {
            messages = new CopyOnWriteArrayList();
        }
        return messages;
    }

    public final String getSessionID()
    {
        return sessionID;
    }

    public final long getSessionStartTime()
    {
        return sessionStartTime;
    }

    public final void setClientEnvironment(ClientEnvironment clientenvironment)
    {
        clientEnvironment = clientenvironment;
    }

    public final void setCount(int i)
    {
        count = i;
    }

    public final void setHasUICData(Boolean boolean1)
    {
        hasUICData = boolean1;
    }

    public final void setMessageVersion(Integer integer)
    {
        messageVersion = integer;
    }

    public final void setMessages(List list)
    {
        messages = list;
    }

    public final void setSessionID(String s)
    {
        sessionID = s;
    }

    public final void setSessionStartTime(long l)
    {
        sessionStartTime = l;
    }

    public final int updateByOneGetCount()
    {
        setCount(getCount() + 1);
        return getCount();
    }
}
