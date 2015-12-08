// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.presentation.CellRenderer;
import java.util.List;

class CollectionEmptyPlaylistsRenderer
    implements CellRenderer
{

    public CollectionEmptyPlaylistsRenderer()
    {
    }

    public void bindItemView(int i, View view, List list)
    {
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030063, viewgroup, false);
    }
}
