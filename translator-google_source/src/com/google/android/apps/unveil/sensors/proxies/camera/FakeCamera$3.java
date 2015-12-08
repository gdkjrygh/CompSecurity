// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            FakeCamera, FakeParameters

class val.callback extends Thread
{

    final FakeCamera this$0;
    final android.hardware.eCallback val$callback;

    public void run()
    {
        final Object jpegBytes;
        try
        {
            sleep(100L);
        }
        // Misplaced declaration of an exception variable
        catch (final Object jpegBytes)
        {
            ((InterruptedException) (jpegBytes)).printStackTrace();
        }
        this;
        JVM INSTR monitorenter ;
        if (wFrame.access._mth300(FakeCamera.access$200(FakeCamera.this)) != null)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        jpegBytes = new int[FakeCamera.access$200(FakeCamera.this).frameSize.width * FakeCamera.access$200(FakeCamera.this).frameSize.height];
        ImageUtils.convertYUV420SPToARGB8888(wFrame.access._mth400(FakeCamera.access$200(FakeCamera.this)), ((int []) (jpegBytes)), FakeCamera.access$200(FakeCamera.this).frameSize.width, FakeCamera.access$200(FakeCamera.this).frameSize.height, false);
_L1:
        this;
        JVM INSTR monitorexit ;
        jpegBytes = Bitmap.createBitmap(((int []) (jpegBytes)), FakeCamera.access$200(FakeCamera.this).frameSize.width, FakeCamera.access$200(FakeCamera.this).frameSize.height, android.graphics..ARGB_8888);
        Object obj = FakeCamera.access$500(FakeCamera.this).getPictureSize();
        jpegBytes = Bitmap.createScaledBitmap(((Bitmap) (jpegBytes)), ((Size) (obj)).width, ((Size) (obj)).height, false);
        obj = new ByteArrayOutputStream();
        ((Bitmap) (jpegBytes)).compress(android.graphics.ssFormat.JPEG, FakeCamera.access$500(FakeCamera.this).getInt("jpeg-quality"), ((java.io.OutputStream) (obj)));
        jpegBytes = ((ByteArrayOutputStream) (obj)).toByteArray();
        class _cls1
            implements Runnable
        {

            final FakeCamera._cls3 this$1;
            final byte val$jpegBytes[];

            public void run()
            {
                callback.onPictureTaken(jpegBytes, null);
            }

            _cls1()
            {
                this$1 = FakeCamera._cls3.this;
                jpegBytes = abyte0;
                super();
            }
        }

        FakeCamera.access$600(FakeCamera.this).post(new _cls1());
        return;
        jpegBytes = wFrame.access._mth300(FakeCamera.access$200(FakeCamera.this));
          goto _L1
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    _cls1()
    {
        this$0 = final_fakecamera;
        val$callback = android.hardware.eCallback.this;
        super();
    }
}
