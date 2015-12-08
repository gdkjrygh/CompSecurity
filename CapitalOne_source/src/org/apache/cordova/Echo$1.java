// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import org.apache.cordova.api.CallbackContext;

// Referenced classes of package org.apache.cordova:
//            Echo

class val.result
    implements Runnable
{

    final Echo this$0;
    final CallbackContext val$callbackContext;
    final String val$result;

    public void run()
    {
        val$callbackContext.success(val$result);
    }

    lbackContext()
    {
        this$0 = final_echo;
        val$callbackContext = callbackcontext;
        val$result = String.this;
        super();
    }
}
