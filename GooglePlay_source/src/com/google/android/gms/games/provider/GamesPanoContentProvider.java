// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import java.io.FileNotFoundException;

public final class GamesPanoContentProvider extends ContentProvider
{

    public static final Uri AUTHORITY_URI = Uri.parse("content://com.google.android.gms.games.pano");
    public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gms.games.pano/search");
    private static final String SEARCH_SUGGEST_COLUMNS[] = {
        "_id", "suggest_text_1", "suggest_text_2", "suggest_result_card_image", "suggest_intent_extra_data"
    };
    private static final UriMatcher uriMatcher;
    private Context mContext;
    private final Runnable mDisconnectRunnable;
    private boolean mGamesConnectionHealthy;
    private GoogleApiClient mGoogleApiClient;
    private final Object mGoogleApiClientConnectionLock;
    private final Handler mHandler;

    public static String convertInternalToPanoUri(Context context, String s)
    {
        Asserts.checkNotNull(s);
        String s1 = s.replace("content://com.google.android.gms.games.background/", "content://com.google.android.gms.games.pano/");
        if (s1.equals(s))
        {
            GamesLog.wtf(context, "GamesPanoContentProv", (new StringBuilder("convertInternalToPanoUri: not a Games image URI: ")).append(s).toString());
            Asserts.fail((new StringBuilder("convertInternalToPanoUri: not a Games image URI: ")).append(s).toString());
        }
        return s1;
    }

    private MatrixCursor doSearch(String s)
    {
        MatrixCursor matrixcursor;
        Game game = null;
        matrixcursor = new MatrixCursor(SEARCH_SUGGEST_COLUMNS);
        mHandler.removeCallbacks(mDisconnectRunnable);
        mHandler.postDelayed(mDisconnectRunnable, 30000L);
        Asserts.checkNotMainThread("getResultsBuffer must not be called from the main thread!");
        String s1;
        int i;
        int j;
        if (TextUtils.isEmpty(s))
        {
            s = game;
        } else
        if (!ensureConnected())
        {
            GamesLog.w("GamesPanoContentProv", "getResultsBuffer: not connected, ignoring query...");
            s = game;
        } else
        {
            s = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)PlayGames.GamesMetadata.searchForGames$4189436a(mGoogleApiClient, s, 24).await();
            if (s.getGames() == null)
            {
                GamesLog.w("GamesPanoContentProv", "getResultsBuffer: got null result.");
            }
            s = s.getGames();
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        i = 0;
        j = s.getCount();
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        game = ((GameFirstParty)s.get(i)).getGame();
        s1 = convertInternalToPanoUri(getContext(), game.getFeaturedImageUri().toString());
        matrixcursor.addRow(new String[] {
            String.valueOf(i), game.getDisplayName(), game.getDeveloperName(), s1, game.getApplicationId()
        });
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        s.release();
        return matrixcursor;
        Exception exception;
        exception;
        s.release();
        throw exception;
    }

