// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.playlists:
//            AddToPlaylistDialogFragment, AddTrackToPlaylistItem

private class <init> extends DefaultSubscriber
{

    final AddToPlaylistDialogFragment this$0;

    public volatile void onNext(Object obj)
    {
        onNext((List)obj);
    }

    public void onNext(List list)
    {
        AddToPlaylistDialogFragment.access$100(AddToPlaylistDialogFragment.this).(AddTrackToPlaylistItem.createNewPlaylistItem());
        AddTrackToPlaylistItem addtracktoplaylistitem;
        for (list = list.iterator(); list.hasNext(); AddToPlaylistDialogFragment.access$100(AddToPlaylistDialogFragment.this).(addtracktoplaylistitem))
        {
            addtracktoplaylistitem = (AddTrackToPlaylistItem)list.next();
        }

        AddToPlaylistDialogFragment.access$100(AddToPlaylistDialogFragment.this).ataSetChanged();
    }

    private ()
    {
        this$0 = AddToPlaylistDialogFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
