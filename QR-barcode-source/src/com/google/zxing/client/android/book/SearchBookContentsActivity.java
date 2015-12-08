// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.book;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.google.zxing.client.android.HttpHelper;
import com.google.zxing.client.android.LocaleManager;
import com.google.zxing.client.android.common.executor.AsyncTaskExecInterface;
import com.google.zxing.client.android.common.executor.AsyncTaskExecManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.zxing.client.android.book:
//            SearchBookContentsResult, BrowseBookListener, SearchBookContentsAdapter

public final class SearchBookContentsActivity extends Activity
{
    private final class NetworkTask extends AsyncTask
    {

        final SearchBookContentsActivity this$0;

        private void handleSearchResults(JSONObject jsonobject)
        {
            int j;
            j = jsonobject.getInt("number_of_results");
            headerView.setText((new StringBuilder(String.valueOf(getString(com.google.zxing.client.android.R.string.msg_sbc_results)))).append(" : ").append(j).toString());
            if (j <= 0) goto _L2; else goto _L1
_L1:
            ArrayList arraylist;
            jsonobject = jsonobject.getJSONArray("search_results");
            SearchBookContentsResult.setQuery(queryTextView.getText().toString());
            arraylist = new ArrayList(j);
            int i = 0;
_L4:
            if (i >= j)
            {
                try
                {
                    resultListView.setOnItemClickListener(new BrowseBookListener(SearchBookContentsActivity.this, arraylist));
                    resultListView.setAdapter(new SearchBookContentsAdapter(SearchBookContentsActivity.this, arraylist));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    Log.w(SearchBookContentsActivity.TAG, "Bad JSON from book search", jsonobject);
                }
                break; /* Loop/switch isn't completed */
            }
            arraylist.add(parseResult(jsonobject.getJSONObject(i)));
            i++;
            if (true) goto _L4; else goto _L3
_L2:
            if ("false".equals(jsonobject.optString("searchable")))
            {
                headerView.setText(com.google.zxing.client.android.R.string.msg_sbc_book_not_searchable);
            }
            resultListView.setAdapter(null);
            return;
_L3:
            resultListView.setAdapter(null);
            headerView.setText(com.google.zxing.client.android.R.string.msg_sbc_failed);
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
            s = (new StringBuilder(String.valueOf(getString(com.google.zxing.client.android.R.string.msg_sbc_page)))).append(' ').append(s).toString();
_L7:
            jsonobject = jsonobject.optString("snippet_text");
            boolean flag = true;
            if (jsonobject.length() <= 0) goto _L4; else goto _L3
_L3:
            jsonobject = SearchBookContentsActivity.TAG_PATTERN.matcher(jsonobject).replaceAll("");
            jsonobject = SearchBookContentsActivity.LT_ENTITY_PATTERN.matcher(jsonobject).replaceAll("<");
            jsonobject = SearchBookContentsActivity.GT_ENTITY_PATTERN.matcher(jsonobject).replaceAll(">");
            jsonobject = SearchBookContentsActivity.QUOTE_ENTITY_PATTERN.matcher(jsonobject).replaceAll("'");
            jsonobject = SearchBookContentsActivity.QUOT_ENTITY_PATTERN.matcher(jsonobject).replaceAll("\"");
_L5:
            return new SearchBookContentsResult(s1, s, jsonobject, flag);
_L2:
            s = getString(com.google.zxing.client.android.R.string.msg_sbc_unknown_page);
            continue; /* Loop/switch isn't completed */
_L4:
            jsonobject = (new StringBuilder(String.valueOf('('))).append(getString(com.google.zxing.client.android.R.string.msg_sbc_snippet_unavailable)).append(')').toString();
            flag = false;
              goto _L5
            jsonobject;
            return new SearchBookContentsResult(getString(com.google.zxing.client.android.R.string.msg_sbc_no_page_returned), "", "", false);
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
                return new JSONObject(HttpHelper.downloadViaHttp(as, com.google.zxing.client.android.HttpHelper.ContentType.JSON).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Log.w(SearchBookContentsActivity.TAG, "Error accessing book search", as);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Log.w(SearchBookContentsActivity.TAG, "Error accessing book search", as);
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
                headerView.setText(com.google.zxing.client.android.R.string.msg_sbc_failed);
            } else
            {
                handleSearchResults(jsonobject);
            }
            queryTextView.setEnabled(true);
            queryTextView.selectAll();
            queryButton.setEnabled(true);
        }

