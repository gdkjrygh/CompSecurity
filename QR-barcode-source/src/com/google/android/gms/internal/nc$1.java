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
//            nc, mz, nb

class ult extends ult
{

    final Uri aky;
    final Bundle akz;

    protected void a(Context context, nb nb)
        throws RemoteException
    {
        nc.b(context, nb, new <init>(this), aky, akz);
    }

    protected com.google.android.gms.panorama.amaApi.a ay(Status status)
    {
        return new mz(status, null, 0);
    }

    protected Result c(Status status)
    {
        return ay(status);
    }
}
