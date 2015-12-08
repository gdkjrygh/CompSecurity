// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.rest.Callback;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel, Category

public class Forum extends BaseModel
{

    private List categories;
    private String name;
    private int numberOfOpenSuggestions;
    private int numberOfVotesAllowed;

    public Forum()
    {
    }

    public static void loadForum(int i, Callback callback)
    {
        doGet(apiPath("/forums/%d.json", new Object[] {
            Integer.valueOf(i)
        }), new _cls1(callback, callback));
    }

    public List getCategories()
    {
        return categories;
    }

    public String getName()
    {
        return name;
    }

    public int getNumberOfOpenSuggestions()
    {
        return numberOfOpenSuggestions;
    }

    public int getNumberOfVotesAllowed()
    {
        return numberOfVotesAllowed;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        name = getString(jsonobject, "name");
        jsonobject = jsonobject.getJSONArray("topics").getJSONObject(0);
        numberOfOpenSuggestions = jsonobject.getInt("open_suggestions_count");
        numberOfVotesAllowed = jsonobject.getInt("votes_allowed");
        categories = deserializeList(jsonobject, "categories", com/uservoice/uservoicesdk/model/Category);
        if (categories == null)
        {
            categories = new ArrayList();
        }
    }

    /* member class not found */
    class _cls1 {}

}
