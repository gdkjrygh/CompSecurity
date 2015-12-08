// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

public class LikeBoxCountView extends FrameLayout
{

    private int additionalTextPadding;
    private Paint borderPaint;
    private float borderRadius;
    private float caretHeight;
    private LikeBoxCountViewCaretPosition caretPosition;
    private float caretWidth;
    private TextView likeCountLabel;
    private int textPadding;

    public LikeBoxCountView(Context context)
    {
        super(context);
        caretPosition = LikeBoxCountViewCaretPosition.LEFT;
        initialize(context);
    }

    private void drawBorder(Canvas canvas, float f, float f1, float f2, float f3)
    {
        Path path = new Path();
        float f4 = borderRadius * 2.0F;
        path.addArc(new RectF(f, f1, f + f4, f1 + f4), -180F, 90F);
        if (caretPosition == LikeBoxCountViewCaretPosition.TOP)
        {
            path.lineTo((f2 - f - caretWidth) / 2.0F + f, f1);
            path.lineTo((f2 - f) / 2.0F + f, f1 - caretHeight);
            path.lineTo(((f2 - f) + caretWidth) / 2.0F + f, f1);
        }
        path.lineTo(f2 - borderRadius, f1);
        path.addArc(new RectF(f2 - f4, f1, f2, f1 + f4), -90F, 90F);
        if (caretPosition == LikeBoxCountViewCaretPosition.RIGHT)
        {
            path.lineTo(f2, (f3 - f1 - caretWidth) / 2.0F + f1);
            path.lineTo(caretHeight + f2, (f3 - f1) / 2.0F + f1);
            path.lineTo(f2, ((f3 - f1) + caretWidth) / 2.0F + f1);
        }
        path.lineTo(f2, f3 - borderRadius);
        path.addArc(new RectF(f2 - f4, f3 - f4, f2, f3), 0.0F, 90F);
        if (caretPosition == LikeBoxCountViewCaretPosition.BOTTOM)
        {
            path.lineTo(((f2 - f) + caretWidth) / 2.0F + f, f3);
            path.lineTo((f2 - f) / 2.0F + f, caretHeight + f3);
            path.lineTo((f2 - f - caretWidth) / 2.0F + f, f3);
        }
        path.lineTo(borderRadius + f, f3);
        path.addArc(new RectF(f, f3 - f4, f4 + f, f3), 90F, 90F);
        if (caretPosition == LikeBoxCountViewCaretPosition.LEFT)
        {
            path.lineTo(f, ((f3 - f1) + caretWidth) / 2.0F + f1);
            path.lineTo(f - caretHeight, (f3 - f1) / 2.0F + f1);
            path.lineTo(f, (f3 - f1 - caretWidth) / 2.0F + f1);
        }
        path.lineTo(f, borderRadius + f1);
        canvas.drawPath(path, borderPaint);
    }

    private void initialize(Context context)
    {
        setWillNotDraw(false);
        caretHeight = getResources().getDimension(com.facebook.R.dimen.com_facebook_likeboxcountview_caret_height);
        caretWidth = getResources().getDimension(com.facebook.R.dimen.com_facebook_likeboxcountview_caret_width);
        borderRadius = getResources().getDimension(com.facebook.R.dimen.com_facebook_likeboxcountview_border_radius);
        borderPaint = new Paint();
        borderPaint.setColor(getResources().getColor(com.facebook.R.color.com_facebook_likeboxcountview_border_color));
        borderPaint.setStrokeWidth(getResources().getDimension(com.facebook.R.dimen.com_facebook_likeboxcountview_border_width));
        borderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        initializeLikeCountLabel(context);
        addView(likeCountLabel);
        setCaretPosition(caretPosition);
    }

