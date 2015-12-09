// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import com.google.common.base.Optional;

public class LineView extends View
{
    public static final class Orientation extends Enum
    {

        private static final Orientation $VALUES[];
        public static final Orientation HORIZONTAL;
        public static final Orientation VERTICAL;

        public static Orientation valueOf(String s)
        {
            return (Orientation)Enum.valueOf(com/google/wallet/wobl/renderer/android/views/LineView$Orientation, s);
        }

        public static Orientation[] values()
        {
            return (Orientation[])$VALUES.clone();
        }

        static 
        {
            HORIZONTAL = new Orientation("HORIZONTAL", 0);
            VERTICAL = new Orientation("VERTICAL", 1);
            $VALUES = (new Orientation[] {
                HORIZONTAL, VERTICAL
            });
        }

        private Orientation(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int DEFAULT_LENGTH_PX = 0x7fffffff;
    static final int DEFAULT_THICKNESS_PX = 1;
    private int gravity;
    private int length;
    private final Rect lineRect;
    private Orientation orientation;
    private final Paint paint;
    private int thicknessPx;

    public LineView(Context context)
    {
        super(context);
        lineRect = new Rect();
        paint = new Paint();
        orientation = Orientation.HORIZONTAL;
        thicknessPx = 1;
        length = 0x7fffffff;
    }

    public LineView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        lineRect = new Rect();
        paint = new Paint();
        orientation = Orientation.HORIZONTAL;
        thicknessPx = 1;
        length = 0x7fffffff;
        throw new UnsupportedOperationException("Inflating LineView from Android XML is not supported");
    }

    public LineView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        lineRect = new Rect();
        paint = new Paint();
        orientation = Orientation.HORIZONTAL;
        thicknessPx = 1;
        length = 0x7fffffff;
        throw new UnsupportedOperationException("Inflating LineView from Android XML is not supported");
    }

    protected void onDraw(Canvas canvas)
    {
        canvas.drawRect(lineRect, paint);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        lineRect.setEmpty();
        k = android.view.View.MeasureSpec.getMode(i);
        i1 = android.view.View.MeasureSpec.getSize(i);
        j1 = android.view.View.MeasureSpec.getMode(j);
        l = android.view.View.MeasureSpec.getSize(j);
        static class _cls1
        {

            static final int $SwitchMap$com$google$wallet$wobl$renderer$android$views$LineView$Orientation[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$renderer$android$views$LineView$Orientation = new int[Orientation.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$renderer$android$views$LineView$Orientation[Orientation.HORIZONTAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$renderer$android$views$LineView$Orientation[Orientation.VERTICAL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.google.wallet.wobl.renderer.android.views.LineView.Orientation[orientation.ordinal()];
        JVM INSTR tableswitch 1 2: default 64
    //                   1 74
    //                   2 338;
           goto _L1 _L2 _L3
_L1:
        throw new InflateException("Unspecified line orientation");
_L2:
        int k1;
        k1 = Math.min(i1 - getPaddingLeft() - getPaddingRight(), length);
        j = getPaddingLeft() + k1 + getPaddingRight();
        i = getPaddingTop() + thicknessPx + getPaddingBottom();
        lineRect.left = getPaddingLeft();
        lineRect.right = lineRect.left + k1;
        k1 = l - getPaddingTop() - getPaddingBottom() - thicknessPx;
        gravity & 0x70;
        JVM INSTR lookupswitch 2: default 204
    //                   16: 319
    //                   80: 302;
           goto _L4 _L5 _L6
_L4:
        lineRect.top = getPaddingTop();
_L13:
        lineRect.bottom = lineRect.top + thicknessPx;
_L17:
        k;
        JVM INSTR lookupswitch 2: default 260
    //                   -2147483648: 542
    //                   0: 537;
           goto _L7 _L8 _L9
_L7:
        k = i1;
_L19:
        j1;
        JVM INSTR lookupswitch 2: default 292
    //                   -2147483648: 561
    //                   0: 556;
           goto _L10 _L11 _L12
_L10:
        j = l;
_L20:
        setMeasuredDimension(k, j);
        return;
_L6:
        lineRect.top = getPaddingTop() + k1;
          goto _L13
_L5:
        lineRect.top = getPaddingTop() + k1 / 2;
          goto _L13
_L3:
        k1 = Math.min(l - getPaddingTop() - getPaddingBottom(), length);
        j = getPaddingLeft() + thicknessPx + getPaddingRight();
        i = getPaddingTop() + k1 + getPaddingBottom();
        lineRect.top = getPaddingTop();
        lineRect.bottom = lineRect.top + k1;
        k1 = i1 - getPaddingLeft() - getPaddingRight() - thicknessPx;
        gravity & 7;
        JVM INSTR lookupswitch 2: default 468
    //                   1: 518
    //                   5: 501;
           goto _L14 _L15 _L16
_L14:
        lineRect.left = getPaddingLeft();
_L18:
        lineRect.right = lineRect.left + thicknessPx;
          goto _L17
_L16:
        lineRect.left = getPaddingLeft() + k1;
          goto _L18
_L15:
        lineRect.left = getPaddingLeft() + k1 / 2;
          goto _L18
_L9:
        k = j;
          goto _L19
_L8:
        k = i1;
        if (j < i1)
        {
            k = j;
        }
          goto _L19
_L12:
        j = i;
          goto _L20
_L11:
        j = l;
        if (i < l)
        {
            j = i;
        }
          goto _L20
    }

    public void setColor(int i)
    {
        paint.setColor(i);
    }

    public void setGravity(int i)
    {
        gravity = i;
    }

    public void setLength(Optional optional)
    {
        length = ((Integer)optional.or(Integer.valueOf(0x7fffffff))).intValue();
    }

    public void setOrientation(Orientation orientation1)
    {
        orientation = orientation1;
    }

    public void setThickness(Optional optional)
    {
        thicknessPx = ((Integer)optional.or(Integer.valueOf(1))).intValue();
    }
}
