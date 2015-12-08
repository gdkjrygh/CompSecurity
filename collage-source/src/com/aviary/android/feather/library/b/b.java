// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.b;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.util.Log;
import java.io.File;

public class b
    implements android.media.MediaScannerConnection.MediaScannerConnectionClient
{
    public static interface a
    {

        public abstract void b();
    }


    private android.media.MediaScannerConnection.OnScanCompletedListener a;
    private a b;
    private MediaScannerConnection c;
    private File d;

    public b(Context context, File file, android.media.MediaScannerConnection.OnScanCompletedListener onscancompletedlistener, a a1)
    {
        d = file;
        a = onscancompletedlistener;
        b = a1;
        c = new MediaScannerConnection(context, this);
    }

    public void a()
    {
        c.connect();
    }

    public void onMediaScannerConnected()
    {
        Log.i("single-media-scanner", "onMediaScannerConnected");
        c.scanFile(d.getAbsolutePath(), null);
_L1:
        return;
        Throwable throwable;
        throwable;
        if (b != null)
        {
            b.b();
            return;
        }
          goto _L1
    }

    public void onScanCompleted(String s, Uri uri)
    {
        Log.i("single-media-scanner", (new StringBuilder()).append("onMediaScannerCompleted: ").append(s).append("(").append(uri).append(")").toString());
        c.disconnect();
        if (a != null)
        {
            a.onScanCompleted(s, uri);
        }
    }
}
