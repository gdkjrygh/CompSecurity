// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import android.content.Context;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.google.android.apps.translate.widget:
//            CopyTextView

public class ZoomTextView extends CopyTextView
    implements android.view.ScaleGestureDetector.OnScaleGestureListener
{

    public boolean a;
    private final ScaleGestureDetector b;
    private float c;
    private float d;
    private float e;
    private float f;

    public ZoomTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 60F;
        d = 1.0F;
        b = new ScaleGestureDetector(context, this);
        setLayerType(1, null);
    }

    private void a()
    {
        String s = getText().toString();
        if (!s.isEmpty())
        {
            int l = getWidth();
            int j1 = getHeight();
            if (l > 0 && j1 > 0)
            {
                TextPaint textpaint = new TextPaint(getPaint());
                textpaint.setTextSize(60F);
                int j = l;
                int i = 60;
                int k = 1;
                while (i < j) 
                {
                    int i1 = i + ((j - i) + 1) / 2;
                    textpaint.setTextSize(i1);
                    StaticLayout staticlayout = new StaticLayout(s, textpaint, l, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
                    int k1 = staticlayout.getHeight();
                    k = staticlayout.getLineCount();
                    if (k1 > j1)
                    {
                        j = i1 - 1;
                    } else
                    {
                        i = i1;
                    }
                }
                c = i;
                d = 1.0F;
                e = 15F / c;
                f = (float)l / c;
                setTextSize(0, c);
                if (a || k == 1)
                {
                    i = 17;
                } else
                {
                    i = 16;
                }
                setGravity(i);
                return;
            }
        }
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (a)
        {
            d = d * scalegesturedetector.getScaleFactor();
            d = Math.max(Math.min(d, f), e);
            setTextSize(0, c * d);
            setGravity(17);
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        a();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a)
        {
            b.onTouchEvent(motionevent);
        }
        super.onTouchEvent(motionevent);
        return true;
    }

    public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
    {
        super.setText(charsequence, buffertype);
        a();
    }
}
