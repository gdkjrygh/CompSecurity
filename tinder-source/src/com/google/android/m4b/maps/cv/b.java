// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cv;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.m4b.maps.j.l;

public final class b extends l
{

    private final String d;

    public b(Context context, Looper looper, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d1, String s)
    {
        super(context, looper, b1, d1);
        d = s;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return com.google.android.m4b.maps.cv.d.a.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.clearcut.service.START";
    }

    protected final String b()
    {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    protected final String c()
    {
        return d;
    }
}
