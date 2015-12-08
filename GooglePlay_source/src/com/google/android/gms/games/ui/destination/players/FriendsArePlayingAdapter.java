// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.LogflowEventListener;
import com.google.android.gms.games.ui.card.OnyxCardAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            FriendsArePlaying

public final class FriendsArePlayingAdapter extends OnyxCardAdapter
{
    public static interface FriendsArePlayingEventListener
    {

        public abstract void onFriendsArePlayingGameClicked(FriendsArePlaying friendsareplaying, SharedElementTransition sharedelementtransition);
    }

    public static final class FriendsArePlayingViewHolder extends com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder
    {

        public final volatile void addBannerImageSharedViews(SharedElementTransition sharedelementtransition)
        {
            super.addBannerImageSharedViews(sharedelementtransition);
        }

        public final volatile void addTitleIconSharedViews(SharedElementTransition sharedelementtransition)
        {
            super.addTitleIconSharedViews(sharedelementtransition);
        }

        public final volatile void attachUiNodeToView(View view, int i)
        {
            super.attachUiNodeToView(view, i);
        }

        public final volatile SharedElementTransition getSharedElementTransition()
        {
            return super.getSharedElementTransition();
        }

        public final volatile CharArrayBuffer getSubtitleViewBuffer()
        {
            return super.getSubtitleViewBuffer();
        }

        public final volatile CharArrayBuffer getTitleViewBuffer()
        {
            return super.getTitleViewBuffer();
        }

        public final volatile void hideSubtitle()
        {
            super.hideSubtitle();
        }

        public final volatile void onAvatarOthersViewClicked()
        {
            super.onAvatarOthersViewClicked();
        }

        public final volatile void onAvatarViewClicked(int i)
        {
            super.onAvatarViewClicked(i);
        }

        public final volatile void onImageOverlayIconClicked()
        {
            super.onImageOverlayIconClicked();
        }

        public final volatile void onImageViewClicked()
        {
            super.onImageViewClicked();
        }

        public final volatile boolean onMenuItemClick(MenuItem menuitem)
        {
            return super.onMenuItemClick(menuitem);
        }

        public final volatile void onPrimaryActionClicked()
        {
            super.onPrimaryActionClicked();
        }

        public final void onRootViewClicked()
        {
            FriendsArePlayingAdapter friendsareplayingadapter = (FriendsArePlayingAdapter)mAdapter;
            ((onImageOverlayIconClicked) (friendsareplayingadapter)).onImageOverlayIconClicked.logClick(itemView);
            friendsareplayingadapter.mListener.onFriendsArePlayingGameClicked((FriendsArePlaying)getData(), super.getSharedElementTransition());
        }

        public final volatile void onSecondaryActionClicked()
        {
            super.onSecondaryActionClicked();
        }

