// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            ComponentAnim, RenderState

class ScaleAnim extends ComponentAnim
{

    private final float scaleFactorX;
    private final float scaleFactorY;
    private final float startScaleX;
    private final float startScaleY;

    ScaleAnim(int i, float f, float f1, float f2, float f3)
    {
        super(i);
        startScaleX = f;
        startScaleY = f2;
        float f4 = 1.0F / (float)i;
        scaleFactorX = (f1 - f) * f4;
        scaleFactorY = f4 * (f3 - f2);
    }

    void updateRenderState(RenderState renderstate)
    {
        float f = getCurrentFrame();
        renderstate.scaleX = startScaleX + scaleFactorX * f;
        float f1 = startScaleY;
        renderstate.scaleY = f * scaleFactorY + f1;
    }
}
