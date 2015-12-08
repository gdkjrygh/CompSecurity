// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import FD;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.snapchat.android.fragments.chat.MessageViewHolder;

public abstract class AboveTheFoldV2RecyclerView extends RecyclerView
{

    public float r;
    private FD s;
    private int t;

    public AboveTheFoldV2RecyclerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        r = (0.0F / 0.0F);
        t = 0;
        super.m.m = false;
    }

    public final void a(float f)
    {
        for (int i = 0; i <= getChildCount(); i++)
        {
            Object obj = getChildAt(i);
            if (obj == null)
            {
                continue;
            }
            obj = ((View) (obj)).getTag();
            if (obj instanceof MessageViewHolder)
            {
                ((MessageViewHolder)obj).a(f);
            }
        }

    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        r = getMeasuredHeight();
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (j > t)
        {
            t = j;
        }
        if (t - j > 100)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        s.C();
        if (i != 0)
        {
            s.B();
        }
    }

    public void setAdapter(android.support.v7.widget.RecyclerView.a a1)
    {
        super.setAdapter(a1);
    }

    public void setLayoutManager(android.support.v7.widget.RecyclerView.i i)
    {
        super.setLayoutManager(i);
        s = (FD)i;
    }
}
