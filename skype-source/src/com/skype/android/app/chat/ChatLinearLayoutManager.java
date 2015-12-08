// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

final class ChatLinearLayoutManager extends LinearLayoutManager
{
    public static interface OnLayoutChildrenListener
    {

        public abstract void onLayoutChildrenCompleted(ChatLinearLayoutManager chatlinearlayoutmanager);
    }


    private OnLayoutChildrenListener listener;
    private final int minimumVisibleHeight;

    public ChatLinearLayoutManager(Context context)
    {
        super(context);
        minimumVisibleHeight = context.getResources().getDimensionPixelOffset(0x7f0c0177);
    }

    private boolean isMinimalHeightVisible(int i)
    {
        View view = findViewByPosition(i);
        Rect rect = new Rect();
        return view.getGlobalVisibleRect(rect) && rect.height() >= minimumVisibleHeight;
    }

    public final int findFirstVisibleMessage()
    {
        int j = findFirstVisibleItemPosition();
        int i = j;
        if (j != -1)
        {
            i = j;
            if (!isMinimalHeightVisible(j))
            {
                i = findFirstCompletelyVisibleItemPosition();
            }
        }
        return i;
    }

    public final int findLastVisibleMessage()
    {
        int j = findLastVisibleItemPosition();
        int i = j;
        if (j != -1)
        {
            i = j;
            if (!isMinimalHeightVisible(j))
            {
                i = findLastCompletelyVisibleItemPosition();
            }
        }
        return i;
    }

    public final void onLayoutChildren(android.support.v7.widget.RecyclerView.o o, android.support.v7.widget.RecyclerView.s s)
    {
        super.onLayoutChildren(o, s);
        if (listener != null)
        {
            listener.onLayoutChildrenCompleted(this);
        }
    }

    public final void setOnLayoutChildrenListener(OnLayoutChildrenListener onlayoutchildrenlistener)
    {
        listener = onlayoutchildrenlistener;
    }
}
