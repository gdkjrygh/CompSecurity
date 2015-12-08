// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.c;
import com.ford.syncV4.e.d;
import java.util.Hashtable;

public final class ag extends d
{

    public ag()
    {
        super("OnDriverDistraction");
    }

    public ag(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final c c()
    {
        Object obj = b.get("state");
        if (obj instanceof c)
        {
            return (c)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = com.ford.syncV4.e.c.a.c.a((String)obj);
            }
            catch (Exception exception)
            {
                com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".state").toString(), exception);
                return null;
            }
            return ((c) (obj));
        } else
        {
            return null;
        }
    }
}
