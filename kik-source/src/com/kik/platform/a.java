// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.platform;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

// Referenced classes of package com.kik.platform:
//            e, d, f, g, 
//            h, c, b

public final class a
{

    private static void a(Activity activity)
    {
        (new android.app.AlertDialog.Builder(activity)).setMessage("This content requires Kik to handle it. It doesn't look like you have Kik, would you like to install it now?").setNegativeButton("Cancel", new e()).setPositiveButton("Install", new d(activity)).show();
    }

    public static void a(Activity activity, g g1, String s)
    {
        Object obj;
        Object obj2;
        byte abyte0[];
        File file;
        obj2 = null;
        abyte0 = null;
        obj = null;
        boolean flag = false;
        try
        {
            g1.d();
            g1.e();
            g1.f();
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            Toast.makeText(activity, (new StringBuilder("Woah! ")).append(g1.getMessage()).append("\nCheck logcat for the trace.").toString(), 1).show();
            g1.printStackTrace();
            return;
        }
        file = g1.g();
        if (file == null) goto _L2; else goto _L1
_L1:
        obj = Environment.getExternalStorageDirectory();
        Object obj1;
        IOException ioexception;
        Object obj3;
        int i;
        int j;
        if (obj != null)
        {
            obj = ((File) (obj)).getAbsolutePath();
        } else
        {
            obj = null;
        }
        obj1 = file.getAbsolutePath();
        if (obj1 != null && obj != null && ((String) (obj1)).startsWith(((String) (obj))))
        {
            i = 1;
        } else
        if (obj1 != null && ((String) (obj1)).startsWith("/data/data/kik.android"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        obj = file.getAbsolutePath();
_L2:
        if (g1.b() != null || g1.c() != null)
        {
            g1.h();
        }
        i = activity.getPackageManager().getPackageInfo("kik.android", 0).versionCode;
        flag = true;
        break MISSING_BLOCK_LABEL_122;
_L4:
        obj = new FileInputStream(file);
        obj1 = h.a.buildUpon().appendPath(UUID.randomUUID().toString()).build().toString();
        obj2 = (FileOutputStream)activity.getContentResolver().openOutputStream(Uri.parse(((String) (obj1))));
        abyte0 = new byte[0x80000];
        i = 0;
_L6:
        if ((long)i >= file.length())
        {
            break; /* Loop/switch isn't completed */
        }
        j = ((FileInputStream) (obj)).read(abyte0, 0, 0x80000);
        ((FileOutputStream) (obj2)).write(abyte0, 0, j);
        i += j;
        if (true) goto _L6; else goto _L5
_L5:
        ((FileInputStream) (obj)).close();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        ((FileOutputStream) (obj2)).close();
        obj = obj1;
          goto _L2
        obj;
        obj = obj1;
          goto _L2
        obj;
        obj1 = null;
        obj = null;
_L9:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        ((FileInputStream) (obj)).close();
        obj = obj2;
        if (obj1 == null) goto _L2; else goto _L7
_L7:
        ((FileOutputStream) (obj1)).close();
        obj = obj2;
          goto _L2
        obj;
        obj = obj2;
          goto _L2
        activity;
        obj = null;
        g1 = abyte0;
_L8:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        ((FileInputStream) (obj)).close();
        if (g1 != null)
        {
            try
            {
                g1.close();
            }
            // Misplaced declaration of an exception variable
            catch (g g1) { }
        }
        throw activity;
        obj1;
        i = 0;
        if (!flag)
        {
            a(activity);
            return;
        }
        if (i < 21)
        {
            (new android.app.AlertDialog.Builder(activity)).setMessage("Your version of Kik requires an upgrade to handle this content. Would you like to download the newest version of kik?").setNegativeButton("Cancel", new c()).setPositiveButton("Update", new b(activity)).show();
            return;
        }
        obj1 = new Intent("kik.platform.send");
        g1.a(((Intent) (obj1)));
        if (obj != null)
        {
            ((Intent) (obj1)).putExtra("com.kik.platform.content.EXTRA_LOCAL_FILE_URI", ((String) (obj)));
        }
        ((Intent) (obj1)).putExtra("com.kik.platform.content.EXTRA_CONVO_ID", s);
        try
        {
            activity.startActivityForResult(((Intent) (obj1)), 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            a(activity);
        }
        return;
        activity;
        g1 = abyte0;
          goto _L8
        activity;
        g1 = ((g) (obj2));
          goto _L8
        obj1;
        obj1 = null;
          goto _L9
        obj2;
        abyte0 = null;
        obj2 = obj1;
        obj1 = abyte0;
          goto _L9
        ioexception;
        obj3 = obj1;
        obj1 = obj2;
        obj2 = obj3;
          goto _L9
    }
}
