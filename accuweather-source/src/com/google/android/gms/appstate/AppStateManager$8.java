// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.os.RemoteException;
import com.google.android.gms.internal.gb;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateManager

static final class <init> extends <init>
{

    final int yH;
    final String yK;
    final byte yL[];

    protected volatile void a(com.google.android.gms.common.api.nit> nit>)
        throws RemoteException
    {
        a((gb)nit>);
    }

    protected void a(gb gb1)
    {
        gb1.a(this, yH, yK, yL);
    }

    (int i, String s, byte abyte0[])
    {
        yH = i;
        yK = s;
        yL = abyte0;
        super(null);
    }
}
