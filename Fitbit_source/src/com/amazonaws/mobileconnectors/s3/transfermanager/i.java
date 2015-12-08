// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.mobileconnectors.s3.transfermanager;

import com.amazonaws.services.s3.model.br;
import com.amazonaws.util.json.JsonUtils;
import com.amazonaws.util.json.c;
import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package com.amazonaws.mobileconnectors.s3.transfermanager:
//            j

public final class i extends j
{

    static final String a = "download";
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f[];
    private final br g;
    private final boolean h;
    private final String i;

    public i()
    {
        this(null, null, null, null, null, false, null);
    }

    public i(String s, String s1, String s2, long al[], br br1, boolean flag, String s3)
    {
        b = "download";
        c = s;
        d = s1;
        e = s2;
        if (al == null)
        {
            s = null;
        } else
        {
            s = (long[])al.clone();
        }
        f = s;
        g = br1;
        h = flag;
        i = s3;
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
        return e;
    }

    long[] d()
    {
        if (f == null)
        {
            return null;
        } else
        {
            return (long[])f.clone();
        }
    }

    br e()
    {
        return g;
    }

    boolean f()
    {
        return h;
    }

    String g()
    {
        return i;
    }

    String h()
    {
        return "download";
    }

    public String i()
    {
        StringWriter stringwriter;
        c c1;
        stringwriter = new StringWriter();
        c1 = JsonUtils.a(stringwriter);
        long al[];
        int l;
        c1.c().a("pauseType").b("download").a("bucketName").b(c).a("key").b(d).a("file").b(i).a("versionId").b(e).a("isRequesterPays").a(h);
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        c1.a("range").a();
        al = f;
        l = al.length;
        int k = 0;
        while (k < l) 
        {
            try
            {
                c1.a(al[k]);
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            k++;
        }
        c1.b();
        if (g != null)
        {
            c1.a("responseHeaders").c().a("contentType").b(g.f()).a("contentLanguage").b(g.g()).a("expires").b(g.h()).a("cacheControl").b(g.i()).a("contentDisposition").b(g.j()).a("contentEncoding").b(g.k()).d();
        }
        c1.d().g();
        return stringwriter.toString();
    }
}
