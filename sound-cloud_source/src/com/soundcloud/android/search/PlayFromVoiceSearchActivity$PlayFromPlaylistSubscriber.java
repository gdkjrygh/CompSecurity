// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playlists.PlaylistDetailActivity;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

// Referenced classes of package com.soundcloud.android.search:
//            PlayFromVoiceSearchActivity

private class query extends DefaultSubscriber
{

    private final String query;
    final PlayFromVoiceSearchActivity this$0;

    public void onError(Throwable throwable)
    {
        PlayFromVoiceSearchActivity.access$000(PlayFromVoiceSearchActivity.this, query);
    }

    public void onNext(PropertySet propertyset)
    {
        PlaylistDetailActivity.start(PlayFromVoiceSearchActivity.this, (Urn)propertyset.get(PlaylistProperty.URN), Screen.SEARCH_PLAYLIST_DISCO, true);
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }

    public (String s)
    {
        this$0 = PlayFromVoiceSearchActivity.this;
        super();
        query = s;
    }
}
