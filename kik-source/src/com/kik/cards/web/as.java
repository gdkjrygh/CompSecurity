// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import java.util.ArrayList;
import kik.android.f.a.ae;

// Referenced classes of package com.kik.cards.web:
//            aq

final class as
    implements ValueCallback
{

    final aq a;

    as(aq aq1)
    {
        a = aq1;
        super();
    }

    public final void onReceiveValue(Object obj)
    {
        obj = (Long)obj;
        WebStorage webstorage;
        long l;
        if (obj == null)
        {
            l = 0L;
        } else
        {
            l = ((Long) (obj)).longValue();
        }
        obj = Long.valueOf(l);
        webstorage = WebStorage.getInstance();
        if (aq.a(a) > aq.b(a) && aq.c(a).size() > 0)
        {
            String s = (String)aq.c(a).remove(0);
            webstorage.deleteOrigin(s);
            aq.a(a, ((Long) (obj)).longValue());
            aq.o();
            (new StringBuilder("Cache size too big, deleted key ")).append(s).append(" with size ").append(obj);
            if (aq.c(a).size() > 0)
            {
                webstorage.getUsageForOrigin((String)aq.c(a).get(0), a.b);
            }
        }
        ae.a(aq.d(a));
        aq.o();
        (new StringBuilder("Old Cache size: ")).append(aq.a(a));
        aq.o();
    }
}
