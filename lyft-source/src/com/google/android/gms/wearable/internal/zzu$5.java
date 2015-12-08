// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzu, zzbk

class nt extends zzf
{

    final Uri b;
    final int c;
    final zzu d;

    protected void a(zzbk zzbk1)
    {
        zzbk1.a(this, b, c);
    }

    protected Result b(Status status)
    {
        return d(status);
    }

    protected void b(com.google.android.gms.common.api.ient ient)
    {
        a((zzbk)ient);
    }

    protected com.google.android.gms.wearable.i.DeleteDataItemsResult d(Status status)
    {
        return new c(status, 0);
    }

    nt(zzu zzu1, GoogleApiClient googleapiclient, Uri uri, int i)
    {
        d = zzu1;
        b = uri;
        c = i;
        super(googleapiclient);
    }
}
