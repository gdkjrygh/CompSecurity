// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;

// Referenced classes of package com.leanplum.utils:
//            SizeUtil

public class BitmapUtil
{

    public BitmapUtil()
    {
    }

    private static Drawable getBackground(int i, int j)
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        int k = SizeUtil.dp10;
        RoundRectShape roundrectshape = new RoundRectShape(new float[] {
            (float)k, (float)k, (float)k, (float)k, (float)k, (float)k, (float)k, (float)k
        }, null, null);
        ShapeDrawable shapedrawable = new ShapeDrawable();
        shapedrawable.setShape(roundrectshape);
        shapedrawable.getPaint().setColor(j);
        statelistdrawable.addState(new int[] {
            0x10100a7, 0x101009c
        }, shapedrawable);
        statelistdrawable.addState(new int[] {
            0xfefeff59, 0x101009c
        }, shapedrawable);
        statelistdrawable.addState(new int[] {
            0x10100a7, 0xfefeff64
        }, shapedrawable);
        shapedrawable = new ShapeDrawable();
        shapedrawable.setShape(roundrectshape);
        shapedrawable.getPaint().setColor(i);
        statelistdrawable.addState(new int[] {
            0xfefeff59, 0xfefeff64
        }, shapedrawable);
        return statelistdrawable;
    }

    public static int getDarker(int i, int j)
    {
        int k;
label0:
        {
            if (j >= 0)
            {
                k = j;
                if (j <= 100)
                {
                    break label0;
                }
            }
            k = 0;
        }
        double d = (double)(100 - k) / 100D;
        j = (int)((double)(i >> 16 & 0xff) * d);
        k = (int)((double)(i >> 8 & 0xff) * d);
        return (int)(d * (double)(i & 0xff)) & 0xff | ((i >>> 24) << 24 | (j & 0xff) << 16 | (k & 0xff) << 8);
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int i)
    {
        if (bitmap == null)
        {
            return null;
        } else
        {
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectf = new RectF(rect);
            float f = i;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(0xff000000);
            canvas.drawRoundRect(rectf, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            return bitmap1;
        }
    }

    public static void stateBackground(View view, int i, int j)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(getBackground(i, j));
            return;
        } else
        {
            view.setBackgroundColor(i);
            return;
        }
    }

    public static void stateBackgroundDarkerByPercentage(View view, int i, int j)
    {
        stateBackground(view, i, getDarker(i, j));
    }
}
