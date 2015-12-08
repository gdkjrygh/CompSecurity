// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            fz, fv, fs

class <init> extends <init>
{

    final String yt;
    final fs yu[];
    final fz yv;

    protected void a(fv fv1)
        throws RemoteException
    {
        fv1.a(new <init>(this), yt, yu);
    }

    (fz fz1, String s, fs afs[])
    {
        yv = fz1;
        yt = s;
        yu = afs;
        super(null);
    }
}
