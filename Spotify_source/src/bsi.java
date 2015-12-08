// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

public final class bsi
    implements bqz
{

    private bsc a;

    public bsi(bsc bsc1)
    {
        a = bsc1;
        super();
    }

    public final void a(ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            a.a(null, bsc.d(a));
        } else
        if (bsc.e(a) != null)
        {
            bsc.e(a).a(connectionresult);
            return;
        }
    }

    public final void b(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
}
