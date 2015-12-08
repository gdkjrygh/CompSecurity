// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.appcontent.AppContentCondition;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxGotItCardAdapter;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.destination.main.ProfileVisibilityButterbarAdapter;
import com.google.android.gms.games.ui.destination.main.SlimProfileAppContentAdapter;
import com.google.android.gms.games.ui.destination.main.WhatsNewCardAdapter;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentUtils, EditCirclesForPlayerAction, ViewContentAction, DismissWhatsNewCardAction, 
//            EditProfileVisibilityAction, SetSharedPrefBooleanAction, UpgradeToPlusAction, PlayerAvatarAppContentAdapter, 
//            SharedPrefBooleanCondition, ProfileIsVisibleCondition, IsNewVersionCondition, ApiLevelCondition, 
//            ImpressionCountCondition, ExtendedAppContentSection, ExtendedAppContentAction, ExtendedAppContentCondition

public final class PowerUpAppContentUtils extends AppContentUtils
{

    public PowerUpAppContentUtils()
    {
    }

    public static void init()
    {
        AppContentUtils.sInstance = new PowerUpAppContentUtils();
    }

    protected final ExtendedAppContentAction createActionImpl(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        String s;
        byte byte0;
        s = appcontentaction.getType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 76
    //                   -170948664: 124
    //                   178836489: 188
    //                   615946651: 204
    //                   861761501: 172
    //                   906241215: 140
    //                   1514969364: 156;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_204;
_L8:
        switch (byte0)
        {
        default:
            return super.createActionImpl(extendedappcontentsection, appcontentaction, eventlistener);

        case 0: // '\0'
            return new EditCirclesForPlayerAction(extendedappcontentsection, appcontentaction, eventlistener);

        case 1: // '\001'
            return new ViewContentAction(extendedappcontentsection, appcontentaction, eventlistener);

        case 2: // '\002'
            return new DismissWhatsNewCardAction(extendedappcontentsection, appcontentaction, eventlistener);

        case 3: // '\003'
            return new EditProfileVisibilityAction(extendedappcontentsection, appcontentaction, eventlistener);

        case 4: // '\004'
            return new SetSharedPrefBooleanAction(extendedappcontentsection, appcontentaction, eventlistener);

        case 5: // '\005'
            return new UpgradeToPlusAction(extendedappcontentsection, appcontentaction, eventlistener);
        }
_L2:
        if (s.equals("EDIT_CIRCLES_FOR_PLAYER"))
        {
            byte0 = 0;
        }
          goto _L8
_L6:
        if (s.equals("VIEW_CONTENT"))
        {
            byte0 = 1;
        }
          goto _L8
_L7:
        if (s.equals("DISMISS_WHATS_NEW_CARD"))
        {
            byte0 = 2;
        }
          goto _L8
_L5:
        if (s.equals("EDIT_PROFILE_VISIBILITY"))
        {
            byte0 = 3;
        }
          goto _L8
_L3:
        if (s.equals("SET_SHARED_PREF_BOOLEAN"))
        {
            byte0 = 4;
        }
          goto _L8
        if (s.equals("UPGRADE_TO_PLUS"))
        {
            byte0 = 5;
        }
          goto _L8
    }

