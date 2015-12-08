// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.c.a.n;
import com.ford.syncV4.util.c;
import java.util.Hashtable;

// Referenced classes of package com.ford.syncV4.e:
//            c

public class g extends com.ford.syncV4.e.c
{

    public g(com.ford.syncV4.e.c c1)
    {
        super(c1);
    }

    public g(String s)
    {
        super(s, "response");
    }

    public g(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final Integer c()
    {
        return (Integer)c.get("correlationID");
    }

    public final Boolean d()
    {
        return (Boolean)b.get("success");
    }

    public final n e()
    {
        Object obj = b.get("resultCode");
        if (obj instanceof n)
        {
            return (n)obj;
        }
        if (obj instanceof String)
        {
            try
            {
                obj = n.a((String)obj);
            }
            catch (Exception exception)
            {
                com.ford.syncV4.util.c.a((new StringBuilder("Failed to parse ")).append(getClass().getSimpleName()).append(".resultCode").toString(), exception);
                return null;
            }
            return ((n) (obj));
        } else
        {
            return null;
        }
    }

    public final String f()
    {
        return (String)b.get("info");
    }
}
