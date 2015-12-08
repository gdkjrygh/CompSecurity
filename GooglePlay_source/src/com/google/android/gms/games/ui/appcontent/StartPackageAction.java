// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, AppContentFragment, ExtendedAppContentSection

public final class StartPackageAction extends ExtendedAppContentAction
{

    public StartPackageAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public final void execute()
    {
        final String gameId;
        byte byte0;
        gameId = mAction.getExtras().getString("subAction");
        if (TextUtils.isEmpty(gameId))
        {
            gameId = ((Fragment) (mFragment)).mActivity;
            gameId = mAction.getExtras().getString("applicationId");
            if (TextUtils.isEmpty(gameId))
            {
                GamesLog.e("StartPackageAct", "Missing application id");
                return;
            } else
            {
                mFragment.getGame(gameId, new AppContentFragment.GameLoadedCallback() {

                    final StartPackageAction this$0;

                    public final void onGameLoaded(GameFirstParty gamefirstparty)
                    {
                        UiUtils.launchGame(mContext, gamefirstparty.getGame(), null);
                    }

            
            {
                this$0 = StartPackageAction.this;
                super();
            }
                });
                return;
            }
        }
        byte0 = -1;
        gameId.hashCode();
        JVM INSTR lookupswitch 5: default 136
    //                   -1882686247: 210
    //                   -1850567526: 225
    //                   -1672510963: 240
    //                   833335724: 195
    //                   2030228719: 180;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_240;
_L7:
        final String matchId;
        final String accountName;
        switch (byte0)
        {
        default:
            GamesLog.w("StartPackageAct", "Unrecognized sub-action");
            return;

        case 0: // '\0'
            final String accountName = (GamesFragmentActivity)((Fragment) (mFragment)).mActivity;
            final String invitationId = mAction.getExtras();
            gameId = invitationId.getString("applicationId");
            invitationId = invitationId.getString("invitationId");
            accountName = ((GamesFragmentActivity) (accountName)).mConfiguration.getCurrentAccountName();
            if (TextUtils.isEmpty(gameId))
            {
                GamesLog.e("StartPackageAct", "Missing application id");
                return;
            } else
            {
                mFragment.getGame(gameId, new AppContentFragment.GameLoadedCallback() {

                    final StartPackageAction this$0;
                    final String val$accountName;
                    final String val$invitationId;

                    public final void onGameLoaded(GameFirstParty gamefirstparty)
                    {
                        gamefirstparty = (Game)gamefirstparty.getGame().freeze();
                        AppContentFragment appcontentfragment = mFragment;
                        appcontentfragment.startNewLoader(new AppContentFragment.InvitationLoader(appcontentfragment, invitationId, gamefirstparty. new AppContentFragment.InvitationLoadedCallback() {

                            final _cls2 this$1;
                            final Game val$game;

                            public final void onInvitationLoaded(Invitation invitation)
                            {
                                UiUtils.launchGameForInvitation(mContext, accountName, game, invitation);
                            }

            
            {
                this$1 = final__pcls2;
                game = Game.this;
                super();
            }
                        }));
                    }

            
            {
                this$0 = StartPackageAction.this;
                invitationId = s;
                accountName = s1;
                super();
            }
                });
                return;
            }

        case 1: // '\001'
            final String accountName = (GamesFragmentActivity)((Fragment) (mFragment)).mActivity;
            final String questId = mAction.getExtras();
            gameId = questId.getString("applicationId");
            questId = questId.getString("questId");
            final String playerId = ((GamesFragmentActivity) (accountName)).mConfiguration.getCurrentPlayerId();
            accountName = ((GamesFragmentActivity) (accountName)).mConfiguration.getCurrentAccountName();
            if (TextUtils.isEmpty(gameId))
            {
                GamesLog.e("StartPackageAct", "Missing application id");
                return;
            } else
            {
                mFragment.getGame(gameId, new AppContentFragment.GameLoadedCallback() {

                    final StartPackageAction this$0;
                    final String val$accountName;
                    final String val$gameId;
                    final String val$playerId;
                    final String val$questId;

                    public final void onGameLoaded(GameFirstParty gamefirstparty)
                    {
                        gamefirstparty = (Game)gamefirstparty.getGame().freeze();
                        AppContentFragment appcontentfragment = mFragment;
                        appcontentfragment.startNewLoader(new AppContentFragment.QuestLoader(appcontentfragment, gameId, playerId, questId, gamefirstparty. new AppContentFragment.QuestLoadedCallback() {

                            final _cls3 this$1;
                            final Game val$game;

                            public final void onQuestLoaded(Quest quest)
                            {
                                UiUtils.launchGameForQuest(mContext, accountName, game, quest);
                            }

            
            {
                this$1 = final__pcls3;
                game = Game.this;
                super();
            }
                        }));
                    }

            
            {
                this$0 = StartPackageAction.this;
                gameId = s;
                playerId = s1;
                questId = s2;
                accountName = s3;
                super();
            }
                });
                return;
            }

        case 2: // '\002'
            final String accountName = (GamesFragmentActivity)((Fragment) (mFragment)).mActivity;
            final HashSet requestIds = mAction.getExtras();
            gameId = requestIds.getString("applicationId");
            final String playerId = ((GamesFragmentActivity) (accountName)).mConfiguration.getCurrentPlayerId();
            accountName = ((GamesFragmentActivity) (accountName)).mConfiguration.getCurrentAccountName();
            requestIds = new HashSet(Arrays.asList(requestIds.getString("requestIds").split(",")));
            if (TextUtils.isEmpty(gameId))
            {
                GamesLog.e("StartPackageAct", "Missing application id");
                return;
            } else
            {
                mFragment.getGame(gameId, new AppContentFragment.GameLoadedCallback() {

                    final StartPackageAction this$0;
                    final String val$accountName;
                    final String val$gameId;
                    final String val$playerId;
                    final Set val$requestIds;

                    public final void onGameLoaded(GameFirstParty gamefirstparty)
                    {
                        gamefirstparty = (Game)gamefirstparty.getGame().freeze();
                        AppContentFragment appcontentfragment = mFragment;
                        appcontentfragment.startNewLoader(new AppContentFragment.RequestLoader(appcontentfragment, gameId, playerId, requestIds, gamefirstparty. new AppContentFragment.RequestsLoadedCallback() {

                            final _cls4 this$1;
                            final Game val$game;

                            public final void onRequestsLoaded(ArrayList arraylist)
                            {
                                UiUtils.launchGameForRequest(mContext, accountName, game, arraylist);
                            }

            
            {
                this$1 = final__pcls4;
                game = Game.this;
                super();
            }
                        }));
                    }

            
            {
                this$0 = StartPackageAction.this;
                gameId = s;
                playerId = s1;
                requestIds = set;
                accountName = s2;
                super();
            }
                });
                return;
            }

        case 3: // '\003'
            final String accountName = (GamesFragmentActivity)((Fragment) (mFragment)).mActivity;
            final String snapshotId = mAction.getExtras();
            gameId = snapshotId.getString("applicationId");
            final String playerId = ((GamesFragmentActivity) (accountName)).mConfiguration.getCurrentPlayerId();
            accountName = ((GamesFragmentActivity) (accountName)).mConfiguration.getCurrentAccountName();
            snapshotId = snapshotId.getString("snapshotId");
            if (TextUtils.isEmpty(gameId))
            {
                GamesLog.e("StartPackageAct", "Missing application id");
                return;
            } else
            {
                mFragment.getGame(gameId, new AppContentFragment.GameLoadedCallback() {

                    final StartPackageAction this$0;
                    final String val$accountName;
                    final String val$gameId;
                    final String val$playerId;
                    final String val$snapshotId;

                    public final void onGameLoaded(GameFirstParty gamefirstparty)
                    {
                        Game game = (Game)gamefirstparty.getGame().freeze();
                        gamefirstparty = gamefirstparty.getSnapshot();
                        if (gamefirstparty != null && gamefirstparty.getSnapshotId().equals(snapshotId))
                        {
                            UiUtils.launchGameForSnapshot(mContext, accountName, game, gamefirstparty);
                            return;
                        } else
                        {
                            gamefirstparty = mFragment;
                            gamefirstparty.startNewLoader(new AppContentFragment.SnapshotLoader(gamefirstparty, gameId, playerId, snapshotId, game. new AppContentFragment.SnapshotLoadedCallback() {

                                final _cls5 this$1;
                                final Game val$game;

                                public final void onSnapshotLoaded(SnapshotMetadata snapshotmetadata)
                                {
                                    UiUtils.launchGameForSnapshot(mContext, accountName, game, snapshotmetadata);
                                }

            
            {
                this$1 = final__pcls5;
                game = Game.this;
                super();
            }
                            }));
                            return;
                        }
                    }

            
            {
                this$0 = StartPackageAction.this;
                snapshotId = s;
                accountName = s1;
                gameId = s2;
                playerId = s3;
                super();
            }
                });
                return;
            }

        case 4: // '\004'
            accountName = (GamesFragmentActivity)((Fragment) (mFragment)).mActivity;
            matchId = mAction.getExtras();
            gameId = matchId.getString("applicationId");
            accountName = ((GamesFragmentActivity) (accountName)).mConfiguration.getCurrentAccountName();
            matchId = matchId.getString("matchId");
            break;
        }
        break MISSING_BLOCK_LABEL_663;
_L6:
        if (gameId.equals("FOR_INVITATION"))
        {
            byte0 = 0;
        }
          goto _L7
_L5:
        if (gameId.equals("FOR_QUEST"))
        {
            byte0 = 1;
        }
          goto _L7
_L2:
        if (gameId.equals("FOR_REQUEST"))
        {
            byte0 = 2;
        }
          goto _L7
_L3:
        if (gameId.equals("FOR_SNAPSHOT"))
        {
            byte0 = 3;
        }
          goto _L7
        if (gameId.equals("FOR_TURN_BASED_MATCH"))
        {
            byte0 = 4;
        }
          goto _L7
        if (TextUtils.isEmpty(gameId))
        {
            GamesLog.e("StartPackageAct", "Missing application id");
            return;
        } else
        {
            mFragment.getGame(gameId, new AppContentFragment.GameLoadedCallback() {

                final StartPackageAction this$0;
                final String val$accountName;
                final String val$matchId;

                public final void onGameLoaded(GameFirstParty gamefirstparty)
                {
                    gamefirstparty = (Game)gamefirstparty.getGame().freeze();
                    AppContentFragment appcontentfragment = mFragment;
                    appcontentfragment.startNewLoader(new AppContentFragment.MatchLoader(appcontentfragment, matchId, gamefirstparty. new AppContentFragment.MatchLoadedCallback() {

                        final _cls6 this$1;
                        final Game val$game;

                        public final void onMatchLoaded(TurnBasedMatch turnbasedmatch)
                        {
                            UiUtils.launchGameForTurnBasedMatch(mContext, accountName, game, turnbasedmatch);
                        }

            
            {
                this$1 = final__pcls6;
                game = Game.this;
                super();
            }
                    }));
                }

            
            {
                this$0 = StartPackageAction.this;
                matchId = s;
                accountName = s1;
                super();
            }
            });
            return;
        }
    }

