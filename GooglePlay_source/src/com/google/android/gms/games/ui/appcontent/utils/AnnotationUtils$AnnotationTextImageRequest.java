// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent.utils;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.google.android.gms.common.images.ImageRequest;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.ui.appcontent.utils:
//            AnnotationUtils

private static final class mImagePosition extends ImageRequest
{

    private int mImagePosition;
    private WeakReference mTextViewRef;

    public final boolean equals(Object obj)
    {
        if (obj instanceof mImagePosition)
        {
            if (this == obj)
            {
                return true;
            }
            Object obj1 = (mImagePosition)obj;
            if (mImagePosition == ((mImagePosition) (obj1)).mImagePosition)
            {
                obj = (TextView)mTextViewRef.get();
                obj1 = (TextView)((mTextViewRef) (obj1)).mTextViewRef.get();
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

    public a(TextView textview, int i)
    {
        super(null, 0);
        mTextViewRef = new WeakReference(textview);
        mImagePosition = i;
    }

    public mImagePosition(TextView textview, int i, Uri uri, int j)
    {
        super(uri, j);
        mTextViewRef = new WeakReference(textview);
        mImagePosition = i;
    }
}
