// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            ff

final class qW extends qW
{

    public final ConnectionResult qV;
    public final Intent qW;
    final ff qX;
    public final int type;

    protected void a(com.google.android.gms.panorama.amaClient.a a1)
    {
        if (a1 != null)
        {
            a1.a(qV, type, qW);
        }
    }

    protected volatile void a(Object obj)
    {
        a((com.google.android.gms.panorama.amaClient.a)obj);
    }

    protected void aF()
    {
    }

    public ionResult(ff ff1, com.google.android.gms.panorama.amaClient.a a1, ConnectionResult connectionresult, int i, Intent intent)
    {
        qX = ff1;
        super(ff1, a1);
        qV = connectionresult;
        type = i;
        qW = intent;
    }
}
