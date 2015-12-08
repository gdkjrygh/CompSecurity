// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ReflectionImage extends ImageView
{

    private boolean a;

    public ReflectionImage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
        measure(0, 0);
        a(((BitmapDrawable)getDrawable()).getBitmap());
    }

    public ReflectionImage(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = true;
        a(((BitmapDrawable)getDrawable()).getBitmap());
    }

    private void a(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        Object obj = new Matrix();
        ((Matrix) (obj)).preScale(1.0F, -0.75F);
        Object obj1 = Bitmap.createBitmap(bitmap, 0, 0, i, j, ((Matrix) (obj)), false);
        obj = Bitmap.createBitmap(i, (j * 3) / 4 + j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
        canvas.drawBitmap(((Bitmap) (obj1)), 0.0F, j + 1, null);
        obj1 = new Paint();
        ((Paint) (obj1)).setShader(new LinearGradient(getWidth() / 2, bitmap.getHeight(), getWidth() / 2, ((Bitmap) (obj)).getHeight() + 1, 0x80ffffff, 0xffffff, android.graphics.Shader.TileMode.CLAMP));
        ((Paint) (obj1)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0F, j, i, ((Bitmap) (obj)).getHeight() + 1, ((Paint) (obj1)));
        setImageBitmap(((Bitmap) (obj)));
    }

    public void setImageResource(int i)
    {
        a(BitmapFactory.decodeResource(getResources(), i));
    }
}
