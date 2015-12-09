// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public final class ServiceAuthInfo
{
    public static final class CookieInfo
    {

        public int allowedAgeInSeconds;
        public String name;
        public String url;

        public CookieInfo(String s, String s1, int i)
        {
            url = s;
            name = s1;
            allowedAgeInSeconds = i;
        }
    }

    public static final class PreloadAuthPolicy extends Enum
    {

        private static final PreloadAuthPolicy $VALUES[];
        public static final PreloadAuthPolicy Always;
        public static final PreloadAuthPolicy Check;
        public static final PreloadAuthPolicy Never;

        public static PreloadAuthPolicy valueOf(String s)
        {
            return (PreloadAuthPolicy)Enum.valueOf(com/google/android/apps/wallet/webview/ServiceAuthInfo$PreloadAuthPolicy, s);
        }

        public static PreloadAuthPolicy[] values()
        {
            return (PreloadAuthPolicy[])$VALUES.clone();
        }

        static 
        {
            Never = new PreloadAuthPolicy("Never", 0);
            Check = new PreloadAuthPolicy("Check", 1);
            Always = new PreloadAuthPolicy("Always", 2);
            $VALUES = (new PreloadAuthPolicy[] {
                Never, Check, Always
            });
        }

        private PreloadAuthPolicy(String s, int i)
        {
            super(s, i);
        }
    }


    private final String accountManagerServiceString;
    public String continueUrl;
    public List cookiesToCheck;
    public boolean mustLoadContinueUrl;
    public PreloadAuthPolicy preloadPolicy;
    public boolean removeSessionCookies;
    public String service;

    public ServiceAuthInfo(String s, String s1, boolean flag, boolean flag1, PreloadAuthPolicy preloadauthpolicy, List list)
    {
        service = s;
        continueUrl = s1;
        mustLoadContinueUrl = flag;
        removeSessionCookies = flag1;
        preloadPolicy = preloadauthpolicy;
        if (list == null)
        {
            list = new ArrayList();
        }
        cookiesToCheck = list;
        if (!s.contains(" "))
        {
            s = String.format("weblogin:service=%s&continue=%s", new Object[] {
                s, s1
            });
        }
        accountManagerServiceString = s;
    }

    public static boolean urlMatchesIgnoreHash(String s, String s1)
    {
        Uri uri1 = Uri.parse(s);
        Uri uri = Uri.parse(s1);
        if (uri1.getFragment() == null && uri.getFragment() == null)
        {
            return s.startsWith(s1);
        } else
        {
            s = uri1.buildUpon().fragment("").build();
            s1 = uri.buildUpon().fragment("").build();
            return s.toString().startsWith(s1.toString());
        }
    }

    final String getAccountManagerServiceString()
    {
        return accountManagerServiceString;
    }

    public final String getServiceKey()
    {
        return service;
    }

    public final boolean matchesContinueUrl(String s)
    {
        return urlMatchesIgnoreHash(s, continueUrl);
    }
}
