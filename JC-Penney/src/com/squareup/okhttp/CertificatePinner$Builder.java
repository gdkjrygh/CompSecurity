// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.k;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.squareup.okhttp:
//            CertificatePinner

public final class 
{

    private final Map hostnameToPins = new LinkedHashMap();

    public transient  add(String s, String as[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("hostname == null");
        }
        LinkedHashSet linkedhashset = new LinkedHashSet();
        s = (Set)hostnameToPins.put(s, Collections.unmodifiableSet(linkedhashset));
        if (s != null)
        {
            linkedhashset.addAll(s);
        }
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = as[i];
            if (!s.startsWith("sha1/"))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("pins must start with 'sha1/': ").append(s).toString());
            }
            k k1 = k.b(s.substring("sha1/".length()));
            if (k1 == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("pins must be base64: ").append(s).toString());
            }
            linkedhashset.add(k1);
        }

        return this;
    }

    public CertificatePinner build()
    {
        return new CertificatePinner(this, null);
    }


    public ()
    {
    }
}
