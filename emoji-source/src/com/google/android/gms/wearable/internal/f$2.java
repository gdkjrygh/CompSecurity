// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, f, au

class nit> extends d
{

    final Uri abk;
    final f alC;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((au)a1);
    }

    protected void a(au au1)
        throws RemoteException
    {
        au1.a(this, abk);
    }

    protected com.google.android.gms.wearable.Api.DataItemResult aq(Status status)
    {
        return new <init>(status, null);
    }

    protected Result c(Status status)
    {
        return aq(status);
    }

    temResult(f f1, Uri uri)
    {
        alC = f1;
        abk = uri;
        super();
    }
}
