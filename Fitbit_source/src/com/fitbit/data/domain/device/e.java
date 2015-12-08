// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


public class e
{

    private Object a;
    private boolean b;

    public e(Object obj)
    {
        a = obj;
    }

    public void a(Object obj)
    {
        if (obj != a || a != null && !a.equals(obj))
        {
            b = true;
        }
        a = obj;
    }

    public boolean a()
    {
        return b;
    }

    public void b()
    {
        b = false;
    }

    public Object c()
    {
        return a;
    }
}
