// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import java.util.Map;
import java.util.Set;
import kik.a.d.a.d;

// Referenced classes of package com.kik.l:
//            z, ae

final class ai
    implements y.a
{

    final Map a;
    final Set b;
    final ae c;

    ai(ae ae, Map map, Set set)
    {
        c = ae;
        a = map;
        b = set;
        super();
    }

    public final void a(Object obj)
    {
        Object obj1 = (z)obj;
        obj = (d)a.get(Integer.valueOf(((z) (obj1)).d("_id")));
        if (obj != null)
        {
            ((d) (obj)).a(((z) (obj1)).d("_id"));
            ((d) (obj)).c(((z) (obj1)).c("body"));
            ((d) (obj)).a(((z) (obj1)).c("friend_attribute_type"));
            ((d) (obj)).b(((z) (obj1)).c("referrer_jid"));
            ((d) (obj)).a(((z) (obj1)).a("reply"));
            ((d) (obj)).a(((z) (obj1)).e("timestamp"));
        }
        obj1 = ((z) (obj1)).c("referrer_jid");
        if (b.contains(obj1))
        {
            ((d) (obj)).c();
            return;
        } else
        {
            b.add(obj1);
            return;
        }
    }
}
