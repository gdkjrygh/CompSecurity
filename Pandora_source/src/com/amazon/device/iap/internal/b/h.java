// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;

import java.util.HashMap;
import java.util.Map;

public class h
{

    static final boolean b;
    public final Map a = new HashMap();

    public h()
    {
    }

    public Object a()
    {
        return a.get("RESPONSE");
    }

    public Object a(String s)
    {
        return a.get(s);
    }

    public void a(Object obj)
    {
        if (!b && obj == null)
        {
            throw new AssertionError();
        } else
        {
            a.put("RESPONSE", obj);
            return;
        }
    }

    public void a(String s, Object obj)
    {
        a.put(s, obj);
    }

    public void b()
    {
        a.remove("RESPONSE");
    }

    static 
    {
        boolean flag;
        if (!com/amazon/device/iap/internal/b/h.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
