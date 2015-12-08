// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.soundcloud.android.actionbar.PullToRefreshController;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.utils.ErrorUtils;
import java.util.List;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistDetailFragment, PlaylistDetailsController, PlaylistWithTracks

private class <init> extends DefaultSubscriber
{

    final PlaylistDetailFragment this$0;

    public void onCompleted()
    {
        PlaylistDetailFragment.access$700(PlaylistDetailFragment.this).setEmptyViewStatus(com.soundcloud.android.view.wStatus);
        pullToRefreshController.stopRefreshing();
    }

    public void onError(Throwable throwable)
    {
        super.onError(throwable);
        if (throwable instanceof n)
        {
            Toast.makeText(getActivity(), 0x7f070182, 0).show();
            getActivity().finish();
            return;
        } else
        {
            PlaylistDetailFragment.access$700(PlaylistDetailFragment.this).setEmptyViewStatus(ErrorUtils.emptyViewStatusFromError(throwable));
            PlaylistDetailFragment.access$800(PlaylistDetailFragment.this, true);
            pullToRefreshController.stopRefreshing();
            return;
        }
    }

    public void onNext(PlaylistWithTracks playlistwithtracks)
    {
        (new StringBuilder("got playlist; track count = ")).append(playlistwithtracks.getTracks().size());
        refreshMetaData(playlistwithtracks);
        PlaylistDetailFragment.access$700(PlaylistDetailFragment.this).setContent(playlistwithtracks, PlaylistDetailFragment.access$600(PlaylistDetailFragment.this));
        PlaylistDetailFragment.access$800(PlaylistDetailFragment.this, true);
        if (PlaylistDetailFragment.access$900(PlaylistDetailFragment.this) && PlaylistDetailFragment.access$700(PlaylistDetailFragment.this).hasTracks())
        {
            PlaylistDetailFragment.access$200(PlaylistDetailFragment.this);
            PlaylistDetailFragment.access$902(PlaylistDetailFragment.this, false);
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PlaylistWithTracks)obj);
    }

    private n()
    {
        this$0 = PlaylistDetailFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
