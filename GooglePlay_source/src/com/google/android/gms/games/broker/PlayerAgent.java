// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.ImageBroker;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.NonListener;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.cache.ContactSettingsCache;
import com.google.android.gms.games.cache.PlayerCache;
import com.google.android.gms.games.cache.PlayerSearchCache;
import com.google.android.gms.games.cache.ProfileSettingsCache;
import com.google.android.gms.games.cache.XpEventStreamCache;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.NotificationChannel;
import com.google.android.gms.games.internal.data.GamesDataChangeUris;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.server.api.Category;
import com.google.android.gms.games.server.api.CategoryListResponse;
import com.google.android.gms.games.server.api.ContactChannelSetting;
import com.google.android.gms.games.server.api.ContactSettings;
import com.google.android.gms.games.server.api.Experience;
import com.google.android.gms.games.server.api.ExperienceListResponse;
import com.google.android.gms.games.server.api.ExperienceSyncFirstPartyResponse;
import com.google.android.gms.games.server.api.ExperiencesApiInternal;
import com.google.android.gms.games.server.api.FirstPartyPlayer;
import com.google.android.gms.games.server.api.MetagameApiInternal;
import com.google.android.gms.games.server.api.MetagameConfig;
import com.google.android.gms.games.server.api.Played;
import com.google.android.gms.games.server.api.PlayerListFirstPartyResponse;
import com.google.android.gms.games.server.api.PlayerListResponse;
import com.google.android.gms.games.server.api.PlayersApi;
import com.google.android.gms.games.server.api.PlayersApiInternal;
import com.google.android.gms.games.server.api.ProfileSettings;
import com.google.android.gms.games.server.converter.ImageUrlBuilder;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.games.utils.GamesDataUtils;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.People;
import com.google.android.gms.people.internal.PeopleUtils;
import com.google.android.gms.people.model.PersonBuffer;
import com.google.android.gms.plus.service.v1.PeopleApi;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.Person;
import com.google.android.gms.plus.service.v1whitelisted.models.PersonEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, TransientCacheOwner, GamesClientContext, Agents

