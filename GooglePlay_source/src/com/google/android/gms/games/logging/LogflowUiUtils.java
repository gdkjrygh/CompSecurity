// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.experience.ExperienceEvent;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.LogflowEventListener;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentCard;

// Referenced classes of package com.google.android.gms.games.logging:
//            LogflowGamesUiElementNode, LogflowDocument, LogflowViewLeafUiElementNode, GamesLogflowLogger

public final class LogflowUiUtils
{

    public static void attachDocumentId(View view, Object obj)
    {
        if (obj == null)
        {
            return;
        }
        String s = extractDocumentId(obj);
        if (s == null)
        {
            Log.w("LogflowUiUtils", (new StringBuilder("Attempting to get document ID for unknown object type: ")).append(obj.getClass().toString()).toString());
            return;
        } else
        {
            attachDocumentId(view, s);
            return;
        }
    }

    private static void attachDocumentId(View view, String s)
    {
        if (view == null || !(view.getTag(0x7f0d0061) instanceof LogflowGamesUiElementNode))
        {
            Log.w("LogflowUiUtils", "Attempting to set document ID for an invalid view.");
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            Log.w("LogflowUiUtils", "Attempting to attach a null document ID");
            return;
        } else
        {
            ((LogflowGamesUiElementNode)view.getTag(0x7f0d0061)).getPlaylogGamesUiElement().id = s;
            return;
        }
    }

    public static Pair createElemKey(com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement)
    {
        return new Pair(Integer.valueOf(playloggamesuielement.type), playloggamesuielement.id);
    }

    private static String extractDocumentId(Object obj)
    {
        if (obj != null)
        {
            if (obj instanceof Achievement)
            {
                return String.format("a:%s", new Object[] {
                    ((Achievement)obj).getAchievementId()
                });
            }
            if (obj instanceof Player)
            {
                return String.format("p:%s", new Object[] {
                    ((Player)obj).getPlayerId()
                });
            }
            if (obj instanceof Game)
            {
                return String.format("g:%s", new Object[] {
                    ((Game)obj).getApplicationId()
                });
            }
            if (obj instanceof GameFirstParty)
            {
                return String.format("g:%s", new Object[] {
                    ((GameFirstParty)obj).getGame().getApplicationId()
                });
            }
            if (obj instanceof MostRecentGameInfo)
            {
                return String.format("g:%s", new Object[] {
                    ((MostRecentGameInfo)obj).getGameId()
                });
            }
            if (obj instanceof Leaderboard)
            {
                return String.format("l:%s", new Object[] {
                    ((Leaderboard)obj).getLeaderboardId()
                });
            }
            if (obj instanceof ExtendedAppContentCard)
            {
                return ((ExtendedAppContentCard)obj).getLogflowDocumentId();
            }
            if (obj instanceof ExperienceEvent)
            {
                return ((ExperienceEvent)obj).getExperienceId();
            }
            if (obj instanceof Quest)
            {
                return ((Quest)obj).getQuestId();
            }
            if (obj instanceof Invitation)
            {
                return ((Invitation)obj).getInvitationId();
            }
            if (obj instanceof ZInvitationCluster)
            {
                return ((ZInvitationCluster)obj).getInvitationId();
            }
            if (obj instanceof TurnBasedMatch)
            {
                return ((TurnBasedMatch)obj).getMatchId();
            }
            if (obj instanceof GameRequest)
            {
                return ((GameRequest)obj).getRequestId();
            }
            if (obj instanceof GameRequestCluster)
            {
                return ((GameRequestCluster)obj).getRequestId();
            }
            if (obj instanceof SnapshotMetadata)
            {
                return ((SnapshotMetadata)obj).getSnapshotId();
            }
            if (obj instanceof LogflowDocument)
            {
                return ((LogflowDocument)obj).getDocumentId();
            }
        }
        return null;
    }

    public static void setupLogflowAndImpressView(View view, GamesRecyclerAdapter gamesrecycleradapter, int i, int j, Object obj)
    {
        String s = extractDocumentId(obj);
        if (s == null)
        {
            Log.w("LogflowUiUtils", (new StringBuilder("Attempting to get document ID for unknown object type: ")).append(obj.getClass().toString()).toString());
            return;
        } else
        {
            setupLogflowAndImpressView(view, gamesrecycleradapter, i, j, s);
            return;
        }
    }

    public static void setupLogflowAndImpressView(View view, GamesRecyclerAdapter gamesrecycleradapter, int i, int j, String s)
    {
        view.setTag(0x7f0d0061, new LogflowViewLeafUiElementNode(i, GamesLogflowLogger.obtainPlaylogGamesUiElement(j, Integer.toHexString(System.identityHashCode(gamesrecycleradapter)))));
        attachDocumentId(view, s);
        s = gamesrecycleradapter.mLogListener;
        if (s != null)
        {
            s.logImpression(view, gamesrecycleradapter.mIsFlinging);
        }
    }
}
