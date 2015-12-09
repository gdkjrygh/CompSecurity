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
        list.add(new g(1.0F, 0.25F, 0.0F, 0.0F, b));
        list.add(new g(1.0F, 0.25F, 0.0F, 0.25F, b));
        list.add(new g(1.0F, 0.25F, 0.0F, 0.5F, b));
        list.add(new g(1.0F, 0.25F, 0.0F, 0.75F, b));
        b(i - 4, list);
    }

    protected void b()
    {
        a(0.0F, 0.25F, 1.0F, 0.25F);
        a(0.0F, 0.5F, 1.0F, 0.5F);
        a(0.0F, 0.75F, 1.0F, 0.75F);
    }

    public ()
    {
    }
}
