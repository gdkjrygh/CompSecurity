// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, bg, ao, x

final class nit> extends aw
{

    final Uri b;
    final bg c;

    protected final g a(Status status)
    {
        return new <init>(status, null);
    }

    protected final void a(com.google.android.gms.common.api._cls2 _pcls2)
        throws RemoteException
    {
        _pcls2 = (ao)_pcls2;
        Uri uri = b;
        ((x)_pcls2.n()).a(new <init>(this), uri);
    }

    (bg bg1, c c1, Uri uri)
    {
        c = bg1;
        b = uri;
        super(c1);
    }
}
