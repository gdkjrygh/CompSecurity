// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.mediacapture;

import android.content.Intent;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

// Referenced classes of package org.apache.cordova.mediacapture:
//            Capture

class val.that
    implements Runnable
{

    final Capture this$0;
    final Intent val$intent;
    final Capture val$that;

    public void run()
    {
        android.net.Uri uri = val$intent.getData();
        Capture.access$100(Capture.this).put(Capture.access$000(Capture.this, uri));
        if ((long)Capture.access$100(Capture.this).length() >= Capture.access$200(Capture.this))
        {
            Capture.access$300(val$that).sendPluginResult(new PluginResult(org.apache.cordova.lt.Status.OK, Capture.access$100(Capture.this)));
            return;
        } else
        {
            Capture.access$400(Capture.this);
            return;
        }
    }

    ()
    {
        this$0 = final_capture;
        val$intent = intent1;
        val$that = Capture.this;
        super();
    }
}
