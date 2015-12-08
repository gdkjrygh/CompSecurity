// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//            ResultCallback, c, Status, f, 
//            GoogleApiClient, Result

class GB
    implements ResultCallback
{

    final GoogleApiClient GB;
    final c Kn;
    final f Kq;
    final boolean Kr;

    public void j(Status status)
    {
        if (status.isSuccess() && Kn.isConnected())
        {
            Kn.reconnect();
        }
        Kq.b(status);
        if (Kr)
        {
            GB.disconnect();
        }
    }

    public void onResult(Result result)
    {
        j((Status)result);
    }

    leApiClient(c c1, f f1, boolean flag, GoogleApiClient googleapiclient)
    {
        Kn = c1;
        Kq = f1;
        Kr = flag;
        GB = googleapiclient;
        super();
    }
}
