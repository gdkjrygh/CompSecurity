// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLActionSenderPlugin

class val.callbackContext
    implements Runnable
{

    final WLActionSenderPlugin this$0;
    final JSONArray val$args;
    final CallbackContext val$callbackContext;

    public void run()
    {
        String s = null;
        String s1 = val$args.getString(0);
        org.json.JSONObject jsonobject;
        if (val$args.isNull(1))
        {
            jsonobject = null;
        } else
        {
            try
            {
                jsonobject = val$args.getJSONObject(1);
            }
            catch (JSONException jsonexception)
            {
                val$callbackContext.error("sendActionToNative - Error parsing data");
                return;
            }
        }
        if (!val$args.isNull(2))
        {
            break MISSING_BLOCK_LABEL_62;
        }
_L1:
        WLActionSenderPlugin.access$000(WLActionSenderPlugin.this, s1, jsonobject, s, val$callbackContext);
        return;
        s = val$args.getString(2);
          goto _L1
    }

    ()
    {
        this$0 = final_wlactionsenderplugin;
        val$args = jsonarray;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
