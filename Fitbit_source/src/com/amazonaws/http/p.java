// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.http;

import com.amazonaws.c;
import com.amazonaws.d.m;
import com.amazonaws.d.n;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.util.h;
import com.amazonaws.util.json.JsonUtils;
import com.amazonaws.util.json.b;
import com.amazonaws.util.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.http:
//            m, l

public class p
    implements com.amazonaws.http.m
{

    private static final Log c = LogFactory.getLog("com.amazonaws.request");
    public boolean a;
    private m b;

    public p(m m1)
    {
        a = false;
        b = m1;
        if (b == null)
        {
            b = new n();
        }
    }

    public c a(l l1)
        throws Exception
    {
        c.trace("Parsing service response JSON");
        String s = (String)l1.a().get("x-amz-crc32");
        Object obj1 = l1.c();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new ByteArrayInputStream("{}".getBytes(u.a));
        }
        IOException ioexception;
        Object obj2;
        Object obj3;
        long l2;
        if (s != null)
        {
            obj = new h(((java.io.InputStream) (obj)));
            obj1 = obj;
        } else
        {
            obj1 = null;
        }
        obj2 = obj;
        if ("gzip".equals(l1.a().get("Content-Encoding")))
        {
            obj2 = new GZIPInputStream(((java.io.InputStream) (obj)));
        }
        obj = JsonUtils.a(new InputStreamReader(((java.io.InputStream) (obj2))));
        obj2 = new c();
        obj3 = new com.amazonaws.d.c(((b) (obj)), l1);
        obj3 = b.a(obj3);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        l2 = Long.parseLong(s);
        if (((h) (obj1)).a() != l2)
        {
            throw new CRC32MismatchException("Client calculated crc32 checksum didn't match that calculated by server side");
        }
        break MISSING_BLOCK_LABEL_195;
        l1;
        if (!a)
        {
            try
            {
                ((b) (obj)).k();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                c.warn("Error closing json parser", ioexception);
            }
        }
        throw l1;
        ((c) (obj2)).a(obj3);
        obj1 = new HashMap();
        ((Map) (obj1)).put("AWS_REQUEST_ID", l1.a().get("x-amzn-RequestId"));
        ((c) (obj2)).a(new com.amazonaws.h(((Map) (obj1))));
        c.trace("Done parsing service response");
        if (!a)
        {
            try
            {
                ((b) (obj)).k();
            }
            // Misplaced declaration of an exception variable
            catch (l l1)
            {
                c.warn("Error closing json parser", l1);
                return ((c) (obj2));
            }
        }
        return ((c) (obj2));
    }

    protected void a(com.amazonaws.d.c c1)
    {
    }

    public boolean a()
    {
        return a;
    }

    public Object b(l l1)
        throws Exception
    {
        return a(l1);
    }

}
