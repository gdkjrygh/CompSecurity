// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Vibrator;
import android.view.WindowManager;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.CameraManagerImpl;
import com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy;
import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeDecoder;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import com.google.android.libraries.commerce.ocr.util.TimeoutManager;
import com.google.android.libraries.commerce.ocr.wobs.fragments.TransitionHandler;
import com.google.android.libraries.commerce.ocr.wobs.fragments.WobsOcrFlagModule;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.capture:
//            WobsOcrResponseHandler

public final class CaptureModule
{

    public static BarcodeDecoder provideBarcodeDecoder()
    {
        return new BarcodeDecoder() {

            final MultiFormatReader val$xzingReader;

            public final Result decodeWithState(BinaryBitmap binarybitmap)
                throws NotFoundException
            {
                return xzingReader.decodeWithState(binarybitmap);
            }

            public final void reset()
            {
                xzingReader.reset();
            }

            public final void setHint(Map map)
            {
                xzingReader.setHints(map);
            }

            
            {
                xzingReader = multiformatreader;
                super();
            }
        };
    }

    public static CameraManager provideCameraManager(Activity activity, boolean flag)
    {
        return new CameraManagerImpl(new ScreenManager(activity.getResources().getConfiguration(), activity.getWindowManager().getDefaultDisplay()), 0, new ShapeModifier(), WobsOcrFlagModule.provideTargetPreviewSize(), WobsOcrFlagModule.provideTargetPictureSize(), SizeSelectionStrategy.RATIO_AND_HEIGHT, flag);
    }

    public static WobsOcrResponseHandler provideWobsOcrResponseHandler(Activity activity, TransitionHandler transitionhandler)
    {
        return new WobsOcrResponseHandler((Vibrator)activity.getSystemService("vibrator"), transitionhandler, new TimeoutManager(2000L));
    }
}
