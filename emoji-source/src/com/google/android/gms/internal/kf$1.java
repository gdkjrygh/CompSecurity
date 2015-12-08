// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            kf, kc, ke

class ult extends ult
{

    final Uri abk;
    final Bundle abl;

    protected void a(Context context, ke ke)
        throws RemoteException
    {
        kf.b(context, ke, new <init>(this), abk, abl);
    }

    protected com.google.android.gms.panorama.amaApi.a aj(Status status)
    {
        return new kc(status, null, 0);
    }

    protected Result c(Status status)
    {
        return aj(status);
    }
}
