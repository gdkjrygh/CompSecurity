// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.drawables;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;

public class RoundedRectBackground extends StateListDrawable
{

    private int corner;
    private int endColour;
    private int pressedColour;
    private int startColour;
    private int strokeColour;
    private int strokeWidth;

    public RoundedRectBackground(int i, int j, int k, int l, int i1, int j1)
    {
        strokeColour = i1;
        corner = i;
        strokeWidth = j;
        startColour = k;
        endColour = l;
        pressedColour = j1;
    }

    private Drawable getDefaultState(Rect rect)
    {
        float af[] = new float[8];
        af[0] = corner;
        af[1] = corner;
        af[2] = corner;
        af[3] = corner;
        af[4] = corner;
        af[5] = corner;
        af[6] = corner;
        af[7] = corner;
        ShapeDrawable shapedrawable = new ShapeDrawable(new RoundRectShape(af, null, null));
        rect = new LinearGradient(0.0F, 0.0F, 0.0F, rect.height(), startColour, endColour, android.graphics.Shader.TileMode.CLAMP);
        shapedrawable.getPaint().setShader(rect);
        rect = new ShapeDrawable(new RoundRectShape(af, null, null));
        rect.getPaint().setStrokeWidth(strokeWidth);
        rect.getPaint().setColor(strokeColour);
        rect.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        return new LayerDrawable(new Drawable[] {
            shapedrawable, rect
        });
    }

    private Drawable getPressedState(Rect rect)
    {
        float af[] = new float[8];
        af[0] = corner;
        af[1] = corner;
        af[2] = corner;
        af[3] = corner;
        af[4] = corner;
        af[5] = corner;
        af[6] = corner;
        af[7] = corner;
        ShapeDrawable shapedrawable = new ShapeDrawable(new RoundRectShape(af, null, null));
        rect = new LinearGradient(0.0F, 0.0F, 0.0F, rect.height(), startColour, endColour, android.graphics.Shader.TileMode.CLAMP);
        shapedrawable.getPaint().setShader(rect);
        rect = new ShapeDrawable(new RoundRectShape(af, null, null));
        rect.getPaint().setColor(pressedColour);
        ShapeDrawable shapedrawable1 = new ShapeDrawable(new RoundRectShape(af, null, null));
        shapedrawable1.getPaint().setStrokeWidth(strokeWidth);
        shapedrawable1.getPaint().setColor(strokeColour);
        shapedrawable1.getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        return new LayerDrawable(new Drawable[] {
            shapedrawable, rect, shapedrawable1
        });
    }

    private void loadDrawable(Rect rect)
    {
        Drawable drawable = getPressedState(rect);
        addState(new int[] {
            0x10100a7
        }, drawable);
        addState(new int[] {
            0xfefeff62
        }, drawable);
        rect = getDefaultState(rect);
        addState(StateSet.WILD_CARD, rect);
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        loadDrawable(rect);
    }
}
