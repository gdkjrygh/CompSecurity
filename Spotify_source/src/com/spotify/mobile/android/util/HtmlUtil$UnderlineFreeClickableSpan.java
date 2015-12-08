// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import gdt;

class a extends URLSpan
{

    private gdt a;

    public void onClick(View view)
    {
        boolean flag = false;
        if (a != null)
        {
            flag = a.a(getURL());
        }
        if (!flag)
        {
            super.onClick(view);
        }
        view.invalidate();
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    public I(String s, gdt gdt1)
    {
        super(s);
        a = gdt1;
    }
}
