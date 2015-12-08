// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public interface StickyGridHeadersBaseAdapter
    extends ListAdapter
{

    public abstract int getCountForHeader(int i);

    public abstract View getHeaderView(int i, View view, ViewGroup viewgroup);

    public abstract int getNumHeaders();
}
