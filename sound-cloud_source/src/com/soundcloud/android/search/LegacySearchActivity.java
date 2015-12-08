// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import com.soundcloud.android.actionbar.SearchActionBarController;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistTagsFragment, TabbedSearchFragment, PlaylistResultsFragment

public class LegacySearchActivity extends ScActivity
    implements PlaylistTagsFragment.PlaylistTagsFragmentListener
{

    private static final String ACTION_PLAY_FROM_SEARCH = "android.media.action.MEDIA_PLAY_FROM_SEARCH";
    private static final String INTENT_URI_SEARCH_PATH = "/search";
    private static final String INTENT_URL_HOST = "soundcloud.com";
    private static final String INTENT_URL_QUERY_PARAM = "q";
    BaseLayoutHelper baseLayoutHelper;
    PlaybackInitiator playbackInitiator;
    PlayerController playerController;
    SearchActionBarController searchActionBarController;
    private final com.soundcloud.android.actionbar.SearchActionBarController.SearchCallback searchCallback;

    public LegacySearchActivity()
    {
        searchCallback = new _cls1();
        searchActionBarController.setSearchCallback(searchCallback);
    }

    LegacySearchActivity(SearchActionBarController searchactionbarcontroller)
    {
        this();
        searchActionBarController = searchactionbarcontroller;
    }

    private void addContent(Fragment fragment, String s)
    {
        getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, fragment, s).addToBackStack(s).commit();
    }

    private void addContentFragment()
    {
        getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, new PlaylistTagsFragment()).commit();
    }

    private void handleIntent()
    {
        addContentFragment();
        Intent intent = getIntent();
        if ("android.intent.action.SEARCH".equals(intent.getAction()) || "android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(intent.getAction()) || "com.soundcloud.android.action.PERFORM_SEARCH".equals(intent.getAction()))
        {
            showResultsFromIntent(intent.getStringExtra("query"));
            return;
        }
        if (isInterceptedSearchUrl(intent))
        {
            showResultsFromIntent(intent.getData().getQueryParameter("q"));
            return;
        }
        if ("android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null && !intent.getData().getPath().equals("/search"))
        {
            handleUri(intent);
            return;
        } else
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_MAIN));
            return;
        }
    }

    private void handleUri(Intent intent)
    {
        Content content = Content.match(intent.getData());
        if (content == Content.SEARCH_ITEM)
        {
            showResultsFromIntent(Uri.decode(intent.getData().getLastPathSegment()));
        } else
        if (content != Content.UNKNOWN)
        {
            startActivity((new Intent("android.intent.action.VIEW")).setData(intent.getData()));
            finish();
            return;
        }
    }

    private boolean isInterceptedSearchUrl(Intent intent)
    {
        intent = intent.getData();
        return intent != null && (intent.getHost().equals("soundcloud.com") || "soundcloud".equals(intent.getScheme())) && Strings.isNotBlank(intent.getQueryParameter("q"));
    }

    private void showResultsFromIntent(String s)
    {
        searchActionBarController.setQuery(s);
        addContent(TabbedSearchFragment.newInstance(s), "tabbed_search");
    }

    public void onBackPressed()
    {
label0:
        {
            if (!playerController.handleBackPressed())
            {
                boolean flag;
                if (getSupportFragmentManager().getBackStackEntryCount() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                searchActionBarController.clearQuery();
            }
            return;
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            handleIntent();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        searchActionBarController.onCreateOptionsMenu(menu, getMenuInflater(), this);
        return true;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent();
    }

    public void onTagSelected(Context context, String s)
    {
        if (!isFinishing())
        {
            searchActionBarController.setQuery((new StringBuilder("#")).append(s).toString());
            addContent(PlaylistResultsFragment.create(s), "playlist_results");
        }
    }

    public void onTagsScrolled()
    {
        searchActionBarController.clearFocus();
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayoutWithMargins(this);
    }



    private class _cls1
        implements com.soundcloud.android.actionbar.SearchActionBarController.SearchCallback
    {

        final LegacySearchActivity this$0;

        public void exitSearchMode()
        {
            create.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SEARCH_MAIN));
            getSupportFragmentManager().popBackStack(null, 1);
        }

        public void performTagSearch(String s)
        {
            addContent(PlaylistResultsFragment.create(s), "playlist_results");
        }

        public void performTextSearch(String s)
        {
            addContent(TabbedSearchFragment.newInstance(s), "tabbed_search");
        }

        _cls1()
        {
            this$0 = LegacySearchActivity.this;
            super();
        }
    }

}
