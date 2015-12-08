// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.common.data.DataBufferObserverSet;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.appcontent.AppContentCard;
import com.google.android.gms.games.appcontent.AppContentSection;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.LogflowEventListener;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentUtils, AppContentFragment, ExtendedAppContentCard, AppContentCarouselAdapter, 
//            CarouselPagerAdapter

public class ExtendedAppContentSection
    implements ExtendedAppContentAction.EventListener, ExtendedAppContentCard.EventListener
{

    ArrayList mActions;
    HashSet mActiveActions;
    GamesRecyclerAdapter mAdapter;
    ArrayList mAdapterList;
    final ArrayList mCards;
    final Context mContext;
    DatabufferRecyclerAdapter mDataAdapter;
    ObjectDataBuffer mDataBuffer;
    final AppContentFragment mFragment;
    private HeaderItemRecyclerAdapter mHeader;
    private boolean mHideIfEmpty;
    public final LogflowEventListener mLogListener;
    private AppContentSection mPendingSectionData;
    AppContentSection mSection;

    public ExtendedAppContentSection(AppContentFragment appcontentfragment, AppContentSection appcontentsection)
    {
        byte byte0;
        mFragment = appcontentfragment;
        mContext = ((Fragment) (appcontentfragment)).mActivity;
        Asserts.checkState(mContext instanceof LogflowEventListener);
        mLogListener = (LogflowEventListener)mContext;
        mSection = appcontentsection;
        mHideIfEmpty = AppContentUtils.getBooleanExtra$1c5c0af(mSection.getExtras(), "hideIfEmpty");
        createActions();
        mCards = new ArrayList(mSection.getCards().size());
        appcontentfragment = appcontentsection.getType();
        byte0 = -1;
        appcontentfragment.hashCode();
        JVM INSTR lookupswitch 3: default 136
    //                   -1724098451: 268
    //                   450273447: 254
    //                   785535328: 282;
           goto _L1 _L2 _L3 _L4
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 164
    //                   0 296
    //                   1 421
    //                   2 428;
           goto _L5 _L6 _L7 _L8
_L5:
        GamesLog.e("ExAppContentSection", (new StringBuilder("Unknown AppContent section type: ")).append(appcontentfragment).toString());
_L9:
        mAdapterList = new ArrayList();
        if (mHeader != null)
        {
            mAdapterList.add(mHeader);
        }
        if (mAdapter != null)
        {
            mAdapterList.add(mAdapter);
        }
        mActiveActions = new HashSet();
        mFragment.loadStateForSection(this);
        return;
_L3:
        if (appcontentfragment.equals("SINGLE_CARD"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (appcontentfragment.equals("CARD_LIST"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (appcontentfragment.equals("CAROUSEL"))
        {
            byte0 = 2;
        }
          goto _L1
_L6:
        appcontentfragment = mSection.getCardType();
        appcontentsection = (SingleItemRecyclerAdapter)AppContentUtils.createAdapter(mContext, appcontentfragment, mSection.getExtras());
        if (appcontentsection == null)
        {
            GamesLog.w("ExAppContentSection", (new StringBuilder("Unrecognized card type: ")).append(appcontentfragment).toString());
        } else
        {
            mHeader = new HeaderItemRecyclerAdapter(mContext);
            mHeader.mAppContentSection = this;
            mAdapter = appcontentsection;
            appcontentsection.setCard(new ExtendedAppContentCard(this, (AppContentCard)mSection.getCards().get(0), this));
            updateHeader();
        }
          goto _L9
_L7:
        initCardListSection();
          goto _L9
_L8:
        initCarouselSection();
          goto _L9
    }

    private void createActions()
    {
        int j = mSection.getActions().size();
        mActions = new ArrayList(j);
        List list = mSection.getActions();
        for (int i = 0; i < j; i++)
        {
            ExtendedAppContentAction extendedappcontentaction = AppContentUtils.createAction(this, (AppContentAction)list.get(i), this);
            if (extendedappcontentaction != null)
            {
                mActions.add(extendedappcontentaction);
            }
        }

    }

    public static String getSemanticId(AppContentSection appcontentsection)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(appcontentsection.getType());
        stringbuilder.append('|');
        stringbuilder.append(appcontentsection.getCardType());
        stringbuilder.append('|');
        appcontentsection = appcontentsection.getExtras().getString("semanticId");
        if (appcontentsection != null)
        {
            stringbuilder.append(appcontentsection);
        }
        return stringbuilder.toString();
    }

    private void initCardListSection()
    {
        Object obj;
        String s;
        List list;
        DatabufferRecyclerAdapter databufferrecycleradapter;
        String s1;
        int j;
        list = mSection.getCards();
        j = list.size();
        if (j == 0)
        {
            return;
        }
        s1 = mSection.getCardType();
        databufferrecycleradapter = (DatabufferRecyclerAdapter)AppContentUtils.createAdapter(mContext, s1);
        if (databufferrecycleradapter == null)
        {
            GamesLog.e("ExAppContentSection", (new StringBuilder("Unrecognized card type : ")).append(s1).toString());
            return;
        }
        mHeader = new HeaderItemRecyclerAdapter(mContext);
        mHeader.mAppContentSection = this;
        s = (String)mSection.getExtras().get("rowsDisplayed");
        obj = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        int i = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 8: default 208
    //                   -2101169498: 397
    //                   -890821226: 431
    //                   -552545161: 346
    //                   77406402: 448
    //                   1430901073: 363
    //                   1733123839: 414
    //                   1733153464: 380
    //                   1733451060: 466;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        i;
        JVM INSTR tableswitch 0 1: default 232
    //                   0 484
    //                   1 484;
           goto _L12 _L13 _L13
_L12:
        obj = "FEW";
        break; /* Loop/switch isn't completed */
_L6:
        if (s1.equals("PLAYER_AVATAR"))
        {
            i = 0;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (s1.equals("ONYX_WHOLE_ROW"))
        {
            i = 1;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (s1.equals("ONYX_MINI"))
        {
            i = 2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s1.equals("ONYX_SMALL"))
        {
            i = 3;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (s1.equals("ONYX_LIST"))
        {
            i = 4;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (s1.equals("ONYX_MEDIUM"))
        {
            i = 5;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (s1.equals("QUEST"))
        {
            i = 6;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (s1.equals("ONYX_WIDE"))
        {
            i = 7;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        obj = "SINGLE";
_L2:
        if (((String) (obj)).equals("UNLIMITED"))
        {
            databufferrecycleradapter.clearMaxNumItems();
        } else
        {
            databufferrecycleradapter.setMaxRows(AppContentUtils.getNumRowsToDisplay(s1, ((String) (obj))));
        }
        mDataBuffer = new ObjectDataBuffer();
        mCards.clear();
        for (i = 0; i < j; i++)
        {
            obj = new ExtendedAppContentCard(this, (AppContentCard)list.get(i), this);
            mCards.add(obj);
            mDataBuffer.add(obj);
            ((ExtendedAppContentCard) (obj)).checkConditions();
            if (!((ExtendedAppContentCard) (obj)).mVisible)
            {
                mDataBuffer.filterOutRaw(i);
            }
        }

        databufferrecycleradapter.setDataBuffer(mDataBuffer);
        mAdapter = databufferrecycleradapter;
        mDataAdapter = databufferrecycleradapter;
        updateHeader();
        return;
        if (true) goto _L3; else goto _L14
_L14:
    }

    private void initCarouselSection()
    {
        Object obj = mSection.getCards();
        int j = ((List) (obj)).size();
        if (j == 0)
        {
            return;
        }
        Object obj1 = mSection.getCardType();
        DatabufferRecyclerAdapter databufferrecycleradapter = (DatabufferRecyclerAdapter)AppContentUtils.createAdapter(mContext, ((String) (obj1)));
        if (databufferrecycleradapter == null)
        {
            GamesLog.e("ExAppContentSection", (new StringBuilder("Unrecognized card type : ")).append(((String) (obj1))).toString());
            return;
        }
        obj1 = new AppContentCarouselAdapter(mContext, this);
        mDataBuffer = new ObjectDataBuffer();
        mCards.clear();
        for (int i = 0; i < j; i++)
        {
            ExtendedAppContentCard extendedappcontentcard = new ExtendedAppContentCard(this, (AppContentCard)((List) (obj)).get(i), this);
            mCards.add(extendedappcontentcard);
            mDataBuffer.add(extendedappcontentcard);
            extendedappcontentcard.checkConditions();
            if (!extendedappcontentcard.mVisible)
            {
                mDataBuffer.filterOutRaw(i);
            }
        }

        databufferrecycleradapter.setDataBuffer(mDataBuffer);
        obj = ((GamesHeaderRecyclerViewFragment) (mFragment)).mRecyclerView.mRecycler.getRecycledViewPool();
        obj1.mCardAdapter = databufferrecycleradapter;
        obj1.mPagerAdapter = new CarouselPagerAdapter(((AppContentCarouselAdapter) (obj1)).mContext, ((AppContentCarouselAdapter) (obj1)).mCardAdapter, ((android.support.v7.widget.RecyclerView.RecycledViewPool) (obj)));
        mDataAdapter = databufferrecycleradapter;
        mAdapter = ((GamesRecyclerAdapter) (obj1));
    }

    private void setSectionDataCardList()
    {
        List list;
        int l;
        int i1;
        l = mCards.size();
        Object obj = new ArrayList(l);
        for (int i = 0; i < l; i++)
        {
            ((ArrayList) (obj)).add(ExtendedAppContentCard.getSemanticId(((ExtendedAppContentCard)mCards.get(i)).mCard));
        }

        list = mSection.getCards();
        i1 = list.size();
        ArrayList arraylist = new ArrayList(i1);
        for (int j = 0; j < i1; j++)
        {
            arraylist.add(ExtendedAppContentCard.getSemanticId((AppContentCard)list.get(j)));
        }

        obj = AppContentUtils.computeLongestCommonSubsequence(((List) (obj)), arraylist);
        l = ((List) (obj)).size() - 1;
        int k = mCards.size() - 1;
        while (k >= 0) 
        {
            if (l >= 0 && k == ((Integer)((List) (obj)).get(l)).intValue())
            {
                l--;
            } else
            {
                mCards.remove(k);
                mDataBuffer.removeRaw(k);
            }
            k--;
        }
        l = 0;
_L8:
        ExtendedAppContentCard extendedappcontentcard;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        AppContentCard appcontentcard = (AppContentCard)list.get(l);
        extendedappcontentcard = new ExtendedAppContentCard(this, appcontentcard, this);
        boolean flag = true;
        if (l < mCards.size())
        {
            if (!ExtendedAppContentCard.getSemanticId(((ExtendedAppContentCard)mCards.get(l)).mCard).equals(ExtendedAppContentCard.getSemanticId(appcontentcard)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        mCards.add(l, extendedappcontentcard);
        mDataBuffer.insertRaw(l, extendedappcontentcard);
        extendedappcontentcard.checkConditions();
        if (extendedappcontentcard.mVisible) goto _L4; else goto _L3
_L3:
        mDataBuffer.filterOutRaw(l);
_L4:
        l++;
        continue; /* Loop/switch isn't completed */
_L2:
        mCards.set(l, extendedappcontentcard);
        boolean flag1 = mDataBuffer.setRaw(l, extendedappcontentcard);
        extendedappcontentcard.checkConditions();
        boolean flag2 = extendedappcontentcard.mVisible;
        if (flag1 == flag2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        mDataBuffer.unfilterRaw(l);
        if (true) goto _L4; else goto _L5
_L5:
        if (true) goto _L3; else goto _L6
_L6:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean shouldDeferNewData()
    {
        return !mActiveActions.isEmpty() || !((Fragment) (mFragment)).mResumed;
    }

    private void updateHeader()
    {
        if (mHeader != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            boolean flag2 = mHeader.isVisible();
            boolean flag;
            boolean flag1;
            if (mSection.getActions().size() > 0 || mSection.getAnnotations().size() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (!mHideIfEmpty)
            {
                break label0;
            }
            if (mAdapter != null)
            {
                flag1 = flag;
                if (mAdapter.getItemCount() != 0)
                {
                    break label0;
                }
            }
            flag1 = false;
        }
        if (flag2 != flag1)
        {
            mHeader.setVisible(flag1);
        }
        if (flag2 && flag1)
        {
            mHeader.notifySingleItemChanged();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    final void checkPendingData()
    {
        if (shouldDeferNewData() || mPendingSectionData == null)
        {
            return;
        } else
        {
            ((Fragment) (mFragment)).mView.post(new Runnable() {

                final ExtendedAppContentSection this$0;

                public final void run()
                {
                    if (mPendingSectionData != null)
                    {
                        AppContentSection appcontentsection = mPendingSectionData;
                        mPendingSectionData;
                        setSectionData(appcontentsection);
                    }
                }

            
            {
                this$0 = ExtendedAppContentSection.this;
                super();
            }
            });
            return;
        }
    }

    public final int getLogflowUiElementType()
    {
        return AppContentUtils.getLogflowUiElementType(mSection.getExtras());
    }

    public final void onActionChanged$5ea2ff71()
    {
    }

    public final void onCardAdded(ExtendedAppContentCard extendedappcontentcard)
    {
        Object obj;
        if (mAdapter == null)
        {
            return;
        }
        obj = mSection.getType();
        ((String) (obj)).hashCode();
        JVM INSTR tableswitch 450273447 450273447: default 40
    //                   450273447 178;
           goto _L1 _L2
_L1:
        int i = -1;
_L9:
        i;
        JVM INSTR tableswitch 0 0: default 60
    //                   0 192;
           goto _L3 _L4
_L3:
        int j;
        int l;
        int i1;
        int j1;
        int i2;
        obj = mDataBuffer;
        i2 = ((ObjectDataBuffer) (obj)).mObjectList.size();
        i1 = 0;
        j1 = -1;
        l = -1;
        j = 0;
        i = 0;
_L7:
        if (i1 >= i2) goto _L6; else goto _L5
_L5:
        int k;
        int k1;
        if (!((ObjectDataBuffer) (obj)).mExcludedPositionSet.contains(Integer.valueOf(i1)))
        {
            i++;
            k = i;
            if (l < 0)
            {
                break MISSING_BLOCK_LABEL_361;
            }
            ((ObjectDataBuffer) (obj)).filterEntities();
            ((ObjectDataBuffer) (obj)).mObserverSet.onDataRangeInserted(l, j1);
            k = -1;
            l = -1;
            j = i + j1;
            i = 0;
        } else
        if (extendedappcontentcard.equals(((ObjectDataBuffer) (obj)).mObjectList.get(i1)))
        {
            ((ObjectDataBuffer) (obj)).mExcludedPositionSet.remove(Integer.valueOf(i1));
            int l1;
            if (((ObjectDataBuffer) (obj)).mObserverSet.hasObservers())
            {
                if (l < 0)
                {
                    k = 1;
                    l = i;
                    j = i;
                    i = 1;
                } else
                {
                    k = j1 + 1;
                    j = i;
                    i = 1;
                }
            } else
            {
                j = i;
                i = 1;
                k = j1;
            }
        } else
        {
            k = i;
            if (!((ObjectDataBuffer) (obj)).mObserverSet.hasObservers())
            {
                break MISSING_BLOCK_LABEL_361;
            }
            k = i;
            if (l < 0)
            {
                break MISSING_BLOCK_LABEL_361;
            }
            ((ObjectDataBuffer) (obj)).filterEntities();
            ((ObjectDataBuffer) (obj)).mObserverSet.onDataRangeInserted(l, j1);
            k = -1;
            l = -1;
            j = i + j1;
            i = 0;
        }
_L12:
        k1 = i1 + 1;
        i1 = i;
        j1 = k;
        i = j;
        j = i1;
        i1 = k1;
          goto _L7
_L2:
        if (!((String) (obj)).equals("SINGLE_CARD")) goto _L1; else goto _L8
_L8:
        i = 0;
          goto _L9
_L4:
        ((SingleItemRecyclerAdapter)mAdapter).setVisible(true);
_L11:
        updateHeader();
        return;
_L6:
        if (j != 0)
        {
            ((ObjectDataBuffer) (obj)).filterEntities();
        }
        if (l >= 0)
        {
            ((ObjectDataBuffer) (obj)).mObserverSet.onDataRangeInserted(l, j1);
        }
        if (true) goto _L11; else goto _L10
_L10:
        l1 = k;
        i = j;
        k = j1;
        j = l1;
          goto _L12
    }

    public final void onCardChanged(ExtendedAppContentCard extendedappcontentcard)
    {
        if (mAdapter != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int i;
        obj = mSection.getType();
        i = -1;
        ((String) (obj)).hashCode();
        JVM INSTR tableswitch 450273447 450273447: default 44
    //                   450273447 140;
           goto _L3 _L4
_L3:
        switch (i)
        {
        default:
            obj = mDataBuffer;
            if (((ObjectDataBuffer) (obj)).mObserverSet.hasObservers())
            {
                int j = ((ObjectDataBuffer) (obj)).mEntityOffsets.size();
                i = 0;
                while (i < j) 
                {
                    if (extendedappcontentcard.equals(((ObjectDataBuffer) (obj)).mObjectList.get(((Integer)((ObjectDataBuffer) (obj)).mEntityOffsets.get(i)).intValue())))
                    {
                        ((ObjectDataBuffer) (obj)).mObserverSet.onDataRangeChanged(i, 1);
                    }
                    i++;
                }
            }
            break;

        case 0: // '\0'
            ((SingleItemRecyclerAdapter)mAdapter).notifySingleItemChanged();
            return;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((String) (obj)).equals("SINGLE_CARD"))
        {
            i = 0;
        }
          goto _L3
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void onCardRemoved(ExtendedAppContentCard extendedappcontentcard)
    {
        String s;
        byte byte0;
        if (mAdapter == null)
        {
            return;
        }
        s = mSection.getType();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 450273447 450273447: default 44
    //                   450273447 77;
           goto _L1 _L2
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 64
    //                   0 91;
           goto _L3 _L4
_L3:
        mDataBuffer.filterOut(extendedappcontentcard);
_L5:
        updateHeader();
        return;
_L2:
        if (s.equals("SINGLE_CARD"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        ((SingleItemRecyclerAdapter)mAdapter).setVisible(false);
          goto _L5
    }

    public final void setSectionData(AppContentSection appcontentsection)
    {
        if (!appcontentsection.getType().equals(mSection.getType()) || !appcontentsection.getCardType().equals(mSection.getCardType()))
        {
            GamesLog.e("ExAppContentSection", (new StringBuilder("Attempting to update section [")).append(mSection.getType()).append(", ").append(mSection.getCardType()).append("] with new data [").append(appcontentsection.getType()).append(", ").append(appcontentsection.getCardType()).append("]").toString());
            return;
        }
        if (shouldDeferNewData())
        {
            mPendingSectionData = appcontentsection;
            return;
        }
        mPendingSectionData = null;
        mFragment.saveStateForSection(this);
        mSection = appcontentsection;
        mHideIfEmpty = AppContentUtils.getBooleanExtra$1c5c0af(mSection.getExtras(), "hideIfEmpty");
        createActions();
        if (mSection.getType().equals("SINGLE_CARD"))
        {
            appcontentsection = new ExtendedAppContentCard(this, (AppContentCard)mSection.getCards().get(0), this);
            ((SingleItemRecyclerAdapter)mAdapter).setCard(appcontentsection);
        } else
        {
            setSectionDataCardList();
        }
        updateHeader();
        mFragment.loadStateForSection(this);
    }



/*
    static AppContentSection access$002$50a1bd92(ExtendedAppContentSection extendedappcontentsection)
    {
        extendedappcontentsection.mPendingSectionData = null;
        return null;
    }

*/
}
