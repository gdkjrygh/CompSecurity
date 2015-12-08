// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import com.google.android.apps.unveil.env.af;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            FakeCamera, CameraProxy

public class GeneratingCamera extends FakeCamera
{

    private Bitmap internalBitmap;
    private final af logger = new af();
    private int rVal;
    private FakeCamera.RawFrame rawFrame;

    private GeneratingCamera(Handler handler, Map map, Resources resources)
    {
        super(handler, map, resources);
        rVal = 0;
    }

    public static CameraProxy open(Handler handler, Map map, Resources resources)
    {
        if (camera == null)
        {
            camera = new GeneratingCamera(handler, map, resources);
        }
        return camera;
    }

    protected FakeCamera.RawFrame generateFrame()
    {
        int i = getWidth();
        int j = getHeight();
        if (internalBitmap == null)
        {
            internalBitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            rawFrame = new FakeCamera.RawFrame(this, internalBitmap);
        }
        Canvas canvas = new Canvas(internalBitmap);
        Paint paint = new Paint();
        rVal = (rVal + 1) % 255;
        canvas.drawARGB(255, rVal, rVal / 2, rVal);
        paint.setColor(-256);
        canvas.drawCircle(i / 2, j / 2, (float)Math.min(i, j) / 2.2F, paint);
        paint.setColor(0xffff0000);
        canvas.drawCircle(((float)rVal / 255F) * (float)i, ((float)rVal / 255F) * (float)j, 10F, paint);
        paint.setColor(0xff000000);
        paint.setTextSize(24F);
        canvas.drawText((new StringBuilder(46)).append("This is a fake picture ").append(i).append("x").append(j).toString(), (int)(40D * Math.sin((double)(((float)rVal / 255F) * 2.0F) * 3.1415926535897931D) + 100D), (int)(240D + Math.sin((double)(((float)rVal / 255F) * 2.0F) * 3.1415926535897931D) * 100D), paint);
        rawFrame.loadRgb(internalBitmap);
        return rawFrame;
    }
}
