// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;

public class br extends h
{

    public br()
    {
    }

    public Integer a()
    {
        return (Integer)d.get("minutes");
    }

    public void a(Integer integer)
    {
        if (integer != null)
        {
            d.put("hours", integer);
            return;
        } else
        {
            d.remove("hours");
            return;
        }
    }

    public Integer b()
    {
        return (Integer)d.get("seconds");
    }

    public void b(Integer integer)
    {
        if (integer != null)
        {
            d.put("minutes", integer);
            return;
        } else
        {
            d.remove("minutes");
            return;
        }
    }

    public void c(Integer integer)
    {
        if (integer != null)
        {
            d.put("seconds", integer);
            return;
        } else
        {
            d.remove("seconds");
            return;
        }
    }
}
