// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            ns

class <init> extends <init>
{

    final int YN;
    final ns alO;
    final String alP;
    final Uri alQ;
    final String alR;
    final String alS;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        e1.a(this, YN, alP, alQ, alR, alS);
    }

    e(ns ns1, int i, String s, Uri uri, String s1, String s2)
    {
        alO = ns1;
        YN = i;
        alP = s;
        alQ = uri;
        alR = s1;
        alS = s2;
        super(null);
    }
}
