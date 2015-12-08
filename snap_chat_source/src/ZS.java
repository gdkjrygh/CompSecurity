// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class ZS extends cC
{

    String i;
    String j;
    String k;
    String l;
    String m;

    public ZS(String s, cC cc)
    {
        super(cc);
        i = "https://api.crittercism.com";
        j = "https://apm.crittercism.com";
        k = "https://txn.ingest.crittercism.com/api/v1/transactions";
        l = "https://appload.ingest.crittercism.com";
        m = "524c99a04002057fcd000001";
        s = aad.a.a(s).a;
        i = (new StringBuilder("https://api.")).append(s).toString();
        j = (new StringBuilder("https://apm.")).append(s).toString();
        l = (new StringBuilder("https://appload.ingest.")).append(s).toString();
        k = (new StringBuilder("https://txn.ingest.")).append(s).append("/api/v1/transactions").toString();
    }

    public final List a()
    {
        List list = super.a();
        list.add(j);
        return list;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof ZS))
        {
            return false;
        }
        ZS zs = (ZS)obj;
        return super.equals(obj) && a(i, zs.i) && a(j, zs.j) && a(k, zs.k) && a(l, zs.l) && a(m, zs.m);
    }

    public final int hashCode()
    {
        return ((((super.hashCode() * 31 + i.hashCode()) * 31 + j.hashCode()) * 31 + k.hashCode()) * 31 + l.hashCode()) * 31 + m.hashCode();
    }
}
