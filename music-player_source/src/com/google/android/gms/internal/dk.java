// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ah, dj, ek, em

final class dk
    implements ah
{

    final dj a;

    dk(dj dj1)
    {
        a = dj1;
        super();
    }

    public final void a(em em, Map map)
    {
        synchronized (dj.a(a))
        {
            String s = (String)map.get("type");
            map = (String)map.get("errors");
            ek.d((new StringBuilder("Invalid ")).append(s).append(" request error: ").append(map).toString());
            dj.b(a);
            dj.a(a).notify();
        }
    }
}
