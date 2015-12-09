// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher.volley;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.util.gfx.AnimationUtils;

// Referenced classes of package com.netflix.mediaclient.service.resfetcher.volley:
//            ImageLoader

private class this._cls0 extends this._cls0
{

    final ImageLoader this$0;

    protected void updateView(ImageView imageview, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            ImageLoader.access$200(ImageLoader.this, imageview);
            return;
        } else
        {
            AnimationUtils.setImageBitmapWithPropertyFade(imageview, bitmap);
            return;
        }
    }

    public (AdvancedImageView advancedimageview, String s)
    {
        this$0 = ImageLoader.this;
        super(ImageLoader.this, advancedimageview, s);
    }
}
