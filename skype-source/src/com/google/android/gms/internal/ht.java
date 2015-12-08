// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class ht extends jc
{

    private final Map a = new HashMap();

    public ht()
    {
    }

    public final Map a()
    {
        return Collections.unmodifiableMap(a);
    }

    public final void a(jc jc1)
    {
        jc1 = (ht)jc1;
        y.a(jc1);
        ((ht) (jc1)).a.putAll(a);
    }

    public final void a(String s, String s1)
    {
        y.a(s);
        String s2 = s;
        if (s != null)
        {
            s2 = s;
            if (s.startsWith("&"))
            {
                s2 = s.substring(1);
            }
        }
        y.a(s2, "Name can not be empty or \"&\"");
        a.put(s2, s1);
    }

    public final String toString()
    {
        return a(a);
    }
}
