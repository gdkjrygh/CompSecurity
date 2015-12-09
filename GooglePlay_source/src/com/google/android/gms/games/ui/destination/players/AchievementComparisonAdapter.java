// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.text.NumberFormat;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            BaseAchievementComparisonItem

public final class AchievementComparisonAdapter extends OnyxCardAdapter
{
    public static interface AchievementComparisonEventListener
    {

        public abstract void onAchievementComparisonClicked(BaseAchievementComparisonItem baseachievementcomparisonitem);
    }

    private static final class AchievementComparisonViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        private final MetagameAvatarView mPlayerMe;
        private final MetagameAvatarView mPlayerThem;

        private static void setAvatarSizes(MetagameAvatarView metagameavatarview)
        {
            metagameavatarview.setShadowStrokeWidthResId(0x7f0c007b);
            metagameavatarview.setOutlineStrokeWidthResId(0x7f0c007d);
        }

        protected final View createCustomView(int i)
        {
            if (i == 0x7f0d000a)
            {
                return View.inflate(mContext, 0x7f04001d, null);
            } else
            {
                throw new IllegalArgumentException((new StringBuilder("Unknown image view type received: ")).append(i).toString());
            }
        }

        public final void onRootViewClicked()
        {
            ((AchievementComparisonAdapter)mAdapter).mListener.onAchievementComparisonClicked((BaseAchievementComparisonItem)getData());
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            BaseAchievementComparisonItem baseachievementcomparisonitem;
            Resources resources;
            baseachievementcomparisonitem = (BaseAchievementComparisonItem)obj;
            super.populateViews(gamesrecycleradapter, i, baseachievementcomparisonitem);
            gamesrecycleradapter = (AchievementComparisonAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, gamesrecycleradapter, gamesrecycleradapter.getLogflowUiElementType(), 1059, baseachievementcomparisonitem);
            resources = mContext.getResources();
            mPlayerMe.setData(baseachievementcomparisonitem.playerMe, false);
            mPlayerThem.setData(baseachievementcomparisonitem.playerThem, false);
            if (baseachievementcomparisonitem.myAchievementState == 0 && baseachievementcomparisonitem.theirAchievementState == 0)
            {
                mPlayerMe.setAlpha(1.0F);
                mPlayerThem.setAlpha(1.0F);
                gamesrecycleradapter = resources.getString(0x7f10029b);
            } else
            if (baseachievementcomparisonitem.myAchievementState == 0)
            {
                mPlayerMe.setAlpha(1.0F);
                mPlayerThem.setAlpha(0.15F);
                gamesrecycleradapter = resources.getString(0x7f10029d);
            } else
            if (baseachievementcomparisonitem.theirAchievementState == 0)
            {
                mPlayerMe.setAlpha(0.15F);
                mPlayerThem.setAlpha(1.0F);
                gamesrecycleradapter = resources.getString(0x7f10029c);
            } else
            {
                mPlayerMe.setAlpha(0.15F);
                mPlayerThem.setAlpha(0.15F);
                gamesrecycleradapter = resources.getString(0x7f10029a);
            }
            setImagePaddingEnabled(true);
            baseachievementcomparisonitem.myAchievementState;
            JVM INSTR tableswitch 0 2: default 152
        //                       0 281
        //                       1 410
        //                       2 424;
               goto _L1 _L2 _L3 _L4
_L4:
            break MISSING_BLOCK_LABEL_424;
_L1:
            throw new IllegalArgumentException((new StringBuilder("Unknown achievement state ")).append(baseachievementcomparisonitem.myAchievementState).toString());
_L2:
            setImage(baseachievementcomparisonitem.unlockedUri, 0x7f0200ee);
_L5:
            if (baseachievementcomparisonitem.myAchievementState != 2)
            {
                setTitle(baseachievementcomparisonitem.name);
                setSubtitle(baseachievementcomparisonitem.description);
                long l = baseachievementcomparisonitem.xp;
                if (l > 0L)
                {
                    setSecondaryLabel(resources.getString(0x7f10008a, new Object[] {
                        NumberFormat.getInstance().format(l)
                    }));
                }
                obj = String.valueOf(l);
            } else
            {
                setTitle(0x7f100090);
                setSubtitle(0x7f10008f);
                obj = "";
            }
            setRootViewContentDescription(resources.getString(0x7f100299, new Object[] {
                baseachievementcomparisonitem.name, gamesrecycleradapter, baseachievementcomparisonitem.description, obj, ""
            }));
            return;
_L3:
            setImage(baseachievementcomparisonitem.revealedUri, 0x7f0200ec);
              goto _L5
            setImage(null, 0x7f0200eb);
              goto _L5
        }

        public AchievementComparisonViewHolder(View view)
        {
            super(view);
            view = (View)super.mCustomViewRecycler.get(0x7f0d000a);
            if (view == null)
            {
                view = createCustomView(0x7f0d000a);
                Asserts.checkNotNull(view, (new StringBuilder("Custom Label View created for labelViewType 2131558410")).append(" cannot be null").toString());
                super.mCustomViewRecycler.put(0x7f0d000a, view);
            }
            if (super.mOnyxView instanceof com.google.android.gms.games.ui.card.OnyxCardViewDefinition.HasCustomPrimaryLabel)
            {
                ((com.google.android.gms.games.ui.card.OnyxCardViewDefinition.HasCustomPrimaryLabel)super.mOnyxView).setCustomPrimaryLabelView(view);
            }
            mPlayerMe = (MetagameAvatarView)view.findViewById(0x7f0d00e2);
            setAvatarSizes(mPlayerMe);
            mPlayerThem = (MetagameAvatarView)view.findViewById(0x7f0d00e3);
            setAvatarSizes(mPlayerThem);
        }
    }


    private final AchievementComparisonEventListener mListener;

    public AchievementComparisonAdapter(Context context, AchievementComparisonEventListener achievementcomparisoneventlistener)
    {
        super(context);
        mListener = (AchievementComparisonEventListener)Preconditions.checkNotNull(achievementcomparisoneventlistener);
    }

    protected final int getCardType()
    {
        return 3;
    }

    protected final int getDataType()
    {
        return 0x7f0d002b;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new AchievementComparisonViewHolder(view);
    }


}
