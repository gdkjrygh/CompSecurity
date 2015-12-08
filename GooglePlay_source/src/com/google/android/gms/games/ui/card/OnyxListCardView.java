// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.content.Context;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.widget.PopupMenu;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.ui.ImageLoader;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxBaseCardView

public final class OnyxListCardView extends OnyxBaseCardView
    implements OnyxCardViewDefinition.HasAvatarRow, OnyxCardViewDefinition.HasBackgroundColor, OnyxCardViewDefinition.HasContextMenu, OnyxCardViewDefinition.HasCustomImage, OnyxCardViewDefinition.HasCustomPrimaryLabel, OnyxCardViewDefinition.HasImagePadding, OnyxCardViewDefinition.HasPrimaryAction, OnyxCardViewDefinition.HasSecondaryAction, OnyxCardViewDefinition.HasSecondaryLabel, OnyxCardViewDefinition.HasTitleIcon
{

    private View mActionsContainerView;
    private TextView mAvatarOthersView;
    private OnyxCardViewDefinition.AvatarRowClickListener mAvatarRowClickListener;
    private View mAvatarRowContainerView;
    private LoadingImageView mAvatarViewArray[];
    private View mBackgroundView;
    private OnyxCardViewDefinition.ContextMenuInflater mContextMenuInflater;
    private android.support.v7.widget.PopupMenu.OnMenuItemClickListener mContextMenuListener;
    private View mContextMenuView;
    private FrameLayout mImageContainerView;
    private RelativeLayout mMainContainerView;
    private Drawable mPrimaryActionBackground;
    private OnyxCardViewDefinition.PrimaryActionClickListener mPrimaryActionClickListener;
    private Button mPrimaryActionView;
    private Drawable mSecondaryActionBackground;
    private OnyxCardViewDefinition.SecondaryActionClickListener mSecondaryActionClickListener;
    private Button mSecondaryActionView;
    private Drawable mSecondaryLabelBackground;
    private TextView mSecondaryLabelView;
    private CharArrayBuffer mSecondaryLabelViewBuffer;
    private OnyxCardViewDefinition.TitleIconClickListener mTitleIconClickListener;

    public OnyxListCardView(Context context)
    {
        super(context);
    }

    public OnyxListCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OnyxListCardView(Context context, AttributeSet attributeset, int i)
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
        mBackgroundView.setVisibility(8);
        for (int i = mImageContainerView.getChildCount() - 1; i >= 0; i--)
        {
            if (!mImageContainerView.getChildAt(i).equals(mImageView))
            {
                mImageContainerView.removeViewAt(i);
            }
        }

        mSecondaryLabelView.setVisibility(8);
        setTextColor(mSecondaryLabelView, 0x7f0b007c);
        mAvatarRowContainerView.setVisibility(8);
        setContextMenuInflater(null);
        mActionsContainerView.setVisibility(8);
        mSecondaryActionView.setVisibility(8);
        setPrimaryActionClickable(true);
        mSecondaryActionView.setClickable(true);
        Drawable drawable = mSecondaryActionBackground;
        if (PlatformVersion.checkVersion(16))
        {
            mSecondaryActionView.setBackground(drawable);
        } else
        {
            mSecondaryActionView.setBackgroundDrawable(drawable);
        }
        setAvatarRowClickable(false);
    }

    public final void onClick(View view)
    {
        if (view == mAvatarViewArray[0])
        {
            trackLogflowClick(view);
            mAvatarRowClickListener.onAvatarViewClicked(1);
        } else
        {
            if (view == mAvatarViewArray[1])
            {
                trackLogflowClick(view);
                mAvatarRowClickListener.onAvatarViewClicked(2);
                return;
            }
            if (view == mAvatarViewArray[2])
            {
                trackLogflowClick(view);
                mAvatarRowClickListener.onAvatarViewClicked(3);
                return;
            }
            if (view == mAvatarViewArray[3])
            {
                trackLogflowClick(view);
                mAvatarRowClickListener.onAvatarViewClicked(4);
                return;
            }
            if (view == mAvatarOthersView)
            {
                trackLogflowClick(view);
                mAvatarRowClickListener.onAvatarOthersViewClicked();
                return;
            }
            if (view == mContextMenuView)
            {
                if (mContextMenuInflater != null)
                {
                    view = new PopupMenu(view.getContext(), view);
                    mContextMenuInflater.inflateContextMenu(view);
                    view.mMenuItemClickListener = mContextMenuListener;
                    ((PopupMenu) (view)).mPopup.show();
                    return;
                }
            } else
            {
                if (view == mPrimaryActionView)
                {
                    trackLogflowClick(view);
                    mPrimaryActionClickListener.onPrimaryActionClicked();
                    return;
                }
                if (view == mSecondaryActionView)
                {
                    trackLogflowClick(view);
                    mSecondaryActionClickListener.onSecondaryActionClicked();
                    return;
                } else
                {
                    super.onClick(view);
                    return;
                }
            }
        }
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        mBackgroundView = findViewById(0x7f0d0203);
        mImageContainerView = (FrameLayout)findViewById(0x7f0d0070);
        mMainContainerView = (RelativeLayout)findViewById(0x7f0d010f);
        mSecondaryLabelView = (TextView)findViewById(0x7f0d0206);
        mSecondaryLabelViewBuffer = new CharArrayBuffer(64);
        mAvatarRowContainerView = findViewById(0x7f0d0208);
        mAvatarViewArray = new LoadingImageView[4];
        mAvatarViewArray[0] = (LoadingImageView)findViewById(0x7f0d00e2);
        mAvatarViewArray[0].setCircleCropEnabled(true);
        mAvatarViewArray[0].setOnClickListener(this);
        mAvatarViewArray[1] = (LoadingImageView)findViewById(0x7f0d00e3);
        mAvatarViewArray[1].setCircleCropEnabled(true);
        mAvatarViewArray[1].setOnClickListener(this);
        mAvatarViewArray[2] = (LoadingImageView)findViewById(0x7f0d0209);
        mAvatarViewArray[2].setCircleCropEnabled(true);
        mAvatarViewArray[2].setOnClickListener(this);
        mAvatarViewArray[3] = (LoadingImageView)findViewById(0x7f0d020a);
        mAvatarViewArray[3].setCircleCropEnabled(true);
        mAvatarViewArray[3].setOnClickListener(this);
        mAvatarOthersView = (TextView)findViewById(0x7f0d020b);
        mAvatarOthersView.setOnClickListener(this);
        mContextMenuView = findViewById(0x7f0d0205);
        mContextMenuView.setOnClickListener(this);
        mActionsContainerView = findViewById(0x7f0d020c);
        mPrimaryActionView = (Button)findViewById(0x7f0d020e);
        mPrimaryActionView.setOnClickListener(this);
        mPrimaryActionBackground = mPrimaryActionView.getBackground();
        mSecondaryActionView = (Button)findViewById(0x7f0d020d);
        mSecondaryActionView.setOnClickListener(this);
        mSecondaryActionBackground = mSecondaryActionView.getBackground();
        mSecondaryLabelBackground = mPrimaryLabelView.getBackground();
    }

    public final void setAvatarRowClickListener(OnyxCardViewDefinition.AvatarRowClickListener avatarrowclicklistener)
    {
        mAvatarRowClickListener = avatarrowclicklistener;
        int i = 0;
        for (int j = mAvatarViewArray.length; i < j; i++)
        {
            avatarrowclicklistener.attachUiNodeToView(mAvatarViewArray[i], i + 204);
        }

        avatarrowclicklistener.attachUiNodeToView(mAvatarOthersView, 208);
    }

    public final void setAvatarRowClickable(boolean flag)
    {
        int i = 0;
        for (int j = mAvatarViewArray.length; i < j; i++)
        {
            mAvatarViewArray[i].setClickable(flag);
        }

        mAvatarOthersView.setClickable(flag);
    }

    public final void setAvatarRowData(ArrayList arraylist, int i)
    {
        mSubtitleView.setMaxLines(1);
        mAvatarRowContainerView.setVisibility(0);
        int k = arraylist.size();
        int j = 0;
        int l = mAvatarViewArray.length;
        while (j < l) 
        {
            if (arraylist.size() > j)
            {
                mAvatarViewArray[j].setVisibility(0);
                mImageLoader.loadImage(mAvatarViewArray[j], (Uri)arraylist.get(j), i);
            } else
            {
                mAvatarViewArray[j].setVisibility(8);
            }
            j++;
        }
        if (k > mAvatarViewArray.length)
        {
            mAvatarOthersView.setVisibility(0);
            mAvatarOthersView.setText(getContext().getString(0x7f10020c, new Object[] {
                Integer.valueOf(k - 4)
            }));
            return;
        } else
        {
            mAvatarOthersView.setVisibility(8);
            return;
        }
    }

    public final void setAvatarRowDescription(String s)
    {
        int i = 0;
        for (int j = mAvatarViewArray.length; i < j; i++)
        {
            mAvatarViewArray[i].setContentDescription(s);
        }

        mAvatarOthersView.setContentDescription(s);
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

    public final void setCustomImage(View view)
    {
        mImageView.setVisibility(8);
        mImageContainerView.addView(view);
    }

    public final void setCustomPrimaryLabelView(View view)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(12);
        layoutparams.addRule(11);
        view.setLayoutParams(layoutparams);
        mMainContainerView.addView(view);
    }

    public final void setImagePaddingEnabled(boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams = mImageContainerView.getLayoutParams();
        Resources resources = getResources();
        if (flag)
        {
            int i = resources.getDimensionPixelSize(0x7f0c014c);
            mImageContainerView.setPadding(i, i, 0, i);
            layoutparams.width = resources.getDimensionPixelSize(0x7f0c014b) + i;
            layoutparams.height = resources.getDimensionPixelSize(0x7f0c014b) + i * 2;
        } else
        {
            mImageContainerView.setPadding(0, 0, 0, 0);
            int j = resources.getDimensionPixelSize(0x7f0c014b);
            layoutparams.height = j;
            layoutparams.width = j;
        }
        mImageContainerView.setLayoutParams(layoutparams);
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

    public final void setRootViewBackgroundColor(int i)
    {
        mBackgroundView.setVisibility(0);
        mBackgroundView.setBackgroundColor(i);
    }

    public final void setSecondaryAction(int i)
    {
        mActionsContainerView.setVisibility(0);
        mSecondaryActionView.setVisibility(0);
        mSecondaryActionView.setText(i);
    }

    public final void setSecondaryActionClickListener(OnyxCardViewDefinition.SecondaryActionClickListener secondaryactionclicklistener)
    {
        mSecondaryActionClickListener = secondaryactionclicklistener;
        secondaryactionclicklistener.attachUiNodeToView(mSecondaryActionView, 202);
    }

    public final void setSecondaryActionContentDescription(int i)
    {
        String s = getContext().getString(i);
        mSecondaryActionView.setContentDescription(s);
    }

    public final void setSecondaryLabel(String s)
    {
        mSecondaryLabelView.setVisibility(0);
        mSecondaryLabelView.setText(s);
    }

    public final void setTitleIconClickListener(OnyxCardViewDefinition.TitleIconClickListener titleiconclicklistener)
    {
        mTitleIconClickListener = titleiconclicklistener;
    }
}
