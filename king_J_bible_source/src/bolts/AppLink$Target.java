// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;

// Referenced classes of package bolts:
//            AppLink

public static class appName
{

    private final String appName;
    private final String className;
    private final String packageName;
    private final Uri url;

    public String getAppName()
    {
        return appName;
    }

    public String getClassName()
    {
        return className;
    }

    public String getPackageName()
    {
        return packageName;
    }

    public Uri getUrl()
    {
        return url;
    }

    public (String s, String s1, Uri uri, String s2)
    {
        packageName = s;
        className = s1;
        url = uri;
        appName = s2;
    }
}
