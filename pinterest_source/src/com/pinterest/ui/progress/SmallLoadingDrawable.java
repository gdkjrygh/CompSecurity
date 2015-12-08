// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.progress;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.pinterest.kit.application.Resources;

public class SmallLoadingDrawable
{

    private static final int UPDATE_MS = 33;
    private Paint _blankPaint;
    private Bitmap _loading;
    private Matrix loadingMatrix;
    private int loadingX;
    private int loadingY;
    private float scale;

    public SmallLoadingDrawable()
    {
        loadingMatrix = null;
        if (_loading == null)
        {
            android.graphics.drawable.Drawable drawable = Resources.drawable(0x7f020221);
            if (drawable instanceof BitmapDrawable)
            {
                _loading = ((BitmapDrawable)drawable).getBitmap();
            }
        }
        if (_blankPaint == null)
        {
            _blankPaint = new Paint();
            _blankPaint.setAntiAlias(true);
            _blankPaint.setFilterBitmap(true);
        }
    }

    private void draw(View view, Canvas canvas, int i, int j, int k, int l, int i1)
    {
        if (_loading != null && _blankPaint != null)
        {
            l = Math.max(i, loadingX * 2);
            j = Math.max(j, loadingY * 2);
            i = k;
            if (k <= 0)
            {
                i = _loading.getWidth();
            }
            if (loadingMatrix == null)
            {
                loadingMatrix = new Matrix();
                loadingX = _loading.getWidth() / 2;
                loadingY = _loading.getHeight() / 2;
                scale = (float)i / (float)_loading.getWidth();
            }
            loadingMatrix.postRotate(12F, loadingX, loadingY);
            canvas.save();
            canvas.scale(scale, scale);
            canvas.translate(l / 2 - loadingX, j / 2 - loadingY);
            canvas.drawBitmap(_loading, loadingMatrix, _blankPaint);
            canvas.restore();
            if (view != null)
            {
                view.postInvalidateDelayed(i1);
                return;
            }
        }
    }

    public final void drawCentered(View view, Canvas canvas, int i, int j)
    {
        drawCentered(view, canvas, i, j, 33);
    }

    public final void drawCentered(View view, Canvas canvas, int i, int j, int k)
    {
        draw(view, canvas, i, j, 0, 0, k);
    }

    public final void drawScaled(View view, Canvas canvas, int i, int j)
    {
        draw(view, canvas, 0, 0, i, j, 33);
    }

    public final Bitmap getBitmap()
    {
        return _loading;
    }

    public int getHeight()
    {
        if (_loading == null)
        {
            return 0;
        } else
        {
            return _loading.getHeight();
        }
    }
}
