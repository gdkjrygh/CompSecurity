// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.d.b.c;
import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            g

public final class am
    implements g
{

    private Hashtable a;

    public am(String s)
    {
        a = new Hashtable();
        c.a("chunkSize", "equal or greater than 20000 but less than 150000", true);
        c.a("retentionDays", "greater than 0 or equal to -1", true);
        a.put("Calllog_Disable", "FALSE".getBytes());
        a.put("Calllog_Chunk_Size", Integer.valueOf(0x19000).toString().getBytes());
        a.put("Calllog_Retention_Days", Integer.valueOf(-1).toString().getBytes());
        if (s != null)
        {
            a.put("Calllog_Root_Id", s.getBytes());
        }
    }

    public final Object a(String s)
    {
        return a.get(s);
    }

    public final Enumeration a()
    {
        return a.keys();
    }
}
