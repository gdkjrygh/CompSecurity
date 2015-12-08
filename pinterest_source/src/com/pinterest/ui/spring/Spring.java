// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.spring;


public class Spring
{

    private static final float MIN_THRESHOLD = 0.001F;
    private float _current;
    private float _delta;
    private float _previous;
    private float _threshold;
    private float _velocity;
    private float friction;
    private float from;
    private boolean springChanged;
    private float tension;
    private float to;

    public Spring(float f, float f1, float f2, float f3)
    {
        _delta = 0.0F;
        _velocity = 0.0F;
        springChanged = true;
        from = f;
        to = f1;
        friction = 0.5F * f2;
        tension = 0.3F * f3;
        _current = f;
        _previous = f;
    }

    private float getThreshold()
    {
        float f = 0.001F;
        if (springChanged)
        {
            _threshold = Math.abs(from - to) / (80F / friction);
            if (_threshold >= 0.001F)
            {
                f = _threshold;
            }
            _threshold = f;
            springChanged = false;
        }
        return _threshold;
    }

    public float getFrom()
    {
        return from;
    }

    public float getNextFrame()
    {
        _delta = _delta * (1.0F - friction);
        _velocity = (to - _current) * tension;
        _delta = _delta + _velocity;
        if (!isStillMoving())
        {
            return to;
        } else
        {
            _previous = _current;
            _current = _current + _delta;
            return _current;
        }
    }

    public boolean isStillMoving()
    {
        float f = Math.abs(_current - to);
        float f1 = Math.abs(_previous - to);
        return f > getThreshold() || f1 > getThreshold();
    }

    public void setFriction(float f)
    {
        friction = f;
        springChanged = true;
    }

    public void setTension(float f)
    {
        tension = f;
        springChanged = true;
    }

    public void setTo(float f)
    {
        to = f;
        springChanged = true;
    }
}
