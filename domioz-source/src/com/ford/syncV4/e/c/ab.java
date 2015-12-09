// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.a;
import com.ford.syncV4.e.d;
import com.ford.syncV4.util.c;
import java.util.Hashtable;

public final class ab extends d
{

    public ab()
    {
        super("OnAppInterfaceUnregistered");
    }

    public ab(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final a c()
    {
        Object obj = b.get("reason");
        if (obj instanceof a)
        {
            return (a)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = a.a((String)obj);
            }
            catch (Exception exception)
            {
                com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".reason").toString(), exception);
                return null;
            }
            return ((a) (obj));
        } else
        {
            return null;
        }
    }
}
