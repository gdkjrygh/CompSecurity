// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            a, ab

class l
{

    static l a = new l(0, false);
    static l b = new l(1, false);
    static l c = new l(2, true);
    static l d = new l(3, true);
    int e;
    boolean f;
    StringBuilder g;

    l(int i, boolean flag)
    {
        g = new StringBuilder();
        e = i;
        f = flag;
    }

    l a()
    {
        this;
        JVM INSTR monitorenter ;
        l l1 = a('\n');
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    l a(char c1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        g.append(c1);
        if (c1 != '\n')
        {
            continue; /* Loop/switch isn't completed */
        }
        com.jirbo.adcolony.a.a(e, g.toString());
        g.setLength(0);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    l a(double d1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        ab.a(d1, 2, g);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    l a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        g.append(i);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    l a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f) goto _L2; else goto _L1
_L1:
        if (obj != null) goto _L4; else goto _L3
_L3:
        a("null");
_L2:
        this;
        JVM INSTR monitorexit ;
        return this;
_L4:
        a(obj.toString());
        if (true) goto _L2; else goto _L5
_L5:
        obj;
        throw obj;
    }

    l a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        g.append("null");
        break; /* Loop/switch isn't completed */
        int j = s.length();
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a(s.charAt(i));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        s;
        throw s;
    }

    l a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = f;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        g.append(flag);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    l b(double d1)
    {
        this;
        JVM INSTR monitorenter ;
        l l1;
        a(d1);
        l1 = a('\n');
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    l b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        l l1;
        a(i);
        l1 = a('\n');
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    l b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        a(obj);
        obj = a('\n');
        this;
        JVM INSTR monitorexit ;
        return ((l) (obj));
        obj;
        throw obj;
    }

    l b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        l l1;
        a(flag);
        l1 = a('\n');
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    boolean b(String s)
    {
        a((new StringBuilder()).append(s).append('\n').toString());
        return false;
    }

    int c(String s)
    {
        a((new StringBuilder()).append(s).append('\n').toString());
        return 0;
    }

}
