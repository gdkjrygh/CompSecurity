// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import dfk;
import dgd;

public class MarqueeTextView extends TextView
{

    public MarqueeTextView(Context context)
    {
        super(context);
        a(context, null, 0x1010084);
    }

    public MarqueeTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset, 0x1010084);
    }

    public MarqueeTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset, i);
    }

    public MarqueeTextView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        a(context, attributeset, i);
    }

    private void a(Context context, AttributeSet attributeset, int i)
    {
        setTypeface(dgd.a(context, attributeset, i));
        dfk.a(context, this, attributeset, i);
    }

    final String a()
    {
        if (getText() != null)
        {
            return getText().toString();
        } else
        {
            return "";
        }
    }

    public final void a(String s)
    {
        if (!a().equals(s))
        {
            setText(s);
        }
    }

    public final void a(String s, int i)
    {
        if (!a().equals(s))
        {
            setTextColor(i);
            setText(s);
        }
    }

    public final void a(String s, ColorStateList colorstatelist)
    {
        if (!a().equals(s))
        {
            setTextColor(colorstatelist);
            setText(s);
        }
    }

    public boolean isFocused()
    {
        return true;
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        if (flag)
        {
            super.onFocusChanged(flag, i, rect);
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        if (flag)
        {
            super.onWindowFocusChanged(flag);
        }
    }
}
