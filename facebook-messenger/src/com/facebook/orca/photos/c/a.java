// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.c;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.format.DateFormat;
import android.widget.Toast;
import com.facebook.common.w.m;
import com.facebook.debug.log.b;
import com.facebook.o;
import com.google.common.base.Strings;
import java.io.File;
import java.util.Calendar;

public class a
{

    private static final Class a = com/facebook/orca/photos/c/a;
    private final DownloadManager b;
    private final Context c;

    public a(Context context, DownloadManager downloadmanager)
    {
        b = downloadmanager;
        c = context;
    }

    private File a(File file, String s)
    {
        if (!Strings.isNullOrEmpty(s)) goto _L2; else goto _L1
_L1:
        String s1 = "";
_L4:
        s = DateFormat.format("yyyy-MM-dd", Calendar.getInstance());
        String s2 = m.a(c.getString(o.messenger_image_filename_format_string), new Object[] {
            s
        });
        s = new File(file, (new StringBuilder()).append(s2).append(s1).toString());
        int i = 0;
        for (; s.exists(); s = new File(file, m.a("%s %d%s", new Object[] {
    s2, Integer.valueOf(i), s1
})))
        {
            i++;
        }

        break; /* Loop/switch isn't completed */
_L2:
        s1 = s;
        if (!s.startsWith("."))
        {
            s1 = (new StringBuilder()).append(".").append(s).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
        return s;
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    private boolean b()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private File c()
    {
        File file1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Messenger/");
        File file = file1;
        if (!file1.exists())
        {
            file = file1;
            if (!file1.mkdirs())
            {
                file = null;
            }
        }
        return file;
    }

    public void a(Uri uri, String s)
    {
        String s1 = c.getString(o.messenger_save_image_sdcard_error);
        Toast toast = Toast.makeText(c, s1, 1);
        if (!b())
        {
            toast.show();
            com.facebook.debug.log.b.d(a, s1);
            return;
        }
        File file = c();
        if (file == null)
        {
            toast.show();
            com.facebook.debug.log.b.d(a, (new StringBuilder()).append(s1).append(" SDCard writeable but couldn't make image directory").toString());
            return;
        }
        s = a(file, s);
        try
        {
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(uri);
            request.setDestinationUri(Uri.fromFile(s));
            request.allowScanningByMediaScanner();
            b.enqueue(request);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = c.getString(o.messenger_save_image_general_error);
        }
        Toast.makeText(c, s, 1).show();
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append(s).append("  ").append(uri).toString());
    }

}
