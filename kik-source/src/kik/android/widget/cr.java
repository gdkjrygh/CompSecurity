// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import java.io.File;

public final class cr
    implements android.media.MediaScannerConnection.MediaScannerConnectionClient
{

    private final File a;
    private MediaScannerConnection b;

    private cr(File file, Context context)
    {
        a = file;
        b = new MediaScannerConnection(context, this);
    }

    public static void a(Context context, File file)
    {
        if (file == null || !file.exists())
        {
            return;
        } else
        {
            (new cr(file, context)).b.connect();
            return;
        }
    }

    public final void onMediaScannerConnected()
    {
        b.scanFile(a.getPath(), null);
    }

    public final void onScanCompleted(String s, Uri uri)
    {
        b.disconnect();
        b = null;
    }
}
