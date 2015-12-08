// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


// Referenced classes of package com.dominos.nina.persona:
//            ComponentAnim, RenderState

class ColorAnim extends ComponentAnim
{

    private final float alphaFactor;
    private final float blueFactor;
    private final float greenFactor;
    private final float redFactor;
    private final int startAlpha;
    private final int startBlue;
    private final int startGreen;
    private final int startRed;

    ColorAnim(int i, int j, int k)
    {
        super(i);
        startRed = j >> 16 & 0xff;
        startGreen = j >> 8 & 0xff;
        startBlue = j & 0xff;
        startAlpha = j >> 24 & 0xff;
        float f = 1.0F / (float)i;
        redFactor = (float)((k >> 16 & 0xff) - startRed) * f;
        greenFactor = (float)((k >> 8 & 0xff) - startGreen) * f;
        blueFactor = (float)((k & 0xff) - startBlue) * f;
        alphaFactor = f * (float)((k >> 24 & 0xff) - startAlpha);
    }

    protected int blendColors(float f)
    {
        int i = startRed;
        int j = (int)(redFactor * f);
        int k = startGreen;
        int l = (int)(greenFactor * f);
        int i1 = startBlue;
        int j1 = (int)(blueFactor * f);
        return i + j << 16 | startAlpha + (int)(alphaFactor * f) << 24 | k + l << 8 | i1 + j1;
    }

    void updateRenderState(RenderState renderstate)
    {
        renderstate.color = blendColors(getCurrentFrame());
    }
}
