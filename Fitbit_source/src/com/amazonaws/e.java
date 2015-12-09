// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.amazonaws:
//            f, b

public class e
    implements f
{

    private String a;
    private Map b;
    private Map c;
    private URI d;
    private String e;
    private final b f;
    private HttpMethodName g;
    private InputStream h;
    private int i;
    private AWSRequestMetrics j;

    public e(b b1, String s)
    {
        b = new LinkedHashMap();
        c = new HashMap();
        g = HttpMethodName.b;
        e = s;
        f = b1;
    }

    public e(String s)
    {
        this(null, s);
    }

    public b a()
    {
        return f;
    }

    public void a(int k)
    {
        i = k;
    }

    public void a(HttpMethodName httpmethodname)
    {
        g = httpmethodname;
    }

    public void a(AWSRequestMetrics awsrequestmetrics)
    {
        if (j == null)
        {
            j = awsrequestmetrics;
            return;
        } else
        {
            throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
        }
    }

    public void a(InputStream inputstream)
    {
        h = inputstream;
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(String s, String s1)
    {
        c.put(s, s1);
    }

    public void a(URI uri)
    {
        d = uri;
    }

    public void a(Map map)
    {
        c.clear();
        c.putAll(map);
    }

    public f b(int k)
    {
        a(k);
        return this;
    }

    public Map b()
    {
        return c;
    }

    public void b(String s, String s1)
    {
        b.put(s, s1);
    }

    public void b(Map map)
    {
        b.clear();
        b.putAll(map);
    }

    public f c(String s, String s1)
    {
        b(s, s1);
        return this;
    }

    public String c()
    {
        return a;
    }

    public Map d()
    {
        return b;
    }

    public HttpMethodName e()
    {
        return g;
    }

    public URI f()
    {
        return d;
    }

    public String g()
    {
        return e;
    }

    public InputStream h()
    {
        return h;
    }

    public int i()
    {
        return i;
    }

    public AWSRequestMetrics j()
    {
        return j;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(e()).append(" ");
        stringbuilder.append(f()).append(" ");
        Object obj = c();
        if (obj == null)
        {
            stringbuilder.append("/");
        } else
        {
            if (!((String) (obj)).startsWith("/"))
            {
                stringbuilder.append("/");
            }
            stringbuilder.append(((String) (obj)));
        }
        stringbuilder.append(" ");
        if (!d().isEmpty())
        {
            stringbuilder.append("Parameters: (");
            String s;
            String s2;
            for (obj = d().keySet().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append(s).append(": ").append(s2).append(", "))
            {
                s = (String)((Iterator) (obj)).next();
                s2 = (String)d().get(s);
            }

            stringbuilder.append(") ");
        }
        if (!b().isEmpty())
        {
            stringbuilder.append("Headers: (");
            String s1;
            String s3;
            for (Iterator iterator = b().keySet().iterator(); iterator.hasNext(); stringbuilder.append(s1).append(": ").append(s3).append(", "))
            {
                s1 = (String)iterator.next();
                s3 = (String)b().get(s1);
            }

            stringbuilder.append(") ");
        }
        return stringbuilder.toString();
    }
}