        private NetworkTask()
        {
            this$0 = SearchBookContentsActivity.this;
            super();
        }

        NetworkTask(NetworkTask networktask)
        {
            this();
        }
    }


    private static final Pattern GT_ENTITY_PATTERN = Pattern.compile("&gt;");
    private static final Pattern LT_ENTITY_PATTERN = Pattern.compile("&lt;");
    private static final Pattern QUOTE_ENTITY_PATTERN = Pattern.compile("&#39;");
    private static final Pattern QUOT_ENTITY_PATTERN = Pattern.compile("&quot;");
    private static final String TAG = com/google/zxing/client/android/book/SearchBookContentsActivity.getSimpleName();
    private static final Pattern TAG_PATTERN = Pattern.compile("\\<.*?\\>");
    private final android.view.View.OnClickListener buttonListener = new android.view.View.OnClickListener() {

        final SearchBookContentsActivity this$0;

        public void onClick(View view)
        {
            launchSearch();
        }

            
            {
                this$0 = SearchBookContentsActivity.this;
                super();
            }
    };
    private TextView headerView;
    private String isbn;
    private final android.view.View.OnKeyListener keyListener = new android.view.View.OnKeyListener() {

        final SearchBookContentsActivity this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (i == 66 && keyevent.getAction() == 0)
            {
                launchSearch();
                return true;
            } else
            {
                return false;
            }
        }

            
            {
                this$0 = SearchBookContentsActivity.this;
                super();
            }
    };
    private NetworkTask networkTask;
    private Button queryButton;
    private EditText queryTextView;
    private ListView resultListView;
    private final AsyncTaskExecInterface taskExec = (AsyncTaskExecInterface)(new AsyncTaskExecManager()).build();

    public SearchBookContentsActivity()
    {
    }

    private void launchSearch()
    {
        String s = queryTextView.getText().toString();
        if (s != null && s.length() > 0)
        {
            NetworkTask networktask = networkTask;
            if (networktask != null)
            {
                networktask.cancel(true);
            }
            networkTask = new NetworkTask(null);
            taskExec.execute(networkTask, new String[] {
                s, isbn
            });
            headerView.setText(com.google.zxing.client.android.R.string.msg_sbc_searching_book);
            resultListView.setAdapter(null);
            queryTextView.setEnabled(false);
            queryButton.setEnabled(false);
        }
    }

    String getISBN()
    {
        return isbn;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        CookieSyncManager.createInstance(this);
        CookieManager.getInstance().removeExpiredCookie();
        bundle = getIntent();
        if (bundle == null || !bundle.getAction().equals("com.google.zxing.client.android.SEARCH_BOOK_CONTENTS"))
        {
            finish();
            return;
        }
        isbn = bundle.getStringExtra("ISBN");
        if (LocaleManager.isBookSearchUrl(isbn))
        {
            setTitle(getString(com.google.zxing.client.android.R.string.sbc_name));
        } else
        {
            setTitle((new StringBuilder(String.valueOf(getString(com.google.zxing.client.android.R.string.sbc_name)))).append(": ISBN ").append(isbn).toString());
        }
        setContentView(com.google.zxing.client.android.R.layout.search_book_contents);
        queryTextView = (EditText)findViewById(com.google.zxing.client.android.R.id.query_text_view);
        bundle = bundle.getStringExtra("QUERY");
        if (bundle != null && bundle.length() > 0)
        {
            queryTextView.setText(bundle);
        }
        queryTextView.setOnKeyListener(keyListener);
        queryButton = (Button)findViewById(com.google.zxing.client.android.R.id.query_button);
        queryButton.setOnClickListener(buttonListener);
        resultListView = (ListView)findViewById(com.google.zxing.client.android.R.id.result_list_view);
        headerView = (TextView)LayoutInflater.from(this).inflate(com.google.zxing.client.android.R.layout.search_book_contents_header, resultListView, false);
        resultListView.addHeaderView(headerView);
    }

    protected void onPause()
    {
        NetworkTask networktask = networkTask;
        if (networktask != null)
        {
            networktask.cancel(true);
            networkTask = null;
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        queryTextView.selectAll();
    }












}
