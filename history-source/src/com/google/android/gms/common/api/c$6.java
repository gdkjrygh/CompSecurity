// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api:
//            c, Status, f

class Kq
    implements leApiClient.OnConnectionFailedListener
{

    final c Kn;
    final f Kq;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Kq.b(new Status(8));
    }

    onResult(c c1, f f1)
    {
        Kn = c1;
        Kq = f1;
        super();
    }
}
