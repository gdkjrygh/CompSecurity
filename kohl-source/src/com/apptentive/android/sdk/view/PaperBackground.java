// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;

public class PaperBackground extends View
{

    public PaperBackground(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onDraw(Canvas canvas)
    {
        int i = getWidth() + 1;
        int j = getHeight() + 1;
        Rect rect = new Rect(0, 0, i, j);
        Object obj = new RectF(0.0F, 0.0F, i, j);
        Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas1 = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(0xffff0000);
        canvas1.drawRoundRect(((RectF) (obj)), 15F, 15F, paint);
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        obj = new BitmapDrawable(BitmapFactory.decodeResource(getResources(), com.apptentive.android.sdk.R.drawable.apptentive_paper_bg));
        ((BitmapDrawable) (obj)).setBounds(rect);
        ((BitmapDrawable) (obj)).setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
        ((BitmapDrawable) (obj)).draw(canvas);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
    }
}
