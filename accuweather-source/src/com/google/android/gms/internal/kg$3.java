// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            kg, kf

class <init> extends <init>
{

    final Uri abh;
    final kg abj;

    protected void a(Context context, kf kf)
        throws RemoteException
    {
        kg.b(context, kf, new <init>(this), abh, null);
    }

    (kg kg1, Uri uri)
    {
        abj = kg1;
        abh = uri;
        super(null);
    }
}
