// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.util.ArrayMap;
import com.android.volley.VolleyError;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.error.ErrorInstanceResponse;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.server.api.AnonymousPlayer;
import com.google.android.gms.games.server.api.FirstPartyMultiplayerEntity;
import com.google.android.gms.games.server.api.MatchParticipantResult;
import com.google.android.gms.games.server.api.Player;
import com.google.android.gms.games.server.api.Room;
import com.google.android.gms.games.server.api.RoomAutoMatchStatus;
import com.google.android.gms.games.server.api.RoomAutoMatchingCriteria;
import com.google.android.gms.games.server.api.RoomClientAddress;
import com.google.android.gms.games.server.api.RoomModification;
import com.google.android.gms.games.server.api.RoomParticipant;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.server.api.TurnBasedAutoMatchingCriteria;
import com.google.android.gms.games.server.api.TurnBasedMatch;
import com.google.android.gms.games.server.api.TurnBasedMatchData;
import com.google.android.gms.games.server.api.TurnBasedMatchModification;
import com.google.android.gms.games.server.api.TurnBasedMatchParticipant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.broker:
//            Agents

public final class MultiplayerUtils
{
    private static interface TrimMatchesQuery
    {

        public static final String PROJECTION[] = {
            "_id", "game_id", "last_updated_timestamp"
        };

    }


    private static final String DELETE_SELECTION_ARGS[] = {
        "REPLACE_ME"
    };

