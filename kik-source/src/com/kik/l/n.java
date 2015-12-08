// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import java.util.Map;

// Referenced classes of package com.kik.l:
//            aa, l

final class n
    implements y.a
{

    final Map a;
    final l b;

    n(l l, Map map)
    {
        b = l;
        a = map;
        super();
    }

    public final void a(Object obj)
    {
        aa aa1 = (aa)obj;
        String s = aa1.c("group_id");
        kik.a.d.a a1 = (kik.a.d.a)a.get(s);
        obj = a1;
        if (a1 == null)
        {
            obj = new kik.a.d.a();
        }
        if (aa1.a("is_admin"))
        {
            ((kik.a.d.a) (obj)).b(aa1.c("member_jid"));
        } else
        if (aa1.a("is_banned"))
        {
            ((kik.a.d.a) (obj)).f(aa1.c("member_jid"));
        } else
        {
            ((kik.a.d.a) (obj)).a(aa1.c("member_jid"));
        }
        if (!a.containsKey(s))
        {
            a.put(s, obj);
        }
    }
}
