// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;

public class cko
{

    private static final String b = cko.getSimpleName();
    public int a;

    public cko()
    {
        this(4096);
    }

    private cko(int i)
    {
        a = 4096;
    }

    static Bitmap a(ckp ckp1, android.graphics.BitmapFactory.Options options)
    {
        try
        {
            ckp1 = ckp1.a(options);
            if (options.inBitmap != ckp1 && options.inBitmap != null)
            {
                Log.w(b, "allocated a new bitmap when trying to re-use an existing one");
            }
        }
        // Misplaced declaration of an exception variable
        catch (ckp ckp1)
        {
            if (options.inBitmap != null)
            {
                Log.e(b, "IllegalArgumentException while decoding to reusable bitmap", ckp1);
            } else
            {
                Log.e(b, "IllegalArgumentException while decoding bitmap", ckp1);
            }
            return null;
        }
        return ckp1;
    }

    static android.graphics.BitmapFactory.Options a(ckp ckp1)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ckp1.a(options);
        options.inJustDecodeBounds = false;
        return options;
    }

    public final Bitmap a(Uri uri, ContentResolver contentresolver, int i)
    {
        Uri uri1;
        aln.a("decodeSampledBitmapFromUri");
        uri1 = null;
        uri = contentresolver.openFileDescriptor(uri, "r");
        uri1 = uri;
        contentresolver = new ckp(uri.getFileDescriptor());
        uri1 = uri;
        android.graphics.BitmapFactory.Options options = a(((ckp) (contentresolver)));
        uri1 = uri;
        a(options, i);
        uri1 = uri;
        contentresolver = a(((ckp) (contentresolver)), options);
        if (uri != null)
        {
            uri.close();
        }
        aln.a();
        return contentresolver;
        uri;
        if (uri1 != null)
        {
            uri1.close();
        }
        aln.a();
        throw uri;
    }

    void a(android.graphics.BitmapFactory.Options options, int i)
    {
        int j = a;
        options.inSampleSize = Math.max((int)Math.sqrt((float)(options.outHeight * options.outWidth) / (float)i), Math.max(1, (int)Math.pow(2D, Math.ceil(Math.log((float)Math.max(options.outWidth, options.outHeight) / (float)j) / Math.log(2D)))));
    }

}
