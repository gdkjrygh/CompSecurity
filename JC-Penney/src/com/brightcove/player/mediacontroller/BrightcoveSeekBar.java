// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrightcoveSeekBar extends SeekBar
{

    public static final String DEFAULT_MARKER_COLOR = "white";
    private static final String a = com/brightcove/player/mediacontroller/BrightcoveSeekBar.getSimpleName();
    private ArrayList b;
    private Paint c;

    public BrightcoveSeekBar(Context context)
    {
        super(context);
        b = new ArrayList();
        c = new Paint();
    }

    public BrightcoveSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new ArrayList();
        c = new Paint();
    }

    public BrightcoveSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new ArrayList();
        c = new Paint();
    }

    private void a(Canvas canvas)
    {
        if (b.size() > 0)
        {
            Rect rect = getProgressDrawable().getBounds();
            getThumb().getBounds();
            float f = Float.valueOf(rect.width()).floatValue();
            float f1 = Float.valueOf(rect.top).floatValue();
            float f2 = f1 + Float.valueOf(rect.height()).floatValue();
            Iterator iterator = b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                float f3 = ((Integer)iterator.next()).floatValue() / (float)getMax();
                f3 = Float.valueOf(rect.left).floatValue() + (float)getPaddingLeft() + f3 * f;
                if (android.os.Build.VERSION.SDK_INT < 16 || !getThumb().getBounds().contains((int)f3, (int)(f1 + f2) / 2))
                {
                    canvas.drawLine(f3, f1, f3, f2, c);
                }
            } while (true);
        }
    }

    public void addMarker(int i)
    {
        if (i < 1)
        {
            return;
        } else
        {
            Log.d(a, (new StringBuilder()).append("Adding marker at ").append(i).append(" milliseconds").toString());
            b.add(Integer.valueOf(i));
            invalidate();
            return;
        }
    }

    public String getMarkerColor()
    {
        return String.valueOf(c.getColor());
    }

    public float getMarkerWidth()
    {
        return c.getStrokeWidth();
    }

    public List getMarkers()
    {
        return b;
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        super.onDraw(canvas);
        a(canvas);
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
    }

    public void setMarkerColor(String s)
    {
        try
        {
            c.setColor(Color.parseColor(s));
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.e(a, String.format("Illegal color value detected: %s.  Using default: %s.", new Object[] {
                s, "white"
            }));
        }
        c.setColor(Color.parseColor("white"));
    }

    public void setMarkerWidth(float f)
    {
        c.setStrokeWidth(f);
    }

}
