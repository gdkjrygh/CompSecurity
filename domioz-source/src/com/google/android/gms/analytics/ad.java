// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.analytics:
//            ac

final class ad
    implements Callable
{

    final ac a;

    ad(ac ac1)
    {
        a = ac1;
        super();
    }

    public final Object call()
    {
        return a.a();
    }
}
