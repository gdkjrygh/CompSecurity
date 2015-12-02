// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.b;

import com.google.common.a.hq;
import java.util.List;

// Referenced classes of package com.facebook.common.b:
//            g

public class h
{

    public final Object a;
    final List b = hq.a();
    final List c = hq.a();

    public h(Object obj)
    {
        a = obj;
    }

    public void a(h h1)
    {
        g g1 = new g(this, h1);
        c.add(g1);
        h1.b.add(g1);
    }
}
