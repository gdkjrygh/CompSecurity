// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.text.TextPaint;
import android.text.style.URLSpan;

// Referenced classes of package com.tinder.fragments:
//            FragmentIntro

private static class  extends URLSpan
{

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
        textpaint.setFakeBoldText(true);
    }

    public (String s)
    {
        super(s);
    }
}
