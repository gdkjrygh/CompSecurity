// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import java.util.ArrayList;

public final class OnyxCardViewDefinition
{
    public static interface AvatarRowClickListener
        extends LogflowClickHelper
    {

        public abstract void onAvatarOthersViewClicked();

        public abstract void onAvatarViewClicked(int i);
    }

    public static interface BannerImageClickListener
        extends LogflowClickHelper
    {
    }

    public static interface ContextMenuInflater
    {

        public abstract void inflateContextMenu(PopupMenu popupmenu);
    }

    public static interface HasAvatarRow
    {

        public abstract void setAvatarRowClickListener(AvatarRowClickListener avatarrowclicklistener);

        public abstract void setAvatarRowClickable(boolean flag);

        public abstract void setAvatarRowData(ArrayList arraylist, int i);

        public abstract void setAvatarRowDescription(String s);
    }

    public static interface HasBackgroundColor
    {

        public abstract void setRootViewBackgroundColor(int i);
    }

    public static interface HasBannerImage
    {

        public abstract void addBannerImageSharedViews(SharedElementTransition sharedelementtransition);

        public abstract void setBannerImageClickListener(BannerImageClickListener bannerimageclicklistener);
    }

    public static interface HasContextMenu
    {

        public abstract void setContextMenuInflater(ContextMenuInflater contextmenuinflater);

        public abstract void setContextMenuListener(android.support.v7.widget.PopupMenu.OnMenuItemClickListener onmenuitemclicklistener);
    }

    public static interface HasCustomImage
    {

        public abstract void setCustomImage(View view);
    }

    public static interface HasCustomPrimaryLabel
    {

        public abstract void setCustomPrimaryLabelView(View view);
    }

    public static interface HasHeroTransition
    {

        public abstract void setHeroTransitionNames(String s);
    }

    public static interface HasIcon
    {

        public abstract void setIconImage(Uri uri, int i);
    }

    public static interface HasImageOverlayIcon
    {

        public abstract void setImageOverlayIconBackground(Drawable drawable);

        public abstract void setImageOverlayIconClickListener(ImageOverlayIconClickListener imageoverlayiconclicklistener);

        public abstract void setImageOverlayIconClickable(boolean flag);

        public abstract void setImageOverlayIconContentDescription(int i);
    }

    public static interface HasImageOverlayLeftText
    {

        public abstract void setImageOverlayLeftText(String s);
    }

    public static interface HasImageOverlayProgressBar
    {

        public abstract void setImageOverlayProgressBar(int i, int j, int k, int l);
    }

    public static interface HasImageOverlayRightText
    {

        public abstract void setImageOverlayRightText(String s);
    }

    public static interface HasImagePadding
    {

        public abstract void setImagePaddingEnabled(boolean flag);
    }

    public static interface HasLabelSetting
    {

        public abstract void setHasLabel(boolean flag);
    }

    public static interface HasPrimaryAction
    {

        public abstract void setPrimaryAction(int i);

        public abstract void setPrimaryActionClickListener(PrimaryActionClickListener primaryactionclicklistener);

        public abstract void setPrimaryActionClickable(boolean flag);

        public abstract void setPrimaryActionContentDescription(int i);
    }

    public static interface HasPrimaryLabelImage
    {

        public abstract void setPrimaryLabelImage(int i);
    }

    public static interface HasSecondaryAction
    {

        public abstract void setSecondaryAction(int i);

        public abstract void setSecondaryActionClickListener(SecondaryActionClickListener secondaryactionclicklistener);

        public abstract void setSecondaryActionContentDescription(int i);
    }

    public static interface HasSecondaryLabel
    {

        public abstract void setSecondaryLabel(String s);
    }

    public static interface HasSnippet
    {

        public abstract void resizeSnippet();

        public abstract void setSnippetImage(Player player);

        public abstract void setSnippetSubtitle(String s);

        public abstract void setSnippetSubtitleSingleLine(boolean flag);

        public abstract void setSnippetTitle(String s);

        public abstract void setSnippetTitleSingleLine(boolean flag);
    }

    public static interface HasTitleIcon
    {

        public abstract void addTitleIconSharedViews(SharedElementTransition sharedelementtransition);

        public abstract void setTitleIconClickListener(TitleIconClickListener titleiconclicklistener);
    }

    public static interface ImageClickListener
        extends LogflowClickHelper
    {

        public abstract void onImageViewClicked();
    }

    public static interface ImageOverlayIconClickListener
        extends LogflowClickHelper
    {

        public abstract void onImageOverlayIconClicked();
    }

    public static interface LogflowClickHelper
    {

        public abstract void attachUiNodeToView(View view, int i);
    }

    public static interface PrimaryActionClickListener
        extends LogflowClickHelper
    {

        public abstract void onPrimaryActionClicked();
    }

    public static interface RootViewClickListener
        extends LogflowClickHelper
    {

        public abstract void onRootViewClicked();
    }

    public static interface SecondaryActionClickListener
        extends LogflowClickHelper
    {

        public abstract void onSecondaryActionClicked();
    }

    public static interface SubtitleClickListener
        extends LogflowClickHelper
    {
    }

    public static interface TitleClickListener
        extends LogflowClickHelper
    {
    }

    public static interface TitleIconClickListener
        extends LogflowClickHelper
    {
    }

}
