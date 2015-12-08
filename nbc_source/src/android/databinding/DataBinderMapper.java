// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import air.com.nbcuni.com.nbcsports.liveextra.databinding.PlPlayerItemInGameBinding;
import air.com.nbcuni.com.nbcsports.liveextra.databinding.PlPlayerItemInGameGkBinding;
import air.com.nbcuni.com.nbcsports.liveextra.databinding.PlPlayerItemSeasonBinding;
import air.com.nbcuni.com.nbcsports.liveextra.databinding.PlPlayerItemSeasonGkBinding;
import android.view.View;
import com.nbcsports.liveextra.databinding.pl.EventItemBindingSw600dpImpl;
import com.nbcsports.liveextra.databinding.pl.EventItemBindingSw720dpImpl;
import com.nbcsports.liveextra.databinding.pl.GoalEventItemBindingSw600dpImpl;
import com.nbcsports.liveextra.databinding.pl.GoalEventItemBindingSw720dpImpl;
import com.nbcsports.liveextra.databinding.pl.HighLevelStatsBindingImpl;
import com.nbcsports.liveextra.databinding.pl.HighLevelStatsBindingSw600dpImpl;
import com.nbcsports.liveextra.databinding.pl.HighLevelStatsBindingSw720dpImpl;
import com.nbcsports.liveextra.databinding.pl.PlayItemBindingImpl;
import com.nbcsports.liveextra.databinding.pl.PlayItemBindingSw720dpImpl;
import com.nbcsports.liveextra.databinding.pl.PlayerCardBindingImpl;
import com.nbcsports.liveextra.databinding.pl.PlayerCardBindingSw600dpImpl;
import com.nbcsports.liveextra.databinding.pl.PlayerCardBindingSw720dpImpl;
import com.nbcsports.liveextra.databinding.pl.PlayerCardItemBinding;
import com.nbcsports.liveextra.databinding.pl.RedCardEventItemBindingSw600dpImpl;
import com.nbcsports.liveextra.databinding.pl.RedCardEventItemBindingSw720dpImpl;
import com.nbcsports.liveextra.databinding.pl.StatBinding;
import com.nbcsports.liveextra.databinding.pl.SubstitutionEventItemBindingSw600dpImpl;
import com.nbcsports.liveextra.databinding.pl.SubstitutionEventItemBindingSw720dpImpl;
import com.nbcsports.liveextra.databinding.pl.YellowCardEventItemBindingSw600dpImpl;
import com.nbcsports.liveextra.databinding.pl.YellowCardEventItemBindingSw720dpImpl;

// Referenced classes of package android.databinding:
//            ViewDataBinding

class DataBinderMapper
{
    private static class InnerBrLookup
    {

        static String sKeys[] = {
            "_all", "awayAbbr", "awayColor", "awayFormation", "awayPlayers", "ballLocations", "binder", "country", "dateOfBirth", "detail", 
            "firstName", "handler", "handlers", "height", "homeAbbr", "homeColor", "homeFormation", "homePlayers", "isGoalkeeper", "isHomeTeam", 
            "isSeekEnabled", "isStart", "jersey", "lastName", "playerId", "position", "redCard", "season", "stat", "stats", 
            "statsList", "teamAbbr", "teamColor", "teamIcon", "teamId", "time", "viewModel", "weight", "yellowCard"
        };


        private InnerBrLookup()
        {
        }
    }


    static final int TARGET_MIN_SDK = 14;

    public DataBinderMapper()
    {
    }

    String convertBrIdToString(int i)
    {
        if (i < 0 || i >= InnerBrLookup.sKeys.length)
        {
            return null;
        } else
        {
            return InnerBrLookup.sKeys[i];
        }
    }

