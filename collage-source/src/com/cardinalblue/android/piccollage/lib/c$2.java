// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import com.cardinalblue.android.piccollage.model.a.a;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            c

class a
    implements Callable
{

    final c a;

    public Boolean a()
        throws Exception
    {
        boolean flag;
        if (com.cardinalblue.android.piccollage.model.a.a.a(com.cardinalblue.android.piccollage.lib.c.a(a)).b() <= 1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    a(c c1)
    {
        a = c1;
        super();
    }
}
