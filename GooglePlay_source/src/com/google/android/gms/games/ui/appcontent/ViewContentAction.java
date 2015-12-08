// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.destination.games.MyGamesListActivity;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, ExtendedAppContentAnnotation, AppContentUtils, AppContentFragment, 
//            ExtendedAppContentSection

public final class ViewContentAction extends ExtendedAppContentAction
{

    private com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider mLayoutSlotProvider;

    public ViewContentAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public final void execute()
    {
        Object obj;
        byte byte0;
        boolean flag;
        byte0 = -1;
        flag = false;
        obj = mAction.getExtras().getString("contentType");
        if (obj == null)
        {
            GamesLog.e("ViewContentAction", "No contentType specified.");
            return;
        }
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 6: default 96
    //                   -350797355: 207
    //                   63361342: 162
    //                   224415122: 192
    //                   376625707: 177
    //                   446888797: 237
    //                   1223210574: 222;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        int i = -1;
_L16:
        i;
        JVM INSTR tableswitch 0 5: default 140
    //                   0 252
    //                   1 622
    //                   2 759
    //                   3 955
    //                   4 1151
    //                   5 1377;
           goto _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L8:
        GamesLog.e("ViewContentAction", (new StringBuilder("Unknown content type : ")).append(((String) (obj))).toString());
        return;
_L3:
        if (!((String) (obj)).equals("GAME_DETAIL")) goto _L1; else goto _L15
_L15:
        i = 0;
          goto _L16
_L5:
        if (!((String) (obj)).equals("PLAYER_PROFILE")) goto _L1; else goto _L17
_L17:
        i = 1;
          goto _L16
_L4:
        if (!((String) (obj)).equals("PLAYERS")) goto _L1; else goto _L18
_L18:
        i = 2;
          goto _L16
_L2:
        if (!((String) (obj)).equals("EXPLORE_GAMES")) goto _L1; else goto _L19
_L19:
        i = 3;
          goto _L16
_L7:
        if (!((String) (obj)).equals("MY_GAMES")) goto _L1; else goto _L20
_L20:
        i = 4;
          goto _L16
_L6:
        if (!((String) (obj)).equals("LEADERBOARD")) goto _L1; else goto _L21
_L21:
        i = 5;
          goto _L16
_L9:
        GamesFragmentActivity gamesfragmentactivity1;
        String s5;
        Object obj4;
        gamesfragmentactivity1 = (GamesFragmentActivity)((Fragment) (mFragment)).mActivity;
        obj4 = mAction.getExtras();
        String s = ((Bundle) (obj4)).getString("subcontentType");
        obj = s;
        if (s == null)
        {
            obj = "ABOUT";
        }
        s5 = ((Bundle) (obj4)).getString("applicationId");
        if (s5 == null)
        {
            GamesLog.e("ViewContentAction", "No applicationId specified.");
            return;
        }
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 5: default 368
    //                   -1895368751: 558
    //                   62073709: 573
    //                   224415122: 543
    //                   658915108: 512
    //                   968650902: 528;
           goto _L22 _L23 _L24 _L25 _L26 _L27
_L22:
        i = -1;
_L35:
        i;
        JVM INSTR tableswitch 0 4: default 408
    //                   0 588
    //                   1 595
    //                   2 602
    //                   3 609
    //                   4 616;
           goto _L28 _L29 _L30 _L31 _L32 _L33
_L28:
        GamesLog.w("ViewContentAction", (new StringBuilder("Unknown game detail sub-content type: ")).append(((String) (obj))).toString());
        i = -1;
_L40:
        obj4 = ((Bundle) (obj4)).getString("themeColor");
        Object obj2 = AppContentUtils.getSharedElementTransition(mLayoutSlotProvider, super.mAnnotation.mLayoutSlot, getIndex());
        obj = obj2;
        if (obj2 == null)
        {
            obj = AppContentUtils.getSharedElementTransition(mLayoutSlotProvider, "BANNER", getIndex());
        }
        obj2 = obj;
        if (obj == null)
        {
            obj2 = AppContentUtils.getSharedElementTransition(mLayoutSlotProvider, "TITLE_ICON", getIndex());
        }
        PowerUpUtils.viewGameDetail(gamesfragmentactivity1, s5, i, ((String) (obj4)), ((SharedElementTransition) (obj2)));
        return;
_L26:
        if (!((String) (obj)).equals("ACHIEVEMENTS")) goto _L22; else goto _L34
_L34:
        i = ((flag) ? 1 : 0);
          goto _L35
_L27:
        if (!((String) (obj)).equals("LEADERBOARDS")) goto _L22; else goto _L36
_L36:
        i = 1;
          goto _L35
_L25:
        if (!((String) (obj)).equals("PLAYERS")) goto _L22; else goto _L37
_L37:
        i = 2;
          goto _L35
_L23:
        if (!((String) (obj)).equals("QUESTS")) goto _L22; else goto _L38
_L38:
        i = 3;
          goto _L35
_L24:
        if (!((String) (obj)).equals("ABOUT")) goto _L22; else goto _L39
_L39:
        i = 4;
          goto _L35
_L29:
        i = 10;
          goto _L40
_L30:
        i = 11;
          goto _L40
_L31:
        i = 12;
          goto _L40
_L32:
        i = 13;
          goto _L40
_L33:
        i = -1;
          goto _L40
_L10:
        obj = AppContentUtils.getSharedElementTransition(mLayoutSlotProvider, super.mAnnotation.mLayoutSlot, getIndex());
        if (obj == null)
        {
            obj = AppContentUtils.getSharedElementTransition(mLayoutSlotProvider, "AVATAR", getIndex());
        }
        GamesFragmentActivity gamesfragmentactivity = (GamesFragmentActivity)((Fragment) (mFragment)).mActivity;
        Object obj3 = mFragment.mCurrentPlayerId;
        String s4 = mAction.getExtras().getString("playerId");
        if (Objects.equal(s4, obj3))
        {
            UiUtils.viewMyProfile(gamesfragmentactivity, null, ((SharedElementTransition) (obj)));
            return;
        }
        Asserts.checkState(gamesfragmentactivity.mConfiguration.isDestinationUi());
        obj3 = new Intent("com.google.android.gms.games.destination.VIEW_PROFILE_COMPARISON");
        ((Intent) (obj3)).putExtra("com.google.android.gms.games.PLAYER_ID", s4);
        if (obj != null)
        {
            ((SharedElementTransition) (obj)).startActivity(gamesfragmentactivity, ((Intent) (obj3)));
            return;
        } else
        {
            gamesfragmentactivity.startActivity(((Intent) (obj3)));
            return;
        }
_L11:
        String s1 = mAction.getExtras().getString("subcontentType");
        obj = s1;
        if (s1 == null)
        {
            obj = "FOLLOWING";
        }
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 820
    //                   -1811010415: 893
    //                   -742456719: 874
    //                   493884694: 912;
           goto _L41 _L42 _L43 _L44
_L41:
        i = byte0;
        break; /* Loop/switch isn't completed */
_L43:
        i = byte0;
        if (((String) (obj)).equals("FOLLOWING"))
        {
            i = 0;
        }
          goto _L45
_L42:
        i = byte0;
        if (((String) (obj)).equals("GAMERS_YOU_MAY_KNOW"))
        {
            i = 1;
        }
          goto _L45
_L44:
        i = byte0;
        if (((String) (obj)).equals("GAMERS_YOU_MAY_KNOW_SEARCH"))
        {
            i = 2;
        }
_L45:
        switch (i)
        {
        default:
            GamesLog.w("ViewContentAction", (new StringBuilder("Unknown players sub-content type: ")).append(((String) (obj))).toString());
            return;

        case 0: // '\0'
            PowerUpUtils.launchYouMayKnowFollowing(getContext());
            return;

        case 1: // '\001'
            PowerUpUtils.launchYouMayKnow(getContext());
            return;

        case 2: // '\002'
            PowerUpUtils.launchYouMayKnowPlayerSearch(getContext());
            break;
        }
        return;
_L12:
        String s2 = mAction.getExtras().getString("subcontentType");
        obj = s2;
        if (s2 == null)
        {
            obj = "FEATURED";
        }
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 1016
    //                   -235404108: 1108
    //                   324042425: 1089
    //                   491967534: 1070;
           goto _L46 _L47 _L48 _L49
_L46:
        i = byte0;
        break; /* Loop/switch isn't completed */
_L49:
        i = byte0;
        if (((String) (obj)).equals("FEATURED"))
        {
            i = 0;
        }
          goto _L50
_L48:
        i = byte0;
        if (((String) (obj)).equals("POPULAR"))
        {
            i = 1;
        }
          goto _L50
_L47:
        i = byte0;
        if (((String) (obj)).equals("POPULAR_MULTIPLAYER"))
        {
            i = 2;
        }
_L50:
        switch (i)
        {
        default:
            GamesLog.w("ViewContentAction", (new StringBuilder("Unknown explore games sub-content type: ")).append(((String) (obj))).toString());
            return;

        case 0: // '\0'
            PowerUpUtils.launchFeaturedGamesList(getContext());
            return;

        case 1: // '\001'
            PowerUpUtils.launchPopularGamesList(getContext());
            return;

        case 2: // '\002'
            PowerUpUtils.launchPopularMultiplayerGamesList(getContext());
            break;
        }
        return;
_L13:
        String s3 = mAction.getExtras().getString("subcontentType");
        obj = s3;
        if (s3 == null)
        {
            obj = "RECENTLY_PLAYED";
        }
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 1212
    //                   -65303732: 1319
    //                   -35760694: 1300
    //                   1461090684: 1339;
           goto _L51 _L52 _L53 _L54
_L51:
        i = byte0;
_L59:
        i;
        JVM INSTR tableswitch 0 2: default 1244
    //                   0 1359
    //                   1 1365
    //                   2 1371;
           goto _L55 _L56 _L57 _L58
_L55:
        GamesLog.w("ViewContentAction", (new StringBuilder("Unknown my games sub-content type: ")).append(((String) (obj))).toString());
        i = 0;
_L60:
        obj = new Intent(getContext(), com/google/android/gms/games/ui/destination/games/MyGamesListActivity);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.ui.extras.tab", i);
        mFragment.startActivity(((Intent) (obj)));
        return;
_L53:
        i = byte0;
        if (((String) (obj)).equals("RECENTLY_PLAYED"))
        {
            i = 0;
        }
          goto _L59
_L52:
        i = byte0;
        if (((String) (obj)).equals("ALL_MY_GAMES"))
        {
            i = 1;
        }
          goto _L59
_L54:
        i = byte0;
        if (((String) (obj)).equals("INSTALLED_GAMES"))
        {
            i = 2;
        }
          goto _L59
_L56:
        i = 0;
          goto _L60
_L57:
        i = 1;
          goto _L60
_L58:
        i = 2;
          goto _L60
_L14:
        final GamesFragmentActivity activity = (GamesFragmentActivity)((Fragment) (mFragment)).mActivity;
        Object obj1 = mAction.getExtras();
        final String appId = ((Bundle) (obj1)).getString("applicationId");
        if (appId == null)
        {
            GamesLog.e("ViewContentAction", "No applicationId specified.");
            return;
        }
        final String leaderboardId = ((Bundle) (obj1)).getString("leaderboardId");
        if (leaderboardId == null)
        {
            GamesLog.e("ViewContentAction", "No leaderboardId specified.");
            return;
        }
        final String themeColor = ((Bundle) (obj1)).getString("themeColor");
        final SharedElementTransition finalTransition = AppContentUtils.getSharedElementTransition(mLayoutSlotProvider, super.mAnnotation.mLayoutSlot, getIndex());
        obj1 = finalTransition;
        if (finalTransition == null)
        {
            obj1 = AppContentUtils.getSharedElementTransition(mLayoutSlotProvider, "BANNER", getIndex());
        }
        finalTransition = ((SharedElementTransition) (obj1));
        if (obj1 == null)
        {
            finalTransition = AppContentUtils.getSharedElementTransition(mLayoutSlotProvider, "TITLE_ICON", getIndex());
        }
        mFragment.getGame(appId, new AppContentFragment.GameLoadedCallback() {

            final ViewContentAction this$0;
            final GamesFragmentActivity val$activity;
            final String val$appId;
            final SharedElementTransition val$finalTransition;
            final String val$leaderboardId;
            final String val$themeColor;

            public final void onGameLoaded(GameFirstParty gamefirstparty)
            {
                String s6 = gamefirstparty.getGame().getInstancePackageName();
                gamefirstparty = gamefirstparty.getGame().getDisplayName();
                PowerUpUtils.viewLeaderboard(activity, appId, gamefirstparty, s6, leaderboardId, themeColor, finalTransition);
            }

            
            {
                this$0 = ViewContentAction.this;
                activity = gamesfragmentactivity;
                appId = s;
                leaderboardId = s1;
                themeColor = s2;
                finalTransition = sharedelementtransition;
                super();
            }
        });
        return;
          goto _L35
    }

