// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.images.internal.CrossFadingDrawable;
import com.google.android.gms.common.images.internal.ImageUtils;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.images.internal.PostProcessedResourceCache;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public abstract class ImageRequest
{
    static final class ImageData
    {

        public final Uri uri;

        public final boolean equals(Object obj)
        {
            if (!(obj instanceof ImageData))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            } else
            {
                return Objects.equal(((ImageData)obj).uri, uri);
            }
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                uri
            });
        }

        public ImageData(Uri uri1)
        {
            uri = uri1;
        }
    }

    public static final class ImageViewImageRequest extends ImageRequest
    {

        private WeakReference mImageViewRef;

        public final boolean equals(Object obj)
        {
            if (obj instanceof ImageViewImageRequest)
            {
                if (this == obj)
                {
                    return true;
                }
                Object obj1 = (ImageViewImageRequest)obj;
                obj = (ImageView)mImageViewRef.get();
                obj1 = (ImageView)((ImageViewImageRequest) (obj1)).mImageViewRef.get();
                if (obj1 != null && obj != null && Objects.equal(obj1, obj))
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return 0;
        }

        protected final void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
label0:
            {
                Object obj1 = null;
                ImageView imageview = (ImageView)mImageViewRef.get();
                if (imageview == null)
                {
                    break label0;
                }
                int i;
                boolean flag3;
                if (!flag1 && !flag2)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0 && (imageview instanceof LoadingImageView))
                {
                    int j = ((LoadingImageView)imageview).mLoadedNoDataPlaceholderResId;
                    if (mNoDataPlaceholderResId != 0 && j == mNoDataPlaceholderResId)
                    {
                        break label0;
                    }
                }
                if (mCrossFade && !flag1 && (!flag || mCrossFadeAlways))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (mUseNewDrawable && drawable != null)
                {
                    drawable = drawable.getConstantState().newDrawable();
                }
                if (flag3)
                {
                    Object obj2 = imageview.getDrawable();
                    Object obj;
                    if (obj2 != null)
                    {
                        obj = obj2;
                        if (obj2 instanceof CrossFadingDrawable)
                        {
                            obj = ((CrossFadingDrawable)obj2).mEndDrawable;
                        }
                    } else
                    {
                        obj = null;
                    }
                    drawable = new CrossFadingDrawable(((Drawable) (obj)), drawable);
                }
                imageview.setImageDrawable(drawable);
                if (imageview instanceof LoadingImageView)
                {
                    obj2 = (LoadingImageView)imageview;
                    obj = obj1;
                    if (flag2)
                    {
                        obj = mImageData.uri;
                    }
                    obj2.mLoadedUri = ((Uri) (obj));
                    if (i != 0)
                    {
                        i = mNoDataPlaceholderResId;
                    } else
                    {
                        i = 0;
                    }
                    obj2.mLoadedNoDataPlaceholderResId = i;
                }
                if (flag3)
                {
                    drawable = (CrossFadingDrawable)drawable;
                    drawable.mFrom = 0;
                    drawable.mTo = ((CrossFadingDrawable) (drawable)).mMaxAlpha;
                    drawable.mAlpha = 0;
                    drawable.mDuration = 250;
                    drawable.mTransitionState = 1;
                    drawable.invalidateSelf();
                }
            }
        }

        public ImageViewImageRequest(ImageView imageview, Uri uri)
        {
            super(uri, 0);
            Asserts.checkNotNull(imageview);
            mImageViewRef = new WeakReference(imageview);
        }
    }

    public static final class ListenerImageRequest extends ImageRequest
    {

        public final boolean equals(Object obj)
        {
            if (!(obj instanceof ListenerImageRequest))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            } else
            {
                obj = (ListenerImageRequest)obj;
                throw new NullPointerException();
            }
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                mImageData
            });
        }

        protected final void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                throw new NullPointerException();
            } else
            {
                return;
            }
        }
    }


    public boolean mCrossFade;
    public boolean mCrossFadeAlways;
    final ImageData mImageData;
    protected int mLoadingPlaceholderResId;
    protected int mNoDataPlaceholderResId;
    protected ImageManager.OnImageLoadedListener mOnImageLoadedListener;
    protected int mPostProcessingFlags;
    public boolean mUseLoadingPlaceholder;
    protected boolean mUseNewDrawable;

    public ImageRequest(Uri uri, int i)
    {
        mLoadingPlaceholderResId = 0;
        mNoDataPlaceholderResId = 0;
        mUseNewDrawable = false;
        mCrossFade = true;
        mCrossFadeAlways = false;
        mUseLoadingPlaceholder = true;
        mImageData = new ImageData(uri);
        mNoDataPlaceholderResId = i;
    }

    public abstract void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    final void loadNoDataPlaceholder(Context context, PostProcessedResourceCache postprocessedresourcecache, boolean flag)
    {
        Object obj = null;
        if (mNoDataPlaceholderResId != 0)
        {
            int i = mNoDataPlaceholderResId;
            Resources resources = context.getResources();
            if (mPostProcessingFlags > 0)
            {
                com.google.android.gms.common.images.internal.PostProcessedResourceCache.PostProcessedResource postprocessedresource = new com.google.android.gms.common.images.internal.PostProcessedResourceCache.PostProcessedResource(i, mPostProcessingFlags);
                obj = (Drawable)postprocessedresourcecache.get(postprocessedresource);
                context = ((Context) (obj));
                if (obj == null)
                {
                    obj = resources.getDrawable(i);
                    context = ((Context) (obj));
                    if ((mPostProcessingFlags & 1) != 0)
                    {
                        context = ImageUtils.frameDrawableInCircle(resources, ((Drawable) (obj)));
                    }
                    postprocessedresourcecache.put(postprocessedresource, context);
                }
                obj = context;
            } else
            {
                obj = resources.getDrawable(i);
            }
        }
        if (mOnImageLoadedListener != null)
        {
            mOnImageLoadedListener.onImageLoaded$482c40fe(((Drawable) (obj)));
        }
        loadImage(((Drawable) (obj)), flag, false, false);
    }

    final void onImageLoaded(Context context, Bitmap bitmap, boolean flag)
    {
        Asserts.checkNotNull(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((mPostProcessingFlags & 1) != 0)
        {
            bitmap1 = ImageUtils.frameBitmapInCircle(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (mOnImageLoadedListener != null)
        {
            mOnImageLoadedListener.onImageLoaded$482c40fe(context);
        }
        loadImage(context, flag, false, true);
    }

    public final void setNoDataPlaceholder(int i)
    {
        mNoDataPlaceholderResId = i;
    }

    public final void setOnImageLoadedListener(ImageManager.OnImageLoadedListener onimageloadedlistener)
    {
        mOnImageLoadedListener = onimageloadedlistener;
    }

    public final void setPostProcessingFlags(int i)
    {
        mPostProcessingFlags = i;
    }

    public final void setUseNewDrawable(boolean flag)
    {
        mUseNewDrawable = false;
    }
}
