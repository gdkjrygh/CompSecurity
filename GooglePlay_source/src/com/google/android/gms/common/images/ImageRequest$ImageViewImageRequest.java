// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.images.internal.CrossFadingDrawable;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageRequest

public static final class mImageViewRef extends ImageRequest
{

    private WeakReference mImageViewRef;

    public final boolean equals(Object obj)
    {
        if (obj instanceof mImageViewRef)
        {
            if (this == obj)
            {
                return true;
            }
            Object obj1 = (mImageViewRef)obj;
            obj = (ImageView)mImageViewRef.get();
            obj1 = (ImageView)((mImageViewRef) (obj1)).mImageViewRef.get();
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
            if (super.mCrossFade && !flag1 && (!flag || super.mCrossFadeAlways))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (mUseNewDrawable && drawable != null)
            {
                drawable = drawable.getConstantState().mUseNewDrawable();
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
                    obj = mImageData.mImageData;
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

    public (ImageView imageview, Uri uri)
    {
        super(uri, 0);
        Asserts.checkNotNull(imageview);
        mImageViewRef = new WeakReference(imageview);
    }
}
