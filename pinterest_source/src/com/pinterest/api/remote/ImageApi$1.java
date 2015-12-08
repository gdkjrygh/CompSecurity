// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import com.android.volley.VolleyError;
import com.pinterest.api.ImageApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.reporting.CrashReporting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

final class ndler extends ImageApiResponseHandler
{

    final File c;

    public final void a(Bitmap bitmap)
    {
        try
        {
            FileOutputStream fileoutputstream = new FileOutputStream(c);
            bitmap.compress(android.graphics.ressFormat.JPEG, 90, fileoutputstream);
            MediaScannerConnection.scanFile(Application.context(), new String[] {
                c.getAbsolutePath()
            }, null, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            CrashReporting.a(bitmap);
        }
    }

    public final void onErrorResponse(VolleyError volleyerror)
    {
        super.onErrorResponse(volleyerror);
        CrashReporting.a(volleyerror.getCause());
    }

    public final void onResponse(Object obj)
    {
        a((Bitmap)obj);
    }

    ng(File file)
    {
        c = file;
        super();
    }
}
