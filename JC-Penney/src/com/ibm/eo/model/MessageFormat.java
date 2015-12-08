// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import com.ibm.eo.util.LogInternal;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.model:
//            EOMessage, Session

public class MessageFormat extends EOMessage
    implements Serializable
{

    private static final long serialVersionUID = 0x67adf602e9b29f81L;
    private String messageVersion;
    private String moduleName;
    private int serialNumber;
    private Session session;

    public MessageFormat()
    {
    }

    public final JSONObject getJSON()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("messageVersion", getMessageVersion());
            jsonobject.put("serialNumber", getSerialNumber());
            JSONArray jsonarray = new JSONArray();
            if (getSession() != null)
            {
                jsonarray.put(getSession().getJSON());
            }
            jsonobject.put("sessions", jsonarray);
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final String getMessageVersion()
    {
        return messageVersion;
    }

    public final String getModuleName()
    {
        return moduleName;
    }

    public final int getSerialNumber()
    {
        return serialNumber;
    }

    public final Session getSession()
    {
        return session;
    }

    public final void setMessageVersion(String s)
    {
        messageVersion = s;
    }

    public final void setModuleName(String s)
    {
        moduleName = s;
    }

    public final void setSerialNumber(int i)
    {
        serialNumber = i;
    }

    public final void setSession(Session session1)
    {
        session = session1;
    }
}
