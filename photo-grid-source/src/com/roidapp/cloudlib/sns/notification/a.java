// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan
{

    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private android.view.View.OnClickListener f;

    public final void a(boolean flag)
    {
        a = flag;
    }

    public final void onClick(View view)
    {
        if (f != null)
        {
            view.setTag(Integer.valueOf(d));
            view.setId(e);
            f.onClick(view);
        }
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        if (a)
        {
            textpaint.setColor(c);
            return;
        } else
        {
            textpaint.setColor(b);
            return;
        }
    }
}
