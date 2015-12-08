// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            as

final class at
    implements Callable
{

    final as a;

    at(as as1)
    {
        a = as1;
        super();
    }

    public final Object call()
    {
        return a.d();
    }
}
