// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.model.SearchCollection;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            SearchResult

final class 
    implements f
{

    public final SearchResult call(SearchCollection searchcollection)
    {
        return new SearchResult(searchcollection.getCollection(), searchcollection.getNextLink(), searchcollection.getQueryUrn());
    }

    public final volatile Object call(Object obj)
    {
        return call((SearchCollection)obj);
    }

    ()
    {
    }
}
