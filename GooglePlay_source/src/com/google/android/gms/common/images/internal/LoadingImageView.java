// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageRequest;
import com.google.android.gms.common.internal.Asserts;

// Referenced classes of package com.google.android.gms.common.images.internal:
//            ColorFilters

public final class LoadingImageView extends ImageView
{

    private static ImageManager mImageManager;
    private int mAspectRatioAdjust;
    public boolean mCrossFade;
    private boolean mCrossFadeAlways;
    private float mFixedAspectRatio;
    private boolean mForceNextCrossFade;
    public int mLoadedNoDataPlaceholderResId;
    public Uri mLoadedUri;
    public com.google.android.gms.common.images.ImageManager.OnImageLoadedListener mOnImageLoadedListener;
    private int mPostProcessingFlags;
    private int mTintColor;

    public LoadingImageView(Context context)
    {
        this(context, null, 0);
    }

    public LoadingImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LoadingImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mLoadedNoDataPlaceholderResId = 0;
        mCrossFade = true;
        mCrossFadeAlways = false;
        mForceNextCrossFade = false;
        mTintColor = 0;
        mPostProcessingFlags = 0;
        mAspectRatioAdjust = 0;
        mFixedAspectRatio = 1.0F;
        context = context.obtainStyledAttributes(attributeset, com.google.android.gms.R.styleable.LoadingImageView);
        mAspectRatioAdjust = context.getInt(0, 0);
        mFixedAspectRatio = context.getFloat(1, 1.0F);
        setCircleCropEnabled(context.getBoolean(2, false));
        context.recycle();
    }

    private void informListener$1385ff()
    {
        if (mOnImageLoadedListener != null)
        {
            mOnImageLoadedListener.onImageLoaded$482c40fe(null);
        }
    }

    public final void clearImage()
    {
        loadUri$3329f911(null, 0, true);
        mForceNextCrossFade = true;
    }

    public void loadUri$3329f911(Uri uri, int i, boolean flag)
    {
        boolean flag1;
        if (uri != null)
        {
            flag1 = uri.equals(mLoadedUri);
        } else
        if (mLoadedUri == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            if (mLoadedUri != null)
            {
                informListener$1385ff();
                return;
            }
            if (mLoadedNoDataPlaceholderResId == i)
            {
                informListener$1385ff();
                return;
            }
        }
        if (mImageManager == null)
        {
            flag1 = getContext().getApplicationContext().getPackageName().equals("com.google.android.play.games");
            mImageManager = ImageManager.create(getContext(), flag1);
        }
        if (mForceNextCrossFade)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mForceNextCrossFade = false;
        uri = new com.google.android.gms.common.images.ImageRequest.ImageViewImageRequest(this, uri);
        uri.setNoDataPlaceholder(i);
        uri.mCrossFade = mCrossFade;
        uri.mCrossFadeAlways = flag1;
        if (flag1)
        {
            uri.mCrossFade = true;
        }
        uri.mUseLoadingPlaceholder = flag;
        uri.setPostProcessingFlags(mPostProcessingFlags);
        uri.setOnImageLoadedListener(mOnImageLoadedListener);
        uri.setUseNewDrawable(false);
        mImageManager.loadImage(uri);
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mTintColor != 0)
        {
            canvas.drawColor(mTintColor);
        }
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        mAspectRatioAdjust;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 54;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * mFixedAspectRatio);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / mFixedAspectRatio);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void setCircleCropEnabled(boolean flag)
    {
        if (flag)
        {
            mPostProcessingFlags = mPostProcessingFlags | 1;
            return;
        } else
        {
            mPostProcessingFlags = mPostProcessingFlags & -2;
            return;
        }
    }

    public final void setImageAspectRatioAdjust(int i, float f)
    {
        boolean flag1 = true;
        boolean flag;
        if (i == 0 || i == 1 || i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (f > 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mAspectRatioAdjust = i;
        mFixedAspectRatio = f;
        requestLayout();
    }

    public final void setTintColorId(int i)
    {
        boolean flag = false;
        int j = ((flag) ? 1 : 0);
        if (i > 0)
        {
            Resources resources = getResources();
            j = ((flag) ? 1 : 0);
            if (resources != null)
            {
                j = resources.getColor(i);
            }
        }
        mTintColor = j;
        if (mTintColor != 0)
        {
            setColorFilter(ColorFilters.COLOR_FILTER_BW);
        } else
        {
            setColorFilter(null);
        }
        invalidate();
    }
}
