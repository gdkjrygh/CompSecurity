// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.text.StaticLayout;
import android.text.TextPaint;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinMultiLineTextDrawable

public class  extends StaticLayout
{

    public int getActualLineCount()
    {
        return super.getLineCount();
    }

    public int getLineCount()
    {
        int j = super.getLineCount();
        int i = j;
        if (j >= PinMultiLineTextDrawable.MAX_LINES)
        {
            i = PinMultiLineTextDrawable.MAX_LINES;
        }
        return i;
    }

    public (CharSequence charsequence, int i, int j, TextPaint textpaint, int k, android.text.imitedLayout imitedlayout, float f, 
            float f1, boolean flag)
    {
        super(charsequence, i, j, textpaint, k, imitedlayout, f, f1, flag);
    }

    public (CharSequence charsequence, int i, int j, TextPaint textpaint, int k, android.text.imitedLayout imitedlayout, float f, 
            float f1, boolean flag, android.text.imitedLayout imitedlayout1, int l)
    {
        super(charsequence, i, j, textpaint, k, imitedlayout, f, f1, flag, imitedlayout1, l);
    }

    public (CharSequence charsequence, TextPaint textpaint, int i, android.text.imitedLayout imitedlayout, float f, float f1, boolean flag)
    {
        super(charsequence, textpaint, i, imitedlayout, f, f1, flag);
    }
}
