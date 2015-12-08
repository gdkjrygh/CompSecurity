// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.play.utils.config.GservicesValue;
import com.google.android.play.utils.config.PlayG;

public final class FifeUrlUtils
{

    private static boolean WEBP_ENABLED;

    public static String buildFifeUrl(String s, int i, int j)
    {
        if (!TextUtils.isEmpty(s))
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (WEBP_ENABLED)
            {
                stringbuilder.append("rw");
            }
            if (i > 0)
            {
                if (stringbuilder.length() != 0)
                {
                    stringbuilder.append('-');
                }
                stringbuilder.append('w').append(i);
            }
            if (j > 0)
            {
                if (stringbuilder.length() != 0)
                {
                    stringbuilder.append('-');
                }
                stringbuilder.append('h').append(j);
            }
            if (stringbuilder.length() != 0)
            {
                String s1 = Uri.parse(s).getEncodedPath();
                if (s1.length() > 1 && s1.indexOf('/', 1) > 0 && !s.endsWith("?fife"))
                {
                    stringbuilder.insert(0, "/");
                    return (new StringBuilder(s)).insert(s.lastIndexOf("/"), stringbuilder).toString();
                } else
                {
                    return (new StringBuilder(s)).append("=").append(stringbuilder).toString();
                }
            }
        }
        return s;
    }

    public static float getNetworkScaleFactor(Context context)
    {
        return ((Float)PlayG.percentOfImageSize3G.get()).floatValue();
    }

    static 
    {
        boolean flag;
        if (((Boolean)PlayG.webpFifeImagesEnabled.get()).booleanValue() && android.os.Build.VERSION.SDK_INT >= 17)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WEBP_ENABLED = flag;
    }
}
