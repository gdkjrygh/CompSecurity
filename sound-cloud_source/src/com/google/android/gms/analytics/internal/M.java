// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.b.aj;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            s, v, L

final class M
    implements Callable
{

    final L a;

    M(L l)
    {
        a = l;
        super();
    }

    public final Object call()
        throws Exception
    {
        L l = a;
        String s2 = l.a(((s) (l)).i.b().a);
        String s1 = s2;
        if (s2 == null)
        {
            s1 = l.d();
        }
        return s1;
    }
}
