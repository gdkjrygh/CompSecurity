// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.m;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            j

public final class e extends m
{

    final int a;

    public e(Context context, Looper looper, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1, int i)
    {
        super(context, looper, 8, (new com.google.android.gms.common.api.c.a(context)).a(), b1, c1);
        a = i;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return j.a.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected final String b()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final j c()
        throws DeadObjectException
    {
        return (j)super.n();
    }
}
