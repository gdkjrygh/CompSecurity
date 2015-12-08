// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.widget.Toast;
import com.soundcloud.android.actionbar.PullToRefreshController;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment, PlaylistDetailsController

private final class <init> extends 
{

    final PlaylistDetailFragment this$0;

    public final void onError(Throwable throwable)
    {
        if (PlaylistDetailFragment.access$700(PlaylistDetailFragment.this).hasContent())
        {
            Toast.makeText(getActivity(), 0x7f0700f7, 0).show();
            pullToRefreshController.stopRefreshing();
            return;
        } else
        {
            super.onError(throwable);
            return;
        }
    }

    private ()
    {
        this$0 = PlaylistDetailFragment.this;
        super(PlaylistDetailFragment.this, null);
    }

    ( )
    {
        this();
    }
}
