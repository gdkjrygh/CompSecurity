// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            ColorAnim, RenderState

class VolumeAnim extends ColorAnim
{

    static float volumeIntensity;

    VolumeAnim(int i, int j)
    {
        super(100, i, j);
    }

    boolean incrementFrame()
    {
        return false;
    }

    void updateRenderState(RenderState renderstate)
    {
        renderstate.color = blendColors(volumeIntensity);
    }
}
