// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.utils.ViewUtils;
import java.util.List;

class CollectionPlaylistHeaderRenderer
    implements CellRenderer
{
    static interface OnSettingsClickListener
    {

        public abstract void onSettingsClicked(View view);
    }


    public static final int EXTEND_OPTIONS_HIT_DP = 8;
    private OnSettingsClickListener onSettingsClickListener;
    private final android.view.View.OnClickListener onSettingsClicked = new _cls1();

    public CollectionPlaylistHeaderRenderer()
    {
    }

    public void bindItemView(int i, View view, List list)
    {
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03002c, viewgroup, false);
        View view = viewgroup.findViewById(0x7f0f00cc);
        view.setOnClickListener(onSettingsClicked);
        ViewUtils.extendTouchArea(view, 8);
        return viewgroup;
    }

    public void setOnSettingsClickListener(OnSettingsClickListener onsettingsclicklistener)
    {
        onSettingsClickListener = onsettingsclicklistener;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CollectionPlaylistHeaderRenderer this$0;

        public void onClick(View view)
        {
            if (onSettingsClickListener != null)
            {
                onSettingsClickListener.onSettingsClicked(view);
            }
        }

        _cls1()
        {
            this$0 = CollectionPlaylistHeaderRenderer.this;
            super();
        }
    }

}
