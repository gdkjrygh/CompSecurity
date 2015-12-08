// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import com.kik.g.p;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.kik.android.c:
//            l, d

final class r extends com.kik.g.r
{

    final p a;
    final l b;

    r(l l1, p p1)
    {
        b = l1;
        a = p1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Map)obj;
        l.a(b).a(new ArrayList(((Map) (obj)).values()));
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }
}
