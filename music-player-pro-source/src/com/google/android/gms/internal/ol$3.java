// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ol, oj

static final class <init> extends <init>
{

    final Uri amO;
    final oj amQ;
    final Context nf;

    public void a(int i, Bundle bundle, int j, Intent intent)
        throws RemoteException
    {
        ol.b(nf, amO);
        amQ.a(i, bundle, j, intent);
    }

    (Context context, Uri uri, oj oj1)
    {
        nf = context;
        amO = uri;
        amQ = oj1;
        super();
    }
}