public final class PlayerAgent extends Lockable
    implements TransientCacheOwner
{
    private static interface CircledStateQuery
    {

        public static final String PROJECTION[] = {
            "external_player_id", "is_in_circles"
        };

    }

    private static interface LevelQuery
    {

        public static final String PROJECTION[] = {
            "level_value", "level_min_xp", "level_max_xp"
        };

    }

    private static final class PeopleNetworkData
    {

        final String nextPageToken;
        final ArrayList playerValues;
        final int totalItems;

        PeopleNetworkData(ContentValues contentvalues)
        {
            playerValues = new ArrayList();
            playerValues.add(contentvalues);
            nextPageToken = null;
            totalItems = 1;
        }

        PeopleNetworkData(ArrayList arraylist, String s, int i)
        {
            playerValues = arraylist;
            nextPageToken = s;
            totalItems = i;
        }
    }

    private static final class SyncNetworkResponse
    {

        public final ArrayList mExperiences;
        public final String mNewSyncToken;
        public final int mStatusCode;

        public SyncNetworkResponse()
        {
            mExperiences = new ArrayList();
            mNewSyncToken = null;
            mStatusCode = 500;
        }

        public SyncNetworkResponse(ArrayList arraylist, String s, int i)
        {
            mExperiences = arraylist;
            mNewSyncToken = s;
            mStatusCode = i;
        }
    }

    private static interface TrimExperiencesQuery
    {

        public static final String PROJECTION[] = {
            "_id", "game_id", "created_timestamp"
        };

    }


    private static final ColumnSpec CONTACT_SETTINGS_SPEC;
    static final Uri LEVEL_UP_ICON_URI = (new android.net.Uri.Builder()).scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").appendPath("games_ic_levelup_shade").build();
    static final ColumnSpec LEVEL_UP_NOTIFICATION_SPEC;
    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_CIRCLED_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_CONNECTED_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_COVER_PHOTO_URIS_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_NEARBY_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_RECENTLY_PLAYED_WITH_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_RECENT_IN_CIRCLES_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_SEARCH_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_SUGGESTED_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_VISIBLE_LOCK = new Lockable.LockableLock();
    private static final Lockable.LockableLock PLAYERS_YOU_MAY_KNOW_LOCK = new Lockable.LockableLock();
    private static final ColumnSpec PLAYER_COMPAT_SPEC;
    private static final ArrayList PLUS_PEOPLE_TYPES;
    private static final ColumnSpec PROFILE_SETTINGS_SPEC;
    private static final ColumnSpec XP_STREAM_DATA_SPEC;
    public static final String XP_SYNC_TOKEN_PROJECTION[] = {
        "xp_sync_token"
    };
    public final PlayerCache mCache;
    public final Lockable mCacheLockables[];
    private final ContactSettingsCache mContactSettingsCache;
    private final ExperiencesApiInternal mExperiencesApiInternal;
    private final MetagameApiInternal mMetagameApiInternal;
    public final PlayerCache mNearbyCache;
    private final NonListener mNonListener = new NonListener();
    private final PeopleApi mPeopleApi;
    private final com.google.android.gms.plus.service.v1whitelisted.PeopleApi mPeopleApiInternal;
    private final Map mPlayerSuggestionIdMap = new ArrayMap();
    private final PlayersApi mPlayersApi;
    private final PlayersApiInternal mPlayersApiInternal;
    final Lockable mPlayersCircledLock;
    final Lockable mPlayersConnectedLock;
    final Lockable mPlayersCoverPhotoUrisLock;
    final Lockable mPlayersNearbyLock;
    final Lockable mPlayersRecentInCirclesLock;
    final Lockable mPlayersRecentlyPlayedWithLock;
    final Lockable mPlayersSearchLock;
    final Lockable mPlayersSuggestedLock;
    final Lockable mPlayersVisibleLock;
    final Lockable mPlayersYouMayKnowLock;
    private final ProfileSettingsCache mProfileSettingsCache;
    final PlayerSearchCache mSearchCache;
    final XpEventStreamCache mXpStreamEventStreamCache;
    long mXpStreamRefreshTimeMillis;

    public PlayerAgent(Lockable lockable, BaseApiaryServer baseapiaryserver, BaseApiaryServer baseapiaryserver1, BaseApiaryServer baseapiaryserver2, BaseApiaryServer baseapiaryserver3)
    {
        super("PlayerAgent", LOCK, lockable);
        mPlayersApi = new PlayersApi(baseapiaryserver);
        mPlayersApiInternal = new PlayersApiInternal(baseapiaryserver1);
        mPeopleApi = new PeopleApi(baseapiaryserver2);
        mPeopleApiInternal = new com.google.android.gms.plus.service.v1whitelisted.PeopleApi(baseapiaryserver3);
        mMetagameApiInternal = new MetagameApiInternal(baseapiaryserver1);
        mExperiencesApiInternal = new ExperiencesApiInternal(baseapiaryserver1);
        mCache = new PlayerCache(PLAYER_COMPAT_SPEC.mColumnNames);
        mNearbyCache = new PlayerCache(PLAYER_COMPAT_SPEC.mColumnNames);
        mSearchCache = new PlayerSearchCache(PLAYER_COMPAT_SPEC.mColumnNames);
        mContactSettingsCache = new ContactSettingsCache(CONTACT_SETTINGS_SPEC.mColumnNames);
        mProfileSettingsCache = new ProfileSettingsCache(PROFILE_SETTINGS_SPEC.mColumnNames);
        mXpStreamEventStreamCache = new XpEventStreamCache(XP_STREAM_DATA_SPEC.mColumnNames);
        mPlayersCoverPhotoUrisLock = new Lockable("PlayerCoverPhotoUris", PLAYERS_COVER_PHOTO_URIS_LOCK, lockable);
        mPlayersRecentInCirclesLock = new Lockable("RecentPlayersInCircles", PLAYERS_RECENT_IN_CIRCLES_LOCK, lockable);
        mPlayersRecentlyPlayedWithLock = new Lockable("RecentlyPlayedWith", PLAYERS_RECENTLY_PLAYED_WITH_LOCK, lockable);
        mPlayersYouMayKnowLock = new Lockable("PlayersYouMayKnow", PLAYERS_YOU_MAY_KNOW_LOCK, lockable);
        mPlayersCircledLock = new Lockable("CircledPlayers", PLAYERS_CIRCLED_LOCK, lockable);
        mPlayersVisibleLock = new Lockable("VisiblePlayers", PLAYERS_VISIBLE_LOCK, lockable);
        mPlayersSuggestedLock = new Lockable("SuggestedPlayers", PLAYERS_SUGGESTED_LOCK, lockable);
        mPlayersConnectedLock = new Lockable("ConnectedPlayers", PLAYERS_CONNECTED_LOCK, lockable);
        mPlayersSearchLock = new Lockable("SearchPlayers", PLAYERS_SEARCH_LOCK, lockable);
        mPlayersNearbyLock = new Lockable("NearbyPlayers", PLAYERS_NEARBY_LOCK, lockable);
        mCacheLockables = (new Lockable[] {
            this, mPlayersRecentInCirclesLock, mPlayersRecentlyPlayedWithLock, mPlayersCircledLock, mPlayersVisibleLock, mPlayersSuggestedLock, mPlayersConnectedLock, mPlayersNearbyLock
        });
    }

    public static int dismissPlayerSuggestion$6321ef0a()
    {
        return 0;
    }

    public static Set getCachedPlayerIds(PlayerCache playercache)
    {
        HashSet hashset;
        Iterator iterator;
        hashset = new HashSet();
        iterator = playercache.getCacheKeys().iterator();
_L2:
        DataHolder dataholder;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        dataholder = playercache.getData((String)iterator.next(), null);
        for (Iterator iterator1 = (new PlayerBuffer(dataholder)).iterator(); iterator1.hasNext(); hashset.add(((Player)iterator1.next()).getPlayerId())) { }
        break MISSING_BLOCK_LABEL_95;
        playercache;
        dataholder.close();
        throw playercache;
        dataholder.close();
        if (true) goto _L2; else goto _L1
_L1:
        return hashset;
    }

    public static Map getCircledState(Context context, ClientContext clientcontext)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        context = (new Agents.QueryBuilder(context)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Players.getContentUri(clientcontext));
        context.mProjection = CircledStateQuery.PROJECTION;
        clientcontext = context.queryCursor();
_L1:
        String s;
        int i;
        if (!clientcontext.moveToNext())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        s = clientcontext.getString(0);
        i = clientcontext.getInt(1);
        context = null;
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        context = Boolean.valueOf(true);
_L2:
        hashmap.put(s, context);
          goto _L1
        context;
        clientcontext.close();
        throw context;
        if (i == 0)
        {
            context = Boolean.valueOf(false);
        }
          goto _L2
        clientcontext.close();
        return hashmap;
    }

    public static GoogleApiClient getConnectedPeopleClient(GamesClientContext gamesclientcontext)
    {
        Object obj = new com.google.android.gms.people.People.PeopleOptions1p.Builder();
        obj.clientApplicationId = 118;
        gamesclientcontext = (new com.google.android.gms.common.api.GoogleApiClient.Builder(gamesclientcontext.mContext)).addApi(People.API_1P, ((com.google.android.gms.people.People.PeopleOptions1p.Builder) (obj)).build()).build();
        obj = gamesclientcontext.blockingConnect();
        if (((ConnectionResult) (obj)).isSuccess())
        {
            return gamesclientcontext;
        } else
        {
            GamesLog.w("PlayerAgent", (new StringBuilder("People client connection failed - status was ")).append(obj).toString());
            return null;
        }
    }

    private static ArrayList getFirstPartyPlayerValues(ArrayList arraylist, long l)
    {
        int j = arraylist.size();
        ArrayList arraylist1 = new ArrayList(j);
        int i = 0;
        while (i < j) 
        {
            Object obj = ((FirstPartyPlayer)arraylist.get(i)).getDisplayPlayer();
            Played played = ((com.google.android.gms.games.server.api.Player) (obj)).getLastPlayedWith();
            obj = ((FastContentValuesJsonResponse) (obj)).mValues;
            long l1;
            if (played == null)
            {
                l1 = -1L;
            } else
            {
                l1 = played.getTimeMillis().longValue();
            }
            populatePlayerFields(l1, l, ((ContentValues) (obj)));
            arraylist1.add(obj);
            i++;
        }
        return arraylist1;
    }

    private PeopleNetworkData getPeopleNetworkDataFromServer1P(GamesClientContext gamesclientcontext, String s, String s1, long l)
        throws VolleyError, GoogleAuthException
    {
        Asserts.checkState(gamesclientcontext.mIsFirstParty);
        PlayersApiInternal playersapiinternal = mPlayersApiInternal;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        String s2 = gamesclientcontext.mExternalTargetGameId;
        gamesclientcontext = Agents.getLocaleString(gamesclientcontext.mContext);
        StringBuilder stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("players/me/players/%1$s", new Object[] {
            PlayersApiInternal.enc(s)
        });
        if (s2 != null)
        {
            PlayersApiInternal.append(stringbuilder, "applicationId", PlayersApiInternal.enc(s2));
        }
        if (gamesclientcontext != null)
        {
            PlayersApiInternal.append(stringbuilder, "language", PlayersApiInternal.enc(gamesclientcontext));
        }
        if (s1 != null)
        {
            PlayersApiInternal.append(stringbuilder, "pageToken", PlayersApiInternal.enc(s1));
        }
        gamesclientcontext = stringbuilder.toString();
        gamesclientcontext = (PlayerListFirstPartyResponse)playersapiinternal.mServer.getResponseBlocking(clientcontext, 0, gamesclientcontext, null, com/google/android/gms/games/server/api/PlayerListFirstPartyResponse);
        s = gamesclientcontext.getItems();
        if (s == null)
        {
            return null;
        } else
        {
            return new PeopleNetworkData(getFirstPartyPlayerValues(s, l), (String)((FastMapJsonResponse) (gamesclientcontext)).mValues.get("nextPageToken"), s.size());
        }
    }

    private PeopleNetworkData getPeopleNetworkDataFromServer3P(GamesClientContext gamesclientcontext, String s, String s1, long l)
        throws VolleyError, GoogleAuthException
    {
        PlayersApi playersapi;
        ClientContext clientcontext;
        StringBuilder stringbuilder;
        boolean flag;
        if (!gamesclientcontext.mIsFirstParty)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        playersapi = mPlayersApi;
        clientcontext = gamesclientcontext.mClientContext;
        gamesclientcontext = Agents.getLocaleString(gamesclientcontext.mContext);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("players/me/players/%1$s", new Object[] {
            PlayersApi.enc(s)
        });
        if (gamesclientcontext != null)
        {
            PlayersApi.append(stringbuilder, "language", PlayersApi.enc(gamesclientcontext));
        }
        if (s1 != null)
        {
            PlayersApi.append(stringbuilder, "pageToken", PlayersApi.enc(s1));
        }
        gamesclientcontext = stringbuilder.toString();
        gamesclientcontext = (PlayerListResponse)playersapi.mServer.getResponseBlocking(clientcontext, 0, gamesclientcontext, null, com/google/android/gms/games/server/api/PlayerListResponse);
        s = gamesclientcontext.getItems();
        if (s == null)
        {
            return null;
        } else
        {
            return new PeopleNetworkData(getPlayerValues(s, l), (String)((FastMapJsonResponse) (gamesclientcontext)).mValues.get("nextPageToken"), s.size());
        }
    }

    private com.google.android.gms.games.server.api.Player getPlayerFromNetwork(GamesClientContext gamesclientcontext, String s)
        throws VolleyError, GoogleAuthException
    {
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        if (gamesclientcontext.mIsFirstParty)
        {
            if ("me".equals(s))
            {
                Agents.isPlusRequired$9c10cfc();
            }
            PlayersApiInternal playersapiinternal = mPlayersApiInternal;
            gamesclientcontext = Agents.getLocaleString(gamesclientcontext.mContext);
            Boolean boolean1 = Boolean.valueOf(true);
            StringBuilder stringbuilder1 = new StringBuilder();
            (new Formatter(stringbuilder1)).format("players/%1$s", new Object[] {
                PlayersApiInternal.enc(s)
            });
            if (gamesclientcontext != null)
            {
                PlayersApiInternal.append(stringbuilder1, "language", PlayersApiInternal.enc(gamesclientcontext));
            }
            if (boolean1 != null)
            {
                PlayersApiInternal.append(stringbuilder1, "plusRequired", String.valueOf(boolean1));
            }
            gamesclientcontext = stringbuilder1.toString();
            return ((FirstPartyPlayer)playersapiinternal.mServer.getResponseBlocking(clientcontext, 0, gamesclientcontext, null, com/google/android/gms/games/server/api/FirstPartyPlayer)).getDisplayPlayer();
        }
        PlayersApi playersapi = mPlayersApi;
        gamesclientcontext = Agents.getLocaleString(gamesclientcontext.mContext);
        StringBuilder stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("players/%1$s", new Object[] {
            PlayersApi.enc(s)
        });
        if (gamesclientcontext != null)
        {
            PlayersApi.append(stringbuilder, "language", PlayersApi.enc(gamesclientcontext));
        }
        gamesclientcontext = stringbuilder.toString();
        return (com.google.android.gms.games.server.api.Player)playersapi.mServer.getResponseBlocking(clientcontext, 0, gamesclientcontext, null, com/google/android/gms/games/server/api/Player);
    }

    private static PlayerLevel getPlayerLevelFromCursor(Cursor cursor)
    {
        return new PlayerLevel(cursor.getInt(0), cursor.getLong(1), cursor.getLong(2));
    }

    private static ArrayList getPlayerValues(ArrayList arraylist, long l)
    {
        int j = arraylist.size();
        ArrayList arraylist1 = new ArrayList(j);
        int i = 0;
        while (i < j) 
        {
            Object obj = (com.google.android.gms.games.server.api.Player)arraylist.get(i);
            ContentValues contentvalues = ((FastContentValuesJsonResponse) (obj)).mValues;
            obj = ((com.google.android.gms.games.server.api.Player) (obj)).getLastPlayedWith();
            long l1;
            if (obj == null)
            {
                l1 = -1L;
            } else
            {
                l1 = ((Played) (obj)).getTimeMillis().longValue();
            }
            populatePlayerFields(l1, l, contentvalues);
            arraylist1.add(contentvalues);
            i++;
        }
        return arraylist1;
    }

    private static ArrayList getXpContentValues(Context context, ClientContext clientcontext, ArrayList arraylist, boolean flag)
    {
        ArrayList arraylist1;
        ArrayList arraylist2;
        ArrayList arraylist3;
        int k;
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(clientcontext);
        k = arraylist.size();
        arraylist1 = new ArrayList(k);
        Map map = resolveExternalGameIds(context, clientcontext, arraylist);
        arraylist3 = new ArrayList(k);
        arraylist2 = new ArrayList(k);
        int i = 0;
        while (i < k) 
        {
            Experience experience = (Experience)arraylist.get(i);
            String s = experience.getApplicationId();
            Long long1 = (Long)map.get(s);
            if (long1 == null)
            {
                GamesLog.e("PlayerAgent", (new StringBuilder("No game found matching external game ID ")).append(s).toString());
            } else
            {
                ContentValues contentvalues1 = new ContentValues(((FastContentValuesJsonResponse) (experience)).mValues);
                contentvalues1.put("game_id", long1);
                arraylist2.add(Agents.addInsertImageOp(uri, (String)((FastContentValuesJsonResponse) (experience)).mValues.get("icon_url"), arraylist3));
                arraylist1.add(contentvalues1);
            }
            i++;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        int j;
        arraylist = Agents.applyContentOperationsWithResult(context.getContentResolver(), arraylist3, "PlayerAgent");
        j = 0;
_L3:
        ContentValues contentvalues;
        Object obj;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        contentvalues = (ContentValues)arraylist1.get(j);
        Agents.addImageUriColumn(contentvalues, "icon_url", "icon_uri", arraylist, (Integer)arraylist2.get(j));
        obj = contentvalues.getAsLong("game_id");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        obj = com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForId(clientcontext, ((Long) (obj)).longValue());
        obj = (new Agents.QueryBuilder(context)).setQuerySpec(((Uri) (obj))).queryCursor();
        if (((Cursor) (obj)).moveToFirst())
        {
            contentvalues.putAll(GamesDataUtils.GAME_SPEC.extractRowValues(((Cursor) (obj))));
        }
        ((Cursor) (obj)).close();
        j++;
        if (true) goto _L3; else goto _L2
        context;
        ((Cursor) (obj)).close();
        throw context;
_L2:
        return arraylist1;
    }

    static DataHolder loadSyncedVisiblePeople$4bafd57d()
    {
        DefaultClock.getInstance().currentTimeMillis();
        return null;
    }

    private static void populatePlayerFields(long l, long l1, ContentValues contentvalues)
    {
        contentvalues.put("played_with_timestamp", Long.valueOf(l));
        contentvalues.put("last_updated", Long.valueOf(l1));
    }

    public static int recordPlayerSuggestionAction$11b7dad()
    {
        return 0;
    }

    private static Map resolveExternalGameIds(Context context, ClientContext clientcontext, ArrayList arraylist)
    {
        int j = arraylist.size();
        ArrayList arraylist1 = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            String s = ((Experience)arraylist.get(i)).getApplicationId();
            if (s != null)
            {
                arraylist1.add(s);
            }
        }

        return Agents.forceResolveExternalGameIds(context, clientcontext, arraylist1);
    }

    private static DataHolder storePeopleDataToCache(Context context, ClientContext clientcontext, PeopleNetworkData peoplenetworkdata, String s, long l, long l1, 
            PlayerCache playercache)
    {
        int k = peoplenetworkdata.playerValues.size();
        ArrayList arraylist = new ArrayList(k);
        Integer ainteger[] = new Integer[k];
        Integer ainteger1[] = new Integer[k];
        Integer ainteger2[] = new Integer[k];
        Integer ainteger3[] = new Integer[k];
        Integer ainteger4[] = new Integer[k];
        Integer ainteger5[] = new Integer[k];
        Integer ainteger6[] = new Integer[k];
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(clientcontext);
        for (int i = 0; i < k; i++)
        {
            Object obj = (ContentValues)peoplenetworkdata.playerValues.get(i);
            String s1 = ((ContentValues) (obj)).getAsString("profile_icon_image_url");
            String s2 = ((ContentValues) (obj)).getAsString("profile_hi_res_image_url");
            String s3 = ((ContentValues) (obj)).getAsString("most_recent_game_icon_url");
            String s4 = ((ContentValues) (obj)).getAsString("most_recent_game_hi_res_url");
            String s5 = ((ContentValues) (obj)).getAsString("most_recent_game_featured_url");
            String s6 = ((ContentValues) (obj)).getAsString("banner_image_landscape_url");
            obj = ((ContentValues) (obj)).getAsString("banner_image_portrait_url");
            ainteger[i] = Agents.addInsertImageOp(clientcontext, s1, arraylist);
            ainteger1[i] = Agents.addInsertImageOp(clientcontext, s2, arraylist);
            ainteger2[i] = Agents.addInsertImageOp(clientcontext, s3, arraylist);
            ainteger3[i] = Agents.addInsertImageOp(clientcontext, s4, arraylist);
            ainteger4[i] = Agents.addInsertImageOp(clientcontext, s5, arraylist);
            ainteger5[i] = Agents.addInsertImageOp(clientcontext, s6, arraylist);
            ainteger6[i] = Agents.addInsertImageOp(clientcontext, ((String) (obj)), arraylist);
        }

        context = Agents.applyContentOperationsWithResult(context.getContentResolver(), arraylist, "PlayerAgent");
        for (int j = 0; j < k; j++)
        {
            clientcontext = (ContentValues)peoplenetworkdata.playerValues.get(j);
            Agents.addImageUriColumn(clientcontext, "profile_icon_image_url", "profile_icon_image_uri", context, ainteger[j]);
            Agents.addImageUriColumn(clientcontext, "profile_hi_res_image_url", "profile_hi_res_image_uri", context, ainteger1[j]);
            Agents.addImageUriColumn(clientcontext, "most_recent_game_icon_url", "most_recent_game_icon_uri", context, ainteger2[j]);
            Agents.addImageUriColumn(clientcontext, "most_recent_game_hi_res_url", "most_recent_game_hi_res_uri", context, ainteger3[j]);
            Agents.addImageUriColumn(clientcontext, "most_recent_game_featured_url", "most_recent_game_featured_uri", context, ainteger4[j]);
            Agents.addImageUriColumn(clientcontext, "banner_image_landscape_url", "banner_image_landscape_uri", context, ainteger5[j]);
            Agents.addImageUriColumn(clientcontext, "banner_image_portrait_url", "banner_image_portrait_uri", context, ainteger6[j]);
            clientcontext.put("game_icon_image_uri", clientcontext.getAsString("most_recent_game_icon_uri"));
        }

        playercache.addCacheData(s, peoplenetworkdata.playerValues, 0, null, peoplenetworkdata.nextPageToken, 0, l, l1);
        playercache.setTotalCount(s, "total_count", peoplenetworkdata.totalItems);
        return playercache.getData(s, null);
    }

    private PeopleNetworkData toPeopleNetworkData1P(Context context, PeopleFeed peoplefeed, long l, int i)
    {
        ArrayList arraylist = new ArrayList();
        if (peoplefeed == null)
        {
            return null;
        }
        Iterator iterator = ((ArrayList)peoplefeed.mItems).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Person person = (Person)iterator.next();
            if ((person.getObjectType() == null || PLUS_PEOPLE_TYPES.contains(person.getObjectType())) && !TextUtils.isEmpty(person.getDisplayName()))
            {
                ContentValues contentvalues = new ContentValues();
                String s = person.getId();
                contentvalues.put("external_player_id", s);
                contentvalues.put("profile_name", person.getDisplayName());
                contentvalues.put("last_updated", Long.valueOf(l));
                contentvalues.put("is_in_circles", Integer.valueOf(i));
                Object obj = new ImageUrlBuilder(person.getImage().getUrl());
                obj.mAllowSilhouette = false;
                String s1 = ((ImageUrlBuilder) (obj)).setSize(context, 0x7f0c00df).build();
                if (s1 == null)
                {
                    obj = null;
                } else
                {
                    obj = new ImageUrlBuilder(s1);
                    obj.mAllowSilhouette = false;
                    obj = ((ImageUrlBuilder) (obj)).setSize(context, 0x7f0c00de).build();
                }
                contentvalues.put("profile_icon_image_url", s1);
                contentvalues.put("profile_hi_res_image_url", ((String) (obj)));
                arraylist.add(contentvalues);
                obj = person.getSuggestionId();
                if (!TextUtils.isEmpty(((CharSequence) (obj))) && !mPlayerSuggestionIdMap.containsKey(s))
                {
                    mPlayerSuggestionIdMap.put(s, obj);
                }
            }
        } while (true);
        return new PeopleNetworkData(arraylist, peoplefeed.mNextPageToken, arraylist.size());
    }

    private static PeopleNetworkData toPeopleNetworkData3P(Context context, com.google.android.gms.plus.service.v1.PeopleFeed peoplefeed, long l, int i)
    {
        ArrayList arraylist = new ArrayList();
        if (peoplefeed == null)
        {
            return null;
        }
        Iterator iterator = ((ArrayList)peoplefeed.mItems).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (com.google.android.gms.plus.model.people.Person)iterator.next();
            if (!TextUtils.isEmpty(((com.google.android.gms.plus.model.people.Person) (obj)).getDisplayName()))
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("external_player_id", ((com.google.android.gms.plus.model.people.Person) (obj)).getId());
                contentvalues.put("profile_name", ((com.google.android.gms.plus.model.people.Person) (obj)).getDisplayName());
                contentvalues.put("last_updated", Long.valueOf(l));
                contentvalues.put("is_in_circles", Integer.valueOf(1));
                obj = new ImageUrlBuilder(((com.google.android.gms.plus.model.people.Person) (obj)).getImage().getUrl());
                obj.mAllowSilhouette = false;
                String s = ((ImageUrlBuilder) (obj)).setSize(context, 0x7f0c00df).build();
                if (s == null)
                {
                    obj = null;
                } else
                {
                    obj = new ImageUrlBuilder(s);
                    obj.mAllowSilhouette = false;
                    obj = ((ImageUrlBuilder) (obj)).setSize(context, 0x7f0c00de).build();
                }
                contentvalues.put("profile_icon_image_url", s);
                contentvalues.put("profile_hi_res_image_url", ((String) (obj)));
                arraylist.add(contentvalues);
            }
        } while (true);
        return new PeopleNetworkData(arraylist, peoplefeed.mNextPageToken, peoplefeed.mTotalItems);
    }

    public static void trimExperienceEvents(Context context, ClientContext clientcontext)
    {
        Object obj;
        int i;
        int j;
        long l;
        j = ((Integer)G.maxExperienceEventsCached.get()).intValue();
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.ExperienceEvents.getContentUri(clientcontext);
        obj = (new Agents.QueryBuilder(context)).setQuerySpec(clientcontext);
        obj.mProjection = TrimExperiencesQuery.PROJECTION;
        obj.mSortOrder = "created_timestamp DESC";
        obj = ((Agents.QueryBuilder) (obj)).queryCursor();
        i = 0;
        l = -1L;
_L2:
        if (!((Cursor) (obj)).moveToNext() || i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        l = ((Cursor) (obj)).getLong(2);
        if (true) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).close();
        if (l == -1L || i < j)
        {
            return;
        } else
        {
            QuerySpec queryspec = new QuerySpec(clientcontext);
            queryspec.addWhere("created_timestamp", String.valueOf(l), "<?");
            context.getContentResolver().delete(clientcontext, queryspec.getSelection(), queryspec.mSelectionArgs);
            return;
        }
        context;
        ((Cursor) (obj)).close();
        throw context;
    }

    private static void updateCache(PlayerCache playercache, String s, boolean flag)
    {
        Iterator iterator = playercache.getCacheKeys().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (playercache.containsEntryWithValue(s1, "external_player_id", s))
            {
                playercache.modifyUniqueRowValue(s1, s, "is_in_circles", Boolean.valueOf(flag));
            }
        } while (true);
    }

    private void updateLocalProfileSettings(GamesClientContext gamesclientcontext, ProfileSettings profilesettings)
    {
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        if (gamesclientcontext.mExternalCurrentPlayerId != null)
        {
            Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(clientcontext, gamesclientcontext.mExternalCurrentPlayerId);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("is_profile_visible", profilesettings.isProfileVisible());
            gamesclientcontext.mContext.getContentResolver().update(uri, contentvalues, null, null);
        }
        mProfileSettingsCache.clear();
        gamesclientcontext = new ArrayList();
        gamesclientcontext.add(((FastContentValuesJsonResponse) (profilesettings)).mValues);
        mProfileSettingsCache.addCacheData(clientcontext, gamesclientcontext, 0, null, null, 0, DefaultClock.getInstance().currentTimeMillis());
    }

    public final void addCircleUpdateOps(GamesClientContext gamesclientcontext, ArrayList arraylist, Map map, ArrayList arraylist1, GoogleApiClient googleapiclient)
    {
        ClientContext clientcontext;
        boolean flag;
        clientcontext = gamesclientcontext.mClientContext;
        gamesclientcontext = gamesclientcontext.mExternalCurrentPlayerId;
        flag = mNearbyCache.hasCacheOwner(gamesclientcontext);
        if (flag)
        {
            mNearbyCache.enableCaching(gamesclientcontext);
        }
        gamesclientcontext = AccountUtils.getResolvedAccountName(clientcontext);
        com.google.android.gms.people.Graph.LoadPeopleOptions loadpeopleoptions = new com.google.android.gms.people.Graph.LoadPeopleOptions();
        ArrayList arraylist2 = new ArrayList(arraylist.size());
        int i = 0;
        for (int k = arraylist.size(); i < k; i++)
        {
            arraylist2.add(PeopleUtils.gaiaIdToPeopleQualifiedId((String)arraylist.get(i)));
        }

        loadpeopleoptions.mQualifiedIds = arraylist2;
        googleapiclient = (com.google.android.gms.people.Graph.LoadPeopleResult)People.GraphApi.loadPeople$7acb640d(googleapiclient, gamesclientcontext, loadpeopleoptions).await();
        if (googleapiclient.getStatus().isSuccess()) goto _L2; else goto _L1
_L1:
        GamesLog.w("PlayerAgent", (new StringBuilder("Failed to load people! Status: ")).append(googleapiclient.getStatus()).toString());
_L4:
        return;
_L2:
        gamesclientcontext = new HashSet();
        Iterator iterator = googleapiclient.getPeople().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.people.model.Person person = (com.google.android.gms.people.model.Person)iterator.next();
            if (!TextUtils.isEmpty(person.getName()))
            {
                gamesclientcontext.add(person.getGaiaId());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_258;
        gamesclientcontext;
        googleapiclient.release();
        throw gamesclientcontext;
        googleapiclient.release();
        int j = 0;
        int l = arraylist.size();
        while (j < l) 
        {
            googleapiclient = (String)arraylist.get(j);
            boolean flag1 = gamesclientcontext.contains(googleapiclient);
            if (flag)
            {
                updateCache(mNearbyCache, googleapiclient, flag1);
            }
            Boolean boolean1 = (Boolean)map.get(googleapiclient);
            if (boolean1 == null || flag1 != boolean1.booleanValue())
            {
                arraylist1.add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(clientcontext, googleapiclient)).withValue("is_in_circles", Boolean.valueOf(flag1)).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist1.size())).build());
            }
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int addNearbyPlayer(GamesClientContext gamesclientcontext, String s)
        throws GoogleAuthException
    {
        Object obj;
        mPlayersNearbyLock.assertLockedByCurrentThread();
        if (gamesclientcontext.isTargetingCurrentPlayer())
        {
            GamesLog.w("PlayerAgent", "Found self nearby - ignoring");
            return 0;
        }
        mNearbyCache.enableCaching(gamesclientcontext.mExternalCurrentPlayerId);
        long l = DefaultClock.getInstance().currentTimeMillis();
        obj = gamesclientcontext.mExternalTargetPlayerId;
        String s1 = PlayerCache.getCacheKeyForFirstPartyCollection(gamesclientcontext.mExternalTargetGameId, "nearby");
        if (mNearbyCache.containsEntryWithValue(s1, "external_player_id", obj) && mNearbyCache.hasData(s1, l))
        {
            return 0;
        }
        DataHolder dataholder;
        Object obj1;
        ClientContext clientcontext;
        int i;
        int j;
        try
        {
            obj1 = getPlayerFromNetwork(gamesclientcontext, ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("PlayerAgent", (new StringBuilder("Unable to load nearby player ")).append(((String) (obj))).toString());
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "PlayerAgent");
            }
            return 6;
        }
        dataholder = null;
        obj = dataholder;
        clientcontext = gamesclientcontext.mClientContext;
        obj = dataholder;
        obj1 = new PeopleNetworkData(((FastContentValuesJsonResponse) (obj1)).mValues);
        obj = dataholder;
        dataholder = storePeopleDataToCache(gamesclientcontext.mContext, clientcontext, ((PeopleNetworkData) (obj1)), s1, l, 0x1b7740L, mNearbyCache);
        obj = dataholder;
        i = dataholder.mStatusCode;
        obj = dataholder;
        j = dataholder.mRowCount;
        obj = dataholder;
        s1 = AccountUtils.getResolvedAccountName(gamesclientcontext.mClientContext);
        obj = dataholder;
        GamesPlayLogger.logNearbyPlayer(gamesclientcontext.mContext, s, gamesclientcontext.mExternalTargetGameId, s1, j);
        if (dataholder != null)
        {
            dataholder.close();
        }
        Agents.notifyDataChangeUri(gamesclientcontext.mContext, GamesDataChangeUris.URI_PLAYERS);
        return i;
        gamesclientcontext;
        if (obj != null)
        {
            ((DataHolder) (obj)).close();
        }
        throw gamesclientcontext;
    }

    public final void addXpEventOps(Context context, ClientContext clientcontext, ArrayList arraylist, ArrayList arraylist1)
    {
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.ExperienceEvents.getContentUri(clientcontext);
        context = getXpContentValues(context, clientcontext, arraylist, false);
        int i = 0;
        for (int j = context.size(); i < j; i++)
        {
            arraylist1.add(ContentProviderOperation.newInsert(uri).withValues((ContentValues)context.get(i)).build());
        }

    }

    public final void clearTransientCaches()
    {
        mCache.clear();
        mNearbyCache.clear();
        mSearchCache.clear();
    }

    PeopleNetworkData fetchPeopleForSearch1P(Context context, ClientContext clientcontext, String s, int i, long l, String s1)
        throws GoogleAuthException
    {
        int j = 0;
_L2:
        com.google.android.gms.plus.service.v1whitelisted.PeopleApi peopleapi;
        String s2;
        Integer integer;
        StringBuilder stringbuilder;
        try
        {
            peopleapi = mPeopleApiInternal;
            s2 = Agents.getLocaleString(context);
            integer = Integer.valueOf(i);
            stringbuilder = new StringBuilder("people");
            com.google.android.gms.plus.service.v1whitelisted.PeopleApi.append(stringbuilder, "query", com.google.android.gms.plus.service.v1whitelisted.PeopleApi.enc(s));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(context, "PlayerAgent");
            }
            return null;
        }
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        com.google.android.gms.plus.service.v1whitelisted.PeopleApi.append(stringbuilder, "language", com.google.android.gms.plus.service.v1whitelisted.PeopleApi.enc(s2));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        com.google.android.gms.plus.service.v1whitelisted.PeopleApi.append(stringbuilder, "maxResults", String.valueOf(integer));
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        com.google.android.gms.plus.service.v1whitelisted.PeopleApi.append(stringbuilder, "pageToken", com.google.android.gms.plus.service.v1whitelisted.PeopleApi.enc(s1));
        s1 = stringbuilder.toString();
        s1 = toPeopleNetworkData1P(context, (PeopleFeed)peopleapi.mServer.getResponseBlocking(clientcontext, 0, s1, null, com/google/android/gms/plus/service/v1whitelisted/models/PeopleFeed), l, -1);
        if (!((PeopleNetworkData) (s1)).playerValues.isEmpty() || ((PeopleNetworkData) (s1)).nextPageToken == null || j >= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = ((PeopleNetworkData) (s1)).nextPageToken;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        return s1;
    }

    PeopleNetworkData fetchPersonByEmail(Context context, ClientContext clientcontext, String s, long l)
        throws GoogleAuthException
    {
        try
        {
            com.google.android.gms.plus.service.v1whitelisted.PeopleApi peopleapi = mPeopleApiInternal;
            StringBuilder stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("people/%1$s", new Object[] {
                com.google.android.gms.plus.service.v1whitelisted.PeopleApi.enc(s)
            });
            s = stringbuilder.toString();
            s = (PersonEntity)peopleapi.mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/plus/service/v1whitelisted/models/PersonEntity);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (!ErrorUtils.hasStatusCode(context, 404) && GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(context, "PlayerAgent");
            }
            return null;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(((PersonEntity) (s)).mDisplayName)) goto _L3; else goto _L2
