// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.content.Context;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.widget.PopupMenu;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.ui.ImageLoader;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxBaseCardView

public final class OnyxWideCardView extends OnyxBaseCardView
    implements OnyxCardViewDefinition.HasBannerImage, OnyxCardViewDefinition.HasContextMenu, OnyxCardViewDefinition.HasHeroTransition, OnyxCardViewDefinition.HasIcon, OnyxCardViewDefinition.HasImageOverlayIcon, OnyxCardViewDefinition.HasImageOverlayLeftText, OnyxCardViewDefinition.HasImageOverlayProgressBar, OnyxCardViewDefinition.HasImageOverlayRightText, OnyxCardViewDefinition.HasPrimaryAction, OnyxCardViewDefinition.HasPrimaryLabelImage, OnyxCardViewDefinition.HasSecondaryLabel, OnyxCardViewDefinition.HasSnippet, OnyxCardViewDefinition.HasTitleIcon
{

    private View mActionsContainerView;
    private OnyxCardViewDefinition.BannerImageClickListener mBannerImageClickListener;
    private OnyxCardViewDefinition.ContextMenuInflater mContextMenuInflater;
    private android.support.v7.widget.PopupMenu.OnMenuItemClickListener mContextMenuListener;
    private View mContextMenuView;
    private int mIconDefaultResId;
    private LoadingImageView mIconImage;
    private Uri mIconUri;
    private View mImageOverlayContainer;
    private ImageView mImageOverlayIcon;
    private OnyxCardViewDefinition.ImageOverlayIconClickListener mImageOverlayIconClickListener;
    private TextView mImageOverlayLeftText;
    private CharArrayBuffer mImageOverlayLeftTextBuffer;
    private ProgressBar mImageOverlayProgressBar;
    private TextView mImageOverlayRightText;
    private CharArrayBuffer mImageOverlayRightTextBuffer;
    private Drawable mPrimaryActionBackground;
    private OnyxCardViewDefinition.PrimaryActionClickListener mPrimaryActionClickListener;
    private Button mPrimaryActionView;
    private ImageView mPrimaryLabelImageView;
    private ClipDrawable mProgressClipDrawable;
    private TextView mSecondaryLabel;
    private CharArrayBuffer mSecondaryLabelTextBuffer;
    private View mSnippetContainer;
    private MetagameAvatarView mSnippetImageView;
    private TextView mSnippetSubtitleView;
    private TextView mSnippetTitleView;
    private OnyxCardViewDefinition.TitleIconClickListener mTitleIconClickListener;
    private View mTitleImageView;

    public OnyxWideCardView(Context context)
    {
        super(context);
    }

    public OnyxWideCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OnyxWideCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void addBannerImageSharedViews(SharedElementTransition sharedelementtransition)
    {
        sharedelementtransition.addSharedLoadingImageView(mImageView, "banner", mImageUri, mImageDefaultResId);
        if (mImageOverlayIcon.getVisibility() == 0)
        {
            sharedelementtransition.addSharedView(mImageOverlayIcon, "imageOverlay");
        }
    }

    public final void addTitleIconSharedViews(SharedElementTransition sharedelementtransition)
    {
        sharedelementtransition.addSharedLoadingImageView(mIconImage, "icon", mIconUri, mIconDefaultResId);
    }

    public final void clearData()
    {
        super.clearData();
        mImageOverlayProgressBar.setVisibility(8);
        mImageOverlayProgressBar.setProgress(0);
        mImageOverlayLeftText.setText("");
        mImageOverlayRightText.setText("");
        mImageOverlayContainer.setVisibility(8);
        mImageOverlayIcon.setVisibility(8);
        setImageOverlayIconClickable(false);
        mIconImage.setVisibility(8);
        mPrimaryLabelImageView.setImageDrawable(null);
        mPrimaryLabelImageView.setVisibility(8);
        mSecondaryLabel.setText("");
        mSecondaryLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        mSecondaryLabel.setVisibility(8);
        mSubtitleView.setText("");
        mSubtitleView.setSingleLine(true);
        mSnippetTitleView.setText("");
        mSnippetTitleView.setSingleLine(false);
        mSnippetTitleView.setEllipsize(null);
        setTextColor(mSnippetTitleView, 0x7f0b007d);
        mSnippetSubtitleView.setText("");
        mSnippetSubtitleView.setSingleLine(false);
        mSnippetSubtitleView.setEllipsize(null);
        setTextColor(mSnippetSubtitleView, 0x7f0b007d);
        mSnippetContainer.setVisibility(8);
        setContextMenuInflater(null);
        mActionsContainerView.setVisibility(8);
        setPrimaryActionClickable(true);
        mPrimaryLabelImageView.setVisibility(8);
    }

    public final void onClick(View view)
    {
        if (view == mImageView)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (view != mIconImage) goto _L2; else goto _L1
_L1:
        trackLogflowClick(view);
_L4:
        return;
_L2:
        if (view == mImageOverlayIcon)
        {
            trackLogflowClick(view);
            mImageOverlayIconClickListener.onImageOverlayIconClicked();
            return;
        }
        if (view != mContextMenuView)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mContextMenuInflater != null)
        {
            view = new PopupMenu(view.getContext(), view);
            mContextMenuInflater.inflateContextMenu(view);
            view.mMenuItemClickListener = mContextMenuListener;
            ((PopupMenu) (view)).mPopup.show();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (view == mPrimaryActionView)
        {
            trackLogflowClick(view);
            mPrimaryActionClickListener.onPrimaryActionClicked();
            return;
        }
        super.onClick(view);
        return;
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        mImageOverlayProgressBar = (ProgressBar)findViewById(0x7f0d0224);
        mImageOverlayContainer = findViewById(0x7f0d0221);
        mImageOverlayLeftText = (TextView)findViewById(0x7f0d0222);
        mImageOverlayLeftTextBuffer = new CharArrayBuffer(64);
        mImageOverlayRightText = (TextView)findViewById(0x7f0d0223);
        mImageOverlayRightTextBuffer = new CharArrayBuffer(64);
        mImageOverlayIcon = (ImageView)findViewById(0x7f0d0220);
        mImageOverlayIcon.setOnClickListener(this);
        mIconImage = (LoadingImageView)findViewById(0x7f0d0210);
        mTitleImageView = findViewById(0x7f0d021d);
        mSnippetContainer = findViewById(0x7f0d0217);
        mSnippetTitleView = (TextView)findViewById(0x7f0d0219);
        mSnippetSubtitleView = (TextView)findViewById(0x7f0d021e);
        mSnippetImageView = (MetagameAvatarView)findViewById(0x7f0d0218);
        mSnippetImageView.setOutlineStrokeWidthResId(0x7f0c016e);
        mSnippetImageView.setShadowStrokeWidthResId(0x7f0c016f);
        mContextMenuView = findViewById(0x7f0d01f4);
        mContextMenuView.setOnClickListener(this);
        mActionsContainerView = findViewById(0x7f0d020c);
        mPrimaryActionView = (Button)findViewById(0x7f0d020e);
        mPrimaryActionView.setOnClickListener(this);
        mPrimaryActionBackground = mPrimaryActionView.getBackground();
        mPrimaryLabelImageView = (ImageView)findViewById(0x7f0d0216);
        mSecondaryLabel = (TextView)findViewById(0x7f0d0206);
        mSecondaryLabel.setOnClickListener(this);
        mSecondaryLabelTextBuffer = new CharArrayBuffer(64);
    }

    public final void resizeSnippet()
    {
        Resources resources = getContext().getResources();
        if (mSnippetContainer.getTag(0x7f0d0047) != null && mRootView.getTag(0x7f0d0047) != null)
        {
            mSnippetContainer.setPadding(mSnippetContainer.getPaddingLeft(), resources.getDimensionPixelSize(0x7f0c016a), mSnippetContainer.getPaddingRight(), mSnippetContainer.getPaddingBottom());
            return;
        } else
        {
            mSnippetContainer.setPadding(mSnippetContainer.getPaddingLeft(), 0, mSnippetContainer.getPaddingRight(), mSnippetContainer.getPaddingBottom());
            return;
        }
    }

    public final void setBannerImageClickListener(OnyxCardViewDefinition.BannerImageClickListener bannerimageclicklistener)
    {
        mBannerImageClickListener = bannerimageclicklistener;
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

    public final void setHeroTransitionNames(String s)
    {
        if (PlatformVersion.checkVersion(21))
        {
            mRootView.setTransitionName((new StringBuilder("root")).append(s).toString());
            mImageView.setTransitionName((new StringBuilder("banner")).append(s).toString());
            mTitleView.setTransitionName((new StringBuilder("title")).append(s).toString());
            mSubtitleView.setTransitionName((new StringBuilder("subtitle")).append(s).toString());
            mContextMenuView.setTransitionName((new StringBuilder("overflow")).append(s).toString());
            mPrimaryLabelView.setTransitionName((new StringBuilder("label")).append(s).toString());
            mImageOverlayIcon.setTransitionName((new StringBuilder("imageOverlay")).append(s).toString());
        }
    }

    public final void setIconImage(Uri uri, int i)
    {
        mIconImage.setVisibility(0);
        mImageLoader.loadImage(mIconImage, uri, i);
        mIconUri = uri;
        mIconDefaultResId = i;
    }

    public final void setImageOverlayIconBackground(Drawable drawable)
    {
        mImageOverlayIcon.setVisibility(0);
        if (PlatformVersion.checkVersion(16))
        {
            mImageOverlayIcon.setBackground(drawable);
            return;
        } else
        {
            mImageOverlayIcon.setBackgroundDrawable(drawable);
            return;
        }
    }

    public final void setImageOverlayIconClickListener(OnyxCardViewDefinition.ImageOverlayIconClickListener imageoverlayiconclicklistener)
    {
        mImageOverlayIconClickListener = imageoverlayiconclicklistener;
        imageoverlayiconclicklistener.attachUiNodeToView(mIconImage, 209);
    }

    public final void setImageOverlayIconClickable(boolean flag)
    {
        mImageOverlayIcon.setClickable(flag);
    }

    public final void setImageOverlayIconContentDescription(int i)
    {
        String s = getContext().getString(i);
        mImageOverlayIcon.setContentDescription(s);
    }

    public final void setImageOverlayLeftText(String s)
    {
        mImageOverlayLeftText.setText(s);
        mImageOverlayContainer.setVisibility(0);
    }

    public final void setImageOverlayProgressBar(int i, int j, int k, int l)
    {
        if (mProgressClipDrawable == null)
        {
            Resources resources = getResources();
            mImageOverlayProgressBar.setProgressDrawable(resources.getDrawable(i));
            mProgressClipDrawable = new ClipDrawable(new ColorDrawable(j), 3, 1);
            ((LayerDrawable)mImageOverlayProgressBar.getProgressDrawable()).setDrawableByLayerId(0x102000d, mProgressClipDrawable);
        }
        mImageOverlayProgressBar.setMax(l);
        mImageOverlayProgressBar.setProgress(k);
        mImageOverlayProgressBar.setVisibility(0);
    }

    public final void setImageOverlayRightText(String s)
    {
        mImageOverlayRightText.setText(s);
        mImageOverlayContainer.setVisibility(0);
    }

    public final void setPrimaryAction(int i)
    {
        mActionsContainerView.setVisibility(0);
        mPrimaryActionView.setText(i);
    }

    public final void setPrimaryActionClickListener(OnyxCardViewDefinition.PrimaryActionClickListener primaryactionclicklistener)
    {
        mPrimaryActionClickListener = primaryactionclicklistener;
        primaryactionclicklistener.attachUiNodeToView(mPrimaryActionView, 201);
    }

    public final void setPrimaryActionClickable(boolean flag)
    {
        mPrimaryActionView.setClickable(flag);
        Drawable drawable;
        if (flag)
        {
            drawable = mPrimaryActionBackground;
        } else
        {
            drawable = null;
        }
        if (PlatformVersion.checkVersion(16))
        {
            mPrimaryActionView.setBackground(drawable);
            return;
        } else
        {
            mPrimaryActionView.setBackgroundDrawable(drawable);
            return;
        }
    }

    public final void setPrimaryActionContentDescription(int i)
    {
        String s = getContext().getString(i);
        mPrimaryActionView.setContentDescription(s);
    }

    public final void setPrimaryLabelImage(int i)
    {
        mPrimaryLabelImageView.setImageResource(i);
        mPrimaryLabelImageView.setVisibility(0);
    }

    public final void setSecondaryLabel(String s)
    {
        mSecondaryLabel.setVisibility(0);
        mSecondaryLabel.setText(s);
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
