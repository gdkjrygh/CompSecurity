// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.amazon.device.associates:
//            ShoppingServiceRequest, an, SortType, FilterType

public class SearchRequest extends ShoppingServiceRequest
{

    private final String a;
    private final String b;
    private final Map c;
    private SortType d;
    private final int e;

    public SearchRequest(String s, String s1)
    {
        this(s, s1, 1);
    }

    public SearchRequest(String s, String s1, int i)
    {
        c = new HashMap();
        an.a(s, "category");
        an.a(s1, "searchTerm");
        an.a(i, "page");
        a = s;
        b = s1;
        d = SortType.RELEVANCE;
        e = i;
    }

    JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1;
        try
        {
            jsonobject.put("category", a);
            jsonobject.put("searchTerm", b);
            jsonobject1 = new JSONObject();
            FilterType filtertype;
            for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); jsonobject1.put(filtertype.toString(), c.get(filtertype)))
            {
                filtertype = (FilterType)iterator.next();
            }

        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        jsonobject.put("filters", jsonobject1);
        jsonobject.put("sortType", d.toString());
        jsonobject.put("page", e);
        return jsonobject;
    }

    public void addFilter(FilterType filtertype, String s)
    {
        c.put(filtertype, s);
    }

    public String getCategory()
    {
        return a;
    }

    public Map getFilters()
    {
        return Collections.unmodifiableMap(c);
    }

    public int getPage()
    {
        return e;
    }

    public String getSearchTerm()
    {
        return b;
    }

    public SortType getSortType()
    {
        return d;
    }

    public void removeFilter(FilterType filtertype)
    {
        c.remove(filtertype);
    }

    public void setSortType(SortType sorttype)
    {
        d = sorttype;
    }

    public String toString()
    {
        String s;
        try
        {
            s = a().toString(4);
        }
        catch (JSONException jsonexception)
        {
            return null;
        }
        return s;
    }
}
