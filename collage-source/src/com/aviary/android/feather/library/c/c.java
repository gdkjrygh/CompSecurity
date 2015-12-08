// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.c;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.d;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.library.c:
//            e, d, b

public class c
{

    static com.aviary.android.feather.common.a.a.c a;

    public c()
    {
    }

    public static int a(int i, int j, int k, int l, int i1, e e1)
    {
        double d1;
        double d2;
        if (i1 == 0 || i1 == 180)
        {
            d2 = i;
            d1 = j;
        } else
        {
            d2 = j;
            d1 = i;
        }
        if (e1 != null)
        {
            e1.a((int)d2, (int)d1);
        }
        return (int)Math.ceil(Math.max(d2 / (double)k, d1 / (double)l));
    }

    public static Bitmap a(Context context, Uri uri, int i, int j, e e1)
    {
        a.b((new StringBuilder()).append("decode: ").append(uri).toString());
        Assert.assertNotNull(e1);
        Object obj = null;
        int ai[] = new int[2];
        e1.a(uri);
        InputStream inputstream = a(context, uri);
        if (inputstream == null)
        {
            return null;
        }
        a.a("reading exif");
        it.sephiroth.android.library.b.c c1 = new it.sephiroth.android.library.b.c();
        int i1;
        boolean flag;
        try
        {
            c1.a(inputstream, 63);
            int ai1[] = c1.c();
            a.b("(exif) image size: %dx%d", new Object[] {
                Integer.valueOf(ai1[0]), Integer.valueOf(ai1[1])
            });
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        e1.a(c1.a());
        i1 = com.aviary.android.feather.library.c.d.a(c1);
        e1.a(i1);
        a.b("orientation: %d", new Object[] {
            Integer.valueOf(i1)
        });
        d.a(inputstream);
        inputstream = a(context, uri);
        flag = a(inputstream, ai);
        d.a(inputstream);
        if (flag)
        {
            int l = a(ai[0], ai[1], (int)((double)i * 1.2D), (int)((double)j * 1.2D), i1, e1);
            obj = a();
            float f = i;
            float f1 = j;
            int k = l;
            if ((float)ai[1] < f * 1.5F + 100F)
            {
                k = l;
                if ((float)ai[1] < f1 * 1.5F)
                {
                    a.b("try to use sample size = 1");
                    k = 1;
                }
            }
            obj.inSampleSize = k;
            context = a(context, uri, ((android.graphics.BitmapFactory.Options) (obj)), i, j, i1, 0);
            obj = context;
            if (context != null)
            {
                obj = context;
                if (e1 != null)
                {
                    e1.b(context.getWidth(), context.getHeight());
                    e1.a(i1);
                    obj = context;
                }
            }
        }
        a.a("returning bitmap");
        return ((Bitmap) (obj));
    }

    static Bitmap a(Context context, Uri uri, android.graphics.BitmapFactory.Options options, int i, int j, int k, int l)
    {
        Object obj1;
        obj1 = null;
        a.b((new StringBuilder()).append("decodeBitmap: ").append(options.inSampleSize).append(", maxSize: ").append(i).append("x").append(j).append(", pass: ").append(l).toString());
        if (l <= 10) goto _L2; else goto _L1
_L1:
        InputStream inputstream;
        return ((Bitmap) (obj1));
_L2:
        if ((inputstream = a(context, uri)) == null) goto _L1; else goto _L3
_L3:
        a.c("opened input stream");
        Object obj = BitmapFactory.decodeStream(inputstream, null, options);
        d.a(inputstream);
        if (obj == null) goto _L5; else goto _L4
_L4:
        Bitmap bitmap;
        a.a((new StringBuilder()).append("loaded bitmap: ").append(((Bitmap) (obj)).getWidth()).append("x").append(((Bitmap) (obj)).getHeight()).toString());
        bitmap = com.aviary.android.feather.library.c.b.a(((Bitmap) (obj)), i, j, k);
        a.a((new StringBuilder()).append("resized: ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString());
        obj1 = bitmap;
        if (obj == bitmap) goto _L1; else goto _L6
_L6:
        ((Bitmap) (obj)).recycle();
        return bitmap;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        obj1 = obj;
        obj = outofmemoryerror;
_L7:
        a.d(((OutOfMemoryError) (obj)).getMessage());
        d.a(inputstream);
        if (obj1 != null)
        {
            ((Bitmap) (obj1)).recycle();
        }
        options.inSampleSize = options.inSampleSize + 1;
        return a(context, uri, options, i, j, k, l + 1);
        obj;
        obj1 = null;
        if (true) goto _L7; else goto _L5
_L5:
        return ((Bitmap) (obj));
    }

    static android.graphics.BitmapFactory.Options a()
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inScaled = false;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        options.inDither = false;
        options.inJustDecodeBounds = false;
        options.inPurgeable = false;
        options.inInputShareable = false;
        options.inTempStorage = new byte[16384];
        return options;
    }

    public static InputStream a(Context context, Uri uri)
    {
        if (uri != null)
        {
            String s = uri.getScheme();
            if (s == null || "file".equals(s))
            {
                if ("file".equals(s) && uri.getPath().startsWith("/android_asset/"))
                {
                    try
                    {
                        context = context.getAssets().open(uri.getPath().substring("/android_asset/".length()));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context.printStackTrace();
                        return null;
                    }
                    return context;
                } else
                {
                    return a(uri.getPath());
                }
            }
            if ("content".equals(s))
            {
                return b(context, uri);
            }
            if ("http".equals(s) || "https".equals(s))
            {
                return a(uri);
            }
        }
        return null;
    }

    static InputStream a(Uri uri)
    {
        HttpURLConnection httpurlconnection;
        int i;
        try
        {
            uri = new URL(uri.toString());
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            uri.printStackTrace();
            return null;
        }
        try
        {
            httpurlconnection = (HttpURLConnection)uri.openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            uri.printStackTrace();
            return null;
        }
        httpurlconnection.setInstanceFollowRedirects(false);
        try
        {
            i = httpurlconnection.getResponseCode();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            uri.printStackTrace();
            return null;
        }
        if (i == 301 || i == 302 || i == 303)
        {
            return a(Uri.parse(httpurlconnection.getHeaderField("Location")));
        }
        try
        {
            uri = (InputStream)uri.getContent();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            uri.printStackTrace();
            return null;
        }
        return uri;
    }

    static InputStream a(String s)
    {
        a.c("openFileInputStream: %s", new Object[] {
            s
        });
        try
        {
            s = new FileInputStream(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public static boolean a(InputStream inputstream, int ai[])
    {
        a.b("decodeImageBounds");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputstream, null, options);
        if (options.outHeight > 0 && options.outWidth > 0)
        {
            ai[0] = options.outWidth;
            ai[1] = options.outHeight;
            return true;
        } else
        {
            return false;
        }
    }

    static InputStream b(Context context, Uri uri)
    {
        a.c("openContentInputStream: %s", new Object[] {
            uri
        });
        if (!com.aviary.android.feather.common.utils.a.e)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        InputStream inputstream = c(context, uri);
        if (inputstream != null)
        {
            return inputstream;
        }
        break MISSING_BLOCK_LABEL_42;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception.printStackTrace();
        InputStream inputstream1;
        try
        {
            inputstream1 = context.getContentResolver().openInputStream(uri);
        }
        catch (FileNotFoundException filenotfoundexception1)
        {
            filenotfoundexception1.printStackTrace();
            context = d.a(context, uri);
            if (context != null)
            {
                return a(context);
            } else
            {
                return null;
            }
        }
        return inputstream1;
    }

    static InputStream c(Context context, Uri uri)
        throws FileNotFoundException
    {
        a.b("openParcelFileDescriptor: %s", new Object[] {
            uri
        });
        context = context.getContentResolver().openFileDescriptor(uri, "r");
        a.b("parcelFileDescriptor: %s", new Object[] {
            context
        });
        return new android.os.ParcelFileDescriptor.AutoCloseInputStream(context);
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("DecodeUtils", com.aviary.android.feather.common.a.a.d.a);
    }
}
