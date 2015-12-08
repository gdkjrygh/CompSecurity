// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzio extends zznq
{

    private final Map a = new HashMap();

    public zzio()
    {
    }

    private String a(String s)
    {
        zzu.a(s);
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.startsWith("&"))
            {
                s1 = s.substring(1);
            }
        }
        zzu.a(s1, "Name can not be empty or \"&\"");
        return s1;
    }

    public Map a()
    {
        return Collections.unmodifiableMap(a);
    }

    public void a(zzio zzio1)
    {
        zzu.a(zzio1);
        zzio1.a.putAll(a);
    }

    public volatile void a(zznq zznq1)
    {
        a((zzio)zznq1);
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
