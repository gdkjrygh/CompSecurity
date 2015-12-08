// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.view.MenuItem;
import android.view.View;

public final class GamesMenuItemClickListener
    implements android.support.v7.widget.PopupMenu.OnMenuItemClickListener
{
    public static interface OnMenuItemClickListener
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem, View view);
    }


    private View mAnchor;
    private OnMenuItemClickListener mListener;

    public GamesMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener, View view)
    {
        mListener = onmenuitemclicklistener;
        mAnchor = view;
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        return mListener.onMenuItemClick(menuitem, mAnchor);
    }
}
