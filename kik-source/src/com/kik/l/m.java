// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import java.util.Hashtable;
import kik.a.d.k;

// Referenced classes of package com.kik.l:
//            e, l

final class m
    implements y.a
{

    final boolean a;
    final Hashtable b;
    final l c;

    m(l l, boolean flag, Hashtable hashtable)
    {
        c = l;
        a = flag;
        b = hashtable;
        super();
    }

    public final void a(Object obj)
    {
        obj = (e)obj;
        k k1 = ((e) (obj)).a();
        if (!a || ((e) (obj)).a("is_group"))
        {
            b.put(k1.b(), k1);
        }
    }
}
