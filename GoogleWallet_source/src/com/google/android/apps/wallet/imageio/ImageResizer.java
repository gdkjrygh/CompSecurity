// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.imageio;

import android.graphics.Point;
import android.net.Uri;
import com.google.android.apps.wallet.config.gservices.GservicesKey;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.libraries.imageurl.FifeImageUrlUtil;
import com.google.android.libraries.imageurl.MapsStaticImageUrlUtil;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class ImageResizer
{

    private final FifeImageUrlUtil fifeImageUrlUtil;
    private final GservicesWrapper mGservices;
    private final MapsStaticImageUrlUtil mapsImageUrlUtil;

    ImageResizer(GservicesWrapper gserviceswrapper, FifeImageUrlUtil fifeimageurlutil, MapsStaticImageUrlUtil mapsstaticimageurlutil)
    {
        mGservices = gserviceswrapper;
        fifeImageUrlUtil = fifeimageurlutil;
        mapsImageUrlUtil = mapsstaticimageurlutil;
    }

    private Uri getCrossbarResizeUrl(Uri uri, Point point)
    {
        String s = mGservices.getString(GservicesKey.GSERVICES_KEY_CROSSBAR_IMAGE_RESIZE_URL);
        if (Strings.isNullOrEmpty(s))
        {
            return uri;
        } else
        {
            return Uri.parse(s).buildUpon().appendQueryParameter("image_url", uri.toString()).appendQueryParameter("width", String.valueOf(point.x)).appendQueryParameter("height", String.valueOf(point.y)).build();
        }
    }

    private static boolean isDownloadUri(Uri uri)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (uri == null)
            {
                break label0;
            }
            uri = uri.getScheme();
            if (!"http".equalsIgnoreCase(uri))
            {
                flag = flag1;
                if (!"https".equalsIgnoreCase(uri))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final Uri getResizedImageUrl(Uri uri, Point point)
        throws com.google.android.libraries.imageurl.FifeImageUrlUtil.InvalidUrlException
    {
        Preconditions.checkNotNull(uri);
        Preconditions.checkNotNull(point);
        if (!isDownloadUri(uri))
        {
            return uri;
        }
        if (fifeImageUrlUtil.isFifeHostedUri(uri))
        {
            uri = fifeImageUrlUtil.setImageSize(Math.max(point.x, point.y), uri);
        } else
        {
            MapsStaticImageUrlUtil mapsstaticimageurlutil = mapsImageUrlUtil;
            if (MapsStaticImageUrlUtil.isStaticMapsHostedUrl(uri))
            {
                uri = mapsImageUrlUtil.setImageUrlSize(point.x, point.y, uri);
            } else
            {
                uri = getCrossbarResizeUrl(uri, point);
            }
        }
        return uri;
    }
}
