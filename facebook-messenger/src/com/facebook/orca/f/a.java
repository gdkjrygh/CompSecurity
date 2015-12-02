// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.i.a.a.f;
import com.facebook.messages.ipc.peer.d;
import com.facebook.messages.threads.model.b;
import com.google.common.a.ik;
import java.util.concurrent.ConcurrentMap;

public class a
{

    private final f a;
    private final ConcurrentMap b = ik.c();

    public a(f f1)
    {
        a = f1;
    }

    public void a()
    {
        b.clear();
        a.a(d.g, null);
    }

    public void a(b b1)
    {
        if (b1 != null)
        {
            b.put(b1, Boolean.valueOf(true));
            if (b1.a() != null)
            {
                a.a(d.b(b1.a()), Boolean.valueOf(true));
                return;
            }
        }
    }

    public void b(b b1)
    {
        if (b1 != null)
        {
            b.remove(b1);
            if (b1.a() != null)
            {
                a.a(d.b(b1.a()), Boolean.valueOf(false));
                return;
            }
        }
    }
}
