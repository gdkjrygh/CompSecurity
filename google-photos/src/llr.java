// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

final class llr extends kbo
{

    public llr(Context context, Looper looper, jyq jyq, jys jys, kax kax)
    {
        super(context, looper, 49, kax, jyq, jys);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return llp.a(ibinder);
    }

    protected final String c()
    {
        return "com.google.android.gms.nearby.sharing.service.NearbySharingService.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.nearby.sharing.internal.INearbySharingService";
    }
}
