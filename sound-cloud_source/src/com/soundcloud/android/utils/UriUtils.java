// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.java.collections.ListMultiMap;
import com.soundcloud.java.collections.MultiMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class UriUtils
{

    private UriUtils()
    {
    }

    public static Uri clearQueryParams(Uri uri)
    {
        if (TextUtils.isEmpty(uri.getQuery()))
        {
            return uri;
        } else
        {
            return uri.buildUpon().query(null).build();
        }
    }

    public static long getLastSegmentAsLong(Uri uri)
    {
        long l;
        try
        {
            l = Long.parseLong(uri.getLastPathSegment());
        }
        catch (NumberFormatException numberformatexception)
        {
            if (Log.isLoggable(SoundCloudApplication.TAG, 3))
            {
                String s = SoundCloudApplication.TAG;
                (new StringBuilder("Could not parse last segment as long from URI ")).append(uri.toString());
            }
            return -1L;
        }
        return l;
    }

    public static String getPathWithQuery(Uri uri)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(uri.getPath());
        if (uri.getQuery() != null)
        {
            uri = (new StringBuilder("?")).append(uri.getQuery()).toString();
        } else
        {
            uri = "";
        }
        return stringbuilder.append(uri).toString();
    }

    private static Set getQueryParameterNames(Uri uri)
    {
        if (uri.isOpaque())
        {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        uri = uri.getEncodedQuery();
        if (uri == null)
        {
            return Collections.emptySet();
        }
        LinkedHashSet linkedhashset = new LinkedHashSet();
        int j = 0;
        do
        {
            int i;
            int k;
label0:
            {
                k = uri.indexOf('&', j);
                i = k;
                if (k == -1)
                {
                    i = uri.length();
                }
                int l = uri.indexOf('=', j);
                if (l <= i)
                {
                    k = l;
                    if (l != -1)
                    {
                        break label0;
                    }
                }
                k = i;
            }
            linkedhashset.add(Uri.decode(uri.substring(j, k)));
            i++;
            j = i;
            if (i >= uri.length())
            {
                return Collections.unmodifiableSet(linkedhashset);
            }
        } while (true);
    }

    public static MultiMap getQueryParameters(Uri uri)
    {
        ListMultiMap listmultimap = new ListMultiMap();
        String s;
        for (Iterator iterator = getQueryParameterNames(uri).iterator(); iterator.hasNext(); listmultimap.putAll(s, uri.getQueryParameters(s)))
        {
            s = (String)iterator.next();
        }

        return listmultimap;
    }

    public static MultiMap getQueryParameters(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new ListMultiMap();
        } else
        {
            return getQueryParameters(Uri.parse(s));
        }
    }
}
