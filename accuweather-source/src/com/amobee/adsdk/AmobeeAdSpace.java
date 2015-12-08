// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amobee.adsdk:
//            Log

public class AmobeeAdSpace
{

    static final String CAPPING_MINUTES = "cappingMinutes";
    static final String LAST_IMPRESSION = "lastImpression";
    static final String SESSION = "session";
    static final String SESSION_ID = "sessionId";
    String adspace;
    int cappingMinutes;
    long lastImpression;
    int session;
    long sessionId;

    public AmobeeAdSpace(String s)
    {
        lastImpression = -1L;
        cappingMinutes = -1;
        session = 0;
        sessionId = -1L;
        adspace = s;
    }

    public String getAdspace()
    {
        return adspace;
    }

    public int getCappingMinutes()
    {
        return cappingMinutes;
    }

    public long getLastImpression()
    {
        return lastImpression;
    }

    public long getSessionId()
    {
        return sessionId;
    }

    public int isSession()
    {
        return session;
    }

    public void setAdspace(String s)
    {
        adspace = s;
    }

    public void setCappingMinutes(int i)
    {
        cappingMinutes = i;
    }

    public void setLastImpression(long l)
    {
        lastImpression = l;
    }

    public void setPropertiesFromString(String s)
    {
        try
        {
            s = new JSONObject(s);
            lastImpression = s.getLong("lastImpression");
            cappingMinutes = s.getInt("cappingMinutes");
            session = s.getInt("session");
            sessionId = s.getLong("sessionId");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("[a\u2022mo\u2022bee]", "Could not parse malformed JSON");
        }
    }

    public void setSession(int i)
    {
        session = i;
    }

    public void setSessionId(long l)
    {
        sessionId = l;
    }

    public String toString()
    {
        Object obj;
        try
        {
            obj = new JSONObject();
            ((JSONObject) (obj)).put("lastImpression", lastImpression);
            ((JSONObject) (obj)).put("cappingMinutes", cappingMinutes);
            ((JSONObject) (obj)).put("session", session);
            ((JSONObject) (obj)).put("sessionId", sessionId);
            obj = ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return ((String) (obj));
    }
}
