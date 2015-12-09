// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo;

import java.io.InputStream;

// Referenced classes of package com.fitbit.data.repo:
//            o

public class a
{

    final o a;
    private boolean b;
    private InputStream c;

    public void a(InputStream inputstream)
    {
        c = inputstream;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a()
    {
        return b;
    }

    public InputStream b()
    {
        return c;
    }

    public (o o1)
    {
        a = o1;
        super();
    }
}
