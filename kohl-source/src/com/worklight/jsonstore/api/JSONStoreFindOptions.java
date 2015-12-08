// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;

import com.worklight.jsonstore.database.SortDirection;
import com.worklight.jsonstore.exceptions.JSONStoreInvalidSortObjectException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JSONStoreFindOptions
{

    private static final String OPTION_FILTER = "filter";
    private static final String OPTION_LIMIT = "limit";
    private static final String OPTION_OFFSET = "offset";
    private static final String OPTION_SORT_ARRAY = "sort";
    private Map filter;
    private boolean includeDeleted;
    private Integer limit;
    private Integer offset;
    private LinkedHashMap sort;

    public JSONStoreFindOptions()
    {
        includeDeleted = false;
        limit = null;
        offset = null;
        filter = new HashMap();
        sort = new LinkedHashMap();
    }

    public JSONStoreFindOptions(JSONObject jsonobject)
        throws JSONException, JSONStoreInvalidSortObjectException
    {
        includeDeleted = false;
        filter = new HashMap();
        sort = new LinkedHashMap();
        Object obj = jsonobject.optString("limit", null);
        if (obj != null)
        {
            setLimit(Integer.valueOf(Integer.parseInt(((String) (obj)))));
        }
        obj = jsonobject.optString("offset", null);
        if (obj != null)
        {
            setOffset(Integer.valueOf(Integer.parseInt(((String) (obj)))));
        }
        obj = jsonobject.optJSONArray("sort");
        if (obj != null)
        {
            int i = 0;
            while (i < ((JSONArray) (obj)).length()) 
            {
                Object obj1 = ((JSONArray) (obj)).getJSONObject(i);
                Iterator iterator = ((JSONObject) (obj1)).keys();
                String s = (String)iterator.next();
                if (iterator.hasNext())
                {
                    throw new JSONStoreInvalidSortObjectException("One of the sort objects in the sort array has more than one field.");
                }
                obj1 = ((JSONObject) (obj1)).getString(s);
                if (((String) (obj1)).equalsIgnoreCase("ASC"))
                {
                    sortBySearchFieldAscending(s);
                } else
                if (((String) (obj1)).equalsIgnoreCase("DESC"))
                {
                    sortBySearchFieldDescending(s);
                } else
                {
                    throw new JSONStoreInvalidSortObjectException("Invalid sorting direction (ascending or descending) specified.");
                }
                i++;
            }
        }
        jsonobject = jsonobject.optJSONArray("filter");
        if (jsonobject != null)
        {
            for (int j = 0; j < jsonobject.length(); j++)
            {
                addSearchFilter(jsonobject.getString(j));
            }

        }
    }

    public void addSearchFilter(String s)
    {
        filter.put(s, Boolean.valueOf(false));
    }

    void addSearchFilterSpecial(String s)
    {
        filter.put(s, Boolean.valueOf(true));
    }

    public Integer getLimit()
    {
        return limit;
    }

    public Integer getOffset()
    {
        return offset;
    }

    Map getSearchFilters()
    {
        return filter;
    }

    public LinkedHashMap getSort()
    {
        return sort;
    }

    public void includeDeletedDocuments(boolean flag)
    {
        includeDeleted = flag;
    }

    public void setLimit(Integer integer)
    {
        limit = integer;
    }

    public void setOffset(Integer integer)
    {
        offset = integer;
    }

    public void setSearchFilters(List list)
    {
        filter.clear();
        String s;
        for (list = list.iterator(); list.hasNext(); filter.put(s, Boolean.valueOf(false)))
        {
            s = (String)list.next();
        }

    }

    public boolean shouldIncludeDeletedDocuments()
    {
        return includeDeleted;
    }

    public void sortBySearchFieldAscending(String s)
    {
        sort.put(s, SortDirection.ASCENDING);
    }

    public void sortBySearchFieldDescending(String s)
    {
        sort.put(s, SortDirection.DESCENDING);
    }
}
