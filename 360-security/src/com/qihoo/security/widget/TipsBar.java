// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.qihoo.security.locale.widget.LocaleTextView;

public class TipsBar extends FrameLayout
{

    private final LocaleTextView a = (LocaleTextView)findViewById(0x7f0b0210);
    private final LocaleTextView b = (LocaleTextView)findViewById(0x7f0b0211);

    public TipsBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        View.inflate(context, 0x7f03009e, this);
        context = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.tipsbar);
        int i = context.getResourceId(0, 0);
        if (i > 0)
        {
            a.setLocalText(i);
            a.setVisibility(0);
        } else
        {
            a.setVisibility(8);
        }
        i = context.getResourceId(1, 0);
        if (i > 0)
        {
            b.setLocalText(i);
            b.setVisibility(0);
        } else
        {
            b.setVisibility(8);
        }
        context.recycle();
    }

    public void setLeftText(String s)
    {
        a.setLocalText(s);
        a.setVisibility(0);
    }

    public void setRightText(String s)
    {
        b.setLocalText(s);
        b.setVisibility(0);
    }
}
