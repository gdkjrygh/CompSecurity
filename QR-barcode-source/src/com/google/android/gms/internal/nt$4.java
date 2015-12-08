// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.plus.internal.e;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.internal:
//            nt

class <init> extends <init>
{

    final nt alX;
    final Collection alY;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        e1.a(this, alY);
    }

    e(nt nt1, Collection collection)
    {
        alX = nt1;
        alY = collection;
        super(null);
    }
}
