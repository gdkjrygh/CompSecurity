// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;
import com.facebook.widget.text.SimpleVariableTextLayoutView;

public class TitleBarDefaultTextTitle extends f
{

    private SimpleVariableTextLayoutView a;
    private View b;
    private ProgressBar c;

    public TitleBarDefaultTextTitle(Context context)
    {
        super(context);
        a();
    }

    public TitleBarDefaultTextTitle(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    public TitleBarDefaultTextTitle(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a();
    }

    private void a()
    {
        setContentView(k.orca_titlebar_default_text_title);
        b = getView(i.titlebar_progress_container);
        c = (ProgressBar)getView(i.titlebar_progress);
        a = (SimpleVariableTextLayoutView)getView(i.titlebar_title);
    }

    public void setProgressBarVisibility(int j)
    {
        if (j == 0)
        {
            b.setVisibility(0);
            c.setVisibility(0);
            return;
        }
        if (j == 4)
        {
            b.setVisibility(4);
            c.setVisibility(4);
            return;
        } else
        {
            b.setVisibility(8);
            return;
        }
    }

    public void setText(String s)
    {
        a.setText(s);
    }
}
