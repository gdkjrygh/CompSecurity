// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            CompositeAnim, NinaAnim, RenderState

class SequentialAnim extends CompositeAnim
{

    transient SequentialAnim(NinaAnim aninaanim[])
    {
        super(aninaanim);
    }

    boolean compositeIncrementor()
    {
        for (int i = 0; i < anims.length; i++)
        {
            if (!anims[i].incrementFrame())
            {
                return false;
            }
        }

        return true;
    }

    void updateRenderState(RenderState renderstate)
    {
        int i = 0;
        do
        {
            if (i >= anims.length)
            {
                break;
            }
            anims[i].updateRenderState(renderstate);
            if (!anims[i].isFinished())
            {
                break;
            }
            i++;
        } while (true);
    }
}
