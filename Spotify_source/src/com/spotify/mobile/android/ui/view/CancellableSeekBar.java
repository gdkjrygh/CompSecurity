// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import gak;
import gal;
import gmr;

public class CancellableSeekBar extends SeekBar
{

    private boolean a;
    private boolean b;
    private boolean c;
    private int d;
    private gal e;
    private float f;

    public CancellableSeekBar(Context context)
    {
        this(context, null);
    }

    public CancellableSeekBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101007b);
    }

    public CancellableSeekBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, gmr.c);
        f = context.getDimension(0, 0.0F);
        context.recycle();
    }

    public final void a(gak gak)
    {
        if (gak == null)
        {
            e = null;
        } else
        {
            e = new gal(gak);
        }
        super.setOnSeekBarChangeListener(e);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        c = true;
        i = motionevent.getAction();
        if (!a)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (i != 1 && i != 3)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        a = false;
        b = false;
        c = false;
        return true;
        if (i != 0) goto _L2; else goto _L1
_L1:
        b = true;
        this;
        JVM INSTR monitorenter ;
        d = getProgress();
        this;
        JVM INSTR monitorexit ;
_L2:
        if (motionevent.getY() >= -f && motionevent.getY() <= (float)getHeight() + f)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        a = true;
        motionevent.setAction(3);
        if (e != null)
        {
            e.a = true;
        }
        boolean flag = super.onTouchEvent(motionevent);
        this;
        JVM INSTR monitorenter ;
        setProgress(d);
        this;
        JVM INSTR monitorexit ;
        if (e != null)
        {
            e.a(this);
        }
        c = false;
        return flag;
        motionevent;
        this;
        JVM INSTR monitorexit ;
        throw motionevent;
        motionevent;
        c = false;
        throw motionevent;
        motionevent;
        this;
        JVM INSTR monitorexit ;
        throw motionevent;
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        b = false;
        flag = super.onTouchEvent(motionevent);
        c = false;
        return flag;
    }

    public void setOnSeekBarChangeListener(android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener)
    {
        if (onseekbarchangelistener == null)
        {
            e = null;
        } else
        {
            e = new gal(onseekbarchangelistener);
        }
        super.setOnSeekBarChangeListener(e);
    }

    public void setProgress(int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!c && b && !a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        d = i;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.setProgress(i);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
