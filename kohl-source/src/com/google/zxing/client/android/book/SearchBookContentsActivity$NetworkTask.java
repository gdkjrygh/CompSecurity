// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.book;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.LocaleManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.zxing.client.android.book:
//            SearchBookContentsActivity, SearchBookContentsResult, BrowseBookListener, SearchBookContentsAdapter

private final class <init> extends AsyncTask
{

    final SearchBookContentsActivity this$0;

    private void handleSearchResults(JSONObject jsonobject)
    {
        int j;
        j = jsonobject.getInt("number_of_results");
        SearchBookContentsActivity.access$300(SearchBookContentsActivity.this).setText((new StringBuilder()).append(getString(com.google.zxing.client.android.ng)).append(" : ").append(j).toString());
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        ArrayList arraylist;
        jsonobject = jsonobject.getJSONArray("search_results");
        SearchBookContentsResult.setQuery(SearchBookContentsActivity.access$400(SearchBookContentsActivity.this).getText().toString());
        arraylist = new ArrayList(j);
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(parseResult(jsonobject.getJSONObject(i)));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            SearchBookContentsActivity.access$600(SearchBookContentsActivity.this).setOnItemClickListener(new BrowseBookListener(SearchBookContentsActivity.this, arraylist));
            SearchBookContentsActivity.access$600(SearchBookContentsActivity.this).setAdapter(new SearchBookContentsAdapter(SearchBookContentsActivity.this, arraylist));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.w(SearchBookContentsActivity.access$200(), "Bad JSON from book search", jsonobject);
        }
        break MISSING_BLOCK_LABEL_215;
        if ("false".equals(jsonobject.optString("searchable")))
        {
            SearchBookContentsActivity.access$300(SearchBookContentsActivity.this).setText(com.google.zxing.client.android.Task.this._fld0);
        }
        SearchBookContentsActivity.access$600(SearchBookContentsActivity.this).setAdapter(null);
        return;
        SearchBookContentsActivity.access$600(SearchBookContentsActivity.this).setAdapter(null);
        SearchBookContentsActivity.access$300(SearchBookContentsActivity.this).setText(com.google.zxing.client.android.Task.this._fld0);
        return;
    }

    private SearchBookContentsResult parseResult(JSONObject jsonobject)
    {
        boolean flag1 = false;
        String s;
        String s1;
        String s2;
        boolean flag;
        try
        {
            s1 = jsonobject.getString("page_id");
            s2 = jsonobject.optString("page_number");
            s = jsonobject.optString("snippet_text");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.w(SearchBookContentsActivity.access$200(), jsonobject);
            return new SearchBookContentsResult(getString(com.google.zxing.client.android.ng), "", "", false);
        }
        if (s2 == null || s2.isEmpty())
        {
            jsonobject = "";
        } else
        {
            jsonobject = (new StringBuilder()).append(getString(com.google.zxing.client.android.ng)).append(' ').append(s2).toString();
        }
        flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (!s.isEmpty())
            {
                flag = true;
            }
        }
        if (flag)
        {
            s = SearchBookContentsActivity.access$700().matcher(s).replaceAll("");
            s = SearchBookContentsActivity.access$800().matcher(s).replaceAll("<");
            s = SearchBookContentsActivity.access$900().matcher(s).replaceAll(">");
            s = SearchBookContentsActivity.access$1000().matcher(s).replaceAll("'");
            s = SearchBookContentsActivity.access$1100().matcher(s).replaceAll("\"");
        } else
        {
            s = (new StringBuilder()).append('(').append(getString(com.google.zxing.client.android.ng)).append(')').toString();
        }
        return new SearchBookContentsResult(s1, jsonobject, s, flag);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient JSONObject doInBackground(String as[])
    {
        String s = as[0];
        as = as[1];
        try
        {
            if (LocaleManager.isBookSearchUrl(as))
            {
                as = as.substring(as.indexOf('=') + 1);
                as = (new StringBuilder()).append("http://www.google.com/books?id=").append(as).append("&jscmd=SearchWithinVolume2&q=").append(s).toString();
            } else
            {
                as = (new StringBuilder()).append("http://www.google.com/books?vid=isbn").append(as).append("&jscmd=SearchWithinVolume2&q=").append(s).toString();
            }
            return new JSONObject(HttpHelper.downloadViaHttp(as, com.google.zxing.client.android.Task).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.w(SearchBookContentsActivity.access$200(), "Error accessing book search", as);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.w(SearchBookContentsActivity.access$200(), "Error accessing book search", as);
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((JSONObject)obj);
    }

    protected void onPostExecute(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            SearchBookContentsActivity.access$300(SearchBookContentsActivity.this).setText(com.google.zxing.client.android.Task.this._fld0);
        } else
        {
            handleSearchResults(jsonobject);
        }
        SearchBookContentsActivity.access$400(SearchBookContentsActivity.this).setEnabled(true);
        SearchBookContentsActivity.access$400(SearchBookContentsActivity.this).selectAll();
        SearchBookContentsActivity.access$500(SearchBookContentsActivity.this).setEnabled(true);
    }

    private Q()
    {
        this$0 = SearchBookContentsActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