    public final int getLogflowUiElementType()
    {
        String s;
        Bundle bundle;
        boolean flag;
        byte byte1;
        byte1 = -1;
        flag = false;
        bundle = mAction.getExtras();
        s = bundle.getString("contentType");
        if (TextUtils.isEmpty(s))
        {
            GamesLog.e("ViewContentAction", "No contentType specified.");
            return 0;
        }
        s.hashCode();
        JVM INSTR lookupswitch 6: default 100
    //                   -350797355: 305
    //                   63361342: 260
    //                   224415122: 290
    //                   376625707: 275
    //                   446888797: 335
    //                   1223210574: 320;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        byte byte0 = -1;
_L27:
        byte0;
        JVM INSTR tableswitch 0 5: default 144
    //                   0 146
    //                   1 256
    //                   2 465
    //                   3 552
    //                   4 640
    //                   5 728;
           goto _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L8:
        return 0;
_L9:
        String s1 = bundle.getString("subcontentType");
        s = s1;
        if (s1 == null)
        {
            s = "ABOUT";
        }
        s.hashCode();
        JVM INSTR lookupswitch 5: default 216
    //                   -1895368751: 426
    //                   62073709: 350
    //                   224415122: 407
    //                   658915108: 369
    //                   968650902: 388;
           goto _L15 _L16 _L17 _L18 _L19 _L20
_L15:
        byte0 = byte1;
_L33:
        byte0;
        JVM INSTR tableswitch 0 4: default 256
    //                   0 445
    //                   1 449
    //                   2 453
    //                   3 457
    //                   4 461;
           goto _L10 _L21 _L22 _L23 _L24 _L25
_L10:
        return 1105;
_L3:
        if (!s.equals("GAME_DETAIL")) goto _L1; else goto _L26
_L26:
        byte0 = 0;
          goto _L27
_L5:
        if (!s.equals("PLAYER_PROFILE")) goto _L1; else goto _L28
_L28:
        byte0 = 1;
          goto _L27
_L4:
        if (!s.equals("PLAYERS")) goto _L1; else goto _L29
_L29:
        byte0 = 2;
          goto _L27
_L2:
        if (!s.equals("EXPLORE_GAMES")) goto _L1; else goto _L30
_L30:
        byte0 = 3;
          goto _L27
_L7:
        if (!s.equals("MY_GAMES")) goto _L1; else goto _L31
_L31:
        byte0 = 4;
          goto _L27
_L6:
        if (!s.equals("LEADERBOARD")) goto _L1; else goto _L32
_L32:
        byte0 = 5;
          goto _L27
_L17:
        byte0 = byte1;
        if (s.equals("ABOUT"))
        {
            byte0 = 0;
        }
          goto _L33
_L19:
        byte0 = byte1;
        if (s.equals("ACHIEVEMENTS"))
        {
            byte0 = 1;
        }
          goto _L33
_L20:
        byte0 = byte1;
        if (s.equals("LEADERBOARDS"))
        {
            byte0 = 2;
        }
          goto _L33
_L18:
        byte0 = byte1;
        if (s.equals("PLAYERS"))
        {
            byte0 = 3;
        }
          goto _L33
_L16:
        byte0 = byte1;
        if (s.equals("QUESTS"))
        {
            byte0 = 4;
        }
          goto _L33
_L21:
        return 1100;
_L22:
        return 1102;
_L23:
        return 1101;
_L24:
        return 1104;
_L25:
        return 1103;
_L11:
        String s2 = bundle.getString("subcontentType");
        s = s2;
        if (s2 == null)
        {
            s = "FOLLOWING";
        }
        s.hashCode();
        JVM INSTR lookupswitch 3: default 520
    //                   -1811010415: 747
    //                   -742456719: 732
    //                   493884694: 762;
           goto _L34 _L35 _L36 _L37
_L34:
        byte0 = -1;
_L56:
        byte0;
        JVM INSTR tableswitch 0 2: default 552
    //                   0 777
    //                   1 781
    //                   2 785;
           goto _L12 _L38 _L39 _L40
_L12:
        String s3 = bundle.getString("subcontentType");
        s = s3;
        if (s3 == null)
        {
            s = "FEATURED";
        }
        s.hashCode();
        JVM INSTR lookupswitch 3: default 608
    //                   -235404108: 819
    //                   324042425: 804
    //                   491967534: 789;
           goto _L41 _L42 _L43 _L44
_L41:
        byte0 = -1;
_L60:
        byte0;
        JVM INSTR tableswitch 0 2: default 640
    //                   0 834
    //                   1 838
    //                   2 842;
           goto _L13 _L45 _L46 _L47
_L13:
        String s4 = bundle.getString("subcontentType");
        s = s4;
        if (s4 == null)
        {
            s = "RECENTLY_PLAYED";
        }
        s.hashCode();
        JVM INSTR lookupswitch 3: default 696
    //                   -65303732: 862
    //                   -35760694: 846
    //                   1461090684: 878;
           goto _L48 _L49 _L50 _L51
_L48:
        byte0 = -1;
_L64:
        byte0;
        JVM INSTR tableswitch 0 2: default 728
    //                   0 894
    //                   1 898
    //                   2 902;
           goto _L14 _L52 _L53 _L54
_L14:
        return 1101;
_L36:
        if (!s.equals("FOLLOWING")) goto _L34; else goto _L55
_L55:
        byte0 = 0;
          goto _L56
_L35:
        if (!s.equals("GAMERS_YOU_MAY_KNOW")) goto _L34; else goto _L57
_L57:
        byte0 = 1;
          goto _L56
_L37:
        if (!s.equals("GAMERS_YOU_MAY_KNOW_SEARCH")) goto _L34; else goto _L58
_L58:
        byte0 = 2;
          goto _L56
_L38:
        return 1106;
_L39:
        return 1107;
_L40:
        return 1108;
_L44:
        if (!s.equals("FEATURED")) goto _L41; else goto _L59
_L59:
        byte0 = 0;
          goto _L60
_L43:
        if (!s.equals("POPULAR")) goto _L41; else goto _L61
_L61:
        byte0 = 1;
          goto _L60
_L42:
        if (!s.equals("POPULAR_MULTIPLAYER")) goto _L41; else goto _L62
_L62:
        byte0 = 2;
          goto _L60
_L45:
        return 1109;
_L46:
        return 1110;
_L47:
        return 1111;
_L50:
        if (!s.equals("RECENTLY_PLAYED")) goto _L48; else goto _L63
_L63:
        byte0 = flag;
          goto _L64
_L49:
        if (!s.equals("ALL_MY_GAMES")) goto _L48; else goto _L65
_L65:
        byte0 = 1;
          goto _L64
_L51:
        if (!s.equals("INSTALLED_GAMES")) goto _L48; else goto _L66
_L66:
        byte0 = 2;
          goto _L64
_L52:
        return 1112;
_L53:
        return 1113;
_L54:
        return 1114;
          goto _L27
    }

    public final void onBindToLayoutSlotProvider(com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider)
    {
        mLayoutSlotProvider = layoutslotprovider;
    }
}