_L3:
        clientcontext = new ContentValues();
        clientcontext.put("external_player_id", ((PersonEntity) (s)).mId);
        clientcontext.put("profile_name", ((PersonEntity) (s)).mDisplayName);
        clientcontext.put("last_updated", Long.valueOf(l));
        clientcontext.put("is_in_circles", Integer.valueOf(-1));
        s = new ImageUrlBuilder(((PersonEntity) (s)).mImage.getUrl());
        s.mAllowSilhouette = false;
        s = s.setSize(context, 0x7f0c00df).build();
        if (s != null) goto _L5; else goto _L4
_L4:
        context = null;
_L6:
        clientcontext.put("profile_icon_image_url", s);
        clientcontext.put("profile_hi_res_image_url", context);
        context = new PeopleNetworkData(clientcontext);
        return context;
_L5:
        ImageUrlBuilder imageurlbuilder = new ImageUrlBuilder(s);
        imageurlbuilder.mAllowSilhouette = false;
        context = imageurlbuilder.setSize(context, 0x7f0c00de).build();
        if (true) goto _L6; else goto _L2
_L2:
        return null;
    }

    final DataHolder fetchPlayer(GamesClientContext gamesclientcontext, boolean flag)
        throws GoogleAuthException
    {
        Object obj;
        Object obj1;
        if (flag)
        {
            obj = gamesclientcontext.mExternalCurrentPlayerId;
        } else
        {
            obj = gamesclientcontext.mExternalTargetPlayerId;
        }
        if (flag || obj == null || GamesClientContext.isPlayerIdGPlusEnabled(((String) (obj)))) goto _L2; else goto _L1
_L1:
        obj1 = DataHolder.empty(1);
_L4:
        return ((DataHolder) (obj1));
_L2:
        if (gamesclientcontext.mForceReload || obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(gamesclientcontext.mClientContext, ((String) (obj)));
        DataHolder dataholder = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj1))).query();
        obj1 = dataholder;
        if (dataholder.mRowCount > 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        dataholder.close();
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        Object obj2;
        Object obj3;
        Uri uri;
        if (flag || obj == null)
        {
            obj2 = "me";
        } else
        {
            obj2 = obj;
        }
        try
        {
            obj2 = getPlayerFromNetwork(gamesclientcontext, ((String) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            GamesLog.e("PlayerAgent", (new StringBuilder("Unable to load player ")).append(((String) (obj))).toString());
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "PlayerAgent");
            }
            return DataHolder.empty(4);
        }
        obj3 = ((FastContentValuesJsonResponse) (obj2)).mValues;
        if ((String)((FastContentValuesJsonResponse) (obj2)).mValues.get("external_player_id") == null)
        {
            ((ContentValues) (obj3)).put("external_player_id", gamesclientcontext.getNoGPlusPlayerId());
        }
        obj = new ArrayList(4);
        ((ArrayList) (obj)).add(((ContentValues) (obj3)).getAsString("profile_icon_image_url"));
        ((ArrayList) (obj)).add(((ContentValues) (obj3)).getAsString("profile_hi_res_image_url"));
        ((ArrayList) (obj)).add(((ContentValues) (obj3)).getAsString("banner_image_landscape_url"));
        ((ArrayList) (obj)).add(((ContentValues) (obj3)).getAsString("banner_image_portrait_url"));
        obj2 = gamesclientcontext.mContext;
        ((ContentValues) (obj3)).put("last_updated", Long.valueOf(System.currentTimeMillis()));
        uri = com.google.android.gms.games.provider.GamesContractInternal.Players.getContentUri(gamesclientcontext.mClientContext);
        obj3 = ((Context) (obj2)).getContentResolver().insert(uri, ((ContentValues) (obj3)));
        obj3 = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj3))).query();
        ImageBroker.acquireBroker$3d64b9a2(((Context) (obj2))).fetchImageData(((Context) (obj2)), com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(gamesclientcontext.mClientContext), ((ArrayList) (obj)));
        return ((DataHolder) (obj3));
    }

    public final DataHolder getCircledPlayers(GamesClientContext gamesclientcontext, int i, boolean flag)
        throws GoogleAuthException
    {
        Asserts.checkState(gamesclientcontext.mIsFirstParty, "Calling circled from 3P context!");
        mPlayersCircledLock.assertLockedByCurrentThread();
        loadSyncedVisiblePeople$4bafd57d();
        return loadPlayerData$2fcfbbfc(gamesclientcontext, "circled", "circled", i, flag);
    }

    public final DataHolder getConnectedPlayers$10cce170(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        String s;
        long l;
        mPlayersConnectedLock.assertLockedByCurrentThread();
        l = DefaultClock.getInstance().currentTimeMillis();
        s = (new StringBuilder("connected")).append(gamesclientcontext.mExternalTargetGameId).toString();
        mCache.enableCaching(gamesclientcontext.mExternalCurrentPlayerId);
        if (gamesclientcontext.mForceReload)
        {
            mCache.clearData(s);
        }
        if (mCache.hasEnoughData(s, l, 50, false))
        {
            return mCache.getData(s, null);
        }
        Object obj;
        if (!gamesclientcontext.mIsFirstParty)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        obj = getPeopleNetworkDataFromServer1P(gamesclientcontext, "connected", null, l);
_L1:
        if (obj == null)
        {
            if (mCache.hasData(s, l))
            {
                mCache.setStatusCode(s, 3);
            }
            return mCache.getData(s, null);
        } else
        {
            return storePeopleDataToCache(gamesclientcontext.mContext, gamesclientcontext.mClientContext, ((PeopleNetworkData) (obj)), s, l, 0x1b7740L, mCache);
        }
        try
        {
            obj = getPeopleNetworkDataFromServer3P(gamesclientcontext, "connected", null, l);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj)), "PlayerAgent");
            }
            obj = null;
        }
          goto _L1
    }

    Pair getCurrentAndNextLevels(GamesClientContext gamesclientcontext, long l)
        throws GoogleAuthException
    {
        Object obj;
        Object obj1;
        QuerySpec queryspec;
        ClientContext clientcontext;
        clientcontext = gamesclientcontext.mClientContext;
        queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.PlayerLevels.getContentUri(clientcontext));
        queryspec.addWhere("level_max_xp", String.valueOf(l), ">?");
        obj = new Agents.QueryBuilder(gamesclientcontext);
        obj.mQuery = queryspec;
        obj.mProjection = LevelQuery.PROJECTION;
        obj.mSortOrder = "level_value ASC LIMIT 2";
        obj1 = ((Agents.QueryBuilder) (obj)).queryCursor();
        obj = obj1;
        if (((Cursor) (obj1)).getCount() != 0) goto _L2; else goto _L1
