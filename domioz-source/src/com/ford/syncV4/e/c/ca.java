// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.x;
import com.ford.syncV4.e.h;
import com.ford.syncV4.util.c;
import java.util.Hashtable;

public final class ca extends h
{

    public ca()
    {
    }

    public ca(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final x a()
    {
        Object obj = d.get("resultCode");
        if (obj instanceof x)
        {
            return (x)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = x.a((String)obj);
            }
            catch (Exception exception)
            {
                c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".resultCode").toString(), exception);
                return null;
            }
            return ((x) (obj));
        } else
        {
            return null;
        }
    }
}
