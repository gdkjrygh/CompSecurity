// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.common.internal:
//            j, g

public final class b extends j
{

    private final com.google.android.gms.common.api.a.d e;

    public b(Context context, Looper looper, int i, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c, g g, com.google.android.gms.common.api.a.d d)
    {
        super(context, looper, i, g, b1, c);
        e = d;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return e.c();
    }

    protected final String e()
    {
        return e.a();
    }

    protected final String f()
    {
        return e.b();
    }
}
