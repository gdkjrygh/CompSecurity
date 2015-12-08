// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cn, cq, ai

public final class cb
{

    private final Object eJ = new Object();
    private cq fG;
    private String gT;
    public final ai gU = new ai() {

        final cb gW;

        public void a(cq cq, Map map)
        {
            synchronized (cb.a(gW))
            {
                String s = (String)map.get("type");
                map = (String)map.get("errors");
                cn.q((new StringBuilder()).append("Invalid ").append(s).append(" request error: ").append(map).toString());
                cb.a(gW, 1);
                cb.a(gW).notify();
            }
            return;
            map;
            cq;
            JVM INSTR monitorexit ;
            throw map;
        }

            
            {
                gW = cb.this;
                super();
            }
    };
    public final ai gV = new ai() {

        final cb gW;

        public void a(cq cq, Map map)
        {
            cq = ((cq) (cb.a(gW)));
            cq;
            JVM INSTR monitorenter ;
            map = (String)map.get("url");
            if (map != null)
            {
                break MISSING_BLOCK_LABEL_34;
            }
            cn.q("URL missing in loadAdUrl GMSG.");
            cq;
            JVM INSTR monitorexit ;
            return;
            cb.a(gW, map);
            cb.a(gW).notify();
            cq;
            JVM INSTR monitorexit ;
            return;
            map;
            cq;
            JVM INSTR monitorexit ;
            throw map;
        }

            
            {
                gW = cb.this;
                super();
            }
    };
    private int gw;

    public cb()
    {
        gw = -2;
    }

    static int a(cb cb1, int i)
    {
        cb1.gw = i;
        return i;
    }

    static Object a(cb cb1)
    {
        return cb1.eJ;
    }

    static String a(cb cb1, String s)
    {
        cb1.gT = s;
        return s;
    }

    public String aj()
    {
        Object obj = eJ;
        obj;
        JVM INSTR monitorenter ;
_L1:
        int i;
        if (gT != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = gw;
        if (i != -2)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        eJ.wait();
          goto _L1
        Object obj1;
        obj1;
        cn.q("Ad request service was interrupted.");
        obj;
        JVM INSTR monitorexit ;
        return null;
        String s = gT;
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void b(cq cq)
    {
        synchronized (eJ)
        {
            fG = cq;
        }
        return;
        cq;
        obj;
        JVM INSTR monitorexit ;
        throw cq;
    }

    public int getErrorCode()
    {
        int i;
        synchronized (eJ)
        {
            i = gw;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
