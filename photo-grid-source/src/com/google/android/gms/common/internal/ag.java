// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;

// Referenced classes of package com.google.android.gms.common.internal:
//            aa

public final class ag
    implements o
{

    final aa a;

    public ag(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void a(ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            a.zza(null, aa.d(a));
        } else
        if (aa.e(a) != null)
        {
            aa.e(a).onConnectionFailed(connectionresult);
            return;
        }
    }

    public final void b(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
}
