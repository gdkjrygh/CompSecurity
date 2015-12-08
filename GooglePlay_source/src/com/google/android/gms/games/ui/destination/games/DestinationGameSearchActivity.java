// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.game.GameSearchSuggestion;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.SearchHelper;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameSearchResultsFragment, GamesSuggestionProvider

public final class DestinationGameSearchActivity extends DestinationFragmentActivity
    implements GameSmallCardAdapter.GameSmallCardEventListener
{

    private static final Object FOREGROUND_INSTANCE_LOCK = new Object();
    private static DestinationGameSearchActivity mForegroundInstance;
    private SearchHelper mGameSearchHelper;
    GameSearchResultsFragment mSearchResultsFragment;

    public DestinationGameSearchActivity()
    {
        super(0x7f04005d, 0x7f120018);
    }

    static String[] getSuggestions(String s)
    {
        GameSearchSuggestionBuffer gamesearchsuggestionbuffer;
        Object obj1;
        gamesearchsuggestionbuffer = null;
        synchronized (FOREGROUND_INSTANCE_LOCK)
        {
            obj1 = mForegroundInstance;
        }
        obj = gamesearchsuggestionbuffer;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj = gamesearchsuggestionbuffer;
        if (((DestinationGameSearchActivity) (obj1)).isFinishing()) goto _L2; else goto _L3
_L3:
        if (!((DestinationGameSearchActivity) (obj1)).isDestroyed()) goto _L5; else goto _L4
_L4:
        obj = gamesearchsuggestionbuffer;
_L2:
        return ((String []) (obj));
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
_L5:
        obj1 = ((DestinationGameSearchActivity) (obj1)).mSearchResultsFragment;
        Asserts.checkNotMainThread("getSuggestions must not be called from the main thread!");
        obj = gamesearchsuggestionbuffer;
        if (TextUtils.isEmpty(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((GameSearchResultsFragment) (obj1)).getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(((com.google.android.gms.common.api.GoogleApiClient) (obj)), ((GameSearchResultsFragment) (obj1)).mParent))
        {
            GamesLog.w("GameSearchResFrag", "getSuggestions: not connected; ignoring...");
            return null;
        }
        gamesearchsuggestionbuffer = ((com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult)Games.GamesMetadata.loadGameSearchSuggestionsFirstParty(((com.google.android.gms.common.api.GoogleApiClient) (obj)), s).await()).getSuggestions();
        s = new String[gamesearchsuggestionbuffer.getCount()];
        int i = 0;
        int j = gamesearchsuggestionbuffer.getCount();
        do
        {
            obj = s;
            if (i >= j)
            {
                continue; /* Loop/switch isn't completed */
            }
            s[i] = gamesearchsuggestionbuffer.get(i).getSuggestedTitle();
            i++;
        } while (true);
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void onCreate(Bundle bundle)
    {
        getIntent();
        super.onCreate(bundle);
        mSearchResultsFragment = (GameSearchResultsFragment)super.mFragments.findFragmentById(0x7f0d0169);
        Asserts.checkNotNull(mSearchResultsFragment);
        mGameSearchHelper = new SearchHelper(this, mSearchResultsFragment, 0x7f10025a);
        mGameSearchHelper.onCreate(bundle);
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        mGameSearchHelper.onCreateOptionsMenu$1eec55bd();
        return true;
    }

    public final void onGameClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view)
    {
        mGameSearchHelper.clearFocus();
        logClickEvent(1100, view);
        PowerUpUtils.viewGameDetail(this, gamefirstparty, sharedelementtransition);
    }

    protected final void onNewIntent(Intent intent)
    {
        setIntent(intent);
        if (intent.getAction() != null)
        {
            if ("com.google.android.gms.games.ui.destination.games.SUGGESTION_SELECTED".equals(intent.getAction()))
            {
                intent = GamesSuggestionProvider.getSuggestedQueryText(intent);
                SearchHelper searchhelper = mGameSearchHelper;
                if (searchhelper.mSearchView != null)
                {
                    searchhelper.mSuppressTextChangeProcessing = true;
                    searchhelper.mSearchView.setQuery(intent, false);
                    searchhelper.mSearchView.clearFocus();
                    searchhelper.mSuppressTextChangeProcessing = false;
                    searchhelper.doSearch(intent);
                    return;
                }
            } else
            {
                mGameSearchHelper.onNewIntent(intent);
                return;
            }
        }
    }

    public final void onPause()
    {
        super.onPause();
        synchronized (FOREGROUND_INSTANCE_LOCK)
        {
            mForegroundInstance = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onPlayNowClicked(Game game, View view)
    {
        logClickEvent(1148, view);
        UiUtils.launchGame(this, game, null);
    }

    public final void onResume()
    {
        super.onResume();
        synchronized (FOREGROUND_INSTANCE_LOCK)
        {
            mForegroundInstance = this;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        mGameSearchHelper.onSaveInstanceState(bundle);
    }

    public final boolean onSearchRequested()
    {
        return mGameSearchHelper.onSearchRequested();
    }

    public final void onShareGameClicked(String s, String s1, View view)
    {
        logClickEvent(1141, view);
        shareGame(s, s1);
    }

    public final void onStart()
    {
        super.onStart();
        mGameSearchHelper.mStopped = false;
    }

    public final void onStop()
    {
        super.onStop();
        mGameSearchHelper.onStop();
    }

    public final void onViewInPlayStoreClicked(GameFirstParty gamefirstparty, View view)
    {
        logClickEvent(1155, view);
        UiUtils.viewInPlayStore(this, gamefirstparty.getGame().getInstancePackageName(), "GPG_overflowMenu");
    }

}
