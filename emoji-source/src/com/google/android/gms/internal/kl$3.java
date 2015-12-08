// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.moments.Moment;

// Referenced classes of package com.google.android.gms.internal:
//            kl

class <init> extends <init>
{

    final kl ace;
    final Moment acj;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        e1.a(this, acj);
    }

    ents.Moment(kl kl1, Moment moment)
    {
        ace = kl1;
        acj = moment;
        super(null);
    }
}