    public final int getLogflowUiElementType()
    {
        String s;
        byte byte0;
        s = mAction.getExtras().getString("subAction");
        if (TextUtils.isEmpty(s))
        {
            return 1148;
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 84
    //                   -1882686247: 154
    //                   -1850567526: 168
    //                   -1672510963: 182
    //                   833335724: 140
    //                   2030228719: 126;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_182;
_L7:
        switch (byte0)
        {
        default:
            return 0;

        case 0: // '\0'
            return 1149;

        case 1: // '\001'
            return 1150;

        case 2: // '\002'
            return 1151;

        case 3: // '\003'
            return 1152;

        case 4: // '\004'
            return 1153;
        }
_L6:
        if (s.equals("FOR_INVITATION"))
        {
            byte0 = 0;
        }
          goto _L7
_L5:
        if (s.equals("FOR_QUEST"))
        {
            byte0 = 1;
        }
          goto _L7
_L2:
        if (s.equals("FOR_REQUEST"))
        {
            byte0 = 2;
        }
          goto _L7
_L3:
        if (s.equals("FOR_SNAPSHOT"))
        {
            byte0 = 3;
        }
          goto _L7
        if (s.equals("FOR_TURN_BASED_MATCH"))
        {
            byte0 = 4;
        }
          goto _L7
    }
}
