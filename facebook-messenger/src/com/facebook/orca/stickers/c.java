// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import com.facebook.common.time.a;
import com.facebook.fbservice.c.b;
import com.facebook.orca.server.FetchStickerPacksResult;
import com.facebook.orca.server.v;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerPack, d

public class c
{

    private static final Class a = com/facebook/orca/stickers/c;
    private a b;
    private List c;
    private FetchStickerPacksResult d;
    private FetchStickerPacksResult e;

    c(a a1)
    {
        b = a1;
    }

    private FetchStickerPacksResult a(FetchStickerPacksResult fetchstickerpacksresult)
    {
        d = fetchstickerpacksresult;
        return d;
    }

    private es a(es es1)
    {
        et et1 = new et();
        es1 = es1.iterator();
        do
        {
            if (!es1.hasNext())
            {
                break;
            }
            StickerPack stickerpack = (StickerPack)es1.next();
            if (stickerpack.g() == 0)
            {
                et1.b(stickerpack);
            }
        } while (true);
        return et1.b();
    }

    private FetchStickerPacksResult b(FetchStickerPacksResult fetchstickerpacksresult)
    {
        es es1 = a(fetchstickerpacksresult.a());
        e = new FetchStickerPacksResult(fetchstickerpacksresult.e(), es1, fetchstickerpacksresult.f());
        return e;
    }

    private b c(FetchStickerPacksResult fetchstickerpacksresult)
    {
        if (b.a() - fetchstickerpacksresult.f() <= 0x5265c00L)
        {
            return b.FROM_CACHE_UP_TO_DATE;
        } else
        {
            return b.FROM_CACHE_STALE;
        }
    }

    FetchStickerPacksResult a(v v1)
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.orca.stickers.d.a[v1.ordinal()];
        JVM INSTR tableswitch 1 2: default 128
    //                   1 64
    //                   2 96;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown sticker pack type ").append(v1).toString());
        v1;
        this;
        JVM INSTR monitorexit ;
        throw v1;
_L2:
        v1 = d;
_L6:
        if (v1 != null) goto _L5; else goto _L4
_L4:
        v1 = es.d();
        v1 = new FetchStickerPacksResult(b.NO_DATA, v1, -1L);
_L7:
        this;
        JVM INSTR monitorexit ;
        return v1;
_L3:
        v1 = e;
          goto _L6
_L5:
        v1 = new FetchStickerPacksResult(c(v1), v1.a(), v1.f());
          goto _L7
    }

    FetchStickerPacksResult a(v v1, FetchStickerPacksResult fetchstickerpacksresult)
    {
        this;
        JVM INSTR monitorenter ;
        com.facebook.orca.stickers.d.a[v1.ordinal()];
        JVM INSTR tableswitch 1 2: default 83
    //                   1 64
    //                   2 74;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown sticker pack type ").append(v1).toString());
        v1;
        this;
        JVM INSTR monitorexit ;
        throw v1;
_L2:
        v1 = a(fetchstickerpacksresult);
_L4:
        this;
        JVM INSTR monitorexit ;
        return v1;
_L3:
        v1 = b(fetchstickerpacksresult);
          goto _L4
    }

    List a()
    {
        this;
        JVM INSTR monitorenter ;
        List list = c;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        c = list;
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        c = null;
        d = null;
        e = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
