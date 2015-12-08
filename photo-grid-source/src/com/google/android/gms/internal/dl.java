// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            dk, dm

public final class dl
{

    private final Map a = new HashMap();
    private final dm b;

    public dl(dm dm1)
    {
        b = dm1;
    }

    public final dm a()
    {
        return b;
    }

    public final void a(String s, dk dk1)
    {
        a.put(s, dk1);
    }

    public final void a(String s, String s1, long l)
    {
        Object obj = b;
        s1 = (dk)a.get(s1);
        if (obj != null && s1 != null)
        {
            ((dm) (obj)).a(s1, l, new String[] {
                s
            });
        }
        obj = a;
        s1 = b;
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = s1.a(l);
        }
        ((Map) (obj)).put(s, s1);
    }
}
