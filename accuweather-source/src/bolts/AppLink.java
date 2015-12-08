// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public class AppLink
{
    public static class Target
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

        public Target(String s, String s1, Uri uri, String s2)
        {
            packageName = s;
            className = s1;
            url = uri;
            appName = s2;
        }
    }


    private Uri sourceUrl;
    private List targets;
    private Uri webUrl;

    public AppLink(Uri uri, List list, Uri uri1)
    {
        sourceUrl = uri;
        uri = list;
        if (list == null)
        {
            uri = Collections.emptyList();
        }
        targets = uri;
        webUrl = uri1;
    }

    public Uri getSourceUrl()
    {
        return sourceUrl;
    }

    public List getTargets()
    {
        return Collections.unmodifiableList(targets);
    }

    public Uri getWebUrl()
    {
        return webUrl;
    }
}
