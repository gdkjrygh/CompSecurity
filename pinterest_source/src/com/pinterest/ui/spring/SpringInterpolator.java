// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.spring;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.ui.spring:
//            Spring

public class SpringInterpolator
    implements Interpolator
{

    protected ArrayList _frames;
    protected Spring _spring;

    public SpringInterpolator(float f, float f1)
    {
        _frames = new ArrayList();
        _spring = new Spring(0.0F, 1.0F, f, f1);
    }

    public int getDuration()
    {
        return getDuration(60F);
    }

    public int getDuration(float f)
    {
        return (int)(((float)getFrames().size() / f) * 1000F);
    }

    public ArrayList getFrames()
    {
        if (_frames.size() > 0) goto _L2; else goto _L1
_L1:
        _frames.add(Float.valueOf(_spring.getFrom()));
_L6:
        if (_spring.isStillMoving()) goto _L4; else goto _L3
_L3:
        _frames.add(Float.valueOf(_spring.getNextFrame()));
_L2:
        return _frames;
_L4:
        _frames.add(Float.valueOf(_spring.getNextFrame()));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public float getInterpolation(float f)
    {
        f = (float)(getFrames().size() - 1) * f;
        float f1 = ((Float)getFrames().get((int)Math.floor(f))).floatValue();
        return (((Float)getFrames().get((int)Math.ceil(f))).floatValue() - f1) * (f % 1.0F) + f1;
    }

    public float getValueAtPosition(float f)
    {
        return getInterpolation(f);
    }
}
