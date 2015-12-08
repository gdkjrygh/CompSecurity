// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ImageView;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.ScModelManager;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.search.suggestions.ShortcutsStorage;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import java.lang.reflect.Field;
import javax.inject.Provider;
import rx.X;
import rx.b;

public class SearchActionBarController extends DefaultActivityLightCycle
{
    public static interface SearchCallback
    {

        public abstract void exitSearchMode();

        public abstract void performTagSearch(String s);

        public abstract void performTextSearch(String s);
    }


    private static final String STATE_QUERY = "query";
    private final EventBus eventBus;
    private final Provider expandPlayerSubscriberProvider;
    private final PlaybackInitiator playbackInitiator;
    private final PublicApi publicApi;
    private String query;
    private final android.support.v7.widget.SearchView.OnQueryTextListener queryTextListener = new _cls1();
    private SearchCallback searchCallback;
    private SearchView searchView;
    private final ShortcutsStorage shortcutsStorage;
    private SuggestionsAdapter suggestionsAdapter;

    SearchActionBarController(PublicApi publicapi, PlaybackInitiator playbackinitiator, EventBus eventbus, Provider provider, ShortcutsStorage shortcutsstorage)
    {
        publicApi = publicapi;
        playbackInitiator = playbackinitiator;
        eventBus = eventbus;
        expandPlayerSubscriberProvider = provider;
        shortcutsStorage = shortcutsstorage;
    }