    private boolean ensureConnected()
    {
label0:
        {
            synchronized (mGoogleApiClientConnectionLock)
            {
                Asserts.checkNotNull(mGoogleApiClient);
                if (!mGoogleApiClient.isConnected())
                {
                    break MISSING_BLOCK_LABEL_50;
                }
                if (Games.getCurrentAccountName(mGoogleApiClient) == null)
                {
                    break label0;
                }
                updateGamesConnectionHealth(true);
            }
            return true;
        }
        mGoogleApiClient.disconnect();
        boolean flag;
        GamesLog.i("GamesPanoContentProv", "Connecting GoogleApiClient.");
        flag = mGoogleApiClient.blockingConnect().isSuccess();
        updateGamesConnectionHealth(flag);
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void updateGamesConnectionHealth(boolean flag)
    {
        if (flag != mGamesConnectionHealthy)
        {
            GamesLog.i("GamesPanoContentProv", (new StringBuilder("updateGamesConnectionHealth: health changed FROM ")).append(mGamesConnectionHealthy).append(" TO ").append(flag).toString());
            mGamesConnectionHealthy = flag;
        }
    }

    public final int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri)
    {
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown URI ")).append(uri).toString());

        case 1: // '\001'
            return "vnd.android.cursor.dir/vnd.android.search.suggest";

        case 2: // '\002'
            return "image/png";
        }
    }

    public final Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean onCreate()
    {
        mContext = getContext();
        com.google.android.gms.common.api.GoogleApiClient.Builder builder = new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext);
        Object obj = com.google.android.gms.games.Games.GamesOptions.builder().setShowConnectingPopup$371b5ca1();
        obj.retryingSignIn = false;
        obj = ((com.google.android.gms.games.Games.GamesOptions.Builder) (obj)).build();
        builder.addApi(Games.API_1P, ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) (obj)));
        builder.addApi(PlayGames.API, com.google.android.gms.games.client.PlayGames.PlayGamesOptions.builder(((com.google.android.gms.games.Games.GamesOptions) (obj))).build());
        mGoogleApiClient = builder.build();
        if (mGoogleApiClient == null)
        {
            GamesLog.e("GamesPanoContentProv", "onCreate: unable to instantiate GoogleApiClient.");
            return false;
        } else
        {
            return true;
        }
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String s)
        throws FileNotFoundException
    {
        s = null;
        switch (uriMatcher.match(uri))
        {
        default:
            GamesLog.w("GamesPanoContentProv", "openAssetFile: unknown asset file path");
            return null;

        case 2: // '\002'
        case 3: // '\003'
            Asserts.checkNotMainThread("image requests aren't allowed on the main thread");
            break;
        }
        Asserts.checkNotNull(uri);
        Object obj = getContext();
        Asserts.checkNotNull(uri);
        String s1 = uri.toString();
        String s2 = s1.replace("content://com.google.android.gms.games.pano/", "content://com.google.android.gms.games.background/");
        if (s2.equals(s1))
        {
            GamesLog.wtf(((Context) (obj)), "GamesPanoContentProv", (new StringBuilder("convertPanoToInternalUri: not a Pano image URI: ")).append(uri).toString());
            Asserts.fail((new StringBuilder("convertPanoToInternalUri: not a Pano image URI: ")).append(uri).toString());
        }
        obj = Uri.parse(s2);
        Asserts.checkNotMainThread("image requests aren't allowed on the main thread");
        Asserts.checkNotNull(obj);
        if (!ensureConnected())
        {
            GamesLog.w("GamesPanoContentProv", "openImageFileInternal: couldn't connect; bailing out...");
        } else
        {
            android.os.ParcelFileDescriptor parcelfiledescriptor = Games.getParcelFileDescriptorFirstParty(mGoogleApiClient, ((Uri) (obj)));
            if (parcelfiledescriptor == null)
            {
                GamesLog.w("GamesPanoContentProv", (new StringBuilder("openImageFileInternal: couldn't get pfd for URI: ")).append(obj).toString());
            } else
            {
                s = new AssetFileDescriptor(parcelfiledescriptor, 0L, -1L);
            }
        }
        if (s == null)
        {
            GamesLog.w("GamesPanoContentProv", (new StringBuilder("openGamesImageFile: openImageFileInternal failed for ")).append(uri).append(" (").append(obj).append(")").toString());
        }
        return s;
    }

    public final Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown URI: ")).append(uri).toString());

        case 1: // '\001'
            if (as1 == null || as1.length == 0)
            {
                throw new IllegalArgumentException((new StringBuilder("SelectionArgs must be provided for the URI: ")).append(uri).toString());
            } else
            {
                return doSearch(as1[0].toLowerCase());
            }

        case 2: // '\002'
        case 3: // '\003'
            throw new UnsupportedOperationException();
        }
    }

    public final void shutdown()
    {
        synchronized (mGoogleApiClientConnectionLock)
        {
            Asserts.checkNotNull(mGoogleApiClient);
            if (mGoogleApiClient.isConnected())
            {
                GamesLog.i("GamesPanoContentProv", "Disconnecting GoogleApiClient.");
                mGoogleApiClient.disconnect();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        uriMatcher = urimatcher;
        urimatcher.addURI("com.google.android.gms.games.pano", "search_suggest_query", 1);
        uriMatcher.addURI("com.google.android.gms.games.pano", "search_suggest_query/*", 1);
        uriMatcher.addURI("com.google.android.gms.games.pano", "images/*/#", 2);
        uriMatcher.addURI("com.google.android.gms.games.pano", "games/*/*/#/*", 3);
    }
}
