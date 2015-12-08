// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.android.slyce.a.c.d:
//            l, g

final class p
{

    private static final l a[];
    private static final Map b = c();

    static g a(g g1)
    {
        return b(g1);
    }

    static l[] a()
    {
        return a;
    }

    private static g b(g g1)
    {
        int i = 0;
        for (int j = g1.d(); i < j; i++)
        {
            byte byte0 = g1.a(i);
            if (byte0 >= 65 && byte0 <= 90)
            {
                throw new IOException((new StringBuilder()).append("PROTOCOL_ERROR response malformed: mixed case name: ").append(g1.a()).toString());
            }
        }

        return g1;
    }

    static Map b()
    {
        return b;
    }

    private static Map c()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap(a.length);
        for (int i = 0; i < a.length; i++)
        {
            if (!linkedhashmap.containsKey(a[i].h))
            {
                linkedhashmap.put(a[i].h, Integer.valueOf(i));
            }
        }

        return Collections.unmodifiableMap(linkedhashmap);
    }

    static 
    {
        a = (new l[] {
            new l(l.e, ""), new l(l.b, "GET"), new l(l.b, "POST"), new l(l.c, "/"), new l(l.c, "/index.html"), new l(l.d, "http"), new l(l.d, "https"), new l(l.a, "200"), new l(l.a, "204"), new l(l.a, "206"), 
            new l(l.a, "304"), new l(l.a, "400"), new l(l.a, "404"), new l(l.a, "500"), new l("accept-charset", ""), new l("accept-encoding", "gzip, deflate"), new l("accept-language", ""), new l("accept-ranges", ""), new l("accept", ""), new l("access-control-allow-origin", ""), 
            new l("age", ""), new l("allow", ""), new l("authorization", ""), new l("cache-control", ""), new l("content-disposition", ""), new l("content-encoding", ""), new l("content-language", ""), new l("content-length", ""), new l("content-location", ""), new l("content-range", ""), 
            new l("content-type", ""), new l("cookie", ""), new l("date", ""), new l("etag", ""), new l("expect", ""), new l("expires", ""), new l("from", ""), new l("host", ""), new l("if-match", ""), new l("if-modified-since", ""), 
            new l("if-none-match", ""), new l("if-range", ""), new l("if-unmodified-since", ""), new l("last-modified", ""), new l("link", ""), new l("location", ""), new l("max-forwards", ""), new l("proxy-authenticate", ""), new l("proxy-authorization", ""), new l("range", ""), 
            new l("referer", ""), new l("refresh", ""), new l("retry-after", ""), new l("server", ""), new l("set-cookie", ""), new l("strict-transport-security", ""), new l("transfer-encoding", ""), new l("user-agent", ""), new l("vary", ""), new l("via", ""), 
            new l("www-authenticate", "")
        });
    }
}
