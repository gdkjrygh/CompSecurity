// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            ia

class <init> extends <init>
{

    final int Ks;
    final ia Uv;
    final String Uw;
    final Uri Ux;
    final String Uy;
    final String Uz;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        e1.a(this, Ks, Uw, Ux, Uy, Uz);
    }

    e(ia ia1, int i, String s, Uri uri, String s1, String s2)
    {
        Uv = ia1;
        Ks = i;
        Uw = s;
        Ux = uri;
        Uy = s1;
        Uz = s2;
        super(null);
    }
}
