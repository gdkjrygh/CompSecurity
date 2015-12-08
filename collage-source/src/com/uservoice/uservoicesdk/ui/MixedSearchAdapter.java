// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.uservoice.uservoicesdk.activity.SearchActivity;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            SearchAdapter, Utils

public class MixedSearchAdapter extends SearchAdapter
    implements android.widget.AdapterView.OnItemClickListener
{

    protected static int LOADING = 1;
    public static int SCOPE_ALL = 0;
    public static int SCOPE_ARTICLES = 1;
    public static int SCOPE_IDEAS = 2;
    protected static int SEARCH_RESULT = 0;
    protected final FragmentActivity context;
    protected LayoutInflater inflater;

    public MixedSearchAdapter(FragmentActivity fragmentactivity)
    {
        context = fragmentactivity;
        inflater = (LayoutInflater)fragmentactivity.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        if (loading)
        {
            return 1;
        } else
        {
            return getScopedSearchResults().size();
        }
    }

    public Object getItem(int i)
    {
        if (loading)
        {
            return null;
        } else
        {
            return (BaseModel)getScopedSearchResults().get(i);
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        if (loading)
        {
            return LOADING;
        } else
        {
            return SEARCH_RESULT;
        }
    }

    public List getScopedSearchResults()
    {
        if (scope == SCOPE_ALL)
        {
            return searchResults;
        }
        if (scope == SCOPE_ARTICLES)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = searchResults.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                BaseModel basemodel = (BaseModel)iterator.next();
                if (basemodel instanceof Article)
                {
                    arraylist.add(basemodel);
                }
            } while (true);
            return arraylist;
        }
        if (scope == SCOPE_IDEAS)
        {
            ArrayList arraylist1 = new ArrayList();
            Iterator iterator1 = searchResults.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                BaseModel basemodel1 = (BaseModel)iterator1.next();
                if (basemodel1 instanceof Suggestion)
                {
                    arraylist1.add(basemodel1);
                }
            } while (true);
            return arraylist1;
        } else
        {
            return null;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j;
        j = getItemViewType(i);
        viewgroup = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        if (j != SEARCH_RESULT) goto _L4; else goto _L3
_L3:
        viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_instant_answer_item, null);
_L2:
        if (j == SEARCH_RESULT)
        {
            Utils.displayInstantAnswer(viewgroup, (BaseModel)getItem(i));
        }
        return viewgroup;
_L4:
        viewgroup = view;
        if (j == LOADING)
        {
            viewgroup = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_loading_item, null);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        return !loading;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (getItemViewType(i) == SEARCH_RESULT)
        {
            Utils.showModel(context, (BaseModel)getItem(i));
        }
    }

    protected RestTask search(String s, Callback callback)
    {
        currentQuery = s;
        return Article.loadInstantAnswers(s, new _cls1(s, callback));
    }

    protected void searchResultsUpdated()
    {
        Iterator iterator = searchResults.iterator();
        int j = 0;
        int i = 0;
        while (iterator.hasNext()) 
        {
            int l;
            if ((BaseModel)iterator.next() instanceof Article)
            {
                int k = j;
                j = i + 1;
                i = k;
            } else
            {
                int i1 = j + 1;
                j = i;
                i = i1;
            }
            l = j;
            j = i;
            i = l;
        }
        ((SearchActivity)context).updateScopedSearch(searchResults.size(), i, j);
    }


    /* member class not found */
    class _cls1 {}

}
