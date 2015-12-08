// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            g

final class h
    implements c.b
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public final void a(Map map)
    {
        map = ((Map) (map.get("event")));
        if (map != null)
        {
            g.a(a, map.toString());
        }
    }
}
