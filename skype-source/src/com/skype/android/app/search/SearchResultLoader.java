// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.PROPKEY;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.util.EvictingPriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class SearchResultLoader
    implements Callable
{
    public class SearchResult
    {

        List recent;
        String searchTerm;
        final SearchResultLoader this$0;

        public SearchResult(List list, String s)
        {
            this$0 = SearchResultLoader.this;
            super();
            recent = list;
            searchTerm = s;
        }
    }


    private static final int DATABASE_BATCH_SIZE = 1000;
    private static final int MAXIMUM_RESULTS_NUMBER = 1000;
    private final Comparator comparator;
    protected final SkyLib lib;
    private final com.skype.SkyLib.OBJECTTYPE objectType;
    private final PROPKEY props[];
    protected final String searchTerm;

    public SearchResultLoader(com.skype.SkyLib.OBJECTTYPE objecttype, PROPKEY apropkey[], Comparator comparator1, SkyLib skylib, String s)
    {
        lib = skylib;
        searchTerm = s;
        objectType = objecttype;
        props = apropkey;
        comparator = comparator1;
    }

    public abstract String buildQuery();

    public SearchResult call()
    {
        Object obj = lib.findObjects(objectType, buildQuery());
        EvictingPriorityQueue evictingpriorityqueue = new EvictingPriorityQueue(getMaxResultsNumber(), Collections.reverseOrder(comparator));
        if (((com.skype.SkyLib.FindObjects_Result) (obj)).m_return)
        {
            int k = ((com.skype.SkyLib.FindObjects_Result) (obj)).m_objectIDList.length;
            for (int i = 0; i < k; i += 1000)
            {
                ProptableImpl proptableimpl = new ProptableImpl();
                int ai[] = Arrays.copyOfRange(((com.skype.SkyLib.FindObjects_Result) (obj)).m_objectIDList, i, Math.min(k - i, 1000) + i);
                lib.getPropertyTable(ai, props, proptableimpl);
                for (int j = 0; j < proptableimpl.getCount(); j++)
                {
                    evictingpriorityqueue.add(getItem(proptableimpl, j));
                }

            }

        }
        obj = new ArrayList(evictingpriorityqueue);
        Collections.sort(((List) (obj)), comparator);
        return new SearchResult(((List) (obj)), searchTerm);
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public abstract Object getItem(Proptable proptable, int i);

    public int getMaxResultsNumber()
    {
        return 1000;
    }

    public String getSearch()
    {
        return searchTerm;
    }
}
