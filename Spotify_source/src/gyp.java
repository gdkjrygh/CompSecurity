// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class gyp
{

    private static final Pattern c = Pattern.compile("http(s?)://[^\\/]+", 2);
    public final String a;
    public final gyh b;
    private final hba d;
    private final HttpMethod e;
    private final String f;

    public gyp(gyh gyh1, String s, String s1, hba hba1, HttpMethod httpmethod)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (hba1 == null)
        {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        b = gyh1;
        f = s;
        gyh1 = s1;
        if (!CommonUtils.d(f))
        {
            gyh1 = c.matcher(s1).replaceFirst(f);
        }
        a = gyh1;
        d = hba1;
        e = httpmethod;
    }

    public final HttpRequest a(Map map)
    {
        map = d.a(e, a, map);
        map.a().setUseCaches(false);
        map.a().setConnectTimeout(10000);
        return map.a("User-Agent", (new StringBuilder("Crashlytics Android SDK/")).append(b.a()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

}
