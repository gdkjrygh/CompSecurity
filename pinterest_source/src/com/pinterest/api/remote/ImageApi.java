// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import android.os.Environment;
import com.pinterest.api.ApiHttpClient;
import java.io.File;

public class ImageApi
{

    public static boolean a(String s)
    {
        File file;
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), String.format("100PINT%sPins", new Object[] {
                File.separator
            }));
            file.mkdirs();
            file = new File(file, s.substring(s.lastIndexOf("/") + 1));
        } else
        {
            file = null;
        }
        if (file == null)
        {
            return false;
        } else
        {
            ApiHttpClient.getImageData(s, new _cls1(file), false, null);
            return true;
        }
    }

    private class _cls1 extends ImageApiResponseHandler
    {

        final File c;

        public final void a(Bitmap bitmap)
        {
            try
            {
                FileOutputStream fileoutputstream = new FileOutputStream(c);
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, fileoutputstream);
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

        _cls1(File file)
        {
            c = file;
            super();
        }
    }

}
