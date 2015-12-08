// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            CommonUtils

public abstract class AbstractSpiCall
{

    private static final Pattern b = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final Kit a;
    private final String c;
    private final HttpRequestFactory d;
    private final HttpMethod e;
    private final String f;

    public AbstractSpiCall(Kit kit, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (httprequestfactory == null)
        {
            throw new IllegalArgumentException("requestFactory must not be null.");
        } else
        {
            a = kit;
            f = s;
            c = a(s1);
            d = httprequestfactory;
            e = httpmethod;
            return;
        }
    }

    private String a(String s)
    {
        String s1 = s;
        if (!CommonUtils.c(f))
        {
            s1 = b.matcher(s).replaceFirst(f);
        }
        return s1;
    }

    protected HttpRequest a(Map map)
    {
        return d.a(e, a(), map).a(false).a(10000).a("User-Agent", (new StringBuilder()).append("Crashlytics Android SDK/").append(a.d()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "bca6990fc3c15a8105800c0673517a4b579634a1");
    }

    protected String a()
    {
        return c;
    }

    protected HttpRequest b()
    {
        return a(Collections.emptyMap());
    }

}
