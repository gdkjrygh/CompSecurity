// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.appboy.f.a;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

// Referenced classes of package com.appboy:
//            f

public class d
{

    private static final String a;

    public d()
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
        bitmap = null;
        obj = null;
        obj1 = null;
        obj2 = null;
        bitmap1 = null;
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        com.appboy.f.a.b(a, "Null or empty Url string passed to image bitmap download. Not attempting download.");
_L4:
        return bitmap1;
_L2:
        bitmap1 = bitmap;
        Bitmap bitmap2 = obj;
        Bitmap bitmap3 = obj1;
        Bitmap bitmap4 = obj2;
        InputStream inputstream;
        try
        {
            inputstream = (new URL(s)).openStream();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            com.appboy.f.a.c(a, String.format("Out of Memory Error in image bitmap download for Url: %s.", new Object[] {
                s
            }), outofmemoryerror);
            return bitmap1;
        }
        catch (UnknownHostException unknownhostexception)
        {
            com.appboy.f.a.c(a, String.format("Unknown Host Exception in image bitmap download for Url: %s. Device may be offline.", new Object[] {
                s
            }), unknownhostexception);
            return bitmap2;
        }
        catch (MalformedURLException malformedurlexception)
        {
            com.appboy.f.a.c(a, String.format("Malformed URL Exception in image bitmap download for Url: %s. Image Url may be corrupted.", new Object[] {
                s
            }), malformedurlexception);
            return bitmap3;
        }
        catch (Exception exception)
        {
            com.appboy.f.a.c(a, String.format("Exception in image bitmap download for Url: %s", new Object[] {
                s
            }), exception);
            return bitmap4;
        }
        bitmap1 = bitmap;
        bitmap2 = obj;
        bitmap3 = obj1;
        bitmap4 = obj2;
        bitmap = BitmapFactory.decodeStream(inputstream);
        bitmap1 = bitmap;
        if (inputstream == null) goto _L4; else goto _L3
_L3:
        bitmap1 = bitmap;
        bitmap2 = bitmap;
        bitmap3 = bitmap;
        bitmap4 = bitmap;
        inputstream.close();
        return bitmap;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            a, com/appboy/d.getName()
        });
    }
}
