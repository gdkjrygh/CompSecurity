// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, fs, gj, fu, 
//            gr, gu, ge

class uI
    implements cd
{

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
        String s;
        fu1 = new fu(-2, map);
        s = fu1.getUrl();
        if (s != null)
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
        if (s.contains("%40mediation_adapters%40"))
        {
            gu1 = s.replaceAll("%40mediation_adapters%40", ge.a(gu1.getContext(), (String)map.get("check_adapters"), fs.c(uI)));
            fu1.setUrl(gu1);
            gr.V((new StringBuilder()).append("Ad request URL modified to ").append(gu1).toString());
        }
        fs.b(uI).a(fu1);
        obj;
        JVM INSTR monitorexit ;
    }

    (fs fs1)
    {
        uI = fs1;
        super();
    }
}
