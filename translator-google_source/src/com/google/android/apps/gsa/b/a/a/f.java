// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.b.a.a;

import com.google.android.apps.gsa.shared.io.a;
import com.google.android.apps.gsa.shared.io.c;
import com.google.common.base.d;
import com.google.common.base.p;

// Referenced classes of package com.google.android.apps.gsa.b.a.a:
//            e

final class f
    implements d
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final Object apply(Object obj)
    {
        obj = (a)obj;
        p.a(obj);
        if (((a) (obj)).b == 3)
        {
            a.a.a();
        } else
        if (((a) (obj)).b == 1)
        {
            a.a.b(((a) (obj)).c());
            return obj;
        }
        return obj;
    }
}
