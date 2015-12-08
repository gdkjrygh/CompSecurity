// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import b.a.a.a.a.e.d;
import b.a.a.a.a.e.g;
import b.a.a.a.l;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package b.a.a.a.a.b:
//            j

public abstract class a
{

    private static final Pattern b = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final l a;
    private final String c;
    private final g d;
    private final int e;
    private final String f;

    public a(l l1, String s, String s1, g g1, int i)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (g1 == null)
        {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        a = l1;
        f = s;
        l1 = s1;
        if (!b.a.a.a.a.b.j.d(f))
        {
            l1 = b.matcher(s1).replaceFirst(f);
        }
        c = l1;
        d = g1;
        e = i;
    }

    protected final d a(Map map)
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

    protected final d b()
    {
        return a(Collections.emptyMap());
    }

}
