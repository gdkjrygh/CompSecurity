// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.appcontent.AppContentCard;
import com.google.android.gms.games.appcontent.AppContentCondition;
import com.google.android.gms.games.appcontent.AppContentSection;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.layouts.ArrayLayoutSlot;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAnnotation, AvatarLayoutSlot, ExtendedAppContentAction, ExtendedAppContentCard, 
//            ExtendedAppContentSection, InstallPackageAction, SharePackageAction, StartPackageAction, 
//            StartRecordingAction, OnyxAppContentCardAdapter, AppContentQuestListAdapter, PackageInstalledCondition, 
//            HasMoreCardsCondition, ExtendedAppContentCondition

public class AppContentUtils
{

    private static final int rowsToDisplayForListCards[] = {
        0x7f0e0022, 0x7f0e0024, 0x7f0e0023
    };
    private static final int rowsToDisplayForMediumCards[] = {
        0x7f0e0027, 0x7f0e0029, 0x7f0e0028
    };
    private static final int rowsToDisplayForMiniCards[] = {
        0x7f0e002c, 0x7f0e002e, 0x7f0e002d
    };
    private static final int rowsToDisplayForPlayerAvatars[] = {
        0x7f0e003d, 0x7f0e003f, 0x7f0e003e
    };
    private static final int rowsToDisplayForSmallCards[] = {
        0x7f0e0033, 0x7f0e0035, 0x7f0e0034
    };
    private static final int rowsToDisplayForWideCards[] = {
        0x7f0e0038, 0x7f0e003a, 0x7f0e0039
    };
    static AppContentUtils sInstance = new AppContentUtils();

    public AppContentUtils()
    {
    }

    public static void annotateTitleAndSubtitle(String s, String s1, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider)
    {
        LayoutSlot layoutslot = layoutslotprovider.getLayoutSlot("SUBTITLE");
        layoutslotprovider = layoutslotprovider.getLayoutSlot("TITLE");
        if (layoutslotprovider != null && s != null)
        {
            ExtendedAppContentAnnotation extendedappcontentannotation = new ExtendedAppContentAnnotation();
            extendedappcontentannotation.mTitle = s;
            layoutslotprovider.setAnnotation(extendedappcontentannotation);
        }
        if (layoutslot != null && s1 != null)
        {
            s = new ExtendedAppContentAnnotation();
            s.mTitle = s1;
            layoutslot.setAnnotation(s);
        }
    }

    public static List computeLongestCommonSubsequence(List list, List list1)
    {
        int ai[];
        int j;
        int l;
        int l1;
        l1 = list.size();
        int i2 = list1.size();
        ai = new int[l1 * i2 * 2];
        for (int i = 0; i < i2; i++)
        {
            int k = 0;
            while (k < l1) 
            {
                int j2 = (l1 * i + k) * 2;
                if (((String)list.get(k)).equals(list1.get(i)))
                {
                    if (k > 0 && i > 0)
                    {
                        ai[j2 + 0] = ai[((k - 1) + (i - 1) * l1) * 2 + 0] + 1;
                    } else
                    {
                        ai[j2 + 0] = 1;
                    }
                    ai[j2 + 1] = 0;
                } else
                {
                    int i1 = 0;
                    if (k > 0)
                    {
                        i1 = ai[((k - 1) + l1 * i) * 2 + 0];
                    }
                    int k1 = 0;
                    if (i > 0)
                    {
                        k1 = ai[((i - 1) * l1 + k) * 2 + 0];
                    }
                    if (i1 == k1)
                    {
                        ai[j2 + 0] = i1;
                        ai[j2 + 1] = 1;
                    } else
                    if (i1 > k1)
                    {
                        ai[j2 + 0] = i1;
                        ai[j2 + 1] = 2;
                    } else
                    {
                        ai[j2 + 0] = k1;
                        ai[j2 + 1] = 3;
                    }
                }
                k++;
            }
        }

        j = l1 - 1;
        l = i2 - 1;
        list = new ArrayList();
_L9:
        if (j < 0 || l < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[(l1 * l + j) * 2 + 1];
        JVM INSTR tableswitch 0 3: default 336
    //                   0 339
    //                   1 381
    //                   2 365
    //                   3 372;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        continue; /* Loop/switch isn't completed */
_L2:
        int j1;
        list.add(0, Integer.valueOf(j));
        j1 = j - 1;
_L7:
        l--;
        j = j1;
        continue; /* Loop/switch isn't completed */
_L4:
        j--;
        continue; /* Loop/switch isn't completed */
_L5:
        l--;
        continue; /* Loop/switch isn't completed */
_L3:
        j1 = j;
        if (j < l) goto _L7; else goto _L6
_L6:
        j--;
        if (true) goto _L9; else goto _L8
_L8:
        return list;
    }

    protected static int computePoolSize(Context context, int i, int j)
    {
        context = context.getResources();
        return (int)((float)(context.getInteger(i) * context.getInteger(j)) * 1.2F);
    }

    public static ExtendedAppContentAction createAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        return sInstance.createActionImpl(extendedappcontentsection, appcontentaction, eventlistener);
    }

