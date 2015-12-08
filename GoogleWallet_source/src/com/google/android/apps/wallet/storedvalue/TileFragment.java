// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import com.google.android.apps.wallet.base.fragment.WalletFragment;

abstract class TileFragment extends WalletFragment
{
    public static interface TileChangedListener
    {

        public abstract void onTileChanged(TileFragment tilefragment);
    }


    private TileChangedListener tileChangedListener;

    public TileFragment()
    {
    }

    protected final void notifyTileChanged()
    {
        if (tileChangedListener != null)
        {
            tileChangedListener.onTileChanged(this);
        }
    }

    public void onResume()
    {
        super.onResume();
        notifyTileChanged();
    }

    final void setTileChangedListener(TileChangedListener tilechangedlistener)
    {
        tileChangedListener = tilechangedlistener;
    }

    public abstract boolean shouldShow();
}
