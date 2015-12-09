// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.game.GameBadge;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;
import com.google.android.gms.games.ui.util.LoadingDataViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity, GameDetailAboutFragment

final class this._cls0
    implements com.google.android.gms.games.ui.util.StateManager
{

    GameFirstParty mCurrentExtendedGame;
    private boolean mCurrentGameRequestSent;
    PlayerBuffer mFriendsBuffer;
    private boolean mFriendsRequestSent;
    int mFriendsStatusCode;
    boolean mIsInstalled;
    final GameDetailActivity this$0;

    private boolean shouldLoadFriends()
    {
        return mIsPlusEnabled && mCurrentExtendedGame != null && mCurrentExtendedGame.getGame().isPlayEnabledGame();
    }

    final void makeNextRequest()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            finish();
            return;
        }
        if ((mCurrentExtendedGame == null || GameDetailActivity.access$3200(GameDetailActivity.this) == null) && !mCurrentGameRequestSent)
        {
            GameDetailActivity.access$3600(GameDetailActivity.this).setViewState(1);
            PlayGames.GamesMetadata.loadGame(googleapiclient, GameDetailActivity.access$3700(GameDetailActivity.this)).setResultCallback(new ResultCallback() {

                final GameDetailActivity.GameDetailStateManager this$1;

                public final volatile void onResult(Result result)
                {
                    Object obj;
                    int i;
                    obj = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result;
                    result = GameDetailActivity.GameDetailStateManager.this;
                    i = ((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult) (obj)).getStatus().mStatusCode;
                    obj = ((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult) (obj)).getGames();
                    boolean flag = ((GameDetailActivity.GameDetailStateManager) (result)).this$0.isFinishing();
                    if (flag)
                    {
                        ((GameFirstPartyBuffer) (obj)).release();
                        return;
                    }
                    result.mCurrentExtendedGame = null;
                    if (((GameFirstPartyBuffer) (obj)).getCount() > 0)
                    {
                        result.mCurrentExtendedGame = (GameFirstParty)((GameFirstParty)((GameFirstPartyBuffer) (obj)).get(0)).freeze();
                        GameDetailActivity.access$3202(((GameDetailActivity.GameDetailStateManager) (result)).this$0, ((GameDetailActivity.GameDetailStateManager) (result)).mCurrentExtendedGame.getGame());
                    }
                    ((GameFirstPartyBuffer) (obj)).release();
                    if (((GameDetailActivity.GameDetailStateManager) (result)).mCurrentExtendedGame == null)
                    {
                        if (GameDetailActivity.access$3200(((GameDetailActivity.GameDetailStateManager) (result)).this$0) != null)
                        {
                            GamesLog.w(GameDetailActivity.access$3100(), (new StringBuilder("onDataBufferLoaded: couldn't load gameId ")).append(GameDetailActivity.access$3200(((GameDetailActivity.GameDetailStateManager) (result)).this$0).getApplicationId()).toString());
                        }
                        obj = GameDetailActivity.access$3600(((GameDetailActivity.GameDetailStateManager) (result)).this$0);
                        if (UiUtils.isNetworkError(i))
                        {
                            i = 5;
                        } else
                        {
                            i = 6;
                        }
                        ((LoadingDataViewManager) (obj)).setViewState(i);
                        GameDetailActivity.access$3800(((GameDetailActivity.GameDetailStateManager) (result)).this$0).logEvents(new int[] {
                            7
                        });
                        return;
                    } else
                    {
                        GameDetailActivity.access$3202(((GameDetailActivity.GameDetailStateManager) (result)).this$0, ((GameDetailActivity.GameDetailStateManager) (result)).mCurrentExtendedGame.getGame());
                        result.mIsInstalled = GameDetailActivity.access$3200(((GameDetailActivity.GameDetailStateManager) (result)).this$0).isInstanceInstalled();
                        GameDetailActivity.access$3902$1b0751c8(((GameDetailActivity.GameDetailStateManager) (result)).this$0);
                        ((GameDetailActivity.GameDetailStateManager) (result)).this$0.updateTaskDescription(GameDetailActivity.access$3200(((GameDetailActivity.GameDetailStateManager) (result)).this$0).getDisplayName());
                        GameDetailActivity.access$3302(((GameDetailActivity.GameDetailStateManager) (result)).this$0, GameDetailActivity.access$3200(((GameDetailActivity.GameDetailStateManager) (result)).this$0).isMuted());
                        result.makeNextRequest();
                        return;
                    }
                    result;
                    ((GameFirstPartyBuffer) (obj)).release();
                    throw result;
                }

            
            {
                this$1 = GameDetailActivity.GameDetailStateManager.this;
                super();
            }
            });
            mCurrentGameRequestSent = true;
            GameDetailActivity.access$3800(GameDetailActivity.this).logEvents(new int[] {
                2
            });
        }
        if (shouldLoadFriends() && mFriendsBuffer == null && !mFriendsRequestSent)
        {
            GameDetailActivity.access$3600(GameDetailActivity.this).setViewState(1);
            Games.Players.loadPlayersFirstParty(googleapiclient, "circled", GameDetailActivity.access$3700(GameDetailActivity.this), 15, false).setResultCallback(new ResultCallback() {

                final GameDetailActivity.GameDetailStateManager this$1;

                public final volatile void onResult(Result result)
                {
                    result = (com.google.android.gms.games.Players.LoadPlayersResult)result;
                    GameDetailActivity.GameDetailStateManager gamedetailstatemanager = GameDetailActivity.GameDetailStateManager.this;
                    gamedetailstatemanager.mFriendsStatusCode = result.getStatus().mStatusCode;
                    gamedetailstatemanager.mFriendsBuffer = result.getPlayers();
                    if (!gamedetailstatemanager.this$0.isFinishing())
                    {
                        gamedetailstatemanager.makeNextRequest();
                    }
                }

            
            {
                this$1 = GameDetailActivity.GameDetailStateManager.this;
                super();
            }
            });
            mFriendsRequestSent = true;
            GameDetailActivity.access$3800(GameDetailActivity.this).logEvents(new int[] {
                2
            });
        }
        populateViews();
    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        GameDetailActivity.access$3800(GameDetailActivity.this).onConnected(googleapiclient);
        GameDetailActivity.access$3800(GameDetailActivity.this).ensureStarted(new int[] {
            3, 4, 2
        });
        makeNextRequest();
    }

    final void populateViews()
    {
        int i;
        int k;
        byte byte0;
        int l;
        boolean flag;
        boolean flag1;
        int i1;
        int j1;
        byte byte1;
        byte byte2;
        int k1;
        GameDetailActivity.access$4000(GameDetailActivity.this);
        GameDetailActivity.access$4100(GameDetailActivity.this);
        GameDetailActivity.access$4200(GameDetailActivity.this).mNotifyOnChange = false;
        l = 0;
        byte0 = 0;
        flag = false;
        i = 0;
        j1 = 0;
        byte1 = 0;
        flag1 = false;
        k = 0;
        i1 = byte1;
        if (mCurrentExtendedGame != null)
        {
            ArrayList arraylist = mCurrentExtendedGame.getBadges();
            l = 0;
            i1 = arraylist.size();
            while (l < i1) 
            {
                GameBadge gamebadge = (GameBadge)arraylist.get(l);
                if (gamebadge.getType() == 3)
                {
                    flag = true;
                    flag1 = i;
                } else
                if (gamebadge.getType() == 2)
                {
                    flag1 = true;
                    flag = byte0;
                } else
                {
                    flag = byte0;
                    flag1 = i;
                    if (gamebadge.getType() == 8)
                    {
                        k = 1;
                        flag = byte0;
                        flag1 = i;
                    }
                }
                l++;
                byte0 = flag;
                i = ((flag1) ? 1 : 0);
            }
            l = byte0;
            flag = i;
            flag1 = k;
            i1 = byte1;
            if (mCurrentExtendedGame.getSnapshot() != null)
            {
                i1 = 1;
                flag1 = k;
                flag = i;
                l = byte0;
            }
        }
        k = j1;
        if (mFriendsBuffer != null)
        {
            k = j1;
            if (mFriendsBuffer.getCount() > 0)
            {
                k = 1;
            }
        }
        int l2;
        if (mCurrentExtendedGame == null)
        {
            i = 0;
        } else
        if (shouldLoadFriends() && mFriendsBuffer == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        GameDetailActivity.access$3600(GameDetailActivity.this).setViewState(2);
        GameDetailActivity.access$3800(GameDetailActivity.this).logEvents(new int[] {
            8
        });
        GameDetailActivity.access$4400(GameDetailActivity.this).addFragment(GameDetailActivity.access$4300());
        if (mCurrentExtendedGame.getAchievementUnlockedCount() > 0 || GameDetailActivity.access$3200(GameDetailActivity.this).getAchievementTotalCount() > 0 && l != 0 || GameDetailActivity.access$5600(GameDetailActivity.this) == 10)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            GameDetailActivity.access$4600(GameDetailActivity.this).addFragment(GameDetailActivity.access$4500());
        }
        if (GameDetailActivity.access$3200(GameDetailActivity.this).getLeaderboardCount() > 0 && flag || GameDetailActivity.access$5600(GameDetailActivity.this) == 11)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            GameDetailActivity.access$4800(GameDetailActivity.this).addFragment(GameDetailActivity.access$4700());
        }
        if (GameDetailActivity.access$3200(GameDetailActivity.this).isPlayEnabledGame() || GameDetailActivity.access$5600(GameDetailActivity.this) == 12)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            GameDetailActivity.access$5000(GameDetailActivity.this).addFragment(GameDetailActivity.access$4900());
        }
        if (GameDetailActivity.access$3200(GameDetailActivity.this).isPlayEnabledGame() && flag1 || GameDetailActivity.access$5600(GameDetailActivity.this) == 13)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            GameDetailActivity.access$5200(GameDetailActivity.this).addFragment(GameDetailActivity.access$5100());
        }
        if (GameDetailActivity.access$5300(GameDetailActivity.this) != -1) goto _L4; else goto _L3
