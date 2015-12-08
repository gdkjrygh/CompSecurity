// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrightcoveSeekBar extends SeekBar
{

    private ArrayList a;
    private Paint b;
    private boolean c;

    public BrightcoveSeekBar(Context context)
    {
        super(context);
        a = new ArrayList();
        b = new Paint();
        c = true;
    }

    public BrightcoveSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = new Paint();
        c = true;
    }

    public BrightcoveSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
        b = new Paint();
        c = true;
    }

    public void addMarker(int i)
    {
        if (i <= 0)
        {
            return;
        } else
        {
            (new StringBuilder("Adding marker at ")).append(i).append(" milliseconds");
            a.add(Integer.valueOf(i));
            invalidate();
            return;
        }
    }

    public String getMarkerColor()
    {
        return String.valueOf(b.getColor());
    }

    public float getMarkerWidth()
    {
        return b.getStrokeWidth();
    }

    public List getMarkers()
    {
        return a;
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        super.onDraw(canvas);
        if (a.size() > 0)
        {
            Rect rect = getProgressDrawable().getBounds();
            float f = rect.width();
            float f1 = rect.top;
            float f2 = f1 + (float)rect.height();
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                float f3 = ((Integer)iterator.next()).floatValue() / (float)getMax();
                f3 = (float)rect.left + (float)getPaddingLeft() + f3 * f;
                if (!c && android.os.Build.VERSION.SDK_INT >= 16)
                {
                    Rect rect1 = getThumb().copyBounds();
                    rect1.right = rect1.right - getThumbOffset();
                    if (rect1.contains((int)f3, (int)(f1 + f2) / 2))
                    {
                        continue;
                    }
                }
                canvas.drawLine(f3, f1, f3, f2, b);
            } while (true);
        }
        break MISSING_BLOCK_LABEL_189;
        canvas;
        throw canvas;
        this;
        JVM INSTR monitorexit ;
    }

    public void setMarkerColor(int i)
    {
        b.setColor(i);
    }

    public void setMarkerWidth(float f)
    {
        b.setStrokeWidth(f);
    }

    public void setShouldMarkerOverdrawThumb(boolean flag)
    {
        c = flag;
    }

    static 
    {
        com/brightcove/player/mediacontroller/BrightcoveSeekBar.getSimpleName();
    }
}
