// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPointCallback;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.zxing.client.android:
//            DecodeFormatManager, DecodeHandler, CaptureActivity

final class DecodeThread extends Thread
{

    public static final String BARCODE_BITMAP = "barcode_bitmap";
    public static final String BARCODE_SCALED_FACTOR = "barcode_scaled_factor";
    private final CaptureActivity activity;
    private Handler handler;
    private final CountDownLatch handlerInitLatch;
    private final Map hints;

    DecodeThread(CaptureActivity captureactivity, Collection collection, Map map, String s, ResultPointCallback resultpointcallback)
    {
label0:
        {
            super();
            activity = captureactivity;
            handlerInitLatch = new CountDownLatch(1);
            hints = new EnumMap(com/google/zxing/DecodeHintType);
            if (map != null)
            {
                hints.putAll(map);
            }
            if (collection != null)
            {
                map = collection;
                if (!collection.isEmpty())
                {
                    break label0;
                }
            }
            collection = PreferenceManager.getDefaultSharedPreferences(captureactivity);
            captureactivity = EnumSet.noneOf(com/google/zxing/BarcodeFormat);
            if (collection.getBoolean("preferences_decode_1D", false))
            {
                captureactivity.addAll(DecodeFormatManager.ONE_D_FORMATS);
            }
            if (collection.getBoolean("preferences_decode_QR", false))
            {
                captureactivity.addAll(DecodeFormatManager.QR_CODE_FORMATS);
            }
            map = captureactivity;
            if (collection.getBoolean("preferences_decode_Data_Matrix", false))
            {
                captureactivity.addAll(DecodeFormatManager.DATA_MATRIX_FORMATS);
                map = captureactivity;
            }
        }
        hints.put(DecodeHintType.POSSIBLE_FORMATS, map);
        if (s != null)
        {
            hints.put(DecodeHintType.CHARACTER_SET, s);
        }
        hints.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, resultpointcallback);
        Log.i("DecodeThread", (new StringBuilder("Hints: ")).append(hints).toString());
    }

    Handler getHandler()
    {
        try
        {
            handlerInitLatch.await();
        }
        catch (InterruptedException interruptedexception) { }
        return handler;
    }

    public void run()
    {
        Looper.prepare();
        handler = new DecodeHandler(activity, hints);
        handlerInitLatch.countDown();
        Looper.loop();
    }
}
