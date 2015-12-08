// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ai, cb, cn, cq

class gW
    implements ai
{

    final cb gW;

    public void a(cq cq, Map map)
    {
        synchronized (cb.a(gW))
        {
            String s = (String)map.get("type");
            map = (String)map.get("errors");
            cn.q((new StringBuilder()).append("Invalid ").append(s).append(" request error: ").append(map).toString());
            cb.a(gW, 1);
            cb.a(gW).notify();
        }
        return;
        map;
        cq;
        JVM INSTR monitorexit ;
        throw map;
    }

    (cb cb1)
    {
        gW = cb1;
        super();
    }
}
