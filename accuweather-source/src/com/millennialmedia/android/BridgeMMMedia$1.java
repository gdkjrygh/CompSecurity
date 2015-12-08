// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.media.MediaScannerConnection;
import android.net.Uri;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMMedia, MMLog

class val.path
    implements android.media.ection.MediaScannerConnectionClient
{

    final BridgeMMMedia this$0;
    final String val$path;

    public void onMediaScannerConnected()
    {
        if (mediaScanner != null)
        {
            mediaScanner.scanFile(val$path, null);
        }
    }

    public void onScanCompleted(String s, Uri uri)
    {
        if (uri == null)
        {
            MMLog.d("BridgeMMMedia", (new StringBuilder()).append("Failed to scan ").append(s).toString());
        }
        mediaScanner.disconnect();
    }

    annerConnectionClient()
    {
        this$0 = final_bridgemmmedia;
        val$path = String.this;
        super();
    }
}
