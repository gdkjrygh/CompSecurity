// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.d;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ab, cf, x, aa

public final class ad
{

    boolean a;
    final Object b = new Object();
    ad c;
    private final List d = new LinkedList();
    private final Map e = new LinkedHashMap();

    public ad(String s, String s1)
    {
        a = true;
        e.put("action", s);
        e.put("ad_format", s1);
    }

    public final ab a(long l)
    {
        if (!a)
        {
            return null;
        } else
        {
            return new ab(l, null, null);
        }
    }

    public final void a(String s, String s1)
    {
        Object obj;
        while (!a || TextUtils.isEmpty(s1) || (obj = com.google.android.gms.ads.internal.d.f().a()) == null) 
        {
            return;
        }
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        obj = (aa)((x) (obj)).b.get(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
_L1:
        Map map = e;
        map.put(s, ((aa) (obj)).a((String)map.get(s), s1));
        obj1;
        JVM INSTR monitorexit ;
        return;
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        obj = aa.a;
          goto _L1
    }

    public final transient boolean a(ab ab1, long l, String as[])
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        int j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ab ab2 = new ab(l, as[i], ab1);
        d.add(ab2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        ab1;
        obj;
        JVM INSTR monitorexit ;
        throw ab1;
    }
}
