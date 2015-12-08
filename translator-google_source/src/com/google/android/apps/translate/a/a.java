// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import com.google.android.apps.unveil.env.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class a extends AsyncTask
{

    private static a b = null;
    private final Context a;

    private a(Context context)
    {
        a = context;
    }

    private transient Intent a(j aj[])
    {
        File afile[];
        File file;
        String s;
        int i;
        boolean flag;
        flag = false;
        file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        file.mkdirs();
        s = (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date());
        afile = new File[aj.length];
        i = 0;
_L5:
        if (i >= aj.length) goto _L2; else goto _L1
_L1:
        Object obj1;
        j j1;
        afile[i] = new File(file, (new StringBuilder(String.valueOf(s).length() + 25)).append("photoocr_").append(s).append("_").append(i).append(".png").toString());
        obj1 = afile[i];
        j1 = aj[i];
        Object obj = new FileOutputStream(((File) (obj1)));
        j1.c().compress(android.graphics.Bitmap.CompressFormat.PNG, 90, ((java.io.OutputStream) (obj)));
        obj1 = String.valueOf(((File) (obj1)).getAbsolutePath());
        if (((String) (obj1)).length() == 0) goto _L4; else goto _L3
_L3:
        "Saved to URI: ".concat(((String) (obj1)));
_L6:
        Exception exception1;
        try
        {
            ((FileOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
_L7:
        afile[i].setReadable(true, false);
        i++;
          goto _L5
_L4:
        new String("Saved to URI: ");
          goto _L6
        exception1;
_L10:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
          goto _L7
        aj;
        obj = null;
_L9:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw aj;
_L2:
        aj = new Intent("android.intent.action.SEND_MULTIPLE");
        aj.setType("plain/text");
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("Translate Dogfood Sample Images");
        int i1;
        try
        {
            PackageInfo packageinfo = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
            String s1 = String.valueOf(packageinfo.versionName);
            int k = packageinfo.versionCode;
            ((StringBuilder) (obj)).append((new StringBuilder(String.valueOf(s1).length() + 15)).append("[").append(s1).append("(").append(k).append(")]").toString());
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        aj.putExtra("android.intent.extra.EMAIL", new String[] {
            "translate-dogfood-images@google.com"
        });
        aj.putExtra("android.intent.extra.SUBJECT", ((StringBuilder) (obj)).toString());
        obj = new ArrayList();
        i1 = afile.length;
        for (int l = ((flag) ? 1 : 0); l < i1; l++)
        {
            ((ArrayList) (obj)).add(Uri.fromFile(afile[l]));
        }

        aj.putParcelableArrayListExtra("android.intent.extra.STREAM", ((ArrayList) (obj)));
        return aj;
        aj;
        if (true) goto _L9; else goto _L8
_L8:
        Exception exception;
        exception;
        exception = null;
          goto _L10
    }

    public static a a(Context context)
    {
        if (b == null)
        {
            context = new a(context);
            b = context;
            return context;
        } else
        {
            return null;
        }
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((j[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (Intent)obj;
        a.startActivity(((Intent) (obj)));
        b = null;
    }

}
