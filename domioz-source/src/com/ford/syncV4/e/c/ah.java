// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.c.a.b;
import com.ford.syncV4.e.c.a.e;
import com.ford.syncV4.e.c.a.u;
import com.ford.syncV4.e.d;
import com.ford.syncV4.util.c;
import java.util.Hashtable;

public final class ah extends d
{

    private Boolean e;

    public ah()
    {
        super("OnHMIStatus");
    }

    public ah(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final void a(Boolean boolean1)
    {
        e = boolean1;
    }

    public final e c()
    {
        Object obj = b.get("hmiLevel");
        if (obj instanceof e)
        {
            return (e)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = com.ford.syncV4.e.c.a.e.a((String)obj);
            }
            catch (Exception exception)
            {
                com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".hmiLevel").toString(), exception);
                return null;
            }
            return ((e) (obj));
        } else
        {
            return null;
        }
    }

    public final b d()
    {
        Object obj = b.get("audioStreamingState");
        if (obj instanceof b)
        {
            return (b)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = b.a((String)obj);
            }
            catch (Exception exception)
            {
                com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".audioStreamingState").toString(), exception);
                return null;
            }
            return ((b) (obj));
        } else
        {
            return null;
        }
    }

    public final u e()
    {
        Object obj = b.get("systemContext");
        if (obj instanceof u)
        {
            return (u)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = u.a((String)obj);
            }
            catch (Exception exception)
            {
                com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".systemContext").toString(), exception);
                return null;
            }
            return ((u) (obj));
        } else
        {
            return null;
        }
    }

    public final Boolean f()
    {
        return e;
    }
}
