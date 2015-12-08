// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            u, c

private final class c
    implements c
{

    public final int a;
    public final c b;
    public final onResult c;
    final u d;

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        u.e(d).post(new <init>(d, a, connectionresult));
    }

    public onResult(u u1, int i, c c1, onResult onresult)
    {
        d = u1;
        super();
        a = i;
        b = c1;
        c = onresult;
        c1.a(this);
    }
}
