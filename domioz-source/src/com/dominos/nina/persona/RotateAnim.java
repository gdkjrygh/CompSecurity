// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            ComponentAnim, RenderState

class RotateAnim extends ComponentAnim
{

    private final float rotationFactor;
    private final float startRotation;

    RotateAnim(int i, float f, float f1)
    {
        super(i);
        startRotation = f;
        rotationFactor = (1.0F / (float)i) * (f1 - f);
    }

    void updateRenderState(RenderState renderstate)
    {
        float f = getCurrentFrame();
        float f1 = startRotation;
        renderstate.rotation = f * rotationFactor + f1;
    }
}
