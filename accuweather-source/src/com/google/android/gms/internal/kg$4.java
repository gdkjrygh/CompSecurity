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
//            kg, ke

static final class <init> extends <init>
{

    final Uri abh;
    final ke abk;
    final Context qr;

    public void a(int i, Bundle bundle, int j, Intent intent)
        throws RemoteException
    {
        kg.b(qr, abh);
        abk.a(i, bundle, j, intent);
    }

    (Context context, Uri uri, ke ke1)
    {
        qr = context;
        abh = uri;
        abk = ke1;
        super();
    }
}
