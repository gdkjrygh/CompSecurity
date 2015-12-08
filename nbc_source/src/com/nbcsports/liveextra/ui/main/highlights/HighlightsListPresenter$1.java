// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.highlights;

import com.nbcsports.liveextra.library.api.models.AssetList;
import com.nbcsports.liveextra.library.api.models.FeaturedContent;
import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.main.highlights:
//            HighlightsListPresenter

class this._cls0
    implements Func1
{

    final HighlightsListPresenter this$0;

    public AssetList call(FeaturedContent featuredcontent)
    {
        return featuredcontent.getSpotlight();
    }

    public volatile Object call(Object obj)
    {
        return call((FeaturedContent)obj);
    }

    ()
    {
        this$0 = HighlightsListPresenter.this;
        super();
    }
}
