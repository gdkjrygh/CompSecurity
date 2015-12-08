// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amazon.device.associates:
//            n, br, p

static final class <init>
    implements Serializable
{

    private final Map a;
    private Date b;
    private long c;

    static Date a(<init> <init>1, Date date)
    {
        <init>1.b = date;
        return date;
    }

    public br a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (br)a.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void a(String s, br br1)
    {
        this;
        JVM INSTR monitorenter ;
        a.put(s, br1);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public boolean a()
    {
        if ((new Date()).getTime() - b.getTime() >= c)
        {
            a.clear();
            p.c("PopoverCacheManager", "Expiring popover data.");
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
        a = new HashMap();
        b = new Date();
        c = 0x5265c00L;
    }

    c(c c1)
    {
        this();
    }
}
