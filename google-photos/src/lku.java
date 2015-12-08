// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

final class lku extends kbo
{

    lku(Context context, Looper looper, jyq jyq, jys jys, kax kax, im im)
    {
        super(context, looper, 62, kax, jyq, jys);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return lkq.a(ibinder);
    }

    protected final String c()
    {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }
}
