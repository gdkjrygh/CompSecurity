// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp:
//            g

public static final class tException
{

    final Map a = new LinkedHashMap();

    public final transient tException a(String s, String as[])
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        s = (Set)a.put(s, Collections.unmodifiableSet(linkedhashset));
        if (s != null)
        {
            linkedhashset.addAll(s);
        }
        for (int i = 0; i <= 0; i++)
        {
            s = as[0];
            if (!s.startsWith("sha1/"))
            {
                throw new IllegalArgumentException((new StringBuilder("pins must start with 'sha1/': ")).append(s).toString());
            }
            ByteString bytestring = ByteString.b(s.substring(5));
            if (bytestring == null)
            {
                throw new IllegalArgumentException((new StringBuilder("pins must be base64: ")).append(s).toString());
            }
            linkedhashset.add(bytestring);
        }

        return this;
    }

    public final g a()
    {
        return new g(this, (byte)0);
    }

    public tException()
    {
    }
}
