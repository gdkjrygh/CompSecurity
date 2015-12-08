// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.snapchat.android.SnapchatApplication;
import java.util.Locale;
import java.util.UUID;

public final class Pj
{

    public static final String AUTHORIZATION_EXCEPTION_HEADER_NAME = "X-Snapchat-AuthExp";
    public static final String AUTHORIZATION_HEADER_NAME = "X-Snapchat-Client-Auth-Token";
    public static final String AUTHORIZATION_OAUTH_TOKEN_PREFIX = "Bearer ";
    private static final String OS_INFO;
    private static final String USER_AGENT_SUFFIX;

    public static String a()
    {
        Object obj;
        obj = SnapchatApplication.get();
        obj = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0).versionName;
_L2:
        return (new StringBuilder("Snapchat/")).append(((String) (obj))).append(USER_AGENT_SUFFIX).toString();
        obj;
_L3:
        obj = "3.0.2";
        if (true) goto _L2; else goto _L1
_L1:
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
          goto _L3
    }

    public static String b()
    {
        String s1 = Locale.getDefault().getLanguage();
        String s = s1;
        if (!s1.equals(Locale.ENGLISH.getLanguage()))
        {
            s = (new StringBuilder()).append(s1).append(";q=1, en;q=0.9").toString();
        }
        return s;
    }

    public static String c()
    {
        return UUID.randomUUID().toString();
    }

    static 
    {
        OS_INFO = (new StringBuilder("; Android ")).append(android.os.Build.VERSION.RELEASE).append("#").append(android.os.Build.VERSION.INCREMENTAL).append("#").append(android.os.Build.VERSION.SDK_INT).toString();
        USER_AGENT_SUFFIX = (new StringBuilder(" (")).append(Build.MODEL).append(OS_INFO).append("; gzip)").toString();
    }
}
