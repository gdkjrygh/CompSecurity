// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ab, w

private final class b extends FutureTask
{

    final ab a;
    private final String b;

    protected final void setException(Throwable throwable)
    {
        a.l().a.(b, throwable);
        super.setException(throwable);
    }

    (ab ab1, Runnable runnable, String s)
    {
        a = ab1;
        super(runnable, null);
        u.a(s);
        b = s;
    }
}
