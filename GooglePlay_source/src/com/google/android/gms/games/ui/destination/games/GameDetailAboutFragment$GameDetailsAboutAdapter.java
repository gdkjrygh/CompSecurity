// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.game.GameBadge;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailAboutFragment, GameDetailActivity

private final class this._cls0 extends SingleItemRecyclerAdapter
{
    private final class GameDetailViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        final GameDetailAboutFragment.GameDetailsAboutAdapter this$1;

        private void setBadgeUiVisible(boolean flag)
        {
            UiUtils.setVisible(flag, 8, new View[] {
                mBadgeHeaderView, GameDetailAboutFragment.access$600(this$0)
            });
        }

        private void updateBadgeView(View view, GameBadge gamebadge)
        {
            Asserts.checkNotNull(view);
            Asserts.checkNotNull(gamebadge);
            TextView textview = (TextView)view.findViewById(0x7f0d0117);
            Asserts.checkNotNull(textview);
            textview.setText(gamebadge.getTitle());
            view = (ImageView)view.findViewById(0x7f0d0164);
            if (view != null)
            {
                gamebadge = gamebadge.getIconImageUri();
                GameDetailAboutFragment.access$1300(this$0).loadImage(new com.google.android.gms.common.images.ImageRequest.ImageViewImageRequest(view, gamebadge));
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            GameDetailAboutFragment.access$702(this$0, GameDetailAboutFragment.access$800(this$0).mCurrentGame);
            if (GameDetailAboutFragment.access$700(this$0) != null)
            {
                TextView textview = mDescriptionView;
                gamesrecycleradapter = GameDetailAboutFragment.access$700(this$0);
                if (gamesrecycleradapter == null)
                {
                    gamesrecycleradapter = null;
                } else
                {
                    gamesrecycleradapter = gamesrecycleradapter.getDescription();
                    if (gamesrecycleradapter == null)
                    {
                        gamesrecycleradapter = null;
                    } else
                    {
                        gamesrecycleradapter = Html.fromHtml(gamesrecycleradapter.replace("\n", "<br />"));
                    }
                }
                textview.setText(gamesrecycleradapter);
                if (GameDetailAboutFragment.access$700(this$0).getInstancePackageName() == null)
                {
                    mViewInPlayerStoreButton.setVisibility(8);
                    mViewInPlayerStoreButtonDividerView.setVisibility(8);
                }
            }
            gamesrecycleradapter = GameDetailAboutFragment.access$800(this$0).mStateManager.mCurrentExtendedGame;
            if (gamesrecycleradapter == null)
            {
                setBadgeUiVisible(false);
            } else
            {
                gamesrecycleradapter = gamesrecycleradapter.getBadges();
                Asserts.checkNotNull(gamesrecycleradapter);
                if (gamesrecycleradapter.size() == 0)
                {
                    setBadgeUiVisible(false);
                    return;
                }
                setBadgeUiVisible(true);
                GameDetailAboutFragment.access$900(this$0, gamesrecycleradapter);
                Object obj;
                int j;
                int l;
                int i1;
                if (GameDetailAboutFragment.access$1000(this$0) != null)
                {
                    updateBadgeView(mBadgeHeaderView, GameDetailAboutFragment.access$1000(this$0));
                } else
                {
                    mBadgeHeaderView.setVisibility(8);
                }
                l = getResources().getInteger(0x7f0e0008);
                GameDetailAboutFragment.access$600(this$0).removeAllViews();
                i1 = GameDetailAboutFragment.access$1100(this$0).size();
                j = 0;
                i = 0;
                obj = null;
                while (j < i1) 
                {
                    GameBadge gamebadge = (GameBadge)GameDetailAboutFragment.access$1100(this$0).get(j);
                    gamesrecycleradapter = ((GamesRecyclerAdapter) (obj));
                    if (obj == null)
                    {
                        gamesrecycleradapter = new LinearLayout(GameDetailAboutFragment.access$800(this$0));
                        gamesrecycleradapter.setOrientation(0);
                        gamesrecycleradapter.setClickable(false);
                        gamesrecycleradapter.setFocusable(false);
                        gamesrecycleradapter.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0F));
                        GameDetailAboutFragment.access$600(this$0).addView(gamesrecycleradapter);
                    }
                    obj = 
// JavaClassFileOutputException: get_constant: invalid tag

        public GameDetailViewHolder(View view)
        {
            this$1 = GameDetailAboutFragment.GameDetailsAboutAdapter.this;
            super(view);
            mDescriptionView = (TextView)view.findViewById(0x7f0d0152);
            mViewInPlayerStoreButton = view.findViewById(0x7f0d014b);
            mViewInPlayerStoreButton.setOnClickListener(this$0);
            mViewInPlayerStoreButtonDividerView = view.findViewById(0x7f0d014d);
            mShareButton = view.findViewById(0x7f0d014c);
            mShareButton.setOnClickListener(this$0);
            mBadgeContainer = view.findViewById(0x7f0d014e);
            mBadgeHeaderView = view.findViewById(0x7f0d014f);
            GameDetailAboutFragment.access$602(this$0, (LinearLayout)view.findViewById(0x7f0d0150));
            mBadgeContainer.setOnClickListener(this$0);
        }
    }


    private View mBadgeContainer;
    private View mBadgeHeaderView;
    private TextView mDescriptionView;
    private View mShareButton;
    private View mViewInPlayerStoreButton;
    private View mViewInPlayerStoreButtonDividerView;
    final GameDetailAboutFragment this$0;

    public final int getItemViewType()
    {
        return 0x7f040057;
    }

    public final int getTopPaddingResId()
    {
        return 0x7f0c0130;
    }

    protected final com.google.android.gms.games.ui.tailsAboutAdapter onCreateItemViewHolder(ViewGroup viewgroup)
    {
        return new GameDetailViewHolder(mInflater.inflate(0x7f040057, viewgroup, false));
    }



/*
    static TextView access$002(GameDetailViewHolder gamedetailviewholder, TextView textview)
    {
        gamedetailviewholder.mDescriptionView = textview;
        return textview;
    }

*/



/*
    static View access$102(mDescriptionView mdescriptionview, View view)
    {
        mdescriptionview.mViewInPlayerStoreButton = view;
        return view;
    }

*/




/*
    static View access$202(mViewInPlayerStoreButton mviewinplayerstorebutton, View view)
    {
        mviewinplayerstorebutton.mViewInPlayerStoreButtonDividerView = view;
        return view;
    }

*/



/*
    static View access$302(mViewInPlayerStoreButtonDividerView mviewinplayerstorebuttondividerview, View view)
    {
        mviewinplayerstorebuttondividerview.mShareButton = view;
        return view;
    }

*/



/*
    static View access$402(mShareButton msharebutton, View view)
    {
        msharebutton.mBadgeContainer = view;
        return view;
    }

*/



/*
    static View access$502(mBadgeContainer mbadgecontainer, View view)
    {
        mbadgecontainer.mBadgeHeaderView = view;
        return view;
    }

*/

    public this._cls0(Context context)
    {
        this$0 = GameDetailAboutFragment.this;
        super(context);
    }
}