    public static GamesRecyclerAdapter createAdapter(Context context, String s)
    {
        return createAdapter(context, s, null);
    }

    public static GamesRecyclerAdapter createAdapter(Context context, String s, Bundle bundle)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return sInstance.createAdapterImpl(context, s, bundle);
        }
    }

    public static ExtendedAppContentCondition createCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        return sInstance.createConditionImpl(extendedappcontentsection, appcontentcondition, eventlistener);
    }

    public static LayoutSlot createLayoutSlot(String s, View view)
    {
        if (s != null && view != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        byte byte0;
        s = s.toUpperCase();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 1942336857 1942336857: default 40
    //                   1942336857 81;
           goto _L3 _L4
_L3:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            break;
        }
        if (view instanceof MetagameAvatarView)
        {
            return new AvatarLayoutSlot((MetagameAvatarView)view);
        }
          goto _L5
_L4:
        if (s.equals("AVATAR"))
        {
            byte0 = 0;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (true) goto _L1; else goto _L6
_L6:
    }

    public static float fixScoreBarPercentage(float f)
    {
        float f1 = f;
        if (f < 0.0F)
        {
            f1 = 0.0F;
        }
        f = f1;
        if (f1 > 100F)
        {
            f = 100F;
        }
        return (35F * f) / 100F + 25F;
    }

    public static int getActionLogflowUiElementType(ExtendedAppContentAction extendedappcontentaction)
    {
        int j = getLogflowUiElementType(extendedappcontentaction.getAction().getExtras());
        int i = j;
        if (j == 0)
        {
            i = extendedappcontentaction.getLogflowUiElementType();
        }
        return i;
    }

    public static boolean getBooleanExtra$1c5c0af(Bundle bundle, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (bundle != null)
        {
            bundle = bundle.getString(s);
            flag = flag1;
            if (bundle != null)
            {
                flag = Boolean.valueOf(bundle).booleanValue();
            }
        }
        return flag;
    }

    public static int getLogflowUiElementType(Bundle bundle)
    {
        bundle = bundle.getString("logElementType");
        if (!TextUtils.isEmpty(bundle) && TextUtils.isDigitsOnly(bundle))
        {
            return Integer.parseInt(bundle);
        } else
        {
            return 0;
        }
    }

    public static int getNumRowsToDisplay(String s, String s1)
    {
        boolean flag;
        flag = false;
        if (s1.equals("SINGLE"))
        {
            return 0x7f0e0031;
        }
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 52
    //                   -1986416409: 251
    //                   69496: 237
    //                   2358879: 265;
           goto _L1 _L2 _L3 _L4
_L1:
        byte byte0 = -1;
_L19:
        byte0;
        JVM INSTR tableswitch 0 2: default 80
    //                   0 279
    //                   1 284
    //                   2 289;
           goto _L5 _L6 _L7 _L8
_L5:
        byte byte1 = 1;
_L22:
        s.hashCode();
        JVM INSTR lookupswitch 8: default 160
    //                   -2101169498: 309
    //                   -890821226: 337
    //                   -552545161: 398
    //                   77406402: 352
    //                   1430901073: 367
    //                   1733123839: 323
    //                   1733153464: 294
    //                   1733451060: 382;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L9:
        byte0 = -1;
_L24:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("No row number has been set up for card type: \"")).append(s).append("\"").toString());

        case 0: // '\0'
            return rowsToDisplayForMiniCards[byte1];

        case 1: // '\001'
            return rowsToDisplayForSmallCards[byte1];

        case 2: // '\002'
            return rowsToDisplayForListCards[byte1];

        case 3: // '\003'
            return rowsToDisplayForMediumCards[byte1];

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return rowsToDisplayForWideCards[byte1];

        case 7: // '\007'
            return rowsToDisplayForPlayerAvatars[byte1];
        }
