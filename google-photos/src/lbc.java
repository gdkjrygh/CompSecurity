// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;

public final class lbc extends kbo
{

    public lbc(Context context, Looper looper, kax kax, jyq jyq, jys jys)
    {
        super(context, looper, 22, kax, jyq, jys);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return lba.a(ibinder);
    }

    final ReportingState a(Account account)
    {
        n();
        return ((laz)o()).a(account);
    }

    final UploadRequestResult a(UploadRequest uploadrequest)
    {
        n();
        if (uploadrequest.b == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            return ((laz)o()).a(uploadrequest);
        }
    }

    final int b(Account account)
    {
        n();
        return b.q(((laz)o()).b(account));
    }

    protected final String c()
    {
        return "com.google.android.gms.location.reporting.service.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.location.reporting.internal.IReportingService";
    }
}
