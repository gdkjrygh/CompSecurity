// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.j;

public final class t extends j
{

    private static final af c = new af();
    private byte d[];
    private byte e[];
    private BitmapDrawable f;
    private Size g;

    public t(byte abyte0[], int i)
    {
        super(i);
        f = null;
        g = null;
        d = abyte0;
    }

    public final Size b()
    {
        this;
        JVM INSTR monitorenter ;
        Size size;
        f();
        if (g == null)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(d, 0, d.length, options);
            g = new Size(options.outWidth, options.outHeight);
        }
        size = g;
        this;
        JVM INSTR monitorexit ;
        return size;
        Exception exception;
        exception;
        throw exception;
    }

    public final Bitmap c()
    {
        this;
        JVM INSTR monitorenter ;
        f();
        if (f == null) goto _L2; else goto _L1
_L1:
        Object obj = f.getBitmap();
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
_L2:
        Bitmap bitmap;
        obj = new android.graphics.BitmapFactory.Options();
        obj.inPurgeable = true;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        bitmap = BitmapFactory.decodeByteArray(d, 0, d.length, ((android.graphics.BitmapFactory.Options) (obj)));
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        c.e("Critical failure when decoding JPEG", new Object[0]);
        obj = null;
        continue; /* Loop/switch isn't completed */
        if (bitmap.getConfig() == android.graphics.Bitmap.Config.RGB_565)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = bitmap.copy(android.graphics.Bitmap.Config.RGB_565, false);
        bitmap.recycle();
        bitmap = ((Bitmap) (obj));
        obj = bitmap;
        if (g != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        g = new Size(bitmap.getWidth(), bitmap.getHeight());
        obj = bitmap;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final int d()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        f();
        i = d.length;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (!super.b) goto _L2; else goto _L1
_L1:
        (new af()).c("Requested recycling, but jpeg picture is already recycled.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.e();
        if (f != null)
        {
            f.getBitmap().recycle();
        }
        d = null;
        e = null;
        f = null;
        g = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
