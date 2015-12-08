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
//            kg, kd, kf

class ult extends ult
{

    final Uri abh;
    final Bundle abi;

    protected void a(Context context, kf kf)
        throws RemoteException
    {
        kg.b(context, kf, new <init>(this), abh, abi);
    }

    protected com.google.android.gms.panorama.amaApi.a aj(Status status)
    {
        return new kd(status, null, 0);
    }

    protected Result c(Status status)
    {
        return aj(status);
    }
}
