// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import java.util.Hashtable;

// Referenced classes of package p.bd:
//            c

public class e extends c
{

    public e(String s)
    {
        super(s, "request");
        a = "request";
    }

    public void a(Integer integer)
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

    public Integer c()
    {
        return (Integer)c.get("correlationID");
    }
}
