// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.book;

import android.os.AsyncTask;
import android.text.Editable;
import android.util.Log;
import android.widget.Button;
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
        SearchBookContentsActivity.access$2(SearchBookContentsActivity.this).setText((new StringBuilder(String.valueOf(getString(com.google.zxing.client.android.ng)))).append(" : ").append(j).toString());
        if (j <= 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        jsonobject = jsonobject.getJSONArray("search_results");
        SearchBookContentsResult.setQuery(SearchBookContentsActivity.access$3(SearchBookContentsActivity.this).getText().toString());
        arraylist = new ArrayList(j);
        int i = 0;
_L4:
        if (i >= j)
        {
            try
            {
                SearchBookContentsActivity.access$5(SearchBookContentsActivity.this).setOnItemClickListener(new BrowseBookListener(SearchBookContentsActivity.this, arraylist));
                SearchBookContentsActivity.access$5(SearchBookContentsActivity.this).setAdapter(new SearchBookContentsAdapter(SearchBookContentsActivity.this, arraylist));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.w(SearchBookContentsActivity.access$1(), "Bad JSON from book search", jsonobject);
            }
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(parseResult(jsonobject.getJSONObject(i)));
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        if ("false".equals(jsonobject.optString("searchable")))
        {
            SearchBookContentsActivity.access$2(SearchBookContentsActivity.this).setText(com.google.zxing.client.android.Task.this._fld0);
        }
        SearchBookContentsActivity.access$5(SearchBookContentsActivity.this).setAdapter(null);
        return;
_L3:
        SearchBookContentsActivity.access$5(SearchBookContentsActivity.this).setAdapter(null);
        SearchBookContentsActivity.access$2(SearchBookContentsActivity.this).setText(com.google.zxing.client.android.Task.this._fld0);
        return;
    }

    private SearchBookContentsResult parseResult(JSONObject jsonobject)
    {
        String s;
        String s1;
        s1 = jsonobject.getString("page_id");
        s = jsonobject.getString("page_number");
        if (s.length() <= 0) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder(String.valueOf(getString(com.google.zxing.client.android.ng)))).append(' ').append(s).toString();
_L7:
        jsonobject = jsonobject.optString("snippet_text");
        boolean flag = true;
        if (jsonobject.length() <= 0) goto _L4; else goto _L3
_L3:
        jsonobject = SearchBookContentsActivity.access$6().matcher(jsonobject).replaceAll("");
        jsonobject = SearchBookContentsActivity.access$7().matcher(jsonobject).replaceAll("<");
        jsonobject = SearchBookContentsActivity.access$8().matcher(jsonobject).replaceAll(">");
        jsonobject = SearchBookContentsActivity.access$9().matcher(jsonobject).replaceAll("'");
        jsonobject = SearchBookContentsActivity.access$10().matcher(jsonobject).replaceAll("\"");
_L5:
        return new SearchBookContentsResult(s1, s, jsonobject, flag);
_L2:
        s = getString(com.google.zxing.client.android.ng);
        continue; /* Loop/switch isn't completed */
_L4:
        jsonobject = (new StringBuilder(String.valueOf('('))).append(getString(com.google.zxing.client.android.ng)).append(')').toString();
        flag = false;
          goto _L5
        jsonobject;
        return new SearchBookContentsResult(getString(com.google.zxing.client.android.ng), "", "", false);
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected volatile transient Object doInBackground(Object aobj[])
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
                as = (new StringBuilder("http://www.google.com/books?id=")).append(as).append("&jscmd=SearchWithinVolume2&q=").append(s).toString();
            } else
            {
                as = (new StringBuilder("http://www.google.com/books?vid=isbn")).append(as).append("&jscmd=SearchWithinVolume2&q=").append(s).toString();
            }
            return new JSONObject(HttpHelper.downloadViaHttp(as, com.google.zxing.client.android.Task).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.w(SearchBookContentsActivity.access$1(), "Error accessing book search", as);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            Log.w(SearchBookContentsActivity.access$1(), "Error accessing book search", as);
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
            SearchBookContentsActivity.access$2(SearchBookContentsActivity.this).setText(com.google.zxing.client.android.Task.this._fld0);
        } else
        {
            handleSearchResults(jsonobject);
        }
        SearchBookContentsActivity.access$3(SearchBookContentsActivity.this).setEnabled(true);
        SearchBookContentsActivity.access$3(SearchBookContentsActivity.this).selectAll();
        SearchBookContentsActivity.access$4(SearchBookContentsActivity.this).setEnabled(true);
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
