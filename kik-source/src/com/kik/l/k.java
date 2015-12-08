// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import com.android.volley.b;
import com.android.volley.p;
import com.kik.cache.ad;
import com.kik.g.i;

// Referenced classes of package com.kik.l:
//            f

final class k extends i
{

    final f a;

    k(f f1)
    {
        a = f1;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        if (((Integer)obj1).intValue() < 58)
        {
            f.e(a).c().c().b("myPicVolleyDiskKey");
            f.e(a).c().c().b("myPicVolleyDiskKey#FULLSIZE");
        }
    }
}
