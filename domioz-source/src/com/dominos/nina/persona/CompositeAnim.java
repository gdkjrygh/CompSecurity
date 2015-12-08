// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            NinaAnim

abstract class CompositeAnim extends NinaAnim
{

    protected final NinaAnim anims[];

    transient CompositeAnim(NinaAnim aninaanim[])
    {
        anims = aninaanim;
    }

    private void resetChildren()
    {
        for (int i = 0; i < anims.length; i++)
        {
            anims[i].reset();
        }

    }

    abstract boolean compositeIncrementor();

    boolean incrementFrame()
    {
        if (!compositeIncrementor())
        {
            return false;
        }
        if (!incrementLoopCount())
        {
            resetChildren();
            return compositeIncrementor();
        } else
        {
            return true;
        }
    }

    void reset()
    {
        super.reset();
        resetChildren();
    }
}
