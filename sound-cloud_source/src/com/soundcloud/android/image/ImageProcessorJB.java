// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

// Referenced classes of package com.soundcloud.android.image:
//            ImageProcessor

public class ImageProcessorJB
    implements ImageProcessor
{

    private static final float RADIUS = 7F;
    private final RenderScript renderscript;

    public ImageProcessorJB(Context context)
    {
        renderscript = RenderScript.create(context);
    }

    public Bitmap blurBitmap(Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        ScriptIntrinsicBlur scriptintrinsicblur = ScriptIntrinsicBlur.create(renderscript, Element.U8_4(renderscript));
        bitmap = Allocation.createFromBitmap(renderscript, bitmap);
        Allocation allocation = Allocation.createFromBitmap(renderscript, bitmap1);
        scriptintrinsicblur.setRadius(7F);
        scriptintrinsicblur.setInput(bitmap);
        scriptintrinsicblur.forEach(allocation);
        allocation.copyTo(bitmap1);
        return bitmap1;
    }
}