_L1:
        int i;
        GamesLog.d("PlayerAgent", "Refreshing level table, new current level missing.");
        ((Cursor) (obj1)).close();
        i = syncPlayerLevelTable(gamesclientcontext.mContext, Agents.buildFirstPartyClientContext(clientcontext));
        if (i == 0) goto _L4; else goto _L3
_L3:
        GamesLog.w("PlayerAgent", (new StringBuilder("Failed to refresh level table: ")).append(GamesStatusCodes.getStatusString(i)).toString());
_L6:
        return null;
_L4:
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = queryspec;
        gamesclientcontext.mProjection = LevelQuery.PROJECTION;
        gamesclientcontext.mSortOrder = "level_value ASC LIMIT 2";
        obj = gamesclientcontext.queryCursor();
_L2:
        obj1 = null;
        gamesclientcontext = null;
        if (((Cursor) (obj)).moveToNext())
        {
            obj1 = getPlayerLevelFromCursor(((Cursor) (obj)));
            if (!((Cursor) (obj)).moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            gamesclientcontext = getPlayerLevelFromCursor(((Cursor) (obj)));
        }
_L7:
        ((Cursor) (obj)).close();
        if (obj1 != null)
        {
            return new Pair(obj1, gamesclientcontext);
        }
        if (true) goto _L6; else goto _L5
_L5:
        gamesclientcontext = ((GamesClientContext) (obj1));
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
        gamesclientcontext;
        ((Cursor) (obj)).close();
        throw gamesclientcontext;
    }

    Player getLocalPlayer(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Object obj;
        PlayerBuffer playerbuffer;
        Object obj1 = null;
        obj = gamesclientcontext;
        if (gamesclientcontext.mForceReload)
        {
            gamesclientcontext = gamesclientcontext.getBuilder();
            gamesclientcontext.mForceReload = false;
            obj = gamesclientcontext.build();
        }
        obj = fetchPlayer(((GamesClientContext) (obj)), true);
        playerbuffer = new PlayerBuffer(((DataHolder) (obj)));
        gamesclientcontext = obj1;
        if (playerbuffer.getCount() > 0)
        {
            gamesclientcontext = (Player)playerbuffer.get(0).freeze();
        }
        ((DataHolder) (obj)).close();
        return gamesclientcontext;
        gamesclientcontext;
        ((DataHolder) (obj)).close();
        throw gamesclientcontext;
    }

    final Lockable getLockableForPlayersCollection(GamesClientContext gamesclientcontext, String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 48
    //                   -1049482625: 150
    //                   -149255867: 135
    //                   156408498: 120
    //                   782949780: 105;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_150;
_L6:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown player collection type ")).append(s).toString());

        case 0: // '\0'
            if (!gamesclientcontext.mIsFirstParty)
            {
                throw new IllegalArgumentException("Fetching recent players from circles is only valid in a 1P context");
            } else
            {
                return mPlayersRecentInCirclesLock;
            }

        case 1: // '\001'
            return mPlayersRecentlyPlayedWithLock;

        case 2: // '\002'
            if (!gamesclientcontext.mIsFirstParty)
            {
                throw new IllegalArgumentException("Fetching gamers-you-may-know is only valid in a 1P context");
            } else
            {
                return mPlayersYouMayKnowLock;
            }

        case 3: // '\003'
            return mPlayersNearbyLock;
        }
