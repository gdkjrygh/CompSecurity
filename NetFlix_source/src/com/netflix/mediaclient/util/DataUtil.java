// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.net.Uri;
import com.netflix.mediaclient.Log;
import java.util.List;

public class DataUtil
{

    public static final float ASPECT_RATIO_16_9 = 1.778F;
    public static final float ASPECT_RATIO_16_9_INVERTED = 0.5625F;
    public static final float ASPECT_RATIO_4_3 = 1.333F;
    public static final float ASPECT_RATIO_4_3_INVERTED = 0.75F;
    public static final int UNDEFINED_INT = -1;

    private DataUtil()
    {
    }

    public static String getFirstItemSafely(List list)
    {
        if (list == null)
        {
            return null;
        }
        if (list.size() > 0)
        {
            return list.get(0).toString();
        } else
        {
            return "none";
        }
    }

    public static void logVerboseUriInfo(String s, Uri uri)
    {
        if (Log.isLoggable(s, 2))
        {
            Log.v(s, "Uri info");
            Log.v(s, (new StringBuilder()).append("   scheme: ").append(uri.getScheme()).toString());
            Log.v(s, (new StringBuilder()).append("   host: ").append(uri.getHost()).toString());
            Log.v(s, (new StringBuilder()).append("   path: ").append(uri.getPath()).toString());
            Log.v(s, (new StringBuilder()).append("   path segs: ").append(uri.getPathSegments()).toString());
            Log.v(s, (new StringBuilder()).append("   query: ").append(uri.getQuery()).toString());
            Log.v(s, (new StringBuilder()).append("   query param names: ").append(uri.getQueryParameterNames()).toString());
        }
    }
}
