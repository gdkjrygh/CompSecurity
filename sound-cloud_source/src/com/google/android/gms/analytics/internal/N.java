// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            L

final class N
    implements Callable
{

    final L a;

    N(L l)
    {
        a = l;
        super();
    }

    public final Object call()
        throws Exception
    {
        return a.d();
    }
}
