// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, bu, cl

final class n extends o
{

    private static final String a;
    private final bu b;

    public n(bu bu1)
    {
        super(a, new String[0]);
        b = bu1;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        map = b.a();
        if (map == null)
        {
            return cl.f();
        } else
        {
            return cl.a(map);
        }
    }

    public final boolean a()
    {
        return false;
    }

    static 
    {
        a = e.q.toString();
    }
}
