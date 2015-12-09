// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            CompositeAnim, NinaAnim, RenderState

class ParallelAnim extends CompositeAnim
{

    transient ParallelAnim(NinaAnim aninaanim[])
    {
        super(aninaanim);
    }

    boolean compositeIncrementor()
    {
        boolean flag = true;
        for (int i = 0; i < anims.length; i++)
        {
            if (!anims[i].incrementFrame())
            {
                flag = false;
            }
        }

        return flag;
    }

    void updateRenderState(RenderState renderstate)
    {
        for (int i = 0; i < anims.length; i++)
        {
            anims[i].updateRenderState(renderstate);
        }

    }
}
