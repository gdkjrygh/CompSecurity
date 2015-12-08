// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONStoreChangeOptions
{

    private static final String ADD_NEW_KEY = "addNew";
    private static final String MARK_DIRTY_KEY = "markDirty";
    private static final String REPLACE_CRITERIA_KEY = "replaceCriteria";
    private boolean addNew;
    private boolean markDirty;
    private List searchFieldCriteria;

    public JSONStoreChangeOptions()
    {
        searchFieldCriteria = new LinkedList();
        markDirty = false;
        addNew = false;
    }

    public JSONStoreChangeOptions(JSONObject jsonobject)
        throws JSONException
    {
        this();
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (jsonobject.has("addNew"))
        {
            setAddNew(jsonobject.getBoolean("addNew"));
        }
        if (jsonobject.has("markDirty"))
        {
            setMarkDirty(jsonobject.getBoolean("markDirty"));
        }
        if (jsonobject.has("replaceCriteria"))
        {
            jsonobject = jsonobject.optJSONArray("replaceCriteria");
            if (jsonobject != null)
            {
                int i = 0;
                while (i < jsonobject.length()) 
                {
                    addSearchFieldToCriteria(jsonobject.getString(i));
                    i++;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void addSearchFieldToCriteria(String s)
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("search_key parameter cannot be null or empty");
        } else
        {
            searchFieldCriteria.add(s);
            return;
        }
    }

    public List getSearchFieldCriteria()
    {
        return searchFieldCriteria;
    }

    public boolean isAddNew()
    {
        return addNew;
    }

    public boolean isMarkDirty()
    {
        return markDirty;
    }

    public void setAddNew(boolean flag)
    {
        addNew = flag;
    }

    public void setMarkDirty(boolean flag)
    {
        markDirty = flag;
    }

    public void setSearchFieldCriteria(List list)
    {
        searchFieldCriteria.clear();
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); addSearchFieldToCriteria((String)list.next())) { }
        }
    }
}
