// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            nc, nb

class <init> extends <init>
{

    final nc akA;
    final Uri aky;

    protected void a(Context context, nb nb1)
        throws RemoteException
    {
        nb1.a(new <init>(this), aky, null, false);
    }

    (nc nc1, Uri uri)
    {
        akA = nc1;
        aky = uri;
        super(null);
    }
}
