// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            a, f

public static class nit> extends com.cardinalblue.android.piccollage.lib.a
{

    public Bitmap a(int i, android.graphics.ap.Config config)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj2;
        Uri uri;
        obj1 = null;
        obj = null;
        uri = a(a);
        obj2 = k.a().getContentResolver().openInputStream(uri);
        android.graphics.apFactory.Options options = new android.graphics.apFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(((InputStream) (obj2)), null, options);
        i = a(options, i);
        if (obj2 != null)
        {
            if (false)
            {
                try
                {
                    ((InputStream) (obj2)).close();
                }
                // Misplaced declaration of an exception variable
                catch (android.graphics.ap.Config config)
                {
                    throw new NullPointerException();
                }
            } else
            {
                ((InputStream) (obj2)).close();
            }
        }
        obj1 = k.a().getContentResolver().openInputStream(uri);
        obj2 = new android.graphics.apFactory.Options();
        obj2.inPreferredConfig = config;
        obj2.inSampleSize = i;
        config = com.cardinalblue.android.b.a.a(BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.apFactory.Options) (obj2))), k.a(k.a(), uri), 2);
        if (config != null) goto _L2; else goto _L1
_L1:
        try
        {
            throw new IOException((new StringBuilder()).append("can't decode bitmap, this url is not available : ").append(uri).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        throw obj;
        config;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        if (obj == null) goto _L6; else goto _L5
_L5:
        ((InputStream) (obj1)).close();
_L4:
        try
        {
            throw config;
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.ap.Config config) { }
        if (config instanceof OutOfMemoryError)
        {
            System.gc();
        }
        obj = new IOException((new StringBuilder()).append("[ContentkImageSource] : ").append(config).toString());
        ((IOException) (obj)).setStackTrace(config.getStackTrace());
        throw obj;
        obj;
        throw obj;
        config;
_L7:
        if (obj2 != null)
        {
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj2)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    ((Throwable) (obj)).addSuppressed(((Throwable) (obj1)));
                }
            } else
            {
                ((InputStream) (obj2)).close();
            }
        }
        throw config;
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        ((InputStream) (obj1)).close();
        return config;
        config;
        throw new NullPointerException();
        ((InputStream) (obj1)).close();
        return config;
        obj1;
        ((Throwable) (obj)).addSuppressed(((Throwable) (obj1)));
          goto _L4
_L6:
        ((InputStream) (obj1)).close();
          goto _L4
        config;
        obj = obj1;
          goto _L7
    }

    protected Uri a(String s)
        throws IOException
    {
        String as[] = s.split("content://");
        if (as.length > 2)
        {
            f.a(new IllegalArgumentException((new StringBuilder()).append("weird intent uri : ").append(s).toString()));
            String s1 = (new StringBuilder()).append("content://").append(as[as.length - 1]).toString();
            int i = s1.indexOf("/ACTUAL");
            s = s1;
            if (i > 0)
            {
                s = s1.substring(0, i);
            }
            return Uri.parse(s);
        } else
        {
            return super.a(s);
        }
    }

    public void a(ImageView imageview, com.cardinalblue.android.piccollage.lib.f f1)
    {
    }

    public InputStream d()
        throws IOException
    {
        return k.a().getContentResolver().openInputStream(Uri.parse(a));
    }

    public (String s)
    {
        super(s, null);
    }
}
