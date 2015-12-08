// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.android.a;
import com.kik.d.f;
import com.kik.g.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment, bf

final class ac extends r
{

    final String a;
    final CardsWebViewFragment b;

    ac(CardsWebViewFragment cardswebviewfragment, String s)
    {
        b = cardswebviewfragment;
        a = s;
        super();
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((List) (obj)).iterator();
_L5:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L3
_L3:
        kik.a.i.h.a a1 = (kik.a.i.h.a)((Iterator) (obj)).next();
        if (a1 == null || a1.b() == null || !a1.b().equals(a)) goto _L5; else goto _L4
_L4:
        boolean flag = false;
_L7:
        obj = new HashMap();
        HashMap hashmap = new HashMap();
        hashmap.put("t", Long.valueOf(0L));
        ((Map) (obj)).put("url", a);
        b b1;
        long l;
        if (flag)
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        hashmap.put("fl", Long.valueOf(l));
        l = j.b();
        b1 = KikApplication.i();
        if (b1 != null)
        {
            b1.c().a(com.kik.d.b.a.k.p, ((Map) (obj)), null, hashmap, Long.valueOf(l).longValue());
        }
        if (b.c != null)
        {
            b.c.b("Browser Page Loaded").a("URL", a).a("Domain", bf.i(a)).b();
        }
        return;
_L2:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
