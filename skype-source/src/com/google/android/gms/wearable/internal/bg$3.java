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
    final int c = 0;
    final bg d;

    protected final g a(Status status)
    {
        return new <init>(status, 0);
    }

    protected final void a(com.google.android.gms.common.api._cls3 _pcls3)
        throws RemoteException
    {
        _pcls3 = (ao)_pcls3;
        Uri uri = b;
        int i = c;
        ((x)_pcls3.n()).b(new <init>(this), uri, i);
    }

    (bg bg1, c c1, Uri uri)
    {
        d = bg1;
        b = uri;
        super(c1);
    }
}
