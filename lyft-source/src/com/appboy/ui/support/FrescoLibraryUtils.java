// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.support;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PackageUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;

public class FrescoLibraryUtils
{

    public static final String FRESCO_ENABLED = "com_appboy_enable_fresco_library_use";
    private static final String TAG;
    private static final String USED_FRESCO_CLASSES[] = {
        "com.facebook.drawee.backends.pipeline.Fresco", "com.facebook.drawee.interfaces.DraweeController", "com.facebook.drawee.view.SimpleDraweeView", "com.facebook.drawee.backends.pipeline.Fresco", "com.facebook.drawee.controller.BaseControllerListener", "com.facebook.drawee.controller.ControllerListener", "com.facebook.imagepipeline.image.ImageInfo"
    };
    private static boolean mCanUseFresco = false;
    private static boolean mCanUseFrescoSet = false;

    public FrescoLibraryUtils()
    {
    }

    public static boolean canUseFresco(Context context)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        if (mCanUseFrescoSet)
        {
            return mCanUseFresco;
        }
        context = context.getApplicationContext();
        flag1 = getIsFrescoEnabledFromXml(context.getResources(), PackageUtils.getResourcePackageName(context));
        String as[];
        int j;
        context = com/appboy/ui/support/FrescoLibraryUtils.getClassLoader();
        as = USED_FRESCO_CLASSES;
        j = as.length;
        int i = 0;
_L3:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        Class class1 = Class.forName(as[i], false, context);
        if (class1 != null) goto _L2; else goto _L1
_L1:
        i = 0;
_L4:
        mCanUseFrescoSet = true;
        if (i == 0 || !flag1)
        {
            flag = false;
        }
        mCanUseFresco = flag;
        return mCanUseFresco;
_L2:
        i++;
          goto _L3
        context;
        i = 0;
          goto _L4
        i = 1;
          goto _L4
    }

    static boolean canUseFrescoMock(Context context, Resources resources, boolean flag)
    {
        return flag && getIsFrescoEnabledFromXml(resources, PackageUtils.getResourcePackageName(context.getApplicationContext()));
    }

    private static boolean getIsFrescoEnabledFromXml(Resources resources, String s)
    {
        int i = resources.getIdentifier("com_appboy_enable_fresco_library_use", "bool", s);
        if (i != 0)
        {
            return resources.getBoolean(i);
        } else
        {
            return false;
        }
    }

    public static void setDraweeControllerHelper(final SimpleDraweeView simpleDraweeView, String s, final float aspectRatio, final boolean respectAspectRatio)
    {
        if (s == null)
        {
            AppboyLogger.w(TAG, "The url set for the Drawee controller was null. Controller not set.");
            return;
        }
        if (simpleDraweeView == null)
        {
            AppboyLogger.w(TAG, "The SimpleDraweeView set for the Drawee controller was null. Controller not set.");
            return;
        }
        BaseControllerListener basecontrollerlistener = new BaseControllerListener() {

            final float val$aspectRatio;
            final boolean val$respectAspectRatio;
            final SimpleDraweeView val$simpleDraweeView;

            public void onFinalImageSet(String s1, ImageInfo imageinfo, Animatable animatable)
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
                simpleDraweeView.post(f. new Runnable() {

                    final _cls1 this$0;
                    final float val$imageAspectRatio;

                    public void run()
                    {
                        simpleDraweeView.setAspectRatio(imageAspectRatio);
                    }

            
            {
                this$0 = final__pcls1;
                imageAspectRatio = F.this;
                super();
            }
                });
            }

            public volatile void onFinalImageSet(String s1, Object obj, Animatable animatable)
            {
                onFinalImageSet(s1, (ImageInfo)obj, animatable);
            }

            
            {
                respectAspectRatio = flag;
                aspectRatio = f;
                simpleDraweeView = simpledraweeview;
                super();
            }
        };
        try
        {
            s = Uri.parse(s);
            simpleDraweeView.setController(((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)Fresco.newDraweeControllerBuilder().setUri(s).setAutoPlayAnimations(true)).setTapToRetryEnabled(true)).setControllerListener(basecontrollerlistener)).build());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final SimpleDraweeView simpleDraweeView)
        {
            AppboyLogger.e(TAG, "Fresco controller builder could not be retrieved. Fresco most likely prematurely shutdown.", simpleDraweeView);
        }
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/support/FrescoLibraryUtils.getName()
        });
    }
}
