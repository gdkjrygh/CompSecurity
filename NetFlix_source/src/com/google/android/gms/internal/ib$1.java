// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            ib

class <init> extends <init>
{

    final int UD;
    final ib UE;
    final String Uw;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        a(e1.a(this, UD, Uw));
    }

    e(ib ib1, int i, String s)
    {
        UE = ib1;
        UD = i;
        Uw = s;
        super(null);
    }
}