    protected final GamesRecyclerAdapter createAdapterImpl(Context context, String s, Bundle bundle)
    {
        Integer integer;
        byte byte0;
        Object obj = null;
        integer = obj;
        if (bundle != null)
        {
            integer = obj;
            if (bundle.containsKey("upgradeToPlusSubSource"))
            {
                integer = Integer.valueOf(Integer.parseInt(bundle.getString("upgradeToPlusSubSource")));
            }
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 104
    //                   -1785066387: 182
    //                   -1658817712: 197
    //                   -1505909261: 152
    //                   -552545161: 212
    //                   408556937: 227
    //                   975903582: 167;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_227;
_L8:
        switch (byte0)
        {
        default:
            return super.createAdapterImpl(context, s, bundle);

        case 0: // '\0'
            return new ProfileVisibilityButterbarAdapter(context, null);

        case 1: // '\001'
            return new OnyxGotItCardAdapter(context, null, null, null, true);

        case 2: // '\002'
            return UpsellCardAdapter.createPlusUpsellCardAdapter((GamesFragmentActivity)context, null, 2, integer);

        case 3: // '\003'
            return new WhatsNewCardAdapter(context);

        case 4: // '\004'
            return new PlayerAvatarAppContentAdapter(context);

        case 5: // '\005'
            return new SlimProfileAppContentAdapter(context, integer);
        }
_L4:
        if (s.equals("BUTTERBAR"))
        {
            byte0 = 0;
        }
          goto _L8
_L7:
        if (s.equals("TUTORIAL"))
        {
            byte0 = 1;
        }
          goto _L8
_L2:
        if (s.equals("UPSELL"))
        {
            byte0 = 2;
        }
          goto _L8
_L3:
        if (s.equals("WHATS_NEW"))
        {
            byte0 = 3;
        }
          goto _L8
_L5:
        if (s.equals("PLAYER_AVATAR"))
        {
            byte0 = 4;
        }
          goto _L8
        if (s.equals("PROFILE"))
        {
            byte0 = 5;
        }
          goto _L8
    }

    protected final ExtendedAppContentCondition createConditionImpl(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        String s;
        byte byte0;
        s = appcontentcondition.getPredicate();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 68
    //                   -1959460173: 128
    //                   -1555448954: 112
    //                   -978880747: 176
    //                   -674160417: 160
    //                   -55446172: 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_176;
_L7:
        switch (byte0)
        {
        default:
            return super.createConditionImpl(extendedappcontentsection, appcontentcondition, eventlistener);

        case 0: // '\0'
            return new SharedPrefBooleanCondition(extendedappcontentsection, appcontentcondition, eventlistener);

        case 1: // '\001'
            return new ProfileIsVisibleCondition(extendedappcontentsection, appcontentcondition, eventlistener);

        case 2: // '\002'
            return new IsNewVersionCondition(extendedappcontentsection, appcontentcondition, eventlistener);

        case 3: // '\003'
            return new ApiLevelCondition(extendedappcontentsection, appcontentcondition, eventlistener);

        case 4: // '\004'
            return new ImpressionCountCondition(extendedappcontentsection, appcontentcondition, eventlistener);
        }
_L3:
        if (s.equals("SHARED_PREF_BOOLEAN"))
        {
            byte0 = 0;
        }
          goto _L7
_L2:
        if (s.equals("PROFILE_IS_VISIBLE"))
        {
            byte0 = 1;
        }
          goto _L7
_L6:
        if (s.equals("IS_NEW_VERSION"))
        {
            byte0 = 2;
        }
          goto _L7
_L5:
        if (s.equals("API_LEVEL"))
        {
            byte0 = 3;
        }
          goto _L7
        if (s.equals("IMPRESSION_COUNT_LIMIT"))
        {
            byte0 = 4;
        }
          goto _L7
    }

    public final SparseArray getViewPoolSizesImpl(Context context)
    {
        SparseArray sparsearray = super.getViewPoolSizesImpl(context);
        sparsearray.put(PlayerAvatarAppContentAdapter.getViewType(), Integer.valueOf(computePoolSize(context, PlayerAvatarAppContentAdapter.getSpanCountResId(), PlayerAvatarAppContentAdapter.getScreenRowsResId())));
        return sparsearray;
    }

    protected final int translateAssetIdImpl(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 13: default 120
    //                   -1684199839: 323
    //                   -1632295125: 278
    //                   -1619414661: 338
    //                   -1615851019: 308
    //                   -1475858838: 353
    //                   -1158662159: 208
    //                   -70944: 368
    //                   147944935: 264
    //                   173114583: 236
    //                   200485648: 194
    //                   378479853: 222
    //                   1362212687: 293
    //                   1883465105: 250;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_368;
_L15:
        switch (byte0)
        {
        default:
            return super.translateAssetIdImpl(s);

        case 0: // '\0'
            return 0x7f0200de;

        case 1: // '\001'
            return 0x7f0200e2;

        case 2: // '\002'
            return 0x7f0200e1;

        case 3: // '\003'
            return 0x7f0200df;

        case 4: // '\004'
            return 0x7f0200e3;

        case 5: // '\005'
            return 0x7f0200e4;

        case 6: // '\006'
            return 0x7f02011c;

        case 7: // '\007'
            return 0x7f02011e;

        case 8: // '\b'
            return 0x7f02016b;

        case 9: // '\t'
            return 0x7f020048;

        case 10: // '\n'
            return 0x7f020129;

        case 11: // '\013'
            return 0x7f0200e0;

        case 12: // '\f'
            return 0x7f020173;
        }
_L11:
        if (s.equals("EDU_FRIENDS_ARE_PLAYING"))
        {
            byte0 = 0;
        }
          goto _L15
_L7:
        if (s.equals("EDU_GYMK_GOTIT"))
        {
            byte0 = 1;
        }
          goto _L15
_L12:
        if (s.equals("EDU_GYMK_NULL"))
        {
            byte0 = 2;
        }
          goto _L15
_L10:
        if (s.equals("EDU_MY_GAMES"))
        {
            byte0 = 3;
        }
          goto _L15
_L14:
        if (s.equals("EDU_WARM_WELCOME"))
        {
            byte0 = 4;
        }
          goto _L15
_L9:
        if (s.equals("EDU_WHATS_NEW"))
        {
            byte0 = 5;
        }
          goto _L15
_L3:
        if (s.equals("PLAY_NOW"))
        {
            byte0 = 6;
        }
          goto _L15
_L13:
        if (s.equals("PLAY_NOW_THEMED"))
        {
            byte0 = 7;
        }
          goto _L15
_L5:
        if (s.equals("PLAY_NOW_WHITE"))
        {
            byte0 = 8;
        }
          goto _L15
_L2:
        if (s.equals("DEFAULT_QUEST_SECTION_BANNER"))
        {
            byte0 = 9;
        }
          goto _L15
_L4:
        if (s.equals("INSTALL"))
        {
            byte0 = 10;
        }
          goto _L15
_L6:
        if (s.equals("EDU_LOCKED_FEATURE"))
        {
            byte0 = 11;
        }
          goto _L15
        if (s.equals("RECORD_BUTTON"))
        {
            byte0 = 12;
        }
          goto _L15
    }
}
