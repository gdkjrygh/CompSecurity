// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

// Referenced classes of package com.android.ex.photo:
//            Intents

public static final class <init>
{

    private boolean mActionBarHiddenInitially;
    private boolean mDisplayFullScreenThumbs;
    private String mInitialPhotoUri;
    private final Intent mIntent;
    private Float mMaxInitialScale;
    private Integer mPhotoIndex;
    private String mPhotosUri;
    private String mProjection[];
    private String mResolvedPhotoUri;
    private boolean mScaleAnimation;
    private int mStartHeight;
    private int mStartWidth;
    private int mStartX;
    private int mStartY;
    private String mThumbnailUri;
    private boolean mWatchNetwork;

    private void initialize()
    {
        mScaleAnimation = false;
        mActionBarHiddenInitially = false;
        mDisplayFullScreenThumbs = false;
    }

    public final Intent build()
    {
        mIntent.setAction("android.intent.action.VIEW");
        mIntent.setFlags(0x4080000);
        if (mPhotoIndex != null)
        {
            mIntent.putExtra("photo_index", mPhotoIndex.intValue());
        }
        if (mInitialPhotoUri != null)
        {
            mIntent.putExtra("initial_photo_uri", mInitialPhotoUri);
        }
        if (mInitialPhotoUri != null && mPhotoIndex != null)
        {
            throw new IllegalStateException("specified both photo index and photo uri");
        }
        if (mPhotosUri != null)
        {
            mIntent.putExtra("photos_uri", mPhotosUri);
            mIntent.setData(Uri.parse(mPhotosUri));
        }
        if (mResolvedPhotoUri != null)
        {
            mIntent.putExtra("resolved_photo_uri", mResolvedPhotoUri);
        }
        if (mProjection != null)
        {
            mIntent.putExtra("projection", mProjection);
        }
        if (mThumbnailUri != null)
        {
            mIntent.putExtra("thumbnail_uri", mThumbnailUri);
        }
        if (mMaxInitialScale != null)
        {
            mIntent.putExtra("max_scale", mMaxInitialScale);
        }
        mIntent.putExtra("watch_network", mWatchNetwork);
        mIntent.putExtra("scale_up_animation", mScaleAnimation);
        if (mScaleAnimation)
        {
            mIntent.putExtra("start_x_extra", mStartX);
            mIntent.putExtra("start_y_extra", mStartY);
            mIntent.putExtra("start_width_extra", mStartWidth);
            mIntent.putExtra("start_height_extra", mStartHeight);
        }
        mIntent.putExtra("action_bar_hidden_initially", mActionBarHiddenInitially);
        mIntent.putExtra("display_thumbs_fullscreen", mDisplayFullScreenThumbs);
        return mIntent;
    }

    public final mIntent setActionBarHiddenInitially(boolean flag)
    {
        mActionBarHiddenInitially = flag;
        return this;
    }

    public final mActionBarHiddenInitially setDisplayThumbsFullScreen(boolean flag)
    {
        mDisplayFullScreenThumbs = flag;
        return this;
    }

    public final mDisplayFullScreenThumbs setInitialPhotoUri(String s)
    {
        mInitialPhotoUri = s;
        return this;
    }

    public final mInitialPhotoUri setMaxInitialScale(float f)
    {
        mMaxInitialScale = Float.valueOf(f);
        return this;
    }

    public final mMaxInitialScale setProjection(String as[])
    {
        mProjection = as;
        return this;
    }

    public final mProjection setResolvedPhotoUri(String s)
    {
        mResolvedPhotoUri = s;
        return this;
    }

    public final mResolvedPhotoUri setThumbnailUri(String s)
    {
        mThumbnailUri = s;
        return this;
    }

    private _cls9(Context context, Class class1)
    {
        mIntent = new Intent(context, class1);
        initialize();
    }

    initialize(Context context, Class class1, initialize initialize1)
    {
        this(context, class1);
    }
}
