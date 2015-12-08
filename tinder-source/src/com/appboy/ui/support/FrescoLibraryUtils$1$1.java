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

class val.imageAspectRatio
    implements Runnable
{

    final val.imageAspectRatio this$0;
    final float val$imageAspectRatio;

    public void run()
    {
        simpleDraweeView.setAspectRatio(val$imageAspectRatio);
    }

    Listener()
    {
        this$0 = final_listener;
        val$imageAspectRatio = F.this;
        super();
    }

    // Unreferenced inner class com/appboy/ui/support/FrescoLibraryUtils$1

/* anonymous class */
    static final class FrescoLibraryUtils._cls1 extends BaseControllerListener
    {

        final float val$aspectRatio;
        final boolean val$respectAspectRatio;
        final SimpleDraweeView val$simpleDraweeView;

        public final void onFinalImageSet(String s, ImageInfo imageinfo, Animatable animatable)
        {
            if (imageinfo == null)
            {
                return;
            }
            float f;
            if (respectAspectRatio)
            {
                f = aspectRatio;
            } else
            {
                f = imageinfo.getWidth() / imageinfo.getHeight();
            }
            simpleDraweeView.post(f. new FrescoLibraryUtils._cls1._cls1());
        }

        public final volatile void onFinalImageSet(String s, Object obj, Animatable animatable)
        {
            onFinalImageSet(s, (ImageInfo)obj, animatable);
        }

            
            {
                respectAspectRatio = flag;
                aspectRatio = f;
                simpleDraweeView = simpledraweeview;
                super();
            }
    }

}
