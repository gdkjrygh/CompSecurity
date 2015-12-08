// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import com.kik.cards.web.ax;
import org.c.b;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.plugin:
//            b, h

private final class <init>
    implements com.kik.cards.web.plugin.b
{

    final h a;

    public final void a(String s, JSONObject jsonobject)
    {
        if (h.a(a) != null)
        {
            h.e().a("async callback: {} method: {}", jsonobject.toString(), s);
            h.a(a).a(s, new String[] {
                jsonobject.toString()
            });
            return;
        } else
        {
            h.e().c("Error firing event {}, no invoker", jsonobject.toString());
            return;
        }
    }

    private (h h1)
    {
        a = h1;
        super();
    }

    a(h h1, byte byte0)
    {
        this(h1);
    }
}