_L3:
        if (!s1.equals("FEW")) goto _L1; else goto _L18
_L18:
        byte0 = 0;
          goto _L19
_L2:
        if (!s1.equals("NORMAL")) goto _L1; else goto _L20
_L20:
        byte0 = 1;
          goto _L19
_L4:
        if (!s1.equals("MANY")) goto _L1; else goto _L21
_L21:
        byte0 = 2;
          goto _L19
_L6:
        byte1 = 0;
          goto _L22
_L7:
        byte1 = 1;
          goto _L22
_L8:
        byte1 = 2;
          goto _L22
_L16:
        if (!s.equals("ONYX_MINI")) goto _L9; else goto _L23
_L23:
        byte0 = flag;
          goto _L24
_L10:
        if (!s.equals("ONYX_SMALL")) goto _L9; else goto _L25
_L25:
        byte0 = 1;
          goto _L24
_L15:
        if (!s.equals("ONYX_LIST")) goto _L9; else goto _L26
_L26:
        byte0 = 2;
          goto _L24
_L11:
        if (!s.equals("ONYX_MEDIUM")) goto _L9; else goto _L27
_L27:
        byte0 = 3;
          goto _L24
_L13:
        if (!s.equals("QUEST")) goto _L9; else goto _L28
_L28:
        byte0 = 4;
          goto _L24
_L14:
        if (!s.equals("ONYX_WHOLE_ROW")) goto _L9; else goto _L29
_L29:
        byte0 = 5;
          goto _L24
_L17:
        if (!s.equals("ONYX_WIDE")) goto _L9; else goto _L30
_L30:
        byte0 = 6;
          goto _L24
_L12:
        if (!s.equals("PLAYER_AVATAR")) goto _L9; else goto _L31
