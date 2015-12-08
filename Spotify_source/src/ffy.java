// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import java.util.List;

public final class ffy
    implements ghl
{

    public static final ffy a = new ffy();

    public ffy()
    {
    }

    public final Object a(Object obj)
    {
        eqv eqv1 = (eqv)obj;
        SearchResults searchresults = (SearchResults)((eqw)eqv1.a.get(0)).a.a(SearchResults.NO_RESULTS);
        obj = (SearchResults)((eqw)eqv1.b.get(0)).a.a(SearchResults.NO_RESULTS);
        if (!((eqw)eqv1.a.get(0)).a.b() || searchresults.shouldIncludeLocalResults())
        {
            if (searchresults.isEmpty() && !((SearchResults) (obj)).isEmpty())
            {
                return obj;
            }
            if (searchresults.isEmpty() || !((SearchResults) (obj)).isEmpty())
            {
                String s = searchresults.getSearchTerm();
                PorcelainJsonImmutableLinearCollection porcelainjsonimmutablelinearcollection = searchresults.getViews().append(((SearchResults) (obj)).getViews());
                String s1 = searchresults.getTitle();
                String s2 = searchresults.getEcho();
                Integer integer;
                if (searchresults.isSessionAvailable())
                {
                    obj = searchresults.getCurrentSessionId();
                } else
                {
                    obj = null;
                }
                if (searchresults.isSessionAvailable())
                {
                    integer = Integer.valueOf(searchresults.getCurrentSequenceNumber());
                } else
                {
                    integer = null;
                }
                return new SearchResults(s, porcelainjsonimmutablelinearcollection, null, s1, s2, ((String) (obj)), integer, searchresults.getLoggingContext(), Boolean.valueOf(false), Boolean.valueOf(searchresults.shouldIncludeLocalResults()), searchresults.getSectionBackgrounds());
            }
        }
        return searchresults;
    }

}
