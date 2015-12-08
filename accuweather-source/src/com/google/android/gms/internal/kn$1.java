// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            kn

class <init> extends <init>
{

    final String acc;
    final int acj;
    final kn ack;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        a(e1.a(this, acj, acc));
    }

    e(kn kn1, int i, String s)
    {
        ack = kn1;
        acj = i;
        acc = s;
        super(null);
    }
}
