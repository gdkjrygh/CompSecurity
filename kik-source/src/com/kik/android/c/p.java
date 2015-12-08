// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import com.kik.g.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.kik.android.c:
//            a, l, d

final class p extends r
{

    final l a;

    p(l l1)
    {
        a = l1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Map)obj;
        super.a(obj);
        a a1;
        for (obj = (new ArrayList(((Map) (obj)).values())).iterator(); ((Iterator) (obj)).hasNext(); l.a(a).a(a1))
        {
            a1 = (a)((Iterator) (obj)).next();
        }

    }
}