_L31:
        byte0 = 7;
          goto _L24
    }

    public static SharedElementTransition getSharedElementTransition(com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider, String s, int i)
    {
        layoutslotprovider = layoutslotprovider.getLayoutSlot(s);
        if (layoutslotprovider != null)
        {
            if (layoutslotprovider instanceof ArrayLayoutSlot)
            {
                s = ((ArrayLayoutSlot)layoutslotprovider).getLayoutSlot(i);
                int j;
                if (s != null)
                {
                    j = s.getAnimationType();
                } else
                {
                    j = 0;
                }
                if (j != 0)
                {
                    s = new SharedElementTransition(j);
                    layoutslotprovider = ((ArrayLayoutSlot)layoutslotprovider).getLayoutSlot(i);
                    if (layoutslotprovider != null)
                    {
                        layoutslotprovider.addSharedViews(s);
                    }
                    return s;
                }
            } else
            {
                i = layoutslotprovider.getAnimationType();
                if (i != 0)
                {
                    s = new SharedElementTransition(i);
                    layoutslotprovider.addSharedViews(s);
                    return s;
                }
            }
        }
        return null;
    }

    private static HashSet getUnusedSlots(DataBuffer databuffer, int i, int j, Set set)
    {
        set = new HashSet(set);
        for (int k = i; k < i + j && !set.isEmpty(); k++)
        {
            Object obj = (ExtendedAppContentCard)databuffer.get(k);
            List list = ((ExtendedAppContentCard) (obj)).mCard.getAnnotations();
            int l = 0;
            for (int i1 = list.size(); l < i1 && !set.isEmpty(); l++)
            {
                set.remove(((AppContentAnnotation)list.get(l)).getLayoutSlot());
            }

            obj = ((ExtendedAppContentCard) (obj)).mActions;
            l = 0;
            for (int j1 = ((List) (obj)).size(); l < j1 && !set.isEmpty(); l++)
            {
                set.remove(((ExtendedAppContentAction)((List) (obj)).get(l)).mAnnotation.mLayoutSlot);
            }

        }

        return set;
    }

    public static HashSet getUnusedSlots(DataBuffer databuffer, Set set)
    {
        if (databuffer == null)
        {
            return new HashSet(set);
        } else
        {
            return getUnusedSlots(databuffer, 0, databuffer.getCount(), set);
        }
    }

    private static void populateActions(List list, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider)
    {
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            ExtendedAppContentAction extendedappcontentaction = (ExtendedAppContentAction)list.get(i);
            Object obj = extendedappcontentaction.getAction();
            LayoutSlot layoutslot1 = layoutslotprovider.getLayoutSlot(((AppContentAction) (obj)).getAnnotation().getLayoutSlot());
            LayoutSlot layoutslot = layoutslot1;
            if (layoutslot1 == null)
            {
                obj = ((AppContentAction) (obj)).getOverflowText();
                layoutslot = layoutslot1;
                if (obj != null)
                {
                    layoutslot = layoutslot1;
                    if (!((String) (obj)).isEmpty())
                    {
                        layoutslot = layoutslotprovider.getLayoutSlot("OVERFLOW_MENU");
                    }
                }
            }
            if (layoutslot == null)
            {
                continue;
            }
            extendedappcontentaction.checkConditionsInternal(false);
            if (extendedappcontentaction.mVisible)
            {
                layoutslot.setAction(extendedappcontentaction);
            }
        }

        i = 0;
        for (int k = list.size(); i < k; i++)
        {
            ((ExtendedAppContentAction)list.get(i)).onBindToLayoutSlotProvider(layoutslotprovider);
        }

    }

    private static void populateAnnotations(List list, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider)
    {
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            AppContentAnnotation appcontentannotation = (AppContentAnnotation)list.get(i);
            LayoutSlot layoutslot = layoutslotprovider.getLayoutSlot(appcontentannotation.getLayoutSlot());
            if (layoutslot != null)
            {
                layoutslot.setAnnotation(appcontentannotation);
            }
        }

    }

    public static void populateLayoutSlots(ExtendedAppContentCard extendedappcontentcard, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider)
    {
        populateAnnotations(extendedappcontentcard.mCard.getAnnotations(), layoutslotprovider);
        populateActions(extendedappcontentcard.mActions, layoutslotprovider);
    }

    public static void populateLayoutSlots(ExtendedAppContentSection extendedappcontentsection, com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider)
    {
        populateAnnotations(extendedappcontentsection.mSection.getAnnotations(), layoutslotprovider);
        populateActions(extendedappcontentsection.mActions, layoutslotprovider);
    }

    public static void resetLayoutSlots(com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider)
    {
        for (layoutslotprovider = layoutslotprovider.getLayoutSlots().iterator(); layoutslotprovider.hasNext(); ((LayoutSlot)layoutslotprovider.next()).reset()) { }
    }

    public static void setRecyclerPoolSizes(Context context, RecyclerView recyclerview)
    {
        recyclerview = recyclerview.mRecycler.getRecycledViewPool();
        context = sInstance.getViewPoolSizesImpl(context);
        int i = 0;
        for (int j = context.size(); i < j; i++)
        {
            int k = context.keyAt(i);
            int l = ((Integer)context.valueAt(i)).intValue();
            ((android.support.v7.widget.RecyclerView.RecycledViewPool) (recyclerview)).mMaxScrap.put(k, l);
            ArrayList arraylist = (ArrayList)((android.support.v7.widget.RecyclerView.RecycledViewPool) (recyclerview)).mScrap.get(k);
            if (arraylist == null)
            {
                continue;
            }
            for (; arraylist.size() > l; arraylist.remove(arraylist.size() - 1)) { }
        }

    }

    public static void setupLogflowAndImpressView(View view, GamesRecyclerAdapter gamesrecycleradapter, ExtendedAppContentCard extendedappcontentcard, int i)
    {
        int k = getLogflowUiElementType(extendedappcontentcard.mCard.getExtras());
        int j = k;
        if (k == 0)
        {
            j = i;
        }
        LogflowUiUtils.setupLogflowAndImpressView(view, gamesrecycleradapter, j, extendedappcontentcard.mSection.getLogflowUiElementType(), extendedappcontentcard.getLogflowDocumentId());
    }

    public static void setupLogflowAndImpressView$5256e446(View view, GamesRecyclerAdapter gamesrecycleradapter, ExtendedAppContentSection extendedappcontentsection)
    {
        LogflowUiUtils.setupLogflowAndImpressView(view, gamesrecycleradapter, 502, extendedappcontentsection.getLogflowUiElementType(), extendedappcontentsection.mSection.getExtras().getString("semanticId"));
    }

    public static int translateAssetId(String s)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return sInstance.translateAssetIdImpl(s);
        }
    }

    public static boolean updateUnusedSlots(HashSet hashset, DataBuffer databuffer, int i, int j)
    {
        databuffer = getUnusedSlots(databuffer, i, j, hashset);
        boolean flag = false;
        hashset = hashset.iterator();
        do
        {
            if (!hashset.hasNext())
            {
                break;
            }
            if (!databuffer.contains((String)hashset.next()))
            {
                hashset.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    protected ExtendedAppContentAction createActionImpl(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        String s;
        byte byte0;
        s = appcontentaction.getType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 60
    //                   -1464767980: 145
    //                   163286950: 111
    //                   370266409: 128
    //                   727346530: 94;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_145;
_L6:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return new InstallPackageAction(extendedappcontentsection, appcontentaction, eventlistener);

        case 1: // '\001'
            return new SharePackageAction(extendedappcontentsection, appcontentaction, eventlistener);

        case 2: // '\002'
            return new StartPackageAction(extendedappcontentsection, appcontentaction, eventlistener);

        case 3: // '\003'
            return new StartRecordingAction(extendedappcontentsection, appcontentaction, eventlistener);
        }
_L5:
        if (s.equals("INSTALL_PACKAGE"))
        {
            byte0 = 0;
        }
          goto _L6
_L3:
        if (s.equals("SHARE_PACKAGE"))
        {
            byte0 = 1;
        }
          goto _L6
_L4:
        if (s.equals("START_PACKAGE"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("START_RECORDING"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    protected GamesRecyclerAdapter createAdapterImpl(Context context, String s, Bundle bundle)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 7: default 72
    //                   -2101169498: 133
    //                   -890821226: 163
    //                   77406402: 195
    //                   1430901073: 211
    //                   1733123839: 148
    //                   1733153464: 118
    //                   1733451060: 179;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_211;
_L9:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return new OnyxAppContentCardAdapter(context, 1);

        case 1: // '\001'
            return new OnyxAppContentCardAdapter(context, 2);

        case 2: // '\002'
            return new OnyxAppContentCardAdapter(context, 3);

        case 3: // '\003'
            return new OnyxAppContentCardAdapter(context, 4);

        case 4: // '\004'
            return new OnyxAppContentCardAdapter(context, 5);

        case 5: // '\005'
            return new AppContentQuestListAdapter(context);

        case 6: // '\006'
            return new OnyxAppContentCardAdapter(context, 7);
        }
_L7:
        if (s.equals("ONYX_MINI"))
        {
            byte0 = 0;
        }
          goto _L9
_L2:
        if (s.equals("ONYX_SMALL"))
        {
            byte0 = 1;
        }
          goto _L9
_L6:
        if (s.equals("ONYX_LIST"))
        {
            byte0 = 2;
        }
          goto _L9
_L3:
        if (s.equals("ONYX_MEDIUM"))
        {
            byte0 = 3;
        }
          goto _L9
_L8:
        if (s.equals("ONYX_WIDE"))
        {
            byte0 = 4;
        }
          goto _L9
_L4:
        if (s.equals("QUEST"))
        {
            byte0 = 5;
        }
          goto _L9
        if (s.equals("ONYX_WHOLE_ROW"))
        {
            byte0 = 6;
        }
          goto _L9
    }

    protected ExtendedAppContentCondition createConditionImpl(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        String s;
        byte byte0;
        s = appcontentcondition.getPredicate();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 44
    //                   1047216318: 87
    //                   1304922753: 70;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_87;
_L4:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return new PackageInstalledCondition(extendedappcontentsection, appcontentcondition, eventlistener);

        case 1: // '\001'
            return new HasMoreCardsCondition(extendedappcontentsection, appcontentcondition, eventlistener);
        }
_L3:
        if (s.equals("PACKAGE_INSTALLED"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("HAS_MORE_CARDS"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    public SparseArray getViewPoolSizesImpl(Context context)
    {
        SparseArray sparsearray = new SparseArray();
        Integer integer;
        for (Iterator iterator = OnyxCardAdapter.CARD_TYPES.iterator(); iterator.hasNext(); sparsearray.put(OnyxAppContentCardAdapter.getViewTypeForCardType(integer.intValue()), Integer.valueOf(computePoolSize(context, OnyxAppContentCardAdapter.getSpanCountResId(integer.intValue()), OnyxAppContentCardAdapter.getScreenRowsResId(integer.intValue())))))
        {
            integer = (Integer)iterator.next();
        }

        sparsearray.put(AppContentQuestListAdapter.getViewType(), Integer.valueOf(computePoolSize(context, AppContentQuestListAdapter.getSpanCountResId(), AppContentQuestListAdapter.getScreenRowsResId())));
        return sparsearray;
    }

    protected int translateAssetIdImpl(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 12: default 112
    //                   -1783188801: 231
    //                   -682882061: 291
    //                   -644326744: 355
    //                   -500748296: 307
    //                   -371202020: 371
    //                   -247555120: 246
    //                   -221327621: 216
    //                   -174491470: 323
    //                   78862271: 261
    //                   1023926002: 339
    //                   1696188240: 201
    //                   1994526592: 276;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_371;
_L14:
        switch (byte0)
        {
        default:
            GamesLog.e("AppContentUtils", (new StringBuilder("Unknown asset id : ")).append(s).toString());
            return 0;

        case 0: // '\0'
            return 0x7f0200da;

        case 1: // '\001'
            return 0x7f0201e0;

        case 2: // '\002'
            return 0x7f0200db;

        case 3: // '\003'
            return 0x7f020105;

        case 4: // '\004'
            return 0x7f020125;

        case 5: // '\005'
            return 0x7f02016c;

        case 6: // '\006'
            return 0x7f02016d;

        case 7: // '\007'
            return 0x7f02011f;

        case 8: // '\b'
            return 0x7f0200f8;

        case 9: // '\t'
            return 0x7f0200f5;

        case 10: // '\n'
            return 0x7f0200ed;

        case 11: // '\013'
            return 0x7f0200c3;
        }
_L12:
        if (s.equals("DEFAULT_GAME"))
        {
            byte0 = 0;
        }
          goto _L14
_L8:
        if (s.equals("DEFAULT_GAME_BANNER"))
        {
            byte0 = 1;
        }
          goto _L14
_L2:
        if (s.equals("DEFAULT_PLAYER"))
        {
            byte0 = 2;
        }
          goto _L14
_L7:
        if (s.equals("INFO_GREY"))
        {
            byte0 = 3;
        }
          goto _L14
_L10:
        if (s.equals("SHARE"))
        {
            byte0 = 4;
        }
          goto _L14
_L13:
        if (s.equals("FOLLOW_BUTTON"))
        {
            byte0 = 5;
        }
          goto _L14
_L3:
        if (s.equals("FRIEND_BUTTON"))
        {
            byte0 = 6;
        }
          goto _L14
_L5:
        if (s.equals("HOURGLASS"))
        {
            byte0 = 7;
        }
          goto _L14
_L9:
        if (s.equals("CLAIM_REWARD"))
        {
            byte0 = 8;
        }
          goto _L14
_L11:
        if (s.equals("GREEN_CHECK_32"))
        {
            byte0 = 9;
        }
          goto _L14
_L4:
        if (s.equals("ACHIEVEMENTS_BADGE"))
        {
            byte0 = 10;
        }
          goto _L14
        if (s.equals("ACHIEVEMENTS_PROGRESS_BAR"))
        {
            byte0 = 11;
        }
          goto _L14
    }

}
