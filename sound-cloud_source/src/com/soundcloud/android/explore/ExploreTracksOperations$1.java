// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.api.model.Link;
import com.soundcloud.java.optional.Optional;
import rx.a.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.explore:
//            SuggestedTracksCollection, ExploreTracksOperations

class this._cls0 extends a
{

    final ExploreTracksOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((SuggestedTracksCollection)obj);
    }

    public b call(SuggestedTracksCollection suggestedtrackscollection)
    {
        suggestedtrackscollection = suggestedtrackscollection.getNextLink();
        if (suggestedtrackscollection.isPresent())
        {
            return ExploreTracksOperations.access$000(ExploreTracksOperations.this, ((Link)suggestedtrackscollection.get()).getHref());
        } else
        {
            return a.finish();
        }
    }

    ()
    {
        this$0 = ExploreTracksOperations.this;
        super();
    }
}
