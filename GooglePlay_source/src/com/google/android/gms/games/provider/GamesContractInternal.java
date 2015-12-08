// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import android.net.Uri;
import android.provider.BaseColumns;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.utils.UriUtils;
import java.util.HashMap;
import java.util.List;

public final class GamesContractInternal
{
    public static final class AccountMetadata
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "account_metadata").build();
        }

        public static Uri getContentUri(String s)
        {
            return GamesUris.getBuilder(s, "account_metadata").build();
        }
    }

    public static final class AchievementDefinitions
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.AchievementDefinitionsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "achievement_definitions").build();
        }

        public static Uri getUriForExternalAchievementId(Uri uri, String s)
        {
            return getUriForExternalAchievementIdInternal(GamesUris.getBuilder(uri, "achievement_definitions"), s);
        }

        public static Uri getUriForExternalAchievementId(ClientContext clientcontext, String s)
        {
            return getUriForExternalAchievementIdInternal(GamesUris.getBuilder(clientcontext, "achievement_definitions"), s);
        }

        private static Uri getUriForExternalAchievementIdInternal(android.net.Uri.Builder builder, String s)
        {
            return builder.appendPath("ext_achievement").appendPath(s).build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "achievement_definitions").appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForGameId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "achievement_definitions").appendPath("game").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class AchievementInstances
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.AchievementInstancesColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "achievement_instances").build();
        }

        public static Uri getUriForExternalPlayerAndGameId(ClientContext clientcontext, String s, String s1)
        {
            return GamesUris.getBuilder(clientcontext, "achievement_instances").appendPath("ext_player").appendPath(s1).appendQueryParameter("external_game_id", s).build();
        }

        public static Uri getUriForExternalPlayerAndGameId(GamesClientContext gamesclientcontext)
        {
            return getUriForExternalPlayerAndGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalTargetGameId, gamesclientcontext.getExternalPlayerId());
        }

        public static Uri getUriForId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "achievement_instances").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class AchievementPendingOps
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.AchievementPendingOpsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "achievement_pending_ops").build();
        }
    }

    public static final class Acls
        implements com.google.android.gms.games.internal.GamesContract.AclsColumns
    {
    }

    public static final class AppContents
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.AppContentColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "app_contents").build();
        }
    }

    public static final class ApplicationSessions
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.ApplicationSessionColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "application_sessions").build();
        }
    }

    public static final class ClientContexts
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.ClientContextsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "client_contexts").build();
        }
    }

    public static final class EventDefinitions
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.EventDefinitionColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "event_definitions").build();
        }

        public static Uri getUriForExternalEventId(Uri uri, String s)
        {
            return getUriForExternalEventIdInternal(GamesUris.getBuilder(uri, "event_definitions"), s);
        }

        public static Uri getUriForExternalEventId(ClientContext clientcontext, String s)
        {
            return getUriForExternalEventIdInternal(GamesUris.getBuilder(clientcontext, "event_definitions"), s);
        }

        private static Uri getUriForExternalEventIdInternal(android.net.Uri.Builder builder, String s)
        {
            return builder.appendPath("ext_event").appendPath(s).build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "event_definitions").appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForGameId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "event_definitions").appendPath("game").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class EventInstances
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.EventInstancesColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "event_instances").build();
        }

        public static Uri getUriForExternalEventId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "event_instances").appendPath("ext_event").appendPath(s).build();
        }

        public static Uri getUriForExternalPlayerAndGameId(ClientContext clientcontext, String s, String s1)
        {
            return GamesUris.getBuilder(clientcontext, "event_instances").appendPath("ext_player").appendPath(s).appendQueryParameter("external_game_id", s1).build();
        }

        public static Uri getUriForExternalPlayerAndGameId(GamesClientContext gamesclientcontext)
        {
            boolean flag;
            if (gamesclientcontext.mExternalCurrentPlayerId != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "The current player must be set before calling this method.");
            return getUriForExternalPlayerAndGameId(gamesclientcontext.mClientContext, gamesclientcontext.mExternalCurrentPlayerId, gamesclientcontext.mExternalTargetGameId);
        }
    }

    public static final class EventPendingOps
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.EventPendingOpsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "event_pending_ops").build();
        }

        public static Uri getUriForExternalEventId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "event_pending_ops").appendPath("ext_event").appendPath(s).build();
        }

        public static Uri getUriForExternalPlayerAndGameId(GamesClientContext gamesclientcontext)
        {
            ClientContext clientcontext = gamesclientcontext.mClientContext;
            String s = gamesclientcontext.mExternalCurrentPlayerId;
            gamesclientcontext = gamesclientcontext.mExternalTargetGameId;
            return GamesUris.getBuilder(clientcontext, "event_pending_ops").appendPath("ext_player").appendPath(s).appendQueryParameter("external_game_id", gamesclientcontext).build();
        }

        public static Uri getUriForId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "event_pending_ops").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class ExperienceEvents
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.ExperienceEventColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "experience_events").build();
        }

        public static Uri getUriForExternalExperienceId(Uri uri, String s)
        {
            return GamesUris.getBuilder(uri, "experience_events").appendPath("ext_event").appendPath(s).build();
        }
    }

    public static final class GameBadges
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.GameBadgesColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "game_badges").build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            return GamesUris.getBuilder(clientcontext, "game_badges").appendPath("ext_game").appendPath(s).build();
        }
    }

    public static final class GameInstances
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.GameInstancesColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "game_instances").build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            return GamesUris.getBuilder(clientcontext, "game_instances").appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "game_instances").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class GameSearchSuggestions
        implements com.google.android.gms.games.internal.GamesContract.GameSearchSuggestionsColumns
    {
    }

    public static final class Games
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.GamesColumns
    {

        public static Uri getContentUri(Uri uri)
        {
            return GamesUris.getBuilder(uri, "games").build();
        }

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "games").build();
        }

        public static Uri getFeaturedImageUri(String s, String s1)
        {
            return GamesUris.getBuilder(s, "games").appendPath("ext_game").appendPath(s1).appendPath("featured_image").build();
        }

        public static Uri getIconImageUri(String s, String s1)
        {
            return GamesUris.getBuilder(s, "games").appendPath("ext_game").appendPath(s1).appendPath("icon_image").build();
        }

        public static Uri getUriForExternalGameId(Uri uri, String s)
        {
            return getUriForExternalGameIdInternal(GamesUris.getBuilder(uri, "games"), s);
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            return getUriForExternalGameIdInternal(GamesUris.getBuilder(clientcontext, "games"), s);
        }

        private static Uri getUriForExternalGameIdInternal(android.net.Uri.Builder builder, String s)
        {
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            return builder.appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForId(Uri uri, long l)
        {
            return GamesUris.getBuilder(uri, "games").appendPath(String.valueOf(l)).build();
        }

        public static Uri getUriForId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "games").appendPath(String.valueOf(l)).build();
        }
    }

    private static final class GamesUris
    {

        private static HashMap sUriMap = new HashMap();

        public static android.net.Uri.Builder getBuilder(Uri uri, String s)
        {
            return getBuilderInternal(UriUtils.getDataStoreNameFromUri(uri), s);
        }

        public static android.net.Uri.Builder getBuilder(ClientContext clientcontext, String s)
        {
            return getBuilderInternal(UriUtils.getDataStoreNameFromClientContext(clientcontext), s);
        }

        public static android.net.Uri.Builder getBuilder(String s, String s1)
        {
            Preconditions.checkNotNull(s);
            return getBuilderInternal(s, s1);
        }

        private static android.net.Uri.Builder getBuilderInternal(String s, String s1)
        {
            Object obj = (HashMap)sUriMap.get(s1);
            HashMap hashmap = ((HashMap) (obj));
            if (obj == null)
            {
                hashmap = new HashMap();
                sUriMap.put(s1, hashmap);
            }
            Uri uri = (Uri)hashmap.get(s);
            obj = uri;
            if (uri == null)
            {
                obj = Uri.withAppendedPath(GamesContractInternal.AUTHORITY_URI, s1).buildUpon().appendPath(s).build();
                hashmap.put(s, obj);
            }
            return ((Uri) (obj)).buildUpon();
        }

    }

    public static final class Images
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.ImagesColumns
    {

        public static Uri getContentUri(Uri uri)
        {
            return GamesUris.getBuilder(uri, "images").build();
        }

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "images").build();
        }
    }

    public static final class Invitations
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.InvitationsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "invitations").build();
        }

        private static Uri getUriForExternalIdInternal(android.net.Uri.Builder builder, String s)
        {
            return builder.appendPath("ext_invitation").appendPath(s).build();
        }

        public static Uri getUriForExternalInvitationId(Uri uri, String s)
        {
            return getUriForExternalIdInternal(GamesUris.getBuilder(uri, "invitations"), s);
        }

        public static Uri getUriForExternalInvitationId(ClientContext clientcontext, String s)
        {
            return getUriForExternalIdInternal(GamesUris.getBuilder(clientcontext, "invitations"), s);
        }
    }

    public static final class LeaderboardInstances
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.LeaderboardInstancesColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboard_instances").build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboard_instances").appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForExternalLeaderboardId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboard_instances").appendPath("ext_leaderboard").appendPath(s).build();
        }

        public static Uri getUriForId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboard_instances").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class LeaderboardPendingScores
        implements BaseColumns
    {

        public static final String ALL_COLUMNS[] = {
            "client_context_id", "external_game_id", "external_leaderboard_id", "external_player_id", "raw_score", "achieved_timestamp", "score_tag", "signature"
        };

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboard_pending_scores").build();
        }

        public static Uri getUriForId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboard_pending_scores").appendPath(String.valueOf(l)).build();
        }

    }

    public static final class LeaderboardScores
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.LeaderboardScoresColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboard_scores").build();
        }

        public static Uri getUriForInstanceId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboard_scores").appendPath("instance").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class Leaderboards
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.LeaderboardsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboards").build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboards").appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForExternalLeaderboardId(Uri uri, String s)
        {
            return getUriForExternalLeaderboardIdInternal(GamesUris.getBuilder(uri, "leaderboards"), s);
        }

        public static Uri getUriForExternalLeaderboardId(ClientContext clientcontext, String s)
        {
            return getUriForExternalLeaderboardIdInternal(GamesUris.getBuilder(clientcontext, "leaderboards"), s);
        }

        private static Uri getUriForExternalLeaderboardIdInternal(android.net.Uri.Builder builder, String s)
        {
            return builder.appendPath("ext_leaderboard").appendPath(s).build();
        }

        public static Uri getUriForGameId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "leaderboards").appendPath("game").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class MatchEntities
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.MatchesColumns, com.google.android.gms.games.internal.GamesContract.ParticipantsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "match_entities").build();
        }

        public static Uri getUriForExternalMatchId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "match_entities").appendPath("ext_match").appendPath(s).build();
        }
    }

    public static final class Matches
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.MatchesColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "matches").build();
        }

        public static Uri getUriForExternalMatchId(Uri uri, String s)
        {
            return getUriForExternalMatchIdInternal(GamesUris.getBuilder(uri, "matches"), s);
        }

        public static Uri getUriForExternalMatchId(ClientContext clientcontext, String s)
        {
            return getUriForExternalMatchIdInternal(GamesUris.getBuilder(clientcontext, "matches"), s);
        }

        private static Uri getUriForExternalMatchIdInternal(android.net.Uri.Builder builder, String s)
        {
            return builder.appendPath("ext_match").appendPath(s).build();
        }

        public static Uri getUriForGameId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "matches").appendPath("game").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class MatchesPendingOps
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.MatchesPendingOpsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "matches_pending_ops").build();
        }

        public static Uri getUriForExternalMatchId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "matches_pending_ops").appendPath("ext_match").appendPath(s).build();
        }
    }

    public static final class Milestones
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.MilestoneColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "milestones").build();
        }

        public static Uri getUriForExternalMilestoneId(Uri uri, String s)
        {
            return GamesUris.getBuilder(uri, "milestones").appendPath("ext_milestone").appendPath(s).build();
        }

        public static Uri getUriForExternalMilestoneId(ClientContext clientcontext, String s)
        {
            return getUriForExternalMilestoneId(getContentUri(clientcontext), s);
        }

        public static Uri getUriForId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "milestones").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class Notifications
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.NotificationsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "notifications").build();
        }

        public static Uri getContentUri(String s)
        {
            return GamesUris.getBuilder(s, "notifications").build();
        }
    }

    public static final class Participants
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.ParticipantsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "participants").build();
        }

        public static Uri getUriForExternalId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "participants").appendPath("ext_participant").appendPath(s).build();
        }
    }

    public static final class PlayerLevels
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.PlayerLevelColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "player_levels").build();
        }

        public static Uri getUriForLevel(Uri uri, int i)
        {
            return getUriForLevelInternal(GamesUris.getBuilder(uri, "player_levels"), i);
        }

        public static Uri getUriForLevel(ClientContext clientcontext, int i)
        {
            return getUriForLevelInternal(GamesUris.getBuilder(clientcontext, "player_levels"), i);
        }

        private static Uri getUriForLevelInternal(android.net.Uri.Builder builder, int i)
        {
            return builder.appendPath("player_level").appendPath(String.valueOf(i)).build();
        }
    }

    public static final class PlayerStats
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.PlayerStatsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "player_stats").build();
        }

        public static Pair getQuerySpecParams(Uri uri)
        {
            uri = uri.getPathSegments();
            int i = uri.size();
            boolean flag;
            if (i == 6)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invalid URI provided");
            Preconditions.checkState("player".equals(uri.get(i - 4)), "Invalid URI provided");
            Preconditions.checkState("game".equals(uri.get(i - 2)), "Invalid URI provided");
            return new Pair(uri.get(i - 3), uri.get(i - 1));
        }

        public static Uri getUriForGamesContext(Uri uri, long l, long l1)
        {
            boolean flag1 = true;
            boolean flag;
            if (l != -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            if (l1 != -1L)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            return GamesUris.getBuilder(uri, "player_stats").appendPath("player").appendPath(Long.toString(l)).appendPath("game").appendPath(Long.toString(l1)).build();
        }

        public static Uri getUriForGamesContext(GamesClientContext gamesclientcontext)
        {
            return getUriForGamesContext(getContentUri(gamesclientcontext.mClientContext), gamesclientcontext.resolveCurrentPlayerId(), gamesclientcontext.resolveOwningGameId());
        }
    }

    public static final class Players
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.PlayersColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "players").build();
        }

        public static Uri getUriForExternalPlayerId(Uri uri, String s)
        {
            return getUriForExternalPlayerIdInternal(GamesUris.getBuilder(uri, "players"), s);
        }

        public static Uri getUriForExternalPlayerId(ClientContext clientcontext, String s)
        {
            return getUriForExternalPlayerIdInternal(GamesUris.getBuilder(clientcontext, "players"), s);
        }

        private static Uri getUriForExternalPlayerIdInternal(android.net.Uri.Builder builder, String s)
        {
            return builder.appendPath("ext_player").appendPath(s).build();
        }
    }

    public static final class Quests
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.QuestsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "quests").build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "quests").appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForExternalQuestId(Uri uri, String s)
        {
            return GamesUris.getBuilder(uri, "quests").appendPath("ext_quest").appendPath(s).build();
        }

        public static Uri getUriForExternalQuestId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(getContentUri(clientcontext), "quests").appendPath("ext_quest").appendPath(s).build();
        }

        public static Uri getUriForGameId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "quests").appendPath("game").appendPath(String.valueOf(l)).build();
        }

        public static Uri getUriForId(ClientContext clientcontext, long l)
        {
            return GamesUris.getBuilder(clientcontext, "quests").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class QuestsEntities
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.MilestoneColumns, com.google.android.gms.games.internal.GamesContract.QuestsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "quest_entities").build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "quest_entities").appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForExternalQuestId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "quest_entities").appendPath("ext_quest").appendPath(s).build();
        }
    }

    public static final class RequestEntities
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.RequestRecipientsColumns, com.google.android.gms.games.internal.GamesContract.RequestsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "request_entities").build();
        }

        public static Uri getUriForExternalRequestId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "request_entities").appendPath("ext_request").appendPath(s).build();
        }
    }

    public static final class RequestPendingOps
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.RequestPendingOpsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "request_pending_ops").build();
        }

        public static Uri getUriForExternalRequestId(Uri uri, String s)
        {
            return GamesUris.getBuilder(uri, "request_pending_ops").appendPath("ext_request").appendPath(s).build();
        }

        public static Uri getUriForExternalRequestId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "request_pending_ops").appendPath("ext_request").appendPath(s).build();
        }
    }

    public static final class RequestRecipients
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.RequestRecipientsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "request_recipients").build();
        }

        public static Uri getUriForRequestId(Uri uri, long l)
        {
            return GamesUris.getBuilder(uri, "request_recipients").appendPath("request").appendPath(String.valueOf(l)).build();
        }
    }

    public static final class Requests
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.RequestsColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "requests").build();
        }

        public static Uri getUriForExternalRequestId(Uri uri, String s)
        {
            return GamesUris.getBuilder(uri, "requests").appendPath("ext_request").appendPath(s).build();
        }

        public static Uri getUriForExternalRequestId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "requests").appendPath("ext_request").appendPath(s).build();
        }
    }

    public static final class Snapshots
        implements BaseColumns, com.google.android.gms.games.internal.GamesContract.SnapshotColumns
    {

        public static Uri getContentUri(ClientContext clientcontext)
        {
            return GamesUris.getBuilder(clientcontext, "snapshots").build();
        }

        public static Uri getUriForExternalGameId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "snapshots").appendPath("ext_game").appendPath(s).build();
        }

        public static Uri getUriForExternalSnapshotId(Uri uri, String s)
        {
            return GamesUris.getBuilder(uri, "snapshots").appendPath("ext_snapshot").appendPath(s).build();
        }

        public static Uri getUriForExternalSnapshotId(ClientContext clientcontext, String s)
        {
            return GamesUris.getBuilder(clientcontext, "snapshots").appendPath("ext_snapshot").appendPath(s).build();
        }
    }


    public static final Uri AUTHORITY_URI = Uri.parse("content://com.google.android.gms.games.background/");

    public static Uri getClearLocaleDataContentUri(ClientContext clientcontext)
    {
        return GamesUris.getBuilder(clientcontext, "clear_for_locale_change").build();
    }

}
