// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            hz, hv, hs

class <init> extends <init>
{

    final String CJ;
    final hs CK[];
    final hz CL;

    protected void a(hv hv1)
        throws RemoteException
    {
        hv1.a(new <init>(this), CJ, CK);
    }

    (hz hz1, String s, hs ahs[])
    {
        CL = hz1;
        CJ = s;
        CK = ahs;
        super(null);
    }
}
