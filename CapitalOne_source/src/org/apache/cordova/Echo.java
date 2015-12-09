// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.util.concurrent.ExecutorService;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class Echo extends CordovaPlugin
{

    public Echo()
    {
    }

    public boolean execute(String s, final JSONArray result, final CallbackContext callbackContext)
        throws JSONException
    {
        if (result.isNull(0))
        {
            result = null;
        } else
        {
            result = result.getString(0);
        }
        if ("echo".equals(s))
        {
            callbackContext.success(result);
            return true;
        }
        if ("echoAsync".equals(s))
        {
            cordova.getThreadPool().execute(new Runnable() {

                final Echo this$0;
                final CallbackContext val$callbackContext;
                final String val$result;

                public void run()
                {
                    callbackContext.success(result);
                }

            
            {
                this$0 = Echo.this;
                callbackContext = callbackcontext;
                result = s;
                super();
            }
            });
            return true;
        } else
        {
            return false;
        }
    }
}
