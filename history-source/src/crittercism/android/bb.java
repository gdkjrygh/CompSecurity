// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import com.crittercism.app.CrittercismConfig;
import java.util.List;

public final class bb extends CrittercismConfig
{

    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public bb()
    {
        b = "https://api.crittercism.com";
        c = "https://apm.crittercism.com";
        d = "https://txn.ingest.crittercism.com/api/v1/transactions";
        e = "https://appload.ingest.crittercism.com";
        f = "524c99a04002057fcd000001";
    }

    public bb(CrittercismConfig crittercismconfig)
    {
        super(crittercismconfig);
        b = "https://api.crittercism.com";
        c = "https://apm.crittercism.com";
        d = "https://txn.ingest.crittercism.com/api/v1/transactions";
        e = "https://appload.ingest.crittercism.com";
        f = "524c99a04002057fcd000001";
    }

    public final List a()
    {
        List list = super.a();
        list.add(c);
        return list;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final String e()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof bb))
        {
            return false;
        }
        bb bb1 = (bb)obj;
        return super.equals(obj) && a(b, bb1.b) && a(c, bb1.c) && a(d, bb1.d) && a(e, bb1.e) && a(f, bb1.f);
    }

    public final String f()
    {
        return f;
    }

    public final String g()
    {
        return a;
    }

    public final int hashCode()
    {
        return ((((super.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode()) * 31 + d.hashCode()) * 31 + e.hashCode()) * 31 + f.hashCode();
    }
}
