// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.view;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

abstract class ClickableSpanWithoutUnderline extends ClickableSpan
{

    ClickableSpanWithoutUnderline()
    {
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }
}
