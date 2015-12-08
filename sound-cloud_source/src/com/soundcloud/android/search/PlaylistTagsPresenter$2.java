// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.view.View;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistTagsPresenter

class this._cls0
    implements android.view.tTagsPresenter._cls2
{

    final PlaylistTagsPresenter this$0;

    public void onClick(View view)
    {
        PlaylistTagsPresenter.access$000(PlaylistTagsPresenter.this).publish(EventQueue.TRACKING, SearchEvent.popularTagSearch((String)view.getTag()));
        if (PlaylistTagsPresenter.access$100(PlaylistTagsPresenter.this) != null)
        {
            PlaylistTagsPresenter.access$100(PlaylistTagsPresenter.this).onTagSelected(view.getContext(), (String)view.getTag());
        }
    }

    stener()
    {
        this$0 = PlaylistTagsPresenter.this;
        super();
    }
}
