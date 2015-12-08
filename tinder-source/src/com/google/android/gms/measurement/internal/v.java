// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.j;

public final class v extends j
{

    public v(Context context, Looper looper, g g, com.google.android.gms.common.api.c.b b, com.google.android.gms.common.api.c.c c)
    {
        super(context, looper, 93, g, b, c);
    }

    public final IInterface a(IBinder ibinder)
    {
        return t.a.a(ibinder);
    }

    protected final String e()
    {
        return "com.google.android.gms.measurement.START";
    }

    protected final String f()
    {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
