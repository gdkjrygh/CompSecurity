// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import com.kik.cards.web.ax;
import com.kik.g.i;
import org.c.b;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.plugin:
//            h, f

private final class a extends i
{

    final String a;
    final h b;

    public final void a(f f1)
    {
        if (h.a(b) != null)
        {
            h.e().a("Firing event: {}", f1.b());
            h.a(b).a(a, new String[] {
                f1.b(), f1.a().toString()
            });
            return;
        } else
        {
            h.e().c("Error firing event {}, no invoker", f1.b());
            return;
        }
    }

    public final volatile void a(Object obj, Object obj1)
    {
        a((f)obj1);
    }

    public (h h1, String s)
    {
        b = h1;
        super();
        a = s;
    }
}
