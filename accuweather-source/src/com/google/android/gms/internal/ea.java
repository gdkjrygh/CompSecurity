// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ev, ey, bd, ec, 
//            em

public final class ea
{

    private ey lL;
    private final Object lq = new Object();
    private int pH;
    public final bd qA = new bd() {

        final ea qC;

        public void b(ey ey, Map map)
        {
            synchronized (ea.a(qC))
            {
                map = new ec(map);
                ev.D((new StringBuilder()).append("Invalid ").append(map.getType()).append(" request error: ").append(map.bt()).toString());
                ea.a(qC, 1);
                ea.a(qC).notify();
            }
            return;
            map;
            ey;
            JVM INSTR monitorexit ;
            throw map;
        }

            
            {
                qC = ea.this;
                super();
            }
    };
    public final bd qB = new bd() {

        final ea qC;

        public void b(ey ey1, Map map)
        {
            Object obj = ea.a(qC);
            obj;
            JVM INSTR monitorenter ;
            ec ec1;
            String s1;
            ec1 = new ec(map);
            s1 = ec1.getUrl();
            if (s1 != null)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            ev.D("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            if (s1.contains("%40mediation_adapters%40"))
            {
                ey1 = s1.replaceAll("%40mediation_adapters%40", em.a(ey1.getContext(), (String)map.get("check_adapters"), ea.b(qC)));
                ev.C((new StringBuilder()).append("Ad request URL modified to ").append(ey1).toString());
            }
            ea.a(qC, ec1);
            ea.a(qC).notify();
            obj;
            JVM INSTR monitorexit ;
            return;
            ey1;
            obj;
            JVM INSTR monitorexit ;
            throw ey1;
        }

            
            {
                qC = ea.this;
                super();
            }
    };
    private String qy;
    private ec qz;

    public ea(String s)
    {
        pH = -2;
        qy = s;
    }

    static int a(ea ea1, int i)
    {
        ea1.pH = i;
        return i;
    }

    static ec a(ea ea1, ec ec)
    {
        ea1.qz = ec;
        return ec;
    }

    static Object a(ea ea1)
    {
        return ea1.lq;
    }

    static String b(ea ea1)
    {
        return ea1.qy;
    }

    public void b(ey ey)
    {
        synchronized (lq)
        {
            lL = ey;
        }
        return;
        ey;
        obj;
        JVM INSTR monitorexit ;
        throw ey;
    }

    public ec bs()
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
_L1:
        int i;
        if (qz != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = pH;
        if (i != -2)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        lq.wait();
          goto _L1
        Object obj1;
        obj1;
        ev.D("Ad request service was interrupted.");
        obj;
        JVM INSTR monitorexit ;
        return null;
        ec ec = qz;
        obj;
        JVM INSTR monitorexit ;
        return ec;
        ec;
        obj;
        JVM INSTR monitorexit ;
        throw ec;
    }

    public int getErrorCode()
    {
        int i;
        synchronized (lq)
        {
            i = pH;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
