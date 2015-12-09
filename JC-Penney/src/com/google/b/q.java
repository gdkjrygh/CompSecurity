// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.b:
//            r, s, a

public final class q
{

    private final String a;
    private final byte b[];
    private s c[];
    private final a d;
    private Map e;
    private final long f;

    public q(String s1, byte abyte0[], s as[], a a1)
    {
        this(s1, abyte0, as, a1, System.currentTimeMillis());
    }

    public q(String s1, byte abyte0[], s as[], a a1, long l)
    {
        a = s1;
        b = abyte0;
        c = as;
        d = a1;
        e = null;
        f = l;
    }

    public String a()
    {
        return a;
    }

    public void a(r r1, Object obj)
    {
        if (e == null)
        {
            e = new EnumMap(com/google/b/r);
        }
        e.put(r1, obj);
    }

    public void a(Map map)
    {
label0:
        {
            if (map != null)
            {
                if (e != null)
                {
                    break label0;
                }
                e = map;
            }
            return;
        }
        e.putAll(map);
    }

    public void a(s as[])
    {
        s as1[] = c;
        if (as1 == null)
        {
            c = as;
        } else
        if (as != null && as.length > 0)
        {
            s as2[] = new s[as1.length + as.length];
            System.arraycopy(as1, 0, as2, 0, as1.length);
            System.arraycopy(as, 0, as2, as1.length, as.length);
            c = as2;
            return;
        }
    }

    public byte[] b()
    {
        return b;
    }

    public s[] c()
    {
        return c;
    }

    public a d()
    {
        return d;
    }

    public Map e()
    {
        return e;
    }

    public String toString()
    {
        return a;
    }
}
