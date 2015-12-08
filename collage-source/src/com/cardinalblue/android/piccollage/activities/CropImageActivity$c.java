// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.a.b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            CropImageActivity

private class <init> extends b
{

    final CropImageActivity a;
    private Uri b;
    private a c;

    private void a(<init> <init>1)
    {
        c = <init>1;
    }

    static void a(c c1, c c2)
    {
        c1.a(c2);
    }

    protected transient Bitmap a(Void avoid[])
    {
        int i = 1;
        avoid = null;
        if (b != null)
        {
            try
            {
                avoid = com.cardinalblue.android.piccollage.activities.CropImageActivity.b(a).openInputStream(b);
                Object obj = new android.graphics.s();
                obj.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(avoid, null, ((android.graphics.s) (obj)));
                avoid.close();
                if (((android.graphics.s) (obj)).outHeight > 2048 || ((android.graphics.s) (obj)).outWidth > 2048)
                {
                    i = (int)Math.pow(2D, (int)Math.round(Math.log(2048D / (double)Math.max(((android.graphics.s) (obj)).outHeight, ((android.graphics.s) (obj)).outWidth)) / Math.log(0.5D)));
                }
                obj = new android.graphics.s();
                obj.inSampleSize = i;
                avoid = com.cardinalblue.android.piccollage.activities.CropImageActivity.b(a).openInputStream(b);
                obj = BitmapFactory.decodeStream(avoid, null, ((android.graphics.s) (obj)));
                avoid.close();
                avoid = com.cardinalblue.android.b.a.a(((Bitmap) (obj)), k.a(a.getApplicationContext(), b), 2);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("CropImageActivity", (new StringBuilder()).append("file ").append(b).append(" not found").toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("CropImageActivity", (new StringBuilder()).append("Load error: ").append(b).toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                Log.e("CropImageActivity", (new StringBuilder()).append("Out Of Memory : ").append(b).toString());
                return null;
            }
        }
        return avoid;
    }

    protected void a(Bitmap bitmap)
    {
        super.onPostExecute(bitmap);
        if (c != null)
        {
            c.a(bitmap);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (c != null)
        {
            c.a();
        }
    }

    private (CropImageActivity cropimageactivity, Uri uri)
    {
        a = cropimageactivity;
        super();
        b = uri;
    }

    b(CropImageActivity cropimageactivity, Uri uri, b b1)
    {
        this(cropimageactivity, uri);
    }
}
