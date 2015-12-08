// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ang.Object
    implements cdi
{

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

    (cih cih1)
    {
        a = cih1;
        super();
    }
}