_L3:
        k1 = -1;
        byte2 = -1;
        byte0 = -1;
        byte1 = -1;
        j1 = -1;
        i = 0;
        l2 = GameDetailActivity.access$5400(GameDetailActivity.this).getCount();
        while (i < l2) 
        {
            com.google.android.gms.games.ui.util.TabSpec tabspec = GameDetailActivity.access$5500(GameDetailActivity.this).getTabSpecAt(i);
            int l1;
            int i2;
            int j2;
            int k2;
            if (tabspec == GameDetailActivity.access$4300())
            {
                l1 = i;
                k2 = byte0;
                j2 = byte1;
                i2 = byte2;
            } else
            if (tabspec == GameDetailActivity.access$4500())
            {
                i2 = i;
                l1 = k1;
                j2 = byte1;
                k2 = byte0;
            } else
            if (tabspec == GameDetailActivity.access$4700())
            {
                k2 = i;
                l1 = k1;
                i2 = byte2;
                j2 = byte1;
            } else
            if (tabspec == GameDetailActivity.access$4900())
            {
                j2 = i;
                l1 = k1;
                i2 = byte2;
                k2 = byte0;
            } else
            {
                l1 = k1;
                i2 = byte2;
                j2 = byte1;
                k2 = byte0;
                if (tabspec == GameDetailActivity.access$5100())
                {
                    j1 = i;
                    l1 = k1;
                    i2 = byte2;
                    j2 = byte1;
                    k2 = byte0;
                }
            }
            i++;
            k1 = l1;
            byte2 = i2;
            byte1 = j2;
            byte0 = k2;
        }
        GameDetailActivity.access$5600(GameDetailActivity.this);
        JVM INSTR tableswitch 10 13: default 816
    //                   10 984
    //                   11 997
    //                   12 1010
    //                   13 1023;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_1023;
