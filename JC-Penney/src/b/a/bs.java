// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            bj, bk, af, eu

class bs
    implements bj
{

    private JSONObject a;

    public bs(int i)
    {
        a = null;
        bk.b();
        bk.c();
        a = a(i);
    }

    private static JSONObject a(int i)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        if (bk.c().c) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((JSONObject) (obj));
_L2:
        JSONObject jsonobject;
        if (!ConnectivityManager.isNetworkTypeValid(i))
        {
            return null;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)bk.b().getSystemService("connectivity")).getNetworkInfo(i);
        jsonobject = new JSONObject();
        if (networkinfo == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        try
        {
            jsonobject.put("available", networkinfo.isAvailable());
            jsonobject.put("connected", networkinfo.isConnected());
            if (!networkinfo.isConnected())
            {
                jsonobject.put("connecting", networkinfo.isConnectedOrConnecting());
            }
            jsonobject.put("failover", networkinfo.isFailover());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.c();
            return null;
        }
        if (i == 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        obj = jsonobject;
        if (i == 0) goto _L4; else goto _L3
_L3:
        jsonobject.put("roaming", networkinfo.isRoaming());
        return jsonobject;
        jsonobject.put("available", false);
        jsonobject.put("connected", false);
        jsonobject.put("connecting", false);
        jsonobject.put("failover", false);
        if (i == 0)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        obj = jsonobject;
        if (i == 0) goto _L4; else goto _L5
_L5:
        jsonobject.put("roaming", false);
        return jsonobject;
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
}
