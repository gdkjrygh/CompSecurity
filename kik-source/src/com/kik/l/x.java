// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import java.util.Hashtable;
import kik.a.d.g;

// Referenced classes of package com.kik.l:
//            v, w

final class x
    implements y.a
{

    final Hashtable a;
    final w b;

    x(w w, Hashtable hashtable)
    {
        b = w;
        a = hashtable;
        super();
    }

    public final void a(Object obj)
    {
        v v1 = (v)obj;
        if (v1 != null)
        {
            obj = null;
            if (!v1.isAfterLast())
            {
                obj = new g(v1.c("jid"), v1.a("is_muted"), v1.e("unmute_timestamp"), v1.a("is_dirty"));
            }
            a.put(((g) (obj)).a(), obj);
        }
    }
}
