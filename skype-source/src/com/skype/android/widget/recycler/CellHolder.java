// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class CellHolder extends android.support.v7.widget.RecyclerView.v
{

    public CellHolder(ViewGroup viewgroup)
    {
        viewgroup = new FrameLayout(viewgroup.getContext());
        viewgroup.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        super(viewgroup);
        if (itemView instanceof RecyclerView)
        {
            throw new IllegalArgumentException();
        } else
        {
            setIsRecyclable(false);
            return;
        }
    }

    public final void a(View view)
    {
        if (view instanceof RecyclerView)
        {
            throw new IllegalArgumentException();
        }
        FrameLayout framelayout = (FrameLayout)itemView;
        if (framelayout.getChildAt(0) == view)
        {
            return;
        }
        android.view.ViewParent viewparent = view.getParent();
        if (viewparent != null)
        {
            ((FrameLayout)viewparent).removeView(view);
        }
        framelayout.removeAllViews();
        framelayout.addView(view);
    }
}
