// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.imageurl;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MapsStaticImageUrlUtil
{

    private final DisplayMetrics displayMetrics;

    public MapsStaticImageUrlUtil(Context context)
    {
        this(((Context)Preconditions.checkNotNull(context)).getResources().getDisplayMetrics());
    }

    private MapsStaticImageUrlUtil(DisplayMetrics displaymetrics)
    {
        displayMetrics = (DisplayMetrics)Preconditions.checkNotNull(displaymetrics);
    }

    private static android.net.Uri.Builder clearQueryParameter(Uri uri, String s)
    {
        android.net.Uri.Builder builder = uri.buildUpon();
        if (uri.getQueryParameter(s) != null)
        {
            builder.clearQuery();
            Iterator iterator = uri.getQueryParameterNames().iterator();
            while (iterator.hasNext()) 
            {
                String s1 = (String)iterator.next();
                if (!s1.equals(s))
                {
                    builder.appendQueryParameter(s1, uri.getQueryParameter(s1));
                }
            }
        }
        return builder;
    }

    public static boolean isStaticMapsHostedUrl(Uri uri)
    {
        Preconditions.checkNotNull(uri);
        String s = uri.getScheme();
        if (("http".equals(s) || "https".equals(s)) && "maps.googleapis.com".equals(uri.getHost()))
        {
            uri = uri.getPathSegments();
            return uri.size() == 3 && ((String)uri.get(0)).equals("maps") && ((String)uri.get(1)).equals("api") && ((String)uri.get(2)).equals("staticmap");
        } else
        {
            return false;
        }
    }

    public final Uri setImageUrlSize(int i, int j, Uri uri)
    {
        Preconditions.checkNotNull(uri);
        int l = i;
        int k = j;
        Uri uri1 = uri;
        if (displayMetrics.density >= 2.0F)
        {
            uri1 = clearQueryParameter(uri, "scale").appendQueryParameter("scale", "2").build();
            l = i / 2;
            k = j / 2;
        }
        return clearQueryParameter(uri1, "size").appendQueryParameter("size", (new StringBuilder(23)).append(l).append("x").append(k).toString()).build();
    }
}
