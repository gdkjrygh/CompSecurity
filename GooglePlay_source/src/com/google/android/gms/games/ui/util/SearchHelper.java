// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;

public final class SearchHelper
{
    public static interface SearchProvider
    {

        public abstract void doSearch(String s);
    }


    GamesFragmentActivity mActivity;
    String mCurrentQuery;
    boolean mEnableSuggestions;
    Handler mHandler;
    private String mPreviousQuery;
    private int mSearchHintResId;
    private SearchProvider mSearchProvider;
    protected Runnable mSearchRunnable = new Runnable() {

        final SearchHelper this$0;

        public final void run()
        {
            if (mActivity.isFinishing() || mStopped)
            {
                return;
            } else
            {
                doSearch(mCurrentQuery);
                return;
            }
        }

            
            {
                this$0 = SearchHelper.this;
                super();
            }
    };
    public SearchView mSearchView;
    public boolean mStopped;
    public boolean mSuppressTextChangeProcessing;

    public SearchHelper(GamesFragmentActivity gamesfragmentactivity, SearchProvider searchprovider)
    {
        this(gamesfragmentactivity, searchprovider, 0x7f10025d);
    }

    public SearchHelper(GamesFragmentActivity gamesfragmentactivity, SearchProvider searchprovider, int i)
    {
        mActivity = gamesfragmentactivity;
        mSearchProvider = searchprovider;
        mHandler = new Handler(Looper.getMainLooper());
        mSearchHintResId = i;
        mEnableSuggestions = false;
    }

    public final void clearFocus()
    {
        if (mSearchView != null)
        {
            mSearchView.clearFocus();
        }
    }

    public final void doSearch(String s)
    {
        mPreviousQuery = s;
        mSearchProvider.doSearch(s);
    }

    protected final void hideSoftKeyboard()
    {
        if (mSearchView != null)
        {
            ((InputMethodManager)mActivity.getSystemService("input_method")).hideSoftInputFromWindow(mSearchView.getWindowToken(), 0);
        }
    }

    public final void onCreate(Bundle bundle)
    {
        mActivity.setTitle(null);
        if (bundle != null)
        {
            mPreviousQuery = bundle.getString("savedStatePreviousQuery");
            if (!TextUtils.isEmpty(mPreviousQuery))
            {
                doSearch(mPreviousQuery);
            }
        }
    }

    public final void onCreateOptionsMenu$1eec55bd()
    {
        mSearchView = new SearchView(mActivity);
        mActivity.getDelegate().getSupportActionBar().setDisplayOptions(16, 16);
        mActivity.getDelegate().getSupportActionBar().setCustomView(mSearchView);
        final SearchView searchView = (EditText)mSearchView.findViewById(0x7f0d00d4);
        if (searchView != null)
        {
            searchView.setTextColor(-1);
            searchView.setHintTextColor(mActivity.getResources().getColor(0x7f0b02a0));
        }
        Asserts.checkNotNull(mSearchView);
        searchView = mSearchView;
        if (searchView == null)
        {
            GamesLog.w("SearchHelper", "got passed a null searchView!");
            return;
        }
        searchView.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {

            final SearchHelper this$0;

            public final boolean onQueryTextChange(String s)
            {
                doSearch(null);
                if (mSuppressTextChangeProcessing)
                {
                    return true;
                }
                mHandler.removeCallbacks(mSearchRunnable);
                if (s != null && s.length() >= 3)
                {
                    mCurrentQuery = s;
                    mHandler.postDelayed(mSearchRunnable, 500L);
                }
                return false;
            }

            public final boolean onQueryTextSubmit(String s)
            {
                mHandler.removeCallbacks(mSearchRunnable);
                doSearch(s);
                hideSoftKeyboard();
                return true;
            }

            
            {
                this$0 = SearchHelper.this;
                super();
            }
        });
        searchView.setOnCloseListener(new android.support.v7.widget.SearchView.OnCloseListener() {

            final SearchHelper this$0;
            final SearchView val$searchView;

            public final boolean onClose()
            {
                if (!TextUtils.isEmpty(searchView.getQuery()))
                {
                    searchView.setQuery(null, true);
                }
                return true;
            }

            
            {
                this$0 = SearchHelper.this;
                searchView = searchview;
                super();
            }
        });
        searchView.setIconified(false);
        searchView.setQueryHint(mActivity.getResources().getString(mSearchHintResId));
        if (!TextUtils.isEmpty(mPreviousQuery))
        {
            searchView.setQuery(mPreviousQuery, false);
        }
        searchView.setImeOptions(searchView.getImeOptions() | 0x10000000);
    }

    public final void onNewIntent(Intent intent)
    {
        if ("android.intent.action.SEARCH".equals(intent.getAction()))
        {
            doSearch(intent.getStringExtra("query"));
            return;
        } else
        {
            Asserts.fail((new StringBuilder("onNewIntent: Unexpected intent: ")).append(intent).toString());
            return;
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("savedStatePreviousQuery", mPreviousQuery);
    }

    public final boolean onSearchRequested()
    {
        Asserts.checkNotNull(mSearchView);
        String s = mSearchView.getQuery().toString();
        if (!TextUtils.isEmpty(s))
        {
            doSearch(s);
            hideSoftKeyboard();
        }
        return true;
    }

    public final void onStop()
    {
        mStopped = true;
        mHandler.removeCallbacks(mSearchRunnable);
    }
}
