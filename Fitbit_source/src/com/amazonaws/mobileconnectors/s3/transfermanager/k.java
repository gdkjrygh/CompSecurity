// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.util.json.JsonUtils;
import com.amazonaws.util.json.c;
import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            j

public final class k extends j
{

    static final String a = "upload";
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final long g;
    private final long h;

    public k()
    {
        this(null, null, null, null, -1L, -1L);
    }

    public k(String s, String s1, String s2, String s3, long l, long l1)
    {
        b = "upload";
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = l;
        h = l1;
    }

    String a()
    {
        return c;
    }

    String b()
    {
        return d;
    }

    String c()
    {
        return f;
    }

    long d()
    {
        return g;
    }

    long e()
    {
        return h;
    }

    String f()
    {
        return e;
    }

    String g()
    {
        return "upload";
    }

    public String i()
    {
        StringWriter stringwriter = new StringWriter();
        c c1 = JsonUtils.a(stringwriter);
        try
        {
            c1.c().a("pauseType").b("upload").a("bucketName").b(c).a("key").b(d).a("file").b(e).a("multipartUploadId").b(f).a("partSize").a(g).a("mutlipartUploadThreshold").a(h).d().g();
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return stringwriter.toString();
    }
}