    private void cachePlaceholderModel(int i, Uri uri)
    {
        long l = suggestionsAdapter.getModelId(i);
        switch (_cls3..SwitchMap.com.soundcloud.android.storage.provider.Content[Content.match(uri).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            SoundCloudApplication.sModelManager.cache(new PublicApiTrack(l));
            // fall through

        case 2: // '\002'
            SoundCloudApplication.sModelManager.cache(new PublicApiUser(l));
            break;
        }
    }

    private SearchQuerySourceInfo getQuerySourceInfo(int i)
    {
        SearchQuerySourceInfo searchquerysourceinfo = null;
        Urn urn = suggestionsAdapter.getQueryUrn(i);
        if (!urn.equals(Urn.NOT_SET))
        {
            searchquerysourceinfo = new SearchQuerySourceInfo(urn, suggestionsAdapter.getQueryPosition(i), suggestionsAdapter.getUrn(i));
        }
        return searchquerysourceinfo;
    }

    private android.support.v7.widget.SearchView.OnSuggestionListener getSuggestionListener(final AppCompatActivity activity)
    {
        return new _cls2();
    }

    private void initSearchView(AppCompatActivity appcompatactivity, Menu menu)
    {
        android.app.SearchableInfo searchableinfo = ((SearchManager)appcompatactivity.getSystemService("search")).getSearchableInfo(appcompatactivity.getComponentName());
        searchView = (SearchView)MenuItemCompat.getActionView((SupportMenuItem)menu.findItem(0x7f0f02b9));
        searchView.setSearchableInfo(searchableinfo);
        searchView.setIconifiedByDefault(false);
        searchView.setIconified(false);
        searchView.setQueryHint(appcompatactivity.getString(0x7f0701d6));
        searchView.setImeOptions(0x10000003);
        suggestionsAdapter = new SuggestionsAdapter(appcompatactivity, publicApi, shortcutsStorage);
        searchView.setSuggestionsAdapter(suggestionsAdapter);
        searchView.setOnQueryTextListener(queryTextListener);
        searchView.setOnSuggestionListener(getSuggestionListener(appcompatactivity));
        styleSearchView(searchView);
    }

    private boolean isInitialised()
    {
        return searchView != null;
    }

    private boolean isTagSearch(String s)
    {
        return s.startsWith("#");
    }

    private void launchSuggestion(AppCompatActivity appcompatactivity, int i)
    {
        Uri uri = suggestionsAdapter.getItemIntentData(i);
        if (!suggestionsAdapter.isLocalResult(i))
        {
            cachePlaceholderModel(i, uri);
        }
        SearchQuerySourceInfo searchquerysourceinfo = getQuerySourceInfo(i);
        trackSuggestion(i, uri, searchquerysourceinfo);
        Urn urn = suggestionsAdapter.getUrn(i);
        if (urn.isTrack())
        {
            playTrack(urn, searchquerysourceinfo);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (urn.isUser())
        {
            intent.putExtra("searchQuerySourceInfo", searchquerysourceinfo);
        }
        Screen.SEARCH_SUGGESTIONS.addToIntent(intent);
        appcompatactivity.startActivity(intent.setData(uri));
    }

    private void performTagSearch(String s)
    {
        s = s.replaceAll("^#+", "");
        if (!Strings.isNullOrEmpty(s))
        {
            searchCallback.performTagSearch(s);
        }
    }

    private void playTrack(Urn urn, SearchQuerySourceInfo searchquerysourceinfo)
    {
        playbackInitiator.startPlaybackWithRecommendations(urn, Screen.SEARCH_SUGGESTIONS, searchquerysourceinfo).subscribe((X)expandPlayerSubscriberProvider.get());
        clearFocus();
        searchView.setSuggestionsAdapter(null);
    }

    private void styleSearchView(SearchView searchview)
    {
        try
        {
            Field field = android/support/v7/widget/SearchView.getDeclaredField("mSearchButton");
            field.setAccessible(true);
            ((ImageView)field.get(searchview)).setBackgroundResource(0x7f0201c8);
            field = android/support/v7/widget/SearchView.getDeclaredField("mCloseButton");
            field.setAccessible(true);
            ((ImageView)field.get(searchview)).setBackgroundResource(0x7f0201c8);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SearchView searchview)
        {
            getClass().getSimpleName();
            searchview.getMessage();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SearchView searchview)
        {
            getClass().getSimpleName();
        }
        searchview.getMessage();
    }

    private void trackSuggestion(int i, Uri uri, SearchQuerySourceInfo searchquerysourceinfo)
    {
        uri = SearchEvent.searchSuggestion(Content.match(uri), suggestionsAdapter.isLocalResult(i), searchquerysourceinfo);
        eventBus.publish(EventQueue.TRACKING, uri);
    }

    public void clearFocus()
    {
        if (isInitialised())
        {
            searchView.clearFocus();
        }
    }

    public void clearQuery()
    {
        if (isInitialised())
        {
            searchView.setQuery("", false);
        }
    }

    public String getQuery()
    {
        if (isInitialised())
        {
            return searchView.getQuery().toString();
        } else
        {
            return "";
        }
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        appcompatactivity.getSupportActionBar().setDisplayShowTitleEnabled(false);
        if (bundle != null && bundle.containsKey("query"))
        {
            query = bundle.getString("query");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater, AppCompatActivity appcompatactivity)
    {
        menuinflater.inflate(0x7f100007, menu);
        initSearchView(appcompatactivity, menu);
        if (!appcompatactivity.getSupportActionBar().isShowing())
        {
            clearFocus();
        }
        if (Strings.isNotBlank(query))
        {
            setQuery(query);
        }
    }

    public volatile void onDestroy(Activity activity)
    {
        onDestroy((AppCompatActivity)activity);
    }

    public void onDestroy(AppCompatActivity appcompatactivity)
    {
        if (suggestionsAdapter != null)
        {
            suggestionsAdapter.onDestroy();
        }
    }

    void performSearch(String s, boolean flag)
    {
        String s1 = s.trim();
        boolean flag1 = isTagSearch(s1);
        eventBus.publish(EventQueue.TRACKING, SearchEvent.searchField(s, flag, flag1));
        if (flag1)
        {
            performTagSearch(s1);
            return;
        } else
        {
            searchCallback.performTextSearch(s1);
            return;
        }
    }

    public void setFocusable(boolean flag)
    {
        if (isInitialised())
        {
            searchView.setFocusable(flag);
        }
    }

    public void setQuery(String s)
    {
        query = s;
        if (isInitialised())
        {
            searchView.setQuery(s, false);
            searchView.setSuggestionsAdapter(null);
            clearFocus();
        }
    }

    public void setSearchCallback(SearchCallback searchcallback)
    {
        searchCallback = searchcallback;
    }





    private class _cls1
        implements android.support.v7.widget.SearchView.OnQueryTextListener
    {

        final SearchActionBarController this$0;

        public boolean onQueryTextChange(String s)
        {
            if (searchView.getSuggestionsAdapter() == null)
            {
                searchView.setSuggestionsAdapter(suggestionsAdapter);
            }
            if (s.length() <= 0)
            {
                searchCallback.exitSearchMode();
            }
            return false;
        }

        public boolean onQueryTextSubmit(String s)
        {
            performSearch(s, false);
            clearFocus();
            searchView.setSuggestionsAdapter(null);
            return true;
        }

        _cls1()
        {
            this$0 = SearchActionBarController.this;
            super();
        }
    }


    private class _cls3
    {

        static final int $SwitchMap$com$soundcloud$android$storage$provider$Content[];

        static 
        {
            $SwitchMap$com$soundcloud$android$storage$provider$Content = new int[Content.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.TRACK.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$storage$provider$Content[Content.USER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls2
        implements android.support.v7.widget.SearchView.OnSuggestionListener
    {

        final SearchActionBarController this$0;
        final AppCompatActivity val$activity;

        public boolean onSuggestionClick(int i)
        {
            String s = searchView.getQuery().toString();
            searchView.clearFocus();
            if (suggestionsAdapter.isSearchItem(i))
            {
                performSearch(s, true);
                searchView.setSuggestionsAdapter(null);
                return true;
            } else
            {
                launchSuggestion(activity, i);
                return true;
            }
        }

        public boolean onSuggestionSelect(int i)
        {
            return false;
        }

        _cls2()
        {
            this$0 = SearchActionBarController.this;
            activity = appcompatactivity;
            super();
        }
    }

}
