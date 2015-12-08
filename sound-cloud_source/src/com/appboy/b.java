// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import com.appboy.f.d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

// Referenced classes of package com.appboy:
//            d

public class b
{

    private static final String a;

    public b()
    {
    }

    public static int a(int i)
    {
        return (i * 192) / 160;
    }

    public static Bitmap a(String s)
    {
        Bitmap bitmap;
        Bitmap bitmap1;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        bitmap = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj = null;
        bitmap1 = obj;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length() != 0) goto _L4; else goto _L3
_L3:
        bitmap1 = obj;
_L2:
        return bitmap1;
_L4:
        bitmap1 = bitmap;
        Bitmap bitmap2 = obj1;
        Bitmap bitmap3 = obj2;
        Bitmap bitmap4 = obj3;
        InputStream inputstream;
        try
        {
            inputstream = (new URL(s)).openStream();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            String.format("Out of Memory Error in image bitmap download for Url: %s.", new Object[] {
                s
            });
            return bitmap1;
        }
        catch (UnknownHostException unknownhostexception)
        {
            String.format("Unknown Host Exception in image bitmap download for Url: %s. Device may be offline.", new Object[] {
                s
            });
            return bitmap2;
        }
        catch (MalformedURLException malformedurlexception)
        {
            String.format("Malformed URL Exception in image bitmap download for Url: %s. Image Url may be corrupted.", new Object[] {
                s
            });
            return bitmap3;
        }
        catch (Exception exception)
        {
            String.format("Exception in image bitmap download for Url: %s", new Object[] {
                s
            });
            return bitmap4;
        }
        bitmap1 = bitmap;
        bitmap2 = obj1;
        bitmap3 = obj2;
        bitmap4 = obj3;
        bitmap = BitmapFactory.decodeStream(inputstream);
        bitmap1 = bitmap;
        if (inputstream == null) goto _L2; else goto _L5
_L5:
        bitmap1 = bitmap;
        bitmap2 = bitmap;
        bitmap3 = bitmap;
        bitmap4 = bitmap;
        inputstream.close();
        return bitmap;
    }

    public static Uri a(Context context, Bitmap bitmap, String s, String s1)
    {
        while (context == null || bitmap == null || s == null) 
        {
            return null;
        }
        try
        {
            s1 = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(s1).toString());
            if (!s1.exists())
            {
                s1.mkdirs();
            }
            s = new File(s1, (new StringBuilder()).append(s).append(".png").toString());
            (new StringBuilder("Storing image locally at ")).append(s.getAbsolutePath());
            s1 = new FileOutputStream(s);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, s1);
            s1.flush();
            s1.close();
            MediaScannerConnection.scanFile(context, new String[] {
                s.getAbsolutePath()
            }, null, null);
            context = Uri.fromFile(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static boolean a(Context context)
    {
        return context != null && d.a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/b.getName()
        });
    }
}
