// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.net.Uri;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class WebViewUrlValidator
{

    private static final String TAG = com/google/android/apps/wallet/wobs/WebViewUrlValidator.getSimpleName();
    private final AppControl appControl;

    public WebViewUrlValidator(AppControl appcontrol)
    {
        appControl = appcontrol;
    }

    private Map getValidDomainUrls()
    {
        java.util.HashMap hashmap = Maps.newHashMap();
        String s = appControl.getString(AppControlKey.WEBVIEW_VALID_BASE_URLS);
        StringTokenizer stringtokenizer = new StringTokenizer(s, " ");
        java.util.HashSet hashset = null;
        while (stringtokenizer.hasMoreTokens()) 
        {
            String s1 = stringtokenizer.nextToken();
            if (s1.indexOf(":") < 0)
            {
                hashset = Sets.newHashSet();
                hashmap.put(s1, hashset);
            } else
            if (hashset == null)
            {
                WLog.vfmt(TAG, "missing domain definition in webview:valid_base_urls: %s", new Object[] {
                    s
                });
            } else
            {
                hashset.add(s1);
            }
        }
        return hashmap;
    }

    public final boolean isValidUrl(String s, String s1)
    {
        s = (Set)getValidDomainUrls().get(s);
        if (s == null)
        {
            return false;
        } else
        {
            Object obj = Uri.parse(s1);
            s1 = String.valueOf(((Uri) (obj)).getScheme());
            obj = String.valueOf(((Uri) (obj)).getAuthority());
            return s.contains((new StringBuilder(String.valueOf(s1).length() + 4 + String.valueOf(obj).length())).append(s1).append("://").append(((String) (obj))).append("/").toString());
        }
    }

}
