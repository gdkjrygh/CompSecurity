// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.json.JSONException;
import org.json.JSONObject;

static class a
    implements aam
{

    private JSONObject a;

    private static JSONObject a(int i)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        if (aan.c().c) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject = null;
_L4:
        return jsonobject;
_L2:
        if (!ConnectivityManager.isNetworkTypeValid(i))
        {
            return null;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)aan.b().getSystemService("connectivity")).getNetworkInfo(i);
        JSONObject jsonobject1 = new JSONObject();
        if (networkinfo == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        try
        {
            jsonobject1.put("available", networkinfo.isAvailable());
            jsonobject1.put("connected", networkinfo.isConnected());
            if (!networkinfo.isConnected())
            {
                jsonobject1.put("connecting", networkinfo.isConnectedOrConnecting());
            }
            jsonobject1.put("failover", networkinfo.isFailover());
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        if (i == 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        jsonobject = jsonobject1;
        if (i == 0) goto _L4; else goto _L3
_L3:
        jsonobject1.put("roaming", networkinfo.isRoaming());
        return jsonobject1;
        jsonobject1.put("available", false);
        jsonobject1.put("connected", false);
        jsonobject1.put("connecting", false);
        jsonobject1.put("failover", false);
        if (i == 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        jsonobject = jsonobject1;
        if (i == 0) goto _L4; else goto _L5
_L5:
        jsonobject1.put("roaming", false);
        return jsonobject1;
    }

    public String a()
    {
        return null;
    }

    public final Object b()
    {
        return c();
    }

    public JSONObject c()
    {
        return a;
    }

    public (int i)
    {
        a = null;
        a = a(i);
    }
}
