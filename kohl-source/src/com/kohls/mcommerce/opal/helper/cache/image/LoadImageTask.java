// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.cache.image;

import android.text.TextUtils;
import android.widget.ImageView;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;

// Referenced classes of package com.kohls.mcommerce.opal.helper.cache.image:
//            BitmapLruCache

public class LoadImageTask
{

    private static LoadImageTask mInstance;
    private RequestQueue mRequestQueue;

    private LoadImageTask()
    {
        mRequestQueue = KohlsPhoneApplication.getInstance().getRequestQueue();
    }

    public static LoadImageTask getInstance()
    {
        com/kohls/mcommerce/opal/helper/cache/image/LoadImageTask;
        JVM INSTR monitorenter ;
        LoadImageTask loadimagetask;
        if (mInstance == null)
        {
            mInstance = new LoadImageTask();
        }
        loadimagetask = mInstance;
        com/kohls/mcommerce/opal/helper/cache/image/LoadImageTask;
        JVM INSTR monitorexit ;
        return loadimagetask;
        Exception exception;
        exception;
        throw exception;
    }

    public void loadImage(String s, ImageView imageview, int i, int j)
    {
        ImageLoader imageloader = new ImageLoader(mRequestQueue, BitmapLruCache.open());
        if (imageview == null) goto _L2; else goto _L1
_L1:
        if (!(imageview instanceof NetworkImageView)) goto _L4; else goto _L3
_L3:
        if (i > 0)
        {
            ((NetworkImageView)imageview).setDefaultImageResId(i);
        }
        if (j > 0)
        {
            ((NetworkImageView)imageview).setErrorImageResId(j);
        }
        if (TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        ((NetworkImageView)imageview).setImageUrl(s, imageloader);
_L2:
        return;
_L6:
        ((NetworkImageView)imageview).setImageResource(j);
        return;
_L4:
        if (i > 0)
        {
            imageview.setImageResource(i);
        }
        if (!TextUtils.isEmpty(s))
        {
            imageloader.get(s, ImageLoader.getImageListener(imageview, i, j));
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }
}
