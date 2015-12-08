// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.leanplum.utils.BitmapUtil;
import com.leanplum.utils.SizeUtil;

public class BackgroundImageView extends ImageView
{

    private Paint a;
    private boolean b;
    private Matrix c;
    private boolean d;

    public BackgroundImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Paint();
        c = new Matrix();
        a();
    }

    public BackgroundImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Paint();
        c = new Matrix();
        a();
    }

    public BackgroundImageView(Context context, boolean flag)
    {
        super(context);
        a = new Paint();
        c = new Matrix();
        a();
        b = flag;
    }

    private void a()
    {
        a.setColor(0xff00ff00);
        a.setStrokeWidth(2.0F);
        a.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
    }

    public Bitmap loadBitmapFromView(View view)
    {
        if (view.getMeasuredHeight() <= 0)
        {
            view.measure(-2, -2);
        }
        Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        d = true;
        view.draw(canvas);
        return bitmap;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (b)
        {
            return;
        }
        if (d)
        {
            d = false;
            return;
        } else
        {
            Bitmap bitmap = loadBitmapFromView(this);
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            canvas.drawBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, SizeUtil.dp20), c, a);
            return;
        }
    }
}
