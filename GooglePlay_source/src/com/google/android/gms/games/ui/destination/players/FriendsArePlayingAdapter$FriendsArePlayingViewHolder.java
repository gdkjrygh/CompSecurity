// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

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
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            FriendsArePlayingAdapter, FriendsArePlaying

public static final class er extends com.google.android.gms.games.ui.card.yingViewHolder
{

    public final volatile void addBannerImageSharedViews(SharedElementTransition sharedelementtransition)
    {
        super.edViews(sharedelementtransition);
    }

    public final volatile void addTitleIconSharedViews(SharedElementTransition sharedelementtransition)
    {
        super.Views(sharedelementtransition);
    }

    public final volatile void attachUiNodeToView(View view, int i)
    {
        super.(view, i);
    }

    public final volatile SharedElementTransition getSharedElementTransition()
    {
        return super.ansition();
    }

    public final volatile CharArrayBuffer getSubtitleViewBuffer()
    {
        return super.fer();
    }

    public final volatile CharArrayBuffer getTitleViewBuffer()
    {
        return super.();
    }

    public final volatile void hideSubtitle()
    {
        super.yingViewHolder();
    }

    public final volatile void onAvatarOthersViewClicked()
    {
        super.Clicked();
    }

    public final volatile void onAvatarViewClicked(int i)
    {
        super.d(i);
    }

    public final volatile void onImageOverlayIconClicked()
    {
        super.Clicked();
    }

    public final volatile void onImageViewClicked()
    {
        super.();
    }

    public final volatile boolean onMenuItemClick(MenuItem menuitem)
    {
        return super.yingViewHolder(menuitem);
    }

    public final volatile void onPrimaryActionClicked()
    {
        super.cked();
    }

    public final void onRootViewClicked()
    {
        FriendsArePlayingAdapter friendsareplayingadapter = (FriendsArePlayingAdapter)mAdapter;
        FriendsArePlayingAdapter.access$100(friendsareplayingadapter).logClick(itemView);
        FriendsArePlayingAdapter.access$200(friendsareplayingadapter).onFriendsArePlayingGameClicked((FriendsArePlaying)getData(), super.ansition());
    }

    public final volatile void onSecondaryActionClicked()
    {
        super.licked();
    }

    public final volatile void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
    {
        Resources resources;
        FriendsArePlaying friendsareplaying;
        int j;
        friendsareplaying = (FriendsArePlaying)obj;
        super.yingViewHolder(gamesrecycleradapter, i, friendsareplaying);
        obj = (FriendsArePlayingAdapter)mAdapter;
        LogflowUiUtils.setupLogflowAndImpressView(itemView, ((GamesRecyclerAdapter) (obj)), FriendsArePlayingAdapter.access$000(((FriendsArePlayingAdapter) (obj))), 1011, friendsareplaying);
        obj = friendsareplaying.mostRecentGameInfo;
        super.ames(((MostRecentGameInfo) (obj)).getGameId());
        resources = mContext.getResources();
        i = ((FriendsArePlayingAdapter)gamesrecycleradapter).mCardType;
        boolean flag;
        if (i == 2 || i == 1)
        {
            super.mContext(((MostRecentGameInfo) (obj)).getGameIconImageUri(), 0x7f0200da);
            super.o(1.0F);
        } else
        {
            gamesrecycleradapter = ((MostRecentGameInfo) (obj)).getGameFeaturedImageUri();
            if (!PlatformVersion.checkVersion(11))
            {
                gamesrecycleradapter = null;
            }
            super.o(gamesrecycleradapter, 0x7f0201e0);
            super.o(2.048F);
        }
        super.o(((MostRecentGameInfo) (obj)).getGameIconImageUri(), 0x7f0200da);
        super.o(((MostRecentGameInfo) (obj)).getGameName());
        super.o();
        j = friendsareplaying.playerList.size();
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        super.o((Player)friendsareplaying.playerList.get(0));
        gamesrecycleradapter = ((Player)friendsareplaying.playerList.get(0)).getDisplayName();
        if (i != 1) goto _L2; else goto _L1
_L1:
        super.o(resources.getQuantityString(0x7f0f0000, 1));
        super.gleLine(true);
_L4:
        super.Description(mContext.getString(0x7f1000f8, new Object[] {
            ((MostRecentGameInfo) (obj)).getGameName(), gamesrecycleradapter
        }));
        return;
_L2:
        if (j != 1)
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        super.mContext(gamesrecycleradapter);
        super.(resources.getQuantityString(0x7f0f0000, j));
        super.gleLine(true);
        super.SingleLine(true);
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
        super.yingViewHolder();
    }

    public final volatile void setAvatarRowClickListener(com.google.android.gms.games.ui.card.yingViewHolder yingviewholder)
    {
        super.istener(yingviewholder);
    }

    public final volatile void setAvatarRowClickable(boolean flag)
    {
        super.ble(flag);
    }

    public final volatile void setAvatarRowData(ArrayList arraylist, int i)
    {
        super.yingViewHolder(arraylist, i);
    }

    public final volatile void setAvatarRowDescription(String s)
    {
        super.ption(s);
    }

    public final volatile void setBannerImageClickListener(com.google.android.gms.games.ui.card.yingViewHolder yingviewholder)
    {
        super.kListener(yingviewholder);
    }

    public final volatile void setContextMenu(int i)
    {
        super.yingViewHolder(i);
    }

    public final volatile void setContextMenuInflater(com.google.android.gms.games.ui.card.yingViewHolder yingviewholder)
    {
        super.ater(yingviewholder);
    }

    public final volatile void setContextMenuListener(android.support.v7.widget.iendsArePlayingViewHolder iendsareplayingviewholder)
    {
        super.ener(iendsareplayingviewholder);
    }

