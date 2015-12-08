// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ThumbnailUtils;
import android.widget.ImageView;
import com.roidapp.baselib.a.a;
import com.roidapp.baselib.b.i;
import com.roidapp.baselib.c.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.roidapp.imagelib.c:
//            b, h, a, f, 
//            e

final class g extends c
{

    private final WeakReference a;
    private final h b;
    private final i c;

    public g(ImageView imageview, h h1, i j)
    {
        a = new WeakReference(imageview);
        b = h1;
        c = j;
    }

    private transient Bitmap a(Object aobj[])
    {
        if (isCancelled())
        {
            return null;
        }
        com.roidapp.imagelib.c.b.a().lock();
        boolean flag = ((Boolean)aobj[0]).booleanValue();
        if (flag)
        {
            com.roidapp.imagelib.c.b.a().unlock();
            return null;
        }
        int j;
        int k;
        j = b.d.a;
        k = b.d.b;
        aobj = ((f)aobj[1]).a();
        if (aobj == null)
        {
            com.roidapp.imagelib.c.b.a().unlock();
            return null;
        }
        Bitmap bitmap;
        com.roidapp.baselib.a.a.a();
        bitmap = com.roidapp.baselib.a.a.a(((java.io.FileInputStream) (aobj)), j, k, b.d.c);
        if (bitmap == null)
        {
            com.roidapp.imagelib.c.b.a().unlock();
            return null;
        }
        int l = b.d.d;
        aobj = bitmap;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        aobj = new Matrix();
        ((Matrix) (aobj)).postRotate(l);
        aobj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (aobj)), true);
        if (aobj == bitmap)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (!bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        bitmap = ((Bitmap) (aobj));
        if (b.c == null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap1 = b.c.a(((Bitmap) (aobj)), b);
        Object obj = ((Object) (aobj));
        if (bitmap1 == null) goto _L4; else goto _L3
_L3:
        obj = ((Object) (aobj));
        if (aobj == bitmap1) goto _L4; else goto _L5
_L5:
        if (aobj == null) goto _L7; else goto _L6
_L6:
        if (!((Bitmap) (aobj)).isRecycled())
        {
            ((Bitmap) (aobj)).recycle();
        }
          goto _L7
_L4:
        if (bitmap1 == null) goto _L9; else goto _L8
_L8:
        bitmap = ((Bitmap) (obj));
        if (!bitmap1.isRecycled()) goto _L2; else goto _L9
_L9:
        ((Bitmap) (obj)).recycle();
        bitmap = null;
_L2:
        aobj = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        aobj = bitmap;
        if (!bitmap.isRecycled())
        {
            aobj = ThumbnailUtils.extractThumbnail(bitmap, j, k, 2);
        }
        com.roidapp.imagelib.c.b.a().unlock();
        return ((Bitmap) (aobj));
        aobj;
        com.roidapp.imagelib.c.b.a().unlock();
        throw aobj;
_L7:
        obj = bitmap1;
        if (true) goto _L4; else goto _L10
_L10:
    }

    static h a(g g1)
    {
        return g1.b;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        ImageView imageview;
label0:
        {
            obj = (Bitmap)obj;
            if (!isCancelled() && obj != null)
            {
                c.a(b.a, ((Bitmap) (obj)));
                imageview = (ImageView)a.get();
                if (imageview != null)
                {
                    g g1 = (g)imageview.getTag();
                    if (g1 != null && g1 == this)
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        imageview.setImageBitmap(((Bitmap) (obj)));
    }
}
