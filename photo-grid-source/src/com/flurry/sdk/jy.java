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
//            jt, jw, jx, jo, 
//            km

public class jy
{

    private static jy a = null;
    private static final String b = com/flurry/sdk/jy.getSimpleName();
    private final jt c = new jt();
    private final jt d = new jt();

    private jy()
    {
    }

    public static jy a()
    {
        com/flurry/sdk/jy;
        JVM INSTR monitorenter ;
        jy jy1;
        if (a == null)
        {
            a = new jy();
        }
        jy1 = a;
        com/flurry/sdk/jy;
        JVM INSTR monitorexit ;
        return jy1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/flurry/sdk/jy;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.c();
            a = null;
        }
        com/flurry/sdk/jy;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(jw jw1)
    {
        if (jw1 != null)
        {
            Iterator iterator = c(jw1.a()).iterator();
            while (iterator.hasNext()) 
            {
                jx jx1 = (jx)iterator.next();
                jo.a().b(new _cls1(jx1, jw1));
            }
        }
    }

    public void a(jx jx1)
    {
        this;
        JVM INSTR monitorenter ;
        if (jx1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        jx1 = new km(jx1);
        String s;
        for (Iterator iterator = d.a(jx1).iterator(); iterator.hasNext(); c.b(s, jx1))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_69;
        jx1;
        throw jx1;
        d.b(jx1);
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
        km km1;
        for (Iterator iterator = c.a(s).iterator(); iterator.hasNext(); d.b(km1, s))
        {
            km1 = (km)iterator.next();
        }

        break MISSING_BLOCK_LABEL_67;
        s;
        throw s;
        c.b(s);
          goto _L1
    }

    public void a(String s, jx jx1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s);
        if (!flag && jx1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        jx1 = new km(jx1);
        if (!c.c(s, jx1))
        {
            c.a(s, jx1);
            d.a(jx1, s);
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

    public void b(String s, jx jx1)
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
        jx1 = new km(jx1);
        c.b(s, jx1);
        d.b(jx1, s);
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
        jx jx1;
        if (!s.hasNext())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        jx1 = (jx)((km)s.next()).get();
        if (jx1 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        s.remove();
          goto _L3
        s;
        throw s;
        arraylist.add(jx1);
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


    private class _cls1 extends lr
    {

        final jx a;
        final jw b;
        final jy c;

        public void a()
        {
            a.a(b);
        }

        _cls1(jx jx1, jw jw1)
        {
            c = jy.this;
            a = jx1;
            b = jw1;
            super();
        }
    }

}
