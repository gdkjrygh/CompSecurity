// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.plus.internal.e;

// Referenced classes of package com.google.android.gms.internal:
//            km

class <init> extends <init>
{

    final int PJ;
    final km acb;
    final String acc;
    final Uri acd;
    final String ace;
    final String acf;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((e));
    }

    protected void a(e e1)
    {
        e1.a(this, PJ, acc, acd, ace, acf);
    }

    e(km km1, int i, String s, Uri uri, String s1, String s2)
    {
        acb = km1;
        PJ = i;
        acc = s;
        acd = uri;
        ace = s1;
        acf = s2;
        super(null);
    }
}
