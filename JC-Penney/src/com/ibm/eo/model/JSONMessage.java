// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import com.ibm.eo.util.LogInternal;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.ibm.eo.model:
//            EOMessage

public class JSONMessage
    implements Serializable
{

    private static final int prime = 31;
    private static final long serialVersionUID = 0x373047918898ad90L;
    private Boolean hasUICData;
    private String jsonData;
    private int logLevel;
    private long size;

    public JSONMessage(EOMessage eomessage)
    {
        if (eomessage != null)
        {
            setLogLevel(eomessage.getLogLevel().intValue());
            JSONObject jsonobject = eomessage.getJSON();
            if (jsonobject != null)
            {
                try
                {
                    jsonobject.put("offset", eomessage.getOffset());
                    setJsonData(jsonobject.toString());
                }
                // Misplaced declaration of an exception variable
                catch (EOMessage eomessage)
                {
                    LogInternal.logException(eomessage);
                }
            }
        }
        setSize(0L);
        setHasUICData(Boolean.valueOf(false));
    }

    public final Boolean clean()
    {
        setJsonData(null);
        setLogLevel(0);
        setSize(0L);
        setHasUICData(Boolean.valueOf(false));
        return Boolean.valueOf(true);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof JSONMessage) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (this == obj)
        {
            return true;
        }
        if (getClass() != obj.getClass())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (JSONMessage)obj;
        if (getJsonData() != null) goto _L4; else goto _L3
_L3:
        if (((JSONMessage) (obj)).getJsonData() != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        if (getLogLevel() == ((JSONMessage) (obj)).getLogLevel() && getHasUICData() == ((JSONMessage) (obj)).getHasUICData())
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (getJsonData().equals(((JSONMessage) (obj)).getJsonData())) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L7
_L7:
        return false;
    }

    public final Boolean getHasUICData()
    {
        return hasUICData;
    }

    public final String getJsonData()
    {
        return jsonData;
    }

    public final int getLogLevel()
    {
        return logLevel;
    }

    public final long getSize()
    {
        return size;
    }

    public final int hashCode()
    {
        int i;
        if (getJsonData() == null)
        {
            i = 0;
        } else
        {
            i = getJsonData().hashCode();
        }
        return ((i + 31) * 31 + getLogLevel()) * 31 + getHasUICData().hashCode();
    }

    public final void setHasUICData(Boolean boolean1)
    {
        hasUICData = boolean1;
    }

    public final void setJsonData(String s)
    {
        jsonData = s;
    }

    public final void setLogLevel(int i)
    {
        logLevel = i;
    }

    public final void setSize(long l)
    {
        size = l;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("JSONMessage [jsonData=");
        stringbuffer.append(getJsonData());
        stringbuffer.append(", logLevel=");
        stringbuffer.append(getLogLevel());
        stringbuffer.append(", size=");
        stringbuffer.append(getSize());
        stringbuffer.append(", hasUICData=");
        stringbuffer.append(getHasUICData());
        stringbuffer.append(']');
        return stringbuffer.toString();
    }
}
