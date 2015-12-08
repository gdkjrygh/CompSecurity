// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Utils.Log;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            BusyIndicatorCallback, COFBusy

public class COFBusyIndicator extends Plugin
    implements BusyIndicatorCallback
{

    private static final String TAG = "COFBusyIndicator";
    private static final Object _Lock = new Object();
    private static volatile COFBusy busy;
    private String currentCallbackId;

    public COFBusyIndicator()
    {
    }

    private void cancelledBusy()
    {
        Log.d("COFBusyIndicator", (new StringBuilder()).append("cancelledBusy callback for id: ").append(currentCallbackId).toString());
        if (currentCallbackId != null)
        {
            PluginResult pluginresult = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, "canceled");
            pluginresult.setKeepCallback(false);
            success(pluginresult, currentCallbackId);
        }
    }

    public static COFBusy getBusy()
    {
        COFBusy cofbusy;
        synchronized (_Lock)
        {
            cofbusy = busy;
        }
        return cofbusy;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void setBusy(COFBusy cofbusy)
    {
        synchronized (_Lock)
        {
            busy = cofbusy;
        }
        return;
        cofbusy;
        obj;
        JVM INSTR monitorexit ;
        throw cofbusy;
    }

    private void success()
    {
        Log.d("COFBusyIndicator", (new StringBuilder()).append("success callback for id: ").append(currentCallbackId).toString());
        if (currentCallbackId != null)
        {
            PluginResult pluginresult = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, "ok");
            pluginresult.setKeepCallback(false);
            success(pluginresult, currentCallbackId);
        }
    }

    public void callbackCall()
    {
        cancelledBusy();
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        Log.d("COFBusyIndicator", (new StringBuilder()).append("execute() : action: ").append(s).toString());
        PluginResult pluginresult = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
        if (s.equals("show"))
        {
            currentCallbackId = s1;
            if (busy == null)
            {
                busy = new COFBusy(AppHelper.getApplicationLink(), AppHelper.getAppView(), jsonarray, this, true);
            } else
            {
                busy.show(jsonarray, this);
            }
            jsonarray = new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT, "PluginResult :: waiting");
            jsonarray.setKeepCallback(true);
        } else
        {
            jsonarray = pluginresult;
            if (s.equals("hide"))
            {
                jsonarray = pluginresult;
                if (busy != null)
                {
                    busy.hide();
                    success();
                    return pluginresult;
                }
            }
        }
        return jsonarray;
    }

}
