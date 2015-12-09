// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class biz extends bsc
{

    public biz(Context context, Looper looper, bqw bqw, bqx bqx)
    {
        super(context, looper, 8, (new bqv(context)).a(), bqw, bqx);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return bjf.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected final String b()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final bje g_()
    {
        return (bje)super.p();
    }
}
