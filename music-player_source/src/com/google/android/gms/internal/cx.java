// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            fr, dd, gk, dc, 
//            fv

public final class cx extends fr
{

    private final int d;

    public cx(Context context, c c1, d d1, int i)
    {
        super(context, c1, d1, new String[0]);
        d = i;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return dd.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected final void a(gk gk1, fv fv)
    {
        Bundle bundle = new Bundle();
        gk1.g(fv, d, h().getPackageName(), bundle);
    }

    protected final String b()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final dc c()
    {
        return (dc)super.i();
    }
}
