// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ang.Object
    implements cdi
{

    private cih a;

    public final void a(ckw ckw1, Map map)
    {
label0:
        {
            synchronized (a.a)
            {
                if (!a.d.isDone())
                {
                    break label0;
                }
            }
            return;
        }
        cij cij1;
        cij1 = new cij(-2, map);
        if (a.b.equals(cij1.e))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        bka.e((new StringBuilder()).append(cij1.e).append(" ==== ").append(a.b).toString());
        obj;
        JVM INSTR monitorexit ;
        return;
        ckw1;
        obj;
        JVM INSTR monitorexit ;
        throw ckw1;
        String s = cij1.f;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        bka.e("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            ckw1 = s.replaceAll("%40mediation_adapters%40", cjb.a(ckw1.getContext(), (String)map.get("check_adapters"), a.c));
            cij1.f = ckw1;
            bka.d((new StringBuilder("Ad request URL modified to ")).append(ckw1).toString());
        }
        a.d.b(cij1);
        obj;
        JVM INSTR monitorexit ;
    }

    (cih cih1)
    {
        a = cih1;
        super();
    }
}
