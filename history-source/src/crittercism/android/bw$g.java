// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            bv, bw, bf, dx

static class a
    implements bv
{

    private JSONObject a;

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

    public anager(int i)
    {
        NetworkInfo networkinfo;
        a = null;
        bw.b();
        bw.c();
        if (!bw.c().c)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        a = new JSONObject();
        networkinfo = ((ConnectivityManager)bw.b().getSystemService("connectivity")).getNetworkInfo(i);
        if (networkinfo == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        a.put("available", networkinfo.isAvailable());
        a.put("connected", networkinfo.isConnected());
        if (!networkinfo.isConnected())
        {
            a.put("connecting", networkinfo.isConnectedOrConnecting());
        }
        a.put("failover", networkinfo.isFailover());
        if (i == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        try
        {
            a.put("roaming", networkinfo.isRoaming());
            return;
        }
        catch (JSONException jsonexception)
        {
            a = null;
        }
        break MISSING_BLOCK_LABEL_157;
        a = null;
        return;
        dx.c();
    }
}
