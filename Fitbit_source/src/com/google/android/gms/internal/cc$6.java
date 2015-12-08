// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;

// Referenced classes of package com.google.android.gms.internal:
//            cc, ch

class <init> extends <init>
{

    final PendingIntent b;
    final cc c;

    protected void a(ch ch1)
        throws RemoteException
    {
        ch1.b(b);
        a(((com.google.android.gms.common.api.k) (Status.a)));
    }

    protected void b(com.google.android.gms.common.api.s.a a1)
        throws RemoteException
    {
        a((ch)a1);
    }

    (cc cc1, h h, PendingIntent pendingintent)
    {
        c = cc1;
        b = pendingintent;
        super(h);
    }
}
