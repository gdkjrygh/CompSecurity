// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.support;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;

// Referenced classes of package com.appboy.ui.support:
//            FrescoLibraryUtils

final class erListener extends BaseControllerListener
{

    final float val$aspectRatio;
    final boolean val$respectAspectRatio;
    final SimpleDraweeView val$simpleDraweeView;

    public void onFinalImageSet(String s, ImageInfo imageinfo, Animatable animatable)
    {
        if (imageinfo == null)
        {
            return;
        }
        final float imageAspectRatio;
        if (val$respectAspectRatio)
        {
            imageAspectRatio = val$aspectRatio;
        } else
        {
            imageAspectRatio = imageinfo.getWidth() / imageinfo.getHeight();
        }
        val$simpleDraweeView.post(new Runnable() {

            final FrescoLibraryUtils._cls1 this$0;
            final float val$imageAspectRatio;

            public void run()
            {
                simpleDraweeView.setAspectRatio(imageAspectRatio);
            }

            
            {
                this$0 = FrescoLibraryUtils._cls1.this;
                imageAspectRatio = f;
                super();
            }
        });
    }

    public volatile void onFinalImageSet(String s, Object obj, Animatable animatable)
    {
        onFinalImageSet(s, (ImageInfo)obj, animatable);
    }

    _cls1.val.imageAspectRatio()
    {
        val$respectAspectRatio = flag;
        val$aspectRatio = f;
        val$simpleDraweeView = simpledraweeview;
        super();
    }
}
