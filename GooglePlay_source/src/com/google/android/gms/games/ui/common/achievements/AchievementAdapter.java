// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.achievements;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.format.DateUtils;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import java.text.NumberFormat;

// Referenced classes of package com.google.android.gms.games.ui.common.achievements:
//            AchievementProgressView

public final class AchievementAdapter extends OnyxCardAdapter
{
    public static interface AchievementEventListener
    {

        public abstract void onAchievementClicked(Achievement achievement);
    }

    private static final class AchievementViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        protected final View createCustomView(int i)
        {
            if (i == 0x7f0d000b)
            {
                AchievementProgressView achievementprogressview = new AchievementProgressView(mContext);
                achievementprogressview.setTextAppearance(mContext, 0x7f110097);
                android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
                achievementprogressview.setGravity(17);
                achievementprogressview.setLayoutParams(layoutparams);
                achievementprogressview.setId(0x7f0d0111);
                return achievementprogressview;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Unknown image view type received: ")).append(i).toString());
            }
        }

        public final void onRootViewClicked()
        {
            ((AchievementAdapter)mAdapter).mListener.onAchievementClicked((Achievement)getData());
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            Object obj2;
            Resources resources;
            int j;
            obj2 = (Achievement)obj;
            super.populateViews(gamesrecycleradapter, i, obj2);
            gamesrecycleradapter = (AchievementAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1050, obj2);
            setRootViewClickable(true);
            j = ((Achievement) (obj2)).getState();
            i = ((Achievement) (obj2)).getType();
            resources = mContext.getResources();
            setImagePaddingEnabled(true);
            if (i == 1 && j == 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                break MISSING_BLOCK_LABEL_435;
            }
            if (j == 0)
            {
                i = 255;
            } else
            {
                i = Color.alpha(resources.getColor(0x7f0b0228));
            }
            setImageAlpha(i);
            j;
            JVM INSTR tableswitch 0 2: default 136
        //                       0 180
        //                       1 389
        //                       2 408;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Unknown achievement state ")).append(j).toString());
_L2:
            setImage(((Achievement) (obj2)).getUnlockedImageUri(), 0x7f0200ee);
            gamesrecycleradapter = DateUtils.formatDateTime(mContext, ((Achievement) (obj2)).getLastUpdatedTimestamp(), 0x80000);
            setPrimaryLabel(gamesrecycleradapter);
            setPrimaryLabelColorResId(0x7f0b024d);
_L5:
            Object obj1;
            if (j == 0)
            {
                obj = resources.getString(0x7f100295);
                obj1 = gamesrecycleradapter;
            } else
            {
                obj = resources.getString(0x7f100294);
                obj1 = gamesrecycleradapter;
            }
_L6:
            if (((Achievement) (obj2)).getState() != 2)
            {
                gamesrecycleradapter = getTitleViewBuffer();
                ((Achievement) (obj2)).getName(gamesrecycleradapter);
                setTitle(gamesrecycleradapter);
                gamesrecycleradapter = getSubtitleViewBuffer();
                ((Achievement) (obj2)).getDescription(gamesrecycleradapter);
                setSubtitle(gamesrecycleradapter);
                long l1 = ((Achievement) (obj2)).getXpValue();
                String s;
                Object obj3;
                int k;
                int l;
                if (l1 > 0L)
                {
                    gamesrecycleradapter = resources.getString(0x7f10009b, new Object[] {
                        NumberFormat.getInstance().format(l1)
                    });
                    setSecondaryLabel(gamesrecycleradapter);
                } else
                {
                    gamesrecycleradapter = "";
                }
                obj3 = ((Achievement) (obj2)).getName();
                s = ((Achievement) (obj2)).getDescription();
                obj2 = gamesrecycleradapter;
            } else
            {
                setTitle(0x7f100090);
                setSubtitle(0x7f10008f);
                gamesrecycleradapter = resources.getString(0x7f100090);
                s = resources.getString(0x7f10008f);
                obj2 = "";
                obj3 = gamesrecycleradapter;
            }
            setRootViewContentDescription(resources.getString(0x7f100293, new Object[] {
                obj3, s, obj, obj2, obj1
            }));
            return;
_L3:
            setImage(((Achievement) (obj2)).getRevealedImageUri(), 0x7f0200ec);
            gamesrecycleradapter = "";
              goto _L5
_L4:
            setImage(null, 0x7f0200eb);
            gamesrecycleradapter = "";
              goto _L5
            k = ((Achievement) (obj2)).getCurrentSteps();
            l = ((Achievement) (obj2)).getTotalSteps();
            i = l;
            if (l <= 0)
            {
                GamesLog.w("AchievementAdapter", (new StringBuilder("Inconsistent achievement ")).append(obj2).append(": TYPE_INCREMENTAL, but totalSteps = ").append(l).toString());
                i = 1;
            }
            if (k >= i)
            {
                GamesLog.w("AchievementAdapter", (new StringBuilder("Inconsistent achievement ")).append(obj2).append(": STATE_REVEALED, but steps = ").append(k).append(" / ").append(i).toString());
                k = i;
            }
            gamesrecycleradapter = (AchievementProgressView)setCustomImage(0x7f0d000b);
            gamesrecycleradapter.setSteps(k, i);
            obj = gamesrecycleradapter.getPercentageText(k, i);
            obj1 = "";
              goto _L6
        }

        public AchievementViewHolder(View view)
        {
            super(view);
        }
    }


    private final AchievementEventListener mListener;

    public AchievementAdapter(Context context, AchievementEventListener achievementeventlistener)
    {
        super(context);
        mListener = (AchievementEventListener)Preconditions.checkNotNull(achievementeventlistener);
    }

    protected final int getCardType()
    {
        return 3;
    }

    protected final int getDataType()
    {
        return 0x7f0d002a;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new AchievementViewHolder(view);
    }


}
