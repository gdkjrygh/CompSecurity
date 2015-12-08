// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import android.app.Application;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.logging.WLog;
import com.squareup.picasso.LruCache;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.imageio:
//            PicassoRequestTransformer, PicassoDownloader

public class ImageIoModule
{

    private static final String TAG = com/google/android/apps/wallet/imageio/ImageIoModule.getSimpleName();

    public ImageIoModule()
    {
    }

    static File getApplicationCacheDirectory(Application application)
    {
        return application.getCacheDir().getAbsoluteFile();
    }

    static String getAuthScope(CloudConfigurationManager cloudconfigurationmanager)
    {
        return cloudconfigurationmanager.getCloudConfig().getOauthScope();
    }

    static Set getAuthoritiesRequiringAuth(CloudConfigurationManager cloudconfigurationmanager)
    {
        return Collections.singleton(cloudconfigurationmanager.getCloudConfig().getWobsImageServerAuthority());
    }

    private static int getCacheSize(DisplayMetrics displaymetrics, Runtime runtime, AppControl appcontrol)
    {
        int i = proposeCacheSizeBasedOnMaxMemory(runtime, appcontrol);
        WLog.dfmt(TAG, "Proposed cache size based on display dimensions: %sKB", new Object[] {
            Integer.valueOf(i >> 10)
        });
        int j = proposeCacheSizeBasedOnDisplay(displaymetrics);
        WLog.dfmt(TAG, "Proposed cache size based on runtime max memory: %sKB", new Object[] {
            Integer.valueOf(j >> 10)
        });
        i = Math.min(i, j);
        WLog.dfmt(TAG, "Cache size: %sKB", new Object[] {
            Integer.valueOf(i >> 10)
        });
        return i;
    }

    static Picasso getPicasso(Application application, AppControl appcontrol, PicassoRequestTransformer picassorequesttransformer, PicassoDownloader picassodownloader)
    {
        appcontrol = new LruCache(getCacheSize(application.getResources().getDisplayMetrics(), Runtime.getRuntime(), appcontrol));
        return (new com.squareup.picasso.Picasso.Builder(application)).memoryCache(appcontrol).requestTransformer(picassorequesttransformer).downloader(picassodownloader).build();
    }

    private static int proposeCacheSizeBasedOnDisplay(DisplayMetrics displaymetrics)
    {
        return (displaymetrics.widthPixels * displaymetrics.heightPixels << 2) * 3;
    }

    private static int proposeCacheSizeBasedOnMaxMemory(Runtime runtime, AppControl appcontrol)
    {
        float f = Float.parseFloat(appcontrol.getString(AppControlKey.IMAGE_CACHE_MAX_MEMORY_FRACTION));
        return (int)((float)runtime.maxMemory() * f);
    }

}
