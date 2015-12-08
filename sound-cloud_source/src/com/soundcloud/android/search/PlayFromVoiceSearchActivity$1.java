// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            SearchResult, PlayFromVoiceSearchActivity

class this._cls0
    implements f
{

    final PlayFromVoiceSearchActivity this$0;

    public volatile Object call(Object obj)
    {
        return call((SearchResult)obj);
    }

    public b call(SearchResult searchresult)
    {
        searchresult = searchresult.getItems();
        boolean flag;
        if (!searchresult.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "There is no result for this search");
        return playbackInitiator.playTrackWithRecommendationsLegacy((Urn)((PropertySet)searchresult.get(0)).get(TrackProperty.URN), new PlaySessionSource(Screen.VOICE_COMMAND));
    }

    A()
    {
        this$0 = PlayFromVoiceSearchActivity.this;
        super();
    }
}
