// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.soundcloud.android.utils.images.ImageUtils;
import java.util.EnumSet;

public final class ApiImageSize extends Enum
{

    private static final ApiImageSize $VALUES[];
    public static final ApiImageSize BADGE;
    public static final ApiImageSize CROP;
    public static final int HIGH_RESOLUTION_SIZE = 960;
    public static final ApiImageSize LARGE;
    public static final int MEDIUM_RESOLUTION_SIZE = 480;
    public static final ApiImageSize MINI;
    public static final ApiImageSize SMALL;
    public static final EnumSet SMALL_SIZES;
    public static final ApiImageSize T300;
    public static final ApiImageSize T500;
    public static final ApiImageSize T67;
    public static final ApiImageSize TINY_ARTWORK;
    public static final ApiImageSize TINY_AVATAR;
    public static final ApiImageSize Unknown;
    public final int height;
    public final String sizeSpec;
    public final int width;

    private ApiImageSize(String s, int i, String s1, int j, int k)
    {
        super(s, i);
        sizeSpec = s1;
        width = j;
        height = k;
    }

    public static String formatUriForNotificationLargeIcon(Context context, String s)
    {
        return getNotificationLargeIconImageSize(context.getResources().getDisplayMetrics()).formatUri(s);
    }

    public static ApiImageSize fromString(String s)
    {
        ApiImageSize aapiimagesize[] = values();
        int j = aapiimagesize.length;
        for (int i = 0; i < j; i++)
        {
            ApiImageSize apiimagesize = aapiimagesize[i];
            if (apiimagesize.sizeSpec.equalsIgnoreCase(s))
            {
                return apiimagesize;
            }
        }

        return Unknown;
    }

    public static ApiImageSize getFullImageSize(Resources resources)
    {
        resources = resources.getDisplayMetrics();
        int i = Math.max(((DisplayMetrics) (resources)).heightPixels, ((DisplayMetrics) (resources)).widthPixels);
        if (i >= 960)
        {
            return T500;
        }
        if (i >= 480)
        {
            return T300;
        } else
        {
            return LARGE;
        }
    }

    public static ApiImageSize getListItemImageSize(Context context)
    {
        return getListItemImageSize(context.getResources());
    }

    public static ApiImageSize getListItemImageSize(Resources resources)
    {
        if (ImageUtils.isScreenXL(resources))
        {
            return LARGE;
        }
        if (resources.getDisplayMetrics().density > 1.0F)
        {
            return LARGE;
        } else
        {
            return BADGE;
        }
    }

    public static ApiImageSize getNotificationLargeIconImageSize(Resources resources)
    {
        return getNotificationLargeIconImageSize(resources.getDisplayMetrics());
    }

    public static ApiImageSize getNotificationLargeIconImageSize(DisplayMetrics displaymetrics)
    {
        if (displaymetrics.density > 2.0F)
        {
            return T300;
        } else
        {
            return LARGE;
        }
    }

    public static ApiImageSize valueOf(String s)
    {
        return (ApiImageSize)Enum.valueOf(com/soundcloud/android/image/ApiImageSize, s);
    }

    public static ApiImageSize[] values()
    {
        return (ApiImageSize[])$VALUES.clone();
    }

    public final String formatUri(String s)
    {
        Object obj;
        if (TextUtils.isEmpty(s))
        {
            obj = null;
        } else
        {
            obj = values();
            int j = obj.length;
            for (int i = 0; i < j; i++)
            {
                ApiImageSize apiimagesize = obj[i];
                if (s.contains((new StringBuilder("-")).append(apiimagesize.sizeSpec).toString()) && this != apiimagesize)
                {
                    return s.replace((new StringBuilder("-")).append(apiimagesize.sizeSpec).toString(), (new StringBuilder("-")).append(sizeSpec).toString());
                }
            }

            Uri uri = Uri.parse(s);
            obj = s;
            if (uri.getPath().equals("/resolve/image"))
            {
                String s1 = uri.getQueryParameter("size");
                if (s1 == null)
                {
                    return uri.buildUpon().appendQueryParameter("size", sizeSpec).toString();
                }
                obj = s;
                if (!s1.equals(sizeSpec))
                {
                    return s.replace(s1, sizeSpec);
                }
            }
        }
        return ((String) (obj));
    }

    static 
    {
        T500 = new ApiImageSize("T500", 0, "t500x500", 500, 500);
        CROP = new ApiImageSize("CROP", 1, "crop", 400, 400);
        T300 = new ApiImageSize("T300", 2, "t300x300", 300, 300);
        LARGE = new ApiImageSize("LARGE", 3, "large", 100, 100);
        T67 = new ApiImageSize("T67", 4, "t67x67", 67, 67);
        BADGE = new ApiImageSize("BADGE", 5, "badge", 47, 47);
        SMALL = new ApiImageSize("SMALL", 6, "small", 32, 32);
        TINY_ARTWORK = new ApiImageSize("TINY_ARTWORK", 7, "tiny", 20, 20);
        TINY_AVATAR = new ApiImageSize("TINY_AVATAR", 8, "tiny", 18, 18);
        MINI = new ApiImageSize("MINI", 9, "mini", 16, 16);
        Unknown = new ApiImageSize("Unknown", 10, "large", 100, 100);
        $VALUES = (new ApiImageSize[] {
            T500, CROP, T300, LARGE, T67, BADGE, SMALL, TINY_ARTWORK, TINY_AVATAR, MINI, 
            Unknown
        });
        SMALL_SIZES = EnumSet.of(BADGE, SMALL, TINY_ARTWORK, TINY_AVATAR, MINI);
    }
}
