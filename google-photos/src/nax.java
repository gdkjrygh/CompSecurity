// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.BitmapFactory;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

final class nax
    implements nba
{

    private static final AtomicReference a = new AtomicReference();
    private static final onh b = new onh("debug.bitmap.reuse");

    nax()
    {
    }

    public final Object a(nbc nbc1, ByteBuffer bytebuffer)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        bytebuffer.position(0);
        oqk oqk1 = new oqk(bytebuffer);
        options.inTempStorage = (byte[])a.getAndSet(null);
        if (options.inTempStorage == null)
        {
            options.inTempStorage = new byte[16384];
        }
        options.inSampleSize = 1;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(oqk1, null, options);
            options.inJustDecodeBounds = false;
            bytebuffer.rewind();
            if (options.outWidth > 0 && options.outHeight > 0 && (android.os.Build.VERSION.SDK_INT >= 19 || "image/jpeg".equalsIgnoreCase(options.outMimeType) || "image/png".equalsIgnoreCase(options.outMimeType)))
            {
                options.inBitmap = nbc1.a.a(options.outWidth, options.outHeight);
            }
        }
        Object obj = options.outMimeType;
        long l = SystemClock.currentThreadTimeMillis();
        try
        {
            obj = BitmapFactory.decodeStream(oqk1, null, options);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (((nxb) (nbc1)).m)
            {
                nbc.a("Failed to reuse bitmap", illegalargumentexception);
            }
            bytebuffer.rewind();
            illegalargumentexception = options.inBitmap;
            options.inBitmap = null;
            illegalargumentexception = BitmapFactory.decodeStream(oqk1, null, options);
        }
        bytebuffer.rewind();
        a.set(options.inTempStorage);
        nbc1.a(l, options.outMimeType, bytebuffer.remaining(), options.outWidth, options.outHeight, ((android.graphics.Bitmap) (obj)));
        return obj;
    }

}
