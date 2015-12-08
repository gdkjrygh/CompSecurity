// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.squareup.picasso.Transformation;

// Referenced classes of package me.lyft.android.ui:
//            BitmapColorTransformer

final class val.c
    implements Transformation
{

    final int val$c;

    public String key()
    {
        return (new StringBuilder()).append("transformation-").append(val$c).toString();
    }

    public Bitmap transform(Bitmap bitmap)
    {
        BitmapDrawable bitmapdrawable = new BitmapDrawable(Resources.getSystem(), bitmap);
        Bitmap bitmap1 = Bitmap.createBitmap(bitmapdrawable.getIntrinsicWidth(), bitmapdrawable.getIntrinsicHeight(), android.graphics.etIntrinsicHeight);
        Canvas canvas = new Canvas(bitmap1);
        bitmapdrawable.setBounds(0, 0, bitmapdrawable.getIntrinsicWidth(), bitmapdrawable.getIntrinsicHeight());
        bitmapdrawable.setColorFilter(val$c, android.graphics._cls1.val.c);
        bitmapdrawable.draw(canvas);
        bitmapdrawable.setCallback(null);
        if (bitmap1 != bitmap)
        {
            bitmap.recycle();
        }
        return bitmap1;
    }

    ()
    {
        val$c = i;
        super();
    }
}
