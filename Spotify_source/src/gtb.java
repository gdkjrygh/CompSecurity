// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

final class gtb
{

    private static final gta a[];
    private static final Map b;

    static ByteString a(ByteString bytestring)
    {
        int i = 0;
        for (int j = bytestring.f(); i < j; i++)
        {
            byte byte0 = bytestring.a(i);
            if (byte0 >= 65 && byte0 <= 90)
            {
                throw new IOException((new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ")).append(bytestring.a()).toString());
            }
        }

        return bytestring;
    }

    static gta[] a()
    {
        return a;
    }

    static Map b()
    {
        return b;
    }

    static 
    {
        int i = 0;
        a = (new gta[] {
            new gta(gta.e, ""), new gta(gta.b, "GET"), new gta(gta.b, "POST"), new gta(gta.c, "/"), new gta(gta.c, "/index.html"), new gta(gta.d, "http"), new gta(gta.d, "https"), new gta(gta.a, "200"), new gta(gta.a, "204"), new gta(gta.a, "206"), 
            new gta(gta.a, "304"), new gta(gta.a, "400"), new gta(gta.a, "404"), new gta(gta.a, "500"), new gta("accept-charset", ""), new gta("accept-encoding", "gzip, deflate"), new gta("accept-language", ""), new gta("accept-ranges", ""), new gta("accept", ""), new gta("access-control-allow-origin", ""), 
            new gta("age", ""), new gta("allow", ""), new gta("authorization", ""), new gta("cache-control", ""), new gta("content-disposition", ""), new gta("content-encoding", ""), new gta("content-language", ""), new gta("content-length", ""), new gta("content-location", ""), new gta("content-range", ""), 
            new gta("content-type", ""), new gta("cookie", ""), new gta("date", ""), new gta("etag", ""), new gta("expect", ""), new gta("expires", ""), new gta("from", ""), new gta("host", ""), new gta("if-match", ""), new gta("if-modified-since", ""), 
            new gta("if-none-match", ""), new gta("if-range", ""), new gta("if-unmodified-since", ""), new gta("last-modified", ""), new gta("link", ""), new gta("location", ""), new gta("max-forwards", ""), new gta("proxy-authenticate", ""), new gta("proxy-authorization", ""), new gta("range", ""), 
            new gta("referer", ""), new gta("refresh", ""), new gta("retry-after", ""), new gta("server", ""), new gta("set-cookie", ""), new gta("strict-transport-security", ""), new gta("transfer-encoding", ""), new gta("user-agent", ""), new gta("vary", ""), new gta("via", ""), 
            new gta("www-authenticate", "")
        });
        LinkedHashMap linkedhashmap = new LinkedHashMap(61);
        for (; i < 61; i++)
        {
            if (!linkedhashmap.containsKey(a[i].h))
            {
                linkedhashmap.put(a[i].h, Integer.valueOf(i));
            }
        }

        b = Collections.unmodifiableMap(linkedhashmap);
    }
}
