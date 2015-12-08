// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            gj, jx, gu, cd, 
//            fu, gr, ge

public final class fs
{

    private final Object mH = new Object();
    gu mo;
    private String uE;
    private gj uF;
    public final cd uG = new cd() {

        final fs uI;

        public void a(gu gu1, Map map)
        {
label0:
            {
                synchronized (fs.a(uI))
                {
                    if (!fs.b(uI).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            map = new fu(1, map);
            gr.W((new StringBuilder()).append("Invalid ").append(map.getType()).append(" request error: ").append(map.cT()).toString());
            fs.b(uI).a(map);
            gu1;
            JVM INSTR monitorexit ;
            return;
            map;
            gu1;
            JVM INSTR monitorexit ;
            throw map;
        }

            
            {
                uI = fs.this;
                super();
            }
    };
    public final cd uH = new cd() {

        final fs uI;

        public void a(gu gu1, Map map)
        {
label0:
            {
                synchronized (fs.a(uI))
                {
                    if (!fs.b(uI).isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            fu fu1;
            String s1;
            fu1 = new fu(-2, map);
            s1 = fu1.getUrl();
            if (s1 != null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            gr.W("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            gu1;
            obj;
            JVM INSTR monitorexit ;
            throw gu1;
            if (s1.contains("%40mediation_adapters%40"))
            {
                gu1 = s1.replaceAll("%40mediation_adapters%40", ge.a(gu1.getContext(), (String)map.get("check_adapters"), fs.c(uI)));
                fu1.setUrl(gu1);
                gr.V((new StringBuilder()).append("Ad request URL modified to ").append(gu1).toString());
            }
            fs.b(uI).a(fu1);
            obj;
            JVM INSTR monitorexit ;
        }

            
            {
                uI = fs.this;
                super();
            }
    };

    public fs(String s)
    {
        uF = new gj();
        uE = s;
    }

    static Object a(fs fs1)
    {
        return fs1.mH;
    }

    static gj b(fs fs1)
    {
        return fs1.uF;
    }

    static String c(fs fs1)
    {
        return fs1.uE;
    }

    public void b(gu gu1)
    {
        jx.aU("setAdWebView must be called on the main thread.");
        mo = gu1;
    }

    public Future cR()
    {
        return uF;
    }

    public void cS()
    {
        jx.aU("destroyAdWebView must be called on the main thread.");
        if (mo != null)
        {
            mo.destroy();
            mo = null;
        }
    }
}
