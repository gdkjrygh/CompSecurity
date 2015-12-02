// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic;

import com.taobao.statistic.core.b;
import com.taobao.statistic.core.c;
import com.taobao.statistic.f.p;
import java.util.Map;

// Referenced classes of package com.taobao.statistic:
//            TBS

public static class 
{

    public static void download(String s, String s1, long l, long l1, String s2, String s3, 
            boolean flag)
    {
        if (p.isEmpty(s) || p.isEmpty(s1) || p.isEmpty(s2) || p.isEmpty(s3))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        c1.download(s, s1, l, l1, s2, s3, flag);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void download(String s, String s1, long l, long l1, boolean flag)
    {
        if (p.isEmpty(s) || p.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        c1.download(s, s1, l, l1, flag);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void pushArrive(String s)
    {
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        c1.pushArrive(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void pushDisplay(String s)
    {
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        c1.pushDisplay(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void pushView(String s)
    {
        if (p.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        c1.pushView(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void searchKeyword(String s, String s1)
    {
        if (p.isEmpty(s) || p.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c1.searchKeyword(s, s1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void updateUTCookie(String s, Map map)
    {
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        c1.Y().updateUTCookie(s, map);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void updateUTSIDToCookie(String s)
    {
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        c1.Y().updateUTSIDToCookie(s);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static void weiboShare(String s, String s1)
    {
        if (p.isEmpty(s) || p.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        Object obj = TBS.access$200();
        obj;
        JVM INSTR monitorenter ;
        c c1 = TBS.access$300();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c1.weiboShare(s, s1);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public ()
    {
    }
}
