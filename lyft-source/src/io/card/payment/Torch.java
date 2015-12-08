// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.Log;
import java.util.Arrays;

class Torch
{

    private static final String TAG = io/card/payment/Torch.getSimpleName();
    private float mHeight;
    private boolean mOn;
    private float mWidth;

    public Torch(float f, float f1)
    {
        mOn = false;
        mWidth = f;
        mHeight = f1;
    }

    private static Path createBoltPath()
    {
        Path path = new Path();
        path.moveTo(10F, 0.0F);
        path.lineTo(0.0F, 11F);
        path.lineTo(6F, 11F);
        path.lineTo(2.0F, 20F);
        path.lineTo(13F, 8F);
        path.lineTo(7F, 8F);
        path.lineTo(10F, 0.0F);
        path.setLastPoint(10F, 0.0F);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-6.5F, -10F);
        matrix.postScale(0.05F, 0.05F);
        path.transform(matrix);
        return path;
    }

    public void draw(Canvas canvas)
    {
        canvas.save();
        canvas.translate(-mWidth / 2.0F, -mHeight / 2.0F);
        Paint paint = new Paint();
        paint.setColor(0xff000000);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.5F);
        Object obj = new Paint();
        ((Paint) (obj)).setStyle(android.graphics.Paint.Style.FILL);
        ((Paint) (obj)).setColor(-1);
        float f;
        float af[];
        Object obj1;
        if (mOn)
        {
            ((Paint) (obj)).setAlpha(192);
        } else
        {
            ((Paint) (obj)).setAlpha(96);
        }
        af = new float[8];
        Arrays.fill(af, 5F);
        obj1 = new RoundRectShape(af, null, null);
        ((RoundRectShape) (obj1)).resize(mWidth, mHeight);
        ((RoundRectShape) (obj1)).draw(canvas, ((Paint) (obj)));
        ((RoundRectShape) (obj1)).draw(canvas, paint);
        paint = new Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        if (mOn)
        {
            paint.setColor(-1);
        } else
        {
            paint.setColor(0xff000000);
        }
        obj = createBoltPath();
        obj1 = new Matrix();
        f = 0.8F * mHeight;
        ((Matrix) (obj1)).postScale(f, f);
        ((Path) (obj)).transform(((Matrix) (obj1)));
        canvas.translate(mWidth / 2.0F, mHeight / 2.0F);
        canvas.drawPath(((Path) (obj)), paint);
        canvas.restore();
    }

    public void setOn(boolean flag)
    {
        String s1 = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("Torch ");
        String s;
        if (flag)
        {
            s = "ON";
        } else
        {
            s = "OFF";
        }
        Log.d(s1, stringbuilder.append(s).toString());
        mOn = flag;
    }

}
