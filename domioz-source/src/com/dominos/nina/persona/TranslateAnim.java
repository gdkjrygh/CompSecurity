// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            ComponentAnim, RenderState

class TranslateAnim extends ComponentAnim
{

    private final float startTranslateX;
    private final float startTranslateY;
    private final float translateFactorX;
    private final float translateFactorY;

    TranslateAnim(int i, float f, float f1, float f2, float f3)
    {
        super(i);
        startTranslateX = f;
        startTranslateY = f2;
        float f4 = 1.0F / (float)i;
        translateFactorX = (f1 - f) * f4;
        translateFactorY = f4 * (f3 - f2);
    }

    void updateRenderState(RenderState renderstate)
    {
        float f = getCurrentFrame();
        renderstate.translateX = startTranslateX + translateFactorX * f;
        float f1 = startTranslateY;
        renderstate.translateY = f * translateFactorY + f1;
    }
}
