// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.a.a;

import com.samsung.multiscreen.a.c;
import com.samsung.multiscreen.a.d;
import com.samsung.multiscreen.a.e;
import com.samsung.multiscreen.net.dial.DialClient;
import com.samsung.multiscreen.net.dial.a;

public final class b
    implements d, Runnable
{

    private String a;
    private DialClient b;
    private d c;

    public b(String s, DialClient dialclient, d d1)
    {
        a = s;
        b = dialclient;
        c = d1;
    }

    public final void onError(e e)
    {
        c.onError(e);
    }

    public final void onResult(Object obj)
    {
        obj = (a)obj;
        if (obj != null)
        {
            c.onResult(com.samsung.multiscreen.a.c.a(((a) (obj)).a()));
            return;
        } else
        {
            c.onResult(c.a);
            return;
        }
    }

    public final void run()
    {
        b.a(a, this);
    }
}
