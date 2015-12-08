// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.highlights;

import com.nbcsports.liveextra.content.ContentService;
import com.nbcsports.liveextra.library.api.models.AssetList;
import com.nbcsports.liveextra.library.api.models.FeaturedContent;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.nbcsports.liveextra.library.core.SortOrder;
import com.nbcsports.liveextra.ui.main.core.AssetViewModelTransformer;
import com.nbcsports.liveextra.ui.main.core.ContentListPresenter;
import java.util.EnumSet;
import javax.inject.Provider;
import rx.functions.Func1;

public class HighlightsListPresenter extends ContentListPresenter
{

    public HighlightsListPresenter(ContentService contentservice, AssetViewModelTransformer assetviewmodeltransformer, Provider provider)
    {
        super(contentservice, assetviewmodeltransformer, provider);
    }

    protected EnumSet getFilters()
    {
        return null;
    }

    protected SortOrder getSortOrder()
    {
        return SortOrder.DESC;
    }

    protected void loadData()
    {
        rx.Observable observable;
        if (sport.get() == null)
        {
            observable = service.loadFeaturedContent();
        } else
        {
            observable = service.loadFeaturedSportContent(((Sport)sport.get()).getCode());
        }
        subscribe(observable, new Func1() {

            final HighlightsListPresenter this$0;

            public AssetList call(FeaturedContent featuredcontent)
            {
                return featuredcontent.getSpotlight();
            }

            public volatile Object call(Object obj)
            {
                return call((FeaturedContent)obj);
            }

            
            {
                this$0 = HighlightsListPresenter.this;
                super();
            }
        });
    }
}
