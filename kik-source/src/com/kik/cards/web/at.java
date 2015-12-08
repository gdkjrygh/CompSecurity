// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kik.android.f.a.ae;

// Referenced classes of package com.kik.cards.web:
//            aq

final class at
    implements ValueCallback
{

    final WebStorage a;
    final aq b;

    at(aq aq1, WebStorage webstorage)
    {
        b = aq1;
        a = webstorage;
        super();
    }

    public final void onReceiveValue(Object obj)
    {
        obj = (Map)obj;
        if (obj != null)
        {
            aq.a(b, new ArrayList(((Map) (obj)).keySet()));
            aq.c(b).removeAll(aq.p().keySet());
            aq.c(b).addAll(aq.p().keySet());
            aq.b(b, ae.a(aq.d(b)));
            obj = (String)aq.c(b).get(0);
            a.getUsageForOrigin(((String) (obj)), b.b);
        }
    }
}
