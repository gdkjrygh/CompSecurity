// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package b.a:
//            az

public final class ay
{

    private static final Map a;
    private String b;
    private String c;
    private String d;
    private String e;

    public ay(String s)
    {
        if (s == null)
        {
            throw new az("Given null appId");
        }
        if (!s.matches("[0-9a-fA-F]+"))
        {
            throw new az((new StringBuilder("Invalid appId: '")).append(s).append("'. AppId must be hexadecimal characters").toString());
        }
        if (s.length() != 24 && s.length() != 40)
        {
            throw new az((new StringBuilder("Invalid appId: '")).append(s).append("'. AppId must be either 24 or 40 characters").toString());
        }
        String s1 = null;
        if (s.length() == 24)
        {
            s1 = "00555300";
        } else
        if (s.length() == 40)
        {
            s1 = s.substring(s.length() - 8);
        }
        s1 = (String)a.get(s1);
        if (s1 == null)
        {
            throw new az((new StringBuilder("Invalid appId: '")).append(s).append("'. Invalid app locator code").toString());
        } else
        {
            b = System.getProperty("com.crittercism.apmUrl", (new StringBuilder("https://apm.")).append(s1).toString());
            c = System.getProperty("com.crittercism.apiUrl", (new StringBuilder("https://api.")).append(s1).toString());
            d = System.getProperty("com.crittercism.txnUrl", (new StringBuilder("https://txn.ingest.")).append(s1).toString());
            e = System.getProperty("com.crittercism.appLoadUrl", (new StringBuilder("https://appload.ingest.")).append(s1).toString());
            return;
        }
    }

    public final String a()
    {
        return c;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return e;
    }

    public final String d()
    {
        return d;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("00555300", "crittercism.com");
        a.put("00555304", "crit-ci.com");
        a.put("00555305", "crit-staging.com");
        a.put("00444503", "eu.crittercism.com");
    }
}
