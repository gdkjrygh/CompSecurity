// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.app;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.destination.HelpContextProvider;
import com.google.android.gms.games.ui.destination.games.DestinationGameSearchActivity;
import com.google.android.gms.games.ui.destination.games.GameDetailActivity;
import com.google.android.gms.games.ui.destination.games.ShopGamesActivity;
import com.google.android.gms.games.ui.destination.leaderboards.DestinationLeaderboardScoreActivity;
import com.google.android.gms.games.ui.destination.players.AchievementComparisonListActivity;
import com.google.android.gms.games.ui.destination.players.DestinationPlayerSearchActivity;
import com.google.android.gms.games.ui.destination.players.PlayerActivity;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.GoogleHelpLauncher;
import com.google.android.gms.googlehelp.Help;

public final class PowerUpUtils
{

    private static final Uri HELP_WEBPAGE_URI;

    public static int getBrighterColor$255e745(int i)
    {
        float af[] = new float[3];
        Color.colorToHSV(i, af);
        af[2] = 1.3F * af[2];
        return Color.HSVToColor(af);
    }

    public static String getExperimentIdsForLogging()
    {
        String s;
        if (Strings.isEmptyOrWhitespace((String)G.playNowScreenExperiment.get()))
        {
            s = "None";
        } else
        {
            s = (String)G.playNowScreenExperiment.get();
        }
        return (new StringBuilder()).append(G.gamesPlayNowOrdering.get()).append("_").append(G.playNowCardType.get()).append(",").append(G.usePlayNowStream.get()).append(",").append(s).toString();
    }

    public static int getGameThemeColor(Context context, Game game)
    {
        if (game != null)
        {
            game = game.getThemeColor();
        } else
        {
            game = null;
        }
        return getGameThemeColor(context, ((String) (game)), 0x7f0b0257);
    }

    private static int getGameThemeColor(Context context, String s, int i)
    {
        if (((Boolean)G.useServerGameThemeColor.get()).booleanValue() && s != null)
        {
            return UiUtils.parseThemeColor(s, 255);
        } else
        {
            return context.getResources().getColor(0x7f0b0257);
        }
    }

