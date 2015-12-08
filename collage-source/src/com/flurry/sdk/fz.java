// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            fu, fx, fy, fp, 
//            gm, hq

public class fz
{

    private static fz a = null;
    private static final String b = com/flurry/sdk/fz.getSimpleName();
    private final fu c = new fu();
    private final fu d = new fu();

    private fz()
    {
    }

    public static fz a()
    {
        com/flurry/sdk/fz;
        JVM INSTR monitorenter ;
        fz fz1;
        if (a == null)
        {
            a = new fz();
        }
        fz1 = a;
        com/flurry/sdk/fz;
        JVM INSTR monitorexit ;
        return fz1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/fz;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.c();
            a = null;
        }
        com/flurry/sdk/fz;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(fx fx1)
    {
        if (fx1 != null)
        {
            Iterator iterator = c(fx1.a()).iterator();
            while (iterator.hasNext()) 
            {
                fy fy1 = (fy)iterator.next();
                fp.a().b(new hq(fy1, fx1) {

                    final fy a;
                    final fx b;
                    final fz c;

                    public void safeRun()
                    {
                        a.notify(b);
                    }

            
            {
                c = fz.this;
                a = fy1;
                b = fx1;
                super();
            }
                });
            }
        }
    }

    public void a(fy fy1)
    {
        this;
        JVM INSTR monitorenter ;
        if (fy1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fy1 = new gm(fy1);
        String s;
        for (Iterator iterator = d.a(fy1).iterator(); iterator.hasNext(); c.b(s, fy1))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_69;
        fy1;
        throw fy1;
        d.b(fy1);
          goto _L1
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        gm gm1;
        for (Iterator iterator = c.a(s).iterator(); iterator.hasNext(); d.b(gm1, s))
        {
            gm1 = (gm)iterator.next();
        }

        break MISSING_BLOCK_LABEL_67;
        s;
        throw s;
        c.b(s);
          goto _L1
    }

    public void a(String s, fy fy1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s);
        if (!flag && fy1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fy1 = new gm(fy1);
        if (!c.c(s, fy1))
        {
            c.a(s, fy1);
            d.a(fy1, s);
        }
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public int b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = c.a(s).size();
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void b(String s, fy fy1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fy1 = new gm(fy1);
        c.b(s, fy1);
        d.b(fy1, s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public List c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = Collections.emptyList();
_L5:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        ArrayList arraylist;
        arraylist = new ArrayList();
        s = c.a(s).iterator();
_L3:
        fy fy1;
        if (!s.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        fy1 = (fy)((gm)s.next()).get();
        if (fy1 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s.remove();
          goto _L3
        s;
        throw s;
        arraylist.add(fy1);
          goto _L3
        s = arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        c.a();
        d.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
