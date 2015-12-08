// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import java.util.HashMap;

// Referenced classes of package com.kik.l:
//            ap, aq

final class ar
    implements y.a
{

    final HashMap a;
    final aq b;

    ar(aq aq, HashMap hashmap)
    {
        b = aq;
        a = hashmap;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (ap)obj;
        obj = ((ap) (obj1)).c("bin_id");
        obj1 = ((ap) (obj1)).a();
        if (obj == null)
        {
            return;
        } else
        {
            a.put(obj, obj1);
            return;
        }
    }
}
