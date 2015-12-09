// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.internal:
//            cm, ba, bu, bx, 
//            bw

public abstract class y
{

    private static String a = (new StringBuilder("Crashlytics Android SDK/")).append(cm.a().f()).toString();
    private static final Pattern b = Pattern.compile("http(s?)://[^\\/]+", 2);
    private final String c;
    private final bu d;
    private final bw e;
    private final String f;

    public y(String s, String s1, bu bu1, bw bw)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("url must not be null.");
        }
        if (bu1 == null)
        {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
        f = s;
        s = s1;
        if (!ba.e(f))
        {
            s = b.matcher(s1).replaceFirst(f);
        }
        c = s;
        d = bu1;
        e = bw;
    }

    protected final bx a(Map map)
    {
        return d.a(e, c, map).a(false).a(10000).a("User-Agent", a).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "bca6990fc3c15a8105800c0673517a4b579634a1");
    }

    protected final String a()
    {
        return c;
    }

    protected final bx b()
    {
        return a(Collections.emptyMap());
    }

}
