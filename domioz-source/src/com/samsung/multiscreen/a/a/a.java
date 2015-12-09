// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.a.a;

import com.samsung.multiscreen.a.c;
import com.samsung.multiscreen.a.d;
import com.samsung.multiscreen.a.e;
import com.samsung.multiscreen.device.Device;
import com.samsung.multiscreen.device.f;
import com.samsung.multiscreen.device.g;
import com.samsung.multiscreen.net.dial.DialClient;
import java.net.URI;

public final class a
    implements d, Runnable
{

    private String a;
    private Device b;
    private URI c;
    private DialClient d;
    private f e;

    public a(String s, URI uri, Device device, DialClient dialclient, f f1)
    {
        a = s;
        c = uri;
        b = device;
        d = dialclient;
        e = f1;
    }

    public final void onError(e e1)
    {
        e.onError(new g(e1.a(), e1.b()));
    }

    public final void onResult(Object obj)
    {
        com.samsung.multiscreen.net.dial.a a1 = (com.samsung.multiscreen.net.dial.a)obj;
        if (a1 != null)
        {
            c c1 = com.samsung.multiscreen.a.c.a(a1.a().toLowerCase());
            String s = "";
            obj = s;
            if (c1.equals(c.c))
            {
                String as[] = a1.a().split("=");
                obj = s;
                if (as.length == 2)
                {
                    obj = as[1];
                }
            }
            obj = new com.samsung.multiscreen.a.a(b, c, a, c1, a1.b(), ((String) (obj)));
            e.onResult(obj);
            return;
        } else
        {
            e.onError(new g("not found"));
            return;
        }
    }

    public final void run()
    {
        d.a(a, this);
    }
}