    public static int getPlayGamesVersionCode(Activity activity)
    {
        int i;
        try
        {
            i = activity.getPackageManager().getPackageInfo("com.google.android.play.games", 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            GamesLog.e("PowerUpUtils", "isNewerVersion: failed to get package name when getting versionCode.");
            return 0;
        }
        return i;
    }

    public static void launchFeaturedGamesList(Context context)
    {
        Intent intent = new Intent(context, com/google/android/gms/games/ui/destination/games/ShopGamesActivity);
        intent.putExtra("com.google.android.gms.games.TAB", 0);
        context.startActivity(intent);
    }

    public static void launchGameSearch(Context context)
    {
        context.startActivity(new Intent(context, com/google/android/gms/games/ui/destination/games/DestinationGameSearchActivity));
    }

    public static void launchHelpAndFeedback(GamesFragmentActivity gamesfragmentactivity)
    {
        Object obj;
        Object obj1;
        int i;
        if (gamesfragmentactivity instanceof HelpContextProvider)
        {
            obj = ((HelpContextProvider)gamesfragmentactivity).getHelpContext();
        } else
        {
            obj = "mobile_games_default";
        }
        i = gamesfragmentactivity.getResources().getColor(0x7f0b0255);
        obj1 = gamesfragmentactivity.getGoogleApiClient();
        if (((GoogleApiClient) (obj1)).isConnected())
        {
            obj1 = new Account(Games.getCurrentAccountName(((GoogleApiClient) (obj1))), "com.google");
            obj = GoogleHelp.newInstance(((String) (obj)));
            obj.mGoogleAccount = ((Account) (obj1));
            obj1 = new ThemeSettings();
            obj1.mThemeId = 1;
            obj1.mPrimaryColor = i;
            obj.mThemeSettings = ((ThemeSettings) (obj1));
            obj1 = new com.google.android.gms.feedback.FeedbackOptions.Builder();
            obj1.mScreenshot = GoogleHelp.getScreenshot(gamesfragmentactivity);
            obj = ((GoogleHelp) (obj)).setFeedbackOptions(((com.google.android.gms.feedback.FeedbackOptions.Builder) (obj1)).build(), gamesfragmentactivity.getCacheDir());
            obj.mFallbackSupportUri = HELP_WEBPAGE_URI;
            obj = ((GoogleHelp) (obj)).buildHelpIntent();
        } else
        {
            obj = GoogleHelp.newInstance(((String) (obj)));
            Object obj2 = new ThemeSettings();
            obj2.mThemeId = 1;
            obj2.mPrimaryColor = i;
            obj.mThemeSettings = ((ThemeSettings) (obj2));
            obj2 = new com.google.android.gms.feedback.FeedbackOptions.Builder();
            obj2.mScreenshot = GoogleHelp.getScreenshot(gamesfragmentactivity);
            obj = ((GoogleHelp) (obj)).setFeedbackOptions(((com.google.android.gms.feedback.FeedbackOptions.Builder) (obj2)).build(), gamesfragmentactivity.getCacheDir());
            obj.mFallbackSupportUri = HELP_WEBPAGE_URI;
            obj = ((GoogleHelp) (obj)).buildHelpIntent();
        }
        gamesfragmentactivity = new GoogleHelpLauncher(gamesfragmentactivity);
        if (!((Intent) (obj)).getAction().equals("com.google.android.gms.googlehelp.HELP") || !((Intent) (obj)).hasExtra("EXTRA_GOOGLE_HELP"))
        {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(((GoogleHelpLauncher) (gamesfragmentactivity)).mActivity);
        if (i == 0)
        {
            Help.invokeGoogleHelpApi(((GoogleHelpLauncher) (gamesfragmentactivity)).mApiClient, new com.google.android.gms.googlehelp.GoogleHelpLauncher._cls1(gamesfragmentactivity, ((Intent) (obj))));
            return;
        } else
        {
            gamesfragmentactivity.handlePlayServicesUnavailable(i, ((Intent) (obj)));
            return;
        }
    }

    public static void launchPlayerSearch(Context context)
    {
        context.startActivity(new Intent(context, com/google/android/gms/games/ui/destination/players/DestinationPlayerSearchActivity));
    }

    public static void launchPopularGamesList(Context context)
    {
        Intent intent = new Intent(context, com/google/android/gms/games/ui/destination/games/ShopGamesActivity);
        intent.putExtra("com.google.android.gms.games.TAB", 1);
        context.startActivity(intent);
    }

    public static void launchPopularMultiplayerGamesList(Context context)
    {
        Intent intent = new Intent(context, com/google/android/gms/games/ui/destination/games/ShopGamesActivity);
        intent.putExtra("com.google.android.gms.games.TAB", 2);
        context.startActivity(intent);
    }

    public static void launchYouMayKnow(Context context)
    {
        context.startActivity((new Intent(context, com/google/android/gms/games/ui/destination/players/PlayerActivity)).putExtra("com.google.android.gms.games.ui.extras.tab", 1));
    }

    public static void launchYouMayKnowFollowing(Context context)
    {
        context.startActivity((new Intent(context, com/google/android/gms/games/ui/destination/players/PlayerActivity)).putExtra("com.google.android.gms.games.ui.extras.tab", 0));
    }

    public static void launchYouMayKnowPlayerSearch(Context context)
    {
        Intent aintent[] = new Intent[2];
        aintent[0] = (new Intent(context, com/google/android/gms/games/ui/destination/players/PlayerActivity)).putExtra("com.google.android.gms.games.ui.extras.tab", 1);
        aintent[1] = new Intent(context, com/google/android/gms/games/ui/destination/players/DestinationPlayerSearchActivity);
        if (!ContextCompat.startActivities(context, aintent, null))
        {
            context.startActivity(aintent[1]);
        }
    }

    public static void viewAchievementComparison(Context context, GameFirstParty gamefirstparty, Player player)
    {
        Intent intent = new Intent(context, com/google/android/gms/games/ui/destination/players/AchievementComparisonListActivity);
        intent.putExtra("com.google.android.gms.games.EXTENDED_GAME", (Parcelable)gamefirstparty.freeze());
        intent.putExtra("com.google.android.gms.games.OTHER_PLAYER", (Parcelable)player.freeze());
        context.startActivity(intent);
    }

    public static void viewGameDetail(Activity activity, GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition)
    {
        Intent intent = new Intent(activity, com/google/android/gms/games/ui/destination/games/GameDetailActivity);
        gamefirstparty = (GameFirstParty)gamefirstparty.freeze();
        intent.putExtra("com.google.android.gms.games.EXTENDED_GAME", gamefirstparty);
        intent.putExtra("com.google.android.gms.games.EXTRA_GAME_THEME_COLOR", getGameThemeColor(activity, gamefirstparty.getGame()));
        if (sharedelementtransition != null)
        {
            sharedelementtransition.startActivity(activity, intent);
            return;
        } else
        {
            activity.startActivity(intent);
            return;
        }
    }

    public static void viewGameDetail(Activity activity, String s, int i, String s1, SharedElementTransition sharedelementtransition)
    {
        Intent intent = new Intent(activity, com/google/android/gms/games/ui/destination/games/GameDetailActivity);
        intent.putExtra("com.google.android.gms.games.GAME_ID", s);
        if (i > 0)
        {
            intent.putExtra("com.google.android.gms.games.TAB", i);
        }
        if (s1 != null)
        {
            intent.putExtra("com.google.android.gms.games.EXTRA_GAME_THEME_COLOR", getGameThemeColor(activity, s1, 0x7f0b0257));
        }
        if (sharedelementtransition != null)
        {
            sharedelementtransition.startActivity(activity, intent);
            return;
        } else
        {
            activity.startActivity(intent);
            return;
        }
    }

    public static void viewGameDetail(Context context, Game game)
    {
        viewGameDetail(context, game, -1);
    }

    public static void viewGameDetail(Context context, Game game, int i)
    {
        game = (Game)game.freeze();
        Intent intent = new Intent(context, com/google/android/gms/games/ui/destination/games/GameDetailActivity);
        intent.putExtra("com.google.android.gms.games.GAME", game);
        intent.putExtra("com.google.android.gms.games.EXTRA_GAME_THEME_COLOR", getGameThemeColor(context, game));
        if (i > 0)
        {
            intent.putExtra("com.google.android.gms.games.TAB", i);
        }
        context.startActivity(intent);
    }

    public static void viewGameDetail(Context context, String s)
    {
        viewGameDetail(context, s, -1);
    }

    public static void viewGameDetail(Context context, String s, int i)
    {
        Intent intent = new Intent(context, com/google/android/gms/games/ui/destination/games/GameDetailActivity);
        intent.putExtra("com.google.android.gms.games.GAME_ID", s);
        if (i > 0)
        {
            intent.putExtra("com.google.android.gms.games.TAB", i);
        }
        context.startActivity(intent);
    }

    public static void viewGameDetail$2d82bf34(Activity activity, String s, SharedElementTransition sharedelementtransition)
    {
        viewGameDetail(activity, s, 12, null, sharedelementtransition);
    }

    public static void viewLeaderboard(Activity activity, String s, String s1, String s2, String s3, String s4, SharedElementTransition sharedelementtransition)
    {
        Intent intent = new Intent(activity, com/google/android/gms/games/ui/destination/leaderboards/DestinationLeaderboardScoreActivity);
        intent.putExtra("com.google.android.gms.games.GAME_ID", s);
        intent.putExtra("com.google.android.gms.games.GAME_TITLE", s1);
        intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", s2);
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", s3);
        if (s4 != null)
        {
            intent.putExtra("com.google.android.gms.games.EXTRA_GAME_THEME_COLOR", getGameThemeColor(activity, s4, 0x7f0b0257));
        }
        if (sharedelementtransition != null)
        {
            sharedelementtransition.startActivity(activity, intent);
            return;
        } else
        {
            activity.startActivity(intent);
            return;
        }
    }

    public static void viewMostRecentGameForPlayer(Activity activity, Player player, SharedElementTransition sharedelementtransition)
    {
        player = player.getMostRecentGameInfo();
        if (player == null)
        {
            return;
        } else
        {
            viewGameDetail$2d82bf34(activity, player.getGameId(), sharedelementtransition);
            return;
        }
    }

    public static void viewQuests(Context context, Game game)
    {
        Intent intent = new Intent(context, com/google/android/gms/games/ui/destination/games/GameDetailActivity);
        game = (Game)game.freeze();
        intent.putExtra("com.google.android.gms.games.GAME", game);
        intent.putExtra("com.google.android.gms.games.TAB", 13);
        intent.putExtra("com.google.android.gms.games.EXTRA_GAME_THEME_COLOR", getGameThemeColor(context, game));
        context.startActivity(intent);
    }

    static 
    {
        HELP_WEBPAGE_URI = Uri.parse((String)G.playGamesHelpWebpageUrl.get());
    }
}
