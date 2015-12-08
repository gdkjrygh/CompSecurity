// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

public final class kbu
    implements jyr
{

    private kbo a;

    public kbu(kbo kbo1)
    {
        a = kbo1;
        super();
    }

    public final void a(ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            a.a(null, kbo.d(a));
        } else
        if (kbo.e(a) != null)
        {
            kbo.e(a).a(connectionresult);
            return;
        }
    }

    public final void b(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
}
