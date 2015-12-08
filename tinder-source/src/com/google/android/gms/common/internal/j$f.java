// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            j

protected final class a
    implements com.google.android.gms.common.api..j.f
{

    final j a;

    public final void a(ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            a.a(null, j.d(a));
        } else
        if (j.e(a) != null)
        {
            j.e(a).a(connectionresult);
            return;
        }
    }

    public final void b(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }

    public ult(j j1)
    {
        a = j1;
        super();
    }
}
