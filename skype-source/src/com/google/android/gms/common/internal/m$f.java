// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            m

protected final class a
    implements com.google.android.gms.common.api..m.f
{

    final m a;

    public final void a(ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            a.a(null, m.d(a));
        } else
        if (m.e(a) != null)
        {
            m.e(a).onConnectionFailed(connectionresult);
            return;
        }
    }

    public final void b(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }

    public ult(m m1)
    {
        a = m1;
        super();
    }
}
