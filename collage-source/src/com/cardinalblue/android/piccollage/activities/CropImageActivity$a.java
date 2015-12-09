// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.graphics.Bitmap;
import android.util.Log;
import com.cardinalblue.android.piccollage.controller.a.b;
import com.cardinalblue.android.piccollage.view.crop.CropImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            CropImageActivity

private class e extends b
{

    final CropImageActivity a;
    private CropImageView b;
    private int c;
    private int d;
    private String e;
    private a f;

    static void a(e e1, e e2)
    {
        e1.a(e2);
    }

    private void a(a a1)
    {
        f = a1;
    }

    private boolean a(Bitmap bitmap)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        Object obj = new File(e);
        if (((File) (obj)).exists() || !((File) (obj)).createNewFile()) goto _L2; else goto _L1
_L1:
        FileOutputStream fileoutputstream = new FileOutputStream(((File) (obj)));
        obj = fileoutputstream;
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = fileoutputstream;
        flag = bitmap.compress(android.graphics.t.JPEG, 90, fileoutputstream);
        obj = fileoutputstream;
_L9:
        flag1 = flag;
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).flush();
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                bitmap.printStackTrace();
                return flag;
            }
            flag1 = flag;
        }
_L4:
        return flag1;
        bitmap;
        fileoutputstream = null;
_L7:
        obj = fileoutputstream;
        Log.e("CropImageActivity", (new StringBuilder()).append("Cannot open file: ").append(e).toString(), bitmap);
        if (fileoutputstream == null) goto _L4; else goto _L3
_L3:
        try
        {
            fileoutputstream.flush();
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return false;
        }
        return false;
        bitmap;
        obj = null;
_L6:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).flush();
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw bitmap;
        bitmap;
        if (true) goto _L6; else goto _L5
_L5:
        bitmap;
          goto _L7
_L2:
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected transient Object a(Void avoid[])
    {
label0:
        {
            Bitmap bitmap = b.b(c, d);
            avoid = bitmap;
            if (e != null)
            {
                if (!a(bitmap))
                {
                    break label0;
                }
                avoid = e;
            }
            return avoid;
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute(obj);
        if (f != null)
        {
            f.a(obj);
        }
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        if (f != null)
        {
            f.a();
        }
    }

    public (CropImageActivity cropimageactivity, CropImageView cropimageview, int i, int j, String s)
    {
        a = cropimageactivity;
        super();
        b = cropimageview;
        c = i;
        d = j;
        e = s;
    }
}
