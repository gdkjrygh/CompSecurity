// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.rx.observers.EmptyViewAware;
import com.soundcloud.android.utils.ViewUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.android.view.EmptyViewBuilder;
import java.util.List;

class EmptyPlaylistTracksRenderer
    implements CellRenderer, EmptyViewAware
{

    private com.soundcloud.android.view.EmptyView.Status emptyViewStatus;

    EmptyPlaylistTracksRenderer()
    {
        emptyViewStatus = com.soundcloud.android.view.EmptyView.Status.WAITING;
    }

    public void bindItemView(int i, View view, List list)
    {
        ((EmptyView)view).setStatus(emptyViewStatus);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = viewgroup.getContext();
        EmptyView emptyview = (new EmptyViewBuilder()).withImage(0x7f020101).withMessageText(viewgroup.getString(0x7f070121)).withSecondaryText(viewgroup.getString(0x7f070120)).build(viewgroup);
        emptyview.setPadding(0, ViewUtils.dpToPx(viewgroup, 48), 0, ViewUtils.dpToPx(viewgroup, 48));
        return emptyview;
    }

    public void setEmptyViewStatus(com.soundcloud.android.view.EmptyView.Status status)
    {
        emptyViewStatus = status;
    }
}
