// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

// Referenced classes of package com.worklight.androidgap.plugin:
//            SecurityPlugin

static final class nit> extends nit>
{

    public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
    {
        try
        {
            jsonarray = SecurityPlugin.access$500(jsonarray).getBytes("UTF-8");
            callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.inResult, jsonarray));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            return executeError(SecurityPlugin.access$600(), callbackcontext, jsonarray.getLocalizedMessage());
        }
        return true;
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
