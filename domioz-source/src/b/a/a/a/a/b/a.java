// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import b.a.a.a.a.e.e;
import b.a.a.a.a.e.m;
import b.a.a.a.o;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package b.a.a.a.a.b:
//            l

public abstract class a
{

    private static final Pattern b = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final o a;
    private final String c;
    private final m d;
    private final int e;
    private final String f;

    public a(o o1, String s, String s1, m m1, int i)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (m1 == null)
        {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        a = o1;
        f = s;
        o1 = s1;
        if (!l.d(f))
        {
            o1 = b.matcher(s1).replaceFirst(f);
        }
        c = o1;
        d = m1;
        e = i;
    }

    protected final e a(Map map)
    {
        map = d.a(e, c, map);
        map.a().setUseCaches(false);
        map.a().setConnectTimeout(10000);
        return map.a("User-Agent", (new StringBuilder("Crashlytics Android SDK/")).append(a.d()).toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "bca6990fc3c15a8105800c0673517a4b579634a1");
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
