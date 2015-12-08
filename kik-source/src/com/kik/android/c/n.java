// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import com.kik.g.as;
import com.kik.n.a.j.a;

// Referenced classes of package com.kik.android.c:
//            a, l

final class n
    implements as
{

    final l a;

    n(l l)
    {
        a = l;
        super();
    }

    public final Object a(Object obj)
    {
        obj = (a)obj;
        if (obj == null)
        {
            return null;
        } else
        {
            return new com.kik.android.c.a(((a) (obj)).b(), ((a) (obj)).c());
        }
    }
}
