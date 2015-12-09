// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.gfx;

import android.graphics.Bitmap;
import com.netflix.mediaclient.android.widget.AdvancedImageView;

public interface ImageLoader
{
    public static interface ImageLoaderListener
    {

        public abstract void onErrorResponse(String s);

        public abstract void onResponse(Bitmap bitmap, String s);
    }


    public static final int ONFAIL_DRAWABLE_RESOURCE = 0x7f020062;
    public static final int PLACEHOLDER_DRAWABLE_RESOURCE = 0x7f020062;
    public static final int PRIORITY_LOW = 0;
    public static final int PRIORITY_NORMAL = 1;

    public abstract void cancelAllRequests();

    public abstract void getImg(String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, int i, int j, ImageLoaderListener imageloaderlistener);

    public abstract void refreshImgIfNecessary(AdvancedImageView advancedimageview, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype);

    public abstract void showImg(AdvancedImageView advancedimageview, String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, String s1, boolean flag, boolean flag1);

    public abstract void showImg(AdvancedImageView advancedimageview, String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, String s1, boolean flag, boolean flag1, int i);
}
