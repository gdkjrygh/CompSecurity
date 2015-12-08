// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.JCP;
import com.jcp.views.TypefaceTextView;

public class JCPActionBar extends LinearLayout
{

    protected TextView tvItemCount;
    protected TypefaceTextView tvTitle;

    public JCPActionBar(Context context)
    {
        super(context);
        a(context);
    }

    private void a(Context context)
    {
        inflate(context, 0x7f030053, this);
        ButterKnife.inject(this);
    }

    public void a()
    {
        int j = JCP.d().a();
        TextView textview = tvItemCount;
        int i;
        if (j > 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        tvItemCount.setText(String.valueOf(j));
    }

    public void setTitle(String s)
    {
        tvTitle.setText(s);
    }
}