    public final volatile void setCustomImage(View view)
    {
        super.yingViewHolder(view);
    }

    public final volatile void setCustomPrimaryLabelView(View view)
    {
        super.belView(view);
    }

    public final volatile void setHasLabel(boolean flag)
    {
        super.yingViewHolder(flag);
    }

    public final volatile void setHeroTransitionNames(String s)
    {
        super.ames(s);
    }

    public final volatile void setIconImage(Uri uri, int i)
    {
        super.yingViewHolder(uri, i);
    }

    public final volatile void setImage(Uri uri, int i)
    {
        super.yingViewHolder(uri, i);
    }

    public final volatile void setImageAlpha(int i)
    {
        super.yingViewHolder(i);
    }

    public final volatile void setImageAspectRatio(float f)
    {
        super.o(f);
    }

    public final volatile void setImageCircleCropEnabled(boolean flag)
    {
        super.Enabled(flag);
    }

    public final volatile void setImageClickable(boolean flag)
    {
        super.yingViewHolder(flag);
    }

    public final volatile void setImageContentDescription(String s)
    {
        super.cription(s);
    }

    public final volatile void setImageOverlayIconBackground(Drawable drawable)
    {
        super.nBackground(drawable);
    }

    public final volatile void setImageOverlayIconClickListener(com.google.android.gms.games.ui.card.yingViewHolder yingviewholder)
    {
        super.nClickListener(yingviewholder);
    }

    public final volatile void setImageOverlayIconClickable(boolean flag)
    {
        super.nClickable(flag);
    }

    public final volatile void setImageOverlayIconContentDescription(int i)
    {
        super.nContentDescription(i);
    }

    public final volatile void setImageOverlayLeftText(String s)
    {
        super.tText(s);
    }

    public final volatile void setImageOverlayProgressBar(int i, int j, int k, int l)
    {
        super.gressBar(i, j, k, l);
    }

    public final volatile void setImageOverlayRightText(String s)
    {
        super.htText(s);
    }

    public final volatile void setImagePaddingEnabled(boolean flag)
    {
        super.bled(flag);
    }

    public final volatile void setPrimaryAction(int i)
    {
        super.yingViewHolder(i);
    }

    public final volatile void setPrimaryActionClickListener(com.google.android.gms.games.ui.card.yingViewHolder yingviewholder)
    {
        super.ickListener(yingviewholder);
    }

    public final volatile void setPrimaryActionClickable(boolean flag)
    {
        super.ickable(flag);
    }

    public final volatile void setPrimaryActionContentDescription(int i)
    {
        super.ntentDescription(i);
    }

    public final volatile void setPrimaryLabel(int i)
    {
        super.yingViewHolder(i);
    }

    public final volatile void setPrimaryLabel(String s)
    {
        super.yingViewHolder(s);
    }

    public final volatile void setPrimaryLabelColorResId(int i)
    {
        super.orResId(i);
    }

    public final volatile void setPrimaryLabelContentDescription(String s)
    {
        super.tentDescription(s);
    }

    public final volatile void setPrimaryLabelImage(int i)
    {
        super.ge(i);
    }

    public final volatile void setRootViewAlpha(float f)
    {
        super.yingViewHolder(f);
    }

    public final volatile void setRootViewBackgroundColor(int i)
    {
        super.undColor(i);
    }

    public final volatile void setRootViewClickable(boolean flag)
    {
        super.le(flag);
    }

    public final volatile void setRootViewContentDescription(String s)
    {
        super.Description(s);
    }

    public final volatile void setRootViewFocusable(boolean flag)
    {
        super.le(flag);
    }

    public final volatile void setSecondaryAction(int i)
    {
        super.(i);
    }

    public final volatile void setSecondaryActionClickListener(com.google.android.gms.games.ui.card.yingViewHolder yingviewholder)
    {
        super.ClickListener(yingviewholder);
    }

    public final volatile void setSecondaryActionContentDescription(int i)
    {
        super.ContentDescription(i);
    }

    public final volatile void setSecondaryLabel(String s)
    {
        super.yingViewHolder(s);
    }

    public final volatile void setSnippetImage(Player player)
    {
        super.yingViewHolder(player);
    }

    public final volatile void setSnippetSubtitle(String s)
    {
        super.(s);
    }

    public final volatile void setSnippetSubtitleSingleLine(boolean flag)
    {
        super.SingleLine(flag);
    }

    public final volatile void setSnippetTitle(String s)
    {
        super.yingViewHolder(s);
    }

    public final volatile void setSnippetTitleSingleLine(boolean flag)
    {
        super.gleLine(flag);
    }

    public final volatile void setSubtitle(int i)
    {
        super.yingViewHolder(i);
    }

    public final volatile void setSubtitle(CharArrayBuffer chararraybuffer)
    {
        super.yingViewHolder(chararraybuffer);
    }

    public final volatile void setSubtitle(String s)
    {
        super.yingViewHolder(s);
    }

    public final volatile void setSubtitleColorResId(int i)
    {
        super.sId(i);
    }

    public final volatile void setTitle(int i)
    {
        super.yingViewHolder(i);
    }

    public final volatile void setTitle(CharArrayBuffer chararraybuffer)
    {
        super.yingViewHolder(chararraybuffer);
    }

    public final volatile void setTitle(String s)
    {
        super.yingViewHolder(s);
    }

    public final volatile void setTitleColorResId(int i)
    {
        super.(i);
    }

    public final volatile void setTitleIconClickListener(com.google.android.gms.games.ui.card.yingViewHolder yingviewholder)
    {
        super.istener(yingviewholder);
    }

    public er(View view)
    {
        super(view);
    }
}
