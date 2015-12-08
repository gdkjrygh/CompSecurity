// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.text.SimpleDateFormat;

public final class ImageUtils
{

    private static final SimpleDateFormat CAMERA_PHOTO_NAME_FORMAT = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss");
    private static final Paint sResizePaintBg = new Paint(2);
    private static final Paint sResizePaintUi = new Paint(2);

    public static int calculateBytes(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            return bitmap.getHeight() * bitmap.getRowBytes();
        } else
        {
            return 0;
        }
    }

}
