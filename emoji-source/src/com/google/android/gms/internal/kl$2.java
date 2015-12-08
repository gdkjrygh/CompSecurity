// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            kl

class <init> extends <init>
{

    final int PM;
    final kl ace;
    final String acf;
    final Uri acg;
    final String ach;
    final String aci;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        e1.a(this, PM, acf, acg, ach, aci);
    }

    e(kl kl1, int i, String s, Uri uri, String s1, String s2)
    {
        ace = kl1;
        PM = i;
        acf = s;
        acg = uri;
        ach = s1;
        aci = s2;
        super(null);
    }
}
