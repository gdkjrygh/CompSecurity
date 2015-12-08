// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.j;

// Referenced classes of package com.google.android.apps.unveil.sensors:
//            b

public final class a extends j
{

    private static final af c = new af();
    private final Size d;
    private byte e[];
    private Bitmap f;
    private byte g[];
    private BitmapDrawable h;
    private volatile boolean i;

    public a(Bitmap bitmap, int k)
    {
        this(bitmap, k, (byte)0);
    }

    private a(Bitmap bitmap, int k, byte byte0)
    {
        super(k, -1);
        if (bitmap.getConfig() != android.graphics.Bitmap.Config.RGB_565)
        {
            c.c("Bitmap was %s instead of the required RGB_565!", new Object[] {
                bitmap.getConfig()
            });
        }
        d = new Size(bitmap.getWidth(), bitmap.getHeight());
        f = bitmap;
    }

    public a(byte abyte0[], int k, int l)
    {
        super(0);
        d = new Size(k, l);
        e = (byte[])abyte0.clone();
        abyte0 = new Thread(new b(this, k, l));
        abyte0.setName("BitmapPicture processing thread to convert YUV420 to RGB565.");
        abyte0.start();
    }

    static Bitmap a(a a1, Bitmap bitmap)
    {
        a1.f = bitmap;
        return bitmap;
    }

    static byte[] a(a a1)
    {
        return a1.e;
    }

    static Bitmap b(a a1)
    {
        return a1.f;
    }

    static boolean c(a a1)
    {
        a1.i = true;
        return true;
    }

    static af g()
    {
        return c;
    }

    public final Size b()
    {
        this;
        JVM INSTR monitorenter ;
        Size size;
        f();
        size = d;
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
_L1:
        Bitmap bitmap;
        if (i)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        bitmap = f;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        wait();
          goto _L1
        Object obj;
        obj;
        c.f("Exception!", new Object[0]);
          goto _L1
        obj;
        throw obj;
        obj = f;
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
    }

    public final int d()
    {
        f();
        return d.width * d.height << 2;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (!super.b) goto _L2; else goto _L1
_L1:
        c.c("Requested recycling, but bitmap picture is already recycled.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.e();
        if (f != null)
        {
            f.recycle();
        }
        if (h != null)
        {
            h.getBitmap().recycle();
        }
        e = null;
        f = null;
        h = null;
        g = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
