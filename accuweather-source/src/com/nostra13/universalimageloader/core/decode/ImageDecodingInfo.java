// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.decode;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.core.download.ImageDownloader;

public class ImageDecodingInfo
{

    private final boolean considerExifParams;
    private final android.graphics.BitmapFactory.Options decodingOptions = new android.graphics.BitmapFactory.Options();
    private final ImageDownloader downloader;
    private final Object extraForDownloader;
    private final String imageKey;
    private final ImageScaleType imageScaleType;
    private final String imageUri;
    private final ImageSize targetSize;
    private final ViewScaleType viewScaleType;

    public ImageDecodingInfo(String s, String s1, ImageSize imagesize, ViewScaleType viewscaletype, ImageDownloader imagedownloader, DisplayImageOptions displayimageoptions)
    {
        imageKey = s;
        imageUri = s1;
        targetSize = imagesize;
        imageScaleType = displayimageoptions.getImageScaleType();
        viewScaleType = viewscaletype;
        downloader = imagedownloader;
        extraForDownloader = displayimageoptions.getExtraForDownloader();
        considerExifParams = displayimageoptions.isConsiderExifParams();
        copyOptions(displayimageoptions.getDecodingOptions(), decodingOptions);
    }

    private void copyOptions(android.graphics.BitmapFactory.Options options, android.graphics.BitmapFactory.Options options1)
    {
        options1.inDensity = options.inDensity;
        options1.inDither = options.inDither;
        options1.inInputShareable = options.inInputShareable;
        options1.inJustDecodeBounds = options.inJustDecodeBounds;
        options1.inPreferredConfig = options.inPreferredConfig;
        options1.inPurgeable = options.inPurgeable;
        options1.inSampleSize = options.inSampleSize;
        options1.inScaled = options.inScaled;
        options1.inScreenDensity = options.inScreenDensity;
        options1.inTargetDensity = options.inTargetDensity;
        options1.inTempStorage = options.inTempStorage;
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            copyOptions10(options, options1);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            copyOptions11(options, options1);
        }
    }

    private void copyOptions10(android.graphics.BitmapFactory.Options options, android.graphics.BitmapFactory.Options options1)
    {
        options1.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
    }

    private void copyOptions11(android.graphics.BitmapFactory.Options options, android.graphics.BitmapFactory.Options options1)
    {
        options1.inBitmap = options.inBitmap;
        options1.inMutable = options.inMutable;
    }

    public android.graphics.BitmapFactory.Options getDecodingOptions()
    {
        return decodingOptions;
    }

    public ImageDownloader getDownloader()
    {
        return downloader;
    }

    public Object getExtraForDownloader()
    {
        return extraForDownloader;
    }

    public String getImageKey()
    {
        return imageKey;
    }

    public ImageScaleType getImageScaleType()
    {
        return imageScaleType;
    }

    public String getImageUri()
    {
        return imageUri;
    }

    public ImageSize getTargetSize()
    {
        return targetSize;
    }

    public ViewScaleType getViewScaleType()
    {
        return viewScaleType;
    }

    public boolean shouldConsiderExifParams()
    {
        return considerExifParams;
    }
}
