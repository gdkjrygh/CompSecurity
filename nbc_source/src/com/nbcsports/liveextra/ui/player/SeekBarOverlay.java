// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.timeline.Timeline;
import com.adobe.mediacore.timeline.TimelineMarker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SeekBarOverlay extends View
{

    private final float density;
    private long duration;
    private List markers;
    private Map metadata;
    private final float radius;
    private final float strokeWidth;

    public SeekBarOverlay(Context context)
    {
        this(context, null);
    }

    public SeekBarOverlay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SeekBarOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        markers = new ArrayList();
        metadata = new HashMap();
        density = getResources().getDisplayMetrics().density;
        strokeWidth = density * 3F;
        radius = strokeWidth / 2.0F;
    }

    private void drawCues(Canvas canvas)
    {
        int i = getBarWidth();
        if (i != 0 && duration != 0L) goto _L2; else goto _L1
_L1:
        long l;
        return;
_L2:
        if ((l = duration / (long)i) == 0L) goto _L1; else goto _L3
_L3:
        float f;
        Paint paint;
        Iterator iterator;
        f = canvas.getHeight() / 2;
        paint = getPaint();
        iterator = metadata.values().iterator();
_L6:
        if (!iterator.hasNext()) goto _L1; else goto _L4
_L4:
        Object obj;
        String s;
        long l1;
        obj = (TimedMetadata)iterator.next();
        l1 = (long)((float)(((TimedMetadata) (obj)).getTime() / l) + radius);
        s = ((TimedMetadata) (obj)).getMetadata().getValue("DURATION");
        if (s == null || s.isEmpty()) goto _L1; else goto _L5
_L5:
        double d = Double.parseDouble(s);
        long l2 = (long)(((double)((TimedMetadata) (obj)).getTime() + Math.max(1000D * d, 1000D)) / (double)l - (double)radius);
        obj = new Path();
        ((Path) (obj)).moveTo(l1, f);
        ((Path) (obj)).lineTo(l2, f);
        canvas.drawPath(((Path) (obj)), paint);
        canvas.drawCircle(l1, f, radius, getCirclePaint());
        canvas.drawCircle(l2, f, radius, getCirclePaint());
          goto _L6
    }

    private void drawMarkers(Canvas canvas)
    {
        int i = getBarWidth();
        if (i != 0)
        {
            long l = duration / (long)i;
            float f = canvas.getHeight() / 2;
            Paint paint = getPaint();
            Iterator iterator = markers.iterator();
            while (iterator.hasNext()) 
            {
                Object obj = (TimelineMarker)iterator.next();
                long l1 = ((TimelineMarker) (obj)).getTime() / l;
                long l2 = (long)((float)((((TimelineMarker) (obj)).getTime() + Math.max(((TimelineMarker) (obj)).getDuration() * 1000L, 1000L)) / l) - radius);
                obj = new Path();
                ((Path) (obj)).moveTo(l1, f);
                ((Path) (obj)).lineTo(l2, f);
                canvas.drawPath(((Path) (obj)), paint);
                canvas.drawCircle(l1, f, radius, getCirclePaint());
                canvas.drawCircle(l2, f, radius, getCirclePaint());
            }
        }
    }

    private Paint getCirclePaint()
    {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(0x7f0e0039));
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    private Paint getPaint()
    {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(0x7f0e0039));
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(strokeWidth);
        paint.setAntiAlias(true);
        return paint;
    }

    public int getBarWidth()
    {
        return getWidth() - getPaddingLeft() - getPaddingRight();
    }

    protected void onDraw(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        super.onDraw(canvas);
        drawCues(canvas);
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
    }

    public void updateCues(TimedMetadata timedmetadata)
    {
        if (!timedmetadata.getType().equals("#EXT-X-CUE"))
        {
            return;
        } else
        {
            metadata.put(Long.valueOf(timedmetadata.getId()), timedmetadata);
            invalidate();
            return;
        }
    }

    public void updateMarkers(Timeline timeline, long l)
    {
        duration = l;
        timeline = timeline.timelineMarkers();
        markers.clear();
        TimelineMarker timelinemarker;
        for (; timeline.hasNext(); markers.add(timelinemarker))
        {
            timelinemarker = (TimelineMarker)timeline.next();
        }

        invalidate();
    }
}
