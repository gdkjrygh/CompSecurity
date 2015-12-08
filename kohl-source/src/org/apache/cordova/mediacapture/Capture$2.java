// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.mediacapture;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

// Referenced classes of package org.apache.cordova.mediacapture:
//            Capture

class val.that
    implements Runnable
{

    final Capture this$0;
    final Capture val$that;

    public void run()
    {
        Object obj1;
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("mime_type", "image/jpeg");
        Object obj = val$that.cordova.getActivity().getContentResolver().insert(android.provider..Images.Media.EXTERNAL_CONTENT_URI, ((ContentValues) (obj1)));
_L2:
        OutputStream outputstream;
        byte abyte0[];
        obj1 = new FileInputStream((new StringBuilder()).append(Capture.access$600(Capture.this)).append("/Capture.jpg").toString());
        outputstream = val$that.cordova.getActivity().getContentResolver().openOutputStream(((android.net.Uri) (obj)));
        abyte0 = new byte[4096];
_L1:
        int i = ((FileInputStream) (obj1)).read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        try
        {
            outputstream.write(abyte0, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            val$that.fail(Capture.access$500(Capture.this, 0, "Error capturing image."));
            return;
        }
          goto _L1
        obj;
        LOG.d("Capture", "Can't write to external media storage.");
        obj = val$that.cordova.getActivity().getContentResolver().insert(android.provider..Images.Media.INTERNAL_CONTENT_URI, ((ContentValues) (obj1)));
          goto _L2
        obj;
        LOG.d("Capture", "Can't write to internal media storage.");
        val$that.fail(Capture.access$500(Capture.this, 0, "Error capturing image - no media storage found."));
        return;
        outputstream.flush();
        outputstream.close();
        ((FileInputStream) (obj1)).close();
        Capture.access$100(Capture.this).put(Capture.access$000(Capture.this, ((android.net.Uri) (obj))));
        Capture.access$700(Capture.this);
        if ((long)Capture.access$100(Capture.this).length() >= Capture.access$200(Capture.this))
        {
            Capture.access$300(val$that).sendPluginResult(new PluginResult(org.apache.cordova.lt.Status.OK, Capture.access$100(Capture.this)));
            return;
        }
        Capture.access$800(Capture.this);
        return;
    }

    ()
    {
        this$0 = final_capture;
        val$that = Capture.this;
        super();
    }
}
