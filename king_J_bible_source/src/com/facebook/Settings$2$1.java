// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.facebook:
//            Response, Settings

class val.response
    implements Runnable
{

    final val.response this$1;
    private final ack val$callback;
    private final Response val$response;

    public void run()
    {
        val$callback.onCompleted(val$response);
    }

    ack()
    {
        this$1 = final_ack;
        val$callback = ack1;
        val$response = Response.this;
        super();
    }

    // Unreferenced inner class com/facebook/Settings$2

/* anonymous class */
    class Settings._cls2
        implements Runnable
    {

        private final Context val$applicationContext;
        private final String val$applicationId;
        private final Request.Callback val$callback;

        public void run()
        {
            Response response1 = Settings.publishInstallAndWaitForResponse(applicationContext, applicationId, false);
            if (callback != null)
            {
                (new Handler(Looper.getMainLooper())).post(response1. new Settings._cls2._cls1());
            }
        }

            
            {
                applicationContext = context;
                applicationId = s;
                callback = callback1;
                super();
            }
    }

}
