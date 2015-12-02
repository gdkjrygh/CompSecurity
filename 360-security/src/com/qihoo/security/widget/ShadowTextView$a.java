// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

// Referenced classes of package com.qihoo.security.widget:
//            ShadowTextView

static class a extends CharacterStyle
    implements UpdateAppearance
{

    private final int a[];

    public void updateDrawState(TextPaint textpaint)
    {
        textpaint.setStyle(android.graphics.xtView.a);
        LinearGradient lineargradient = new LinearGradient(0.0F, 0.0F, 0.0F, textpaint.getTextSize() * (float)a.length, a, null, android.graphics.IRROR);
        lineargradient.setLocalMatrix(new Matrix());
        textpaint.setShader(lineargradient);
    }

    public (int ai[])
    {
        a = ai;
    }
}
