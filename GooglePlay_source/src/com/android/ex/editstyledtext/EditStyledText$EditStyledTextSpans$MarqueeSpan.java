// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.editstyledtext;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

// Referenced classes of package com.android.ex.editstyledtext:
//            EditStyledText

public static class  extends CharacterStyle
{

    int mMarqueeColor;

    static int getMarqueeColor(int i, int j)
    {
        int k = Color.alpha(j);
        int j1 = Color.red(j);
        int l = Color.green(j);
        int i1 = Color.blue(j);
        i = k;
        if (k == 0)
        {
            i = 128;
        }
        if (j1 > 128)
        {
            j = j1 / 2;
        } else
        {
            j = (255 - j1) / 2;
        }
        return Color.argb(i, j, l, i1);
    }

    public void updateDrawState(TextPaint textpaint)
    {
        textpaint.bgColor = mMarqueeColor;
    }
}
