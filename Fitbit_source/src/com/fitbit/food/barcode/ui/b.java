// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.hardware.Camera;
import android.util.Log;
import com.fitbit.food.barcode.a.d;

public abstract class b
    implements android.hardware.Camera.PreviewCallback
{

    private static final String a = "BitmapPreviewCallback";
    private d b;

    public b(d d1)
    {
        b = d1;
    }

    public abstract void a(com.google.zxing.b b1);

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        Log.i("BitmapPreviewCallback", (new StringBuilder()).append("Retrieved data for decoding, length = ").append(abyte0.length).toString());
        abyte0 = b.b(abyte0);
        if (abyte0 == null)
        {
            Log.e("BitmapPreviewCallback", "Returned from camera Bitmap equals null");
        }
        a(abyte0);
    }
}
