// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.mediacapture;

import android.content.Intent;
import android.net.Uri;
import java.io.File;
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
        Uri uri = null;
        if (val$intent != null)
        {
            uri = val$intent.getData();
        }
        Uri uri1 = uri;
        if (uri == null)
        {
            uri1 = Uri.fromFile(new File(Capture.access$600(Capture.this), "Capture.avi"));
        }
        if (uri1 == null)
        {
            val$that.fail(Capture.access$500(Capture.this, 3, "Error: data is null"));
            return;
        }
        Capture.access$100(Capture.this).put(Capture.access$000(Capture.this, uri1));
        if ((long)Capture.access$100(Capture.this).length() >= Capture.access$200(Capture.this))
        {
            Capture.access$300(val$that).sendPluginResult(new PluginResult(org.apache.cordova.lt.Status.OK, Capture.access$100(Capture.this)));
            return;
        } else
        {
            Capture.access$1000(Capture.this, Capture.access$900(Capture.this));
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
