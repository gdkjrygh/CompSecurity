// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.i;
import com.ford.syncV4.e.d;
import com.ford.syncV4.util.c;
import java.util.Hashtable;

public final class aj extends d
{

    public aj()
    {
        super("OnKeyboardInput");
    }

    public aj(Hashtable hashtable)
    {
        super(hashtable);
    }

    private i c()
    {
        Object obj = b.get("event");
        if (obj instanceof i)
        {
            return (i)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = i.a((String)obj);
            }
            catch (Exception exception)
            {
                com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".event").toString(), exception);
                return null;
            }
            return ((i) (obj));
        } else
        {
            return null;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(a()).append(":  data: ");
        Object obj = b.get("data");
        if (obj instanceof String)
        {
            obj = (String)obj;
        } else
        {
            obj = null;
        }
        return stringbuilder.append(((String) (obj))).append(" event:").append(c().toString()).toString();
    }
}