    private void initializeLikeCountLabel(Context context)
    {
        likeCountLabel = new TextView(context);
        context = new android.widget.FrameLayout.LayoutParams(-1, -1);
        likeCountLabel.setLayoutParams(context);
        likeCountLabel.setGravity(17);
        likeCountLabel.setTextSize(0, getResources().getDimension(com.facebook.R.dimen.com_facebook_likeboxcountview_text_size));
        likeCountLabel.setTextColor(getResources().getColor(com.facebook.R.color.com_facebook_likeboxcountview_text_color));
        textPadding = getResources().getDimensionPixelSize(com.facebook.R.dimen.com_facebook_likeboxcountview_text_padding);
        additionalTextPadding = getResources().getDimensionPixelSize(com.facebook.R.dimen.com_facebook_likeboxcountview_caret_height);
    }

    private void setAdditionalTextPadding(int i, int j, int k, int l)
    {
        likeCountLabel.setPadding(textPadding + i, textPadding + j, textPadding + k, textPadding + l);
    }

    protected void onDraw(Canvas canvas)
    {
        int i;
        int j;
        int k;
        int l;
        super.onDraw(canvas);
        l = getPaddingTop();
        k = getPaddingLeft();
        j = getWidth() - getPaddingRight();
        i = getHeight() - getPaddingBottom();
        _cls1..SwitchMap.com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition[caretPosition.ordinal()];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 108
    //                   2 122
    //                   3 136
    //                   4 96;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        drawBorder(canvas, k, l, j, i);
        return;
_L5:
        i = (int)((float)i - caretHeight);
        continue; /* Loop/switch isn't completed */
_L2:
        k = (int)((float)k + caretHeight);
        continue; /* Loop/switch isn't completed */
_L3:
        l = (int)((float)l + caretHeight);
        continue; /* Loop/switch isn't completed */
_L4:
        j = (int)((float)j - caretHeight);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setCaretPosition(LikeBoxCountViewCaretPosition likeboxcountviewcaretposition)
    {
        caretPosition = likeboxcountviewcaretposition;
        switch (_cls1..SwitchMap.com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition[likeboxcountviewcaretposition.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setAdditionalTextPadding(additionalTextPadding, 0, 0, 0);
            return;

        case 2: // '\002'
            setAdditionalTextPadding(0, additionalTextPadding, 0, 0);
            return;

        case 3: // '\003'
            setAdditionalTextPadding(0, 0, additionalTextPadding, 0);
            return;

        case 4: // '\004'
            setAdditionalTextPadding(0, 0, 0, additionalTextPadding);
            break;
        }
    }

    public void setText(String s)
    {
        likeCountLabel.setText(s);
    }

    private class LikeBoxCountViewCaretPosition extends Enum
    {

        private static final LikeBoxCountViewCaretPosition $VALUES[];
        public static final LikeBoxCountViewCaretPosition BOTTOM;
        public static final LikeBoxCountViewCaretPosition LEFT;
        public static final LikeBoxCountViewCaretPosition RIGHT;
        public static final LikeBoxCountViewCaretPosition TOP;

        public static LikeBoxCountViewCaretPosition valueOf(String s)
        {
            return (LikeBoxCountViewCaretPosition)Enum.valueOf(com/facebook/share/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition, s);
        }

        public static LikeBoxCountViewCaretPosition[] values()
        {
            return (LikeBoxCountViewCaretPosition[])$VALUES.clone();
        }

        static 
        {
            LEFT = new LikeBoxCountViewCaretPosition("LEFT", 0);
            TOP = new LikeBoxCountViewCaretPosition("TOP", 1);
            RIGHT = new LikeBoxCountViewCaretPosition("RIGHT", 2);
            BOTTOM = new LikeBoxCountViewCaretPosition("BOTTOM", 3);
            $VALUES = (new LikeBoxCountViewCaretPosition[] {
                LEFT, TOP, RIGHT, BOTTOM
            });
        }

        private LikeBoxCountViewCaretPosition(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[];

        static 
        {
            $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition = new int[LikeBoxCountViewCaretPosition.values().length];
            try
            {
                $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[LikeBoxCountViewCaretPosition.LEFT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[LikeBoxCountViewCaretPosition.TOP.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[LikeBoxCountViewCaretPosition.RIGHT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$facebook$share$internal$LikeBoxCountView$LikeBoxCountViewCaretPosition[LikeBoxCountViewCaretPosition.BOTTOM.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
