// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            HandShake, MMLog

static class sessionID
{

    public static final String appIDKey = "appID";
    public static final String appKeyKey = "appKey";
    public static final String portKey = "port";
    public static final String serverKey = "server";
    public static final String sessionIDKey = "sessionID";
    String appID;
    String appKey;
    int port;
    String server;
    String sessionID;

    public String toJsonString()
    {
        Object obj;
        try
        {
            obj = new JSONObject();
            ((JSONObject) (obj)).put("appID", appID);
            ((JSONObject) (obj)).put("appKey", appKey);
            ((JSONObject) (obj)).put("server", server);
            ((JSONObject) (obj)).put("port", port);
            sessionID = ((JSONObject) (obj)).getString("sessionID");
            obj = ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            MMLog.e("HandShake", "Error creating JSON from NuanceCredentials", jsonexception);
            return null;
        }
        return ((String) (obj));
    }

    public String toString()
    {
        return (new StringBuilder()).append("Credentials: appid=").append(appID).append(" server=").append(server).append(" port=").append(port).append(" appKey=").append(appKey).append("sessionID=").append(sessionID).toString();
    }

    public (String s)
    {
        try
        {
            s = new JSONObject(s);
            appID = s.getString("appID");
            appKey = s.getString("appKey");
            server = s.getString("server");
            port = s.getInt("port");
            sessionID = s.getString("sessionID");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            MMLog.e("HandShake", "Error parsing nuance string to json", s);
        }
    }
}
