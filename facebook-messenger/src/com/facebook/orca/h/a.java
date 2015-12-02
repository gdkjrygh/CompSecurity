// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.h;

import com.facebook.common.c.f;
import java.util.List;

public class a
{

    private final com.facebook.common.c.a a;
    private final javax.inject.a b;

    public a(com.facebook.common.c.a a1, javax.inject.a a2)
    {
        a = a1;
        b = a2;
    }

    public f a()
    {
        if (!((Boolean)b.b()).booleanValue())
        {
            return null;
        }
        List list = a.b();
        if (list.isEmpty())
        {
            return null;
        } else
        {
            return (f)list.get(0);
        }
    }
}
