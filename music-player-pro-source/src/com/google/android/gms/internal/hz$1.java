// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            hz, hu, hr

class gleApiClient extends gleApiClient
{

    final String DB;
    final hr DC[];
    final hz DD;

    protected void a(hu hu1)
        throws RemoteException
    {
        hu1.a(new <init>(this), DB, DC);
    }

    gleApiClient(hz hz1, GoogleApiClient googleapiclient, String s, hr ahr[])
    {
        DD = hz1;
        DB = s;
        DC = ahr;
        super(googleapiclient);
    }
}
