// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertController;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.game.GameBadge;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.SingleItemRecyclerAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivityBase;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

public final class GameDetailAboutFragment extends GamesHeaderRecyclerViewFragment
    implements android.view.View.OnClickListener, LoggablePage, com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnPageScrolledToListener
{
    private static final class BadgeRowAdapter extends ArrayAdapter
    {

        private final LayoutInflater mLayoutInflater;

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = mLayoutInflater.inflate(0x7f040048, viewgroup, false);
            }
            viewgroup = (BadgeRowHolder)view1.getTag();
            view = viewgroup;
            if (viewgroup == null)
            {
                view = new BadgeRowHolder(view1);
            }
            viewgroup = (GameBadge)getItem(i);
            ((BadgeRowHolder) (view)).badgeTitle.setText(viewgroup.getTitle());
            ((BadgeRowHolder) (view)).badgeDescription.setText(viewgroup.getDescription());
            ((BadgeRowHolder) (view)).badgeThumbnail.loadUri$3329f911(viewgroup.getIconImageUri(), 0, true);
            return view1;
        }

        public BadgeRowAdapter(Context context)
        {
            super(context, 0);
            mLayoutInflater = LayoutInflater.from(context);
        }
    }

    private static final class BadgeRowHolder
    {

        public final TextView badgeDescription;
        public final LoadingImageView badgeThumbnail;
        public final TextView badgeTitle;

        public BadgeRowHolder(View view)
        {
            badgeThumbnail = (LoadingImageView)view.findViewById(0x7f0d0116);
            badgeTitle = (TextView)view.findViewById(0x7f0d0117);
            badgeDescription = (TextView)view.findViewById(0x7f0d0118);
            view.setTag(this);
        }
    }

    public static final class GameDetailAboutBadgeDialogFragment extends GamesDialogFragment
    {

        public static GameDetailAboutBadgeDialogFragment newInstance(String s, ArrayList arraylist)
        {
            Bundle bundle = new Bundle();
            bundle.putString("title", s);
            bundle.putParcelableArrayList("badgeList", arraylist);
            s = new GameDetailAboutBadgeDialogFragment();
            s.setArguments(bundle);
            return s;
        }

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            bundle = super.mArguments;
            BadgeRowAdapter badgerowadapter = new BadgeRowAdapter(super.mActivity);
            ArrayList arraylist = bundle.getParcelableArrayList("badgeList");
            int i = 0;
            for (int j = arraylist.size(); i < j; i++)
            {
                badgerowadapter.add(arraylist.get(i));
            }

            return gamesdialogbuilder.setTitle(bundle.getString("title")).setAdapter(badgerowadapter, null).setCancelable(true);
        }

        protected final void onPostCreateDialog(AlertDialog alertdialog)
        {
            super.onPostCreateDialog(alertdialog);
            alertdialog = alertdialog.mAlert.mListView;
            alertdialog.setDivider(null);
            alertdialog.setSelector(0x106000d);
            int i = getResources().getDimensionPixelSize(0x7f0c00b8);
            alertdialog.setPadding(0, i, 0, i);
        }

        public GameDetailAboutBadgeDialogFragment()
        {
        }
    }

    private final class GameDetailsAboutAdapter extends SingleItemRecyclerAdapter
    {

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

        protected final com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder onCreateItemViewHolder(ViewGroup viewgroup)
        {
            return new GameDetailViewHolder(mInflater.inflate(0x7f040057, viewgroup, false));
        }



/*
        static TextView access$002(GameDetailsAboutAdapter gamedetailsaboutadapter, TextView textview)
        {
            gamedetailsaboutadapter.mDescriptionView = textview;
            return textview;
        }

*/



/*
        static View access$102(GameDetailsAboutAdapter gamedetailsaboutadapter, View view)
        {
            gamedetailsaboutadapter.mViewInPlayerStoreButton = view;
            return view;
        }

*/




/*
        static View access$202(GameDetailsAboutAdapter gamedetailsaboutadapter, View view)
        {
            gamedetailsaboutadapter.mViewInPlayerStoreButtonDividerView = view;
            return view;
        }

*/



/*
        static View access$302(GameDetailsAboutAdapter gamedetailsaboutadapter, View view)
        {
            gamedetailsaboutadapter.mShareButton = view;
            return view;
        }

*/



/*
        static View access$402(GameDetailsAboutAdapter gamedetailsaboutadapter, View view)
        {
            gamedetailsaboutadapter.mBadgeContainer = view;
            return view;
        }

*/



/*
        static View access$502(GameDetailsAboutAdapter gamedetailsaboutadapter, View view)
        {
            gamedetailsaboutadapter.mBadgeHeaderView = view;
            return view;
        }

*/

        public GameDetailsAboutAdapter(Context context)
        {
            this$0 = GameDetailAboutFragment.this;
            super(context);
        }
    }

    private final class GameDetailsAboutAdapter.GameDetailViewHolder extends com.google.android.gms.games.ui.SingleItemRecyclerAdapter.SingleItemViewHolder
    {

        final GameDetailsAboutAdapter this$1;

        private void setBadgeUiVisible(boolean flag)
        {
            UiUtils.setVisible(flag, 8, new View[] {
                mBadgeHeaderView, mBadgeRows
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
                mImageManager.loadImage(new com.google.android.gms.common.images.ImageRequest.ImageViewImageRequest(view, gamebadge));
            }
        }

        public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
        {
            mGame = mParent.mCurrentGame;
            if (mGame != null)
            {
                TextView textview = mDescriptionView;
                gamesrecycleradapter = mGame;
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
                if (mGame.getInstancePackageName() == null)
                {
                    mViewInPlayerStoreButton.setVisibility(8);
                    mViewInPlayerStoreButtonDividerView.setVisibility(8);
                }
            }
            gamesrecycleradapter = mParent.mStateManager.mCurrentExtendedGame;
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
                preprocessBadges(gamesrecycleradapter);
                Object obj;
                int j;
                int l;
                int i1;
                if (mHeaderBadge != null)
                {
                    updateBadgeView(mBadgeHeaderView, mHeaderBadge);
                } else
                {
                    mBadgeHeaderView.setVisibility(8);
                }
                l = getResources().getInteger(0x7f0e0008);
                mBadgeRows.removeAllViews();
                i1 = mRegularBadges.size();
                j = 0;
                i = 0;
                obj = null;
                while (j < i1) 
                {
                    GameBadge gamebadge = (GameBadge)mRegularBadges.get(j);
                    gamesrecycleradapter = ((GamesRecyclerAdapter) (obj));
                    if (obj == null)
                    {
                        gamesrecycleradapter = new LinearLayout(mParent);
                        gamesrecycleradapter.setOrientation(0);
                        gamesrecycleradapter.setClickable(false);
                        gamesrecycleradapter.setFocusable(false);
                        gamesrecycleradapter.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0F));
                        mBadgeRows.addView(gamesrecycleradapter);
                    }
                    obj = 
// JavaClassFileOutputException: get_constant: invalid tag

        public GameDetailsAboutAdapter.GameDetailViewHolder(View view)
        {
            this$1 = GameDetailsAboutAdapter.this;
            super(view);
            mDescriptionView = (TextView)view.findViewById(0x7f0d0152);
            mViewInPlayerStoreButton = view.findViewById(0x7f0d014b);
            mViewInPlayerStoreButton.setOnClickListener(_fld0);
            mViewInPlayerStoreButtonDividerView = view.findViewById(0x7f0d014d);
            mShareButton = view.findViewById(0x7f0d014c);
            mShareButton.setOnClickListener(_fld0);
            mBadgeContainer = view.findViewById(0x7f0d014e);
            mBadgeHeaderView = view.findViewById(0x7f0d014f);
            mBadgeRows = (LinearLayout)view.findViewById(0x7f0d0150);
            mBadgeContainer.setOnClickListener(_fld0);
        }
    }


    GameDetailsAboutAdapter mAdapter;
    private LinearLayout mBadgeRows;
    Game mGame;
    private GameBadge mHeaderBadge;
    private ImageManager mImageManager;
    GameDetailActivity mParent;
    private ArrayList mRegularBadges;

    public GameDetailAboutFragment()
    {
    }

    private void preprocessBadges(ArrayList arraylist)
    {
        mHeaderBadge = null;
        mRegularBadges = new ArrayList(arraylist.size());
        int i = 0;
        int j = arraylist.size();
        while (i < j) 
        {
            GameBadge gamebadge = (GameBadge)arraylist.get(i);
            if (gamebadge.getType() == 0)
            {
                mHeaderBadge = gamebadge;
            } else
            {
                mRegularBadges.add(gamebadge);
            }
            i++;
        }
    }

    protected final int getPlaylogElementType()
    {
        return 2;
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        if (mParent != null)
        {
            powerupplaylogger.logGameAction(mParent.mCurrentGame, 1, false);
        }
    }

    public final void onActivityCreated(Bundle bundle)
    {
        onActivityCreated(bundle);
        mParent = (GameDetailActivity)super.mActivity;
        mImageManager = ImageManager.create(mParent);
        mAdapter = new GameDetailsAboutAdapter(super.mActivity);
        if (PlatformVersion.checkVersion(21) && bundle == null && super.mActivity.getIntent().getIntExtra("com.google.android.gms.games.ANIMATION", -1) != -1)
        {
            postponeInitialReveal();
        }
        setAdapter(mAdapter);
        logPageView(((DestinationFragmentActivityBase) (mParent)).mPlayLogger);
        mLoadingDataViewManager.setViewState(2);
    }

    public final void onClick(View view)
    {
        Object obj = view.getTag();
        if (obj != null)
        {
            Asserts.checkState(obj instanceof GameFirstParty);
            Object obj1 = ((GameFirstParty)obj).getSnapshot();
            Asserts.checkNotNull(obj1);
            obj = mParent.mCurrentAccountName;
            mParent.logClickEvent(802, view);
            UiUtils.launchGameForSnapshot(mParent, ((String) (obj)), mGame, ((SnapshotMetadata) (obj1)));
            view = ((DestinationFragmentActivityBase) (mParent)).mPlayLogger;
            obj = mGame;
            obj1 = ((SnapshotMetadata) (obj1)).getSnapshotId();
            String s = ((Game) (obj)).getInstancePackageName();
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new PlaylogGamesExtension();
            playloggamesextension.requestInfo = view.getRequestInfo(s);
            playloggamesextension.requestInfo.applicationId = ((Game) (obj)).getApplicationId();
            playloggamesextension.snapshot = new PlaylogGamesSnapshotAction();
            playloggamesextension.snapshot.actionType = 4;
            playloggamesextension.snapshot.snapshotId = ((String) (obj1));
            playloggamesextension.snapshot.source = 1;
            playloggamesextension.snapshot.coverImageFingerprintMd5 = "";
            view.logEventInternal(playloggamesextension);
        } else
        {
            switch (view.getId())
            {
            case 2131558733: 
            default:
                return;

            case 2131558731: 
                mParent.logClickEvent(503, view);
                UiUtils.viewInPlayStore(mParent, mGame.getInstancePackageName(), "GPG_gameDetail_about");
                return;

            case 2131558732: 
                mParent.logClickEvent(507, view);
                mParent.shareGame(mGame.getDisplayName(), mGame.getInstancePackageName());
                return;

            case 2131558734: 
                mParent.logClickEvent(801, view);
                break;
            }
            preprocessBadges(mParent.mStateManager.mCurrentExtendedGame.getBadges());
            if (mRegularBadges.size() > 0 && mHeaderBadge != null)
            {
                view = GameDetailAboutBadgeDialogFragment.newInstance(mHeaderBadge.getTitle(), mRegularBadges);
                DialogFragmentUtil.show(mParent, view, "showBadgesDialog");
                return;
            }
        }
    }

    public final void onPageScrolledTo()
    {
        logPageView(((DestinationFragmentActivityBase) (mParent)).mPlayLogger);
    }

    public final void onPageSelected()
    {
    }

    public final void onRetry()
    {
    }






/*
    static LinearLayout access$602(GameDetailAboutFragment gamedetailaboutfragment, LinearLayout linearlayout)
    {
        gamedetailaboutfragment.mBadgeRows = linearlayout;
        return linearlayout;
    }

*/



/*
    static Game access$702(GameDetailAboutFragment gamedetailaboutfragment, Game game)
    {
        gamedetailaboutfragment.mGame = game;
        return game;
    }

*/


}
