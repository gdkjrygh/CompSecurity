// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.pinterest.kit.network.image.CachableImage;
import com.squareup.picasso.Transformation;
import java.lang.ref.WeakReference;

// Referenced classes of package com.pinterest.activity.conversation.view:
//            GroupUserImageView

class url
    implements CachableImage
{

    private Object imageTag;
    private WeakReference parentView;
    private String url;

    public Object getImageTag()
    {
        return imageTag;
    }

    public Transformation getTransformation()
    {
        return null;
    }

    public String getUrl()
    {
        return url;
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.pUserCacheableImage pusercacheableimage)
    {
        if (bitmap != null && parentView.get() != null)
        {
            GroupUserImageView.access$000((GroupUserImageView)parentView.get(), url, bitmap);
        }
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }

    public void setBitmap(Bitmap bitmap, boolean flag)
    {
    }

    public void setImageTag(Object obj)
    {
        imageTag = obj;
    }

    public void setTransformation(Transformation transformation)
    {
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public Y(GroupUserImageView groupuserimageview, String s)
    {
        parentView = new WeakReference(groupuserimageview);
        url = s;
    }
}
