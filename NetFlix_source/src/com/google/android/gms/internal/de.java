// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            dw, dz, bb, dn

public final class de
{

    private dz lC;
    private final Object li = new Object();
    private int oS;
    private String pI;
    private String pJ;
    public final bb pK = new bb() {

        final de pM;

        public void b(dz dz, Map map)
        {
            synchronized (de.a(pM))
            {
                String s1 = (String)map.get("type");
                map = (String)map.get("errors");
                dw.z((new StringBuilder()).append("Invalid ").append(s1).append(" request error: ").append(map).toString());
                de.a(pM, 1);
                de.a(pM).notify();
            }
            return;
            map;
            dz;
            JVM INSTR monitorexit ;
            throw map;
        }

            
            {
                pM = de.this;
                super();
            }
    };
    public final bb pL = new bb() {

        final de pM;

        public void b(dz dz1, Map map)
        {
            Object obj = de.a(pM);
            obj;
            JVM INSTR monitorenter ;
            String s2 = (String)map.get("url");
            if (s2 != null)
            {
                break MISSING_BLOCK_LABEL_39;
            }
            dw.z("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            String s1 = s2;
            if (s2.contains("%40mediation_adapters%40"))
            {
                s1 = s2.replaceAll("%40mediation_adapters%40", dn.b(dz1.getContext(), (String)map.get("check_adapters"), de.b(pM)));
                dw.y((new StringBuilder()).append("Ad request URL modified to ").append(s1).toString());
            }
            de.a(pM, s1);
            de.a(pM).notify();
            obj;
            JVM INSTR monitorexit ;
            return;
            dz1;
            obj;
            JVM INSTR monitorexit ;
            throw dz1;
        }

            
            {
                pM = de.this;
                super();
            }
    };

    public de(String s)
    {
        oS = -2;
        pI = s;
    }

    static int a(de de1, int i)
    {
        de1.oS = i;
        return i;
    }

    static Object a(de de1)
    {
        return de1.li;
    }

    static String a(de de1, String s)
    {
        de1.pJ = s;
        return s;
    }

    static String b(de de1)
    {
        return de1.pI;
    }

    public void b(dz dz)
    {
        synchronized (li)
        {
            lC = dz;
        }
        return;
        dz;
        obj;
        JVM INSTR monitorexit ;
        throw dz;
    }

    public String bj()
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
_L1:
        int i;
        if (pJ != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = oS;
        if (i != -2)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        li.wait();
          goto _L1
        Object obj1;
        obj1;
        dw.z("Ad request service was interrupted.");
        obj;
        JVM INSTR monitorexit ;
        return null;
        String s = pJ;
        obj;
        JVM INSTR monitorexit ;
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public int getErrorCode()
    {
        int i;
        synchronized (li)
        {
            i = oS;
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
