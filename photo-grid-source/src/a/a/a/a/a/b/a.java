// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.a.e.e;
import a.a.a.a.a.e.m;
import a.a.a.a.p;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package a.a.a.a.a.b:
//            l

public abstract class a
{

    private static final Pattern b = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final p a;
    private final String c;
    private final m d;
    private final int e;
    private final String f;

    public a(p p1, String s, String s1, m m1, int i)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (m1 == null)
        {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        a = p1;
        f = s;
        p1 = s1;
        if (!l.d(f))
        {
            p1 = b.matcher(s1).replaceFirst(f);
        }
        c = p1;
        d = m1;
        e = i;
    }

    protected final e a(Map map)
    {
        map = d.a(e, c, map);
        map.a().setUseCaches(false);
        map.a().setConnectTimeout(10000);
        return map.a("User-Agent", (new StringBuilder("Crashlytics Android SDK/")).append(a.a()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    protected final String a()
    {
        return c;
    }

    protected final e b()
    {
        return a(Collections.emptyMap());
    }

}
