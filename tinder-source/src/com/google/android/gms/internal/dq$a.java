// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.c;

// Referenced classes of package com.google.android.gms.internal:
//            dq

private final class 
    implements com.google.android.gms.common.api.lt
{

    public final int a;
    public final c b;
    public final com.google.android.gms.common.api.nResult c;
    final dq d;

    public final void a(ConnectionResult connectionresult)
    {
        dq.e(d).post(new <init>(d, a, connectionresult));
    }

    public (dq dq1, int i, c c1, com.google.android.gms.common.api.lt lt)
    {
        d = dq1;
        super();
        a = i;
        b = c1;
        c = lt;
        c1.a(this);
    }
}
