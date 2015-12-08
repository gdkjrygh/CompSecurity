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
//            nc, na

static final class <init> extends <init>
{

    final na akB;
    final Uri aky;
    final Context mV;

    public void a(int i, Bundle bundle, int j, Intent intent)
        throws RemoteException
    {
        nc.b(mV, aky);
        akB.a(i, bundle, j, intent);
    }

    (Context context, Uri uri, na na1)
    {
        mV = context;
        aky = uri;
        akB = na1;
        super();
    }
}