    static int addRoomInvitationStorageOps(Context context, ClientContext clientcontext, FirstPartyMultiplayerEntity firstpartymultiplayerentity, long l, Clock clock, ArrayList arraylist)
    {
        Room room = firstpartymultiplayerentity.getRoom();
        if (room != null) goto _L2; else goto _L1
_L1:
        int i = -1;
_L11:
        return i;
_L2:
        Object obj;
        RoomModification roommodification;
        Object obj1;
        int j;
        boolean flag;
        int i1;
        long l1;
        long l2;
        boolean flag2;
        roommodification = room.getCreationDetails();
        obj1 = room.getLastUpdateDetails();
        String s = (String)((FastContentValuesJsonResponse) (room)).mValues.get("creator_external");
        obj = s;
        if (s == null)
        {
            obj = roommodification.getParticipantId();
        }
        l2 = roommodification.getModifiedTimestampMillis().longValue();
        if (obj1 == null)
        {
            l1 = l2;
        } else
        {
            l1 = ((RoomModification) (obj1)).getModifiedTimestampMillis().longValue();
        }
        obj1 = room.getParticipants();
        if (obj1 == null)
        {
            GamesLog.e("MultiplayerUtils", (new StringBuilder("No participants found for invitation ")).append(room.getRoomId()).toString());
            return -1;
        }
        roommodification = null;
        flag = false;
        flag2 = false;
        j = 0;
        i1 = ((ArrayList) (obj1)).size();
_L9:
        String s1;
        boolean flag1;
        i = ((flag) ? 1 : 0);
        flag1 = flag2;
        s1 = roommodification;
        if (j >= i1) goto _L4; else goto _L3
_L3:
        RoomParticipant roomparticipant;
        Player player;
        roomparticipant = (RoomParticipant)((ArrayList) (obj1)).get(j);
        if (!roomparticipant.getId().equals(obj))
        {
            break MISSING_BLOCK_LABEL_307;
        }
        j = 1;
        player = roomparticipant.getPlayer();
        if (player == null) goto _L6; else goto _L5
_L5:
        s1 = player.getDisplayName();
        flag1 = player.isCircled().booleanValue();
        i = j;
_L4:
        if (i == 0 || s1 == null)
        {
            GamesLog.e("MultiplayerUtils", (new StringBuilder("No inviting player found for external ID ")).append(((String) (obj))).toString());
            return -1;
        }
        break; /* Loop/switch isn't completed */
_L6:
        i = j;
        flag1 = flag2;
        s1 = roommodification;
        if (roomparticipant.getAutoMatchedPlayer() != null)
        {
            s1 = roomparticipant.getAutoMatchedPlayer().getDisplayName();
            i = j;
            flag1 = flag2;
        }
        if (true) goto _L4; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
        j++;
        if (true) goto _L9; else goto _L8
_L8:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("game_id", Long.valueOf(l));
        contentvalues.put("external_invitation_id", room.getRoomId());
        contentvalues.put("external_inviter_id", ((String) (obj)));
        contentvalues.put("creation_timestamp", Long.valueOf(l2));
        contentvalues.put("last_modified_timestamp", Long.valueOf(l1));
        contentvalues.put("description", (String)((FastContentValuesJsonResponse) (room)).mValues.get("description"));
        contentvalues.put("type", Integer.valueOf(0));
        contentvalues.put("inviter_in_circles", Boolean.valueOf(flag1));
        if (room.getVariant() != null)
        {
            contentvalues.put("variant", room.getVariant());
        }
        obj = room.getAutoMatchingCriteria();
        int k;
        if (obj != null)
        {
            contentvalues.put("has_automatch_criteria", Boolean.valueOf(true));
            contentvalues.put("automatch_min_players", ((RoomAutoMatchingCriteria) (obj)).getMinAutoMatchingPlayers());
            contentvalues.put("automatch_max_players", ((RoomAutoMatchingCriteria) (obj)).getMaxAutoMatchingPlayers());
        } else
        {
            contentvalues.put("has_automatch_criteria", Boolean.valueOf(false));
            contentvalues.putNull("automatch_min_players");
            contentvalues.putNull("automatch_max_players");
        }
        GamesLog.d("MultiplayerUtils", (new StringBuilder("Adding invitation for room ")).append(room.getRoomId()).toString());
        k = arraylist.size();
        arraylist.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getContentUri(clientcontext)).withValues(contentvalues).withYieldAllowed(true).build());
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Participants.getContentUri(clientcontext)).withSelection("invitation_id=?", DELETE_SELECTION_ARGS).withSelectionBackReference(0, k).build());
        addRoomParticipantOps(context, clientcontext, ((ArrayList) (obj1)), "invitation_id", k, clock, arraylist);
        context = Agents.getNotificationOp(context, clientcontext, firstpartymultiplayerentity.getNotification(), l, room.getRoomId(), 1);
        i = k;
        if (context != null)
        {
            arraylist.add(context);
            return k;
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static void addRoomParticipantOps(Context context, ClientContext clientcontext, ArrayList arraylist, String s, int i, Clock clock, ArrayList arraylist1)
    {
        android.net.Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Participants.getContentUri(clientcontext);
        int j = 0;
        for (int l = arraylist.size(); j < l; j++)
        {
            Object obj = (RoomParticipant)arraylist.get(j);
            Asserts.checkState(ParticipantUtils.isValidParticipantId(((RoomParticipant) (obj)).getId()));
            int k = -1;
            Object obj1 = ((RoomParticipant) (obj)).getPlayer();
            if (obj1 != null)
            {
                k = arraylist1.size();
                arraylist1.add(Agents.getPlayerUpsertOp(clientcontext, ((FastContentValuesJsonResponse) (obj1)).mValues, clock.currentTimeMillis()));
            }
            obj1 = ((FastContentValuesJsonResponse) (obj)).mValues;
            Object obj2 = ((RoomParticipant) (obj)).getClientAddress();
            if (obj2 != null)
            {
                ((ContentValues) (obj1)).put("client_address", ((RoomClientAddress) (obj2)).getXmppAddress());
            }
            obj2 = ((RoomParticipant) (obj)).getAutoMatchedPlayer();
            obj = obj1;
            if (obj2 != null)
            {
                ((ContentValues) (obj1)).put("default_display_name", ((AnonymousPlayer) (obj2)).getDisplayName());
                ((ContentValues) (obj1)).put("default_display_image_url", ((AnonymousPlayer) (obj2)).getAvatarImageUrl());
                obj = Agents.addHiResProfileImageUrl(context, ((ContentValues) (obj1)), ((AnonymousPlayer) (obj2)).getAvatarImageUrl(), "default_display_hi_res_image_url");
            }
            obj = ContentProviderOperation.newInsert(uri).withValues(((ContentValues) (obj))).withValueBackReference(s, i);
            if (k != -1)
            {
                ((android.content.ContentProviderOperation.Builder) (obj)).withValueBackReference("player_id", k);
            }
            arraylist1.add(((android.content.ContentProviderOperation.Builder) (obj)).build());
        }

    }

    static void addTombstoneOps(ClientContext clientcontext, String s, ArrayList arraylist)
    {
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForExternalMatchId(clientcontext, s)).build());
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, s)).withYieldAllowed(Agents.shouldAllowYieldAtIndex(arraylist.size())).build());
    }

    static int addTurnBasedEntityStorageOps(Context context, ClientContext clientcontext, FirstPartyMultiplayerEntity firstpartymultiplayerentity, long l, Clock clock, ArrayList arraylist)
    {
        TurnBasedMatch turnbasedmatch = firstpartymultiplayerentity.getTurnBasedMatch();
        int i = addTurnBasedMatchStorageOps(context, clientcontext, turnbasedmatch, l, clock, arraylist);
        if (i != -1)
        {
            arraylist.add(Agents.getNotificationOp(context, clientcontext, firstpartymultiplayerentity.getNotification(), l, turnbasedmatch.getMatchId(), 2));
        }
        return i;
    }

    static int addTurnBasedInvitationStorageOps(Context context, ClientContext clientcontext, FirstPartyMultiplayerEntity firstpartymultiplayerentity, long l, Clock clock, ArrayList arraylist)
    {
        TurnBasedMatch turnbasedmatch = firstpartymultiplayerentity.getTurnBasedMatch();
        if (turnbasedmatch != null) goto _L2; else goto _L1
_L1:
        int i = -1;
_L11:
        return i;
_L2:
        Object obj;
        Object obj1;
        TurnBasedMatchModification turnbasedmatchmodification;
        TurnBasedMatchModification turnbasedmatchmodification1;
        Object obj2;
        int j;
        boolean flag;
        int i1;
        boolean flag2;
        turnbasedmatchmodification = turnbasedmatch.getCreationDetails();
        turnbasedmatchmodification1 = turnbasedmatch.getLastUpdateDetails();
        String s = (String)((FastContentValuesJsonResponse) (turnbasedmatch)).mValues.get("creator_external");
        obj = s;
        if (s == null)
        {
            obj = turnbasedmatchmodification.getParticipantId();
        }
        obj2 = turnbasedmatch.getParticipants();
        if (obj2 == null)
        {
            GamesLog.e("MultiplayerUtils", (new StringBuilder("No participants found for invitation ")).append(turnbasedmatch.getMatchId()).toString());
            return -1;
        }
        obj1 = null;
        flag = false;
        flag2 = false;
        j = 0;
        i1 = ((ArrayList) (obj2)).size();
_L9:
        String s1;
        boolean flag1;
        i = ((flag) ? 1 : 0);
        flag1 = flag2;
        s1 = obj1;
        if (j >= i1) goto _L4; else goto _L3
_L3:
        TurnBasedMatchParticipant turnbasedmatchparticipant;
        turnbasedmatchparticipant = (TurnBasedMatchParticipant)((ArrayList) (obj2)).get(j);
        if (!turnbasedmatchparticipant.getId().equals(obj))
        {
            break MISSING_BLOCK_LABEL_275;
        }
        j = 1;
        obj2 = turnbasedmatchparticipant.getPlayer();
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        s1 = ((Player) (obj2)).getDisplayName();
        flag1 = ((Player) (obj2)).isCircled().booleanValue();
        i = j;
_L4:
        if (i == 0 || s1 == null)
        {
            GamesLog.e("MultiplayerUtils", (new StringBuilder("No inviting player found for external ID ")).append(((String) (obj))).toString());
            return -1;
        }
        break; /* Loop/switch isn't completed */
_L6:
        i = j;
        flag1 = flag2;
        s1 = obj1;
        if (turnbasedmatchparticipant.getAutoMatchedPlayer() != null)
        {
            s1 = turnbasedmatchparticipant.getAutoMatchedPlayer().getDisplayName();
            i = j;
            flag1 = flag2;
        }
        if (true) goto _L4; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
        j++;
        if (true) goto _L9; else goto _L8
_L8:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("game_id", Long.valueOf(l));
        contentvalues.put("external_invitation_id", turnbasedmatch.getMatchId());
        contentvalues.put("external_inviter_id", ((String) (obj)));
        contentvalues.put("creation_timestamp", turnbasedmatchmodification.getModifiedTimestampMillis());
        contentvalues.put("last_modified_timestamp", turnbasedmatchmodification1.getModifiedTimestampMillis());
        contentvalues.put("type", Integer.valueOf(1));
        contentvalues.put("inviter_in_circles", Boolean.valueOf(flag1));
        if (turnbasedmatch.getVariant() != null)
        {
            contentvalues.put("variant", turnbasedmatch.getVariant());
        }
        obj = turnbasedmatch.getAutoMatchingCriteria();
        int k;
        if (obj != null)
        {
            contentvalues.put("has_automatch_criteria", Boolean.valueOf(true));
            contentvalues.put("automatch_min_players", ((TurnBasedAutoMatchingCriteria) (obj)).getMinAutoMatchingPlayers());
            contentvalues.put("automatch_max_players", ((TurnBasedAutoMatchingCriteria) (obj)).getMaxAutoMatchingPlayers());
        } else
        {
            contentvalues.put("has_automatch_criteria", Boolean.valueOf(false));
            contentvalues.putNull("automatch_min_players");
            contentvalues.putNull("automatch_max_players");
        }
        k = arraylist.size();
        arraylist.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getContentUri(clientcontext)).withValues(contentvalues).withYieldAllowed(true).build());
        arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Participants.getContentUri(clientcontext)).withSelection("invitation_id=?", DELETE_SELECTION_ARGS).withSelectionBackReference(0, k).build());
        addTurnBasedParticipantOps(context, clientcontext, turnbasedmatch, "invitation_id", k, clock, arraylist);
        context = Agents.getNotificationOp(context, clientcontext, firstpartymultiplayerentity.getNotification(), l, turnbasedmatch.getMatchId(), 1);
        i = k;
        if (context != null)
        {
            arraylist.add(context);
            return k;
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    static int addTurnBasedMatchStorageOps(Context context, ClientContext clientcontext, TurnBasedMatch turnbasedmatch, long l, Clock clock, ArrayList arraylist)
    {
        int i;
        if (turnbasedmatch == null)
        {
            i = -1;
        } else
        {
            ContentValues contentvalues = new ContentValues(((FastContentValuesJsonResponse) (turnbasedmatch)).mValues);
            Object obj = turnbasedmatch.getMatchId();
            TurnBasedMatchModification turnbasedmatchmodification = turnbasedmatch.getCreationDetails();
            String s1 = turnbasedmatchmodification.getParticipantId();
            TurnBasedMatchModification turnbasedmatchmodification1 = turnbasedmatch.getLastUpdateDetails();
            String s;
            String s2;
            ArrayList arraylist1;
            if (turnbasedmatchmodification1 == null)
            {
                s = null;
            } else
            {
                s = turnbasedmatchmodification1.getParticipantId();
            }
            s2 = contentvalues.getAsString("pending_participant_external");
            arraylist1 = turnbasedmatch.getParticipants();
            if (arraylist1 == null)
            {
                GamesLog.e("MultiplayerUtils", (new StringBuilder("No participants found for match ")).append(((String) (obj))).toString());
                return -1;
            }
            arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Invitations.getUriForExternalInvitationId(clientcontext, ((String) (obj)))).build());
            contentvalues.put("game_id", Long.valueOf(l));
            contentvalues.put("creator_external", s1);
            contentvalues.put("creation_timestamp", turnbasedmatchmodification.getModifiedTimestampMillis());
            contentvalues.put("last_updater_external", s);
            if (turnbasedmatchmodification1 != null)
            {
                contentvalues.put("last_updated_timestamp", turnbasedmatchmodification1.getModifiedTimestampMillis());
            }
            contentvalues.remove("external_game_id");
            contentvalues.put("pending_participant_external", s2);
            obj = turnbasedmatch.getData();
            if (obj != null)
            {
                contentvalues.put("data", Base64Utils.decodeUrlSafe(((TurnBasedMatchData) (obj)).getData()));
            }
            obj = turnbasedmatch.getPreviousMatchData();
            boolean flag;
            boolean flag1;
            boolean flag2;
            int j;
            if (obj != null)
            {
                contentvalues.put("previous_match_data", Base64Utils.decodeUrlSafe(((TurnBasedMatchData) (obj)).getData()));
            } else
            {
                contentvalues.putNull("previous_match_data");
            }
            obj = turnbasedmatch.getAutoMatchingCriteria();
            if (obj != null)
            {
                contentvalues.put("has_automatch_criteria", Boolean.valueOf(true));
                contentvalues.put("automatch_min_players", ((TurnBasedAutoMatchingCriteria) (obj)).getMinAutoMatchingPlayers());
                contentvalues.put("automatch_max_players", ((TurnBasedAutoMatchingCriteria) (obj)).getMaxAutoMatchingPlayers());
                contentvalues.put("automatch_bit_mask", (Long)((FastMapJsonResponse) (obj)).mValues.get("exclusiveBitmask"));
            } else
            {
                contentvalues.put("has_automatch_criteria", Boolean.valueOf(false));
                contentvalues.putNull("automatch_min_players");
                contentvalues.putNull("automatch_max_players");
                contentvalues.putNull("automatch_bit_mask");
            }
            j = arraylist.size();
            arraylist.add(ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Matches.getContentUri(clientcontext)).withValues(contentvalues).withYieldAllowed(true).build());
            arraylist.add(ContentProviderOperation.newDelete(com.google.android.gms.games.provider.GamesContractInternal.Participants.getContentUri(clientcontext)).withSelection("match_id=?", DELETE_SELECTION_ARGS).withSelectionBackReference(0, j).build());
            addTurnBasedParticipantOps(context, clientcontext, turnbasedmatch, "match_id", j, clock, arraylist);
            flag2 = false;
            flag1 = false;
            flag = false;
            i = 0;
            for (int k = arraylist1.size(); i < k; i++)
            {
                context = ((TurnBasedMatchParticipant)arraylist1.get(i)).getId();
                if (context.equals(s1))
                {
                    flag2 = true;
                }
                if (context.equals(s))
                {
                    flag1 = true;
                }
                if (context.equals(s2))
                {
                    flag = true;
                }
            }

            if (!flag2)
            {
                GamesLog.e("MultiplayerUtils", (new StringBuilder("No match-creating player found for external ID ")).append(s1).toString());
                return -1;
            }
            if (s != null && !flag1)
            {
                GamesLog.e("MultiplayerUtils", (new StringBuilder("No match-updating player found for external ID ")).append(s).toString());
                return -1;
            }
            i = j;
            if (s2 != null)
            {
                i = j;
                if (!flag)
                {
                    GamesLog.e("MultiplayerUtils", (new StringBuilder("No pending player found for external ID ")).append(s2).toString());
                    return -1;
                }
            }
        }
        return i;
    }

    private static void addTurnBasedParticipantOps(Context context, ClientContext clientcontext, TurnBasedMatch turnbasedmatch, String s, int i, Clock clock, ArrayList arraylist)
    {
        ArrayList arraylist1;
        android.net.Uri uri;
        int k;
        int i1;
        arraylist1 = turnbasedmatch.getParticipants();
        uri = com.google.android.gms.games.provider.GamesContractInternal.Participants.getContentUri(clientcontext);
        k = 0;
        i1 = arraylist1.size();
_L7:
        Object obj1;
        Object obj2;
        Object obj3;
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        obj2 = (TurnBasedMatchParticipant)arraylist1.get(k);
        obj1 = ((TurnBasedMatchParticipant) (obj2)).getId();
        Asserts.checkState(ParticipantUtils.isValidParticipantId(((String) (obj1))));
        obj3 = turnbasedmatch.getResults();
        if (obj3 != null && ((ArrayList) (obj3)).size() != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L3:
        int l = -1;
        obj1 = ((TurnBasedMatchParticipant) (obj2)).getPlayer();
        if (obj1 != null)
        {
            l = arraylist.size();
            arraylist.add(Agents.getPlayerUpsertOp(clientcontext, ((FastContentValuesJsonResponse) (obj1)).mValues, clock.currentTimeMillis()));
        }
        obj1 = ((FastContentValuesJsonResponse) (obj2)).mValues;
        if (obj != null)
        {
            obj3 = (String)((FastMapJsonResponse) (obj)).mValues.get("result");
            int j;
            if (((String) (obj3)).equals("MATCH_RESULT_WIN"))
            {
                j = 0;
            } else
            if (((String) (obj3)).equals("MATCH_RESULT_LOSS"))
            {
                j = 1;
            } else
            if (((String) (obj3)).equals("MATCH_RESULT_TIE"))
            {
                j = 2;
            } else
            if (((String) (obj3)).equals("MATCH_RESULT_NONE"))
            {
                j = 3;
            } else
            if (((String) (obj3)).equals("MATCH_RESULT_DISCONNECT"))
            {
                j = 4;
            } else
            if (((String) (obj3)).equals("MATCH_RESULT_DISAGREED"))
            {
                j = 5;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Unknown result string: ")).append(((String) (obj3))).toString());
            }
            ((ContentValues) (obj1)).put("result_type", Integer.valueOf(j));
            ((ContentValues) (obj1)).put("placing", (Integer)((FastMapJsonResponse) (obj)).mValues.get("placing"));
        }
        obj2 = ((TurnBasedMatchParticipant) (obj2)).getAutoMatchedPlayer();
        obj = obj1;
        if (obj2 != null)
        {
            ((ContentValues) (obj1)).put("default_display_name", ((AnonymousPlayer) (obj2)).getDisplayName());
            ((ContentValues) (obj1)).put("default_display_image_url", ((AnonymousPlayer) (obj2)).getAvatarImageUrl());
            obj = Agents.addHiResProfileImageUrl(context, ((ContentValues) (obj1)), ((AnonymousPlayer) (obj2)).getAvatarImageUrl(), "default_display_hi_res_image_url");
        }
        obj = ContentProviderOperation.newInsert(uri).withValues(((ContentValues) (obj))).withValueBackReference(s, i);
        if (l != -1)
        {
            ((android.content.ContentProviderOperation.Builder) (obj)).withValueBackReference("player_id", l);
        }
        arraylist.add(((android.content.ContentProviderOperation.Builder) (obj)).build());
        k++;
        continue; /* Loop/switch isn't completed */
_L2:
        l = ((ArrayList) (obj3)).size();
        j = 0;
_L5:
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_375;
        }
        obj = (MatchParticipantResult)((ArrayList) (obj3)).get(j);
        if (!((String)((FastMapJsonResponse) (obj)).mValues.get("participantId")).equals(obj1)) goto _L4; else goto _L3
_L4:
        j++;
          goto _L5
        obj = null;
          goto _L3
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static ContentValues assembleParticipantValues$37f6e4d8(Context context, RoomParticipant roomparticipant)
    {
        ContentValues contentvalues = ((FastContentValuesJsonResponse) (roomparticipant)).mValues;
        Object obj = roomparticipant.getClientAddress();
        if (roomparticipant.isConnected() == null)
        {
            contentvalues.putNull("connected");
        }
        if (obj != null)
        {
            contentvalues.put("client_address", ((RoomClientAddress) (obj)).getXmppAddress());
        }
        obj = roomparticipant.getAutoMatchedPlayer();
        if (obj != null)
        {
            contentvalues.put("default_display_name", ((AnonymousPlayer) (obj)).getDisplayName());
            contentvalues.put("default_display_image_url", ((AnonymousPlayer) (obj)).getAvatarImageUrl());
            context = Agents.addHiResProfileImageUrl(context, contentvalues, ((AnonymousPlayer) (obj)).getAvatarImageUrl(), "default_display_hi_res_image_url");
        } else
        {
            roomparticipant = roomparticipant.getPlayer();
            context = contentvalues;
            if (roomparticipant != null)
            {
                context = ((FastContentValuesJsonResponse) (roomparticipant)).mValues;
                context.put("last_updated", Long.valueOf(System.currentTimeMillis()));
                contentvalues.putAll(context);
                return contentvalues;
            }
        }
        return context;
    }

    static int getErrorStatus(String s, VolleyError volleyerror, int i)
    {
        s = ErrorUtils.getErrorInstance(volleyerror, s);
        if (s == null || s.getReason() == null)
        {
            return i;
        }
        s = s.getReason();
        if (!s.equalsIgnoreCase("MatchCreationNotAllowed")) goto _L2; else goto _L1
_L1:
        i = 6000;
_L4:
        return i;
_L2:
        if (s.equalsIgnoreCase("TrustedTestersOnly"))
        {
            i = 6001;
        } else
        if (s.equalsIgnoreCase("InvalidMatchType"))
        {
            i = 6002;
        } else
        if (s.equalsIgnoreCase("MultiplayerDisabled"))
        {
            i = 6003;
        } else
        if (s.equalsIgnoreCase("InactiveRoom"))
        {
            i = 7005;
        } else
        if (s.equalsIgnoreCase("InvalidParticipantState"))
        {
            i = 6500;
        } else
        if (s.equalsIgnoreCase("InactiveMatch"))
        {
            i = 6501;
        } else
        if (s.equalsIgnoreCase("InvalidState"))
        {
            i = 6502;
        } else
        if (s.equalsIgnoreCase("OutOfDateVersion"))
        {
            i = 6503;
        } else
        if (s.equalsIgnoreCase("InvalidMatchResults"))
        {
            i = 6504;
        } else
        if (s.equalsIgnoreCase("AlreadyRematched"))
        {
            i = 6505;
        } else
        if (ErrorUtils.hasStatusCode(volleyerror, 400))
        {
            i = 6004;
        } else
        if (!ErrorUtils.isTransientError(volleyerror))
        {
            i = 6;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Map getRoomAsDataValues(Context context, ClientContext clientcontext, Room room, String s)
    {
        if (room.getStatus().intValue() == 4)
        {
            GamesLog.w("MultiplayerUtils", (new StringBuilder("Room is already deleted : ")).append(room.getRoomId()).toString());
            context = null;
        } else
        {
            ArrayMap arraymap = new ArrayMap();
            if (Agents.forceResolveExternalGameId(context, clientcontext, s) == -1L)
            {
                GamesLog.e("MultiplayerUtils", (new StringBuilder("No game found matching external game ID ")).append(s).toString());
                return null;
            }
            ContentValues contentvalues = ((FastContentValuesJsonResponse) (room)).mValues;
            Object obj = room.getRoomId();
            Object obj1 = room.getCreationDetails();
            Preconditions.checkNotNull(obj1, String.format("Creation Details cannot be null for room with status: %d", new Object[] {
                room.getStatus()
            }));
            String s1 = ((RoomModification) (obj1)).getParticipantId();
            Object obj2 = room.getLastUpdateDetails();
            ArrayList arraylist;
            if (obj2 == null)
            {
                s = null;
            } else
            {
                s = ((RoomModification) (obj2)).getParticipantId();
            }
            arraylist = room.getParticipants();
            if (arraylist == null)
            {
                GamesLog.e("MultiplayerUtils", (new StringBuilder("No participants found for room ")).append(((String) (obj))).toString());
                return null;
            }
            contentvalues.put("creator_external", s1);
            contentvalues.put("creation_timestamp", ((RoomModification) (obj1)).getModifiedTimestampMillis());
            contentvalues.put("last_updater_external", s);
            if (obj2 != null)
            {
                contentvalues.put("last_updated_timestamp", ((RoomModification) (obj2)).getModifiedTimestampMillis());
            }
            s = room.getAutoMatchingCriteria();
            android.net.Uri uri;
            ArrayList arraylist1;
            boolean flag;
            int k;
            if (s != null)
            {
                contentvalues.put("has_automatch_criteria", Boolean.valueOf(true));
                contentvalues.put("automatch_min_players", s.getMinAutoMatchingPlayers());
                contentvalues.put("automatch_max_players", s.getMaxAutoMatchingPlayers());
                contentvalues.put("automatch_bit_mask", (Long)((FastMapJsonResponse) (s)).mValues.get("exclusiveBitmask"));
            } else
            {
                contentvalues.put("has_automatch_criteria", Boolean.valueOf(false));
                contentvalues.putNull("automatch_min_players");
                contentvalues.putNull("automatch_max_players");
                contentvalues.putNull("automatch_bit_mask");
            }
            room = room.getAutoMatchingStatus();
            if (room != null && room.getWaitEstimateSeconds() != null)
            {
                contentvalues.put("automatch_wait_estimate_sec", room.getWaitEstimateSeconds());
            } else
            {
                contentvalues.put("automatch_wait_estimate_sec", Integer.valueOf(-1));
            }
            k = arraylist.size();
            uri = com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(clientcontext);
            clientcontext = new ArrayList(k);
            room = new ArrayList(k);
            s = new ArrayList(k);
            obj = new ArrayList(k);
            obj1 = new ArrayList(k);
            obj2 = new ArrayList(k);
            arraylist1 = new ArrayList();
            flag = false;
            for (int i = 0; i < k; i++)
            {
                RoomParticipant roomparticipant = (RoomParticipant)arraylist.get(i);
                if (roomparticipant.getId().equals(s1))
                {
                    flag = true;
                }
                ContentValues contentvalues2 = new ContentValues();
                contentvalues2.putAll(contentvalues);
                contentvalues2.putAll(assembleParticipantValues$37f6e4d8(context, roomparticipant));
                clientcontext.add(Agents.addInsertImageOp(uri, contentvalues2.getAsString("default_display_image_url"), arraylist1));
                room.add(Agents.addInsertImageOp(uri, contentvalues2.getAsString("default_display_hi_res_image_url"), arraylist1));
                s.add(Agents.addInsertImageOp(uri, contentvalues2.getAsString("profile_icon_image_url"), arraylist1));
                ((ArrayList) (obj)).add(Agents.addInsertImageOp(uri, contentvalues2.getAsString("profile_hi_res_image_url"), arraylist1));
                ((ArrayList) (obj1)).add(Agents.addInsertImageOp(uri, contentvalues2.getAsString("banner_image_landscape_url"), arraylist1));
                ((ArrayList) (obj2)).add(Agents.addInsertImageOp(uri, contentvalues2.getAsString("banner_image_portrait_url"), arraylist1));
                arraymap.put(roomparticipant.getId(), contentvalues2);
            }

            boolean flag1;
            if (clientcontext.size() == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            if (room.size() == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            if (s.size() == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            if (((ArrayList) (obj)).size() == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            if (((ArrayList) (obj1)).size() == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            if (((ArrayList) (obj2)).size() == k)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            context = Agents.applyContentOperationsWithResult(context.getContentResolver(), arraylist1, "MultiplayerUtils");
            for (int j = 0; j < k; j++)
            {
                ContentValues contentvalues1 = (ContentValues)arraymap.get(((RoomParticipant)arraylist.get(j)).getId());
                Agents.addImageUriColumn(contentvalues1, "default_display_image_url", "default_display_image_uri", context, (Integer)clientcontext.get(j));
                Agents.addImageUriColumn(contentvalues1, "default_display_hi_res_image_url", "default_display_hi_res_image_uri", context, (Integer)room.get(j));
                Agents.addImageUriColumn(contentvalues1, "profile_icon_image_url", "profile_icon_image_uri", context, (Integer)s.get(j));
                Agents.addImageUriColumn(contentvalues1, "profile_hi_res_image_url", "profile_hi_res_image_uri", context, (Integer)((ArrayList) (obj)).get(j));
                Agents.addImageUriColumn(contentvalues1, "banner_image_landscape_url", "banner_image_landscape_uri", context, (Integer)((ArrayList) (obj1)).get(j));
                Agents.addImageUriColumn(contentvalues1, "banner_image_portrait_url", "banner_image_portrait_uri", context, (Integer)((ArrayList) (obj2)).get(j));
            }

            context = arraymap;
            if (!flag)
            {
                GamesLog.e("MultiplayerUtils", (new StringBuilder("No room-creating player found for external ID ")).append(s1).toString());
                return null;
            }
        }
        return context;
    }

    public static String roomStatusDataHolderToJsonString(DataHolder dataholder)
    {
        return dataholder.getString("RoomStatusJson", 0, 0);
    }

    public static DataHolder roomStatusToDataHolder(RoomStatus roomstatus)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("RoomStatusJson", roomstatus.toString());
        return DataHolder.builder(new String[] {
            "RoomStatusJson"
        }).withRow(contentvalues).build(0);
    }

    static void trimCompletedMatches(Context context, ClientContext clientcontext)
    {
        HashMap hashmap;
        Object obj;
        int i;
        int k;
        long l;
        hashmap = new HashMap();
        k = ((Integer)G.maxCompletedMatches.get()).intValue();
        l = -1L;
        i = 0;
        obj = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Matches.getContentUri(clientcontext));
        ((QuerySpec) (obj)).addWhere("user_match_status", "3");
        Agents.QueryBuilder querybuilder = new Agents.QueryBuilder(context);
        querybuilder.mQuery = ((QuerySpec) (obj));
        querybuilder.mProjection = TrimMatchesQuery.PROJECTION;
        querybuilder.mSortOrder = "game_id,last_updated_timestamp DESC";
        obj = querybuilder.queryCursor();
_L7:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        long l2 = ((Cursor) (obj)).getLong(1);
        int j;
        long l1;
        j = i;
        l1 = l;
        if (l2 != l)
        {
            l1 = l2;
            j = 0;
        }
          goto _L3
_L5:
        i = j;
        l = l1;
        if (hashmap.containsKey(Long.valueOf(l2)))
        {
            continue; /* Loop/switch isn't completed */
        }
        hashmap.put(Long.valueOf(l2), Long.valueOf(((Cursor) (obj)).getLong(2)));
        i = j;
        l = l1;
        continue; /* Loop/switch isn't completed */
        context;
        ((Cursor) (obj)).close();
        throw context;
_L2:
        ((Cursor) (obj)).close();
        obj = new ArrayList(hashmap.keySet().size());
        Object obj1;
        QuerySpec queryspec;
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(ContentProviderOperation.newDelete(((android.net.Uri) (obj1))).withSelection(queryspec.getSelection(), queryspec.mSelectionArgs).withYieldAllowed(Agents.shouldAllowYieldAtIndex(((ArrayList) (obj)).size())).build()))
        {
            obj1 = (Long)iterator.next();
            l = ((Long)hashmap.get(obj1)).longValue();
            obj1 = com.google.android.gms.games.provider.GamesContractInternal.Matches.getUriForGameId(clientcontext, ((Long) (obj1)).longValue());
            queryspec = new QuerySpec(((android.net.Uri) (obj1)));
            queryspec.addWhere("user_match_status", "3");
            queryspec.addWhere("last_updated_timestamp", String.valueOf(l), "<=?");
        }

        if (((ArrayList) (obj)).size() > 0)
        {
            Agents.applyContentOperations(context.getContentResolver(), ((ArrayList) (obj)), "MultiplayerUtils");
        }
        return;
_L3:
        if (j >= k) goto _L5; else goto _L4
_L4:
        i = j + 1;
        l = l1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void updateRoomData$2432be7a(Context context, Map map, ContentValues contentvalues, RoomStatus roomstatus)
    {
        String s = roomstatus.getRoomId();
        Integer integer = roomstatus.getStatus();
        int j = -1;
        Object obj = roomstatus.getAutoMatchingStatus();
        int i = j;
        if (obj != null)
        {
            i = j;
            if (((RoomAutoMatchStatus) (obj)).getWaitEstimateSeconds() != null)
            {
                i = ((RoomAutoMatchStatus) (obj)).getWaitEstimateSeconds().intValue();
            }
        }
        obj = roomstatus.getParticipants();
        j = 0;
        int k = ((ArrayList) (obj)).size();
        while (j < k) 
        {
            RoomParticipant roomparticipant = (RoomParticipant)((ArrayList) (obj)).get(j);
            roomstatus = (ContentValues)map.get(roomparticipant.getId());
            if (roomstatus != null)
            {
                roomstatus.put("status", integer);
                roomstatus.putAll(assembleParticipantValues$37f6e4d8(context, roomparticipant));
            } else
            {
                roomstatus = new ContentValues();
                ContentValues contentvalues1 = new ContentValues();
                contentvalues1.putAll(contentvalues);
                contentvalues1.put("external_match_id", s);
                contentvalues1.put("status", integer);
                contentvalues1.put("automatch_wait_estimate_sec", Integer.valueOf(i));
                roomstatus.putAll(contentvalues1);
                roomstatus.putAll(assembleParticipantValues$37f6e4d8(context, roomparticipant));
            }
            map.put(roomparticipant.getId(), roomstatus);
            j++;
        }
    }

}
