// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class cih
{

    final Object a = new Object();
    String b;
    String c;
    ckg d;
    ckw e;
    ceh f;
    public final cdi g = new cdi() {

        private cih a;

        public final void a(ckw ckw, Map map)
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
            if (a.b.equals(map.get("request_id")))
            {
                break MISSING_BLOCK_LABEL_55;
            }
            ckw;
            JVM INSTR monitorexit ;
            return;
            map;
            ckw;
            JVM INSTR monitorexit ;
            throw map;
            map = new cij(1, map);
            bka.e((new StringBuilder("Invalid ")).append(((cij) (map)).c).append(" request error: ").append(((cij) (map)).a).toString());
            a.d.b(map);
            ckw;
            JVM INSTR monitorexit ;
        }

            
            {
                a = cih.this;
                super();
            }
    };
    public final cdi h = new cdi() {

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
            String s2 = cij1.f;
            if (s2 != null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            bka.e("URL missing in loadAdUrl GMSG.");
            obj;
            JVM INSTR monitorexit ;
            return;
            if (s2.contains("%40mediation_adapters%40"))
            {
                ckw1 = s2.replaceAll("%40mediation_adapters%40", cjb.a(ckw1.getContext(), (String)map.get("check_adapters"), a.c));
                cij1.f = ckw1;
                bka.d((new StringBuilder("Ad request URL modified to ")).append(ckw1).toString());
            }
            a.d.b(cij1);
            obj;
            JVM INSTR monitorexit ;
        }

            
            {
                a = cih.this;
                super();
            }
    };

    public cih(String s, String s1)
    {
        d = new ckg();
        c = s1;
        b = s;
    }
}
