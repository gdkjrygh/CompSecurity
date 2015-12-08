// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.drawables;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import com.fsr.tracker.styles.FsrColor;

public class InvitationBackground extends LayerDrawable
{

    private float borderRadius;
    private float borderWidth;

    public InvitationBackground(float f, float f1)
    {
        super(new Drawable[] {
            new ShapeDrawable(), new ShapeDrawable()
        });
        borderWidth = f;
        borderRadius = f1;
        createLayers();
    }

    private void createLayers()
    {
        float af[] = new float[8];
        af[0] = borderRadius;
        af[1] = borderRadius;
        af[2] = borderRadius;
        af[3] = borderRadius;
        af[4] = borderRadius;
        af[5] = borderRadius;
        af[6] = borderRadius;
        af[7] = borderRadius;
        int i = (int)borderWidth;
        ShapeDrawable shapedrawable = (ShapeDrawable)getDrawable(1);
        shapedrawable.setShape(new RectShape());
        shapedrawable.getPaint().setColor(FsrColor.WHITE.getColor());
        RoundRectShape roundrectshape = new RoundRectShape(af, null, af);
        shapedrawable = (ShapeDrawable)getDrawable(0);
        setLayerInset(1, i, i, i, i);
        shapedrawable.setShape(roundrectshape);
        shapedrawable.getPaint().setColor(FsrColor.INVITE_BORDER.getColor());
        shapedrawable.getPaint().setStyle(android.graphics.Paint.Style.FILL);
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        createLayers();
    }
}
