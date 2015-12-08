// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley.toolbox;

import com.mopub.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

// Referenced classes of package com.mopub.volley.toolbox:
//            DiskBasedCache

final class b
{

    public String etag;
    public String key;
    public Map responseHeaders;
    public long serverDate;
    public long size;
    public long softTtl;
    public long ttl;

    private b()
    {
    }

    public b(String s, com.mopub.volley.Cache.Entry entry)
    {
        key = s;
        size = entry.data.length;
        etag = entry.etag;
        serverDate = entry.serverDate;
        ttl = entry.ttl;
        softTtl = entry.softTtl;
        responseHeaders = entry.responseHeaders;
    }

    public static b readHeader(InputStream inputstream)
    {
        b b1 = new b();
        if (DiskBasedCache.a(inputstream) != 0x20140623)
        {
            throw new IOException();
        }
        b1.key = DiskBasedCache.c(inputstream);
        b1.etag = DiskBasedCache.c(inputstream);
        if (b1.etag.equals(""))
        {
            b1.etag = null;
        }
        b1.serverDate = DiskBasedCache.b(inputstream);
        b1.ttl = DiskBasedCache.b(inputstream);
        b1.softTtl = DiskBasedCache.b(inputstream);
        b1.responseHeaders = DiskBasedCache.d(inputstream);
        return b1;
    }

    public final com.mopub.volley.Cache.Entry toCacheEntry(byte abyte0[])
    {
        com.mopub.volley.Cache.Entry entry = new com.mopub.volley.Cache.Entry();
        entry.data = abyte0;
        entry.etag = etag;
        entry.serverDate = serverDate;
        entry.ttl = ttl;
        entry.softTtl = softTtl;
        entry.responseHeaders = responseHeaders;
        return entry;
    }

    public final boolean writeHeader(OutputStream outputstream)
    {
        DiskBasedCache.a(outputstream, 0x20140623);
        DiskBasedCache.a(outputstream, key);
        if (etag != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        String s = "";
_L1:
        try
        {
            DiskBasedCache.a(outputstream, s);
            DiskBasedCache.a(outputstream, serverDate);
            DiskBasedCache.a(outputstream, ttl);
            DiskBasedCache.a(outputstream, softTtl);
            DiskBasedCache.a(responseHeaders, outputstream);
            outputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            VolleyLog.d("%s", new Object[] {
                outputstream.toString()
            });
            return false;
        }
        return true;
        s = etag;
          goto _L1
    }
}