    public ViewDataBinding getDataBinder(View view, int i)
    {
        switch (i)
        {
        case 2130968688: 
        case 2130968689: 
        case 2130968693: 
        case 2130968697: 
        case 2130968698: 
        case 2130968699: 
        case 2130968700: 
        case 2130968701: 
        case 2130968702: 
        case 2130968709: 
        case 2130968710: 
        case 2130968711: 
        case 2130968712: 
        case 2130968713: 
        default:
            return null;

        case 2130968696: 
            Object obj = view.getTag();
            if (obj == null)
            {
                throw new RuntimeException("view must have a tag");
            }
            if ("layout-sw720dp/pl_event_yc_item_view_0".equals(obj))
            {
                return new YellowCardEventItemBindingSw720dpImpl(view);
            }
            if ("layout-sw600dp/pl_event_yc_item_view_0".equals(obj))
            {
                return new YellowCardEventItemBindingSw600dpImpl(view);
            }
            // fall through

        case 2130968691: 
            Object obj1 = view.getTag();
            if (obj1 == null)
            {
                throw new RuntimeException("view must have a tag");
            }
            if ("layout-sw600dp/pl_event_goal_item_view_0".equals(obj1))
            {
                return new GoalEventItemBindingSw600dpImpl(view);
            }
            if ("layout-sw720dp/pl_event_goal_item_view_0".equals(obj1))
            {
                return new GoalEventItemBindingSw720dpImpl(view);
            }
            // fall through

        case 2130968705: 
            return PlPlayerItemInGameGkBinding.bind(view);

        case 2130968694: 
            Object obj2 = view.getTag();
            if (obj2 == null)
            {
                throw new RuntimeException("view must have a tag");
            }
            if ("layout-sw600dp/pl_event_rc_item_view_0".equals(obj2))
            {
                return new RedCardEventItemBindingSw600dpImpl(view);
            }
            if ("layout-sw720dp/pl_event_rc_item_view_0".equals(obj2))
            {
                return new RedCardEventItemBindingSw720dpImpl(view);
            }
            // fall through

        case 2130968703: 
            Object obj3 = view.getTag();
            if (obj3 == null)
            {
                throw new RuntimeException("view must have a tag");
            }
            if ("layout-sw720dp/pl_play_item_view_0".equals(obj3))
            {
                return new PlayItemBindingSw720dpImpl(view);
            }
            if ("layout/pl_play_item_view_0".equals(obj3))
            {
                return new PlayItemBindingImpl(view);
            }
            // fall through

        case 2130968707: 
            return PlPlayerItemSeasonGkBinding.bind(view);

        case 2130968704: 
            return PlPlayerItemInGameBinding.bind(view);

        case 2130968706: 
            return PlPlayerItemSeasonBinding.bind(view);

        case 2130968690: 
            Object obj4 = view.getTag();
            if (obj4 == null)
            {
                throw new RuntimeException("view must have a tag");
            }
            if ("layout/pl_blade_stats_0".equals(obj4))
            {
                return new HighLevelStatsBindingImpl(view);
            }
            if ("layout-sw720dp/pl_blade_stats_0".equals(obj4))
            {
                return new HighLevelStatsBindingSw720dpImpl(view);
            }
            if ("layout-sw600dp/pl_blade_stats_0".equals(obj4))
            {
                return new HighLevelStatsBindingSw600dpImpl(view);
            }
            // fall through

        case 2130968687: 
            Object obj5 = view.getTag();
            if (obj5 == null)
            {
                throw new RuntimeException("view must have a tag");
            }
            if ("layout/pl_blade_player_card_0".equals(obj5))
            {
                return new PlayerCardBindingImpl(view);
            }
            if ("layout-sw720dp/pl_blade_player_card_0".equals(obj5))
            {
                return new PlayerCardBindingSw720dpImpl(view);
            }
            if ("layout-sw600dp/pl_blade_player_card_0".equals(obj5))
            {
                return new PlayerCardBindingSw600dpImpl(view);
            }
            // fall through

        case 2130968692: 
            Object obj6 = view.getTag();
            if (obj6 == null)
            {
                throw new RuntimeException("view must have a tag");
            }
            if ("layout-sw600dp/pl_event_item_view_0".equals(obj6))
            {
                return new EventItemBindingSw600dpImpl(view);
            }
            if ("layout-sw720dp/pl_event_item_view_0".equals(obj6))
            {
                return new EventItemBindingSw720dpImpl(view);
            }
            // fall through

        case 2130968708: 
            return PlayerCardItemBinding.bind(view);

        case 2130968695: 
            Object obj7 = view.getTag();
            if (obj7 == null)
            {
                throw new RuntimeException("view must have a tag");
            }
            if ("layout-sw600dp/pl_event_sub_item_view_0".equals(obj7))
            {
                return new SubstitutionEventItemBindingSw600dpImpl(view);
            }
            if ("layout-sw720dp/pl_event_sub_item_view_0".equals(obj7))
            {
                return new SubstitutionEventItemBindingSw720dpImpl(view);
            }
            // fall through

        case 2130968714: 
            return StatBinding.bind(view);
        }
    }

    ViewDataBinding getDataBinder(View aview[], int i)
    {
        return null;
    }

