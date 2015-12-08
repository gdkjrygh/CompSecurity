// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import com.google.android.gms.common.internal.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class f extends ab
{

    private final Map a = new HashMap();

    public f()
    {
    }

    private String a(String s)
    {
        u.a(s);
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.startsWith("&"))
            {
                s1 = s.substring(1);
            }
        }
        u.a(s1, "Name can not be empty or \"&\"");
        return s1;
    }

    public Map a()
    {
        return Collections.unmodifiableMap(a);
    }

    public volatile void a(ab ab1)
    {
        a((f)ab1);
    }

    public void a(f f1)
    {
        u.a(f1);
        f1.a.putAll(a);
    }

    public void a(String s, String s1)
    {
        s = a(s);
        a.put(s, s1);
    }

    public String toString()
    {
        return a(a);
    }
}
