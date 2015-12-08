// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import org.apache.cordova.CallbackContext;
import org.json.JSONArray;

// Referenced classes of package com.worklight.androidgap.plugin:
//            UserAuthPlugin

class val.args
    implements Runnable
{

    final UserAuthPlugin this$0;
    final JSONArray val$args;
    final CallbackContext val$ctx;

    public void run()
    {
        UserAuthPlugin.access$100(UserAuthPlugin.this, UserAuthPlugin.access$000(UserAuthPlugin.this, val$ctx, val$args), val$ctx);
    }

    ()
    {
        this$0 = final_userauthplugin;
        val$ctx = callbackcontext;
        val$args = JSONArray.this;
        super();
    }
}
