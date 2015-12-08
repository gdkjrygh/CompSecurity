// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import java.util.Hashtable;

// Referenced classes of package com.ford.syncV4.e:
//            c

public class e extends c
{

    public e(String s)
    {
        super(s, "request");
        a = "request";
    }

    public final void a(Integer integer)
    {
        if (integer != null)
        {
            c.put("correlationID", integer);
        } else
        if (b.contains("correlationID"))
        {
            c.remove("correlationID");
            return;
        }
    }

    public final Integer c()
    {
        return (Integer)c.get("correlationID");
    }
}
