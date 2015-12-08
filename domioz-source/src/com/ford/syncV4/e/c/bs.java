// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.h;
import java.util.Hashtable;

public final class bs extends h
{

    public bs()
    {
    }

    public bs(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final Integer a()
    {
        return (Integer)d.get("majorVersion");
    }

    public final void a(Integer integer)
    {
        d.put("majorVersion", integer);
    }

    public final Integer b()
    {
        return (Integer)d.get("minorVersion");
    }

    public final void b(Integer integer)
    {
        d.put("minorVersion", integer);
    }
}
