// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.widget.PopupMenu;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxBaseCardView

public final class OnyxSmallCardView extends OnyxBaseCardView
    implements OnyxCardViewDefinition.HasContextMenu, OnyxCardViewDefinition.HasHeroTransition, OnyxCardViewDefinition.HasLabelSetting, OnyxCardViewDefinition.HasPrimaryLabelImage, OnyxCardViewDefinition.HasSnippet, OnyxCardViewDefinition.HasTitleIcon
{

    private OnyxCardViewDefinition.ContextMenuInflater mContextMenuInflater;
    private android.support.v7.widget.PopupMenu.OnMenuItemClickListener mContextMenuListener;
    private View mContextMenuSpacerView;
    private View mContextMenuView;
    private View mMainContainer;
    private View mPrimaryLabelContainer;
    private ImageView mPrimaryLabelImageView;
    private View mSnippetContainer;
    private MetagameAvatarView mSnippetImageView;
    private TextView mSnippetSubtitleView;
    private TextView mSnippetTitleView;
    private TextView mSubtitleSpacerView;
    private OnyxCardViewDefinition.TitleIconClickListener mTitleIconClickListener;

    public OnyxSmallCardView(Context context)
    {
        super(context);
    }

    public OnyxSmallCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OnyxSmallCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void addTitleIconSharedViews(SharedElementTransition sharedelementtransition)
    {
        sharedelementtransition.addSharedLoadingImageView(mImageView, "icon", mImageUri, mImageDefaultResId);
    }

    public final void clearData()
    {
        super.clearData();
        setContextMenuInflater(null);
        mSubtitleSpacerView.setVisibility(0);
        mPrimaryLabelImageView.setImageDrawable(null);
        mPrimaryLabelImageView.setVisibility(8);
        mSnippetTitleView.setText("");
        mSnippetTitleView.setSingleLine(true);
        setTextColor(mSnippetTitleView, 0x7f0b007d);
        mSnippetSubtitleView.setText("");
        mSnippetTitleView.setSingleLine(true);
        setTextColor(mSnippetSubtitleView, 0x7f0b007d);
        mSnippetContainer.setVisibility(8);
    }

    public final void hideSubtitle()
    {
        super.hideSubtitle();
        mSubtitleSpacerView.setVisibility(8);
    }

    public final void onClick(View view)
    {
        if (view != mImageView && view == mContextMenuView)
        {
            if (mContextMenuInflater == null)
            {
                return;
            } else
            {
                view = new PopupMenu(view.getContext(), view);
                mContextMenuInflater.inflateContextMenu(view);
                view.mMenuItemClickListener = mContextMenuListener;
                ((PopupMenu) (view)).mPopup.show();
                return;
            }
        } else
        {
            super.onClick(view);
            return;
        }
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        mContextMenuView = findViewById(0x7f0d01f4);
        mContextMenuView.setOnClickListener(this);
        mContextMenuSpacerView = findViewById(0x7f0d0211);
        mSubtitleSpacerView = (TextView)findViewById(0x7f0d0214);
        mPrimaryLabelContainer = findViewById(0x7f0d0215);
        mPrimaryLabelImageView = (ImageView)findViewById(0x7f0d0216);
        mSnippetContainer = findViewById(0x7f0d0217);
        mSnippetTitleView = (TextView)findViewById(0x7f0d0219);
        mSnippetSubtitleView = (TextView)findViewById(0x7f0d021e);
        mSnippetImageView = (MetagameAvatarView)findViewById(0x7f0d0218);
        mSnippetImageView.setOutlineStrokeWidthResId(0x7f0c0160);
        mSnippetImageView.setShadowStrokeWidthResId(0x7f0c0161);
        mMainContainer = findViewById(0x7f0d010f);
        setImageAspectRatio(1.0F);
    }

    public final void resizeSnippet()
    {
        Resources resources = getContext().getResources();
        if (mSnippetContainer.getTag(0x7f0d0047) != null && mRootView.getTag(0x7f0d0047) != null)
        {
            mSnippetContainer.setPadding(mSnippetContainer.getPaddingLeft(), resources.getDimensionPixelSize(0x7f0c015e), mSnippetContainer.getPaddingRight(), mSnippetContainer.getPaddingBottom());
            return;
        } else
        {
            mSnippetContainer.setPadding(mSnippetContainer.getPaddingLeft(), 0, mSnippetContainer.getPaddingRight(), mSnippetContainer.getPaddingBottom());
            return;
        }
    }

    public final void setContextMenuInflater(OnyxCardViewDefinition.ContextMenuInflater contextmenuinflater)
    {
        mContextMenuInflater = contextmenuinflater;
        if (contextmenuinflater == null)
        {
            mContextMenuView.setVisibility(8);
            return;
        } else
        {
            mContextMenuView.setVisibility(0);
            return;
        }
    }

    public final void setContextMenuListener(android.support.v7.widget.PopupMenu.OnMenuItemClickListener onmenuitemclicklistener)
    {
        mContextMenuListener = onmenuitemclicklistener;
    }

    public final void setHasLabel(boolean flag)
    {
        byte byte1 = 4;
        Object obj = mPrimaryLabelContainer;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 8;
        }
        ((View) (obj)).setVisibility(byte0);
        obj = mPrimaryLabelView;
        if (flag)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 8;
        }
        ((TextView) (obj)).setVisibility(byte0);
    }

    public final void setHeroTransitionNames(String s)
    {
        if (PlatformVersion.checkVersion(21))
        {
            mRootView.setTransitionName((new StringBuilder("root")).append(s).toString());
            mImageView.setTransitionName((new StringBuilder("icon")).append(s).toString());
            mTitleView.setTransitionName((new StringBuilder("title")).append(s).toString());
            mSubtitleView.setTransitionName((new StringBuilder("subtitle")).append(s).toString());
            mContextMenuView.setTransitionName((new StringBuilder("overflow")).append(s).toString());
            mPrimaryLabelView.setTransitionName((new StringBuilder("label")).append(s).toString());
        }
    }

    public final void setPrimaryLabel(int i)
    {
        super.setPrimaryLabel(i);
        mPrimaryLabelContainer.setVisibility(0);
    }

    public final void setPrimaryLabel(String s)
    {
        super.setPrimaryLabel(s);
        mPrimaryLabelContainer.setVisibility(0);
    }

    public final void setPrimaryLabelImage(int i)
    {
        mPrimaryLabelImageView.setImageResource(i);
        mPrimaryLabelImageView.setVisibility(0);
    }

    public final void setSnippetImage(Player player)
    {
        mSnippetContainer.setVisibility(0);
        mSnippetImageView.setVisibility(0);
        mSnippetImageView.setData(player, false);
    }

    public final void setSnippetSubtitle(String s)
    {
        mSnippetContainer.setVisibility(0);
        mSnippetSubtitleView.setVisibility(0);
        mSnippetSubtitleView.setText(s);
    }

    public final void setSnippetSubtitleSingleLine(boolean flag)
    {
        mSnippetSubtitleView.setSingleLine(flag);
        TextView textview = mSnippetSubtitleView;
        android.text.TextUtils.TruncateAt truncateat;
        if (flag)
        {
            truncateat = android.text.TextUtils.TruncateAt.END;
        } else
        {
            truncateat = null;
        }
        textview.setEllipsize(truncateat);
    }

    public final void setSnippetTitle(String s)
    {
        mSnippetContainer.setVisibility(0);
        mSnippetTitleView.setVisibility(0);
        mSnippetTitleView.setText(s);
    }

    public final void setSnippetTitleSingleLine(boolean flag)
    {
        mSnippetTitleView.setSingleLine(flag);
        TextView textview = mSnippetTitleView;
        android.text.TextUtils.TruncateAt truncateat;
        if (flag)
        {
            truncateat = android.text.TextUtils.TruncateAt.END;
        } else
        {
            truncateat = null;
        }
        textview.setEllipsize(truncateat);
    }

    public final void setTitleIconClickListener(OnyxCardViewDefinition.TitleIconClickListener titleiconclicklistener)
    {
        mTitleIconClickListener = titleiconclicklistener;
    }
}
