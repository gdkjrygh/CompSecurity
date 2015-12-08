// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzin extends zznq
{

    private Map a;

    public zzin()
    {
        a = new HashMap(4);
    }

    public Map a()
    {
        return Collections.unmodifiableMap(a);
    }

    public void a(zzin zzin1)
    {
        zzin1.a.putAll(a);
    }

    public volatile void a(zznq zznq1)
    {
        a((zzin)zznq1);
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append("metric").append(entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return a(hashmap);
    }
}