_L5:
        if (s.equals("circled"))
        {
            byte0 = 0;
        }
          goto _L6
_L4:
        if (s.equals("played_with"))
        {
            byte0 = 1;
        }
          goto _L6
_L3:
        if (s.equals("you_may_know"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("nearby"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    public final DataHolder getPlayersArray(GamesClientContext gamesclientcontext, String as[])
        throws GoogleAuthException
    {
        Object obj;
        Map map;
        int i;
        obj = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Players.getContentUri(gamesclientcontext.mClientContext));
        i = 0;
        while (i < as.length) 
        {
            String s = as[i];
            if (((QuerySpec) (obj)).mExtraWhere == null)
            {
                obj.mExtraWhere = new StringBuilder("(");
            } else
            {
                ((QuerySpec) (obj)).mExtraWhere.append(" OR (");
            }
            ((QuerySpec) (obj)).mExtraWhere.append("external_player_id").append("=?").append(")");
            obj.mSelectionArgs = QuerySpec.insertSelectionArg(((QuerySpec) (obj)).mSelectionArgs, s);
            i++;
        }
        map = Agents.getExternalIdToInternalIdMap(gamesclientcontext.mContext, ((QuerySpec) (obj)).mUri, "external_player_id", Arrays.asList(as));
        i = 0;
_L10:
        if (i >= as.length) goto _L2; else goto _L1
_L1:
        Object obj1 = as[i];
        if (map.containsKey(obj1) && ((Long)map.get(obj1)).longValue() > 0L) goto _L4; else goto _L3
_L3:
        GamesClientContext.Builder builder = gamesclientcontext.getBuilder();
        builder.mForceReload = true;
        builder.mExternalTargetPlayerId = ((String) (obj1));
        obj1 = fetchPlayer(builder.build(), false);
        if (((DataHolder) (obj1)).mStatusCode == 0) goto _L6; else goto _L5
_L5:
        gamesclientcontext = DataHolder.empty(4);
        ((DataHolder) (obj1)).close();
_L8:
        return gamesclientcontext;
_L6:
        ((DataHolder) (obj1)).close();
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
        gamesclientcontext;
        ((DataHolder) (obj1)).close();
        throw gamesclientcontext;
_L2:
        gamesclientcontext = new Agents.QueryBuilder(gamesclientcontext);
        gamesclientcontext.mQuery = ((QuerySpec) (obj));
        obj = gamesclientcontext.query();
        gamesclientcontext = ((GamesClientContext) (obj));
        if (((DataHolder) (obj)).mRowCount == as.length) goto _L8; else goto _L7
_L7:
        return DataHolder.empty(1);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final DataHolder loadContactSettings(ClientContext clientcontext, boolean flag)
        throws GoogleAuthException
    {
        ContentValues contentvalues;
        long l;
        l = DefaultClock.getInstance().currentTimeMillis();
        mContactSettingsCache.enableCaching(clientcontext);
        if (!flag && mContactSettingsCache.hasData(clientcontext, l))
        {
            return mContactSettingsCache.getData(clientcontext, null);
        }
        contentvalues = null;
        Object obj = (ContactSettings)mPlayersApiInternal.mServer.getResponseBlocking(clientcontext, 0, "players/me/contactsettings", null, com/google/android/gms/games/server/api/ContactSettings);
_L2:
        if (obj == null)
        {
            return DataHolder.empty(4);
        }
        break; /* Loop/switch isn't completed */
        VolleyError volleyerror;
        volleyerror;
        obj = contentvalues;
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(volleyerror, "PlayerAgent");
            obj = contentvalues;
        }
        if (true) goto _L2; else goto _L1
_L1:
        contentvalues = new ContentValues();
        contentvalues.put("mobile_notifications_enabled", (Boolean)((FastMapJsonResponse) (obj)).mValues.get("enableMobileNotifications"));
        obj = ((ContactSettings) (obj)).getPerChannelSettings();
        ContactChannelSetting contactchannelsetting;
        int i;
        int j;
        int k;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = ((ArrayList) (obj)).size();
        }
        j = 0;
        if (j >= i)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        contactchannelsetting = (ContactChannelSetting)((ArrayList) (obj)).get(j);
        k = NotificationChannel.fromString(contactchannelsetting.getChannelType());
        flag = ((Boolean)((FastMapJsonResponse) (contactchannelsetting)).mValues.get("isEnabled")).booleanValue();
        k;
        JVM INSTR tableswitch 0 2: default 224
    //                   0 269
    //                   1 297
    //                   2 283;
           goto _L3 _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_297;
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        GamesLog.w("PlayerAgent", (new StringBuilder("Ignoring unknown channel ")).append(contactchannelsetting.getChannelType()).toString());
_L10:
        j++;
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_150;
_L7:
        contentvalues.put("match_notifications_enabled", Boolean.valueOf(flag));
        continue; /* Loop/switch isn't completed */
_L6:
        contentvalues.put("quest_notifications_enabled", Boolean.valueOf(flag));
        continue; /* Loop/switch isn't completed */
        contentvalues.put("request_notifications_enabled", Boolean.valueOf(flag));
        if (true) goto _L10; else goto _L9
_L9:
        ArrayList arraylist = new ArrayList();
        arraylist.add(contentvalues);
        mContactSettingsCache.addCacheData(clientcontext, arraylist, 0, null, null, 0, l);
        return mContactSettingsCache.getData(clientcontext, null);
    }

    public final DataHolder loadMoreXpStream(GamesClientContext gamesclientcontext, int i)
        throws GoogleAuthException
    {
        long l = DefaultClock.getInstance().currentTimeMillis();
        String s1 = gamesclientcontext.mExternalTargetPlayerId;
        mXpStreamEventStreamCache.enableCaching(gamesclientcontext.mClientContext);
        if (!mXpStreamEventStreamCache.hasData(s1, l))
        {
            return loadXpStream(gamesclientcontext, i);
        }
        String s = mXpStreamEventStreamCache.getNextPageToken(s1, l);
        if (s == null)
        {
            return mXpStreamEventStreamCache.getData(s1, null);
        }
        ArrayList arraylist = new ArrayList();
        try
        {
            Object obj = Agents.getLocaleString(gamesclientcontext.mContext);
            obj = mMetagameApiInternal.listExperiencesByPlayerBlocking(gamesclientcontext.mClientContext, s1, "experience_points", ((String) (obj)), Integer.valueOf(i), s);
            if (((ExperienceListResponse) (obj)).getItems() != null)
            {
                s = ((ExperienceListResponse) (obj)).getNextPageToken();
                arraylist.addAll(getXpContentValues(gamesclientcontext.mContext, gamesclientcontext.mClientContext, ((ExperienceListResponse) (obj)).getItems(), true));
            }
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "PlayerAgent");
            return DataHolder.empty(6);
        }
        if (!arraylist.isEmpty())
        {
            gamesclientcontext = gamesclientcontext.mClientContext;
            long l1 = DefaultClock.getInstance().currentTimeMillis();
            mXpStreamEventStreamCache.enableCaching(gamesclientcontext);
            mXpStreamEventStreamCache.addCacheData(s1, arraylist, 0, null, s, 0, l1);
            mXpStreamRefreshTimeMillis = l1;
        }
        return mXpStreamEventStreamCache.getData(s1, null);
    }

    DataHolder loadPlayerData$2fcfbbfc(GamesClientContext gamesclientcontext, String s, String s1, int i, boolean flag)
        throws GoogleAuthException
    {
        String s2;
        long l2;
        mCache.enableCaching(gamesclientcontext.mExternalCurrentPlayerId);
        l2 = DefaultClock.getInstance().currentTimeMillis();
        if (gamesclientcontext.mForceReload)
        {
            mCache.clearData(s);
        }
        if (mCache.hasEnoughData(s, l2, i, flag))
        {
            return mCache.getData(s, null);
        }
        s2 = null;
        if (flag || mCache.hasData(s, l2))
        {
            s2 = mCache.getNextPageToken(s, l2);
        }
        long l = DefaultClock.getInstance().currentTimeMillis();
        if (!s.equals("circled")) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Integer integer;
        StringBuilder stringbuilder;
        Asserts.checkState(gamesclientcontext.mIsFirstParty);
        obj = mPeopleApiInternal;
        obj1 = gamesclientcontext.mClientContext;
        String s3 = gamesclientcontext.mExternalCurrentPlayerId;
        ArrayList arraylist = PLUS_PEOPLE_TYPES;
        integer = Integer.valueOf(i);
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("people/%1$s/people/%2$s", new Object[] {
            com.google.android.gms.plus.service.v1whitelisted.PeopleApi.enc(s3), com.google.android.gms.plus.service.v1whitelisted.PeopleApi.enc(s1)
        });
        com.google.android.gms.plus.service.v1whitelisted.PeopleApi.append(stringbuilder, "includeObjectType", TextUtils.join("&includeObjectType=", arraylist));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        com.google.android.gms.plus.service.v1whitelisted.PeopleApi.append(stringbuilder, "maxResults", String.valueOf(integer));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        com.google.android.gms.plus.service.v1whitelisted.PeopleApi.append(stringbuilder, "pageToken", com.google.android.gms.plus.service.v1whitelisted.PeopleApi.enc(s2));
        s2 = stringbuilder.toString();
        obj = (PeopleFeed)((com.google.android.gms.plus.service.v1whitelisted.PeopleApi) (obj)).mServer.getResponseBlocking(((ClientContext) (obj1)), 0, s2, null, com/google/android/gms/plus/service/v1whitelisted/models/PeopleFeed);
        obj = toPeopleNetworkData1P(gamesclientcontext.mContext, ((PeopleFeed) (obj)), l, 1);
_L4:
        if (obj == null)
        {
            if (mCache.hasData(s, l2))
            {
                mCache.setStatusCode(s, 3);
            }
            return mCache.getData(s, null);
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!s.startsWith("visible:"))
        {
            break MISSING_BLOCK_LABEL_509;
        }
        PeopleApi peopleapi;
        ClientContext clientcontext;
        if (!gamesclientcontext.mIsFirstParty)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        peopleapi = mPeopleApi;
        clientcontext = gamesclientcontext.mClientContext;
        obj = gamesclientcontext.mExternalCurrentPlayerId;
        obj1 = PLUS_PEOPLE_TYPES;
        integer = Integer.valueOf(i);
        obj1 = PeopleApi.append(String.format("people/%1$s/people/%2$s", new Object[] {
            PeopleApi.enc(((String) (obj))), PeopleApi.enc(s1)
        }), "includeObjectType", TextUtils.join("&includeObjectType=", ((Iterable) (obj1))));
        obj = obj1;
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        obj = PeopleApi.append(((String) (obj1)), "maxResults", String.valueOf(integer));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_470;
        }
        obj = PeopleApi.append(((String) (obj)), "pageToken", PeopleApi.enc(s2));
        obj = (com.google.android.gms.plus.service.v1.PeopleFeed)peopleapi.mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/plus/service/v1/PeopleFeed);
        obj = toPeopleNetworkData3P(gamesclientcontext.mContext, ((com.google.android.gms.plus.service.v1.PeopleFeed) (obj)), l, 1);
        continue; /* Loop/switch isn't completed */
        if (s.startsWith("players1p:"))
        {
            obj = getPeopleNetworkDataFromServer1P(gamesclientcontext, s1, s2, l);
            continue; /* Loop/switch isn't completed */
        }
        if (s.startsWith("players:"))
        {
            obj = getPeopleNetworkDataFromServer3P(gamesclientcontext, s1, s2, l);
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder("Unrecognized cache key ")).append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj)), "PlayerAgent");
        }
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        long l1;
        if ("played_with".equals(s1))
        {
            l1 = 0x1d4c0L;
        } else
        {
            l1 = 0x1b7740L;
        }
        return storePeopleDataToCache(gamesclientcontext.mContext, gamesclientcontext.mClientContext, ((PeopleNetworkData) (obj)), s, l2, l1, mCache);
    }

    public final DataHolder loadPlayerXpForGameCategories(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        Object obj;
        ArrayList arraylist;
        ClientContext clientcontext;
        arraylist = new ArrayList();
        obj = null;
        clientcontext = gamesclientcontext.mClientContext;
_L2:
        Object obj1;
        String s1;
        Boolean boolean1;
        StringBuilder stringbuilder;
        int i;
        int j;
        try
        {
            obj1 = mMetagameApiInternal;
            String s = gamesclientcontext.mExternalTargetPlayerId;
            s1 = Agents.getLocaleString(gamesclientcontext.mContext);
            boolean1 = Boolean.valueOf(Agents.isPlusRequired$9c10cfc());
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("players/%1$s/categories/%2$s", new Object[] {
                MetagameApiInternal.enc(s), MetagameApiInternal.enc("all")
            });
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            gamesclientcontext.printStackTrace();
            return DataHolder.empty(6);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        MetagameApiInternal.append(stringbuilder, "language", MetagameApiInternal.enc(s1));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        MetagameApiInternal.append(stringbuilder, "pageToken", MetagameApiInternal.enc(((String) (obj))));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        MetagameApiInternal.append(stringbuilder, "plusRequired", String.valueOf(boolean1));
        obj = stringbuilder.toString();
        obj = (CategoryListResponse)((MetagameApiInternal) (obj1)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj)), null, com/google/android/gms/games/server/api/CategoryListResponse);
        arraylist.addAll(((CategoryListResponse) (obj)).getItems());
        obj1 = (String)((FastMapJsonResponse) (obj)).mValues.get("nextPageToken");
        obj = obj1;
        if (obj1 == null)
        {
            gamesclientcontext = DataHolder.builder(new String[] {
                "game_category", "xp_for_game"
            }, "game_category");
            i = 0;
            for (j = arraylist.size(); i < j; i++)
            {
                obj = (Category)arraylist.get(i);
                obj1 = new ContentValues();
                ((ContentValues) (obj1)).put("game_category", (String)((FastMapJsonResponse) (obj)).mValues.get("category"));
                ((ContentValues) (obj1)).put("xp_for_game", (Long)((FastMapJsonResponse) (obj)).mValues.get("experiencePoints"));
                gamesclientcontext.withRow(((ContentValues) (obj1)));
            }

            return gamesclientcontext.build(0);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final DataHolder loadProfileSettings(GamesClientContext gamesclientcontext)
        throws GoogleAuthException
    {
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        long l = DefaultClock.getInstance().currentTimeMillis();
        mProfileSettingsCache.enableCaching(clientcontext);
        if (!gamesclientcontext.mForceReload && mProfileSettingsCache.hasData(clientcontext, l))
        {
            return mProfileSettingsCache.getData(clientcontext, null);
        }
        Object obj;
        Object obj1;
        StringBuilder stringbuilder;
        try
        {
            obj = mPlayersApiInternal;
            obj1 = Boolean.valueOf(false);
            stringbuilder = new StringBuilder("players/me/profilesettings");
        }
        // Misplaced declaration of an exception variable
        catch (GamesClientContext gamesclientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "PlayerAgent");
            }
            return DataHolder.empty(4);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        PlayersApiInternal.append(stringbuilder, "requestRandomGamerTag", String.valueOf(obj1));
        obj1 = stringbuilder.toString();
        obj = (ProfileSettings)((PlayersApiInternal) (obj)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj1)), null, com/google/android/gms/games/server/api/ProfileSettings);
        updateLocalProfileSettings(gamesclientcontext, ((ProfileSettings) (obj)));
        return mProfileSettingsCache.getData(clientcontext, null);
    }

    public final DataHolder loadXpStream(GamesClientContext gamesclientcontext, int i)
        throws GoogleAuthException
    {
        Object obj;
        Object obj1;
        long l;
        l = DefaultClock.getInstance().currentTimeMillis();
        obj = gamesclientcontext.mExternalTargetPlayerId;
        obj1 = gamesclientcontext.mClientContext;
        if (!mXpStreamEventStreamCache.hasCacheOwner(obj1)) goto _L2; else goto _L1
_L1:
        int j;
        boolean flag;
        mXpStreamEventStreamCache.enableCaching(obj1);
        flag = mXpStreamEventStreamCache.hasData(obj, l);
        j = mXpStreamEventStreamCache.getStatusCode(obj);
        if (flag || mXpStreamEventStreamCache.getEntryCount(obj) == 0) goto _L4; else goto _L3
_L3:
        mXpStreamEventStreamCache.setStatusCode(obj, 3);
        obj = mXpStreamEventStreamCache.getData(obj, null);
_L9:
        if (((DataHolder) (obj)).mStatusCode != 0) goto _L6; else goto _L5
_L5:
        return ((DataHolder) (obj));
_L4:
        if (flag && j == 0)
        {
            obj = mXpStreamEventStreamCache.getData(obj, null);
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (l - mXpStreamRefreshTimeMillis < ((Long)G.experienceEventCacheStaleThresholdMillis.get()).longValue())
        {
            obj = com.google.android.gms.games.provider.GamesContractInternal.ExperienceEvents.getContentUri(gamesclientcontext.mClientContext);
            obj1 = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(((Uri) (obj))).query();
            obj = obj1;
            if (((DataHolder) (obj1)).mRowCount > 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            ((DataHolder) (obj1)).close();
        }
        obj = DataHolder.empty(6);
        continue; /* Loop/switch isn't completed */
_L6:
        obj1 = gamesclientcontext.mExternalTargetPlayerId;
        ExperienceListResponse experiencelistresponse = mMetagameApiInternal.listExperiencesByPlayerBlocking(gamesclientcontext.mClientContext, ((String) (obj1)), "experience_points", Agents.getLocaleString(gamesclientcontext.mContext), Integer.valueOf(i), null);
        ((DataHolder) (obj)).close();
        obj = gamesclientcontext.mContext;
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        ArrayList arraylist = new ArrayList();
        addXpEventOps(((Context) (obj)), clientcontext, experiencelistresponse.getItems(), arraylist);
        boolean flag1 = true;
        if (arraylist.size() > 0)
        {
            flag1 = Agents.applyContentOperations(((Context) (obj)).getContentResolver(), arraylist, "PlayerAgent");
        }
        if (!flag1)
        {
            GamesLog.e("PlayerAgent", "Failed to store experiences from load");
        }
        mXpStreamEventStreamCache.enableCaching(gamesclientcontext.mClientContext);
        mXpStreamEventStreamCache.clear();
        obj = experiencelistresponse.getItems();
        gamesclientcontext = getXpContentValues(gamesclientcontext.mContext, gamesclientcontext.mClientContext, ((ArrayList) (obj)), true);
        mXpStreamEventStreamCache.addCacheData(obj1, gamesclientcontext, 0, null, experiencelistresponse.getNextPageToken(), 0, DefaultClock.getInstance().currentTimeMillis());
        return mXpStreamEventStreamCache.getData(obj1, null);
        gamesclientcontext;
        ErrorUtils.parseAndLogErrorResponse(gamesclientcontext, "PlayerAgent");
        if (((DataHolder) (obj)).mRowCount != 0) goto _L5; else goto _L7
_L7:
        ((DataHolder) (obj)).close();
        return DataHolder.empty(4);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final int syncPlayerLevelTable(Context context, ClientContext clientcontext)
        throws GoogleAuthException
    {
        Object obj;
        int i;
        try
        {
            obj = (MetagameConfig)mMetagameApiInternal.mServer.getResponseBlocking(clientcontext, 0, "metagameConfig", null, com/google/android/gms/games/server/api/MetagameConfig);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 6;
        }
        i = Agents.queryInt(context, com.google.android.gms.games.provider.GamesContractInternal.PlayerLevels.getContentUri(clientcontext), "version", -1);
        if (i == ((MetagameConfig) (obj)).getCurrentVersion().intValue())
        {
            return 0;
        }
        if (i > ((MetagameConfig) (obj)).getCurrentVersion().intValue())
        {
            GamesLog.w("PlayerAgent", "Local player level table version is higher than the server's version, replacing local data.");
        }
        int j = ((MetagameConfig) (obj)).getCurrentVersion().intValue();
        obj = ((MetagameConfig) (obj)).getPlayerLevels();
        ArrayList arraylist = new ArrayList(((ArrayList) (obj)).size() + 1);
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.PlayerLevels.getContentUri(clientcontext)).build());
        i = 0;
        for (int k = ((ArrayList) (obj)).size(); i < k; i++)
        {
            Object obj1 = (com.google.android.gms.games.server.api.PlayerLevel)((ArrayList) (obj)).get(i);
            Uri uri = com.google.android.gms.games.provider.GamesContractInternal.PlayerLevels.getUriForLevel(clientcontext, ((com.google.android.gms.games.server.api.PlayerLevel) (obj1)).getLevel().intValue());
            obj1 = ((FastContentValuesJsonResponse) (obj1)).mValues;
            ((ContentValues) (obj1)).put("version", Integer.valueOf(j));
            arraylist.add(ContentProviderOperation.newInsert(uri).withValues(((ContentValues) (obj1))).build());
        }

        return !Agents.applyContentOperations(context.getContentResolver(), arraylist, "PlayerAgent") ? 1 : 0;
    }

    public final SyncNetworkResponse syncXpEventsFromNetwork(Context context, ClientContext clientcontext, String s)
        throws GoogleAuthException
    {
_L2:
        ExperiencesApiInternal experiencesapiinternal;
        String s2;
        StringBuilder stringbuilder;
        s2 = Agents.getLocaleString(context);
        experiencesapiinternal = mExperiencesApiInternal;
        stringbuilder = new StringBuilder("experiences/sync");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        ExperiencesApiInternal.append(stringbuilder, "language", ExperiencesApiInternal.enc(s2));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ExperiencesApiInternal.append(stringbuilder, "syncToken", ExperiencesApiInternal.enc(s));
        ExperienceSyncFirstPartyResponse experiencesyncfirstpartyresponse;
        String s3 = stringbuilder.toString();
        experiencesyncfirstpartyresponse = (ExperienceSyncFirstPartyResponse)experiencesapiinternal.mServer.getResponseBlocking(clientcontext, 0, s3, null, com/google/android/gms/games/server/api/ExperienceSyncFirstPartyResponse);
        int i = 0;
        ArrayList arraylist = experiencesyncfirstpartyresponse.getItems();
        String s4 = Agents.getSyncToken(context, clientcontext, XP_SYNC_TOKEN_PROJECTION);
        String s1 = s4;
        if (((Boolean)((FastMapJsonResponse) (experiencesyncfirstpartyresponse)).mValues.get("moreAvailable")).booleanValue())
        {
            Object obj;
            int j;
            boolean flag;
            if (!Objects.equal(s, s4))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "Server claims to have more data, yet sync tokens match!");
            context = syncXpEventsFromNetwork(context, clientcontext, s4);
            j = ((SyncNetworkResponse) (context)).mStatusCode;
            s1 = s4;
            i = j;
            if (j == 0)
            {
                arraylist.addAll(((SyncNetworkResponse) (context)).mExperiences);
                s1 = ((SyncNetworkResponse) (context)).mNewSyncToken;
                i = j;
            }
        }
        context = arraylist;
        if (arraylist == null)
        {
            context = new ArrayList();
        }
        return new SyncNetworkResponse(context, s1, i);
        obj;
        if (!ErrorUtils.hasStatusCode(((VolleyError) (obj)), 410))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = new ArrayList(2);
        ((ArrayList) (obj)).add(ContentProviderOperation.newUpdate(com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(clientcontext)).withValue("request_sync_token", null).build());
        ((ArrayList) (obj)).add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.ExperienceEvents.getContentUri(clientcontext)).build());
        Agents.applyContentOperations(context.getContentResolver(), ((ArrayList) (obj)), "PlayerAgent");
        GamesLog.d("PlayerAgent", (new StringBuilder("Token ")).append(s).append(" is invalid. Retrying with no token.").toString());
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (GamesLog.canLog$134632())
        {
            ErrorUtils.parseAndLogErrorResponse(((VolleyError) (obj)), "PlayerAgent");
        }
        return new SyncNetworkResponse();
    }

    public final int updateContactSettings(ClientContext clientcontext, boolean flag, Bundle bundle)
        throws GoogleAuthException
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); arraylist.add(new ContactChannelSetting(s, Boolean.valueOf(bundle.getBoolean(s)))))
        {
            s = (String)iterator.next();
        }

        bundle = new ContactSettings(Boolean.valueOf(flag), arraylist);
        mContactSettingsCache.enableCaching(clientcontext);
        mContactSettingsCache.clear();
        try
        {
            mPlayersApiInternal.mServer.performNoResponseRequestBlocking(clientcontext, 2, "players/me/contactsettings", bundle);
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(clientcontext, "PlayerAgent");
            }
            return 6;
        }
        return 0;
    }

    public final int updateProfileSettings(GamesClientContext gamesclientcontext, boolean flag)
        throws GoogleAuthException
    {
        ClientContext clientcontext = gamesclientcontext.mClientContext;
        ProfileSettings profilesettings = new ProfileSettings(Boolean.valueOf(true), Boolean.valueOf(flag));
        int i = 0;
        try
        {
            mPlayersApiInternal.mServer.performNoResponseRequestBlocking(clientcontext, 2, "players/me/profilesettings", profilesettings);
        }
        catch (VolleyError volleyerror)
        {
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(volleyerror, "PlayerAgent");
            }
            i = 6;
        }
        if (i == 0)
        {
            mProfileSettingsCache.enableCaching(clientcontext);
            updateLocalProfileSettings(gamesclientcontext, profilesettings);
        }
        return i;
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        PLUS_PEOPLE_TYPES = arraylist;
        arraylist.add("person");
        PLAYER_COMPAT_SPEC = ColumnSpec.builder().withColumnsFrom(GamesDataUtils.PLAYER_SPEC).withColumn("game_icon_image_uri", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).build();
        LEVEL_UP_NOTIFICATION_SPEC = ColumnSpec.builder().withColumn("external_game_id", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("notification_id", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("external_sub_id", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("type", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("image_uri", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("ticker", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("title", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("text", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("coalesced_text", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("acknowledged", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("alert_level", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).build();
        CONTACT_SETTINGS_SPEC = ColumnSpec.builder().withColumn("level_notifications_enabled", com.google.android.gms.games.provider.ColumnSpec.DataType.BOOLEAN).withColumn("match_notifications_enabled", com.google.android.gms.games.provider.ColumnSpec.DataType.BOOLEAN).withColumn("mobile_notifications_enabled", com.google.android.gms.games.provider.ColumnSpec.DataType.BOOLEAN).withColumn("quest_notifications_enabled", com.google.android.gms.games.provider.ColumnSpec.DataType.BOOLEAN).withColumn("request_notifications_enabled", com.google.android.gms.games.provider.ColumnSpec.DataType.BOOLEAN).build();
        PROFILE_SETTINGS_SPEC = ColumnSpec.builder().withColumn("profile_visible", com.google.android.gms.games.provider.ColumnSpec.DataType.BOOLEAN).withColumn("profile_visibility_explicitly_set", com.google.android.gms.games.provider.ColumnSpec.DataType.BOOLEAN).build();
        XP_STREAM_DATA_SPEC = ColumnSpec.builder().withColumn("external_experience_id", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("game_id", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("created_timestamp", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("current_xp", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("display_title", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("display_description", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("display_string", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("xp_earned", com.google.android.gms.games.provider.ColumnSpec.DataType.LONG).withColumn("type", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("icon_id", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumn("icon_url", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("icon_uri", com.google.android.gms.games.provider.ColumnSpec.DataType.STRING).withColumn("newLevel", com.google.android.gms.games.provider.ColumnSpec.DataType.INTEGER).withColumnsFrom(GamesDataUtils.GAME_SPEC).build();
    }
}
