// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.content.Context;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.ui.ImageLoader;
import com.google.android.gms.games.ui.LogflowEventListener;

public abstract class OnyxBaseCardView extends CardView
    implements android.view.View.OnClickListener
{

    private OnyxCardViewDefinition.ImageClickListener mImageClickListener;
    protected int mImageDefaultResId;
    protected ImageLoader mImageLoader;
    protected Uri mImageUri;
    protected LoadingImageView mImageView;
    LogflowEventListener mLogListener;
    private Drawable mPrimaryLabelBackground;
    protected TextView mPrimaryLabelView;
    protected View mRootView;
    protected OnyxCardViewDefinition.RootViewClickListener mRootViewClickListener;
    OnyxCardViewDefinition.SubtitleClickListener mSubtitleClickListener;
    protected TextView mSubtitleView;
    CharArrayBuffer mSubtitleViewBuffer;
    OnyxCardViewDefinition.TitleClickListener mTitleClickListener;
    protected TextView mTitleView;
    CharArrayBuffer mTitleViewBuffer;

    public OnyxBaseCardView(Context context)
    {
        super(context);
    }

    public OnyxBaseCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OnyxBaseCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void clearData()
    {
        setRootViewAlpha(1.0F);
        setClickable(true);
        mImageView.setVisibility(0);
        mImageView.setCircleCropEnabled(false);
        setImageAlpha(255);
        setImageClickable(false);
        setTitleColorResId(0x7f0b007e);
        mSubtitleView.setSingleLine(false);
        mSubtitleView.setMaxLines(2);
        mSubtitleView.setVisibility(0);
        setSubtitleColorResId(0x7f0b007d);
        if (mPrimaryLabelView != null)
        {
            mPrimaryLabelView.setVisibility(8);
            setPrimaryLabelColorResId(0x7f0b007c);
        }
        mLogListener = null;
        setCardBackgroundColor(-1);
    }

    public void hideSubtitle()
    {
        mSubtitleView.setVisibility(8);
    }

    public void onClick(View view)
    {
        trackLogflowClick(view);
        if (view == mRootView)
        {
            mRootViewClickListener.onRootViewClicked();
        } else
        if (view == mImageView)
        {
            mImageClickListener.onImageViewClicked();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mRootView = this;
        mRootView.setOnClickListener(this);
        mImageView = (LoadingImageView)findViewById(0x7f0d006f);
        mImageView.setOnClickListener(this);
        mTitleView = (TextView)findViewById(0x7f0d0075);
        mTitleViewBuffer = new CharArrayBuffer(64);
        mSubtitleView = (TextView)findViewById(0x7f0d0074);
        mSubtitleViewBuffer = new CharArrayBuffer(64);
        mPrimaryLabelView = (TextView)findViewById(0x7f0d0207);
        if (mPrimaryLabelView != null)
        {
            mPrimaryLabelBackground = mPrimaryLabelView.getBackground();
        }
        mLogListener = null;
    }

    public final void setImage(Uri uri, int i)
    {
        mImageLoader.loadImage(mImageView, uri, i);
        mImageUri = uri;
        mImageDefaultResId = i;
    }

    public final void setImageAlpha(int i)
    {
        if (PlatformVersion.checkVersion(16))
        {
            mImageView.setImageAlpha(i);
            return;
        } else
        {
            mImageView.setAlpha(i);
            return;
        }
    }

    public final void setImageAspectRatio(float f)
    {
        mImageView.setImageAspectRatioAdjust(2, f);
    }

    public final void setImageCircleCropEnabled(boolean flag)
    {
        mImageView.setCircleCropEnabled(flag);
    }

    public final void setImageClickListener(OnyxCardViewDefinition.ImageClickListener imageclicklistener)
    {
        mImageClickListener = imageclicklistener;
        imageclicklistener.attachUiNodeToView(mImageView, 203);
    }

    public final void setImageClickable(boolean flag)
    {
        mImageView.setClickable(flag);
    }

    public final void setImageContentDescription(String s)
    {
        mImageView.setContentDescription(s);
    }

    public final void setImageLoader(ImageLoader imageloader)
    {
        mImageLoader = imageloader;
    }

    public void setPrimaryLabel(int i)
    {
        setPrimaryLabel(getContext().getResources().getString(i));
    }

    public void setPrimaryLabel(String s)
    {
        mPrimaryLabelView.setVisibility(0);
        TextView textview = mPrimaryLabelView;
        if (s == null)
        {
            s = null;
        } else
        {
            s = s.toUpperCase();
        }
        textview.setText(s);
    }

    public final void setPrimaryLabelColorResId(int i)
    {
        setTextColor(mPrimaryLabelView, i);
    }

    public final void setPrimaryLabelContentDescription(String s)
    {
        mPrimaryLabelView.setContentDescription(s);
    }

    public final void setRootViewAlpha(float f)
    {
        if (PlatformVersion.checkVersion(11))
        {
            mRootView.setAlpha(f);
        }
    }

    public final void setRootViewClickListener(OnyxCardViewDefinition.RootViewClickListener rootviewclicklistener)
    {
        mRootViewClickListener = rootviewclicklistener;
        rootviewclicklistener.attachUiNodeToView(this, 200);
    }

    public final void setRootViewContentDescription(String s)
    {
        mRootView.setContentDescription(s);
    }

    public final void setSubtitle(int i)
    {
        mSubtitleView.setText(i);
    }

    public final void setSubtitle(CharArrayBuffer chararraybuffer)
    {
        mSubtitleView.setText(chararraybuffer.data, 0, chararraybuffer.sizeCopied);
    }

    public final void setSubtitle(String s)
    {
        mSubtitleView.setText(s);
    }

    public final void setSubtitleColorResId(int i)
    {
        setTextColor(mSubtitleView, i);
    }

    protected final void setTextColor(TextView textview, int i)
    {
        if (i > 0)
        {
            Resources resources = getContext().getResources();
            if (resources != null)
            {
                textview.setTextColor(resources.getColor(i));
            }
        }
    }

    public final void setTitle(int i)
    {
        mTitleView.setText(i);
    }

    public final void setTitle(CharArrayBuffer chararraybuffer)
    {
        mTitleView.setText(chararraybuffer.data, 0, chararraybuffer.sizeCopied);
    }

    public final void setTitle(String s)
    {
        mTitleView.setText(s);
    }

    public final void setTitleColorResId(int i)
    {
        setTextColor(mTitleView, i);
    }

    protected final void trackLogflowClick(View view)
    {
        if (mLogListener != null)
        {
            mLogListener.logClick(view);
        }
    }
}
