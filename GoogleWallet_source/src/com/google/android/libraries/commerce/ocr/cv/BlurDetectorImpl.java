// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import android.graphics.Rect;
import android.util.Log;

// Referenced classes of package com.google.android.libraries.commerce.ocr.cv:
//            BlurDetector, OcrImage

public class BlurDetectorImpl
    implements BlurDetector
{

    private static final String TAG = "BlurDetectorImpl";

    public BlurDetectorImpl()
    {
    }

    private native boolean isBlurryNative(byte abyte0[], int i, int j, int k, int l, int i1, int j1);

    public boolean isBlurred(OcrImage ocrimage, Rect rect)
    {
        if (rect == null)
        {
            Log.w("BlurDetectorImpl", "isBlurred called with null roi");
            return true;
        } else
        {
            return isBlurryNative(ocrimage.getData(), ocrimage.getWidth(), ocrimage.getHeight(), rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
