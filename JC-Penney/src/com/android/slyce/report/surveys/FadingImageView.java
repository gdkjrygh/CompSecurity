// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.android.a.d;

public class FadingImageView extends ImageView
{

    private Matrix a;
    private Paint b;
    private Shader c;
    private Paint d;
    private Shader e;
    private int f;
    private int g;

    public FadingImageView(Context context)
    {
        super(context);
        a();
    }

    public FadingImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public FadingImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        a = new Matrix();
        b = new Paint();
        android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
        c = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, new int[] {
            0xff000000, 0xff000000, 0xe5000000, 0
        }, new float[] {
            0.0F, 0.7F, 0.8F, 1.0F
        }, tilemode);
        b.setShader(c);
        b.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        d = new Paint();
        tilemode = android.graphics.Shader.TileMode.CLAMP;
        e = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, new int[] {
            0, 0, 0xff000000, 0xff000000
        }, new float[] {
            0.0F, 0.85F, 0.98F, 1.0F
        }, tilemode);
        d.setShader(e);
        b.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
    }

    public void draw(Canvas canvas)
    {
        Rect rect = canvas.getClipBounds();
        int i = canvas.saveLayer(0.0F, 0.0F, rect.width(), rect.height(), null, 31);
        super.draw(canvas);
        if (getResources().getConfiguration().orientation == 1)
        {
            canvas.drawRect(0.0F, 0.0F, g, f, b);
        } else
        {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), g - getPaddingRight(), f - getPaddingBottom(), d);
        }
        canvas.restoreToCount(i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        f = getHeight();
        g = getWidth();
        int k = android.view.View.MeasureSpec.getSize(j);
        if (getResources().getConfiguration().orientation == 1)
        {
            View view = getRootView().findViewById(d.com_mixpanel_android_notification_bottom_wrapper);
            j = 0;
            i = j;
            if (view != null)
            {
                i = j;
                if (view.getHeight() != 0)
                {
                    i = view.getHeight();
                }
            }
            float f1 = TypedValue.applyDimension(1, 15F, getResources().getDisplayMetrics());
            a.setScale(1.0F, (float)(k - i) + f1);
        } else
        {
            a.setScale(1.0F, k);
        }
        c.setLocalMatrix(a);
        e.setLocalMatrix(a);
    }
}
