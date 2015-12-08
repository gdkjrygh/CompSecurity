// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import com.roidapp.baselib.b.b;
import com.roidapp.baselib.b.d;
import com.roidapp.baselib.b.g;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.d.a;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            m

public final class p
{

    private b a;
    private final Object b = new Object();

    public p()
    {
    }

    private static void a(d d1, boolean flag)
    {
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        d1.b();
        return;
        try
        {
            d1.c();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            return;
        }
        d1;
    }

    public final String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        boolean flag;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        flag = a.a();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s = a.a(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        java.io.InputStream inputstream = s.a();
        String s1 = com.roidapp.baselib.d.a.a(inputstream, "utf-8");
        com.roidapp.baselib.d.a.a(inputstream);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        s.close();
        obj1;
        JVM INSTR monitorexit ;
        return s1;
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        com.roidapp.baselib.d.a.a(null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        s.close();
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return null;
_L4:
        com.roidapp.baselib.d.a.a(inputstream);
        if (s == null) goto _L2; else goto _L1
_L1:
        s.close();
          goto _L2
_L3:
        com.roidapp.baselib.d.a.a(inputstream);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s.close();
        Object obj;
        throw obj;
        obj;
        inputstream = null;
          goto _L3
        obj;
          goto _L3
        obj;
        inputstream = null;
          goto _L4
        obj;
          goto _L4
        s;
        inputstream = null;
        s = null;
          goto _L4
        obj;
        s = null;
        inputstream = null;
          goto _L3
    }

    public final void a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        com.roidapp.cloudlib.sns.m.a("cache init");
        a = com.roidapp.baselib.b.b.a(com.roidapp.baselib.d.a.a(aj.a(), "sns_request"));
_L1:
        return;
        Object obj1;
        obj1;
        ((IOException) (obj1)).printStackTrace();
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public final void a(String s, String s1)
    {
        String s2;
        String s3;
        Object obj;
        s3 = null;
        s2 = null;
        obj = null;
        if (s == null || s1 == null)
        {
            return;
        }
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        boolean flag;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        flag = a.a();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        d d1 = a.b(s);
        s = obj;
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        s3 = s2;
        s = d1.a();
        s2 = s;
        s3 = s;
        s.write(s1.getBytes("utf-8"));
        s2 = s;
        s3 = s;
        a(d1, true);
        com.roidapp.baselib.d.a.a(s);
_L1:
        obj1;
        JVM INSTR monitorexit ;
        return;
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        s;
        d1 = null;
_L3:
        s2 = s3;
        a(d1, false);
        com.roidapp.baselib.d.a.a(s3);
          goto _L1
_L2:
        com.roidapp.baselib.d.a.a(s2);
        throw s;
        s;
          goto _L2
        s;
          goto _L3
        s;
        s2 = null;
          goto _L2
    }

    public final void b()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        flag = a.a();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        Exception exception;
        try
        {
            a.b();
        }
        catch (IOException ioexception) { }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        com.roidapp.cloudlib.sns.m.a("cache close");
        Exception exception;
        try
        {
            a.b();
            a.close();
            a = null;
        }
        catch (IOException ioexception) { }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
