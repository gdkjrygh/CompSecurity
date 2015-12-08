// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.soundcloud.android.utils:
//            ScTextUtils

public static class underline extends ClickableSpan
{
    public static interface OnClickListener
    {

        public abstract void onClick();
    }


    private final OnClickListener listener;
    private final boolean underline;

    public void onClick(View view)
    {
        if (listener != null)
        {
            listener.onClick();
        }
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(underline);
    }

    public OnClickListener(OnClickListener onclicklistener, boolean flag)
    {
        listener = onclicklistener;
        underline = flag;
    }
}
