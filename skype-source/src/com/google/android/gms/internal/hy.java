// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.m;

public final class hy extends m
{

    public hy(Context context, Looper looper, i i, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c)
    {
        super(context, looper, 19, i, b1, c);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return hv.a.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected final String b()
    {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }
}
