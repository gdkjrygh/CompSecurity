// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.common.internal:
//            m, i

public final class c extends m
{

    private final com.google.android.gms.common.api.a.d a;

    public c(Context context, Looper looper, int i, com.google.android.gms.common.api.b b1, com.google.android.gms.common.api.c c1, i j, com.google.android.gms.common.api.a.d d)
    {
        super(context, looper, i, j, b1, c1);
        a = d;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return a.c();
    }

    protected final String a()
    {
        return a.a();
    }

    protected final String b()
    {
        return a.b();
    }
}
