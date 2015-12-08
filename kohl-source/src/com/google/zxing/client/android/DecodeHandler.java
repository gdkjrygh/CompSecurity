// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.client.android.camera.CameraManager;
import com.google.zxing.common.HybridBinarizer;
import java.io.ByteArrayOutputStream;
import java.util.Map;

// Referenced classes of package com.google.zxing.client.android:
//            CaptureActivity

final class DecodeHandler extends Handler
{

    private static final String TAG = com/google/zxing/client/android/DecodeHandler.getSimpleName();
    private final CaptureActivity activity;
    private final MultiFormatReader multiFormatReader = new MultiFormatReader();
    private boolean running;

    DecodeHandler(CaptureActivity captureactivity, Map map)
    {
        running = true;
        multiFormatReader.setHints(map);
        activity = captureactivity;
    }

    private static void bundleThumbnail(PlanarYUVLuminanceSource planaryuvluminancesource, Bundle bundle)
    {
        int ai[] = planaryuvluminancesource.renderThumbnail();
        int i = planaryuvluminancesource.getThumbnailWidth();
        Bitmap bitmap = Bitmap.createBitmap(ai, 0, i, i, planaryuvluminancesource.getThumbnailHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 50, bytearrayoutputstream);
        bundle.putByteArray("barcode_bitmap", bytearrayoutputstream.toByteArray());
        bundle.putFloat("barcode_scaled_factor", (float)i / (float)planaryuvluminancesource.getWidth());
    }

    private void decode(byte abyte0[], int i, int j)
    {
        Object obj;
        long l1 = System.currentTimeMillis();
        obj = null;
        byte abyte1[] = new byte[abyte0.length];
        for (int k = 0; k < j; k++)
        {
            for (int l = 0; l < i; l++)
            {
                abyte1[(l * j + j) - k - 1] = abyte0[k * i + l];
            }

        }

        PlanarYUVLuminanceSource planaryuvluminancesource = activity.getCameraManager().buildLuminanceSource(abyte1, j, i);
        abyte0 = ((byte []) (obj));
        if (planaryuvluminancesource != null)
        {
            abyte0 = new BinaryBitmap(new HybridBinarizer(planaryuvluminancesource));
            long l2;
            try
            {
                abyte0 = multiFormatReader.decodeWithState(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                multiFormatReader.reset();
                abyte0 = ((byte []) (obj));
                continue; /* Loop/switch isn't completed */
            }
            finally
            {
                multiFormatReader.reset();
                throw abyte0;
            }
            multiFormatReader.reset();
        }
_L6:
        obj = activity.getHandler();
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        l2 = System.currentTimeMillis();
        Log.d(TAG, (new StringBuilder()).append("Found barcode in ").append(l2 - l1).append(" ms").toString());
        if (obj != null)
        {
            abyte0 = Message.obtain(((Handler) (obj)), R.id.decode_succeeded, abyte0);
            obj = new Bundle();
            bundleThumbnail(planaryuvluminancesource, ((Bundle) (obj)));
            abyte0.setData(((Bundle) (obj)));
            abyte0.sendToTarget();
        }
_L4:
        return;
_L2:
        if (obj == null) goto _L4; else goto _L3
_L3:
        Message.obtain(((Handler) (obj)), R.id.decode_failed).sendToTarget();
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void handleMessage(Message message)
    {
        if (running)
        {
            if (message.what == R.id.decode)
            {
                decode((byte[])(byte[])message.obj, message.arg1, message.arg2);
                return;
            }
            if (message.what == R.id.quit)
            {
                running = false;
                Looper.myLooper().quit();
                return;
            }
        }
    }

}
