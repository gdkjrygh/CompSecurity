// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.roidapp.baselib.c.c;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            BlemishImageView, Inpaint, t

final class k extends c
{

    final BlemishImageView a;
    private boolean b;
    private Bitmap c;

    private k(BlemishImageView blemishimageview)
    {
        a = blemishimageview;
        super();
    }

    k(BlemishImageView blemishimageview, byte byte0)
    {
        this(blemishimageview);
    }

    private transient Void a(Object aobj[])
    {
        Object obj = com.roidapp.imagelib.retouch.BlemishImageView.c(a);
        obj;
        JVM INSTR monitorenter ;
        Bitmap bitmap;
        Paint paint;
        int i;
        bitmap = (Bitmap)aobj[0];
        aobj = (Rect)aobj[1];
        paint = new Paint();
        paint.setColor(0xff00ff00);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        i = ((Rect) (aobj)).width();
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        c = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
        (new Canvas(c)).drawCircle(i / 2, i / 2, i / 2, paint);
        if (isCancelled() || BlemishImageView.d(a) == null || bitmap == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (bitmap.isRecycled() || aobj == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        if (c != null)
        {
            Inpaint inpaint = BlemishImageView.d(a);
            Bitmap bitmap1 = c;
            int j = ((Rect) (aobj)).left;
            int l = ((Rect) (aobj)).right;
            int i1 = ((Rect) (aobj)).top;
            int j1 = ((Rect) (aobj)).bottom;
            int k1 = bitmap.getWidth();
            int l1 = bitmap.getHeight();
            int i2 = bitmap.getRowBytes();
            inpaint.Inpaint(bitmap, bitmap1, new int[] {
                j, l, i1, j1
            }, k1, l1, i2);
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        aobj;
        obj;
        JVM INSTR monitorexit ;
        throw aobj;
        aobj;
        ((OutOfMemoryError) (aobj)).printStackTrace();
        c = null;
        obj;
        JVM INSTR monitorexit ;
        return null;
        aobj;
        ((Exception) (aobj)).printStackTrace();
        c = null;
        obj;
        JVM INSTR monitorexit ;
        return null;
    }

    public final boolean a()
    {
        return b;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected final void onCancelled()
    {
        b = true;
    }

    protected final void onPostExecute(Object obj)
    {
        b = true;
        if (BlemishImageView.b(a) != null)
        {
            BlemishImageView.b(a).b();
        }
        if (c != null && !c.isRecycled())
        {
            c.recycle();
            c = null;
        }
        a.invalidate();
        cancel(true);
    }

    protected final void onPreExecute()
    {
        if (BlemishImageView.b(a) != null)
        {
            BlemishImageView.b(a).a();
        }
        b = false;
    }
}
