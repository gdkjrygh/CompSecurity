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
//            kf, kd

static final class <init> extends <init>
{

    final Uri abk;
    final kd abn;
    final Context qu;

    public void a(int i, Bundle bundle, int j, Intent intent)
        throws RemoteException
    {
        kf.b(qu, abk);
        abn.a(i, bundle, j, intent);
    }

    (Context context, Uri uri, kd kd1)
    {
        qu = context;
        abk = uri;
        abn = kd1;
        super();
    }
}
