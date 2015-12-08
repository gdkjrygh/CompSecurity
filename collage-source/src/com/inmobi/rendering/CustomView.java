// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.rendering;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class CustomView extends View
{
    public static final class SwitchIconType extends Enum
    {

        private static final SwitchIconType $VALUES[];
        public static final SwitchIconType BACK;
        public static final SwitchIconType CLOSE_BUTTON;
        public static final SwitchIconType CLOSE_ICON;
        public static final SwitchIconType CLOSE_TRANSPARENT;
        public static final SwitchIconType FORWARD_ACTIVE;
        public static final SwitchIconType FORWARD_INACTIVE;
        public static final SwitchIconType REFRESH;

        public static SwitchIconType valueOf(String s)
        {
            return (SwitchIconType)Enum.valueOf(com/inmobi/rendering/CustomView$SwitchIconType, s);
        }

        public static SwitchIconType[] values()
        {
            return (SwitchIconType[])$VALUES.clone();
        }

        static 
        {
            CLOSE_BUTTON = new SwitchIconType("CLOSE_BUTTON", 0);
            CLOSE_TRANSPARENT = new SwitchIconType("CLOSE_TRANSPARENT", 1);
            CLOSE_ICON = new SwitchIconType("CLOSE_ICON", 2);
            REFRESH = new SwitchIconType("REFRESH", 3);
            BACK = new SwitchIconType("BACK", 4);
            FORWARD_ACTIVE = new SwitchIconType("FORWARD_ACTIVE", 5);
            FORWARD_INACTIVE = new SwitchIconType("FORWARD_INACTIVE", 6);
            $VALUES = (new SwitchIconType[] {
                CLOSE_BUTTON, CLOSE_TRANSPARENT, CLOSE_ICON, REFRESH, BACK, FORWARD_ACTIVE, FORWARD_INACTIVE
            });
        }

        private SwitchIconType(String s, int k)
        {
            super(s, k);
        }
    }


    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private SwitchIconType f;
    private int g;
    private Paint h;
    private Path i;
    private RectF j;

    private CustomView(Context context)
    {
        super(context);
    }

    public CustomView(Context context, float f1, SwitchIconType switchicontype)
    {
        this(context);
        f = switchicontype;
        a = f1;
        g = 15;
        b = (50F * a) / 2.0F;
        c = (30F * a) / 2.0F;
        d = b - c / 3F;
        e = b + c / 3F;
        h = new Paint(1);
        j = new RectF();
        i = new Path();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        h.reset();
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[f.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h.setAntiAlias(true);
            h.setColor(0xff000000);
            h.setStrokeWidth(3F);
            h.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(b, b, c, h);
            h.setColor(-1);
            h.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawLine(d, d, e, e, h);
            canvas.drawLine(d, e, e, d, h);
            canvas.drawCircle(b, b, c, h);
            return;

        case 2: // '\002'
            h.setAntiAlias(true);
            h.setColor(0);
            h.setStrokeWidth(3F);
            h.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(b, b, b, h);
            return;

        case 3: // '\003'
            i.reset();
            i.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            i.moveTo((float)(getWidth() / 2) - ((float)g * a) / 2.0F, (float)(getHeight() / 2) - ((float)g * a) / 2.0F);
            i.lineTo((float)(getWidth() / 2) + ((float)g * a) / 2.0F, getHeight() / 2);
            i.lineTo((float)(getWidth() / 2) - ((float)g * a) / 2.0F, (float)(getHeight() / 2) + ((float)g * a) / 2.0F);
            i.lineTo((float)(getWidth() / 2) - ((float)g * a) / 2.0F, (float)(getHeight() / 2) - ((float)g * a) / 2.0F);
            i.close();
            h.setAntiAlias(true);
            h.setColor(0xff000000);
            h.setStrokeWidth(3F);
            h.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            canvas.drawPath(i, h);
            return;

        case 4: // '\004'
            i.reset();
            i.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            i.moveTo((float)(getWidth() / 2) - ((float)g * a) / 2.0F, (float)(getHeight() / 2) - ((float)g * a) / 2.0F);
            i.lineTo((float)(getWidth() / 2) + ((float)g * a) / 2.0F, getHeight() / 2);
            i.lineTo((float)(getWidth() / 2) - ((float)g * a) / 2.0F, (float)(getHeight() / 2) + ((float)g * a) / 2.0F);
            i.lineTo((float)(getWidth() / 2) - ((float)g * a) / 2.0F, (float)(getHeight() / 2) - ((float)g * a) / 2.0F);
            i.close();
            h.setAntiAlias(true);
            h.setColor(0xff444444);
            h.setStrokeWidth(3F);
            h.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            canvas.drawPath(i, h);
            return;

        case 5: // '\005'
            i.reset();
            i.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            i.moveTo((float)(getWidth() / 2) - ((float)g * a) / 2.0F, getHeight() / 2);
            i.lineTo((float)(getWidth() / 2) + ((float)g * a) / 2.0F, (float)(getHeight() / 2) - ((float)g * a) / 2.0F);
            i.lineTo((float)(getWidth() / 2) + ((float)g * a) / 2.0F, (float)(getHeight() / 2) + ((float)g * a) / 2.0F);
            i.lineTo((float)(getWidth() / 2) - ((float)g * a) / 2.0F, getHeight() / 2);
            i.close();
            h.setAntiAlias(true);
            h.setColor(0xff000000);
            h.setStrokeWidth(3F);
            h.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            canvas.drawPath(i, h);
            return;

        case 6: // '\006'
            i.reset();
            h.setAntiAlias(true);
            h.setColor(0xff000000);
            h.setStrokeWidth(5F);
            h.setStyle(android.graphics.Paint.Style.STROKE);
            j.set((float)(getWidth() / 2) - ((float)g * a) / 2.0F, (float)(getHeight() / 2) - ((float)g * a) / 2.0F, (float)(getWidth() / 2) + ((float)g * a) / 2.0F, (float)(getHeight() / 2) + ((float)g * a) / 2.0F);
            canvas.drawArc(j, 0.0F, 270F, false, h);
            i.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            i.moveTo((float)(getWidth() / 2) + ((float)g * a) / 2.0F, (float)(getHeight() / 2) - a * 2.0F);
            i.lineTo(((float)(getWidth() / 2) + ((float)g * a) / 2.0F) - a * 2.0F, getHeight() / 2);
            i.lineTo((float)(getWidth() / 2) + ((float)g * a) / 2.0F + a * 2.0F, getHeight() / 2);
            i.lineTo((float)(getWidth() / 2) + ((float)g * a) / 2.0F, (float)(getHeight() / 2) - a * 2.0F);
            i.close();
            h.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            canvas.drawPath(i, h);
            return;

        case 7: // '\007'
            h.setAntiAlias(true);
            break;
        }
        h.setColor(0xff000000);
        h.setStrokeWidth(5F);
        h.setStyle(android.graphics.Paint.Style.STROKE);
        float f1 = getWidth() / 2;
        float f2 = ((float)g * a) / 2.0F;
        float f3 = getHeight() / 2;
        float f4 = ((float)g * a) / 2.0F;
        float f5 = getWidth() / 2;
        float f6 = ((float)g * a) / 2.0F;
        float f7 = getHeight() / 2;
        canvas.drawLine(f1 - f2, f3 - f4, f6 + f5, ((float)g * a) / 2.0F + f7, h);
        f1 = getWidth() / 2;
        f2 = ((float)g * a) / 2.0F;
        f3 = getHeight() / 2;
        f4 = ((float)g * a) / 2.0F;
        f5 = getWidth() / 2;
        canvas.drawLine(f1 - f2, f4 + f3, ((float)g * a) / 2.0F + f5, (float)(getHeight() / 2) - ((float)g * a) / 2.0F, h);
    }

    public void setSwitchInt(SwitchIconType switchicontype)
    {
        f = switchicontype;
    }
}
