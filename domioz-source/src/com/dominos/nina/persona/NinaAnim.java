// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            RenderState

abstract class NinaAnim
{

    private int currentLoop;
    private int loopCount;

    NinaAnim()
    {
        loopCount = 1;
        currentLoop = 0;
    }

    abstract boolean incrementFrame();

    boolean incrementLoopCount()
    {
        currentLoop = Math.min(currentLoop + 1, loopCount);
        return isFinished();
    }

    boolean isFinished()
    {
        return loopCount > 0 && currentLoop >= loopCount;
    }

    void reset()
    {
        currentLoop = 0;
    }

    final void setLoopCount(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("loopCount parameter must be non-negative");
        } else
        {
            loopCount = i;
            return;
        }
    }

    abstract void updateRenderState(RenderState renderstate);
}
