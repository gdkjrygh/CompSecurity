// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.graphics.Bitmap;
import com.google.android.apps.unveil.env.ImageUtils;
import com.google.android.apps.unveil.env.Size;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            FakeCamera

public class loadRgb
{

    final Size frameSize;
    private boolean isRgbDataDirty;
    private int rgbData[];
    final FakeCamera this$0;
    private byte yuvData[];

    public int[] getRgbData()
    {
        if (rgbData == null)
        {
            rgbData = new int[frameSize.width * frameSize.height];
        }
        if (isRgbDataDirty)
        {
            ImageUtils.convertYUV420SPToARGB8888(yuvData, rgbData, frameSize.width, frameSize.height, false);
            isRgbDataDirty = false;
        }
        return rgbData;
    }

    public byte[] getYuvDataAndClearRgbData()
    {
        isRgbDataDirty = true;
        return yuvData;
    }

    public void loadRgb(Bitmap bitmap)
    {
        bitmap.getPixels(rgbData, 0, frameSize.width, 0, 0, frameSize.width, frameSize.height);
        isRgbDataDirty = false;
        yuvData = null;
    }



    public (int i, int j, byte abyte0[])
    {
        this$0 = FakeCamera.this;
        super();
        isRgbDataDirty = true;
        frameSize = new Size(i, j);
        yuvData = abyte0;
    }

    public yuvData(int i, int j, int ai[])
    {
        this$0 = FakeCamera.this;
        super();
        isRgbDataDirty = true;
        frameSize = new Size(i, j);
        rgbData = ai;
        isRgbDataDirty = false;
    }

    public isRgbDataDirty(Bitmap bitmap)
    {
        this(bitmap.getWidth(), bitmap.getHeight(), new int[bitmap.getWidth() * bitmap.getHeight()]);
        loadRgb(bitmap);
    }
}
