// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            f, g

public static class  extends f
{

    public void a(int i, List list)
    {
        g g1 = new g(0.5F, 1.0F, 0.0F, 0.0F, b);
        g g2 = new g(0.5F, 1.0F, 0.5F, 0.0F, b);
        list.add(g1);
        list.add(g2);
        b(i - 2, list);
    }

    protected void b()
    {
        a(0.5F, 0.0F, 0.5F, 1.0F);
    }

    public ()
    {
    }
}
