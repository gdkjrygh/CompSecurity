// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Hashtable;

public class atk extends ati
{

    public atk(String s)
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
