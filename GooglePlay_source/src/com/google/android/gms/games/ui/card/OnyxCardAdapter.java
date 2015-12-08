// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.content.Context;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.PopupMenu;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.logging.LogflowViewLeafUiElementNode;
import com.google.android.gms.games.logging.LogflowViewUiElementNode;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxBaseCardView

public abstract class OnyxCardAdapter extends DatabufferRecyclerAdapter
{
    protected static abstract class OnyxCardViewHolder extends com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder
        implements android.support.v7.widget.PopupMenu.OnMenuItemClickListener, OnyxCardViewDefinition.AvatarRowClickListener, OnyxCardViewDefinition.BannerImageClickListener, OnyxCardViewDefinition.HasAvatarRow, OnyxCardViewDefinition.HasBackgroundColor, OnyxCardViewDefinition.HasBannerImage, OnyxCardViewDefinition.HasContextMenu, OnyxCardViewDefinition.HasCustomImage, OnyxCardViewDefinition.HasCustomPrimaryLabel, OnyxCardViewDefinition.HasHeroTransition, OnyxCardViewDefinition.HasIcon, OnyxCardViewDefinition.HasImageOverlayIcon, OnyxCardViewDefinition.HasImageOverlayLeftText, OnyxCardViewDefinition.HasImageOverlayProgressBar, OnyxCardViewDefinition.HasImageOverlayRightText, OnyxCardViewDefinition.HasImagePadding, OnyxCardViewDefinition.HasLabelSetting, OnyxCardViewDefinition.HasPrimaryAction, OnyxCardViewDefinition.HasPrimaryLabelImage, OnyxCardViewDefinition.HasSecondaryAction, OnyxCardViewDefinition.HasSecondaryLabel, OnyxCardViewDefinition.HasSnippet, OnyxCardViewDefinition.HasTitleIcon, OnyxCardViewDefinition.ImageClickListener, OnyxCardViewDefinition.ImageOverlayIconClickListener, OnyxCardViewDefinition.PrimaryActionClickListener, OnyxCardViewDefinition.RootViewClickListener, OnyxCardViewDefinition.SecondaryActionClickListener, OnyxCardViewDefinition.SubtitleClickListener, OnyxCardViewDefinition.TitleClickListener, OnyxCardViewDefinition.TitleIconClickListener
    {

        public final SparseArray mCustomViewRecycler = new SparseArray();
        public OnyxBaseCardView mOnyxView;

        public void addBannerImageSharedViews(SharedElementTransition sharedelementtransition)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasBannerImage)
            {
                ((OnyxCardViewDefinition.HasBannerImage)mOnyxView).addBannerImageSharedViews(sharedelementtransition);
            }
        }

        public void addTitleIconSharedViews(SharedElementTransition sharedelementtransition)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasTitleIcon)
            {
                ((OnyxCardViewDefinition.HasTitleIcon)mOnyxView).addTitleIconSharedViews(sharedelementtransition);
            }
        }

        public void attachUiNodeToView(View view, int i)
        {
            Object obj;
            if (view instanceof OnyxBaseCardView)
            {
                obj = new LogflowViewLeafUiElementNode(i);
            } else
            {
                obj = new LogflowViewUiElementNode(i, (byte)0);
            }
            view.setTag(0x7f0d0061, obj);
        }

        public View createCustomView(int i)
        {
            return null;
        }

        public SharedElementTransition getSharedElementTransition()
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasBannerImage)
            {
                SharedElementTransition sharedelementtransition = new SharedElementTransition(2);
                addBannerImageSharedViews(sharedelementtransition);
                return sharedelementtransition;
            }
            if (mOnyxView instanceof OnyxCardViewDefinition.HasTitleIcon)
            {
                SharedElementTransition sharedelementtransition1 = SharedElementTransition.createHeroIconTransition();
                addTitleIconSharedViews(sharedelementtransition1);
                return sharedelementtransition1;
            } else
            {
                return null;
            }
        }

        public CharArrayBuffer getSubtitleViewBuffer()
        {
            return mOnyxView.mSubtitleViewBuffer;
        }

        public CharArrayBuffer getTitleViewBuffer()
        {
            return mOnyxView.mTitleViewBuffer;
        }

        public void hideSubtitle()
        {
            mOnyxView.hideSubtitle();
        }

        public void onAvatarOthersViewClicked()
        {
        }

        public void onAvatarViewClicked(int i)
        {
        }

        public void onImageOverlayIconClicked()
        {
        }

        public void onImageViewClicked()
        {
        }

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            return false;
        }

        public void onPrimaryActionClicked()
        {
        }

        public void onRootViewClicked()
        {
        }

        public void onSecondaryActionClicked()
        {
        }

        public void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i, Object obj)
        {
            super.populateViews(gamesrecycleradapter, i, obj);
            mOnyxView.clearData();
            mOnyxView.mLogListener = mAdapter.mLogListener;
        }

        public void resizeSnippet()
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSnippet)
            {
                ((OnyxCardViewDefinition.HasSnippet)mOnyxView).resizeSnippet();
            }
        }

        public void setAvatarRowClickListener(OnyxCardViewDefinition.AvatarRowClickListener avatarrowclicklistener)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters");
        }

        public void setAvatarRowClickable(boolean flag)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasAvatarRow)
            {
                ((OnyxCardViewDefinition.HasAvatarRow)mOnyxView).setAvatarRowClickable(flag);
            }
        }

        public void setAvatarRowData(ArrayList arraylist, int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasAvatarRow)
            {
                ((OnyxCardViewDefinition.HasAvatarRow)mOnyxView).setAvatarRowData(arraylist, i);
            }
        }

        public void setAvatarRowDescription(String s)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasAvatarRow)
            {
                ((OnyxCardViewDefinition.HasAvatarRow)mOnyxView).setAvatarRowDescription(s);
            }
        }

        public void setBannerImageClickListener(OnyxCardViewDefinition.BannerImageClickListener bannerimageclicklistener)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters");
        }

        public void setContextMenu(int i)
        {
            if (!(mOnyxView instanceof OnyxCardViewDefinition.HasContextMenu))
            {
                return;
            }
            if (i > 0)
            {
                setContextMenuInflater(i. new OnyxCardViewDefinition.ContextMenuInflater() {

                    final OnyxCardViewHolder this$0;
                    final int val$menuResId;

                    public final void inflateContextMenu(PopupMenu popupmenu)
                    {
                        popupmenu.inflate(menuResId);
                    }

            
            {
                this$0 = final_onyxcardviewholder;
                menuResId = I.this;
                super();
            }
                });
                return;
            } else
            {
                setContextMenuInflater(null);
                return;
            }
        }

        public void setContextMenuInflater(OnyxCardViewDefinition.ContextMenuInflater contextmenuinflater)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasContextMenu)
            {
                ((OnyxCardViewDefinition.HasContextMenu)mOnyxView).setContextMenuInflater(contextmenuinflater);
            }
        }

        public void setContextMenuListener(android.support.v7.widget.PopupMenu.OnMenuItemClickListener onmenuitemclicklistener)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters");
        }

        public final View setCustomImage(int i)
        {
            View view1 = (View)mCustomViewRecycler.get(i);
            View view = view1;
            if (view1 == null)
            {
                view = createCustomView(i);
                Asserts.checkNotNull(view, (new StringBuilder("Custom ImageView created for imageViewType ")).append(i).append(" cannot be null").toString());
                mCustomViewRecycler.put(i, view);
            }
            if (mOnyxView instanceof OnyxCardViewDefinition.HasCustomImage)
            {
                ((OnyxCardViewDefinition.HasCustomImage)mOnyxView).setCustomImage(view);
            }
            return view;
        }

        public void setCustomImage(View view)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters. Use setCustomImage(int)");
        }

        public void setCustomPrimaryLabelView(View view)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters. Use setCustomPrimaryLabelView(int)");
        }

        public void setHasLabel(boolean flag)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasLabelSetting)
            {
                ((OnyxCardViewDefinition.HasLabelSetting)mOnyxView).setHasLabel(flag);
            }
        }

        public void setHeroTransitionNames(String s)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasHeroTransition)
            {
                ((OnyxCardViewDefinition.HasHeroTransition)mOnyxView).setHeroTransitionNames(s);
            }
        }

        public void setIconImage(Uri uri, int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasIcon)
            {
                ((OnyxCardViewDefinition.HasIcon)mOnyxView).setIconImage(uri, i);
            }
        }

        public void setImage(Uri uri, int i)
        {
            mOnyxView.setImage(uri, i);
        }

        public void setImageAlpha(int i)
        {
            mOnyxView.setImageAlpha(i);
        }

        public void setImageAspectRatio(float f)
        {
            mOnyxView.setImageAspectRatio(f);
        }

        public void setImageCircleCropEnabled(boolean flag)
        {
            mOnyxView.setImageCircleCropEnabled(flag);
        }

        public void setImageClickable(boolean flag)
        {
            mOnyxView.setImageClickable(flag);
        }

        public void setImageContentDescription(String s)
        {
            mOnyxView.setImageContentDescription(s);
        }

        public void setImageOverlayIconBackground(Drawable drawable)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasImageOverlayIcon)
            {
                ((OnyxCardViewDefinition.HasImageOverlayIcon)mOnyxView).setImageOverlayIconBackground(drawable);
            }
        }

        public void setImageOverlayIconClickListener(OnyxCardViewDefinition.ImageOverlayIconClickListener imageoverlayiconclicklistener)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters");
        }

        public void setImageOverlayIconClickable(boolean flag)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasImageOverlayIcon)
            {
                ((OnyxCardViewDefinition.HasImageOverlayIcon)mOnyxView).setImageOverlayIconClickable(flag);
            }
        }

        public void setImageOverlayIconContentDescription(int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasImageOverlayIcon)
            {
                ((OnyxCardViewDefinition.HasImageOverlayIcon)mOnyxView).setImageOverlayIconContentDescription(i);
            }
        }

        public void setImageOverlayLeftText(String s)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasImageOverlayLeftText)
            {
                ((OnyxCardViewDefinition.HasImageOverlayLeftText)mOnyxView).setImageOverlayLeftText(s);
            }
        }

        public void setImageOverlayProgressBar(int i, int j, int k, int l)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasImageOverlayProgressBar)
            {
                ((OnyxCardViewDefinition.HasImageOverlayProgressBar)mOnyxView).setImageOverlayProgressBar(i, j, k, l);
            }
        }

        public void setImageOverlayRightText(String s)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasImageOverlayRightText)
            {
                ((OnyxCardViewDefinition.HasImageOverlayRightText)mOnyxView).setImageOverlayRightText(s);
            }
        }

        public void setImagePaddingEnabled(boolean flag)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasImagePadding)
            {
                ((OnyxCardViewDefinition.HasImagePadding)mOnyxView).setImagePaddingEnabled(flag);
            }
        }

        public void setPrimaryAction(int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasPrimaryAction)
            {
                ((OnyxCardViewDefinition.HasPrimaryAction)mOnyxView).setPrimaryAction(i);
            }
        }

        public void setPrimaryActionClickListener(OnyxCardViewDefinition.PrimaryActionClickListener primaryactionclicklistener)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters");
        }

        public void setPrimaryActionClickable(boolean flag)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasPrimaryAction)
            {
                ((OnyxCardViewDefinition.HasPrimaryAction)mOnyxView).setPrimaryActionClickable(flag);
            }
        }

        public void setPrimaryActionContentDescription(int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasPrimaryAction)
            {
                ((OnyxCardViewDefinition.HasPrimaryAction)mOnyxView).setPrimaryActionContentDescription(i);
            }
        }

        public void setPrimaryLabel(int i)
        {
            mOnyxView.setPrimaryLabel(i);
        }

        public void setPrimaryLabel(String s)
        {
            mOnyxView.setPrimaryLabel(s);
        }

        public void setPrimaryLabelColorResId(int i)
        {
            mOnyxView.setPrimaryLabelColorResId(i);
        }

        public void setPrimaryLabelContentDescription(String s)
        {
            mOnyxView.setPrimaryLabelContentDescription(s);
        }

        public void setPrimaryLabelImage(int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasPrimaryLabelImage)
            {
                ((OnyxCardViewDefinition.HasPrimaryLabelImage)mOnyxView).setPrimaryLabelImage(i);
            }
        }

        public void setRootViewAlpha(float f)
        {
            mOnyxView.setRootViewAlpha(f);
        }

        public void setRootViewBackgroundColor(int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasBackgroundColor)
            {
                ((OnyxCardViewDefinition.HasBackgroundColor)mOnyxView).setRootViewBackgroundColor(i);
            }
        }

        public void setRootViewClickable(boolean flag)
        {
            mOnyxView.setClickable(flag);
        }

        public void setRootViewContentDescription(String s)
        {
            mOnyxView.setRootViewContentDescription(s);
        }

        public void setRootViewFocusable(boolean flag)
        {
            mOnyxView.setFocusable(flag);
        }

        public void setSecondaryAction(int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSecondaryAction)
            {
                ((OnyxCardViewDefinition.HasSecondaryAction)mOnyxView).setSecondaryAction(i);
            }
        }

        public void setSecondaryActionClickListener(OnyxCardViewDefinition.SecondaryActionClickListener secondaryactionclicklistener)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters");
        }

        public void setSecondaryActionContentDescription(int i)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSecondaryAction)
            {
                ((OnyxCardViewDefinition.HasSecondaryAction)mOnyxView).setSecondaryActionContentDescription(i);
            }
        }

        public void setSecondaryLabel(String s)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSecondaryLabel)
            {
                ((OnyxCardViewDefinition.HasSecondaryLabel)mOnyxView).setSecondaryLabel(s);
            }
        }

        public void setSnippetImage(Player player)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSnippet)
            {
                ((OnyxCardViewDefinition.HasSnippet)mOnyxView).setSnippetImage(player);
            }
        }

        public void setSnippetSubtitle(String s)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSnippet)
            {
                ((OnyxCardViewDefinition.HasSnippet)mOnyxView).setSnippetSubtitle(s);
            }
        }

        public void setSnippetSubtitleSingleLine(boolean flag)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSnippet)
            {
                ((OnyxCardViewDefinition.HasSnippet)mOnyxView).setSnippetSubtitleSingleLine(flag);
            }
        }

        public void setSnippetTitle(String s)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSnippet)
            {
                ((OnyxCardViewDefinition.HasSnippet)mOnyxView).setSnippetTitle(s);
            }
        }

        public void setSnippetTitleSingleLine(boolean flag)
        {
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSnippet)
            {
                ((OnyxCardViewDefinition.HasSnippet)mOnyxView).setSnippetTitleSingleLine(flag);
            }
        }

        public void setSubtitle(int i)
        {
            mOnyxView.setSubtitle(i);
        }

        public void setSubtitle(CharArrayBuffer chararraybuffer)
        {
            mOnyxView.setSubtitle(chararraybuffer);
        }

        public void setSubtitle(String s)
        {
            mOnyxView.setSubtitle(s);
        }

        public void setSubtitleColorResId(int i)
        {
            mOnyxView.setSubtitleColorResId(i);
        }

        public void setTitle(int i)
        {
            mOnyxView.setTitle(i);
        }

        public void setTitle(CharArrayBuffer chararraybuffer)
        {
            mOnyxView.setTitle(chararraybuffer);
        }

        public void setTitle(String s)
        {
            mOnyxView.setTitle(s);
        }

        public void setTitleColorResId(int i)
        {
            mOnyxView.setTitleColorResId(i);
        }

        public void setTitleIconClickListener(OnyxCardViewDefinition.TitleIconClickListener titleiconclicklistener)
        {
            throw new UnsupportedOperationException("This method is not supported on adapters");
        }

        public OnyxCardViewHolder(View view)
        {
            super(view);
            mOnyxView = (OnyxBaseCardView)view;
            mOnyxView.setImageLoader(this);
            mOnyxView.setRootViewClickListener(this);
            mOnyxView.setImageClickListener(this);
            mOnyxView.mTitleClickListener = this;
            mOnyxView.mSubtitleClickListener = this;
            if (mOnyxView instanceof OnyxCardViewDefinition.HasBannerImage)
            {
                ((OnyxCardViewDefinition.HasBannerImage)mOnyxView).setBannerImageClickListener(this);
            }
            if (mOnyxView instanceof OnyxCardViewDefinition.HasTitleIcon)
            {
                ((OnyxCardViewDefinition.HasTitleIcon)mOnyxView).setTitleIconClickListener(this);
            }
            if (mOnyxView instanceof OnyxCardViewDefinition.HasImageOverlayIcon)
            {
                ((OnyxCardViewDefinition.HasImageOverlayIcon)mOnyxView).setImageOverlayIconClickListener(this);
            }
            if (mOnyxView instanceof OnyxCardViewDefinition.HasAvatarRow)
            {
                ((OnyxCardViewDefinition.HasAvatarRow)mOnyxView).setAvatarRowClickListener(this);
            }
            if (mOnyxView instanceof OnyxCardViewDefinition.HasContextMenu)
            {
                ((OnyxCardViewDefinition.HasContextMenu)mOnyxView).setContextMenuListener(this);
            }
            if (mOnyxView instanceof OnyxCardViewDefinition.HasPrimaryAction)
            {
                ((OnyxCardViewDefinition.HasPrimaryAction)mOnyxView).setPrimaryActionClickListener(this);
            }
            if (mOnyxView instanceof OnyxCardViewDefinition.HasSecondaryAction)
            {
                ((OnyxCardViewDefinition.HasSecondaryAction)mOnyxView).setSecondaryActionClickListener(this);
            }
        }
    }


    public static final Set CARD_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[] {
        Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(7)
    })));

    public OnyxCardAdapter(Context context)
    {
        super(context);
    }

    public static int getItemViewType(int i, int j)
    {
        return i << 16 | 0xffff & j;
    }

    public static int getScreenRowsResId(int i)
    {
        switch (i)
        {
        case 6: // '\006'
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown card type: ")).append(i).toString());

        case 1: // '\001'
            return 0x7f0e002f;

        case 2: // '\002'
            return 0x7f0e0036;

        case 3: // '\003'
            return 0x7f0e0025;

        case 4: // '\004'
            return 0x7f0e002a;

        case 5: // '\005'
        case 7: // '\007'
            return 0x7f0e003b;
        }
    }

    public static int getSpanCountResId(int i)
    {
        switch (i)
        {
        case 6: // '\006'
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown card type: ")).append(i).toString());

        case 1: // '\001'
            return 0x7f0e0030;

        case 2: // '\002'
            return 0x7f0e0037;

        case 3: // '\003'
            return 0x7f0e0026;

        case 4: // '\004'
        case 5: // '\005'
            return 0x7f0e003c;

        case 7: // '\007'
            return 0x7f0e0032;
        }
    }

    protected final int getCardItemViewType$134621()
    {
        return getItemViewType(getCardType(), getDataType());
    }

    public abstract int getCardType();

    public abstract int getDataType();

    public final int getLogflowUiElementType()
    {
        switch (getCardType())
        {
        case 6: // '\006'
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown card type: ")).append(getCardType()).toString());

        case 1: // '\001'
            return 212;

        case 2: // '\002'
            return 213;

        case 3: // '\003'
            return 224;

        case 4: // '\004'
            return 214;

        case 5: // '\005'
            return 215;

        case 7: // '\007'
            return 222;
        }
    }

    public int getSpanCount()
    {
        int i = getSpanCountResId(getCardType());
        return mContext.getResources().getInteger(i);
    }

    public final int getTopPaddingResId()
    {
        return 0x7f0c0130;
    }

    public abstract OnyxCardViewHolder getViewHolder(View view);

    protected final com.google.android.gms.games.ui.DatabufferRecyclerAdapter.DatabufferViewHolder onCreateCardViewHolder(ViewGroup viewgroup, int i)
    {
        i >>= 16;
        i;
        JVM INSTR tableswitch 1 7: default 48
    //                   1 72
    //                   2 90
    //                   3 96
    //                   4 102
    //                   5 108
    //                   6 48
    //                   7 114;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown card type: ")).append(i).toString());
_L2:
        i = 0x7f0400ae;
_L9:
        return getViewHolder(mInflater.inflate(i, viewgroup, false));
_L3:
        i = 0x7f0400b0;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 0x7f0400ac;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 0x7f0400ad;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 0x7f0400b1;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f0400af;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
