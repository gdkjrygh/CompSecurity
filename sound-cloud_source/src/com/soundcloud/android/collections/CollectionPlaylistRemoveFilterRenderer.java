// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.presentation.CellRenderer;
import java.util.List;

class CollectionPlaylistRemoveFilterRenderer
    implements CellRenderer
{
    static interface OnRemoveFilterListener
    {

        public abstract void onRemoveFilter();
    }


    private OnRemoveFilterListener onRemoveFilterClickListener;
    private final android.view.View.OnClickListener onRemoveFilterClicked = new _cls1();

    public CollectionPlaylistRemoveFilterRenderer()
    {
    }

    public void bindItemView(int i, View view, List list)
    {
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03002b, viewgroup, false);
        viewgroup.findViewById(0x7f0f00ca).setOnClickListener(onRemoveFilterClicked);
        return viewgroup;
    }

    public void setOnRemoveFilterClickListener(OnRemoveFilterListener onremovefilterlistener)
    {
        onRemoveFilterClickListener = onremovefilterlistener;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CollectionPlaylistRemoveFilterRenderer this$0;

        public void onClick(View view)
        {
            if (onRemoveFilterClickListener != null)
            {
                onRemoveFilterClickListener.onRemoveFilter();
            }
        }

        _cls1()
        {
            this$0 = CollectionPlaylistRemoveFilterRenderer.this;
            super();
        }
    }

}
