// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.messages.model.threads.Message;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook.orca.notify:
//            ap, j

class k
    implements Callable
{

    final ap a;
    final j b;

    k(j j1, ap ap1)
    {
        b = j1;
        a = ap1;
        super();
    }

    public Boolean a()
    {
        if (!b.b(a.b().e()))
        {
            return Boolean.valueOf(false);
        } else
        {
            return Boolean.valueOf(j.a(b, a));
        }
    }

    public Object call()
    {
        return a();
    }
}
