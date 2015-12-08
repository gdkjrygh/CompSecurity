// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import gar;

public class DraggableSeekBar extends SeekBar
{

    public gar a;
    private boolean b;
    private Drawable c;
    private android.widget.SeekBar.OnSeekBarChangeListener d;
    private android.widget.SeekBar.OnSeekBarChangeListener e = new android.widget.SeekBar.OnSeekBarChangeListener() {

        private DraggableSeekBar a;

        public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
            if (flag)
            {
                DraggableSeekBar.a(a);
            }
            if (DraggableSeekBar.b(a) != null)
            {
                DraggableSeekBar.b(a).onProgressChanged(seekbar, i, flag);
            }
        }

        public final void onStartTrackingTouch(SeekBar seekbar)
        {
            if (DraggableSeekBar.b(a) != null)
            {
                DraggableSeekBar.b(a).onStartTrackingTouch(seekbar);
            }
        }

        public final void onStopTrackingTouch(SeekBar seekbar)
        {
            if (DraggableSeekBar.b(a) != null)
            {
                DraggableSeekBar.b(a).onStopTrackingTouch(seekbar);
            }
        }

            
            {
                a = DraggableSeekBar.this;
                super();
            }
    };

    public DraggableSeekBar(Context context)
    {
        super(context);
        a();
    }

    public DraggableSeekBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public DraggableSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
    }

    private void a()
    {
        b = false;
        super.setOnSeekBarChangeListener(e);
    }

    static void a(DraggableSeekBar draggableseekbar)
    {
        if (draggableseekbar.a != null)
        {
            gar gar1 = draggableseekbar.a;
            draggableseekbar.getProgress();
            gar1.b(draggableseekbar);
        }
    }

    static android.widget.SeekBar.OnSeekBarChangeListener b(DraggableSeekBar draggableseekbar)
    {
        return draggableseekbar.d;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        Rect rect = new Rect(((c.getBounds().left - 20) + getPaddingLeft()) - getThumbOffset(), (c.getBounds().top - 20) + getPaddingTop(), (c.getBounds().right + 20 + getPaddingLeft()) - getThumbOffset(), c.getBounds().bottom + 20 + getPaddingTop());
        if (!rect.contains((int)motionevent.getX(), (int)motionevent.getY())) goto _L4; else goto _L3
_L3:
        super.onTouchEvent(motionevent);
        b = true;
        if (a != null)
        {
            a.a();
        }
_L8:
        flag = true;
_L6:
        return flag;
_L4:
        float f = motionevent.getX();
        if (a == null) goto _L6; else goto _L5
_L5:
        float f1 = getPaddingLeft();
        int i = getWidth();
        int j = getPaddingLeft();
        int k = getPaddingRight();
        Math.round(((f - f1) * (float)getMax()) / (float)(i - j - k));
        if (f < rect.exactCenterX())
        {
            a.a(getProgress());
            return false;
        } else
        {
            a.b(getProgress());
            return false;
        }
_L2:
        if (motionevent.getAction() == 1)
        {
            if (b && a != null)
            {
                a.a(this);
            }
            b = false;
            return false;
        }
        super.onTouchEvent(motionevent);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setOnSeekBarChangeListener(android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener)
    {
        d = onseekbarchangelistener;
    }

    public void setThumb(Drawable drawable)
    {
        super.setThumb(drawable);
        c = drawable;
    }
}
