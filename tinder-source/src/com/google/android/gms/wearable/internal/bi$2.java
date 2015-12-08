// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.f;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ay, bi, ap, y

final class nit> extends ay
{

    final Uri c;
    final int d = 0;
    final bi e;

    protected final void b(com.google.android.gms.common.api._cls2 _pcls2)
        throws RemoteException
    {
        _pcls2 = (ap)_pcls2;
        Uri uri = c;
        int i = d;
        ((y)_pcls2.m()).b(new <init>(this), uri, i);
    }

    protected final f c(Status status)
    {
        return new <init>(status, 0);
    }

    (bi bi1, c c1, Uri uri)
    {
        e = bi1;
        c = uri;
        super(c1);
    }
}
