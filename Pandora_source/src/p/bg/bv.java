// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;

public class bv extends h
{

    public bv()
    {
    }

    public bv(Hashtable hashtable)
    {
        super(hashtable);
    }

    public Integer a()
    {
        return (Integer)d.get("majorVersion");
    }

    public void a(Integer integer)
    {
        if (integer != null)
        {
            d.put("majorVersion", integer);
            return;
        } else
        {
            d.remove("majorVersion");
            return;
        }
    }

    public Integer b()
    {
        return (Integer)d.get("minorVersion");
    }

    public void b(Integer integer)
    {
        if (integer != null)
        {
            d.put("minorVersion", integer);
            return;
        } else
        {
            d.remove("minorVersion");
            return;
        }
    }
}
