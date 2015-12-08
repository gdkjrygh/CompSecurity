// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class lej extends kbo
{

    public lej(Context context, Looper looper, kax kax1, jyq jyq, jys jys)
    {
        super(context, looper, 31, kax1, jyq, jys);
        kax1.a();
    }

    protected final IInterface a(IBinder ibinder)
    {
        return leo.a(ibinder);
    }

    protected final String c()
    {
        return "com.google.android.gms.photos.autobackup.service.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.photos.autobackup.internal.IAutoBackupService";
    }

    public final boolean p()
    {
        return true;
    }
}
