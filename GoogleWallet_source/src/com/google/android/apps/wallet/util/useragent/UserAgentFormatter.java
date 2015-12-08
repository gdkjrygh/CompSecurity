// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.useragent;

import android.app.Application;
import android.os.Build;
import com.google.android.apps.wallet.util.version.VersionUtils;
import java.util.Locale;

public class UserAgentFormatter
{

    private final int versionCode;
    private final String versionName;

    UserAgentFormatter(Application application)
    {
        versionName = VersionUtils.getVersionName(application);
        versionCode = VersionUtils.getVersionCode(application);
    }

    private static String buildUserAgentString(String s, int i, String s1, String s2, String s3, String s4)
    {
        return String.format(Locale.ENGLISH, "Wallet %s-v%d (Android %s %s %s %s)", new Object[] {
            encodeField(s), Integer.valueOf(i), encodeField(s1), encodeField(s2), encodeField(s3), encodeField(s4)
        });
    }

    private static String encodeField(String s)
    {
        if (s != null)
        {
            return s.replaceAll("[\\n ()-]", "_");
        } else
        {
            return null;
        }
    }

    public final String getWalletUserAgent()
    {
        return buildUserAgentString(versionName, versionCode, Build.PRODUCT, Build.ID, Build.MODEL, Build.TAGS);
    }
}
