// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import rx.b.b;

// Referenced classes of package com.soundcloud.android.explore:
//            SuggestedTracksCollection, ExploreTracksFragment

class this._cls0
    implements b
{

    final ExploreTracksFragment this$0;

    public void call(SuggestedTracksCollection suggestedtrackscollection)
    {
        ExploreTracksFragment.access$002(ExploreTracksFragment.this, suggestedtrackscollection.getTrackingTag());
    }

    public volatile void call(Object obj)
    {
        call((SuggestedTracksCollection)obj);
    }

    n()
    {
        this$0 = ExploreTracksFragment.this;
        super();
    }
}
