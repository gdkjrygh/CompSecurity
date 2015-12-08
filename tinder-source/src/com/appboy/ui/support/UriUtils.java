// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.support;

import android.net.Uri;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UriUtils
{

    private static final String TAG;

    public UriUtils()
    {
    }

    public static Map getQueryParameters(Uri uri)
    {
        if (uri.isOpaque())
        {
            AppboyLogger.d(TAG, "URI is not hierarchical. There are no query parameters to parse.");
            return Collections.emptyMap();
        }
        uri = uri.getEncodedQuery();
        if (uri == null)
        {
            return Collections.emptyMap();
        }
        HashMap hashmap = new HashMap();
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
            if (i > j)
            {
                String s = uri.substring(j, k);
                String s1 = uri.substring(k + 1, i);
                hashmap.put(Uri.decode(s), Uri.decode(s1));
            }
            i++;
            j = i;
            if (i >= uri.length())
            {
                return Collections.unmodifiableMap(hashmap);
            }
        } while (true);
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/support/UriUtils.getName()
        });
    }
}
