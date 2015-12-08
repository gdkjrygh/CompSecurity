// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

public class iv
    implements mau
{

    final Context a;
    android.graphics.BitmapFactory.Options b;
    final Object c;
    int d;
    int e;
    int f;

    public iv()
    {
    }

    iv(Context context)
    {
        b = null;
        c = new Object();
        d = 2;
        e = 2;
        f = 1;
        a = context;
    }

    private Bitmap a(Uri uri, android.graphics.BitmapFactory.Options options)
    {
        Uri uri1;
        uri1 = null;
        if (uri == null || a == null)
        {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        uri = a.getContentResolver().openInputStream(uri);
        uri1 = uri;
        options = BitmapFactory.decodeStream(uri, null, options);
        if (uri != null)
        {
            try
            {
                uri.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                Log.w("PrintHelperKitkat", "close fail ", uri);
                return options;
            }
        }
        return options;
        uri;
        if (uri1 != null)
        {
            try
            {
                uri1.close();
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.BitmapFactory.Options options)
            {
                Log.w("PrintHelperKitkat", "close fail ", options);
            }
        }
        throw uri;
    }

    Bitmap a(Uri uri, int i)
    {
        int j;
        int l;
        int i1;
        j = 1;
        if (i <= 0 || uri == null || a == null)
        {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        a(uri, options);
        l = options.outWidth;
        i1 = options.outHeight;
        if (l > 0 && i1 > 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        for (int k = Math.max(l, i1); k > i;)
        {
            k >>>= 1;
            j <<= 1;
        }

        if (j <= 0 || Math.min(l, i1) / j <= 0) goto _L1; else goto _L3
_L3:
        android.graphics.BitmapFactory.Options options1;
        synchronized (c)
        {
            b = new android.graphics.BitmapFactory.Options();
            b.inMutable = true;
            b.inSampleSize = j;
            options1 = b;
        }
        obj = a(uri, options1);
        synchronized (c)
        {
            b = null;
        }
        return ((Bitmap) (obj));
        obj;
        uri;
        JVM INSTR monitorexit ;
        throw obj;
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        Exception exception;
        exception;
        synchronized (c)
        {
            b = null;
        }
        throw exception;
        exception1;
        uri;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public lzx a(jyw jyw)
    {
        return new mgu(this, jyw);
    }
}
