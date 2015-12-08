// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.f;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ay, aa, ap, y

final class nit> extends ay
{

    final String c;
    final String d;
    final byte e[] = null;
    final aa f;

    protected final void b(com.google.android.gms.common.api._cls1 _pcls1)
        throws RemoteException
    {
        _pcls1 = (ap)_pcls1;
        String s = c;
        String s1 = d;
        byte abyte0[] = e;
        ((y)_pcls1.m()).a(new <init>(this), s, s1, abyte0);
    }

    protected final f c(Status status)
    {
        return new <init>(status, -1);
    }

    (aa aa1, c c1, String s, String s1)
    {
        f = aa1;
        c = s;
        d = s1;
        super(c1);
    }
}
