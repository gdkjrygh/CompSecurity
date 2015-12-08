// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            NinaAnim

abstract class ComponentAnim extends NinaAnim
{

    private int currentFrame;
    final int duration;

    ComponentAnim(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("duration parameter must be greater than zero");
        } else
        {
            duration = i;
            currentFrame = -1;
            return;
        }
    }

    int getCurrentFrame()
    {
        return currentFrame;
    }

    boolean incrementFrame()
    {
        int i = currentFrame + 1;
        currentFrame = i;
        if (i >= duration)
        {
            if (incrementLoopCount())
            {
                currentFrame = duration;
            } else
            {
                currentFrame = 0;
            }
        }
        return isFinished();
    }

    void reset()
    {
        super.reset();
        currentFrame = -1;
    }
}