        public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            Resources resources;
            FriendsArePlaying friendsareplaying;
            int j;
            friendsareplaying = (FriendsArePlaying)obj;
            super.populateViews(gamesrecycleradapter, i, friendsareplaying);
            obj = (FriendsArePlayingAdapter)mAdapter;
            LogflowUiUtils.setupLogflowAndImpressView(itemView, ((GamesRecyclerAdapter) (obj)), ((FriendsArePlayingAdapter) (obj)).getLogflowUiElementType(), 1011, friendsareplaying);
            obj = friendsareplaying.mostRecentGameInfo;
            super.setHeroTransitionNames(((MostRecentGameInfo) (obj)).getGameId());
            resources = mContext.getResources();
            i = ((FriendsArePlayingAdapter)gamesrecycleradapter).mCardType;
            boolean flag;
            if (i == 2 || i == 1)
            {
                super.setImage(((MostRecentGameInfo) (obj)).getGameIconImageUri(), 0x7f0200da);
                super.setImageAspectRatio(1.0F);
            } else
            {
                gamesrecycleradapter = ((MostRecentGameInfo) (obj)).getGameFeaturedImageUri();
                if (!PlatformVersion.checkVersion(11))
                {
                    gamesrecycleradapter = null;
                }
                super.setImage(gamesrecycleradapter, 0x7f0201e0);
                super.setImageAspectRatio(2.048F);
            }
            super.setIconImage(((MostRecentGameInfo) (obj)).getGameIconImageUri(), 0x7f0200da);
            super.setTitle(((MostRecentGameInfo) (obj)).getGameName());
            super.hideSubtitle();
            j = friendsareplaying.playerList.size();
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            super.setSnippetImage((Player)friendsareplaying.playerList.get(0));
            gamesrecycleradapter = ((Player)friendsareplaying.playerList.get(0)).getDisplayName();
            if (i != 1) goto _L2; else goto _L1
_L1:
            super.setSnippetTitle(resources.getQuantityString(0x7f0f0000, 1));
            super.setSnippetTitleSingleLine(true);
_L4:
            super.setRootViewContentDescription(mContext.getString(0x7f1000f8, new Object[] {
                ((MostRecentGameInfo) (obj)).getGameName(), gamesrecycleradapter
            }));
            return;
_L2:
            if (j != 1)
            {
                break; /* Loop/switch isn't completed */
            }
_L5:
            super.setSnippetTitle(gamesrecycleradapter);
            super.setSnippetSubtitle(resources.getQuantityString(0x7f0f0000, j));
            super.setSnippetTitleSingleLine(true);
            super.setSnippetSubtitleSingleLine(true);
            if (true) goto _L4; else goto _L3
_L3:
            if (j == 2)
            {
                gamesrecycleradapter = resources.getString(0x7f1000c7, new Object[] {
                    gamesrecycleradapter, ((Player)friendsareplaying.playerList.get(1)).getDisplayName()
                });
            } else
            if (j < 99)
            {
                gamesrecycleradapter = resources.getString(0x7f1000c5, new Object[] {
                    gamesrecycleradapter, Integer.valueOf(j - 1)
                });
            } else
            {
                gamesrecycleradapter = resources.getString(0x7f1000c6, new Object[] {
                    gamesrecycleradapter
                });
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public final volatile void resizeSnippet()
        {
            super.resizeSnippet();
        }

        public final volatile void setAvatarRowClickListener(com.google.android.gms.games.ui.card.OnyxCardViewDefinition.AvatarRowClickListener avatarrowclicklistener)
        {
            super.setAvatarRowClickListener(avatarrowclicklistener);
        }

        public final volatile void setAvatarRowClickable(boolean flag)
        {
            super.setAvatarRowClickable(flag);
        }

        public final volatile void setAvatarRowData(ArrayList arraylist, int i)
        {
            super.setAvatarRowData(arraylist, i);
        }

        public final volatile void setAvatarRowDescription(String s)
        {
            super.setAvatarRowDescription(s);
        }

        public final volatile void setBannerImageClickListener(com.google.android.gms.games.ui.card.OnyxCardViewDefinition.BannerImageClickListener bannerimageclicklistener)
        {
            super.setBannerImageClickListener(bannerimageclicklistener);
        }

        public final volatile void setContextMenu(int i)
        {
            super.setContextMenu(i);
        }

        public final volatile void setContextMenuInflater(com.google.android.gms.games.ui.card.OnyxCardViewDefinition.ContextMenuInflater contextmenuinflater)
        {
            super.setContextMenuInflater(contextmenuinflater);
        }

        public final volatile void setContextMenuListener(android.support.v7.widget.PopupMenu.OnMenuItemClickListener onmenuitemclicklistener)
        {
            super.setContextMenuListener(onmenuitemclicklistener);
        }

        public final volatile void setCustomImage(View view)
        {
            super.setCustomImage(view);
        }

        public final volatile void setCustomPrimaryLabelView(View view)
        {
            super.setCustomPrimaryLabelView(view);
        }

        public final volatile void setHasLabel(boolean flag)
        {
            super.setHasLabel(flag);
        }

        public final volatile void setHeroTransitionNames(String s)
        {
            super.setHeroTransitionNames(s);
        }

        public final volatile void setIconImage(Uri uri, int i)
        {
            super.setIconImage(uri, i);
        }

        public final volatile void setImage(Uri uri, int i)
        {
            super.setImage(uri, i);
        }

        public final volatile void setImageAlpha(int i)
        {
            super.setImageAlpha(i);
        }

        public final volatile void setImageAspectRatio(float f)
        {
            super.setImageAspectRatio(f);
        }

        public final volatile void setImageCircleCropEnabled(boolean flag)
        {
            super.setImageCircleCropEnabled(flag);
        }

        public final volatile void setImageClickable(boolean flag)
        {
            super.setImageClickable(flag);
        }

        public final volatile void setImageContentDescription(String s)
        {
            super.setImageContentDescription(s);
        }

        public final volatile void setImageOverlayIconBackground(Drawable drawable)
        {
            super.setImageOverlayIconBackground(drawable);
        }

        public final volatile void setImageOverlayIconClickListener(com.google.android.gms.games.ui.card.OnyxCardViewDefinition.ImageOverlayIconClickListener imageoverlayiconclicklistener)
        {
            super.setImageOverlayIconClickListener(imageoverlayiconclicklistener);
        }

        public final volatile void setImageOverlayIconClickable(boolean flag)
        {
            super.setImageOverlayIconClickable(flag);
        }

        public final volatile void setImageOverlayIconContentDescription(int i)
        {
            super.setImageOverlayIconContentDescription(i);
        }

        public final volatile void setImageOverlayLeftText(String s)
        {
            super.setImageOverlayLeftText(s);
        }

        public final volatile void setImageOverlayProgressBar(int i, int j, int k, int l)
        {
            super.setImageOverlayProgressBar(i, j, k, l);
        }

        public final volatile void setImageOverlayRightText(String s)
        {
            super.setImageOverlayRightText(s);
        }

        public final volatile void setImagePaddingEnabled(boolean flag)
        {
            super.setImagePaddingEnabled(flag);
        }

        public final volatile void setPrimaryAction(int i)
        {
            super.setPrimaryAction(i);
        }

        public final volatile void setPrimaryActionClickListener(com.google.android.gms.games.ui.card.OnyxCardViewDefinition.PrimaryActionClickListener primaryactionclicklistener)
        {
            super.setPrimaryActionClickListener(primaryactionclicklistener);
        }

        public final volatile void setPrimaryActionClickable(boolean flag)
        {
            super.setPrimaryActionClickable(flag);
        }

        public final volatile void setPrimaryActionContentDescription(int i)
        {
            super.setPrimaryActionContentDescription(i);
        }

        public final volatile void setPrimaryLabel(int i)
        {
            super.setPrimaryLabel(i);
        }

        public final volatile void setPrimaryLabel(String s)
        {
            super.setPrimaryLabel(s);
        }

        public final volatile void setPrimaryLabelColorResId(int i)
        {
            super.setPrimaryLabelColorResId(i);
        }

        public final volatile void setPrimaryLabelContentDescription(String s)
        {
            super.setPrimaryLabelContentDescription(s);
        }

        public final volatile void setPrimaryLabelImage(int i)
        {
            super.setPrimaryLabelImage(i);
        }

        public final volatile void setRootViewAlpha(float f)
        {
            super.setRootViewAlpha(f);
        }

        public final volatile void setRootViewBackgroundColor(int i)
        {
            super.setRootViewBackgroundColor(i);
        }

        public final volatile void setRootViewClickable(boolean flag)
        {
            super.setRootViewClickable(flag);
        }

        public final volatile void setRootViewContentDescription(String s)
        {
            super.setRootViewContentDescription(s);
        }

        public final volatile void setRootViewFocusable(boolean flag)
        {
            super.setRootViewFocusable(flag);
        }

        public final volatile void setSecondaryAction(int i)
        {
            super.setSecondaryAction(i);
        }

        public final volatile void setSecondaryActionClickListener(com.google.android.gms.games.ui.card.OnyxCardViewDefinition.SecondaryActionClickListener secondaryactionclicklistener)
        {
            super.setSecondaryActionClickListener(secondaryactionclicklistener);
        }

        public final volatile void setSecondaryActionContentDescription(int i)
        {
            super.setSecondaryActionContentDescription(i);
        }

        public final volatile void setSecondaryLabel(String s)
        {
            super.setSecondaryLabel(s);
        }

        public final volatile void setSnippetImage(Player player)
        {
            super.setSnippetImage(player);
        }

        public final volatile void setSnippetSubtitle(String s)
        {
            super.setSnippetSubtitle(s);
        }

        public final volatile void setSnippetSubtitleSingleLine(boolean flag)
        {
            super.setSnippetSubtitleSingleLine(flag);
        }

        public final volatile void setSnippetTitle(String s)
        {
            super.setSnippetTitle(s);
        }

        public final volatile void setSnippetTitleSingleLine(boolean flag)
        {
            super.setSnippetTitleSingleLine(flag);
        }

        public final volatile void setSubtitle(int i)
        {
            super.setSubtitle(i);
        }

        public final volatile void setSubtitle(CharArrayBuffer chararraybuffer)
        {
            super.setSubtitle(chararraybuffer);
        }

        public final volatile void setSubtitle(String s)
        {
            super.setSubtitle(s);
        }

        public final volatile void setSubtitleColorResId(int i)
        {
            super.setSubtitleColorResId(i);
        }

        public final volatile void setTitle(int i)
        {
            super.setTitle(i);
        }

        public final volatile void setTitle(CharArrayBuffer chararraybuffer)
        {
            super.setTitle(chararraybuffer);
        }

        public final volatile void setTitle(String s)
        {
            super.setTitle(s);
        }

        public final volatile void setTitleColorResId(int i)
        {
            super.setTitleColorResId(i);
        }

        public final volatile void setTitleIconClickListener(com.google.android.gms.games.ui.card.OnyxCardViewDefinition.TitleIconClickListener titleiconclicklistener)
        {
            super.setTitleIconClickListener(titleiconclicklistener);
        }

        public FriendsArePlayingViewHolder(View view)
        {
            super(view);
        }
    }


    int mCardType;
    private FriendsArePlayingEventListener mListener;

    public FriendsArePlayingAdapter(Activity activity, FriendsArePlayingEventListener friendsareplayingeventlistener, int i)
    {
        super(activity);
        Asserts.checkNotNull(friendsareplayingeventlistener);
        mListener = friendsareplayingeventlistener;
        mCardType = i;
        setMaxRows(0x7f0e0019);
    }

    protected final int getCardType()
    {
        return mCardType;
    }

    protected final int getDataType()
    {
        return 0x7f0d0035;
    }

    protected final com.google.android.gms.games.ui.card.OnyxCardAdapter.OnyxCardViewHolder getViewHolder(View view)
    {
        return new FriendsArePlayingViewHolder(view);
    }



}