    int getLayoutId(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        s.hashCode();
        JVM INSTR lookupswitch 24: default 212
    //                   -2044381691: 214
    //                   -2032513144: 286
    //                   -2002167927: 418
    //                   -1950181270: 250
    //                   -1848884537: 298
    //                   -1616012958: 454
    //                   -1614718364: 490
    //                   -1576749079: 262
    //                   -1373669744: 478
    //                   -1276456223: 238
    //                   -1254756934: 382
    //                   -1092827616: 226
    //                   -809895058: 430
    //                   -638326641: 442
    //                   -431021964: 274
    //                   -333676438: 406
    //                   -237585749: 358
    //                   289336250: 394
    //                   308220849: 334
    //                   508951205: 322
    //                   1424855899: 370
    //                   1483525920: 346
    //                   1523778031: 466
    //                   1719340213: 310;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L10:
        continue; /* Loop/switch isn't completed */
_L3:
        return 0;
_L4:
        if (!s.equals("layout-sw720dp/pl_play_item_view_0")) goto _L1; else goto _L28
_L28:
        return 0x7f04007f;
_L15:
        if (!s.equals("layout-sw720dp/pl_event_yc_item_view_0")) goto _L1; else goto _L29
_L29:
        return 0x7f040078;
_L13:
        if (!s.equals("layout-sw600dp/pl_event_yc_item_view_0")) goto _L1; else goto _L30
_L30:
        return 0x7f040078;
_L7:
        if (!s.equals("layout-sw600dp/pl_event_goal_item_view_0")) goto _L1; else goto _L31
_L31:
        return 0x7f040073;
_L11:
        if (!s.equals("layout-sw720dp/pl_event_goal_item_view_0")) goto _L1; else goto _L32
_L32:
        return 0x7f040073;
_L18:
        if (!s.equals("layout/pl_player_item_in_game_gk_0")) goto _L1; else goto _L33
_L33:
        return 0x7f040081;
_L5:
        if (!s.equals("layout-sw600dp/pl_event_rc_item_view_0")) goto _L1; else goto _L34
_L34:
        return 0x7f040076;
_L8:
        if (!s.equals("layout-sw720dp/pl_event_rc_item_view_0")) goto _L1; else goto _L35
_L35:
        return 0x7f040076;
_L27:
        if (!s.equals("layout/pl_play_item_view_0")) goto _L1; else goto _L36
_L36:
        return 0x7f04007f;
_L23:
        if (!s.equals("layout/pl_player_item_season_gk_0")) goto _L1; else goto _L37
_L37:
        return 0x7f040083;
_L22:
        if (!s.equals("layout/pl_player_item_in_game_0")) goto _L1; else goto _L38
_L38:
        return 0x7f040080;
_L25:
        if (!s.equals("layout/pl_player_item_season_0")) goto _L1; else goto _L39
_L39:
        return 0x7f040082;
_L20:
        if (!s.equals("layout/pl_blade_stats_0")) goto _L1; else goto _L40
_L40:
        return 0x7f040072;
_L24:
        if (!s.equals("layout-sw720dp/pl_blade_stats_0")) goto _L1; else goto _L41
_L41:
        return 0x7f040072;
_L14:
        if (!s.equals("layout-sw600dp/pl_blade_stats_0")) goto _L1; else goto _L42
_L42:
        return 0x7f040072;
_L21:
        if (!s.equals("layout/pl_blade_player_card_0")) goto _L1; else goto _L43
_L43:
        return 0x7f04006f;
_L19:
        if (!s.equals("layout-sw720dp/pl_blade_player_card_0")) goto _L1; else goto _L44
_L44:
        return 0x7f04006f;
_L6:
        if (!s.equals("layout-sw600dp/pl_blade_player_card_0")) goto _L1; else goto _L45
_L45:
        return 0x7f04006f;
_L16:
        if (!s.equals("layout-sw600dp/pl_event_item_view_0")) goto _L1; else goto _L46
_L46:
        return 0x7f040074;
_L17:
        if (!s.equals("layout-sw720dp/pl_event_item_view_0")) goto _L1; else goto _L47
_L47:
        return 0x7f040074;
_L9:
        if (!s.equals("layout/pl_player_item_view_0")) goto _L1; else goto _L48
_L48:
        return 0x7f040084;
_L26:
        if (!s.equals("layout-sw600dp/pl_event_sub_item_view_0")) goto _L1; else goto _L49
_L49:
        return 0x7f040077;
_L12:
        if (!s.equals("layout-sw720dp/pl_event_sub_item_view_0")) goto _L1; else goto _L50
_L50:
        return 0x7f040077;
        if (!s.equals("layout/pl_stats_item_view_0")) goto _L1; else goto _L51
_L51:
        return 0x7f04008a;
    }
}
