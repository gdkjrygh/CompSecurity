// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.api.model.Link;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.PropertySets;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.Pager;
import java.util.ArrayList;
import java.util.List;
import rx.b;

// Referenced classes of package com.soundcloud.android.search:
//            SearchOperations, SearchResult

class searchType
    implements com.soundcloud.rx.ingFunction
{

    private final List allUrns = new ArrayList();
    private Urn queryUrn;
    private final int searchType;
    final SearchOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((SearchResult)obj);
    }

    public b call(SearchResult searchresult)
    {
        Optional optional = searchresult.nextHref;
        allUrns.addAll(PropertySets.extractUrns(searchresult.getItems()));
        if (searchresult.queryUrn.isPresent())
        {
            queryUrn = (Urn)searchresult.queryUrn.get();
        }
        if (optional.isPresent())
        {
            return SearchOperations.access$1200(SearchOperations.this, (Link)optional.get(), searchType);
        } else
        {
            return Pager.finish();
        }
    }

    public SearchQuerySourceInfo getSearchQuerySourceInfo()
    {
        return new SearchQuerySourceInfo(queryUrn);
    }

    public SearchQuerySourceInfo getSearchQuerySourceInfo(int i, Urn urn)
    {
        urn = new SearchQuerySourceInfo(queryUrn, i, urn);
        urn.setQueryResults(allUrns);
        return urn;
    }

    public I(int i)
    {
        this$0 = SearchOperations.this;
        super();
        queryUrn = Urn.NOT_SET;
        searchType = i;
    }
}