_L5:
        boolean flag2;
        ArrayList arraylist1;
        Object obj;
        int j;
        if (k1 >= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Asserts.checkState(flag2);
        GameDetailActivity.access$5302(GameDetailActivity.this, k1);
        if (!mIsInstalled)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k1 >= 0 && i1 != 0)
        {
            GameDetailActivity.access$5302(GameDetailActivity.this, k1);
        } else
        if (byte1 >= 0 && k != 0)
        {
            GameDetailActivity.access$5302(GameDetailActivity.this, byte1);
        } else
        if (j1 >= 0 && flag1)
        {
            GameDetailActivity.access$5302(GameDetailActivity.this, j1);
        } else
        if (byte2 >= 0 && l != 0)
        {
            GameDetailActivity.access$5302(GameDetailActivity.this, byte2);
        } else
        if (byte0 >= 0 && flag)
        {
            GameDetailActivity.access$5302(GameDetailActivity.this, byte0);
        }
_L4:
        if (GameDetailActivity.access$5300(GameDetailActivity.this) != -1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Asserts.checkState(flag2);
        GameDetailActivity.access$5700(GameDetailActivity.this).notifyDataSetChanged();
        GameDetailActivity.access$5800$45e9ef2f(GameDetailActivity.this, GameDetailActivity.access$5300(GameDetailActivity.this));
_L2:
        arraylist1 = GameDetailActivity.access$5900(GameDetailActivity.this);
        j = 0;
        for (k = arraylist1.size(); j < k; j++)
        {
            obj = (Fragment)arraylist1.get(j);
            if (!((Fragment) (obj)).mDetached && (obj instanceof GameDetailAboutFragment))
            {
                obj = (GameDetailAboutFragment)obj;
                obj.mGame = ((GameDetailAboutFragment) (obj)).mParent.mCurrentGame;
                ((GameDetailAboutFragment) (obj)).mAdapter.notifySingleItemChanged();
            }
        }

        break MISSING_BLOCK_LABEL_1140;
_L6:
        GameDetailActivity.access$5302(GameDetailActivity.this, byte2);
          goto _L4
_L7:
        GameDetailActivity.access$5302(GameDetailActivity.this, byte0);
          goto _L4
_L8:
        GameDetailActivity.access$5302(GameDetailActivity.this, byte1);
          goto _L4
        GameDetailActivity.access$5302(GameDetailActivity.this, j1);
          goto _L4
    }

    _cls2.this._cls1()
    {
        this$0 = GameDetailActivity.this;
        super();
    }
}
