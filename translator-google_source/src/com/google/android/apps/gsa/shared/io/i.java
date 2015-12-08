// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.common.base.p;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;
import java.util.Set;

public final class i
{

    public static final Set a;
    public final String b;
    public final String c;

    public i(String s, String s1)
    {
        b = (String)p.a(s);
        c = (String)p.a(s1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof i)
        {
            obj = (i)obj;
            flag = flag1;
            if (b.equals(((i) (obj)).b))
            {
                flag = flag1;
                if (c.equals(((i) (obj)).c))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b.hashCode() ^ c.hashCode() * 1237;
    }

    public final String toString()
    {
        return String.format("HttpHeaderEntry(%s: %s)", new Object[] {
            b, c
        });
    }

    static 
    {
        a = ImmutableSet.of("Accept".toLowerCase(Locale.US), "Accept-Charset".toLowerCase(Locale.US), "Accept-Encoding".toLowerCase(Locale.US), "Accept-Language".toLowerCase(Locale.US), "Accept-Ranges".toLowerCase(Locale.US), "Access-Control-Allow-Credentials".toLowerCase(Locale.US), new String[] {
            "Access-Control-Allow-Headers".toLowerCase(Locale.US), "Access-Control-Allow-Methods".toLowerCase(Locale.US), "Access-Control-Allow-Origin".toLowerCase(Locale.US), "Access-Control-Expose-Headers".toLowerCase(Locale.US), "Access-Control-Max-Age".toLowerCase(Locale.US), "Access-Control-Request-Headers".toLowerCase(Locale.US), "Access-Control-Request-Method".toLowerCase(Locale.US), "Age".toLowerCase(Locale.US), "Allow".toLowerCase(Locale.US), "Cache-Control".toLowerCase(Locale.US), 
            "Connection".toLowerCase(Locale.US), "Content-Disposition".toLowerCase(Locale.US), "Content-Encoding".toLowerCase(Locale.US), "Content-Language".toLowerCase(Locale.US), "Content-Length".toLowerCase(Locale.US), "Content-MD5".toLowerCase(Locale.US), "Content-Range".toLowerCase(Locale.US), "Content-Type".toLowerCase(Locale.US), "Date".toLowerCase(Locale.US), "DNT".toLowerCase(Locale.US), 
            "ETag".toLowerCase(Locale.US), "Expect".toLowerCase(Locale.US), "Expires".toLowerCase(Locale.US), "Host".toLowerCase(Locale.US), "If-Match".toLowerCase(Locale.US), "If-Modified-Since".toLowerCase(Locale.US), "If-None-Match".toLowerCase(Locale.US), "If-Range".toLowerCase(Locale.US), "If-Unmodified-Since".toLowerCase(Locale.US), "Last-Event-ID".toLowerCase(Locale.US), 
            "Last-Modified".toLowerCase(Locale.US), "Max-Forwards".toLowerCase(Locale.US), "Origin".toLowerCase(Locale.US), "P3P".toLowerCase(Locale.US), "Pragma".toLowerCase(Locale.US), "Proxy-Authenticate".toLowerCase(Locale.US), "Range".toLowerCase(Locale.US), "Retry-After".toLowerCase(Locale.US), "Server".toLowerCase(Locale.US), "TE".toLowerCase(Locale.US), 
            "Trailer".toLowerCase(Locale.US), "Transfer-Encoding".toLowerCase(Locale.US), "Upgrade".toLowerCase(Locale.US), "User-Agent".toLowerCase(Locale.US), "Vary".toLowerCase(Locale.US), "Via".toLowerCase(Locale.US), "Warning".toLowerCase(Locale.US), "WWW-Authenticate".toLowerCase(Locale.US), "X-Content-Type-Options".toLowerCase(Locale.US), "X-Do-Not-Track".toLowerCase(Locale.US), 
            "X-Forwarded-Proto".toLowerCase(Locale.US), "X-Frame-Options".toLowerCase(Locale.US), "X-Powered-By".toLowerCase(Locale.US), "X-Requested-With".toLowerCase(Locale.US), "X-XSS-Protection".toLowerCase(Locale.US)
        });
    }
}
