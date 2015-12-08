// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class kqq extends kbo
{

    public kqq(Context context, Looper looper, kax kax, jyq jyq, jys jys)
    {
        super(context, looper, 50, kax, jyq, jys);
    }

    public final IInterface a(IBinder ibinder)
    {
        return kqo.a(ibinder);
    }

    protected final String c()
    {
        return "com.google.android.gms.herrevad.services.LightweightNetworkQualityAndroidService.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService";
    }
}
