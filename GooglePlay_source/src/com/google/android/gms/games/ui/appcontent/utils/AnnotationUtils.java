// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageRequest;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import java.lang.ref.WeakReference;

public final class AnnotationUtils
{
    private static final class AnnotationTextImageRequest extends ImageRequest
    {

        private int mImagePosition;
        private WeakReference mTextViewRef;

        public final boolean equals(Object obj)
        {
            if (obj instanceof AnnotationTextImageRequest)
            {
                if (this == obj)
                {
                    return true;
                }
                Object obj1 = (AnnotationTextImageRequest)obj;
                if (mImagePosition == ((AnnotationTextImageRequest) (obj1)).mImagePosition)
                {
                    obj = (TextView)mTextViewRef.get();
                    obj1 = (TextView)((AnnotationTextImageRequest) (obj1)).mTextViewRef.get();
                    if (obj1 != null && obj != null && Objects.equal(obj1, obj))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return mImagePosition;
        }

        protected final void loadImage(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            TextView textview = (TextView)mTextViewRef.get();
            if (textview == null)
            {
                return;
            }
            Drawable adrawable[] = textview.getCompoundDrawables();
            Drawable drawable1;
            Drawable drawable2;
            Drawable drawable3;
            if (mImagePosition == 0)
            {
                drawable1 = drawable;
            } else
            {
                drawable1 = adrawable[0];
            }
            if (mImagePosition == 2)
            {
                drawable2 = drawable;
            } else
            {
                drawable2 = adrawable[1];
            }
            if (mImagePosition == 1)
            {
                drawable3 = drawable;
            } else
            {
                drawable3 = adrawable[2];
            }
            if (mImagePosition != 3)
            {
                drawable = adrawable[3];
            }
            textview.setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable);
        }

        public AnnotationTextImageRequest(TextView textview, int i)
        {
            super(null, 0);
            mTextViewRef = new WeakReference(textview);
            mImagePosition = i;
        }

        public AnnotationTextImageRequest(TextView textview, int i, Uri uri, int j)
        {
            super(uri, j);
            mTextViewRef = new WeakReference(textview);
            mImagePosition = i;
        }
    }


    public static ImageManager mImageManager;

    public static void ensureImageManager(Context context)
    {
        if (mImageManager == null)
        {
            mImageManager = ImageManager.create(context, true);
        }
    }

    public static int getColor(AppContentAnnotation appcontentannotation, int i, String s)
    {
        if (appcontentannotation.getModifiers() != null)
        {
            if (!TextUtils.isEmpty(s = appcontentannotation.getModifiers().getString(s)))
            {
                appcontentannotation = s;
                if (s.length() == 6)
                {
                    appcontentannotation = (new StringBuilder("#FF")).append(s).toString();
                }
                return Color.parseColor(appcontentannotation);
            }
        }
        return i;
    }

    public static void putImageInTextView(Context context, TextView textview, int i, AppContentAnnotation appcontentannotation)
    {
        ensureImageManager(context);
        context = appcontentannotation.getImageUri();
        int j = AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId());
        mImageManager.loadImage(new AnnotationTextImageRequest(textview, i, context, j));
    }
}
